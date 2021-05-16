package revival.gwt.client.ui.widget.option;

import java.util.Arrays;
import java.util.List;

import revival.gwt.client.ClientGameState;
import revival.gwt.client.ui.IGuiStateListener;
import revival.gwt.client.ui.keyhandler.UseKeyHandler;

public class UseWidget extends GridTextWidget {
	private static final List<String> text = Arrays.asList("Use:", null, "Item", "Skill", "Attribute");
	
	private int charNr;
	
	public UseWidget(int charNr) {
		this.charNr = charNr;
		keyHandler = new UseKeyHandler(charNr);
		
		write(text);
		
		getFocus();
	}
	
	@Override
	public void getFocus() {
		IGuiStateListener gsl = ClientGameState.getInstance().getGuiStateListener();
		gsl.displayRoster(true);
		gsl.getRosterComponent().setActiveChara(charNr);
	}
}
