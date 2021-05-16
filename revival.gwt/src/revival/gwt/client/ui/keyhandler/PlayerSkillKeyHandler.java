package revival.gwt.client.ui.keyhandler;

import revival.gwt.client.ui.IGuiStateListener;
import revival.gwt.client.ui.widget.option.AbstractSkillsWidget;

import com.google.gwt.event.dom.client.KeyDownEvent;

public class PlayerSkillKeyHandler extends AbstractKeyDownHandler {

	private AbstractSkillsWidget widget;
	
	public PlayerSkillKeyHandler(AbstractSkillsWidget widget) {
		this.widget = widget;
	}

	@Override
	public void onKeyDown(KeyDownEvent event) {
		IGuiStateListener gsl = gameState.getGuiStateListener();
		
		switch (event.getNativeKeyCode()) {
		case KeyCode.KEY_UP:
		case KeyCode.KEY_I:
			widget.pageUp();
			break;
		case KeyCode.KEY_DOWN:
		case KeyCode.KEY_K:
			widget.pageDown();
			break;
		case KeyCode.KEY_ESC:
			gsl.closeOption();
		default:
			gsl.displayRoster(false);
			gsl.closeAllOptions();
			break;
		}
	}
}
