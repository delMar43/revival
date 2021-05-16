package revival.gwt.client.ui.keyhandler;

import revival.engine.tilebased.client.world.Location;
import revival.engine.tilebased.client.world.actiondata.ActionData;
import revival.engine.tilebased.client.world.actiondata.DialogueAnswer;
import revival.engine.tilebased.client.world.actiondata.DialogueData;
import revival.gwt.client.Checks;
import revival.gwt.client.ui.IGuiStateListener;

import com.google.gwt.event.dom.client.KeyDownEvent;

public class MenuDialogueKeyHandler extends AbstractKeyDownHandler {

	private DialogueData data;
	private IGuiStateListener gsl;
	
	public MenuDialogueKeyHandler(DialogueData data) {
		this.data = data;
		gsl = gameState.getGuiStateListener();
	}
	
	@Override
	public void onKeyDown(KeyDownEvent event) {
//		gsl.closeOption();
		
		int code = event.getNativeKeyCode();
		
		ActionData ad;
		Location curLoc = gameState.getCurrentLocation();
		for (DialogueAnswer a : data.getAnswers()) {
			String answer = curLoc.getString(a.getMessage());
			char c = answer.charAt(0);
			if (code == (int)c) {
				ad = curLoc.getActionDataId(a.getNewActionClass(), a.getNewAction());
				Checks.eval(ad);
				return;
			}
		}
		
		switch (code) {
		case KeyCode.KEY_ESC:
			ad = curLoc.getActionDataId(data.getCancelNewActionClass(), data.getCancelNewAction());
			gsl.closeOption();
			Checks.eval(ad);
			break;
		case KeyCode.KEY_H:
			gsl.closeAllOptions(); //debug option to escape stuck dialogs
			break;
		default:
			ad = curLoc.getActionDataId(data.getOtherNewActionClass(), data.getOtherNewAction());
			gsl.closeAllOptions();
			Checks.eval(ad);
			break;
		}
		
	}
}
