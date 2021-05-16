package revival.gwt.client.ui.keyhandler;

import revival.engine.tilebased.client.world.Location;
import revival.engine.tilebased.client.world.actiondata.SpecialData;
import revival.engine.tilebased.client.world.actiondata.TransitionData;
import revival.gwt.client.ui.IGuiStateListener;
import revival.gwt.client.ui.widget.option.BuildingWidget;
import revival.gwt.client.ui.widget.option.RangerCenterWidget;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.event.dom.client.KeyDownEvent;

public class TransitionKeyHandler extends AbstractKeyDownHandler {
	
	private static final int KEY_Y = 89;
	private static final int KEY_N = 78;

	private TransitionData data;
	private Location curLocation;
	
	public TransitionKeyHandler(TransitionData data, boolean rememberAsPrevious) {
		this.data = data;
		this.curLocation = gameState.getCurrentLocation();
	}
	
	@Override
	public void onKeyDown(KeyDownEvent event) {
		IGuiStateListener gsl = gameState.getGuiStateListener();
		
		switch (event.getNativeKeyCode()) {
		case KEY_Y:
			gsl.closeOption();
			
			if (data.getNewActionClass() != null) { //very likely to enter building
				
				switch (data.getNewActionClass()) {
				case 6:
					handleSpecialAction(curLocation.getSpecialAction(data.getNewAction()));
					break;
				default:
					Log.debug("Actionclass " + data.getNewActionClass() + " not implemented yet!!!");
					break;
				}
				
			} else { //enter another location
				Integer targetMap = data.getTargetMap();
//				if (targetMap != null) {
					gameState.loadLocation(data.getTargetMap(), data.getTargetX(), data.getTargetY(), data.isRelative(), false);
//				} else {
//					gameState.loadLocation(null, 0, 0, false, false);
//				}
			}
			
			break;
		case KEY_N:
			gsl.closeOption();
			break;
		}
	}
	
	private void handleSpecialAction(SpecialData action) {
		if (action.getType().equals("rangerCenter")) {
			gameState.enterBuilding(new RangerCenterWidget());
		} else {
			gameState.enterBuilding(new BuildingWidget(action));
		}
		
	}

}
