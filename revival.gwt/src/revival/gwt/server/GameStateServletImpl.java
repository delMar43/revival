package revival.gwt.server;

import java.util.List;

import revival.engine.tilebased.client.world.PositionData;
import revival.gwt.client.service.GameStateServlet;
import revival.server.ServerGameState;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class GameStateServletImpl extends RemoteServiceServlet implements GameStateServlet {

	public List<PositionData> move(int mapNr, int xPos, int yPos) {
		String sessionId = this.getThreadLocalRequest().getSession().getId();
		ServerGameState.move(sessionId, mapNr, xPos, yPos);
		
		return ServerGameState.getPositions(mapNr);
	}
}
