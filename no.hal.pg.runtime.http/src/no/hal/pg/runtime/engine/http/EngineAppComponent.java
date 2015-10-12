package no.hal.pg.runtime.engine.http;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Dictionary;

import javax.servlet.http.HttpServlet;

import org.osgi.framework.BundleContext;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Deactivate;

public class EngineAppComponent implements IEngineAppComponent, ManagedService {

	private String name;
	private Collection<String> resourceNames;
	private String resourceFormat;
	private String aliasFormat;
	private String refreshServiceUrlPath;
	
	@Override
	public String getName() {
		return name;
	}

	private BundleContext bundleContext;

	@Activate
	public void activate(ComponentContext context) throws Exception {
		bundleContext = context.getBundleContext();
		configure(context.getProperties());
	}
	
	public void updated(Dictionary<String, ?> properties) throws ConfigurationException {
		configure(properties);
	}

	@Deactivate
	public void deactivate(ComponentContext context) throws Exception {
		bundleContext = null;
	}

	@Override
	public Collection<String> getResourceNames() {
		return (resourceNames != null ? resourceNames : Collections.<String>emptyList());
	}

	@Override
	public String getResourceFormat() {
		return resourceFormat;
	}
	
	@Override
	public String getAliasFormat() {
		return aliasFormat;
	}

	@Override
	public HttpServlet getAppServlet() {
		return null;
	}
	
	@Override
	public String getRefreshServiceUrlPath() {
		return refreshServiceUrlPath;
	}
	
	//

	protected void configure(Dictionary<String, ?> properties) {
		Object nameProperty = properties.get("IEngineApp.name");
		if (nameProperty != null) {
			name = String.valueOf(nameProperty);
		}
		Object resourceNamesProperty = properties.get("IEngineApp.resourceNames");
		if (resourceNamesProperty != null) {
			String[] resourceNames = String.valueOf(resourceNamesProperty).split(",");
			this.resourceNames = new ArrayList<String>(resourceNames.length);
			for (int i = 0; i < resourceNames.length; i++) {
				String resourceName = resourceNames[i].trim();
				this.resourceNames.add(resourceName);
			}
		}
		Object resourceFormatProperty = properties.get("IEngineApp.resourceFormat");
		if (resourceFormatProperty != null) {
			this.resourceFormat = String.valueOf(resourceFormatProperty);
		}
		Object aliasFormatProperty = properties.get("IEngineApp.aliasFormat");
		if (aliasFormatProperty != null) {
			this.aliasFormat = String.valueOf(aliasFormatProperty);
		}
		Object refreshServiceUrlPathProperty = properties.get("IEngineAppComponent.refreshServiceUrlPath");
		if (refreshServiceUrlPathProperty != null) {
			this.refreshServiceUrlPath = String.valueOf(refreshServiceUrlPathProperty);
		}
	}
	
	//
	
	public URL getResource(String name) {
		return (bundleContext != null ? bundleContext.getBundle().getResource(name) : null);
	}
}
