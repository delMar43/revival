package revival.gwt.client.ui.keyhandler;

import revival.engine.tilebased.client.world.actiondata.LootData;
import revival.gwt.client.ClientGameState;
import revival.gwt.client.ui.widget.option.LootListWidget;
import revival.rules.player.Chara;

import com.google.gwt.event.dom.client.KeyDownEvent;

public class LootChoiceKeyHandler extends AbstractKeyDownHandler {

	private LootData data;
	
	public LootChoiceKeyHandler(LootData data) {
		this.data = data;
	}
	
	@Override
	public void onKeyDown(KeyDownEvent event) {
		ClientGameState gameState = ClientGameState.getInstance();
		
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
			Chara chara = gameState.getCurrentParty().getMember(event.getNativeKeyCode()-49);
			
			gameState.getGuiStateListener().displayOption(new LootListWidget(chara, data));
			break;
		case KeyCode.KEY_ESC:
			gameState.getGuiStateListener().closeOption();
			break;
		}
	}

}
