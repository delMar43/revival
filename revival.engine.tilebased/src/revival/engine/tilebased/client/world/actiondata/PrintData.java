package revival.engine.tilebased.client.world.actiondata;

import java.util.ArrayList;
import java.util.List;

public class PrintData extends ActionData {
	
	private Integer newActionClass;
	private Integer newAction;

	private List<Integer> messages;
	
	public PrintData() {
		messages = new ArrayList<Integer>();
	}
	
	public void addMessageNr(Integer nr) {
		messages.add(nr);
	}
	
	public List<Integer> getMessages() {
		return messages;
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
