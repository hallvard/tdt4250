/**
 */
package no.hal.sokoban.model;

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
 *   <li>{@link no.hal.sokoban.model.UoD#getLevels <em>Levels</em>}</li>
 *   <li>{@link no.hal.sokoban.model.UoD#getGame <em>Game</em>}</li>
 * </ul>
 *
 * @see no.hal.sokoban.model.ModelPackage#getUoD()
 * @model
 * @generated
 */
public interface UoD extends EObject {

	/**
	 * Returns the value of the '<em><b>Levels</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.sokoban.model.SokobanLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Levels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Levels</em>' containment reference list.
	 * @see no.hal.sokoban.model.ModelPackage#getUoD_Levels()
	 * @model containment="true"
	 * @generated
	 */
	EList<SokobanLevel> getLevels();

	/**
	 * Returns the value of the '<em><b>Game</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game</em>' containment reference.
	 * @see #setGame(SokobanGame)
	 * @see no.hal.sokoban.model.ModelPackage#getUoD_Game()
	 * @model containment="true"
	 * @generated
	 */
	SokobanGame getGame();

	/**
	 * Sets the value of the '{@link no.hal.sokoban.model.UoD#getGame <em>Game</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game</em>' containment reference.
	 * @see #getGame()
	 * @generated
	 */
	void setGame(SokobanGame value);
} // UoD
