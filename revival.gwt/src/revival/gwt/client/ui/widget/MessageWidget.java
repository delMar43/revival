package revival.gwt.client.ui.widget;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MessageWidget extends Composite {

	private ScrollPanel panel;
	private VerticalPanel vPanel;
	
	public MessageWidget() {
		panel = new ScrollPanel();
		panel.setWidth("640px");
		panel.setHeight("160px");
		
		vPanel = new VerticalPanel();
		vPanel.setStyleName("white");
		panel.add(vPanel);
		
		initWidget(panel);
	}
	
	public void printMessage(String message) {
		vPanel.add(new Label(message));
		
		panel.scrollToBottom();
	}
	
	
}
