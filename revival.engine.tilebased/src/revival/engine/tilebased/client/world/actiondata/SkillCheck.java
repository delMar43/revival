package revival.engine.tilebased.client.world.actiondata;

public class SkillCheck extends AbstractCheck {

	private Integer skillId;
	private Integer difficulty;
	
	public SkillCheck() {
	}
	
	public SkillCheck(Integer skillId, Integer difficulty) {
		this.skillId = skillId;
		this.difficulty = difficulty;
	}
	
	public Integer getDifficulty() {
		return difficulty;
	}
	public Integer getSkillId() {
		return skillId;
	}

}
