package revival.gwt.client;

import java.util.List;

import revival.engine.tilebased.client.world.Location;
import revival.engine.tilebased.client.world.actiondata.ActionData;
import revival.engine.tilebased.client.world.actiondata.AlterationData;
import revival.engine.tilebased.client.world.actiondata.AttributeCheck;
import revival.engine.tilebased.client.world.actiondata.CheckData;
import revival.engine.tilebased.client.world.actiondata.CheckState;
import revival.engine.tilebased.client.world.actiondata.Checkable;
import revival.engine.tilebased.client.world.actiondata.DialogueData;
import revival.engine.tilebased.client.world.actiondata.ImpassableData;
import revival.engine.tilebased.client.world.actiondata.ItemCheck;
import revival.engine.tilebased.client.world.actiondata.LootData;
import revival.engine.tilebased.client.world.actiondata.MaskData;
import revival.engine.tilebased.client.world.actiondata.MembersCheck;
import revival.engine.tilebased.client.world.actiondata.PrintData;
import revival.engine.tilebased.client.world.actiondata.RadiationData;
import revival.engine.tilebased.client.world.actiondata.SkillCheck;
import revival.engine.tilebased.client.world.actiondata.SpecialData;
import revival.engine.tilebased.client.world.actiondata.TransitionData;
import revival.gwt.client.ui.IGuiStateListener;
import revival.gwt.client.ui.widget.option.DialogueWidget;
import revival.gwt.client.ui.widget.option.LootChoiceWidget;
import revival.rules.Dice;
import revival.rules.player.Attribute;
import revival.rules.player.Chara;
import revival.rules.player.Item;
import revival.rules.player.Skill;
import revival.rules.player.Usable;

import com.allen_sauer.gwt.log.client.Log;

public class Checks {
	
	private static ClientGameState gameState = ClientGameState.getInstance();
	private static IGuiStateListener gsl = gameState.getGuiStateListener();
	private static Dice dice = new Dice();
	
	public static void eval(ActionData actionData) {
		if (actionData == null) return;
		
		Location curLoc = gameState.getCurrentLocation();
		
		if (actionData instanceof PrintData) { //1
			String message = "";
			PrintData data = (PrintData)actionData;
			for (Integer msgNr : data.getMessages()) {
				message += gameState.getCurrentLocation().getString(msgNr);
			}
			
			gsl.printMessage(message);
			
			Integer nac = data.getNewActionClass();
			
			if (nac != null) {
				Integer na = data.getNewAction();
				try {
					ActionData ad = curLoc.getActionDataId(nac, na);
					Checks.eval(ad);
				} catch(NullPointerException e) {
				}
			}
		} else if (actionData instanceof CheckData) { //2
			CheckData data = (CheckData)actionData;
			
			if (data.isPassable()) {
				if (data.isAutoCheck()) {
					if (data.isParty()) { //whole party must pass
						boolean fail = false;
						
						int charNr = 0;
						for (Chara ch : gameState.getCurrentParty().getMembers()) {
							boolean charFail = true;
							for (Checkable check : data.getChecks()) {
								Usable usable = getForCheckable(ch, check);
								CheckState state = checkPassed(charNr, usable, data);
								if (state == CheckState.CHECK_PASS) {
									charFail = false;
									break;
								}
								charNr++;
							}
							if (charFail) {
								fail = true;
								break;
							}
						}
						if (fail) {
							Log.debug("party failed");
							checkResult(CheckState.CHECK_FAIL, data);
						} else {
							Log.debug("party passed");
							checkResult(CheckState.CHECK_PASS, data);
						}
					} else { //only first member must pass
						boolean fail = true;
						Chara ch = gameState.getCurrentParty().getMember(0);
						for (Checkable check : data.getChecks()) {
							Usable usable = getForCheckable(ch, check);
							CheckState state = checkPassed(0, usable, data);
							if (state == CheckState.CHECK_PASS) {
								fail = false;
								break;
							}
						}
						if (fail) {
							Log.debug("first member failed");
							checkResult(CheckState.CHECK_FAIL, data);
						} else {
							Log.debug("first member passed");
							checkResult(CheckState.CHECK_PASS, data);
						}
					}
					
				} else {
					return; //manual checks are initiated from UseDirectionKeyHandler
				}
			}
		} else if (actionData instanceof MaskData) {
			MaskData data = (MaskData)actionData;
			curLoc.alterTile(gameState.getRowPos(), gameState.getColPos(), data.getTile());
			curLoc.alterActionData(gameState.getRowPos(), gameState.getColPos(), data);
			
			gameState.getGuiStateListener().drawMap();
			gameState.printMessage(data.getMessage());
		} else if (actionData instanceof LootData) { //5
			LootData data = (LootData)actionData;
			
			gsl.displayOption(new LootChoiceWidget(data));
			
		} else if (actionData instanceof SpecialData) { //6
			Log.debug("Specialaction " + actionData.getClass() + " not implemented yet");
		} else if (actionData instanceof DialogueData) { //8
			DialogueData data = (DialogueData)actionData;
			
			if (data.isMenu()) {
				gsl.displayOption(new DialogueWidget(data));
			} else {
				Log.debug("Dialogue actions without menu not implemented yet");
			}
		} else if (actionData instanceof RadiationData) { //9
			Log.debug("Radiation action not implemented yet");
		} else if (actionData instanceof TransitionData) { //10
			TransitionData a = (TransitionData)actionData;
			if (a == null) return;

			gameState.doTransition(a);
			
		} else if (actionData instanceof AlterationData) { //12
			AlterationData data = (AlterationData)actionData;
			
			gameState.doAlteration(data);
		} else if (actionData.equals(Location.ACTION_RANDOMENCOUNTER)) { //15
			Log.debug("Random encounter action not implemented yet");
		} else {
			Log.warn("Unknown action class: " + actionData.getClass());
//			if (actionNr != null) {
//				Log.warn("  action number=" + actionNr);
//			}
		}
	}
	
