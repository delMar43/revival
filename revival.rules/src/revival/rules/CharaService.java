package revival.rules;

import revival.rules.player.Chara;
import revival.rules.player.Item;

public class CharaService {

	public static boolean tradeItem(Chara source, Chara sink, int itemIdx) {
		Item item = source.getItem(itemIdx);
		if (sink.addItem(item)) {
			source.removeItem(itemIdx);
			return true;
		} else {
			return false;
		}
	}
	
	public static void dropItem(Chara chara, int itemIdx) {
		chara.removeItem(itemIdx);
	}
	
	public static void equipItem(Chara chara, int itemIdx) {
		chara.equipItem(itemIdx);
	}
}
