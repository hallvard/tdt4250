/**
 */
package no.hal.pg.runtime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.Game#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Game#getTeams <em>Teams</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Game#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getGame()
 * @model
 * @generated
 */
public interface Game extends Players {
	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' containment reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getGame_Players()
	 * @model containment="true"
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Team}.
	 * It is bidirectional and its opposite is '{@link no.hal.pg.runtime.Team#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' containment reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getGame_Teams()
	 * @see no.hal.pg.runtime.Team#getGame
	 * @model opposite="game" containment="true"
	 * @generated
	 */
	EList<Team> getTeams();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Task}&lt;?, ?>.
	 * It is bidirectional and its opposite is '{@link no.hal.pg.runtime.Task#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getGame_Tasks()
	 * @see no.hal.pg.runtime.Task#getGame
	 * @model opposite="game" containment="true"
	 * @generated
	 */
	EList<Task<?, ?>> getTasks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Task<?, ?>> getTasks(EClass stateClass);

} // Game
