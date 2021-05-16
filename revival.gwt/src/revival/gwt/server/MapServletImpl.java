package revival.gwt.server;

import java.io.File;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import revival.engine.tilebased.client.world.Location;
import revival.gwt.client.service.MapServlet;
import revival.server.MapRepository;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class MapServletImpl extends RemoteServiceServlet implements MapServlet {
	private static final Log log = LogFactory.getLog(MapServletImpl.class);
	
	private static MapRepository mr = new MapRepository();
	
	@Override
	public Location loadLocation(String name) {
		if (log.isDebugEnabled()) {
			File f = new File(".");
			log.debug("current path: " + f.getAbsolutePath());
		}
		Location result = mr.loadFromXml(name);
//		Location result = mr.loadHardcoded();
		
		return result;
	}
}
