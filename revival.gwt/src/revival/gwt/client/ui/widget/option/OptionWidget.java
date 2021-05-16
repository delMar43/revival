package revival.gwt.client.ui.widget.option;

import revival.gwt.client.ui.widget.InteractiveWidget;

import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;

public abstract class OptionWidget extends InteractiveWidget {

	protected AbsolutePanel panel;
	
	protected boolean ignoreHideAll = false; //true means that this is now closed upon a call to hideAllOptions
	
	public OptionWidget() {
		panel = new AbsolutePanel();
		Image border = images.borderOption().createImage();
		panel.setWidth(border.getWidth() + "px");
		panel.setHeight(border.getHeight() + "px");
		
		panel.add(border);
		
		initWidget(panel);
	}
	
	protected Label createLabel(int text) {
		return new Label(String.valueOf(text));
	}
	
	public void getFocus() {
		
	}
	
	public boolean ignoreHideAll() {
		return ignoreHideAll;
	}
}
