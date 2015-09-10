package no.hal.pg.runtime.engine.http;

import java.util.ArrayList;
import java.util.Collection;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.http.HttpService;

import no.hal.pg.runtime.engine.IEngine;

@Component
public class EngineEndPointProvider {
	
	private Collection<IEngine> engines = new ArrayList<IEngine>();
	
	@Reference(
			cardinality=ReferenceCardinality.MULTIPLE,
			policy=ReferencePolicy.DYNAMIC,
			unbind="removeEngine"
			)
	public synchronized void addEngine(IEngine engine) {
		registerEngineEndPoint(httpService, engine);
		this.engines.add(engine);
	}
	
	public synchronized void removeEngine(IEngine engine) {
		if (registeredEngines.contains(engine)) {
			unregisterEngineEndPoint(httpService, engine);
		}
		this.engines.remove(engine);		
	}

	private HttpService httpService;
	
	@Reference(
			cardinality=ReferenceCardinality.MANDATORY,
			policy=ReferencePolicy.DYNAMIC,
			unbind="unsetHttpService"
	)
	public synchronized void setHttpService(HttpService httpService) {
		this.httpService = httpService;
	}

	public synchronized void unsetHttpService(HttpService httpService) {
		for (IEngine engine : registeredEngines) {
			unregisterEngineEndPoint(httpService, engine);
		}
		this.httpService = null;
	}
	
	private Collection<IEngine> registeredEngines = new ArrayList<IEngine>();
	
	protected void registerEngineEndPoint(HttpService httpService, IEngine engine) {
		if (httpService != null && (! registeredEngines.contains(engine))) {
			try {
				httpService.registerServlet(getAlias(engine), new EngineEndPoint(engine), null, null);
				registeredEngines.add(engine);
			} catch (Exception e) {
			}
		}
	}
	
	protected void unregisterEngineEndPoint(HttpService httpService, IEngine engine) {
		if (httpService != null) {
			httpService.unregister(getAlias(engine));
			registeredEngines.remove(engine);
		}
	}

	protected String getAlias(IEngine engine) {
		return engine.getKey();
	}
}
