package no.hal.pg.runtime.engine.http;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.ecore.EObject;

import no.hal.pg.runtime.engine.IEngine;
import no.hal.pg.runtime.engine.IServiceExecutor;

@SuppressWarnings("serial")
public class EngineAppServlet extends HttpServlet {

	private final IEngine engine;
	private final Collection<IEngineApp> engineApps = new ArrayList<IEngineApp>();
	
	public EngineAppServlet(IEngine engine, IEngineApp... engineApps) {
		this.engine = engine;
		this.engineApps.addAll(Arrays.asList(engineApps));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IServiceExecutor serviceExecutor = engine.getServiceExecutor();
		synchronized (serviceExecutor) {
			serviceExecutor.init(engine.getGame());
			DataServletHelper helper = new DataServletHelper(serviceExecutor);
			if (helper.executeSegments(req)) {
				Object[] result = serviceExecutor.getObjects();
				for (Object object : result) {
					if (object instanceof EObject) {
						EObject eObject = (EObject) object;
						for (IEngineApp engineApp : engineApps) {
							if (engineApp.isAppFor(eObject)) {
								resp.sendRedirect(getAppLocation(req, engineApp));
								return;
							}
						}
					}
				}
			}
		}
	}

	protected String getAppLocation(HttpServletRequest req, IEngineApp engineApp) {
		String servletPath = req.getServletPath(), path = req.getPathInfo();
		return servletPath + "/" + engineApp.getName() + "?" + servletPath + "/../data" + path;
	}
}
