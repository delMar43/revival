package revival.engine.tilebased.client.world.actiondata;

public class AbstractCheck implements Checkable {

	private Integer newActionClass;
	private Integer newAction;
	
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
