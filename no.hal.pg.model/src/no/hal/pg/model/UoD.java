/**
 */
package no.hal.pg.model;

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
 *   <li>{@link no.hal.pg.model.UoD#getPeople <em>People</em>}</li>
 *   <li>{@link no.hal.pg.model.UoD#getGames <em>Games</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.model.ModelPackage#getUoD()
 * @model
 * @generated
 */
public interface UoD extends EObject {
	/**
	 * Returns the value of the '<em><b>People</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.model.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>People</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>People</em>' containment reference list.
	 * @see no.hal.pg.model.ModelPackage#getUoD_People()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getPeople();

	/**
	 * Returns the value of the '<em><b>Games</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.model.GameDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Games</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Games</em>' containment reference list.
	 * @see no.hal.pg.model.ModelPackage#getUoD_Games()
	 * @model containment="true"
	 * @generated
	 */
	EList<GameDef> getGames();

} // UoD
