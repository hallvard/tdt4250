/**
 */
package no.hal.pg.runtime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.DirectRef#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getDirectRef()
 * @model
 * @generated
 */
public interface DirectRef<T> extends Ref<T> {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Object)
	 * @see no.hal.pg.runtime.RuntimePackage#getDirectRef_Ref()
	 * @model kind="reference"
	 * @generated
	 */
	T getRef();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.DirectRef#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(T value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T get(EObject context);

} // DirectRef
