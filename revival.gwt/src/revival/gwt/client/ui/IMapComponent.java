package revival.gwt.client.ui;

import revival.engine.tilebased.client.world.Location;
import revival.gwt.client.ui.keyhandler.AbstractKeyDownHandler;

public interface IMapComponent {

	public void drawMap(int colPos, int rowPos);
	
	public AbstractKeyDownHandler getKeyHandler();
}
