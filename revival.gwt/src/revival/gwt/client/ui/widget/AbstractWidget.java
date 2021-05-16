package revival.gwt.client.ui.widget;

import revival.gwt.client.ui.Images;
import revival.gwt.client.ui.Texts;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Composite;

public abstract class AbstractWidget extends Composite {

	protected static final Images images = GWT.create(Images.class);
	protected static final Texts texts = GWT.create(Texts.class);
	
}
