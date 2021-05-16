package revival.rules.player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.allen_sauer.gwt.log.client.Log;

public class ItemFactory {

	private static Map<Integer, Item> items;
	
	public static void init(List<Item> items) {
//		Log.debug("ItemFactory on " + (GWT.isClient() ? "client" : "server")); 
		
		ItemFactory.items = new HashMap<Integer, Item>();
		for (Item item : items) {
			ItemFactory.items.put(item.getId(), item);
		}
		
		Log.debug("ItemFactory initialized with " + ItemFactory.items.size() + " items");
	}
	
	public static Item createItem(int id) {
		Item item = items.get(id);
		if (item instanceof Weapon) {
			return new Weapon((Weapon)item);
		} else if (item instanceof Armor) {
			return new Armor((Armor)item);
		} else if (item instanceof Ammo) {
			return new Ammo((Ammo)item);
		} else {
			return new Item(item);
		}
	}
	
}
