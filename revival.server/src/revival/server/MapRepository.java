package revival.server;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;

import revival.engine.tilebased.client.world.Location;
import revival.engine.tilebased.client.world.TileData;
import revival.engine.tilebased.client.world.actiondata.Alter;
import revival.engine.tilebased.client.world.actiondata.AlterationData;
import revival.engine.tilebased.client.world.actiondata.AttributeCheck;
import revival.engine.tilebased.client.world.actiondata.CheckData;
import revival.engine.tilebased.client.world.actiondata.Checkable;
import revival.engine.tilebased.client.world.actiondata.DialogueAnswer;
import revival.engine.tilebased.client.world.actiondata.DialogueData;
import revival.engine.tilebased.client.world.actiondata.EncounterData;
import revival.engine.tilebased.client.world.actiondata.ImpassableData;
import revival.engine.tilebased.client.world.actiondata.ItemCheck;
import revival.engine.tilebased.client.world.actiondata.LootData;
import revival.engine.tilebased.client.world.actiondata.MaskData;
import revival.engine.tilebased.client.world.actiondata.MembersCheck;
import revival.engine.tilebased.client.world.actiondata.PrintData;
import revival.engine.tilebased.client.world.actiondata.RadiationData;
import revival.engine.tilebased.client.world.actiondata.SkillCheck;
import revival.engine.tilebased.client.world.actiondata.SpecialData;
import revival.engine.tilebased.client.world.actiondata.TransitionData;
import revival.engine.tilebased.client.world.actiondata.special.InfirmaryData;
import revival.engine.tilebased.client.world.actiondata.special.LibraryData;
import revival.engine.tilebased.client.world.actiondata.special.StoreData;


public class MapRepository {

	private static final Log log = LogFactory.getLog(MapRepository.class);
	
