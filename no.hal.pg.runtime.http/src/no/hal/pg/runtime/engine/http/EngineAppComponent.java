package no.hal.pg.runtime.engine.http;

import java.net.URL;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.framework.BundleContext;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Deactivate;

public class EngineAppComponent implements IEngineAppComponent, ManagedService {

	private String name;
	private EClass eClass;
	private Map<String, String> resourceAliasMapping = new HashMap<String, String>();
//	private String refreshServiceUrlPath;
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public boolean isAppFor(EObject eObject) {
		return (eClass != null && eClass.isInstance(eObject));
	}

	private BundleContext bundleContext;

	@Activate
	public void activate(ComponentContext context) throws Exception {
		bundleContext = context.getBundleContext();
		configure(context.getProperties());
	}
	
	@Override
	public void updated(Dictionary<String, ?> properties) throws ConfigurationException {
		configure(properties);
	}

	@Deactivate
	public void deactivate(ComponentContext context) throws Exception {
		bundleContext = null;
	}

	@Override
	public Map<String, String> getResourceAliasMapping() {
		return resourceAliasMapping;
	}

	@Override
	public HttpServlet getAppServlet() {
		return null;
	}
	
	//

	protected void configure(Dictionary<String, ?> properties) {
		Object nameProperty = properties.get("IEngineApp.name");
		if (nameProperty != null) {
			name = String.valueOf(nameProperty);
		}
		Object eClassProperty = properties.get("EngineAppComponent.eClass");
		if (eClassProperty != null) {
			String eClassPropertyValue = String.valueOf(eClassProperty);
			int pos = eClassPropertyValue.indexOf('#');
			if (pos > 0) {
				EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(eClassPropertyValue.substring(0, pos));
				if (ePackage != null) {
					EClassifier eClassfier = ePackage.getEClassifier(eClassPropertyValue.substring(pos + 1));
					if (eClassfier instanceof EClass) {
						this.eClass = (EClass) eClassfier;
					}
				}
			}
		}
		Object resourcePathFormatProperty = properties.get("EngineAppComponent.resourcePathFormat");
		Object resourceNamesProperty = properties.get("EngineAppComponent.resourceNames");
		Object aliasPathFormatProperty = properties.get("EngineAppComponent.aliasPathFormat");
		if (resourceNamesProperty != null) {
			String[] resourceNames = String.valueOf(resourceNamesProperty).split(",");
			for (int i = 0; i < resourceNames.length; i++) {
				String resourceName = resourceNames[i].trim();
				String resourceAlias = resourceName;
				if (aliasPathFormatProperty != null) {
					resourceAlias = String.format(String.valueOf(aliasPathFormatProperty), resourceName);
				}
				if (! resourceAlias.startsWith("/")) {
					resourceAlias = "/" + resourceAlias;
				}
				if (resourcePathFormatProperty != null && (! resourceName.startsWith("/"))) {
					resourceName = String.format(String.valueOf(resourcePathFormatProperty), resourceName);
				}
				resourceAliasMapping.put(resourceAlias, resourceName);
			}
			Object mainProperty = properties.get("EngineAppComponent.main"); 
			String main = getName() + ".html";
			if (mainProperty != null) {
				main = String.valueOf(mainProperty);
				resourceAliasMapping.put(getName(), main);
			}
		}
	}

	//
	
	@Override
	public URL getResource(String name) {
		return (bundleContext != null ? bundleContext.getBundle().getResource(name) : null);
	}
}
