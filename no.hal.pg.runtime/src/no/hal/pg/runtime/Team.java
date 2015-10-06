/**
 */
package no.hal.pg.runtime;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.Team#getGame <em>Game</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Team#getPlayers <em>Players</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends Players {
	/**
	 * Returns the value of the '<em><b>Game</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.hal.pg.runtime.Game#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game</em>' container reference.
	 * @see #setGame(Game)
	 * @see no.hal.pg.runtime.RuntimePackage#getTeam_Game()
	 * @see no.hal.pg.runtime.Game#getTeams
	 * @model opposite="teams" transient="false"
	 * @generated
	 */
	Game getGame();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.Team#getGame <em>Game</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game</em>' container reference.
	 * @see #getGame()
	 * @generated
	 */
	void setGame(Game value);

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
	 * @see no.hal.pg.runtime.RuntimePackage#getTeam_Players()
	 * @model containment="true"
	 * @generated
	 */
	EList<Player> getPlayers();

} // Team
