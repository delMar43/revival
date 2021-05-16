package revival.gwt.client.ui.keyhandler;

import revival.gwt.client.ui.IGuiStateListener;
import revival.gwt.client.ui.widget.option.LootListWidget;
import revival.rules.player.Chara;

import com.google.gwt.event.dom.client.KeyDownEvent;

public class LootListKeyHandler extends AbstractKeyDownHandler {

	private Chara chara;
	private LootListWidget widget;
	
	public LootListKeyHandler(Chara chara, LootListWidget widget) {
		this.chara = chara;
		this.widget = widget;
	}
	
	@Override
	public void onKeyDown(KeyDownEvent event) {
		IGuiStateListener gsl = gameState.getGuiStateListener();
		
		gsl.closeOption();
		
		//TODO if loot-bag is empty, close all. if inventory is full, write "You can't carry any more". you can press escape an chose another character then
		
	}

}
