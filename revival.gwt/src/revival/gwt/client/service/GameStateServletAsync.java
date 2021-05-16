package revival.gwt.client.service;

import java.util.List;

import revival.engine.tilebased.client.world.PositionData;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GameStateServletAsync {

	public void move(int mapNr, int xPos, int yPos, AsyncCallback<List<PositionData>> callback);
}
