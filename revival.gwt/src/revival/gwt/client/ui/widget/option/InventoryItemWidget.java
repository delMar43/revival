package revival.gwt.client.ui.widget.option;

import java.util.Arrays;
import java.util.List;

import revival.gwt.client.ui.keyhandler.InventoryItemKeyHandler;
import revival.rules.player.Chara;

public class InventoryItemWidget extends GridTextWidget {

	private static final List<String> text = Arrays.asList("Do you want to:", null, "Drop", "Trade", "Equip/unequip");
	
	public InventoryItemWidget(Chara chara, int itemIdx) {
		keyHandler = new InventoryItemKeyHandler(chara, itemIdx);
		
		write(text);
	}
}
