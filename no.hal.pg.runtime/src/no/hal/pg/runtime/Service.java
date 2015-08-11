/**
 */
package no.hal.pg.runtime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.Service#getServiceListeners <em>Service Listeners</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getService()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Listeners</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.ServiceListener}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Listeners</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Listeners</em>' reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getService_ServiceListeners()
	 * @model transient="true"
	 * @generated
	 */
	EList<ServiceListener> getServiceListeners();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void invokeService(ServiceInvocation invocation);

} // Service
