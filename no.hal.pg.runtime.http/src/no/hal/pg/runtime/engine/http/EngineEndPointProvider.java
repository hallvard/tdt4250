package no.hal.pg.runtime.engine.http;

import java.util.ArrayList;
import java.util.Collection;

import org.osgi.service.http.HttpService;

import no.hal.pg.runtime.engine.IEngine;

public abstract class EngineEndPointProvider {

	private Collection<IEngine> engines = new ArrayList<IEngine>();
	
	protected synchronized void addEngine(IEngine engine) {
		registerEngineEndPoints(httpService, engine);
		this.engines.add(engine);
	}
	
	protected synchronized void removeEngine(IEngine engine) {
		if (registeredEngines.contains(engine)) {
			unregisterEngineEndPoint(httpService, engine);
		}
		this.engines.remove(engine);
	}

	private HttpService httpService;
	
	protected HttpService getHttpService() {
		return httpService;
	}

	protected synchronized void setHttpService(HttpService httpService) {
		this.httpService = httpService;
	}

	protected synchronized void unsetHttpService(HttpService httpService) {
		for (IEngine engine : registeredEngines) {
			unregisterEngineEndPoint(httpService, engine);
		}
		this.httpService = null;
	}
	
	private Collection<IEngine> registeredEngines = new ArrayList<IEngine>();
	
	protected void registerEngineEndPoints(HttpService httpService, IEngine engine) {
		if (httpService != null && (! registeredEngines.contains(engine))) {
			String alias = getAlias(engine);
			try {
				registerEngineEndPoints(httpService, engine, alias);
				registeredEngines.add(engine);
			} catch (Exception e) {
				System.err.println("Couldn't register engine end points @ " + alias + ": " + e);
			}
		}
	}

	protected abstract void registerEngineEndPoints(HttpService httpService, IEngine engine, String engineAlias) throws Exception;
	
	protected void unregisterEngineEndPoint(HttpService httpService, IEngine engine) {
		if (httpService != null) {
			String alias = getAlias(engine);
			try {
				unregisterEngineEndPoints(httpService, engine, alias);
				registeredEngines.remove(engine);
			} catch (Exception e) {
				System.err.println("Couldn't unregister engine end points @ " + alias + ": " + e);
			}
		}
	}

	protected abstract void unregisterEngineEndPoints(HttpService httpService, IEngine engine, String engineAlias) throws Exception;

	protected String getAlias(IEngine engine) {
		return "/" + engine.getKey();
	}
}
