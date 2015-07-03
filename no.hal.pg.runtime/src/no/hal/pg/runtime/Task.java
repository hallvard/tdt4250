/**
 */
package no.hal.pg.runtime;

import no.hal.pg.model.TaskDef;
import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link no.hal.pg.runtime.Task#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Task#getActions <em>Actions</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Task#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getTask()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PlayerIsContainedInGame'"
 * @generated
 */
public interface Task<T extends TaskDef> extends ITask {
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
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link no.hal.pg.runtime.TaskAction#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference.
	 * @see #setActions(TaskAction)
	 * @see no.hal.pg.runtime.RuntimePackage#getTask_Actions()
	 * @see no.hal.pg.runtime.TaskAction#getTask
	 * @model opposite="task" containment="true"
	 * @generated
	 */
	TaskAction<?> getActions();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.Task#getActions <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions</em>' containment reference.
	 * @see #getActions()
	 * @generated
	 */
	void setActions(TaskAction<?> value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.TaskState}&lt;?>.
	 * It is bidirectional and its opposite is '{@link no.hal.pg.runtime.TaskState#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getTask_States()
	 * @see no.hal.pg.runtime.TaskState#getTask
	 * @model opposite="task" containment="true"
	 * @generated
	 */
	EList<TaskState<?>> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	TaskState<?> getCurrentState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeState(TaskState<?> state);

} // Task
