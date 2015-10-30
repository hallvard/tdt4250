/**
 */
package no.hal.sokoban.model;

import no.hal.gridgame.model.GridGame;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sokoban Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.sokoban.model.SokobanGame#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see no.hal.sokoban.model.ModelPackage#getSokobanGame()
 * @model
 * @generated
 */
public interface SokobanGame extends GridGame<SokobanGrid, MovePlayerCommand> {

	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' reference.
	 * @see #setLevel(SokobanLevel)
	 * @see no.hal.sokoban.model.ModelPackage#getSokobanGame_Level()
	 * @model
	 * @generated
	 */
	SokobanLevel getLevel();

	/**
	 * Sets the value of the '{@link no.hal.sokoban.model.SokobanGame#getLevel <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(SokobanLevel value);
} // SokobanGame
