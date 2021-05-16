package revival.gwt.client.ui.widget.option;

import revival.gwt.client.ClientGameState;
import revival.gwt.client.ui.keyhandler.UseSkillKeyHandler;


public class UseSkillWidget extends AbstractSkillsWidget {

	public UseSkillWidget(int charNr) {
		super(ClientGameState.getInstance().getCurrentParty().getMember(charNr));
		keyHandler = new UseSkillKeyHandler(charNr, this);
	}
}
