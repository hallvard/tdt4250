/**
 */
package no.hal.pg.runtime.service;

import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.Task;

import no.hal.pg.runtime.Team;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.service.GameService#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.runtime.service.GameService#getTeams <em>Teams</em>}</li>
 *   <li>{@link no.hal.pg.runtime.service.GameService#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.service.ServicePackage#getGameService()
 * @model
 * @generated
 */
public interface GameService extends Service<Game> {
	/**
	 * Returns the value of the '<em><b>Players</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' reference list.
	 * @see no.hal.pg.runtime.service.ServicePackage#getGameService_Players()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Team}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' reference list.
	 * @see no.hal.pg.runtime.service.ServicePackage#getGameService_Teams()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Team> getTeams();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Task}&lt;?, ?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see no.hal.pg.runtime.service.ServicePackage#getGameService_Tasks()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Task<?, ?>> getTasks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Task<?, ?>> getTasks(Player player);

} // GameService
