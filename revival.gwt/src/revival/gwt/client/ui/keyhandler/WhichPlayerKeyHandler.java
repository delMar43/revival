package revival.gwt.client.ui.keyhandler;

import revival.gwt.client.ui.IGuiStateListener;
import revival.gwt.client.ui.widget.option.UseWidget;

import com.google.gwt.event.dom.client.KeyDownEvent;

public class WhichPlayerKeyHandler extends AbstractKeyDownHandler {
	
	@Override
	public void onKeyDown(KeyDownEvent event) {
		IGuiStateListener gsl = gameState.getGuiStateListener();
		
		switch (event.getNativeKeyCode()) {
		case KeyCode.KEY_1:
		case KeyCode.KEY_2:
		case KeyCode.KEY_3:
		case KeyCode.KEY_4:
		case KeyCode.KEY_5:
		case KeyCode.KEY_6:
		case KeyCode.KEY_7:
			int charNr = event.getNativeKeyCode() - 49;
			try {
				gsl.displayOption(new UseWidget(charNr));
				gsl.getRosterComponent().setActiveChara(charNr+1);
			} catch (IndexOutOfBoundsException e) {
				//do nothing
			}
			break;
		case KeyCode.KEY_ESC:
			gsl.displayRoster(false);
			gsl.getRosterComponent().setActiveChara(-1);
			gsl.closeOption();
			break;
		}
		
	}

}
