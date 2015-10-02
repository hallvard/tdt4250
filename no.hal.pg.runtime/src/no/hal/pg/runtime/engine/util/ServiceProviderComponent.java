package no.hal.pg.runtime.engine.util;

import java.util.Dictionary;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Deactivate;

public class ServiceProviderComponent extends AbstractServiceProvider implements ManagedService {

	@Activate
	public void activate(ComponentContext context) throws Exception {
		configure(context.getProperties());
	}
	
	protected boolean configure(Dictionary<String, ?> properties) {
		try {
			setEClass(getEClassProperty(properties, "ServiceProviderComponent.eClass"));
			setServiceClass(getEClassProperty(properties, "ServiceProviderComponent.serviceClass"));
			return true;
		} catch (Exception e) {
			System.err.println("! " + serviceClass + " provides services for " + eClass);
			return false;
		}		
	}

	protected EClass getEClassProperty(Dictionary<String, ?> properties, String propertyName) {
		String eClassName = (String) properties.get(propertyName);
		int pos = eClassName.indexOf('#');
		EPackage ePackage = (EPackage) EPackage.Registry.INSTANCE.getEPackage(eClassName.substring(0, pos));
		EClass eClass = (EClass) ePackage.getEClassifier(eClassName.substring(pos + 1));
		return eClass;
	}

	public void updated(Dictionary<String, ?> properties) throws ConfigurationException {
		configure(properties);
	}

	@Deactivate
	public void deactivate(ComponentContext context) throws Exception {
		setEClass(null);
		setServiceClass(null);
	}
}
