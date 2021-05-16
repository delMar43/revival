package revival.gwt.client.ui.widget.option;

import revival.engine.tilebased.client.world.actiondata.SpecialData;
import revival.engine.tilebased.client.world.actiondata.special.InfirmaryData;
import revival.engine.tilebased.client.world.actiondata.special.LibraryData;
import revival.engine.tilebased.client.world.actiondata.special.StoreData;
import revival.gwt.client.ClientGameState;
import revival.gwt.client.ui.keyhandler.BuildingKeyHandler;

public class BuildingWidget extends GridTextWidget {

	public BuildingWidget(SpecialData data) {
		ClientGameState gameState = ClientGameState.getInstance();
		
		if (data instanceof StoreData) {
			keyHandler = new BuildingKeyHandler();
		} else if (data instanceof InfirmaryData) {
			keyHandler = new BuildingKeyHandler();
		} else if (data instanceof LibraryData) {
			keyHandler = new BuildingKeyHandler();
		} else {
			throw new RuntimeException("Unknown specialdata: " + data.getClass());
		}
		
		String message = gameState.getCurrentLocation().getString(data.getMessageNr());
		
		createScreen(1);
		write(message, 1);
	}
}
