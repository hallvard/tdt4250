package no.hal.pg.runtime.engine.http;

import javax.servlet.ServletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;

import no.hal.pg.runtime.engine.IEngine;

@Component
public class EngineDataEndPointProvider extends EngineEndPointProvider {

	@Reference(
			cardinality=ReferenceCardinality.MULTIPLE,
			policy=ReferencePolicy.DYNAMIC,
			unbind="removeEngine"
			)
	@Override
	public synchronized void addEngine(IEngine engine) {
		super.addEngine(engine);
	}
	@Override
	public synchronized void removeEngine(IEngine engine) {
		super.removeEngine(engine);
	}
	
	@Override
	protected void registerEngineEndPoints(HttpService httpService, IEngine engine, String engineAlias) throws ServletException, NamespaceException {
		getHttpService().registerServlet(engineAlias + "/data", new EngineDataServlet(engine), null, null);
	}

	@Override
	protected void unregisterEngineEndPoints(HttpService httpService, IEngine engine, String engineAlias) {
		getHttpService().unregister(engineAlias + "/data");
	}
}
