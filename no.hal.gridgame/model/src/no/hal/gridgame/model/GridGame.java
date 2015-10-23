/**
 */
package no.hal.gridgame.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.gridgame.model.GridGame#getGrid <em>Grid</em>}</li>
 *   <li>{@link no.hal.gridgame.model.GridGame#getUndoStack <em>Undo Stack</em>}</li>
 *   <li>{@link no.hal.gridgame.model.GridGame#getRedoStack <em>Redo Stack</em>}</li>
 * </ul>
 *
 * @see no.hal.gridgame.model.ModelPackage#getGridGame()
 * @model abstract="true"
 * @generated
 */
public interface GridGame<G extends Grid<?, ?>, C extends GameCommand> extends EObject {
	/**
	 * Returns the value of the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' containment reference.
	 * @see #setGrid(Grid)
	 * @see no.hal.gridgame.model.ModelPackage#getGridGame_Grid()
	 * @model containment="true"
	 * @generated
	 */
	G getGrid();

	/**
	 * Sets the value of the '{@link no.hal.gridgame.model.GridGame#getGrid <em>Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' containment reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(G value);

	/**
	 * Returns the value of the '<em><b>Undo Stack</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Undo Stack</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Undo Stack</em>' containment reference list.
	 * @see no.hal.gridgame.model.ModelPackage#getGridGame_UndoStack()
	 * @model containment="true"
	 * @generated
	 */
	EList<C> getUndoStack();

	/**
	 * Returns the value of the '<em><b>Redo Stack</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redo Stack</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redo Stack</em>' containment reference list.
	 * @see no.hal.gridgame.model.ModelPackage#getGridGame_RedoStack()
	 * @model containment="true"
	 * @generated
	 */
	EList<C> getRedoStack();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void perform(C command);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void undo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void redo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isFinished();

} // GridGame
