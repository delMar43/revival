package revival.gwt.client.ui.keyhandler;

import revival.gwt.client.ui.IGuiStateListener;
import revival.gwt.client.ui.widget.option.DisbandWidget;
import revival.gwt.client.ui.widget.option.EncounterWidget;
import revival.gwt.client.ui.widget.option.OrderWidget;
import revival.gwt.client.ui.widget.option.RadioWidget;
import revival.gwt.client.ui.widget.option.WhichPlayerWidget;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;

public class MapKeyHandler extends AbstractKeyDownHandler {
	
	@Override
	public void onKeyDown(KeyDownEvent event) {
		IGuiStateListener gsl = gameState.getGuiStateListener();
		
		switch (event.getNativeKeyCode()) {
		case KeyCodes.KEY_UP:
		case KeyCode.KEY_I:
			gameState.moveUp();
			break;
		case KeyCodes.KEY_DOWN:
		case KeyCode.KEY_K:
			gameState.moveDown();
			break;
		case KeyCodes.KEY_LEFT:
		case KeyCode.KEY_J:
			gameState.moveLeft();
			break;
		case KeyCodes.KEY_RIGHT:
		case KeyCode.KEY_L:
			gameState.moveRight();
			break;
		case KeyCode.KEY_SPACE:
			gsl.displayRoster(!gsl.isRosterDisplayed());
			break;
		case KeyCode.KEY_U:
			gsl.displayOption(new WhichPlayerWidget());
			break;
		case KeyCode.KEY_E:
			gsl.displayOption(new EncounterWidget());
			break;
		case KeyCode.KEY_O:
			gsl.displayOption(new OrderWidget());
			break;
		case KeyCode.KEY_D:
			gsl.displayOption(new DisbandWidget());
			break;
		case KeyCode.KEY_R:
			gsl.displayOption(new RadioWidget());
			break;
		case KeyCode.KEY_1:
		case KeyCode.KEY_2:
		case KeyCode.KEY_3:
		case KeyCode.KEY_4:
		case KeyCode.KEY_5:
		case KeyCode.KEY_6:
		case KeyCode.KEY_7:
			RosterKeyHandler.getInstance().onKeyDown(event);
			break;
		default:
			Log.debug("MapKeyHandler::keyCode=" + event.getNativeKeyCode());
			break;
		}
	}
}
