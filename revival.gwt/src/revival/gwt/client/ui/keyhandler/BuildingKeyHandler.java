package revival.gwt.client.ui.keyhandler;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.event.dom.client.KeyDownEvent;

public class BuildingKeyHandler extends AbstractKeyDownHandler {
	
	@Override
	public void onKeyDown(KeyDownEvent event) {
		switch (event.getNativeKeyCode()) {
		case 27:
			gameState.leaveBuilding();
		default:
			Log.debug("BuildingKeyHandler::keyCode=" + event.getNativeKeyCode());
			break;
		}
	}
}
