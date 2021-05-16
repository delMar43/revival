package revival.engine.tilebased.client.world.actiondata.special;

import revival.engine.tilebased.client.world.actiondata.SpecialData;

public class InfirmaryData extends SpecialData {
	
	private Integer healPrice;
	private Integer examinePrice;
	private Integer curePrice;

	public InfirmaryData() {
		super("doctor");
	}
	
	public Integer getHealPrice() {
		return healPrice;
	}
	public void setHealPrice(Integer healPrice) {
		this.healPrice = healPrice;
	}
	public Integer getExaminePrice() {
		return examinePrice;
	}
	public void setExaminePrice(Integer examinePrice) {
		this.examinePrice = examinePrice;
	}
	public Integer getCurePrice() {
		return curePrice;
	}
	public void setCurePrice(Integer curePrice) {
		this.curePrice = curePrice;
	}
}
