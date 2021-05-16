package revival.engine.tilebased.client.world.actiondata;

import java.util.HashMap;
import java.util.Map;

public class EncounterData extends ActionData {

	private Integer visibleDistance;
	private Integer hitDistance;
	private Integer message;
	private boolean properName;
	private boolean friendly;
	private Integer newActionClass;
	private Integer newAction;
	private Map<Integer, EnemyData> enemyData = new HashMap<Integer, EnemyData>();

	public Integer getVisibleDistance() {
		return visibleDistance;
	}
	public void setVisibleDistance(Integer visibleDistance) {
		this.visibleDistance = visibleDistance;
	}
	public Integer getHitDistance() {
		return hitDistance;
	}
	public void setHitDistance(Integer hitDistance) {
		this.hitDistance = hitDistance;
	}
	public Integer getMessage() {
		return message;
	}
	public void setMessage(Integer message) {
		this.message = message;
	}
	public boolean isProperName() {
		return properName;
	}
	public void setProperName(boolean properName) {
		this.properName = properName;
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
	public void setFriendly(boolean friendly) {
		this.friendly = friendly;
	}
	public boolean isFriendly() {
		return friendly;
	}
	public void setEnemyData(Map<Integer, EnemyData> enemyData) {
		this.enemyData = enemyData;
	}
	public Map<Integer, EnemyData> getEnemyData() {
		return enemyData;
	}
}
