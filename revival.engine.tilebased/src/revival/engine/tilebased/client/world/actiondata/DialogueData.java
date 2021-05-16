package revival.engine.tilebased.client.world.actiondata;

import java.util.List;

public class DialogueData extends ActionData {

	private boolean menu;
	private Integer message;
	private Integer otherNewActionClass;
	private Integer otherNewAction;
	private Integer cancelNewActionClass;
	private Integer cancelNewAction;
	private List<DialogueAnswer> answers;

	public boolean isMenu() {
		return menu;
	}
	public void setMenu(boolean menu) {
		this.menu = menu;
	}
	public Integer getMessage() {
		return message;
	}
	public void setMessage(Integer message) {
		this.message = message;
	}
	public Integer getOtherNewActionClass() {
		return otherNewActionClass;
	}
	public void setOtherNewActionClass(Integer otherNewActionClass) {
		this.otherNewActionClass = otherNewActionClass;
	}
	public Integer getOtherNewAction() {
		return otherNewAction;
	}
	public void setOtherNewAction(Integer otherNewAction) {
		this.otherNewAction = otherNewAction;
	}
	public Integer getCancelNewActionClass() {
		return cancelNewActionClass;
	}
	public void setCancelNewActionClass(Integer cancelNewActionClass) {
		this.cancelNewActionClass = cancelNewActionClass;
	}
	public Integer getCancelNewAction() {
		return cancelNewAction;
	}
	public void setCancelNewAction(Integer cancelNewAction) {
		this.cancelNewAction = cancelNewAction;
	}
	public List<DialogueAnswer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<DialogueAnswer> answers) {
		this.answers = answers;
	}
}
