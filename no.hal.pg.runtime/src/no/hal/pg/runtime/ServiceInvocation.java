/**
 */
package no.hal.pg.runtime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.ServiceInvocation#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getServiceInvocation()
 * @model
 * @generated
 */
public interface ServiceInvocation extends EObject {

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Long)
	 * @see no.hal.pg.runtime.RuntimePackage#getServiceInvocation_Timestamp()
	 * @model dataType="no.hal.pg.runtime.Timestamp"
	 * @generated
	 */
	Long getTimestamp();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.ServiceInvocation#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Long value);
} // ServiceInvocation
