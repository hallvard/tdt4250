/**
 */
package no.hal.pg.sokoban.runtime;

import no.hal.pg.runtime.Service;
import no.hal.sokoban.model.SokobanGame;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sokoban Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.sokoban.runtime.SokobanService#getSokobanGame <em>Sokoban Game</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.sokoban.runtime.RuntimePackage#getSokobanService()
 * @model
 * @generated
 */
public interface SokobanService extends Service<SokobanTask> {
	/**
	 * Returns the value of the '<em><b>Sokoban Game</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sokoban Game</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sokoban Game</em>' reference.
	 * @see no.hal.pg.sokoban.runtime.RuntimePackage#getSokobanService_SokobanGame()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	SokobanGame getSokobanGame();

} // SokobanService
