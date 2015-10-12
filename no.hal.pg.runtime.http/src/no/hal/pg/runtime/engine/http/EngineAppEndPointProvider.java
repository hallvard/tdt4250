package no.hal.pg.runtime.engine.http;

import java.util.ArrayList;
import java.util.Collection;

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
		for (final IEngineApp engineApp : engineApps) {
			HttpContext httpContext = new EngineAppHttpContext(engineApp, httpService.createDefaultHttpContext());
			String aliasPrefix = engineAlias + "/app";
			HttpServlet servlet = engineApp.getAppServlet();
			String appAlias = aliasPrefix + "/" + engineApp.getName();
			if (servlet != null) {
				httpService.registerServlet(appAlias, servlet, null, httpContext);
			}
			for (String resourceName : engineApp.getResourceNames()) {
				registerAppResource(httpService, engineApp, resourceName, appAlias, httpContext);
			}
			if (engineApp instanceof IEngineAppComponent) {
				String refreshServiceUrlPath = ((IEngineAppComponent) engineApp).getRefreshServiceUrlPath();
				if (refreshServiceUrlPath == null) {
					refreshServiceUrlPath = "/";
				}
				String appDataAlias = aliasPrefix + "-data/" + engineApp.getName();
				ForwardingServlet forwardingServlet = new ForwardingServlet();
				String forwardPath = engineAlias + "/data" + refreshServiceUrlPath;
				forwardingServlet.setTargetPath(forwardPath);
				httpService.registerServlet(appDataAlias, forwardingServlet, null, httpContext);
			}
		}
	}

	protected void registerAppResource(HttpService httpService, IEngineApp engineApp, String resourceName, String appAlias, HttpContext httpContext) throws ServletException, NamespaceException {
		String resourceAlias = appAlias + getAppResourceAlias(engineApp, resourceName);
		String resourceFormat = engineApp.getResourceFormat();
		if (resourceFormat != null && (! resourceName.startsWith("/"))) {
			resourceName = String.format(resourceFormat, resourceName);
		}
		httpService.registerResources(resourceAlias, resourceName, httpContext);
	}
	
	protected String getAppResourceAlias(IEngineApp engineApp, String resourceName) throws ServletException, NamespaceException {
		String aliasFormat = engineApp.getAliasFormat();
		String resourceAlias = resourceName;
		if (aliasFormat != null) {
			resourceAlias = String.format(aliasFormat, resourceName);
		}
		if (! resourceAlias.startsWith("/")) {
			resourceAlias = "/" + resourceAlias;
		}
		return resourceAlias;
	}
	
	@Override
	protected void unregisterEngineEndPoints(HttpService httpService, IEngine engine, String engineAlias) {
		for (IEngineApp engineApp : engineApps) {
			String aliasPrefix = engineAlias + "/app";
			String appAlias = aliasPrefix + "/" + engineApp.getName();
			try {
				httpService.unregister(appAlias);
			} catch (Exception e) {
			}
			for (String resourceName : engineApp.getResourceNames()) {
				try {
					httpService.unregister(appAlias + getAppResourceAlias(engineApp, resourceName));
				} catch (Exception e) {
				}
			}
			try {
				httpService.unregister(aliasPrefix + "-data/" + engineApp.getName());
			} catch (Exception e) {
			}
		}
	}
}
