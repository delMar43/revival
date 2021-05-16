package revival.gwt.client.ui.keyhandler;

import revival.gwt.client.ui.IGuiStateListener;
import revival.gwt.client.ui.widget.option.InventoryItemWidget;
import revival.gwt.client.ui.widget.option.PlayerInventoryWidget;
import revival.gwt.client.ui.widget.option.PlayerSkillsWidget;
import revival.rules.player.Chara;

import com.google.gwt.event.dom.client.KeyDownEvent;

public class PlayerInventoryKeyHandler extends AbstractKeyDownHandler {

	private Chara chara;
	private PlayerInventoryWidget widget;
	
	public PlayerInventoryKeyHandler(Chara chara, PlayerInventoryWidget widget) {
		this.chara = chara;
		this.widget = widget;
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
		case KeyCode.KEY_8:
		case KeyCode.KEY_9:
			int idx = widget.getItemOffset() + code -49;
			gsl.displayOption(new InventoryItemWidget(chara, idx));
			break;
		case KeyCode.KEY_UP:
		case KeyCode.KEY_I:
			widget.pageUp();
			break;
		case KeyCode.KEY_DOWN:
		case KeyCode.KEY_K:
			widget.pageDown();
			break;
		case KeyCode.KEY_RETURN:
		case KeyCode.KEY_SPACE:
			gsl.displayOption(new PlayerSkillsWidget(chara));
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
