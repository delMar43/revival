package revival.engine.tilebased.client.world.actiondata;

public class SpecialData extends ActionData {
	
	protected String name;
	protected String type;
	protected Integer messageNr;
	protected Integer newActionClass;
	protected Integer newAction;

	public SpecialData(){}
	
	public SpecialData(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public Integer getMessageNr() {
		return messageNr;
	}
	public void setMessageNr(Integer messageNr) {
		this.messageNr = messageNr;
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
