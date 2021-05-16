package revival.gwt.client.ui.widget.option;

import revival.gwt.client.ClientGameState;
import revival.gwt.client.ui.keyhandler.NullKeyHandler;
import revival.rules.player.Chara;

public class OrderWidget extends GridTextWidget {

	public OrderWidget() {
		keyHandler = new NullKeyHandler();
		
		write("Pick a player:", 1);
		int idx=1;
		for (Chara chara : ClientGameState.getInstance().getCurrentParty().getMembers()) {
			write(idx + ") " + chara.getName(), ++idx);
		}
	}
}
