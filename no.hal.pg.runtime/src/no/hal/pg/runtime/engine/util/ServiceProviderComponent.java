package no.hal.pg.runtime.engine.util;

import java.util.Dictionary;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.osgi.service.component.ComponentContext;

public class ServiceProviderComponent extends AbstractServiceProvider implements ManagedService {

	public void activate(ComponentContext context) throws Exception {
		configure(context.getProperties());
	}
	
	protected boolean configure(Dictionary<String, ?> properties) {
		try {
			setEClass(getEClassProperty(properties, "GameServiceProviderComponent.eClass"));
			setServiceClass(getEClassProperty(properties, "GameServiceProviderComponent.serviceClass"));
			return true;
		} catch (Exception e) {
			return false;
		}		
	}
	
	protected EClass getEClassProperty(Dictionary<String, ?> properties, String propertyName) {
		String eClassName = (String) properties.get(propertyName);
		int pos = eClassName.indexOf('#');
		EPackage ePackage = (EPackage) EPackage.Registry.INSTANCE.get(eClassName.substring(0, pos));
		EClass eClass = (EClass) ePackage.getEClassifier(eClassName.substring(pos + 1));
		return eClass;
	}

	public void updated(Dictionary<String, ?> properties) throws ConfigurationException {
		configure(properties);
	}

	public void deactivate(ComponentContext context) throws Exception {
		setEClass(null);
		setServiceClass(null);
	}
}
