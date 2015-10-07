/**
 */
package no.hal.pg.runtime.service;

import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.Task;

import no.hal.pg.runtime.Team;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.service.TaskService#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.runtime.service.TaskService#getTeam <em>Team</em>}</li>
 *   <li>{@link no.hal.pg.runtime.service.TaskService#isStarted <em>Started</em>}</li>
 *   <li>{@link no.hal.pg.runtime.service.TaskService#isFinished <em>Finished</em>}</li>
 *   <li>{@link no.hal.pg.runtime.service.TaskService#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.service.ServicePackage#getTaskService()
 * @model
 * @generated
 */
public interface TaskService extends Service<Task<?, ?>> {
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
	 * @see no.hal.pg.runtime.service.ServicePackage#getTaskService_Players()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference.
	 * @see no.hal.pg.runtime.service.ServicePackage#getTaskService_Team()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Team getTeam();

	/**
	 * Returns the value of the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started</em>' attribute.
	 * @see no.hal.pg.runtime.service.ServicePackage#getTaskService_Started()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isStarted();

	/**
	 * Returns the value of the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finished</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finished</em>' attribute.
	 * @see no.hal.pg.runtime.service.ServicePackage#getTaskService_Finished()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isFinished();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see no.hal.pg.runtime.service.ServicePackage#getTaskService_Result()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Object getResult();

} // TaskService
