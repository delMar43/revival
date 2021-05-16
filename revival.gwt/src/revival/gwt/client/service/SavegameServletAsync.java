package revival.gwt.client.service;

import revival.rules.Savegame;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface SavegameServletAsync {

	void loadSavegame(AsyncCallback<Savegame> callback);

}
