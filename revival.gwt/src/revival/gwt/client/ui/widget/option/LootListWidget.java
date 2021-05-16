package revival.gwt.client.ui.widget.option;

import revival.engine.tilebased.client.world.actiondata.LootData;
import revival.gwt.client.ui.keyhandler.LootListKeyHandler;
import revival.rules.player.Chara;

public class LootListWidget extends GridTextWidget {

	public LootListWidget(Chara chara, LootData data) {
		keyHandler = new LootListKeyHandler(chara, this);
		
		write(chara.getName() + ", take an item", 1);
		
		write(data.getItems().size() + " items", 3);
	}
}
