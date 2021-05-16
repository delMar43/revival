package revival.gwt.client.ui.widget;

import com.google.gwt.user.client.ui.SimplePanel;

public class GeigerWidget extends AbstractWidget {

	private SimplePanel panel;
	
	public GeigerWidget() {
		panel = new SimplePanel();
		
		panel.add(images.geigerCounter().createImage());
		
		initWidget(panel);
	}
}
