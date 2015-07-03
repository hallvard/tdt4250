/**
 */
package no.hal.pg.runtime;

import no.hal.pg.model.Person;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uo D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.UoD#getPersons <em>Persons</em>}</li>
 *   <li>{@link no.hal.pg.runtime.UoD#getGames <em>Games</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getUoD()
 * @model
 * @generated
 */
public interface UoD extends EObject {
	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.model.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getUoD_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Games</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Game}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Games</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Games</em>' containment reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getUoD_Games()
	 * @model containment="true"
	 * @generated
	 */
	EList<Game> getGames();

} // UoD
