/**
 */
package no.hal.pg.runtime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.pg.runtime.RuntimePackage#getServiceInvokationListener()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ServiceInvokationListener extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void serviceInvoked(ServiceInvocation invocation);

} // ServiceListener