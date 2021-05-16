package revival.gwt.client.ui.keyhandler;

import revival.gwt.client.ui.IGuiStateListener;

import com.google.gwt.event.dom.client.KeyDownEvent;

public class NullKeyHandler extends AbstractKeyDownHandler {

	@Override
	public void onKeyDown(KeyDownEvent event) {
		IGuiStateListener gsl = gameState.getGuiStateListener();
		
		gsl.closeOption();
	}

}
