package no.hal.pg.runtime.engine.http;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Dictionary;

import javax.servlet.http.HttpServlet;

import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Deactivate;

public class EngineAppComponent implements IEngineAppComponent, ManagedService {

	private String name;
	private Collection<String> resourceNames;
	private String refreshServiceUrlPath;
	
	@Override
	public String getName() {
		return name;
	}

	@Activate
	public void activate(ComponentContext context) throws Exception {
		configure(context.getProperties());
	}
	
	public void updated(Dictionary<String, ?> properties) throws ConfigurationException {
		configure(properties);
	}

	@Deactivate
	public void deactivate(ComponentContext context) throws Exception {
	}

	@Override
	public Collection<String> getResourceNames() {
		return (resourceNames != null ? resourceNames : Collections.<String>emptyList());
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
		Object resourceNameFolderProperty = properties.get("EngineAppComponent.resourceFolder");
		if (resourceNamesProperty != null) {
			String[] resourceNames = String.valueOf(resourceNamesProperty).split(",");
			this.resourceNames = new ArrayList<String>(resourceNames.length);
			for (int i = 0; i < resourceNames.length; i++) {
				String resourceName = resourceNames[i].trim();
				if (resourceNameFolderProperty != null && (! resourceName.startsWith("/"))) {
					resourceName = resourceNameFolderProperty + "/" + resourceName;
				}
				this.resourceNames.add(resourceName);
			}
		}
		Object refreshServiceUrlPathProperty = properties.get("IEngineAppComponent.refreshServiceUrlPath");
		if (refreshServiceUrlPathProperty != null) {
			this.refreshServiceUrlPath = String.valueOf(refreshServiceUrlPathProperty);
		}
	}
}
