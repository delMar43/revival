package revival.engine.tilebased.client.world.actiondata;

public class ItemCheck extends AbstractCheck {

	private Integer value;
	
	public ItemCheck() {}
	
	public ItemCheck(Integer value) {
		this.value = value;
	}
	
	public void setValue(Integer value) {
		this.value = value;
	}
	public Integer getValue() {
		return value;
	}
}
