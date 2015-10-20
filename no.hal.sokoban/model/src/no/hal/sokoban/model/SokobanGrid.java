/**
 */
package no.hal.sokoban.model;

import no.hal.gridgame.model.Grid;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sokoban Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.sokoban.model.SokobanGrid#getPlayerX <em>Player X</em>}</li>
 *   <li>{@link no.hal.sokoban.model.SokobanGrid#getPlayerY <em>Player Y</em>}</li>
 * </ul>
 *
 * @see no.hal.sokoban.model.ModelPackage#getSokobanGrid()
 * @model superTypes="no.hal.gridgame.model.Grid<no.hal.sokoban.model.Cell, org.eclipse.emf.ecore.EObject>"
 * @generated
 */
public interface SokobanGrid extends Grid<no.hal.sokoban.util.Cell, EObject> {

	/**
	 * Returns the value of the '<em><b>Player X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player X</em>' attribute.
	 * @see #setPlayerX(int)
	 * @see no.hal.sokoban.model.ModelPackage#getSokobanGrid_PlayerX()
	 * @model
	 * @generated
	 */
	int getPlayerX();

	/**
	 * Sets the value of the '{@link no.hal.sokoban.model.SokobanGrid#getPlayerX <em>Player X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player X</em>' attribute.
	 * @see #getPlayerX()
	 * @generated
	 */
	void setPlayerX(int value);

	/**
	 * Returns the value of the '<em><b>Player Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Y</em>' attribute.
	 * @see #setPlayerY(int)
	 * @see no.hal.sokoban.model.ModelPackage#getSokobanGrid_PlayerY()
	 * @model
	 * @generated
	 */
	int getPlayerY();

	/**
	 * Sets the value of the '{@link no.hal.sokoban.model.SokobanGrid#getPlayerY <em>Player Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player Y</em>' attribute.
	 * @see #getPlayerY()
	 * @generated
	 */
	void setPlayerY(int value);
} // SokobanGrid
