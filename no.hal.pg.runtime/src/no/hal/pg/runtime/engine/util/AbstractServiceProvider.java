package no.hal.pg.runtime.engine.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.engine.IServiceProvider;

public abstract class AbstractServiceProvider implements IServiceProvider {

	protected EClass eClass;
	protected EClass serviceClass;
	
	public AbstractServiceProvider() {
	}

	public void setEClass(EClass eClass) {
		this.eClass = eClass;
	}
	
	public void setServiceClass(EClass serviceClass) {
		if (serviceClass == null || RuntimePackage.eINSTANCE.getService().isSuperTypeOf(serviceClass)) {
			this.serviceClass = serviceClass;
		}
	}

	public AbstractServiceProvider(EClass eClass, EClass serviceClass) {
		setEClass(eClass);
		setServiceClass(serviceClass);
	}
	
	@Override
	public Service<?> getService(EObject eObject) {
		if (eClass != null && eClass.isInstance(eObject) && serviceClass != null) {
			Service<?> serviceObject = (Service<?>) serviceClass.getEPackage().getEFactoryInstance().create(serviceClass);
			serviceObject.eSet(RuntimePackage.eINSTANCE.getService_Context(), eObject);
			return serviceObject;
		}
		return null;
	}
}
