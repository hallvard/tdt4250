/**
 */
package no.hal.pg.runtime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.hal.pg.runtime.RuntimeFactory
 * @model kind="package"
 * @generated
 */
public interface RuntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "runtime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.pg.runtime/model/pg-runtime.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pg-runtime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimePackage eINSTANCE = no.hal.pg.runtime.impl.RuntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.GameImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getGame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__PLAYERS = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__TASKS = 1;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___GET_TASKS__ECLASS = 0;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.PlayerImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 1;

	/**
	 * The feature id for the '<em><b>Game</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__GAME = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PERSON = 1;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.ITask <em>ITask</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.ITask
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getITask()
	 * @generated
	 */
	int ITASK = 3;

	/**
	 * The number of structural features of the '<em>ITask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITASK_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Is Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITASK___IS_ENABLED = 0;

	/**
	 * The operation id for the '<em>Is Started</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITASK___IS_STARTED = 1;

	/**
	 * The operation id for the '<em>Is Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITASK___IS_FINISHED = 2;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITASK___START = 3;

	/**
	 * The operation id for the '<em>Is In State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITASK___IS_IN_STATE__ECLASS = 4;

	/**
	 * The number of operations of the '<em>ITask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITASK_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.TaskImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The feature id for the '<em><b>Task Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK_DEF = ITASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Game</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__GAME = ITASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PLAYERS = ITASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ACTIONS = ITASK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STATES = ITASK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = ITASK_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___IS_ENABLED = ITASK___IS_ENABLED;

	/**
	 * The operation id for the '<em>Is Started</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___IS_STARTED = ITASK___IS_STARTED;

	/**
	 * The operation id for the '<em>Is Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___IS_FINISHED = ITASK___IS_FINISHED;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___START = ITASK___START;

	/**
	 * The operation id for the '<em>Is In State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___IS_IN_STATE__ECLASS = ITASK___IS_IN_STATE__ECLASS;

	/**
	 * The operation id for the '<em>Change State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CHANGE_STATE__TASKSTATE = ITASK_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Current State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_CURRENT_STATE = ITASK_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = ITASK_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.TaskStateImpl <em>Task State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.TaskStateImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTaskState()
	 * @generated
	 */
	int TASK_STATE = 4;

	/**
	 * The feature id for the '<em><b>Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE__TASK = 0;

	/**
	 * The feature id for the '<em><b>Entered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE__ENTERED = 1;

	/**
	 * The feature id for the '<em><b>Exited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE__EXITED = 2;

	/**
	 * The number of structural features of the '<em>Task State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Is Finish State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE___IS_FINISH_STATE = 0;

	/**
	 * The number of operations of the '<em>Task State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.FinishedStateImpl <em>Finished State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.FinishedStateImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getFinishedState()
	 * @generated
	 */
	int FINISHED_STATE = 5;

	/**
	 * The feature id for the '<em><b>Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISHED_STATE__TASK = TASK_STATE__TASK;

	/**
	 * The feature id for the '<em><b>Entered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISHED_STATE__ENTERED = TASK_STATE__ENTERED;

	/**
	 * The feature id for the '<em><b>Exited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISHED_STATE__EXITED = TASK_STATE__EXITED;

	/**
	 * The number of structural features of the '<em>Finished State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISHED_STATE_FEATURE_COUNT = TASK_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Finish State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISHED_STATE___IS_FINISH_STATE = TASK_STATE___IS_FINISH_STATE;

	/**
	 * The number of operations of the '<em>Finished State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISHED_STATE_OPERATION_COUNT = TASK_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.TaskActionImpl <em>Task Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.TaskActionImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTaskAction()
	 * @generated
	 */
	int TASK_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTION__TASK = 0;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTION__PLAYER = 1;

	/**
	 * The number of structural features of the '<em>Task Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Prepare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTION___PREPARE__TASK = 0;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTION___PERFORM = 1;

	/**
	 * The number of operations of the '<em>Task Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.UoDImpl <em>Uo D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.UoDImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getUoD()
	 * @generated
	 */
	int UO_D = 7;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_D__PERSONS = 0;

	/**
	 * The feature id for the '<em><b>Games</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_D__GAMES = 1;

	/**
	 * The number of structural features of the '<em>Uo D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_D_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Uo D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_D_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Timestamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTimestamp()
	 * @generated
	 */
	int TIMESTAMP = 8;


	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see no.hal.pg.runtime.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.Game#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see no.hal.pg.runtime.Game#getPlayers()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Players();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.Game#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see no.hal.pg.runtime.Game#getTasks()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Tasks();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.Game#getTasks(org.eclipse.emf.ecore.EClass) <em>Get Tasks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tasks</em>' operation.
	 * @see no.hal.pg.runtime.Game#getTasks(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getGame__GetTasks__EClass();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see no.hal.pg.runtime.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.pg.runtime.Player#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Game</em>'.
	 * @see no.hal.pg.runtime.Player#getGame()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Game();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.runtime.Player#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see no.hal.pg.runtime.Player#getPerson()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Person();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see no.hal.pg.runtime.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.runtime.Task#getTaskDef <em>Task Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Def</em>'.
	 * @see no.hal.pg.runtime.Task#getTaskDef()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_TaskDef();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.pg.runtime.Task#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Game</em>'.
	 * @see no.hal.pg.runtime.Task#getGame()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Game();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.runtime.Task#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Players</em>'.
	 * @see no.hal.pg.runtime.Task#getPlayers()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Players();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.pg.runtime.Task#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actions</em>'.
	 * @see no.hal.pg.runtime.Task#getActions()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.Task#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see no.hal.pg.runtime.Task#getStates()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_States();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.Task#changeState(no.hal.pg.runtime.TaskState) <em>Change State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change State</em>' operation.
	 * @see no.hal.pg.runtime.Task#changeState(no.hal.pg.runtime.TaskState)
	 * @generated
	 */
	EOperation getTask__ChangeState__TaskState();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.Task#getCurrentState() <em>Get Current State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current State</em>' operation.
	 * @see no.hal.pg.runtime.Task#getCurrentState()
	 * @generated
	 */
	EOperation getTask__GetCurrentState();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.ITask <em>ITask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITask</em>'.
	 * @see no.hal.pg.runtime.ITask
	 * @generated
	 */
	EClass getITask();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.ITask#isEnabled() <em>Is Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Enabled</em>' operation.
	 * @see no.hal.pg.runtime.ITask#isEnabled()
	 * @generated
	 */
	EOperation getITask__IsEnabled();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.ITask#isStarted() <em>Is Started</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Started</em>' operation.
	 * @see no.hal.pg.runtime.ITask#isStarted()
	 * @generated
	 */
	EOperation getITask__IsStarted();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.ITask#isFinished() <em>Is Finished</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Finished</em>' operation.
	 * @see no.hal.pg.runtime.ITask#isFinished()
	 * @generated
	 */
	EOperation getITask__IsFinished();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.ITask#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see no.hal.pg.runtime.ITask#start()
	 * @generated
	 */
	EOperation getITask__Start();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.ITask#isInState(org.eclipse.emf.ecore.EClass) <em>Is In State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is In State</em>' operation.
	 * @see no.hal.pg.runtime.ITask#isInState(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getITask__IsInState__EClass();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.TaskState <em>Task State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task State</em>'.
	 * @see no.hal.pg.runtime.TaskState
	 * @generated
	 */
	EClass getTaskState();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.pg.runtime.TaskState#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Task</em>'.
	 * @see no.hal.pg.runtime.TaskState#getTask()
	 * @see #getTaskState()
	 * @generated
	 */
	EReference getTaskState_Task();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.TaskState#getEntered <em>Entered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entered</em>'.
	 * @see no.hal.pg.runtime.TaskState#getEntered()
	 * @see #getTaskState()
	 * @generated
	 */
	EAttribute getTaskState_Entered();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.TaskState#getExited <em>Exited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exited</em>'.
	 * @see no.hal.pg.runtime.TaskState#getExited()
	 * @see #getTaskState()
	 * @generated
	 */
	EAttribute getTaskState_Exited();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.TaskState#isFinishState() <em>Is Finish State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Finish State</em>' operation.
	 * @see no.hal.pg.runtime.TaskState#isFinishState()
	 * @generated
	 */
	EOperation getTaskState__IsFinishState();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.FinishedState <em>Finished State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finished State</em>'.
	 * @see no.hal.pg.runtime.FinishedState
	 * @generated
	 */
	EClass getFinishedState();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.TaskAction <em>Task Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Action</em>'.
	 * @see no.hal.pg.runtime.TaskAction
	 * @generated
	 */
	EClass getTaskAction();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.pg.runtime.TaskAction#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Task</em>'.
	 * @see no.hal.pg.runtime.TaskAction#getTask()
	 * @see #getTaskAction()
	 * @generated
	 */
	EReference getTaskAction_Task();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.runtime.TaskAction#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see no.hal.pg.runtime.TaskAction#getPlayer()
	 * @see #getTaskAction()
	 * @generated
	 */
	EReference getTaskAction_Player();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.TaskAction#prepare(no.hal.pg.runtime.Task) <em>Prepare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Prepare</em>' operation.
	 * @see no.hal.pg.runtime.TaskAction#prepare(no.hal.pg.runtime.Task)
	 * @generated
	 */
	EOperation getTaskAction__Prepare__Task();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.TaskAction#perform() <em>Perform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform</em>' operation.
	 * @see no.hal.pg.runtime.TaskAction#perform()
	 * @generated
	 */
	EOperation getTaskAction__Perform();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.UoD <em>Uo D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uo D</em>'.
	 * @see no.hal.pg.runtime.UoD
	 * @generated
	 */
	EClass getUoD();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.UoD#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see no.hal.pg.runtime.UoD#getPersons()
	 * @see #getUoD()
	 * @generated
	 */
	EReference getUoD_Persons();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.UoD#getGames <em>Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Games</em>'.
	 * @see no.hal.pg.runtime.UoD#getGames()
	 * @see #getUoD()
	 * @generated
	 */
	EReference getUoD_Games();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timestamp</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 * @generated
	 */
	EDataType getTimestamp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RuntimeFactory getRuntimeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.GameImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__PLAYERS = eINSTANCE.getGame_Players();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__TASKS = eINSTANCE.getGame_Tasks();

		/**
		 * The meta object literal for the '<em><b>Get Tasks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___GET_TASKS__ECLASS = eINSTANCE.getGame__GetTasks__EClass();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.PlayerImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Game</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__GAME = eINSTANCE.getPlayer_Game();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__PERSON = eINSTANCE.getPlayer_Person();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.TaskImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Task Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TASK_DEF = eINSTANCE.getTask_TaskDef();

		/**
		 * The meta object literal for the '<em><b>Game</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__GAME = eINSTANCE.getTask_Game();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PLAYERS = eINSTANCE.getTask_Players();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__ACTIONS = eINSTANCE.getTask_Actions();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__STATES = eINSTANCE.getTask_States();

		/**
		 * The meta object literal for the '<em><b>Change State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___CHANGE_STATE__TASKSTATE = eINSTANCE.getTask__ChangeState__TaskState();

		/**
		 * The meta object literal for the '<em><b>Get Current State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___GET_CURRENT_STATE = eINSTANCE.getTask__GetCurrentState();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.ITask <em>ITask</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.ITask
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getITask()
		 * @generated
		 */
		EClass ITASK = eINSTANCE.getITask();

		/**
		 * The meta object literal for the '<em><b>Is Enabled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITASK___IS_ENABLED = eINSTANCE.getITask__IsEnabled();

		/**
		 * The meta object literal for the '<em><b>Is Started</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITASK___IS_STARTED = eINSTANCE.getITask__IsStarted();

		/**
		 * The meta object literal for the '<em><b>Is Finished</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITASK___IS_FINISHED = eINSTANCE.getITask__IsFinished();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITASK___START = eINSTANCE.getITask__Start();

		/**
		 * The meta object literal for the '<em><b>Is In State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITASK___IS_IN_STATE__ECLASS = eINSTANCE.getITask__IsInState__EClass();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.TaskStateImpl <em>Task State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.TaskStateImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTaskState()
		 * @generated
		 */
		EClass TASK_STATE = eINSTANCE.getTaskState();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_STATE__TASK = eINSTANCE.getTaskState_Task();

		/**
		 * The meta object literal for the '<em><b>Entered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_STATE__ENTERED = eINSTANCE.getTaskState_Entered();

		/**
		 * The meta object literal for the '<em><b>Exited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_STATE__EXITED = eINSTANCE.getTaskState_Exited();

		/**
		 * The meta object literal for the '<em><b>Is Finish State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_STATE___IS_FINISH_STATE = eINSTANCE.getTaskState__IsFinishState();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.FinishedStateImpl <em>Finished State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.FinishedStateImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getFinishedState()
		 * @generated
		 */
		EClass FINISHED_STATE = eINSTANCE.getFinishedState();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.TaskActionImpl <em>Task Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.TaskActionImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTaskAction()
		 * @generated
		 */
		EClass TASK_ACTION = eINSTANCE.getTaskAction();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_ACTION__TASK = eINSTANCE.getTaskAction_Task();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_ACTION__PLAYER = eINSTANCE.getTaskAction_Player();

		/**
		 * The meta object literal for the '<em><b>Prepare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_ACTION___PREPARE__TASK = eINSTANCE.getTaskAction__Prepare__Task();

		/**
		 * The meta object literal for the '<em><b>Perform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_ACTION___PERFORM = eINSTANCE.getTaskAction__Perform();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.UoDImpl <em>Uo D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.UoDImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getUoD()
		 * @generated
		 */
		EClass UO_D = eINSTANCE.getUoD();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UO_D__PERSONS = eINSTANCE.getUoD_Persons();

		/**
		 * The meta object literal for the '<em><b>Games</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UO_D__GAMES = eINSTANCE.getUoD_Games();

		/**
		 * The meta object literal for the '<em>Timestamp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTimestamp()
		 * @generated
		 */
		EDataType TIMESTAMP = eINSTANCE.getTimestamp();

	}

} //RuntimePackage
