/**
 */
package no.hal.pg.runtime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.PlayerRef#getPersonId <em>Person Id</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getPlayerRef()
 * @model
 * @generated
 */
public interface PlayerRef extends Ref<Player> {
	/**
	 * Returns the value of the '<em><b>Person Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Id</em>' attribute.
	 * @see #setPersonId(String)
	 * @see no.hal.pg.runtime.RuntimePackage#getPlayerRef_PersonId()
	 * @model
	 * @generated
	 */
	String getPersonId();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.PlayerRef#getPersonId <em>Person Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Id</em>' attribute.
	 * @see #getPersonId()
	 * @generated
	 */
	void setPersonId(String value);

} // PlayerRef
