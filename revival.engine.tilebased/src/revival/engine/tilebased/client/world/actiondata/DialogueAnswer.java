package revival.engine.tilebased.client.world.actiondata;

import java.io.Serializable;

public class DialogueAnswer implements Serializable {

	private Integer message;
	private Integer newActionClass;
	private Integer newAction;
	
	public Integer getMessage() {
		return message;
	}
	public void setMessage(Integer message) {
		this.message = message;
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
