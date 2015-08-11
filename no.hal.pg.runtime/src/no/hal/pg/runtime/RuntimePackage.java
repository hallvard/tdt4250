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
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.PlayersImpl <em>Players</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.PlayersImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getPlayers()
	 * @generated
	 */
	int PLAYERS = 2;

	/**
	 * The number of structural features of the '<em>Players</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYERS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Players</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYERS___GET_PLAYERS = 0;

	/**
	 * The number of operations of the '<em>Players</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYERS_OPERATION_COUNT = 1;

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
	int GAME__PLAYERS = PLAYERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__TASKS = PLAYERS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = PLAYERS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Players</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___GET_PLAYERS = PLAYERS___GET_PLAYERS;

	/**
	 * The operation id for the '<em>Get Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___GET_TASKS__ECLASS = PLAYERS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = PLAYERS_OPERATION_COUNT + 1;

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
	int ITASK = 4;

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
	int TASK = 3;

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
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STATES = ITASK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = ITASK_FEATURE_COUNT + 4;

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
	 * The operation id for the '<em>Get Players</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_PLAYERS = ITASK_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CHANGE_STATE__TASKSTATE = ITASK_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Current State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_CURRENT_STATE = ITASK_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = ITASK_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.TaskStateImpl <em>Task State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.TaskStateImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTaskState()
	 * @generated
	 */
	int TASK_STATE = 5;

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
	 * The operation id for the '<em>Is Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE___IS_ENABLED = 0;

	/**
	 * The operation id for the '<em>Is Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE___IS_FINISHED = 1;

	/**
	 * The number of operations of the '<em>Task State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.FinishedStateImpl <em>Finished State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.FinishedStateImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getFinishedState()
	 * @generated
	 */
	int FINISHED_STATE = 6;

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
	 * The operation id for the '<em>Is Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISHED_STATE___IS_ENABLED = TASK_STATE___IS_ENABLED;

	/**
	 * The operation id for the '<em>Is Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISHED_STATE___IS_FINISHED = TASK_STATE___IS_FINISHED;

	/**
	 * The number of operations of the '<em>Finished State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISHED_STATE_OPERATION_COUNT = TASK_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.Service <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.Service
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 7;

	/**
	 * The feature id for the '<em><b>Service Listeners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_LISTENERS = 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Invoke Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___INVOKE_SERVICE__SERVICEINVOCATION = 0;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.ServiceListener <em>Service Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.ServiceListener
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getServiceListener()
	 * @generated
	 */
	int SERVICE_LISTENER = 8;

	/**
	 * The number of structural features of the '<em>Service Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Service Invoked</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LISTENER___SERVICE_INVOKED__SERVICEINVOCATION = 0;

	/**
	 * The number of operations of the '<em>Service Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LISTENER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.ServiceInvocationImpl <em>Service Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.ServiceInvocationImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getServiceInvocation()
	 * @generated
	 */
	int SERVICE_INVOCATION = 9;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION__TIMESTAMP = 0;

	/**
	 * The number of structural features of the '<em>Service Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INVOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.TaskServiceImpl <em>Task Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.TaskServiceImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTaskService()
	 * @generated
	 */
	int TASK_SERVICE = 12;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.PlayerRefImpl <em>Player Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.PlayerRefImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getPlayerRef()
	 * @generated
	 */
	int PLAYER_REF = 13;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.RefImpl <em>Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.RefImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getRef()
	 * @generated
	 */
	int REF = 10;

	/**
	 * The number of structural features of the '<em>Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF___GET__EOBJECT = 0;

	/**
	 * The number of operations of the '<em>Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.DirectRefImpl <em>Direct Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.DirectRefImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getDirectRef()
	 * @generated
	 */
	int DIRECT_REF = 11;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_REF__REF = REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Direct Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_REF_FEATURE_COUNT = REF_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_REF___GET__EOBJECT = REF_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Direct Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_REF_OPERATION_COUNT = REF_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Listeners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SERVICE__SERVICE_LISTENERS = SERVICE__SERVICE_LISTENERS;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SERVICE__TASK = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Invoke Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SERVICE___INVOKE_SERVICE__SERVICEINVOCATION = SERVICE___INVOKE_SERVICE__SERVICEINVOCATION;

	/**
	 * The number of operations of the '<em>Task Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Person Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_REF__PERSON_ID = REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Player Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_REF_FEATURE_COUNT = REF_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_REF___GET__EOBJECT = REF___GET__EOBJECT;

	/**
	 * The number of operations of the '<em>Player Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_REF_OPERATION_COUNT = REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Timestamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTimestamp()
	 * @generated
	 */
	int TIMESTAMP = 14;


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
	 * Returns the meta object for class '{@link no.hal.pg.runtime.Players <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Players</em>'.
	 * @see no.hal.pg.runtime.Players
	 * @generated
	 */
	EClass getPlayers();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.Players#getPlayers() <em>Get Players</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Players</em>' operation.
	 * @see no.hal.pg.runtime.Players#getPlayers()
	 * @generated
	 */
	EOperation getPlayers__GetPlayers();

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
	 * Returns the meta object for the '{@link no.hal.pg.runtime.TaskState#isEnabled() <em>Is Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Enabled</em>' operation.
	 * @see no.hal.pg.runtime.TaskState#isEnabled()
	 * @generated
	 */
	EOperation getTaskState__IsEnabled();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.TaskState#isFinished() <em>Is Finished</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Finished</em>' operation.
	 * @see no.hal.pg.runtime.TaskState#isFinished()
	 * @generated
	 */
	EOperation getTaskState__IsFinished();

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
	 * Returns the meta object for class '{@link no.hal.pg.runtime.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see no.hal.pg.runtime.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.runtime.Service#getServiceListeners <em>Service Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Listeners</em>'.
	 * @see no.hal.pg.runtime.Service#getServiceListeners()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ServiceListeners();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.Service#invokeService(no.hal.pg.runtime.ServiceInvocation) <em>Invoke Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Invoke Service</em>' operation.
	 * @see no.hal.pg.runtime.Service#invokeService(no.hal.pg.runtime.ServiceInvocation)
	 * @generated
	 */
	EOperation getService__InvokeService__ServiceInvocation();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.ServiceListener <em>Service Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Listener</em>'.
	 * @see no.hal.pg.runtime.ServiceListener
	 * @generated
	 */
	EClass getServiceListener();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.ServiceListener#serviceInvoked(no.hal.pg.runtime.ServiceInvocation) <em>Service Invoked</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Service Invoked</em>' operation.
	 * @see no.hal.pg.runtime.ServiceListener#serviceInvoked(no.hal.pg.runtime.ServiceInvocation)
	 * @generated
	 */
	EOperation getServiceListener__ServiceInvoked__ServiceInvocation();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.ServiceInvocation <em>Service Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Invocation</em>'.
	 * @see no.hal.pg.runtime.ServiceInvocation
	 * @generated
	 */
	EClass getServiceInvocation();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.ServiceInvocation#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see no.hal.pg.runtime.ServiceInvocation#getTimestamp()
	 * @see #getServiceInvocation()
	 * @generated
	 */
	EAttribute getServiceInvocation_Timestamp();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.TaskService <em>Task Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Service</em>'.
	 * @see no.hal.pg.runtime.TaskService
	 * @generated
	 */
	EClass getTaskService();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.runtime.TaskService#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see no.hal.pg.runtime.TaskService#getTask()
	 * @see #getTaskService()
	 * @generated
	 */
	EReference getTaskService_Task();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.PlayerRef <em>Player Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Ref</em>'.
	 * @see no.hal.pg.runtime.PlayerRef
	 * @generated
	 */
	EClass getPlayerRef();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.PlayerRef#getPersonId <em>Person Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Id</em>'.
	 * @see no.hal.pg.runtime.PlayerRef#getPersonId()
	 * @see #getPlayerRef()
	 * @generated
	 */
	EAttribute getPlayerRef_PersonId();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.Ref <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref</em>'.
	 * @see no.hal.pg.runtime.Ref
	 * @generated
	 */
	EClass getRef();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.Ref#get(org.eclipse.emf.ecore.EObject) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see no.hal.pg.runtime.Ref#get(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getRef__Get__EObject();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.DirectRef <em>Direct Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Ref</em>'.
	 * @see no.hal.pg.runtime.DirectRef
	 * @generated
	 */
	EClass getDirectRef();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.runtime.DirectRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see no.hal.pg.runtime.DirectRef#getRef()
	 * @see #getDirectRef()
	 * @generated
	 */
	EReference getDirectRef_Ref();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.DirectRef#get(org.eclipse.emf.ecore.EObject) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see no.hal.pg.runtime.DirectRef#get(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getDirectRef__Get__EObject();

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
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.PlayersImpl <em>Players</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.PlayersImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getPlayers()
		 * @generated
		 */
		EClass PLAYERS = eINSTANCE.getPlayers();

		/**
		 * The meta object literal for the '<em><b>Get Players</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYERS___GET_PLAYERS = eINSTANCE.getPlayers__GetPlayers();

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
		 * The meta object literal for the '<em><b>Is Enabled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_STATE___IS_ENABLED = eINSTANCE.getTaskState__IsEnabled();

		/**
		 * The meta object literal for the '<em><b>Is Finished</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_STATE___IS_FINISHED = eINSTANCE.getTaskState__IsFinished();

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
		 * The meta object literal for the '{@link no.hal.pg.runtime.Service <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.Service
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Service Listeners</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICE_LISTENERS = eINSTANCE.getService_ServiceListeners();

		/**
		 * The meta object literal for the '<em><b>Invoke Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE___INVOKE_SERVICE__SERVICEINVOCATION = eINSTANCE.getService__InvokeService__ServiceInvocation();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.ServiceListener <em>Service Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.ServiceListener
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getServiceListener()
		 * @generated
		 */
		EClass SERVICE_LISTENER = eINSTANCE.getServiceListener();

		/**
		 * The meta object literal for the '<em><b>Service Invoked</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_LISTENER___SERVICE_INVOKED__SERVICEINVOCATION = eINSTANCE.getServiceListener__ServiceInvoked__ServiceInvocation();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.ServiceInvocationImpl <em>Service Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.ServiceInvocationImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getServiceInvocation()
		 * @generated
		 */
		EClass SERVICE_INVOCATION = eINSTANCE.getServiceInvocation();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INVOCATION__TIMESTAMP = eINSTANCE.getServiceInvocation_Timestamp();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.TaskServiceImpl <em>Task Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.TaskServiceImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTaskService()
		 * @generated
		 */
		EClass TASK_SERVICE = eINSTANCE.getTaskService();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_SERVICE__TASK = eINSTANCE.getTaskService_Task();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.PlayerRefImpl <em>Player Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.PlayerRefImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getPlayerRef()
		 * @generated
		 */
		EClass PLAYER_REF = eINSTANCE.getPlayerRef();

		/**
		 * The meta object literal for the '<em><b>Person Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_REF__PERSON_ID = eINSTANCE.getPlayerRef_PersonId();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.RefImpl <em>Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.RefImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getRef()
		 * @generated
		 */
		EClass REF = eINSTANCE.getRef();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REF___GET__EOBJECT = eINSTANCE.getRef__Get__EObject();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.DirectRefImpl <em>Direct Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.DirectRefImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getDirectRef()
		 * @generated
		 */
		EClass DIRECT_REF = eINSTANCE.getDirectRef();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECT_REF__REF = eINSTANCE.getDirectRef_Ref();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIRECT_REF___GET__EOBJECT = eINSTANCE.getDirectRef__Get__EObject();

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
