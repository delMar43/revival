package revival.server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import revival.engine.tilebased.client.world.PositionData;

public class ServerGameState {
	private static final Log log = LogFactory.getLog(ServerGameState.class);
	
	private static Map<String, PositionData> positions = new HashMap<String, PositionData>();
	
	public static void move(String sessionId, int mapNr, int x, int y) {
		log.debug("session " + sessionId + " moves to x=" + x + ", y=" + y + " on map " + mapNr);
		
		PositionData p = positions.get(sessionId);
		if (p == null) {
			p = new PositionData();
			positions.put(sessionId, p);
		}
		p.setMapNr(mapNr);
		p.setPosX(x);
		p.setPosY(y);
	}
	
	public static List<PositionData> getPositions(int mapNr) {
		List<PositionData> result = new ArrayList<PositionData>();
		
		for (PositionData pd : positions.values()) {
			if (pd.getMapNr() == mapNr) {
				result.add(pd);
			}
		}
		
		return result;
	}
}
