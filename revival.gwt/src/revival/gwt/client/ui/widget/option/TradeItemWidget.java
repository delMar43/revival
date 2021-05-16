package revival.gwt.client.ui.widget.option;

import revival.gwt.client.ui.keyhandler.TradeItemKeyHandler;
import revival.rules.player.Chara;

public class TradeItemWidget extends GridTextWidget {

	public TradeItemWidget(Chara chara, int itemIdx) {
		keyHandler = new TradeItemKeyHandler(chara, itemIdx);
		
		write("Who wants it?", 1);
	}
}
