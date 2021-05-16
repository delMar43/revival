package revival.gwt.client.ui.keyhandler;

import revival.gwt.client.ClientGameState;
import revival.gwt.client.ui.IGuiStateListener;
import revival.gwt.client.ui.widget.option.UseItemWidget;
import revival.rules.player.Item;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.user.client.Timer;

public class UseItemKeyHandler extends AbstractKeyDownHandler {

	private final IGuiStateListener gsl = gameState.getGuiStateListener();
	
	private int charNr;
	private UseItemWidget widget;
	
	public UseItemKeyHandler(int charNr, UseItemWidget widget) {
		this.charNr = charNr;
		this.widget = widget;
	}
	
	@Override
	public void onKeyDown(KeyDownEvent event) {
		switch(event.getNativeKeyCode()) {
		case KeyCode.KEY_UP:
		case KeyCode.KEY_I:
			widget.pageUp();
			break;
		case KeyCode.KEY_DOWN:
		case KeyCode.KEY_K:
			widget.pageDown();
			break;
		case KeyCode.KEY_1:
		case KeyCode.KEY_2:
		case KeyCode.KEY_3:
		case KeyCode.KEY_4:
		case KeyCode.KEY_5:
		case KeyCode.KEY_6:
		case KeyCode.KEY_7:
		case KeyCode.KEY_8:
		case KeyCode.KEY_9:
			int itemNr = event.getNativeKeyCode() -49;
			widget.selectItem(itemNr);
			
			final int itemIdx = widget.getItemOffset() + itemNr;
			Log.debug("Character " + charNr + " uses Item #" + itemIdx);
			gsl.printMessage("Which way? Up, Down, Left, Right, Space");

			Timer t = new Timer() {
				@Override
				public void run() {
					//TODO hideOption instead of close
					gsl.closeAllOptions();
					gsl.displayRoster(false);
					
					Item item = ClientGameState.getInstance().getCurrentParty().getMember(charNr).getItem(itemIdx);
					gsl.setKeyHandler(new UseDirectionKeyHandler(charNr, item));
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
