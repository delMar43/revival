package revival.engine.tilebased.client.world;

import java.io.Serializable;


/**
 * contains information about the optical layout of a location
 * 
 * @author martin
 *
 */
@SuppressWarnings("serial")
public class TileData implements Serializable {

	private int rows;
	private int cols;
	private int tilesetNr;
	private Integer backgroundTile;
	private int timeFactor;
	private Integer encounterFrequency;
	private Integer lastMonster;
	private Integer maxEncounters;
	
	private int[][] tiles;

	public TileData() {
	}
	
	public TileData(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		
		tiles = new int[rows][cols];
	}
	
	public int getRows() {
		return rows;
	}
	
	public int getCols() {
		return cols;
	}
	
	public void setTiles(int[][] tiles) {
		this.tiles = tiles;
	}
	
	public int[][] getTiles() {
		return tiles;
	}
	
	public void changeTile(int row, int col, int tileNr) {
		tiles[row][col] = tileNr;
	}

	public void setTilesetNr(int tilesetNr) {
		this.tilesetNr = tilesetNr;
	}
	public int getTilesetNr() {
		return tilesetNr;
	}
	public void setBackgroundTile(Integer backgroundTile) {
		this.backgroundTile = backgroundTile;
	}
	public Integer getBackgroundTile() {
		return backgroundTile;
	}

	public int getTimeFactor() {
		return timeFactor;
	}

	public void setTimeFactor(int timeFactor) {
		this.timeFactor = timeFactor;
	}

	public Integer getEncounterFrequency() {
		return encounterFrequency;
	}

	public void setEncounterFrequency(Integer encounterFrequency) {
		this.encounterFrequency = encounterFrequency;
	}

	public Integer getLastMonster() {
		return lastMonster;
	}

	public void setLastMonster(Integer lastMonster) {
		this.lastMonster = lastMonster;
	}

	public Integer getMaxEncounters() {
		return maxEncounters;
	}

	public void setMaxEncounters(Integer maxEncounters) {
		this.maxEncounters = maxEncounters;
	}
	
}