	/**
	 * consequences of failed or succeeded checks must be made here because eg swimming
	 * damages only the failed characters
	 * @param charNr
	 * @param usable
	 * @param data
	 * @return
	 */
	public static boolean doCheck(Integer charNr, Usable usable, CheckData data) {
		CheckState state = checkPassed(charNr, usable, data);
		return checkResult(state, data);
	}
	
	/**
	 * 
	 * @param state
	 * @param data
	 * @return
	 */
	private static boolean checkResult(CheckState state, CheckData data) {
		Integer msg = null;
		
		if (state == CheckState.CHECK_PASS) {
			msg = data.getPassMessage();
			if (msg != null) gsl.printMessage("[PM] "+ gameState.getCurrentLocation().getString(msg));
			
			Integer nac = data.getPassNewActionClass();
			if (nac != null) {
				Integer na = data.getPassNewAction();
				Log.debug("passNewActionClass=" + nac + ", na=" + na);
				ActionData ad = gameState.getCurrentLocation().getActionDataId(nac, na);
				eval(ad);
			}
			
			return true;
		} else if (state == CheckState.CHECK_FAIL) {
			msg = data.getFailMessage();
			if (msg != null) gsl.printMessage("[FM] " + gameState.getCurrentLocation().getString(msg));

			Integer nac = data.getFailNewActionClass();
			if (nac != null) {
				Integer na = data.getFailNewAction();
				Log.debug("failNewActionClass=" + nac + ", na=" + na);
				ActionData ad = gameState.getCurrentLocation().getActionDataId(nac, na);
				eval(ad);
			}
			
		} else if (state == CheckState.CHECK_INCORRECT) {
			gsl.printMessage("That doesn't seem to work");
		} else if (state == CheckState.CHECK_NODATA) {
			gsl.printMessage("Nothing happens.");
		}
		
		return data.isPassable();
	}
	
