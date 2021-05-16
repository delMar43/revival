package revival.gwt.client.ui.widget.option;

import revival.gwt.client.ui.keyhandler.PlayerInventoryKeyHandler;
import revival.rules.player.Chara;

public class PlayerInventoryWidget extends AbstractInventoryWidget {

	public PlayerInventoryWidget(Chara chara) {
		super(chara);
		keyHandler = new PlayerInventoryKeyHandler(chara, this);
	}
}
