/**
 */
package no.hal.pg.runtime;

import no.hal.pg.model.TaskDef;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.Task#getTaskDef <em>Task Def</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Task#getGame <em>Game</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Task#getTeam <em>Team</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Task#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Task#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Task#getPastStates <em>Past States</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Task#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getTask()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PlayerIsContainedInGame'"
 * @generated
 */
public interface Task<T extends TaskDef, R> extends Players {
	/**
	 * Returns the value of the '<em><b>Task Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Def</em>' reference.
	 * @see #setTaskDef(TaskDef)
	 * @see no.hal.pg.runtime.RuntimePackage#getTask_TaskDef()
	 * @model
	 * @generated
	 */
	T getTaskDef();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.Task#getTaskDef <em>Task Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Def</em>' reference.
	 * @see #getTaskDef()
	 * @generated
	 */
	void setTaskDef(T value);

	/**
	 * Returns the value of the '<em><b>Game</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.hal.pg.runtime.Game#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game</em>' container reference.
	 * @see #setGame(Game)
	 * @see no.hal.pg.runtime.RuntimePackage#getTask_Game()
	 * @see no.hal.pg.runtime.Game#getTasks
	 * @model opposite="tasks" transient="false"
	 * @generated
	 */
	Game getGame();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.Task#getGame <em>Game</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game</em>' container reference.
	 * @see #getGame()
	 * @generated
	 */
	void setGame(Game value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference.
	 * @see #setTeam(Team)
	 * @see no.hal.pg.runtime.RuntimePackage#getTask_Team()
	 * @model
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.Task#getTeam <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

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
	 * @see no.hal.pg.runtime.RuntimePackage#getTask_Players()
	 * @model
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(Object)
	 * @see no.hal.pg.runtime.RuntimePackage#getTask_Result()
	 * @model
	 * @generated
	 */
	R getResult();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.Task#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(R value);

	/**
	 * Returns the value of the '<em><b>Current State</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link no.hal.pg.runtime.TaskState#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' containment reference.
	 * @see #setCurrentState(TaskState)
	 * @see no.hal.pg.runtime.RuntimePackage#getTask_CurrentState()
	 * @see no.hal.pg.runtime.TaskState#getTask
	 * @model opposite="task" containment="true"
	 * @generated
	 */
	TaskState<?> getCurrentState();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.Task#getCurrentState <em>Current State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' containment reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(TaskState<?> value);

	/**
	 * Returns the value of the '<em><b>Past States</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.TaskState}&lt;?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Past States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Past States</em>' containment reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getTask_PastStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskState<?>> getPastStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isInState(EClass stateClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void finish(R result);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isStarted();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isFinished();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeState(TaskState<?> state);

} // Task
