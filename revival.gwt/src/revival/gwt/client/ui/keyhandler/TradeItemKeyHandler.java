package revival.gwt.client.ui.keyhandler;

import revival.gwt.client.ui.IGuiStateListener;
import revival.gwt.client.ui.widget.option.AbstractInventoryWidget;
import revival.rules.CharaService;
import revival.rules.player.Chara;

import com.google.gwt.event.dom.client.KeyDownEvent;

public class TradeItemKeyHandler extends AbstractKeyDownHandler {

	private Chara chara;
	private int itemIdx;
	
	public TradeItemKeyHandler(Chara chara, int itemIdx) {
		this.chara = chara;
		this.itemIdx = itemIdx;
	}
	
	@Override
	public void onKeyDown(KeyDownEvent event) {
		final IGuiStateListener gsl = gameState.getGuiStateListener();
		int code = event.getNativeKeyCode();
		
		switch (code) {
		case KeyCode.KEY_1:
		case KeyCode.KEY_2:
		case KeyCode.KEY_3:
		case KeyCode.KEY_4:
		case KeyCode.KEY_5:
		case KeyCode.KEY_6:
		case KeyCode.KEY_7:
			int idx = event.getNativeKeyCode() - 49;
			Chara sink = gameState.getCurrentParty().getMember(idx);
			if (sink != chara) {
				CharaService.tradeItem(chara, sink, itemIdx);
				gsl.closeOption(); //close "Who wants it?"
				gsl.closeOption(); //close "Drop/Trade/Equip" (we could not close it before because escape key should go back to it
				((AbstractInventoryWidget)gsl.getOptionWidget()).update();
			}
			break;
		case KeyCode.KEY_ESC:
			gsl.closeOption();
			break;
		}
	}
}
