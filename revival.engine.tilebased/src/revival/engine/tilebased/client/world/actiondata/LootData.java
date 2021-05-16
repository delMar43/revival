package revival.engine.tilebased.client.world.actiondata;

import java.util.Map;

public class LootData extends ActionData {

	private Integer newActionClass;
	private Integer newAction;
	private Map<Integer, Integer> items; //key=itemId, value=quantity
	private Integer randomMoney;
	
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
	public void setItems(Map<Integer, Integer> items) {
		this.items = items;
	}
	public Map<Integer, Integer> getItems() {
		return items;
	}
	public void setRandomMoney(Integer randomMoney) {
		this.randomMoney = randomMoney;
	}
	public Integer getRandomMoney() {
		return randomMoney;
	}
	
}
