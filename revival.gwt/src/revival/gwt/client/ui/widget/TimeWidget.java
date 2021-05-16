package revival.gwt.client.ui.widget;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;

public class TimeWidget extends Composite {
	
	private Label label;
	
	public TimeWidget() {
		label = new Label("time");
		
		initWidget(label);
	}
	
}
