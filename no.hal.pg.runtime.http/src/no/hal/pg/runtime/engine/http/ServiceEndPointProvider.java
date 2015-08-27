package no.hal.pg.runtime.engine.http;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.http.HttpService;

import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.engine.IEngine;
import no.hal.pg.runtime.engine.IServiceListener;

@Component
public class ServiceEndPointProvider implements IServiceListener {

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
		this.httpService = null;
	}
	
	@Override
	public void serviceActivated(IEngine engine, Service<?> service) {
		try {
			httpService.registerServlet(service.getClass().getName(), new ServiceEndPoint(service), null, null);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@Override
	public void serviceDeactivated(IEngine engine, Service<?> service) {
		try {
			httpService.unregister(service.getClass().getName());
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
