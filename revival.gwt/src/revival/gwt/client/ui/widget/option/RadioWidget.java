package revival.gwt.client.ui.widget.option;

import java.util.Arrays;
import java.util.List;

import revival.gwt.client.ui.keyhandler.NullKeyHandler;

public class RadioWidget extends GridTextWidget {

	private static final List<String> text = Arrays.asList("Radio?", null, "Yes", "No");
	
	public RadioWidget() {
		keyHandler = new NullKeyHandler();
		
		write(text);
	}
}
