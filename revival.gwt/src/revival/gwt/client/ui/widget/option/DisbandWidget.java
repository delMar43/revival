package revival.gwt.client.ui.widget.option;

import revival.gwt.client.ui.keyhandler.NullKeyHandler;

public class DisbandWidget extends GridTextWidget {

	public DisbandWidget() {
		keyHandler = new NullKeyHandler();
		
		write("Who wants to disband?", 1);
	}
}
