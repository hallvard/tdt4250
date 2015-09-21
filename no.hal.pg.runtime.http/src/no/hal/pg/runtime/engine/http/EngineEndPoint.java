package no.hal.pg.runtime.engine.http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import no.hal.pg.runtime.engine.IEngine;
import no.hal.pg.runtime.engine.IServiceExecutor;
import no.hal.pg.runtime.engine.ServiceExecutor;

@SuppressWarnings("serial")
public class EngineEndPoint extends HttpServlet {

	private IEngine engine;
	private IServiceExecutor serviceExecutor = new ServiceExecutor();
	
	public EngineEndPoint(IEngine engine) {
		this.engine = engine;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getPathInfo();
		if (path != null) {
			String[] segments = path.split("\\Q/\\E");
			serviceExecutor.init(engine.getGame());
			for (String segment : segments) {
				serviceExecutor.execute(segment, null);
			}
			Object[] result = serviceExecutor.getObjects();
			
		}
	}
}
