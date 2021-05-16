package revival.gwt.client.ui.keyhandler;

import revival.gwt.client.ui.IGuiStateListener;
import revival.gwt.client.ui.widget.option.AbstractInventoryWidget;
import revival.gwt.client.ui.widget.option.TradeItemWidget;
import revival.rules.CharaService;
import revival.rules.player.Chara;

import com.google.gwt.event.dom.client.KeyDownEvent;

public class InventoryItemKeyHandler extends AbstractKeyDownHandler {

	private Chara chara;
	private int itemIdx;
	
	public InventoryItemKeyHandler(Chara chara, int itemIdx) {
		this.chara = chara;
		this.itemIdx = itemIdx;
	}
	
	@Override
	public void onKeyDown(KeyDownEvent event) {
		final IGuiStateListener gsl = gameState.getGuiStateListener();
		
		switch (event.getNativeKeyCode()) {

		case KeyCode.KEY_T:
			gsl.displayOption(new TradeItemWidget(chara, itemIdx));
			break;
		case KeyCode.KEY_D:
			CharaService.dropItem(chara, itemIdx);
			gsl.closeOption();
			break;
		case KeyCode.KEY_E:
			CharaService.equipItem(chara, itemIdx);
			gsl.closeOption();
			((AbstractInventoryWidget)gsl.getOptionWidget()).update();
			gsl.getRosterComponent().update();
			break;
		case KeyCode.KEY_ESC:
			gsl.closeOption();
			break;
		}		
	}
}
