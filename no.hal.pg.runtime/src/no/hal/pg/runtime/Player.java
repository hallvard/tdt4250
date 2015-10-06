/**
 */
package no.hal.pg.runtime;

import no.hal.pg.model.Person;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.Player#getGame <em>Game</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Player#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Game</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game</em>' reference.
	 * @see no.hal.pg.runtime.RuntimePackage#getPlayer_Game()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Game getGame();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see no.hal.pg.runtime.RuntimePackage#getPlayer_Person()
	 * @model
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.Player#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

} // Player
