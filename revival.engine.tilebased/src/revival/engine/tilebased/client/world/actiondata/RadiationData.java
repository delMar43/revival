package revival.engine.tilebased.client.world.actiondata;

public class RadiationData extends ActionData {

	private boolean ignoreArmor;
	private Integer message;
	private Integer damage;

	public boolean isIgnoreArmor() {
		return ignoreArmor;
	}
	public void setIgnoreArmor(boolean ignoreArmor) {
		this.ignoreArmor = ignoreArmor;
	}
	public Integer getMessage() {
		return message;
	}
	public void setMessage(Integer message) {
		this.message = message;
	}
	public Integer getDamage() {
		return damage;
	}
	public void setDamage(Integer damage) {
		this.damage = damage;
	}
}
