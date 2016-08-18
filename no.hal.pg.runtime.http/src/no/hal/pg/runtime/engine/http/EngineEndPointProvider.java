package no.hal.pg.runtime.engine.http;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.Servlet;

import org.osgi.service.http.HttpContext;
import org.osgi.service.http.HttpService;

import no.hal.pg.runtime.engine.IEngine;

public abstract class EngineEndPointProvider {

	private Collection<IEngine> engines = new ArrayList<IEngine>();

	protected synchronized void addEngine(IEngine engine) {
		registerEngineEndPoints(engine);
		this.engines.add(engine);
	}

	protected synchronized void removeEngine(IEngine engine) {
		if (registeredEngines.contains(engine)) {
			unregisterEngineEndPoint(engine);
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
			unregisterEngineEndPoint(engine);
		}
		this.httpService = null;
	}

	private Collection<IEngine> registeredEngines = new ArrayList<IEngine>();

	protected void registerEngineEndPoints(IEngine engine) {
		if (httpService != null && (! registeredEngines.contains(engine))) {
			String alias = getAlias(engine);
			try {
				registerEngineEndPoints(engine, "/pg" + alias);
				registeredEngines.add(engine);
			} catch (Exception e) {
				System.err.println("Couldn't register engine end points @ " + alias + ": " + e);
			}
		}
	}

	private Map<IEngine, Collection<String>> engineAliases = new HashMap<IEngine, Collection<String>>();

	protected Collection<String> getEngineAliases(IEngine engine) {
		Collection<String> aliases = engineAliases.get(engine);
		if (aliases == null) {
			aliases = new ArrayList<String>();
			engineAliases.put(engine, aliases);
		}
		return aliases;
	}
	
	protected void registerEngineAlias(IEngine engine, String alias) {
		Collection<String> aliases = engineAliases.get(engine);
		if (aliases == null) {
			aliases = new ArrayList<String>();
			engineAliases.put(engine, aliases);
		}
		if (! aliases.contains(alias)) {
			aliases.add(alias);
		}
	}

	protected void registerEngineServlet(IEngine engine, String alias, Servlet servlet, Dictionary<?, ?> props, HttpContext context) {
		try {
			getHttpService().registerServlet(alias, servlet, props, context);
			registerEngineAlias(engine, alias);
		} catch (Exception e) {
		}
	}
	protected void registerEngineServlet(IEngine engine, String alias, Servlet servlet) {
		registerEngineServlet(engine, alias, servlet, null, null);
	}

	protected abstract void registerEngineEndPoints(IEngine engine, String engineAlias) throws Exception;

	protected void unregisterEngineEndPoint(IEngine engine) {
		if (httpService != null) {
			Collection<String> aliases = engineAliases.get(engine);
			if (aliases != null) {
				Iterator<String> it = aliases.iterator();
				while (it.hasNext()) {
					String alias = it.next();
					try {
						it.remove();
						httpService.unregister(alias);
					} catch (Exception e) {
						System.err.println("Couldn't unregister engine end points @ " + alias + ": " + e);
					}
				}
			}
			registeredEngines.remove(engine);
		}
	}

	protected String getAlias(IEngine engine) {
		return "/" + engine.getKey();
	}
}
