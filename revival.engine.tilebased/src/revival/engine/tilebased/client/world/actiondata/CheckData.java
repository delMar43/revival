package revival.engine.tilebased.client.world.actiondata;

import java.util.List;
import java.util.Map;

public class CheckData extends ActionData {

	private boolean passable;   //true=passable even without check or if failed, false=passable only with successful check 
	private boolean autoCheck;  //false=must Use
	private boolean party;      //true=run check on all party members, false= ? first member ?
	private boolean passAll;	//true=apply damage to all characters, false=only to failed
	private boolean bypassArmor;//true=armor is bypassed when calculating hit point damage
	
	private Integer startMessage;
	private Integer passMessage;
	private Integer failMessage;
	
	private Integer passNewActionClass;
	private Integer passNewAction;
	private Integer failNewActionClass;
	private Integer failNewAction;
	
	private boolean fixedModifier;
	private Integer modifierTarget;
	private Integer modifier;
	
	private List<Checkable> checks; //key=skillId, value=difficulty

	/**
	 * 
	 * @return true if passable always
	 */
	public boolean isPassable() {
		return passable;
	}
	public void setPassable(boolean passable) {
		this.passable = passable;
	}
	
	/**
	 * 
	 * @return true, if check is executed without explicite usage of Usable object (skill, att, item, ...)
	 */
	public boolean isAutoCheck() {
		return autoCheck;
	}
	public void setAutoCheck(boolean autoCheck) {
		this.autoCheck = autoCheck;
	}
	public boolean isParty() {
		return party;
	}
	public void setParty(boolean party) {
		this.party = party;
	}
	public boolean isPassAll() {
		return passAll;
	}
	public void setPassAll(boolean passAll) {
		this.passAll = passAll;
	}
	public boolean isBypassArmor() {
		return bypassArmor;
	}
	public void setBypassArmor(boolean bypassArmor) {
		this.bypassArmor = bypassArmor;
	}
	public Integer getStartMessage() {
		return startMessage;
	}
	public void setStartMessage(Integer startMessage) {
		this.startMessage = startMessage;
	}
	public Integer getPassMessage() {
		return passMessage;
	}
	public void setPassMessage(Integer passMessage) {
		this.passMessage = passMessage;
	}
	public Integer getFailMessage() {
		return failMessage;
	}
	public void setFailMessage(Integer failMessage) {
		this.failMessage = failMessage;
	}
	public Integer getPassNewActionClass() {
		return passNewActionClass;
	}
	public void setPassNewActionClass(Integer passNewActionClass) {
		this.passNewActionClass = passNewActionClass;
	}
	public Integer getPassNewAction() {
		return passNewAction;
	}
	public void setPassNewAction(Integer passNewAction) {
		this.passNewAction = passNewAction;
	}
	public boolean isFixedModifier() {
		return fixedModifier;
	}
	public void setFixedModifier(boolean fixedModifier) {
		this.fixedModifier = fixedModifier;
	}
	public Integer getModifierTarget() {
		return modifierTarget;
	}
	public void setModifierTarget(Integer modifierTarget) {
		this.modifierTarget = modifierTarget;
	}
	public Integer getModifier() {
		return modifier;
	}
	public void setModifier(Integer modifier) {
		this.modifier = modifier;
	}
	public void setFailNewAction(Integer failNewAction) {
		this.failNewAction = failNewAction;
	}
	public Integer getFailNewAction() {
		return failNewAction;
	}
	public void setFailNewActionClass(Integer failNewActionClass) {
		this.failNewActionClass = failNewActionClass;
	}
	public Integer getFailNewActionClass() {
		return failNewActionClass;
	}
	public void setChecks(List<Checkable> checks) {
		this.checks = checks;
	}
	/**
	 * 
	 * @return the checks to be executed
	 */
	public List<Checkable> getChecks() {
		return checks;
	}
}
