package revival.gwt.client.ui.keyhandler;

import revival.gwt.client.ClientGameState;
import revival.gwt.client.ui.IGuiStateListener;
import revival.gwt.client.ui.widget.option.AttributeWidget;
import revival.gwt.client.ui.widget.option.PlayerInventoryWidget;
import revival.rules.player.Chara;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;

public class AttributeScreenKeyHandler extends AbstractKeyDownHandler {

	private AttributeWidget widget;
	private Chara chara;
	private ClientGameState gameState = ClientGameState.getInstance();
	
	public AttributeScreenKeyHandler(AttributeWidget widget, Chara chara) {
		this.chara = chara;
		this.widget = widget;
	}
	
	@Override
	public void onKeyDown(KeyDownEvent event) {
		IGuiStateListener gsl = gameState.getGuiStateListener();
		
		switch(event.getNativeKeyCode()) {
		case KeyCodes.KEY_ESCAPE:
			gsl.closeOption();
			break;
		case KeyCode.KEY_P:
//			chara.setMoney(chara.getMoney()+10);
			Log.debug("not implemented yet");
			widget.redraw();
			break;
		case KeyCode.KEY_D:
			Log.debug("not implemented yet");
			break;
		case KeyCode.KEY_RETURN:
		case KeyCode.KEY_SPACE:
			gsl.displayOption(new PlayerInventoryWidget(chara));
			break;
		}
		//pool
		//divide
		//next screen (always inventory?)
		//back to previous widget (=keyhandler and display)
	}

}
