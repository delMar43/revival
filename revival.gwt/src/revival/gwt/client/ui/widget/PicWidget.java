package revival.gwt.client.ui.widget;

import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Image;

public class PicWidget extends AbstractWidget {
	
	private AbsolutePanel panel;
	private Image border;
	
	public PicWidget() {
		panel = new AbsolutePanel();
		border = images.borderPic().createImage();
		panel.setWidth(border.getWidth() + "px");
		panel.setHeight(border.getHeight() + "px");
		
		panel.add(border);
		
		initWidget(panel);
	}

}
