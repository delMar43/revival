package revival.gwt.client.service;

import revival.engine.tilebased.client.world.Location;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MapServletAsync {
	
	void loadLocation(String name, AsyncCallback<Location> callback);
}
