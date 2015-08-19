/**
 */
package no.hal.pg.runtime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.Services#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getServices()
 * @model
 * @generated
 */
public interface Services extends EObject {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Service}&lt;?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getServices_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service<?>> getServices();

} // Services