	public Location loadFromXml(String name) {
		
		Properties props = new Properties() ;
		File file = null;
		try {
			props.load(this.getClass().getResourceAsStream("/revival/configuration.properties"));
			String mappath = (String)props.get("mappath");
			
			file = new File(mappath + name);
		} catch (FileNotFoundException e1) {
			log.error(e1, e1);
		} catch (IOException e1) {
			log.error(e1, e1);
		}
		
		if (file == null) throw new RuntimeException("Unable to load mapfile!!!");
		
//		log.debug("loadFromXml: " + file.getAbsolutePath());
		try {
			Document doc = XmlUtil.parse(file);
			
			Element root = doc.getRootElement();
			
			int mapSize = Integer.parseInt(root.attributeValue("mapSize"));
//			System.out.println("mapSize=" + mapSize);
			
			Location result = new Location();
			
			TileData data = new TileData(mapSize, mapSize);
			
			String[] tileMapString = null;
			Integer[] actionClassMapString = null;
			String[] actionMapString = null;
			
			for (Iterator i = root.elementIterator();i.hasNext();) {
				Element e = (Element)i.next();

				if (e.getName().equals("actionClassMap")) {
					char[] temp = e.getText().replace("\n", "").replace(" ", "").toCharArray();
					actionClassMapString = new Integer[temp.length];
					for (int idx=0;idx < temp.length; idx++) {
						if (temp[idx] == '.') continue;
						actionClassMapString[idx] = Integer.valueOf(String.valueOf(temp[idx]), 16);
					}
					
//					System.out.println("actionClassMapString length=" + actionClassMapString.length);
					
				} else if (e.getName().equals("actionMap")) {
					actionMapString = e.getText().replace("\n", "").split(" ");
//					System.out.println("actionMapString length=" + actionMapString.length);
					
				} else if (e.getName().equals("tileMap")) {
					tileMapString = e.getText().replace("\n", "").split(" ");
					
				} else if (e.getName().equals("info")) {
					data.setTilesetNr(XmlUtil.intValue(e.attributeValue("tileset")));
					
					String value = e.attributeValue("backgroundTile");
					data.setBackgroundTile(XmlUtil.intValue(value));
					
					value = e.attributeValue("timeFactor");
					data.setTimeFactor(XmlUtil.intValue(value));
					
					value = e.attributeValue("encounterFrequency");
					data.setEncounterFrequency(XmlUtil.intValue(value));
					
					value = e.attributeValue("lastMonster");
					data.setLastMonster(XmlUtil.intValue(value));
					
					value = e.attributeValue("maxEncounters");
					data.setMaxEncounters(XmlUtil.intValue(value));
					
				} else if (e.getName().equals("strings")) {
					List<Object> elements = e.elements();
					int nrStrings = elements.size();
					String[] strings = new String[nrStrings];
					for (int idx=0;idx<nrStrings;idx++) {
						strings[idx] = ((Element)elements.get(idx)).getText().replace("\\r", "\n");
//						System.out.println("string " + idx + " = " + strings[idx]);
					}
					result.setStrings(strings);
//					System.out.println(strings.length + " strings loaded");
					
				} else if (e.getName().equals("actions")) {
					int actionClass = Integer.parseInt(e.attributeValue("actionClass").replace("0x", ""), 16);
					//create "empty" actions (ie no strings)
					switch (actionClass) {
					case 1: //print action
						result.setPrintData(createPrintData(e));
						break;
					case 2: //check and print action
						result.setCheckData(createCheckData(e));
						break;
					case 3: //fixed encounter
						result.setFixedEncounterData(createEncounterData(e));
						break;
					case 4: //mask data
						result.setMaskData(createMaskData(e));
						break;
					case 5: //loot
						result.setLootData(createLootData(e));
						break;
					case 6: //special buildings action and more
						result.setSpecialData(createSpecialData(e));
						break;
					case 7: //unused
						break;
					case 8: //dialogue
						result.setDialogueData(createDialogueData(e));
						break;
					case 9: //radiation
						result.setRadiationData(createRadiationData(e));
						break;
					case 10: //transition action
						result.setTransitionData(createTransitionData(e));
						break;
					case 11: //impassable action
						result.setImpassableData(createImpassableData(e));
						break;
					case 12: //alteration
						result.setAlterationData(createAlterationData(e));
						break;
					case 13: //unused
					case 14: //unused
						break;
					case 15: //pointer to random encounter data
						result.setRandomEncounterData(createEncounterData(e));
						break;
					}
					
				}
			}

			int[][] map = data.getTiles();
			int curRow = 0;
			int curCol = 0;

			for (String token : tileMapString) {
				if (token.equals("")) continue;

				int value;
				if (token.equals("..")) {
					value = data.getBackgroundTile();
				} else {
					value = Integer.parseInt(token, 16);
				}
				
//				System.out.println("row=" + curRow + ", col=" + curCol + ", value=" + value + "(" + token + ")");
				
				map[curRow][curCol++] = value;
				if (curCol >= mapSize) {
					curCol = 0;
					curRow++;
				}
			}
			data.setTiles(map); //TODO: check if necessary
			result.setTileData(data);
			
			curRow = 0;
			curCol = 0;
			
			int backgroundTile;
			try {
				backgroundTile = data.getBackgroundTile();
			} catch (NullPointerException e) {
				backgroundTile = -1;
			}
			int[] actionMap = new int[mapSize*mapSize];
			for (String token : actionMapString) {
				if (token.equals("")) continue;

				int value;
				if (token.equals("..")) {
					value = backgroundTile;
				} else {
					value = Integer.parseInt(token, 16);
				}
				
//				System.out.println("row=" + curRow + ", col=" + curCol + ", value=" + value + "(" + token + ")");
				
				actionMap[curRow*mapSize + curCol++] = value;
				if (curCol >= mapSize) {
					curCol = 0;
					curRow++;
				}
			}
			
			result.setActionData(actionClassMapString, actionMap);
			
			System.out.println("yippie!!!");
			
			return result;
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	private Map<Integer, PrintData> createPrintData(Element e) {
		Map<Integer, PrintData> messages = new HashMap<Integer, PrintData>();
		
		int nrMessages = e.elements().size();
		for (int idx=0;idx < nrMessages; idx++) {
			Element e2 = (Element)e.elements().get(idx);
			
			PrintData data = new PrintData();
			data.setId(Integer.parseInt(e2.attributeValue("id").replace("0x", ""), 16));
			data.setNewActionClass(XmlUtil.hexValue(e2.attributeValue("newActionClass")));
			data.setNewAction(XmlUtil.hexValue(e2.attributeValue("newAction")));
			
			for (Iterator it = e2.elements("message").iterator(); it.hasNext();) {
				Element e3 = (Element)it.next();
				
				data.addMessageNr(Integer.parseInt(e3.getText()));
			}
			
			messages.put(data.getId(), data);
		}
		
		return messages;
	}
	
	private Map<Integer, CheckData> createCheckData(Element e) {
		Map<Integer, CheckData> result = new HashMap<Integer, CheckData>();
		
		int nrActions = e.elements().size();
		for (int idx=0;idx < nrActions; idx++) {
			Element e2 = (Element)e.elements().get(idx);
			
			CheckData data = new CheckData();
			data.setId(XmlUtil.hexValue(e2.attributeValue("id")));
			data.setPassable(XmlUtil.boolValue(e2.attributeValue("passable")));
			data.setAutoCheck(XmlUtil.boolValue(e2.attributeValue("autoCheck")));
			data.setParty(XmlUtil.boolValue(e2.attributeValue("party")));
			data.setPassAll(XmlUtil.boolValue(e2.attributeValue("passAll")));
			data.setStartMessage(XmlUtil.intValue(e2.attributeValue("startMessage")));
			data.setPassMessage(XmlUtil.intValue(e2.attributeValue("passMessage")));
			data.setFailMessage(XmlUtil.intValue(e2.attributeValue("failMessage")));
			data.setPassNewActionClass(XmlUtil.hexValue(e2.attributeValue("passNewActionClass")));
			data.setPassNewAction(XmlUtil.hexValue(e2.attributeValue("passNewAction")));
			data.setModifierTarget(XmlUtil.hexValue(e2.attributeValue("modifierTarget")));
			data.setModifier(XmlUtil.intValue(e2.attributeValue("modifier")));
			data.setFailNewActionClass(XmlUtil.hexValue(e2.attributeValue("failNewActionClass")));
			data.setFailNewAction(XmlUtil.hexValue(e2.attributeValue("failNewAction")));
			
			List<Checkable> checks = new ArrayList<Checkable>();
			for (Iterator it = e2.elements().iterator(); it.hasNext();) {
				Element e3 = (Element)it.next();
				
				if (e3.getName().equalsIgnoreCase("attribute")) {
					Integer attId = XmlUtil.intValue(e3.attributeValue("value"));
					Integer difficulty = XmlUtil.intValue(e3.attributeValue("difficulty"));
					
					AttributeCheck ac = new AttributeCheck(attId, difficulty);
					ac.setNewActionClass(XmlUtil.hexValue(e3.attributeValue("newActionClass")));
					ac.setNewAction(XmlUtil.hexValue(e3.attributeValue("newAction")));
					
					checks.add(ac);
				} else if (e3.getName().equalsIgnoreCase("skill")) {
					Integer skillId = XmlUtil.intValue(e3.attributeValue("value"));
					Integer difficulty = XmlUtil.intValue(e3.attributeValue("difficulty"));
					
					SkillCheck sk = new SkillCheck(skillId, difficulty);
					sk.setNewActionClass(XmlUtil.hexValue(e3.attributeValue("newActionClass")));
					sk.setNewAction(XmlUtil.hexValue(e3.attributeValue("newAction")));
					
					checks.add(sk);
				} else if (e3.getName().equalsIgnoreCase("item")) {
					ItemCheck ic = new ItemCheck(XmlUtil.intValue(e3.attributeValue("value")));
					ic.setNewActionClass(XmlUtil.hexValue(e3.attributeValue("newActionClass")));
					ic.setNewAction(XmlUtil.hexValue(e3.attributeValue("newAction")));

					checks.add(ic);
				} else if (e3.getName().equalsIgnoreCase("members")) {
					checks.add(new MembersCheck(XmlUtil.intValue(e3.attributeValue("value"))));
				} else {
					log.warn("Unknown check: " + e3.getName());
				}
			}
			data.setChecks(checks);
			
			result.put(data.getId(), data);
		}
		
		return result;
	}
	
	private Map<Integer, EncounterData> createEncounterData(Element e) {
		Map<Integer, EncounterData> result = new HashMap<Integer, EncounterData>();
		
		int nrData = e.elements().size();
		for (int idx=0;idx < nrData; idx++) {
			Element e2 = (Element)e.elements().get(idx);
			
			EncounterData data = new EncounterData();
			data.setId(XmlUtil.hexValue(e2.attributeValue("id")));
			data.setVisibleDistance(XmlUtil.intValue(e2.attributeValue("visibleDistance")));
			data.setHitDistance(XmlUtil.intValue(e2.attributeValue("hitDistance")));
			data.setMessage(XmlUtil.intValue(e2.attributeValue("message")));
			data.setProperName(XmlUtil.boolValue(e2.attributeValue("properName")));
			data.setNewActionClass(XmlUtil.hexValue(e2.attributeValue("newActionClass")));
			data.setNewAction(XmlUtil.hexValue(e2.attributeValue("newAction")));
			
			result.put(data.getId(), data);
		}
		
		return result;
	}
	
	private Map<Integer, MaskData> createMaskData(Element e) {
		Map<Integer, MaskData> result = new HashMap<Integer, MaskData>();
		
		int nrMasks = e.elements().size();
		for (int idx=0;idx < nrMasks; idx++) {
			Element e2 = (Element)e.elements().get(idx);
			
			MaskData data = new MaskData();
			data.setId(XmlUtil.hexValue(e2.attributeValue("id")));
			data.setTile(XmlUtil.intValue(e2.attributeValue("tile")));
			data.setImpassable(XmlUtil.boolValue(e2.attributeValue("impassable")));
			data.setMessage(XmlUtil.intValue(e2.attributeValue("message")));
			result.put(data.getId(), data);
		}
		
		return result;
	}
	
	private Map<Integer, LootData> createLootData(Element e) {
		Map<Integer, LootData> result = new HashMap<Integer, LootData>();
		
		int nrMasks = e.elements().size();
		for (int idx=0;idx < nrMasks; idx++) {
			Element e2 = (Element)e.elements().get(idx);
			
			LootData data = new LootData();
			data.setId(XmlUtil.hexValue(e2.attributeValue("id")));
			data.setNewActionClass(XmlUtil.hexValue(e2.attributeValue("newActionClass")));
			data.setNewAction(XmlUtil.hexValue(e2.attributeValue("newAction")));
			
			Map<Integer, Integer> items = new HashMap<Integer, Integer>();
			for (Iterator it = e2.elements("item").iterator(); it.hasNext();) {
				Element e3 = (Element)it.next();
				Integer itemId = XmlUtil.intValue(e3.attributeValue("value"));
				String q = e3.attributeValue("quantity");
				Integer quantity;
				if (q == null) {
					quantity = 1;
				} else {
					quantity = XmlUtil.intValue(e3.attributeValue("quantity"));
				}
				items.put(itemId, quantity);
			}
			data.setItems(items);
			
			Element money = e2.element("randomMoney");
			if (money != null) {
				data.setRandomMoney(XmlUtil.intValue(money.attributeValue("quantity")));
			}
			
			result.put(data.getId(), data);
		}
		
		return result;
	}
	
	private Map<Integer, SpecialData> createSpecialData(Element e) {
		int nrActions = e.elements().size();
		Map<Integer, SpecialData> result = new HashMap<Integer, SpecialData>(nrActions);
		
		for (int idx=0; idx < nrActions; idx++) {
			Element e2 = (Element)e.elements().get(idx);
			
			String name = e2.getName();
			
			if (name.equals("rangerCenter")) {
				SpecialData data = new SpecialData("rangerCenter");
				
				data.setId(Integer.parseInt(e2.attributeValue("id").replace("0x", ""), 16));
				data.setName(e2.attributeValue("name"));
				data.setNewActionClass(Integer.parseInt(e2.attributeValue("newActionClass").replace("0x", ""), 16));
				data.setNewAction(Integer.parseInt(e2.attributeValue("newAction").replace("0x", ""), 16));
				
				result.put(data.getId(), data);
			} else if (name.equals("doctor")) {
				InfirmaryData data = new InfirmaryData();
				
				data.setId(Integer.parseInt(e2.attributeValue("id").replace("0x", ""), 16));
				data.setName(e2.attributeValue("name"));
				data.setMessageNr(XmlUtil.intValue(e2.attributeValue("message")));
				data.setHealPrice(XmlUtil.intValue("healPrice"));
				data.setExaminePrice(XmlUtil.intValue(e2.attributeValue("examinePrice")));
				data.setCurePrice(XmlUtil.intValue(e2.attributeValue("curePrice")));
				
				result.put(data.getId(), data);
			} else if (name.equals("store")) {
				StoreData data = new StoreData();

				data.setId(Integer.parseInt(e2.attributeValue("id").replace("0x", ""), 16));
				data.setName(e2.attributeValue("name"));
				data.setMessageNr(XmlUtil.intValue(e2.attributeValue("message")));
				data.setSellFactor(XmlUtil.intValue(e2.attributeValue("sellFactor")));
				data.setItemList(XmlUtil.intValue(e2.attributeValue("itemList")));
				
				for(Iterator it = e2.elements("itemType").iterator();it.hasNext();) {
					Element e3 = (Element)it.next();
					
					data.addItemType(Integer.parseInt(e3.getText()));
				}
				
				result.put(data.getId(), data);
			} else if (name.equals("library")) {
				LibraryData data = new LibraryData();
				
				data.setId(Integer.parseInt(e2.attributeValue("id").replace("0x", ""), 16));
				data.setName(e2.attributeValue("name"));
				data.setMessageNr(XmlUtil.intValue(e2.attributeValue("message")));
				data.setNewActionClass(Integer.parseInt(e2.attributeValue("newActionClass").replace("0x", ""), 16));
				data.setNewAction(Integer.parseInt(e2.attributeValue("newAction").replace("0x", ""), 16));
				
				result.put(data.getId(), data);
			}
			
		}
		
		return result;
	}
	
	private Map<Integer, DialogueData> createDialogueData(Element e) {
		Map<Integer, DialogueData> result = new HashMap<Integer, DialogueData>();
		
		int nrData = e.elements().size();
		for (int idx=0; idx < nrData; idx++) {
			Element e2 = (Element)e.elements().get(idx);
			DialogueData data = new DialogueData();
			
			data.setId(XmlUtil.hexValue(e2.attributeValue("id")));
			data.setMenu(XmlUtil.boolValue(e2.attributeValue("menu")));
			data.setMessage(XmlUtil.intValue(e2.attributeValue("message")));
			
			data.setCancelNewActionClass(XmlUtil.hexValue(e2.attributeValue("cancelNewActionClass")));
			data.setCancelNewAction(XmlUtil.hexValue(e2.attributeValue("cancelNewAction")));

			data.setOtherNewActionClass(XmlUtil.hexValue(e2.attributeValue("otherNewActionClass")));
			data.setOtherNewAction(XmlUtil.hexValue(e2.attributeValue("otherNewAction")));
			
			DialogueAnswer a;
			List<DialogueAnswer> answers = new ArrayList<DialogueAnswer>();
			for (Iterator it = e2.elements("answer").iterator(); it.hasNext();) {
				Element e3 = (Element)it.next();
				
				a = new DialogueAnswer();
				a.setMessage(XmlUtil.intValue(e3.attributeValue("message")));
				a.setNewActionClass(XmlUtil.hexValue(e3.attributeValue("newActionClass")));
				a.setNewAction(XmlUtil.hexValue(e3.attributeValue("newAction")));
				
				answers.add(a);
			}
			data.setAnswers(answers);
			
			result.put(data.getId(), data);
		}
		
		return result;
	}
	
	private Map<Integer, RadiationData> createRadiationData(Element e) {
		Map<Integer, RadiationData> result = new HashMap<Integer, RadiationData>();
		
		int nrData = e.elements().size();
		for (int idx=0; idx < nrData; idx++) {
			Element e2 = (Element)e.elements().get(idx);
			RadiationData data = new RadiationData();
			
			data.setId(XmlUtil.hexValue(e2.attributeValue("id")));
			data.setIgnoreArmor(XmlUtil.boolValue(e2.attributeValue("ignoreArmor")));
			data.setMessage(XmlUtil.intValue(e2.attributeValue("message")));
			data.setDamage(XmlUtil.intValue(e2.attributeValue("damage")));
			
			result.put(data.getId(), data);
		}
		
		return result;
	}
	
	private Map<Integer, TransitionData> createTransitionData(Element e) {
		Map<Integer, TransitionData> result = new HashMap<Integer, TransitionData>();
		
		int nrTrans = e.elements().size();
		for (int idx=0; idx < nrTrans; idx++) {
			Element e2 = (Element)e.elements().get(idx);
			TransitionData a = new TransitionData();
			
			a.setId(Integer.parseInt(e2.attributeValue("id").replace("0x", ""), 16));
			
			String value = e2.attributeValue("confirm");
			a.setConfirm(value != null && value.equalsIgnoreCase("true"));

			value = e2.attributeValue("message");
			if (value != null) a.setMessageNr(Integer.parseInt(value));
			
			value = e2.attributeValue("targetX");
			if (value != null) a.setTargetX(Integer.parseInt(value));
			
			value = e2.attributeValue("targetY");
			if (value != null) a.setTargetY(Integer.parseInt(value));
			
			value = e2.attributeValue("targetMap");
			if (value != null) a.setTargetMap(Integer.parseInt(value));
			
			value = e2.attributeValue("relative");
			a.setRelative(value!= null && value.equalsIgnoreCase("true"));
			
			value = e2.attributeValue("newActionClass");
			if (value != null) a.setNewActionClass(Integer.parseInt(value.replace("0x", ""), 16));
			
			value = e2.attributeValue("newAction");
			if (value != null) a.setNewAction(Integer.parseInt(value.replace("0x", ""), 16));
			
			result.put(a.getId(), a);
		}
		
		return result;
	}
	
	private Map<Integer, ImpassableData> createImpassableData(Element e) {
		Map<Integer, ImpassableData> result = new HashMap<Integer, ImpassableData>();
		
		int nrMessages = e.elements().size();
		for (int idx=0;idx < nrMessages; idx++) {
			Element e2 = (Element)e.elements().get(idx); // <impassable>
			
			ImpassableData data = new ImpassableData();
			data.setId(Integer.parseInt(e2.attributeValue("id").replace("0x", ""), 16));
			
			String value = e2.attributeValue("message");
			try {
				int msgString = Integer.parseInt(value);
				data.setMessageNr(msgString);
			} catch (NumberFormatException nfe) {
				
			}
			
			result.put(data.getId(), data);
		}
		
		return result;
	}
	
	private Map<Integer, AlterationData> createAlterationData(Element e) {
		Map<Integer, AlterationData> result = new HashMap<Integer, AlterationData>();
		
		int nrData = e.elements().size();
		for (int idx=0;idx < nrData; idx++) {
			Element e2 = (Element)e.elements().get(idx);
			AlterationData data = new AlterationData();
			
			data.setId(XmlUtil.hexValue(e2.attributeValue("id")));
			data.setNewActionClass(XmlUtil.hexValue(e2.attributeValue("newActionClass")));
			data.setNewAction(XmlUtil.hexValue(e2.attributeValue("newAction")));
			
			List<Alter> alters = new ArrayList<Alter>();
			for (Iterator it = e2.elements("alter").iterator(); it.hasNext();) {
				Element e3 = (Element)it.next();
				Alter alter = new Alter();
				
				alter.setUnknown(XmlUtil.hexValue(e3.attributeValue("unknown")));
				alter.setRelative(XmlUtil.boolValue(e3.attributeValue("relative")));
				alter.setX(XmlUtil.intValue(e3.attributeValue("x")));
				alter.setY(XmlUtil.intValue(e3.attributeValue("y")));
				alter.setNewActionClass(XmlUtil.hexValue(e3.attributeValue("newActionClass")));
				alter.setNewAction(XmlUtil.hexValue(e3.attributeValue("newAction")));
				
				alters.add(alter);
			}
			data.setAlterations(alters);
			
			result.put(data.getId(), data);
		}
		
		return result;
	}
	
	public Location loadHardcoded() {
		TileData result = new TileData(32, 32);
		
		int[][] map = new int[][] {
			{0x2f, 0x3a, 0x72, 0x3a, 0x3a, 0x72, 0x3a, 0x3a, 0x3a, 0x72, 0x3a, 0x3a, 0x72, 0x72, 0x72, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x84, 0x8a, 0x8a, 0x84, 0x84, 0x8a, 0x84},
			{0x2f, 0x72, 0x3a, 0x3a, 0x72, 0x3a, 0x72, 0x72, 0x3a, 0x72, 0x3a, 0x3a, 0x3a, 0x72, 0x3a, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x84, 0x91, 0x35, 0x89, 0x84, 0x89, 0x86},
			{0x64, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x72, 0x3a, 0x25, 0x3a, 0x72, 0x72, 0x3a, 0x25, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x81, 0x89, 0x35, 0x8c, 0x84, 0x89, 0x86},
			{0x64, 0x3a, 0x3a, 0x72, 0x3a, 0x3a, 0x72, 0x72, 0x72, 0x46, 0x3a, 0x3a, 0x72, 0x72, 0x46, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x81, 0x89, 0x84, 0x89, 0x89, 0x35, 0x84},
			{0x64, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x81, 0x89, 0x84, 0x89, 0x8c, 0x89, 0x86},
			{0x2f, 0x42, 0x3a, 0x25, 0x3a, 0x3a, 0x72, 0x3a, 0x3a, 0x72, 0x3a, 0x3a, 0x3a, 0x72, 0x3a, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x81, 0x89, 0x35, 0x89, 0x84, 0x35, 0x84},
			{0x2f, 0x73, 0x3a, 0x46, 0x72, 0x3a, 0x3a, 0x3a, 0x72, 0x3a, 0x42, 0x3a, 0x72, 0x72, 0x3a, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x81, 0x89, 0x89, 0x86, 0x84, 0x91, 0x84},
			{0x64, 0x3a, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x25, 0x72, 0x42, 0x73, 0x3a, 0x72, 0x72, 0x3a, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x84, 0x81, 0x89, 0x89, 0x35, 0x86, 0x84},
			{0x2f, 0x72, 0x42, 0x3a, 0x72, 0x3a, 0x3a, 0x46, 0x3a, 0x73, 0x3a, 0x3a, 0x3a, 0x3a, 0x3a, 0x65, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x81, 0x89, 0x84, 0x84, 0x89, 0x89, 0x86},
			{0x2f, 0x25, 0x73, 0x3a, 0x72, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x72, 0x3a, 0x25, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x81, 0x89, 0x89, 0x89, 0x89, 0x89, 0x86},
			{0x2f, 0x46, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x25, 0x3a, 0x42, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x84, 0x84, 0x8c, 0x8c, 0x84, 0x8c, 0x84},
			{0x64, 0x4d, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x3a, 0x3a, 0x46, 0x25, 0x73, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72},
			{0x2f, 0x2a, 0x72, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x72, 0x46, 0x3a, 0x65, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72, 0x72},
			{0x64, 0x4c, 0x4d, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x72, 0x3a, 0x72, 0x72, 0x3a, 0x25, 0x65, 0x72, 0x72, 0x72, 0x72, 0x72, 0x3a, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x3a, 0x72, 0x3a},
			{0x64, 0x25, 0x4c, 0x4d, 0x72, 0x3a, 0x3a, 0x72, 0x3a, 0x63, 0x0b, 0x63, 0x0b, 0x63, 0x0b, 0x65, 0x72, 0x72, 0x72, 0x72, 0x72, 0x3a, 0x72, 0x3a, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x3a, 0x72, 0x3a},
			{0x64, 0x25, 0x72, 0x2a, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x76, 0x62, 0x76, 0x62, 0x76, 0x62, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x3a, 0x3a, 0x72, 0x3a, 0x3a, 0x80, 0x82, 0x82, 0x82, 0x82, 0x82, 0x3e},
			{0x64, 0x46, 0x42, 0x2a, 0x72, 0x3a, 0x3a, 0x3a, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x65, 0x72, 0x72, 0x72, 0x72, 0x72, 0x3a, 0x3a, 0x72, 0x72, 0x71, 0x54, 0x35, 0x35, 0x0d, 0x0e, 0x3e},
			{0x2f, 0x3a, 0x25, 0x2a, 0x72, 0x3a, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x3a, 0x78, 0x79, 0x3a, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x3a, 0x3a, 0x72, 0x3a, 0x72, 0x54, 0x54, 0x54, 0x35, 0x54, 0x54, 0x3e},
			{0x64, 0x3a, 0x46, 0x26, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x3a, 0x7a, 0x7b, 0x3a, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x3a, 0x72, 0x72, 0x3a, 0x72, 0x82, 0x82, 0x82, 0x82, 0x82, 0x82, 0x71},
			{0x2f, 0x3a, 0x3a, 0x2a, 0x72, 0x3a, 0x72, 0x3a, 0x3a, 0x72, 0x3a, 0x3a, 0x72, 0x72, 0x72, 0x65, 0x72, 0x72, 0x72, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x72, 0x72, 0x3a, 0x3a, 0x72, 0x72},
			{0x2f, 0x3a, 0x72, 0x4c, 0x4d, 0x3a, 0x3a, 0x72, 0x3a, 0x3a, 0x3a, 0x3a, 0x78, 0x79, 0x3a, 0x65, 0x72, 0x72, 0x72, 0x72, 0x72, 0x3a, 0x3a, 0x72, 0x3a, 0x3a, 0x72, 0x3a, 0x3a, 0x72, 0x3a, 0x72},
			{0x64, 0x25, 0x3a, 0x72, 0x4c, 0x4d, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x7d, 0x7e, 0x72, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x72, 0x3a, 0x72, 0x3a, 0x72},
			{0x64, 0x46, 0x3a, 0x3a, 0x72, 0x2a, 0x3a, 0x3a, 0x72, 0x72, 0x3a, 0x3a, 0x7c, 0x7b, 0x72, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x72, 0x3a, 0x3a, 0x72, 0x3a, 0x3a, 0x72, 0x3a, 0x3a, 0x72, 0x3a, 0x72},
			{0x64, 0x25, 0x72, 0x3a, 0x4e, 0x4f, 0x72, 0x72, 0x72, 0x3a, 0x3a, 0x3a, 0x3a, 0x3a, 0x3a, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x3a, 0x80, 0x82, 0x82, 0x80, 0x80, 0x82, 0x3e},
			{0x2f, 0x46, 0x72, 0x4e, 0x5f, 0x4d, 0x4e, 0x5f, 0x4d, 0x72, 0x63, 0x0b, 0x63, 0x0b, 0x3a, 0x65, 0x72, 0x72, 0x72, 0x72, 0x3a, 0x3a, 0x72, 0x72, 0x3a, 0x3e, 0x54, 0x54, 0x80, 0x71, 0x0a, 0x3e},
			{0x2f, 0x3a, 0x72, 0x4c, 0x5f, 0x5f, 0x5f, 0x5f, 0x5f, 0x3a, 0x76, 0x62, 0x76, 0x62, 0x3a, 0x65, 0x72, 0x72, 0x72, 0x72, 0x3a, 0x72, 0x3a, 0x72, 0x72, 0x3e, 0x54, 0x54, 0x71, 0x54, 0x54, 0x3e},
			{0x64, 0x3a, 0x3a, 0x3a, 0x4c, 0x5f, 0x5f, 0x5f, 0x4f, 0x72, 0x63, 0x0b, 0x63, 0x0b, 0x72, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x72, 0x3a, 0x72, 0x3a, 0x3a, 0x71, 0x54, 0x54, 0x54, 0x54, 0x54, 0x3e},
			{0x64, 0x3a, 0x3a, 0x72, 0x3a, 0x4c, 0x4f, 0x72, 0x3a, 0x3a, 0x75, 0x77, 0x75, 0x77, 0x3a, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x3a, 0x3a, 0x3a, 0x3a, 0x72, 0x54, 0x54, 0x54, 0x54, 0x54, 0x54, 0x3e},
			{0x2f, 0x72, 0x3a, 0x3a, 0x3a, 0x72, 0x72, 0x3a, 0x3a, 0x3a, 0x76, 0x62, 0x76, 0x62, 0x3a, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x72, 0x3a, 0x3a, 0x3a, 0x3a, 0x80, 0x82, 0x82, 0x82, 0x20, 0x82, 0x3e},
			{0x2f, 0x3a, 0x25, 0x3a, 0x3a, 0x72, 0x3a, 0x3a, 0x63, 0x0b, 0x60, 0x3a, 0x63, 0x0b, 0x60, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x3a, 0x3a, 0x72, 0x3a, 0x72, 0x3e, 0x0d, 0x0e, 0x54, 0x54, 0x54, 0x3e},
			{0x64, 0x61, 0x67, 0x42, 0x3a, 0x3a, 0x25, 0x3a, 0x76, 0x62, 0x3a, 0x72, 0x76, 0x62, 0x3a, 0x2e, 0x72, 0x72, 0x72, 0x72, 0x3a, 0x3a, 0x72, 0x3a, 0x3a, 0x3e, 0x54, 0x54, 0x54, 0x54, 0x0f, 0x3e},
			{0x84, 0x67, 0x84, 0x67, 0x67, 0x67, 0x67, 0x67, 0x67, 0x67, 0x67, 0x67, 0x67, 0x67, 0x67, 0x84, 0x72, 0x72, 0x72, 0x72, 0x3a, 0x72, 0x3a, 0x3a, 0x72, 0x82, 0x82, 0x82, 0x82, 0x82, 0x82, 0x71}
		};
		
		result.setTilesetNr(11);
		result.setTiles(map);
		
		Location loc = new Location();
		loc.setTileData(result);
		
		return loc;
	}
}
