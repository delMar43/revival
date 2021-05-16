package revival.gwt.client.ui.widget.option;

import revival.engine.tilebased.client.world.actiondata.DialogueData;
import revival.gwt.client.ClientGameState;
import revival.gwt.client.ui.keyhandler.MenuDialogueKeyHandler;

public class DialogueWidget extends GridTextWidget {

	private static final ClientGameState gameState = ClientGameState.getInstance();
	
	public DialogueWidget(DialogueData data) {
		keyHandler = new MenuDialogueKeyHandler(data);
		
		String msg = gameState.getCurrentLocation().getString(data.getMessage());
		
		write(msg.replace("\\x10", "<br/>").replace("\\x11", "<br/>"), 1);
	}
}
