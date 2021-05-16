package revival.engine.tilebased.client.world.actiondata;

import java.io.Serializable;

public class EnemyData implements Serializable {

	private Integer monster;
	private Integer maxGroupSize;
	private boolean random;

	public Integer getMonster() {
		return monster;
	}
	public void setMonster(Integer monster) {
		this.monster = monster;
	}
	public Integer getMaxGroupSize() {
		return maxGroupSize;
	}
	public void setMaxGroupSize(Integer maxGroupSize) {
		this.maxGroupSize = maxGroupSize;
	}
	public boolean isRandom() {
		return random;
	}
	public void setRandom(boolean random) {
		this.random = random;
	}
}
