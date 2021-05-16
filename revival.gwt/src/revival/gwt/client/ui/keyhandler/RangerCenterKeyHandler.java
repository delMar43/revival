package revival.gwt.client.ui.keyhandler;

import revival.gwt.client.ui.widget.option.RangerCenterWidget;
import revival.rules.player.Nationality;
import revival.rules.special.RangerCenter;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.event.dom.client.KeyDownEvent;

public class RangerCenterKeyHandler extends AbstractKeyDownHandler {

	private RangerCenter rangerCenter;
	private RangerCenterWidget rcw;
	
	public RangerCenterKeyHandler(RangerCenter rangerCenter, RangerCenterWidget rcw) {
		this.rangerCenter = rangerCenter;
		this.rcw = rcw;
	}
	
	@Override
	public void onKeyDown(KeyDownEvent event) {
		String curScreen = rangerCenter.getCurrentScreen();
		
		if (curScreen.equals(RangerCenter.SCREEN_WELCOME)) {
			handleWelcomeScreen(event);
		} else if (curScreen.equals(RangerCenter.SCREEN_CREATE)) {
			handleCreateScreen(event.getNativeKeyCode());
		} else if (curScreen.equals(RangerCenter.SCREEN_NAME)) {
			handleNameScreen(event.getNativeKeyCode(), !event.isShiftKeyDown());
		} else if (curScreen.equals(RangerCenter.SCREEN_SEX)) {
			handleSexScreen(event.getNativeKeyCode());
		} else if (curScreen.equals(RangerCenter.SCREEN_NATIONALITY)) {
			handleNationalityScreen(event.getNativeKeyCode());
		} else if (curScreen.equals(RangerCenter.SCREEN_SKILLS)) {
			handleSkillScreen(event.getNativeKeyCode());
		}
		
	}
	
	private void handleWelcomeScreen(KeyDownEvent event) {
		switch (event.getNativeKeyCode()) {
		case KeyCode.KEY_C: //create character
			if (rangerCenter.canCreateCharacter()) {
				rcw.showCreateCharacter();
			}
			break;
		case KeyCode.KEY_D: //delete character
			
			break;
		case KeyCode.KEY_L: //leave ranger center
			if (rangerCenter.canLeaveBuilding()) {
				gameState.leaveBuilding();
			}
			break;
		case KeyCode.KEY_ESC:
			gameState.leaveBuilding();
			break;
		case KeyCode.KEY_1:
		case KeyCode.KEY_2:
		case KeyCode.KEY_3:
		case KeyCode.KEY_4:
		case KeyCode.KEY_5:
		case KeyCode.KEY_6:
		case KeyCode.KEY_7:
			RosterKeyHandler.getInstance().onKeyDown(event);
			break;
		default:
			Log.debug("RangerCenterKeyHandler::keyCode=" + event.getNativeKeyCode());
			break;
		}
	}
	
	private void handleCreateScreen(int keyCode) {
		switch (keyCode) {
		case KeyCode.KEY_SPACE: //reroll
			int[] atts = rangerCenter.rollAttDice();
			rcw.showAttributeValues(atts);
			rcw.showMaxConValue(rangerCenter.rollMaxConDice());
			break;
		case KeyCode.KEY_RETURN: //accept
			rangerCenter.acceptAttributes();
			rcw.showEnterName();
			break;
		case KeyCode.KEY_ESC: //back to menu
			rcw.showWelcome();
			break;
		}
	}
	
	public void handleNameScreen(int keyCode, boolean lower) {
		if ((keyCode > 64 && keyCode < 91) || keyCode == 32 || (keyCode >= 48 && keyCode <= 57)) {
			if ((keyCode > 64 && keyCode < 91) && lower) keyCode += 32;
			rcw.addLetter(keyCode);
		} else if (keyCode == 8) {
			rcw.removeLetter();
		} else if (keyCode == KeyCode.KEY_RETURN) {
			rcw.showEnterSex();
		} else if (keyCode == KeyCode.KEY_ESC) {
			rcw.showWelcome();
		} else {
			Log.debug("RangerCenterKeyHandler::handleNameScreen=" + keyCode);
		}
	}
	
	public void handleSexScreen(int keyCode) {
		switch (keyCode) {
		case KeyCode.KEY_M:
			rangerCenter.acceptSex(false);
			rcw.showEnterNationality();
			break;
		case KeyCode.KEY_F:
			rangerCenter.acceptSex(true);
			rcw.showEnterNationality();
			break;
		case KeyCode.KEY_ESC:
			rcw.showWelcome();
			break;
		}
	}
	
	public void handleNationalityScreen(int keyCode) {
		switch (keyCode) {
		case KeyCode.KEY_1:
			rangerCenter.acceptNationality(Nationality.UNITEDSTATES);
			rcw.showEnterSkillpoints();
			break;
		case KeyCode.KEY_2:
			rangerCenter.acceptNationality(Nationality.RUSSIAN);
			rcw.showEnterSkillpoints();
			break;
		case KeyCode.KEY_3:
			rangerCenter.acceptNationality(Nationality.MEXICAN);
			rcw.showEnterSkillpoints();
			break;
		case KeyCode.KEY_4:
			rangerCenter.acceptNationality(Nationality.INDIAN);
			rcw.showEnterSkillpoints();
			break;
		case KeyCode.KEY_5:
			rangerCenter.acceptNationality(Nationality.CHINESE);
			rcw.showEnterSkillpoints();
			break;
		case KeyCode.KEY_ESC:
			rcw.showWelcome();
			break;
		}
	}

	//TODO maybe this could be more generic code for library as well
	public void handleSkillScreen(int keyCode) {
		switch(keyCode) {
		case KeyCode.KEY_RETURN:
			rangerCenter.acceptSkillpoints();
			gameState.addMember(rangerCenter.getCurrentCharacter());
			rcw.showWelcome();
		case KeyCode.KEY_ESC:
			rcw.showWelcome();
			break;
		}
	}
}
