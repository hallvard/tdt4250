package no.hal.pg.runtime.engine.http;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.http.HttpContext;
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
	public synchronized void addEngineApp(IEngineApp engineApp) {
		engineApps.add(engineApp);
	}
	public synchronized void removeEngineApp(IEngineApp engineApp) {
		engineApps.remove(engineApp);
	}
	
	@Override
	protected void registerEngineEndPoints(final HttpService httpService, IEngine engine, String engineAlias) throws ServletException, NamespaceException {
		String aliasPrefix = engineAlias + "/app";
		httpService.registerServlet(aliasPrefix, new EngineAppServlet(engine, engineApps.toArray(new IEngineApp[engineApps.size()])), null, null);
		for (final IEngineApp engineApp : engineApps) {
			HttpContext httpContext = new EngineAppHttpContext(engineApp, httpService.createDefaultHttpContext());
			HttpServlet servlet = engineApp.getAppServlet();
			String appAlias = aliasPrefix + "/" + engineApp.getName();
			if (servlet != null) {
				httpService.registerServlet(appAlias, servlet, null, httpContext);
			}
			for (Map.Entry<String, String> resourceAlias : engineApp.getResourceAliasMapping().entrySet()) {
				String alias = resourceAlias.getKey();
				if (alias.equals(engineApp.getName())) {
					ForwardingServlet forwardingServlet = new ForwardingServlet();
					String forwardPath = resourceAlias.getValue();
					forwardingServlet.setTargetPath(appAlias + forwardPath);
					forwardingServlet.setRedirect(true);
					httpService.registerServlet(appAlias, forwardingServlet, null, httpContext);
				} else {
					httpService.registerResources(appAlias + alias, resourceAlias.getValue(), httpContext);
				}
			}
		}
	}

	@Override
	protected void unregisterEngineEndPoints(HttpService httpService, IEngine engine, String engineAlias) {
		String aliasPrefix = engineAlias + "/app";
		try {
			httpService.unregister(aliasPrefix);
		} catch (Exception e) {
		}
		for (IEngineApp engineApp : engineApps) {
			String appAlias = aliasPrefix + "/" + engineApp.getName();
			try {
				httpService.unregister(appAlias);
			} catch (Exception e) {
			}
			for (Map.Entry<String, String> resourceAlias : engineApp.getResourceAliasMapping().entrySet()) {
				try {
					httpService.unregister(resourceAlias.getKey());
				} catch (Exception e) {
				}
			}
		}
	}
}
