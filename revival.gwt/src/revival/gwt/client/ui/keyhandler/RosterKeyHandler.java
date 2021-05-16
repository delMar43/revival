package revival.gwt.client.ui.keyhandler;

import revival.gwt.client.ClientGameState;
import revival.gwt.client.ui.widget.option.AttributeWidget;

import com.google.gwt.event.dom.client.KeyDownEvent;

public class RosterKeyHandler extends AbstractKeyDownHandler {

	private static RosterKeyHandler _instance;
	
	public static RosterKeyHandler getInstance() {
		if (_instance == null) {
			_instance = new RosterKeyHandler();
		}
		return _instance;
	}
	
	@Override
	public void onKeyDown(KeyDownEvent event) {

		switch (event.getNativeKeyCode()) {
		case KeyCode.KEY_1:
		case KeyCode.KEY_2:
		case KeyCode.KEY_3:
		case KeyCode.KEY_4:
		case KeyCode.KEY_5:
		case KeyCode.KEY_6:
		case KeyCode.KEY_7:
			int charNr = event.getNativeKeyCode() - 49;
			try {	
				ClientGameState.getInstance().getGuiStateListener().displayOption(new AttributeWidget(charNr));
			} catch (IndexOutOfBoundsException e) {
				//do nothing
			}
			break;
		}

	}

}
