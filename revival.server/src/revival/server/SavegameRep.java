package revival.server;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.tree.DefaultElement;
import org.jaxen.JaxenException;
import org.jaxen.SimpleNamespaceContext;
import org.jaxen.XPath;
import org.jaxen.dom4j.Dom4jXPath;

import revival.rules.Savegame;
import revival.rules.player.Chara;
import revival.rules.player.Item;
import revival.rules.player.ItemFactory;
import revival.rules.player.Nationality;
import revival.rules.player.Party;
import revival.rules.player.Skill;
import revival.rules.player.SkillFactory;
import revival.rules.player.Weapon;

public class SavegameRep {

	private static final Log log = LogFactory.getLog(SavegameRep.class);
	
	private Savegame savegame;

	public Savegame getSavegame() {
		return savegame;
	}
	
	public void loadFromXml() {
		savegame = new Savegame();
		
		//fill ItemFactory before
		ItemFactory.init(ItemRepository.getInstance().getItems());
		
		Properties props = new Properties();
		File file = null;
		try {
			props.load(this.getClass().getResourceAsStream("/revival/configuration.properties"));
			String savegamepath = (String) props.get("savegamepath");

			file = new File(savegamepath + "savegame.xml");
		} catch (FileNotFoundException e1) {
			log.error(e1, e1);
		} catch (IOException e1) {
			log.error(e1, e1);
		}

		if (file == null) {
			throw new RuntimeException("Unable to load mapfile!!!");
		}

//		log.debug("loadFromXml: " + file.getAbsolutePath());

		Map<String, String> map = new HashMap<String, String>();
		map.put("wl", "http://ailis.de/wlandsuite");

		try {
			Document doc = XmlUtil.parse(file);
			
			XPath xpath = new Dom4jXPath("//wl:parties");
			xpath.setNamespaceContext(new SimpleNamespaceContext(map));
			List nodes = xpath.selectNodes(doc);
			for (Object o : nodes) {
				DefaultElement e = (DefaultElement)o;
				int curParty = XmlUtil.getIntAttribute(e, "currentParty");
				savegame.setCurParty(curParty);
			}
			
			xpath = new Dom4jXPath("//wl:party");
			xpath.setNamespaceContext(new SimpleNamespaceContext(map));
			nodes = xpath.selectNodes(doc);
			for (Object o : nodes) {
				DefaultElement element = (DefaultElement)o;
				parseParty(element);
			}
			
			xpath = new Dom4jXPath("//wl:character");
			xpath.setNamespaceContext(new SimpleNamespaceContext(map));
			nodes = xpath.selectNodes( doc);
			for (Object o : nodes) {
				DefaultElement element = (DefaultElement)o;
				parseCharacter(element);
			}
			
			
			
		} catch ( JaxenException e) {
			  e.printStackTrace();
		} catch ( DocumentException e) {
			  e.printStackTrace();
		}
	}
	
	private void parseParty(DefaultElement element) {
		Party result = new Party();
		
		result.setMapNr(XmlUtil.getIntAttribute(element, "map"));
		result.setPosCol(XmlUtil.getIntAttribute(element, "x"));
		result.setPosRow(XmlUtil.getIntAttribute(element, "y"));
		result.setPrevMapNr(XmlUtil.getIntAttribute(element, "prevMap"));
		result.setPrevPosCol(XmlUtil.getIntAttribute(element, "prevX"));
		result.setPrevPosRow(XmlUtil.getIntAttribute(element, "prevY"));
		
		savegame.addParty(result);
	}
	
	private void parseCharacter(Element element) {
		Chara result = new Chara(true);
		
		String name = element.attributeValue("name");
		
		if (name.length() == 0) return;
		
		result.setName(name);
		
		result.setStrength(XmlUtil.getIntAttribute(element, "strength"));
		result.setIq(XmlUtil.getIntAttribute(element, "iq"));
		result.setLuck(XmlUtil.getIntAttribute(element, "luck"));
		result.setSpeed(XmlUtil.getIntAttribute(element, "speed"));
		result.setAgility(XmlUtil.getIntAttribute(element, "agility"));
		result.setDexterity(XmlUtil.getIntAttribute(element, "dexterity"));
		result.setCharisma(XmlUtil.getIntAttribute(element, "charisma"));
		
		result.setSkillPoints(XmlUtil.getIntAttribute(element, "skillPoints"));
		
		result.setMoney(XmlUtil.getIntAttribute(element, "money"));
		result.setFemale(element.attributeValue("gender").equals("female"));
		result.setNationality(Nationality.getNationality(element.attributeValue("nationality")));

		result.setMaxCon(XmlUtil.getIntAttribute(element, "maxCon"));
		result.setCurCon(XmlUtil.getIntAttribute(element, "con"));
		
		result.setRank(element.attributeValue("rank"));
		
		List<Skill> skills = parseSkills(element.element("skills"));
		result.setSkills(skills);
		
		List<Item> items = parseItems(element.element("items"));
		result.setInventory(items);
		
		Integer weaponIdx = XmlUtil.getIntAttribute(element, "weapon") -1;
		if (weaponIdx != null) {
			result.equipItem(weaponIdx);
		}
		
		
		log.debug("character has " + items.size() + " inventory items");
		
		savegame.addMember(0, result);
	}
	
	private List<Skill> parseSkills(Element element) {
		List<Skill> skills = new ArrayList<Skill>();
		
		for (Object o : element.elements()) {
			Element e = (Element)o;
			int id = XmlUtil.intValue(e.attributeValue("id"));
			int level = XmlUtil.intValue(e.attributeValue("level"));
			
			skills.add(SkillFactory.create(id, level));
		}
		
		return skills;
	}
	
	private List<Item> parseItems(Element element) {
		List<Item> items = new ArrayList<Item>();
		
		for (Object o : element.elements()) {
			Element e = (Element)o;
			int id = XmlUtil.intValue(e.attributeValue("id"));
			Integer load = XmlUtil.intValue(e.attributeValue("load"));
			
			Item item = ItemFactory.createItem(id);
			if (item instanceof Weapon && load != null) {
				Weapon w = (Weapon)item;
				w.setCurLoad(load);
			}
			items.add(item);
		}
		
		return items;
	}
}
