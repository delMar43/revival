package revival.gwt.client.service;

import java.util.List;

import revival.engine.tilebased.client.world.PositionData;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("gameStateService")
public interface GameStateServlet extends RemoteService {

	public List<PositionData> move(int mapNr, int xPos, int yPos);
}
