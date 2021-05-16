package revival.engine.tilebased.client.world.actiondata;

public class MembersCheck implements Checkable {

	private Integer value;
	
	public MembersCheck() {
	}
	
	public MembersCheck(Integer value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}
}
