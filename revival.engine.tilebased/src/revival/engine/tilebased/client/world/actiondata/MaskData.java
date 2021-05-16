package revival.engine.tilebased.client.world.actiondata;

public class MaskData extends ActionData {

	private int tile;
	private boolean impassable;
	private Integer message;
	
	public int getTile() {
		return tile;
	}
	public void setTile(int tile) {
		this.tile = tile;
	}
	public boolean isImpassable() {
		return impassable;
	}
	public void setImpassable(boolean impassable) {
		this.impassable = impassable;
	}
	public Integer getMessage() {
		return message;
	}
	public void setMessage(Integer message) {
		this.message = message;
	}
}
