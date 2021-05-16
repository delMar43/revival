package revival.gwt.client.ui.keyhandler;

import revival.gwt.client.ClientGameState;

import com.google.gwt.event.dom.client.KeyDownHandler;


public abstract class AbstractKeyDownHandler implements KeyDownHandler {

	protected ClientGameState gameState = ClientGameState.getInstance();
}
