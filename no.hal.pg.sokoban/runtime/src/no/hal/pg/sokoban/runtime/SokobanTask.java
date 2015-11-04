/**
 */
package no.hal.pg.sokoban.runtime;

import no.hal.pg.runtime.Task;

import no.hal.pg.sokoban.model.SokobanTaskDef;

import no.hal.pg.sokoban.runtime.util.SokobanResult;
import no.hal.sokoban.model.SokobanGame;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sokoban Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.sokoban.runtime.SokobanTask#getSokobanGame <em>Sokoban Game</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.sokoban.runtime.RuntimePackage#getSokobanTask()
 * @model superTypes="no.hal.pg.runtime.Task<no.hal.pg.sokoban.model.SokobanTaskDef, no.hal.pg.sokoban.runtime.SokobanResult>"
 * @generated
 */
public interface SokobanTask extends Task<SokobanTaskDef, SokobanResult> {
	/**
	 * Returns the value of the '<em><b>Sokoban Game</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sokoban Game</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sokoban Game</em>' containment reference.
	 * @see #setSokobanGame(SokobanGame)
	 * @see no.hal.pg.sokoban.runtime.RuntimePackage#getSokobanTask_SokobanGame()
	 * @model containment="true"
	 * @generated
	 */
	SokobanGame getSokobanGame();

	/**
	 * Sets the value of the '{@link no.hal.pg.sokoban.runtime.SokobanTask#getSokobanGame <em>Sokoban Game</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sokoban Game</em>' containment reference.
	 * @see #getSokobanGame()
	 * @generated
	 */
	void setSokobanGame(SokobanGame value);

} // SokobanTask
