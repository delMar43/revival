package revival.gwt.client.ui;

import com.google.gwt.core.client.GWT;

public class TextLocator {

	private static Texts texts;
	
	public static Texts getTexts() {
		if (texts == null) {
			texts = GWT.create(Texts.class);
		}
		return texts;
	}
}
