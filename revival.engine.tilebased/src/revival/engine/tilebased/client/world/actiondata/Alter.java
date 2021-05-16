package revival.engine.tilebased.client.world.actiondata;

import java.io.Serializable;

public class Alter implements Serializable {

	private boolean relative;
	private Integer x;
	private Integer y;
	private Integer newActionClass;
	private Integer newAction;
	private Integer unknown;
	
	public boolean isRelative() {
		return relative;
	}
	public void setRelative(boolean relative) {
		this.relative = relative;
	}
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
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
	public Integer getUnknown() {
		return unknown;
	}
	public void setUnknown(Integer unknown) {
		this.unknown = unknown;
	}
}
