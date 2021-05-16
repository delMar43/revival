package revival.gwt.client.ui.widget.option;

import revival.gwt.client.ui.keyhandler.PlayerSkillKeyHandler;
import revival.rules.player.Chara;

public class PlayerSkillsWidget extends AbstractSkillsWidget {

	public PlayerSkillsWidget(Chara chara) {
		super(chara);
		keyHandler = new PlayerSkillKeyHandler(this);
	}
}
