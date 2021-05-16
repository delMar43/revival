package revival.gwt.client.ui.keyhandler;

import revival.gwt.client.ui.IGuiStateListener;
import revival.gwt.client.ui.widget.option.UseAttributeWidget;
import revival.gwt.client.ui.widget.option.UseItemWidget;
import revival.gwt.client.ui.widget.option.UseSkillWidget;

import com.google.gwt.event.dom.client.KeyDownEvent;

public class UseKeyHandler extends AbstractKeyDownHandler {

	private int charNr;
	
	public UseKeyHandler(int charNr) {
		this.charNr = charNr;
	}
	
	@Override
	public void onKeyDown(KeyDownEvent event) {
		IGuiStateListener gsl = gameState.getGuiStateListener();
		
		switch(event.getNativeKeyCode()) {
		case KeyCode.KEY_I:
			gsl.displayOption(new UseItemWidget(charNr));
			break;
		case KeyCode.KEY_S:
			gsl.displayOption(new UseSkillWidget(charNr));
			return;
		case KeyCode.KEY_A:
			gsl.displayOption(new UseAttributeWidget(charNr));
			break;
		case KeyCode.KEY_ESC:
			gsl.displayRoster(false);
			gsl.closeOption();
			break;
		}
	}
}
