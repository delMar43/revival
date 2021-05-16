package revival.engine.tilebased.client.world.actiondata;


public class AttributeCheck extends AbstractCheck {

	private Integer attributeId;
	private Integer difficulty;
	
	public AttributeCheck() {
	}
	
	public AttributeCheck(Integer attributeId, Integer difficulty) {
		this.attributeId = attributeId;
		this.difficulty = difficulty;
	}
	
	public Integer getAttributeId() {
		return attributeId;
	}
	public Integer getDifficulty() {
		return difficulty;
	}
}
