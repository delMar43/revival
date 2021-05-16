package revival.gwt.server;

import revival.gwt.client.service.SavegameServlet;
import revival.rules.Savegame;
import revival.server.SavegameRep;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class SavegameServletImpl extends RemoteServiceServlet implements SavegameServlet {
	
	private static SavegameRep savegameRep = new SavegameRep();
	
	static {
		savegameRep.loadFromXml();
	}
	
	@Override
	public Savegame loadSavegame() {
		return savegameRep.getSavegame();
	}
}
