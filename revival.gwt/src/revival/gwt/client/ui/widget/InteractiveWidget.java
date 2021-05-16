package revival.gwt.client.ui.widget;


import revival.gwt.client.ui.keyhandler.AbstractKeyDownHandler;

public abstract class InteractiveWidget extends AbstractWidget {

	protected AbstractKeyDownHandler keyHandler;
	
	public AbstractKeyDownHandler getKeyHandler() {
		return keyHandler;
	}
}
