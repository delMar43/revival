package revival.gwt.client.ui.keyhandler;

import revival.engine.tilebased.client.world.Location;
import revival.engine.tilebased.client.world.actiondata.ActionData;
import revival.engine.tilebased.client.world.actiondata.CheckData;
import revival.gwt.client.Checks;
import revival.gwt.client.ui.IGuiStateListener;
import revival.rules.player.Usable;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.event.dom.client.KeyDownEvent;

public class UseDirectionKeyHandler extends AbstractKeyDownHandler {

	private final IGuiStateListener gsl = gameState.getGuiStateListener();
	private final Location curLoc = gameState.getCurrentLocation();
	
	private int charNr;
	private Usable usable;
	
	public UseDirectionKeyHandler(int charNr, Usable usable) {
		this.charNr = charNr;
		this.usable = usable;
	}
	
	private void handleUse(int row, int col) {
		ActionData actionData = curLoc.getActionDataPos(row, col);
		if (actionData == null) {
			gsl.printMessage("Nothing happens.");
			return;
		}
//		Integer actionNr = curLoc.getAction(row, col);
		
		if (actionData instanceof CheckData) { //only checks are handled here
			CheckData data = (CheckData)actionData;
			
			gameState.getCurrentParty().setPosition(row, col);
			boolean success = Checks.doCheck(charNr, usable, data);
			if (!success) {
				gameState.getCurrentParty().revertPosition();
			}
		} else {
			Log.debug("use was issued on actionclass " + actionData);
			gsl.printMessage("Nothing happens.");
		}
	}
	
	@Override
	public void onKeyDown(KeyDownEvent event) {
		final int col = gameState.getCurrentParty().getPosCol();
		final int row = gameState.getCurrentParty().getPosRow();
		
		switch(event.getNativeKeyCode()) {
		case KeyCode.KEY_UP:
		case KeyCode.KEY_I:
			handleUse(row -1, col);
			break;
		case KeyCode.KEY_DOWN:
		case KeyCode.KEY_K:
			handleUse(row +1, col);
			break;
		case KeyCode.KEY_LEFT:
		case KeyCode.KEY_J:
			handleUse(row, col -1);
			break;
		case KeyCode.KEY_RIGHT:
		case KeyCode.KEY_L:
			handleUse(row, col +1);
			break;
		case KeyCode.KEY_SPACE:
			handleUse(row, col);
			break;
		case KeyCode.KEY_ESC:
			break;
		}
		
		gsl.setKeyHandlerToPrevious();
	}
}
