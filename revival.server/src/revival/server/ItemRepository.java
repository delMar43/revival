package revival.server;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import revival.rules.player.Ammo;
import revival.rules.player.Armor;
import revival.rules.player.Item;
import revival.rules.player.Weapon;
import au.com.bytecode.opencsv.CSVReader;

public class ItemRepository {
	private static final Log log = LogFactory.getLog(ItemRepository.class);

	private static ItemRepository rep;
	
	private List<Item> items;
	
	private ItemRepository(){}
	
	public static ItemRepository getInstance() {
		if (rep == null) {
			rep = new ItemRepository();
		}
		return rep;
	}
	
	public List<Item> getItems() {
		if (items == null) {
			items = load();
		}
		return new ArrayList<Item>(items);
	}
	
	private List<Item> load() {
		List<Item> result = new ArrayList<Item>();
		
		Properties props = new Properties();
		File file = null;
		try {
			props.load(this.getClass().getResourceAsStream("/revival/configuration.properties"));
			String savegamepath = (String) props.get("savegamepath");

			file = new File(savegamepath + "itemlist.csv");
			
		    CSVReader reader = new CSVReader(new FileReader(file), ';');
		    String [] nextLine;
		    while ((nextLine = reader.readNext()) != null) {
		        result.add(createItem(nextLine));
		    }
		} catch (FileNotFoundException e1) {
			log.error(e1, e1);
		} catch (IOException e1) {
			log.error(e1, e1);
		}

		if (file == null) {
			throw new RuntimeException("Unable to load mapfile!!!");
		}
		
		return result;
	}
	
	private Item createItem(String[] line) {
		int id = Integer.parseInt(line[0]);
		String name = line[1];
		int lowCost = Integer.parseInt(line[2]);
		int highCost = Integer.parseInt(line[3]);
		int shopItemNr = Integer.parseInt(line[4]);
		int itemType = Integer.parseInt(line[5]);
		boolean demo = line[6].equals("1");
		int nrUses = Integer.parseInt(line[7]);
		int skillId = Integer.parseInt(line[8]);
		int dmg = Integer.parseInt(line[9]);
		int ammoType = Integer.parseInt(line[10]);
		
		if (itemType <= 13) { //weapons
			return new Weapon(id, name, name, lowCost, highCost, nrUses, itemType, shopItemNr, demo, ammoType, skillId, dmg);
		} else if (itemType == 14) { //ammo
			return new Ammo(id, name, name, lowCost, highCost, nrUses, itemType, shopItemNr);
		} else if (itemType == 15) { //armor
			return new Armor(id, name, name, lowCost, highCost, nrUses, itemType, shopItemNr, dmg);
		} else { //items
			return new Item(id, name, name, lowCost, highCost, nrUses, itemType, shopItemNr, dmg);
		}
	}
}
