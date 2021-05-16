package revival.gwt.client.ui.widget.option;

import java.util.Arrays;

import revival.engine.tilebased.client.world.actiondata.TransitionData;
import revival.gwt.client.ui.keyhandler.TransitionKeyHandler;

public class TransitionWidget extends GridTextWidget {

	public TransitionWidget(TransitionData data) {
		keyHandler = new TransitionKeyHandler(data, false);

		write(Arrays.asList("Enter new location?", null, "Yes", "No"));
	}
}