	private static CheckState checkPassed(Integer charNr, Usable usable, CheckData data) {
		int incorrect = 0;
		int fail = 0;
		
		List<Checkable> checks = data.getChecks();
		for (Checkable c : checks) {
			if (c instanceof SkillCheck && usable instanceof Skill) {
				CheckState state = checkSkill(charNr, (Skill)usable, (SkillCheck)c);
				if (state == CheckState.CHECK_PASS) {
					return CheckState.CHECK_PASS;
				} else if (state == CheckState.CHECK_INCORRECT) {
					incorrect++;
				} else if (state == CheckState.CHECK_FAIL) {
					fail++;
				}
			} else if (c instanceof AttributeCheck && usable instanceof Attribute) {
				AttributeCheck ac = (AttributeCheck)c;
				Log.debug("charNr " + charNr + ", checkAttribute " + ac.getAttributeId() + ", level=" + ac.getDifficulty());
				
				CheckState state = checkAttribute((Attribute)usable, ac);
				if (state == CheckState.CHECK_PASS) {
					return CheckState.CHECK_PASS;
				} else if (state == CheckState.CHECK_FAIL) {
					fail++;
				}
			} else if (c instanceof ItemCheck && usable instanceof Item) {
				CheckState state = checkItem((Item)usable, (ItemCheck)c);
				if (state == CheckState.CHECK_PASS) {
					return CheckState.CHECK_PASS;
				} else if (state == CheckState.CHECK_INCORRECT) {
					incorrect++;
				} else if (state == CheckState.CHECK_FAIL) {
					fail++;
				}
			} else if (c instanceof MembersCheck) {
				if (checkMembers((MembersCheck)c)) {
					return CheckState.CHECK_PASS;
				}
			}
		}
		
		if (fail > 0) {
			return CheckState.CHECK_FAIL;
		} else {
			return CheckState.CHECK_INCORRECT;
		}
	}
	
	private static CheckState checkSkill(Integer charNr, Skill skill, SkillCheck check) {
		Log.debug("checkSkill " + check.getSkillId() + ", level=" + check.getDifficulty());
		
		if (skill.getId() != check.getSkillId().intValue()) {
			return CheckState.CHECK_INCORRECT;
		}
		
		Chara chara = gameState.getCurrentParty().getMember(charNr);
		
		Attribute helper = chara.getAttributeById(skill.getAttributeId());
		int adds = skill.getLevel() + helper.getLevel();
		
		boolean pass = passSavingRoll(check.getDifficulty(), adds);
		
		if (pass) {
			Integer nac = check.getNewActionClass();
			if (nac != null) {
				Integer na = check.getNewAction();
				ActionData ad = gameState.getCurrentLocation().getActionDataId(nac, na);
				eval(ad);
			}
			return CheckState.CHECK_PASS;
		} else {
			return CheckState.CHECK_FAIL;
		}
	}

	private static CheckState checkAttribute(Attribute attribute, AttributeCheck check) {

		//check_incorrect is not possible because every character has every attribute
		
//		Chara chara = gameState.getCurrentParty().getMember(charNr);
		
		int adds = attribute.getLevel();
		
		boolean pass = passSavingRoll(check.getDifficulty(), adds);
		
		if (pass) {
			Integer nac = check.getNewActionClass();
			if (nac != null) {
				Integer na = check.getNewAction();
				ActionData ad = gameState.getCurrentLocation().getActionDataId(nac, na);
				eval(ad);
			}
			return CheckState.CHECK_PASS;
		} else {
			return CheckState.CHECK_FAIL;
		}
	}
	
	private static CheckState checkItem(Item item, ItemCheck check) {
		Log.debug("checkItem " + check.getValue());
		
		boolean pass = item.getId() == check.getValue().intValue();
		
		if (pass) {
			Integer nac = check.getNewActionClass();
			if (nac != null) {
				Integer na = check.getNewAction();
				ActionData ad = gameState.getCurrentLocation().getActionDataId(nac, na);
				eval(ad);
			}
			return CheckState.CHECK_PASS;
		} else {
			return CheckState.CHECK_FAIL;
		}
	}
	
	private static boolean checkMembers(MembersCheck check) {
		Log.debug("checkMembers " + check.getValue());
		
		return gameState.getCurrentParty().getMembers().size() >= check.getValue();
	}
	
	public static Usable getForCheckable(Chara chara, Checkable checkable) {
		Usable result = null;
		if (checkable instanceof SkillCheck) {
			int skillId = ((SkillCheck)checkable).getSkillId();
//			Log.debug("skillId=" + skillId);
			result = chara.getSkillById(skillId);
		} else if (checkable instanceof AttributeCheck) {
			int attId = ((AttributeCheck)checkable).getAttributeId();
//			Log.debug("attributeId=" + attId);
			result = chara.getAttribute(attId);
		} else if (checkable instanceof ItemCheck) {
			Log.debug("Item autocheck not implemented yet!");
		}
		return result;
	}
	
	private static boolean passSavingRoll(int difficulty, int adds) {
		int toBeat = difficulty *5 +15;
		int roll = dice.getSavingRoll(adds);
		
		Log.debug("trying to pass " + toBeat + ", adds=" + adds + ", result = " + roll);

		return roll >= toBeat;
	}
}
