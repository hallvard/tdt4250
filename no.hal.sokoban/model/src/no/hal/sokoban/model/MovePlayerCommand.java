/**
 */
package no.hal.sokoban.model;

import no.hal.gridgame.model.GameCommand;
import no.hal.sokoban.util.Direction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.sokoban.model.MovePlayerCommand#getGrid <em>Grid</em>}</li>
 *   <li>{@link no.hal.sokoban.model.MovePlayerCommand#getDirection <em>Direction</em>}</li>
 *   <li>{@link no.hal.sokoban.model.MovePlayerCommand#isPush <em>Push</em>}</li>
 * </ul>
 *
 * @see no.hal.sokoban.model.ModelPackage#getMovePlayerCommand()
 * @model
 * @generated
 */
public interface MovePlayerCommand extends GameCommand {
	/**
	 * Returns the value of the '<em><b>Push</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Push</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Push</em>' attribute.
	 * @see #setPush(boolean)
	 * @see no.hal.sokoban.model.ModelPackage#getMovePlayerCommand_Push()
	 * @model
	 * @generated
	 */
	boolean isPush();

	/**
	 * Sets the value of the '{@link no.hal.sokoban.model.MovePlayerCommand#isPush <em>Push</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Push</em>' attribute.
	 * @see #isPush()
	 * @generated
	 */
	void setPush(boolean value);

	/**
	 * Returns the value of the '<em><b>Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' reference.
	 * @see #setGrid(SokobanGrid)
	 * @see no.hal.sokoban.model.ModelPackage#getMovePlayerCommand_Grid()
	 * @model
	 * @generated
	 */
	SokobanGrid getGrid();

	/**
	 * Sets the value of the '{@link no.hal.sokoban.model.MovePlayerCommand#getGrid <em>Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(SokobanGrid value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(Direction)
	 * @see no.hal.sokoban.model.ModelPackage#getMovePlayerCommand_Direction()
	 * @model dataType="no.hal.sokoban.model.Direction"
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link no.hal.sokoban.model.MovePlayerCommand#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

} // MoveCommand
