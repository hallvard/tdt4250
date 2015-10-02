package no.hal.pg.runtime.engine.http;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;

import no.hal.pg.runtime.engine.IEngine;

@Component
public class EngineAppEndPointProvider extends EngineEndPointProvider {

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
	
	private Collection<IEngineApp> engineApps = new ArrayList<IEngineApp>();
	
	@Reference(
			cardinality=ReferenceCardinality.MULTIPLE,
			policy=ReferencePolicy.DYNAMIC,
			unbind="removeEngineApp"
			)
	protected synchronized void addEngineApp(IEngineApp engineApp) {
		engineApps.add(engineApp);
	}
	
	protected synchronized void removeEngine(IEngineApp engineApp) {
		engineApps.add(engineApp);
	}
	
	@Override
	protected void registerEngineEndPoints(HttpService httpService, IEngine engine, String engineAlias) throws ServletException, NamespaceException {
		for (IEngineApp engineApp : engineApps) {
			String aliasPrefix = engineAlias + "/app";
			HttpServlet servlet = engineApp.getAppServlet();
			String appAlias = aliasPrefix + "/" + engineApp.getName();
			if (servlet != null) {
				getHttpService().registerServlet(appAlias, new EngineDataServlet(engine), null, null);
			}
			for (String resourceName : engineApp.getResourceNames()) {
				getHttpService().registerResources(appAlias + resourceName, resourceName, null);
			}
			if (engineApp instanceof IEngineAppComponent) {
				String refreshServiceUrlPath = ((IEngineAppComponent) engineApp).getRefreshServiceUrlPath();
				String appDataAlias = aliasPrefix + "-data/" + engineApp.getName();
				ForwardingServlet forwardingServlet = new ForwardingServlet();
				forwardingServlet.setTargetPath(engineAlias + "/data" + refreshServiceUrlPath);
				getHttpService().registerServlet(appDataAlias, forwardingServlet, null, null);
			}
		}
	}

	@Override
	protected void unregisterEngineEndPoints(HttpService httpService, IEngine engine, String engineAlias) {
		for (IEngineApp engineApp : engineApps) {
			String aliasPrefix = engineAlias + "/app";
			String appAlias = aliasPrefix + "/" + engineApp.getName();
			try {
				getHttpService().unregister(appAlias);
			} catch (Exception e) {
			}
			for (String resourceName : engineApp.getResourceNames()) {
				try {
					getHttpService().unregister(appAlias + resourceName);
				} catch (Exception e) {
				}
			}
		}
	}
}
