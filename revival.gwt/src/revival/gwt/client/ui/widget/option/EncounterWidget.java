package revival.gwt.client.ui.widget.option;

import java.util.Arrays;
import java.util.List;

import revival.gwt.client.ui.keyhandler.NullKeyHandler;

public class EncounterWidget extends GridTextWidget {

	private static final List<String> text = Arrays.asList("This party is not being attacked. Do you want them to execute a battle round?", null, "Yes", "No");
	
	public EncounterWidget() {
		keyHandler = new NullKeyHandler();
		
		write(text);
	}
}
