package revival.gwt.client.ui.keyhandler;

import revival.gwt.client.ClientGameState;
import revival.gwt.client.ui.IGuiStateListener;
import revival.gwt.client.ui.widget.option.UseAttributeWidget;
import revival.rules.player.Attribute;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.user.client.Timer;

public class UseAttributeKeyHandler extends AbstractKeyDownHandler {
	
	private final IGuiStateListener gsl = gameState.getGuiStateListener();
	
	private int charNr;
	private UseAttributeWidget widget;
	
	public UseAttributeKeyHandler(int charNr, UseAttributeWidget widget) {
		this.charNr = charNr;
		this.widget = widget;
	}
	
	@Override
	public void onKeyDown(KeyDownEvent event) {
		switch(event.getNativeKeyCode()) {
		case KeyCode.KEY_1:
		case KeyCode.KEY_2:
		case KeyCode.KEY_3:
		case KeyCode.KEY_4:
		case KeyCode.KEY_5:
		case KeyCode.KEY_6:
		case KeyCode.KEY_7:
		case KeyCode.KEY_8:
		case KeyCode.KEY_9:
			final int attNr = event.getNativeKeyCode() -48;
			widget.selectAttribute(attNr);
			
			Log.debug("Character " + charNr + " uses Attribute #" + attNr);
			gsl.printMessage("Which way? Up, Down, Left, Right, Space");

			Timer t = new Timer() {
				@Override
				public void run() {
					//TODO hideOption instead of close
					gsl.closeAllOptions();
					gsl.displayRoster(false);
					
					Attribute att = ClientGameState.getInstance().getCurrentParty().getMember(charNr).getAttributeById(attNr);
					gsl.setKeyHandler(new UseDirectionKeyHandler(charNr, att));
				}
			};
			t.schedule(250);
			break;
		case KeyCode.KEY_ESC:
			gsl.displayRoster(false);
			gsl.closeOption();
			break;
		}
	}
}
