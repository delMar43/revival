package revival.gwt.client.ui.widget.option;

import java.util.Arrays;

import revival.gwt.client.ui.keyhandler.UseAttributeKeyHandler;

import com.google.gwt.dom.client.Element;

public class UseAttributeWidget extends GridTextWidget {
	
	private int charNr;
	
	public UseAttributeWidget(int charNr) {
		this.charNr = charNr;
		
		keyHandler = new UseAttributeKeyHandler(charNr, this);
		
		write(Arrays.asList("Which:", null, "1) Strength", "2) IQ", "3) Luck", "4) Speed", "5) Agility", "6) Dexterity", "7) Charisma"));
	}

	public void selectAttribute(int index) {
		final Element row = grid.getRowFormatter().getElement(index +1);
		
		row.getStyle().setProperty("backgroundColor", "white");
		row.getStyle().setProperty("color", "black");
	}
}
