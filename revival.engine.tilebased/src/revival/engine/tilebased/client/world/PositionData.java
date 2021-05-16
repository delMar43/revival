package revival.engine.tilebased.client.world;

import java.io.Serializable;

public class PositionData implements Serializable {

	private int mapNr;
	private int posX;
	private int posY;
	
	public int getMapNr() {
		return mapNr;
	}
	public void setMapNr(int mapNr) {
		this.mapNr = mapNr;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
}
