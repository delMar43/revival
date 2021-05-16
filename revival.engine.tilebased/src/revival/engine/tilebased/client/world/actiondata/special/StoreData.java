package revival.engine.tilebased.client.world.actiondata.special;

import java.util.ArrayList;
import java.util.List;

import revival.engine.tilebased.client.world.actiondata.SpecialData;

public class StoreData extends SpecialData {

	private Integer sellFactor;
	private Integer itemList;
	private List<Integer> itemTypes;
	
	public StoreData() {
		super("store");
		itemTypes = new ArrayList<Integer>();
	}
	
	public Integer getSellFactor() {
		return sellFactor;
	}
	public void setSellFactor(Integer sellFactor) {
		this.sellFactor = sellFactor;
	}
	public Integer getItemList() {
		return itemList;
	}
	public void setItemList(Integer itemList) {
		this.itemList = itemList;
	}
	public List<Integer> getItemTypes() {
		return itemTypes;
	}
	public void setItemTypes(List<Integer> itemTypes) {
		this.itemTypes = itemTypes;
	}
	public void addItemType(Integer itemType) {
		itemTypes.add(itemType);
	}
}
