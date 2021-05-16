package revival.gwt.client.ui.widget.option;

import revival.gwt.client.ClientGameState;
import revival.gwt.client.ui.keyhandler.UseItemKeyHandler;

public class UseItemWidget extends AbstractInventoryWidget {

	public UseItemWidget(int charNr) {
		super(ClientGameState.getInstance().getCurrentParty().getMember(charNr));
		keyHandler = new UseItemKeyHandler(charNr, this);
	}
}
