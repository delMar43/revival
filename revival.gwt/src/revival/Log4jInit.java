package revival;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.PropertyConfigurator;


public class Log4jInit extends HttpServlet {

	@Override
	public void init() throws ServletException {
		super.init();
		
        String prefix = getServletContext().getRealPath("/");
        String file = getInitParameter("log4j-init-file");
        if (file != null) {
            PropertyConfigurator.configure(prefix+file);
            Log log = LogFactory.getLog(getClass());
            log.info("Log4J initialized successfully");
        }
	}
	
}
