package revival.gwt.client.ui.widget.option;

import revival.engine.tilebased.client.world.actiondata.LootData;
import revival.gwt.client.ui.keyhandler.LootChoiceKeyHandler;

public class LootChoiceWidget extends GridTextWidget {

	public LootChoiceWidget(LootData data) {
		keyHandler = new LootChoiceKeyHandler(data);
		
		write("Who wants to loot?", 1);
	}
}
