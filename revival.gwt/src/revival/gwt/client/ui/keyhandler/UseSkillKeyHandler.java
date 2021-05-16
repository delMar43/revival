package revival.gwt.client.ui.keyhandler;

import revival.gwt.client.ClientGameState;
import revival.gwt.client.ui.IGuiStateListener;
import revival.gwt.client.ui.widget.option.AbstractSkillsWidget;
import revival.rules.player.Skill;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.user.client.Timer;

public class UseSkillKeyHandler extends AbstractKeyDownHandler {

	private final IGuiStateListener gsl = gameState.getGuiStateListener();
	
	private int charNr;
	private AbstractSkillsWidget widget;
	
	public UseSkillKeyHandler(int charNr, AbstractSkillsWidget widget) {
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
			int skillNr = event.getNativeKeyCode() -49;
			widget.selectSkill(skillNr);
			
			final int skillIdx = widget.getSkillOffset() + skillNr;
			Log.debug("Character " + charNr + " uses Skill #" + skillIdx);
			gsl.printMessage("Which way? Up, Down, Left, Right, Space");

			Timer t = new Timer() {
				@Override
				public void run() {
					//TODO hideOption instead of close
					gsl.closeAllOptions();
					gsl.displayRoster(false);
					
					Skill skill = ClientGameState.getInstance().getCurrentParty().getMember(charNr).getSkill(skillIdx);
					gsl.setKeyHandler(new UseDirectionKeyHandler(charNr, skill));
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
