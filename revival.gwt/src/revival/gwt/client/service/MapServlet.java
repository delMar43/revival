package revival.gwt.client.service;

import revival.engine.tilebased.client.world.Location;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("mapService")
public interface MapServlet extends RemoteService {

	public Location loadLocation(String name);
}
