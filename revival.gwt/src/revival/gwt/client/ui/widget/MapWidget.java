package revival.gwt.client.ui.widget;

import revival.engine.tilebased.client.world.Location;
import revival.engine.tilebased.client.world.TileData;
import revival.engine.tilebased.client.world.actiondata.ActionData;
import revival.engine.tilebased.client.world.actiondata.EncounterData;
import revival.engine.tilebased.client.world.actiondata.LootData;
import revival.engine.tilebased.client.world.actiondata.MaskData;
import revival.gwt.client.ClientGameState;
import revival.gwt.client.ui.IMapComponent;
import revival.gwt.client.ui.keyhandler.MapKeyHandler;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Image;

public class MapWidget extends InteractiveWidget implements IMapComponent {

	private final int colView = 19;
	private final int rowView = 9;

	private AbsolutePanel panel;
	private Grid grid;
	private Image border;
	
	private boolean hasWidgets = false;
	private boolean playerDrawn = false;
	
	public MapWidget() {
		panel = new AbsolutePanel();
		panel.setWidth("608px");
		panel.setHeight("288px");
		
		grid = new Grid(rowView, colView);
		grid.setStylePrimaryName("revival-map");
		grid.setCellPadding(0);
		grid.setCellSpacing(0);
		panel.add(grid, 0, 0);
		
		border = images.borderMap().createImage();
		panel.add(border, 0, 0);
		
		keyHandler = new MapKeyHandler();
		
		initWidget(panel);
	}
	
	public void drawMap(int colPos, int rowPos) {
		if (hasWidgets) {
			grid.clear();
			hasWidgets = false;
			playerDrawn = false;
		}
		
		int halfCol = (colView-1) / 2;
		int startCol = colPos - halfCol;
		int endCol = colPos + halfCol +1;
		
		int halfRow = (rowView-1) / 2;
		int startRow = rowPos - halfRow;
		int endRow = rowPos + halfRow +1;
		
		int rendRow = 0;
		int rendCol;
		
		ClientGameState gameState = ClientGameState.getInstance();
		Location curLocation = gameState.getCurrentLocation();
		
		TileData mapData = curLocation.getTileData();
		int[][] map = mapData.getTiles();
		
		int tsNr = curLocation.getTileData().getTilesetNr();
		
		Integer backgroundTile;
		if (mapData.getBackgroundTile() != null) {
			backgroundTile = mapData.getBackgroundTile() - 10;
		} else {
			backgroundTile = null;
		}
		
		String oldStyle;
		String newStyle;
		ActionData actionData;
		boolean otherParty = false;
		int actionNr;
		for (int curRow = startRow; curRow < endRow; curRow++) {
			rendCol = 0;
			
			for (int curCol = startCol; curCol < endCol; curCol++) {
				Element td = grid.getCellFormatter().getElement(rendRow, rendCol);
				Integer tileNr = null;
				
				if (curRow < 0 || curCol < 0 || curRow >= mapData.getRows() || curCol >= mapData.getCols()) {
					tileNr = backgroundTile;
				} else {
					tileNr = map[curRow][curCol] -10;
					
					actionData = curLocation.getActionDataPos(curRow, curCol);
					otherParty = gameState.getOtherParty(curRow, curCol);
					if (actionData != null) {
						if (actionData instanceof LootData) {
							grid.setWidget(rendRow, rendCol, images.loot().createImage());
							hasWidgets = true;
						} else if (actionData instanceof EncounterData) {
							double aq = Math.pow(Math.abs(rowPos-curRow), 2);
							double bq = Math.pow(Math.abs(colPos-curCol), 2);
							double range = Math.sqrt(aq+bq) * 10;
							if (range <= 30) {
								grid.setWidget(rendRow, rendCol, images.animal().createImage());
								hasWidgets = true;
							}
						} else if (actionData instanceof MaskData) {
							tileNr = ((MaskData)actionData).getTile() -10;
						}
					}
					if (otherParty) {
						Log.debug("otherParty at x=" + rendCol + ", y=" + rendRow);
						grid.setWidget(rendRow, rendCol, images.humanoid().createImage());
						hasWidgets = true;
					}
				}
				
				String tile;
				if (tileNr == null) {
					td.getStyle().setProperty("backgroundImage", "none");
					rendCol++;
					continue;
				} else if (tileNr < 10) {
					tile = "00" + tileNr;
				} else if (tileNr < 100) {
					tile = "0" + tileNr;
				} else {
					tile = tileNr+"";
				}
				newStyle = "url(" + GWT.getModuleBaseURL() + "tileset/" + tsNr + "/" + tile + ".png)";
				
				td.getStyle().setProperty("backgroundImage", newStyle);
				
				rendCol++;
			}
			rendRow++;
		}
		
		//render player
		if (!playerDrawn) {
			grid.setWidget(halfRow, halfCol, images.player().createImage());
			playerDrawn = true;
		}
	}
}
