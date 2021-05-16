package revival.engine.tilebased.client.world.actiondata;

public class TransitionData extends ActionData {

	private boolean confirm;
	private int messageNr;
	private Integer targetX;
	private Integer targetY;
	private Integer targetMap;
	private boolean relative;
	private Integer newActionClass;
	private Integer newAction;

	public boolean isConfirm() {
		return confirm;
	}
	public void setConfirm(boolean confirm) {
		this.confirm = confirm;
	}
	public int getMessageNr() {
		return messageNr;
	}
	public void setMessageNr(int messageNr) {
		this.messageNr = messageNr;
	}
	public Integer getTargetX() {
		return targetX;
	}
	public void setTargetX(Integer targetX) {
		this.targetX = targetX;
	}
	public Integer getTargetY() {
		return targetY;
	}
	public void setTargetY(Integer targetY) {
		this.targetY = targetY;
	}
	public Integer getTargetMap() {
		return targetMap;
	}
	public void setTargetMap(Integer targetMap) {
		this.targetMap = targetMap;
	}
	public boolean isRelative() {
		return relative;
	}
	public void setRelative(boolean relative) {
		this.relative = relative;
	}
	public Integer getNewActionClass() {
		return newActionClass;
	}
	public void setNewActionClass(Integer newActionClass) {
		this.newActionClass = newActionClass;
	}
	public Integer getNewAction() {
		return newAction;
	}
	public void setNewAction(Integer newAction) {
		this.newAction = newAction;
	}
}
