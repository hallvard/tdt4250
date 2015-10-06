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

	private ISerializer serializer;
	
	@Reference(
			cardinality=ReferenceCardinality.MANDATORY,
			policy=ReferencePolicy.DYNAMIC,
			unbind="unsetSerializer"
			)
	public synchronized void setSerializer(ISerializer serializer) {
		this.serializer = serializer;
	}
	public synchronized void unsetSerializer(ISerializer serializer) {
		this.serializer = null;
	}

	//

	@Reference(
			cardinality=ReferenceCardinality.MANDATORY,
			policy=ReferencePolicy.DYNAMIC,
			unbind="unsetHttpService"
	)
	public synchronized void setHttpService(HttpService httpService) {
		super.setHttpService(httpService);
	}
	public synchronized void unsetHttpService(HttpService httpService) {
		super.unsetHttpService(httpService);
	}

	@Override
	protected void registerEngineEndPoints(HttpService httpService, IEngine engine, String engineAlias) throws ServletException, NamespaceException {
		getHttpService().registerServlet(engineAlias + "/data", new EngineDataServlet(engine, serializer), null, null);
	}

	@Override
	protected void unregisterEngineEndPoints(HttpService httpService, IEngine engine, String engineAlias) {
		getHttpService().unregister(engineAlias + "/data");
	}
}
