package revival.engine.tilebased.client.world.actiondata;

import java.io.Serializable;

public abstract class ActionData implements Serializable {

	protected int id;

	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
}
