package revival.engine.tilebased.client.world.actiondata;

import java.util.List;

public class AlterationData extends ActionData {

	private Integer newActionClass;
	private Integer newAction;
	private List<Alter> alterations;

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
	public List<Alter> getAlterations() {
		return alterations;
	}
	public void setAlterations(List<Alter> alterations) {
		this.alterations = alterations;
	}
}
