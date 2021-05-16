package revival.gwt.client.service;

import revival.rules.Savegame;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("savegameService")
public interface SavegameServlet extends RemoteService {

	public Savegame loadSavegame();
}
