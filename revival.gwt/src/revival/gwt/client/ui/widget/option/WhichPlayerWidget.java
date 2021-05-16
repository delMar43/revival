package revival.gwt.client.ui.widget.option;

import revival.gwt.client.ClientGameState;
import revival.gwt.client.ui.IGuiStateListener;
import revival.gwt.client.ui.keyhandler.WhichPlayerKeyHandler;

public class WhichPlayerWidget extends GridTextWidget {

	public WhichPlayerWidget() {
		keyHandler = new WhichPlayerKeyHandler();
		
		write("Which player?", 1);
		
		getFocus();
	}
	
	@Override
	public void getFocus() {
		IGuiStateListener gsl = ClientGameState.getInstance().getGuiStateListener();
		gsl.displayRoster(true);
		gsl.getRosterComponent().setActiveChara(-1);
	}
}
