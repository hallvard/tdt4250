/**
 */
package no.hal.pg.runtime.impl;

import java.lang.reflect.InvocationTargetException;

import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.ServiceInvocation;
import no.hal.pg.runtime.ServiceListener;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ServiceListenerImpl extends MinimalEObjectImpl.Container implements ServiceListener {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceListenerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.SERVICE_LISTENER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void serviceInvoked(ServiceInvocation invocation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RuntimePackage.SERVICE_LISTENER___SERVICE_INVOKED__SERVICEINVOCATION:
				serviceInvoked((ServiceInvocation)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServiceListenerImpl
