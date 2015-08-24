/**
 */
package no.hal.pg.runtime;

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
 *   <li>{@link no.hal.pg.runtime.Service#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getService()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Service<T> extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Object)
	 * @see no.hal.pg.runtime.RuntimePackage#getService_Context()
	 * @model kind="reference"
	 * @generated
	 */
	T getContext();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.Service#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(T value);

} // Service
