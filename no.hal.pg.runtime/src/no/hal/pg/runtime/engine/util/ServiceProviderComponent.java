package no.hal.pg.runtime.engine.util;

import java.util.Dictionary;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.log.LogService;

import no.hal.pg.runtime.Service;

public class ServiceProviderComponent extends AbstractServiceProvider implements ManagedService {

	private LogService logger;
	
	@Activate
	public void activate(ComponentContext context) throws Exception {
		BundleContext bundleContext = context.getBundleContext();
		ServiceReference<LogService> serviceReference = bundleContext.getServiceReference(LogService.class);
		if (serviceReference != null) {
			logger = bundleContext.getService(serviceReference);
		}
		configure(context.getProperties());
	}
	
	private Object eClassProperty, serviceEClassProperty;
	
	protected boolean configure(Dictionary<String, ?> properties) {
		eClassProperty = properties.get("ServiceProviderComponent.eClass");
		serviceEClassProperty = properties.get("ServiceProviderComponent.serviceClass");
		return (eClassProperty != null && serviceEClassProperty != null);
	}
	
	@Override
	public Service<?> getService(EObject eObject) {
		if (eClass == null && eClassProperty != null) {
			setEClass(getEClassProperty(eClassProperty));
		}
		if (serviceClass == null && serviceEClassProperty != null) {
			setServiceClass(getEClassProperty(serviceEClassProperty));
		}
		return super.getService(eObject);
	}

	protected EClass getEClassProperty(Object property) {
		String eClassName = (String) property;
		int pos = eClassName.indexOf('#');
		String ePackageName = eClassName.substring(0, pos);
		eClassName = eClassName.substring(pos + 1);
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(ePackageName);
		if (ePackage == null && this.logger != null) {
			this.logger.log(LogService.LOG_ERROR, "Could find EPackage: " + ePackageName);
		}
		EClass eClass = null;
		if (ePackage != null) {
			eClass = (EClass) ePackage.getEClassifier(eClassName);
			if (eClass == null && this.logger != null) {
				this.logger.log(LogService.LOG_ERROR, "Could find EClass: " + eClassName);
			}
		}
		return eClass;
	}

	@Override
	public void updated(Dictionary<String, ?> properties) throws ConfigurationException {
		setEClass(null);
		setServiceClass(null);
		configure(properties);
	}

	@Deactivate
	public void deactivate(ComponentContext context) throws Exception {
		setEClass(null);
		setServiceClass(null);
	}
}
