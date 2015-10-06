/**
 */
package no.hal.pg.runtime.service;

import no.hal.pg.runtime.RuntimePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see no.hal.pg.runtime.service.ServiceFactory
 * @model kind="package"
 * @generated
 */
public interface ServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "service";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.pg.runtime/model/pg-service.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pg-service";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicePackage eINSTANCE = no.hal.pg.runtime.service.impl.ServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.service.impl.GameServiceImpl <em>Game Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.service.impl.GameServiceImpl
	 * @see no.hal.pg.runtime.service.impl.ServicePackageImpl#getGameService()
	 * @generated
	 */
	int GAME_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_SERVICE__CONTEXT = RuntimePackage.SERVICE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_SERVICE__PLAYERS = RuntimePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_SERVICE__TASKS = RuntimePackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Game Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_SERVICE_FEATURE_COUNT = RuntimePackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_SERVICE___GET_TASKS__PLAYER = RuntimePackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Game Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_SERVICE_OPERATION_COUNT = RuntimePackage.SERVICE_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.service.impl.TaskServiceImpl <em>Task Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.service.impl.TaskServiceImpl
	 * @see no.hal.pg.runtime.service.impl.ServicePackageImpl#getTaskService()
	 * @generated
	 */
	int TASK_SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SERVICE__CONTEXT = RuntimePackage.SERVICE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SERVICE__PLAYERS = RuntimePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SERVICE__STARTED = RuntimePackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SERVICE__FINISHED = RuntimePackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SERVICE__RESULT = RuntimePackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Task Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SERVICE_FEATURE_COUNT = RuntimePackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Task Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SERVICE_OPERATION_COUNT = RuntimePackage.SERVICE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.service.impl.PlayerServiceImpl <em>Player Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.service.impl.PlayerServiceImpl
	 * @see no.hal.pg.runtime.service.impl.ServicePackageImpl#getPlayerService()
	 * @generated
	 */
	int PLAYER_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_SERVICE__CONTEXT = RuntimePackage.SERVICE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_SERVICE__NAME = RuntimePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_SERVICE__TASKS = RuntimePackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Player Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_SERVICE_FEATURE_COUNT = RuntimePackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Player Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_SERVICE_OPERATION_COUNT = RuntimePackage.SERVICE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.service.GameService <em>Game Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Service</em>'.
	 * @see no.hal.pg.runtime.service.GameService
	 * @generated
	 */
	EClass getGameService();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.runtime.service.GameService#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Players</em>'.
	 * @see no.hal.pg.runtime.service.GameService#getPlayers()
	 * @see #getGameService()
	 * @generated
	 */
	EReference getGameService_Players();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.runtime.service.GameService#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see no.hal.pg.runtime.service.GameService#getTasks()
	 * @see #getGameService()
	 * @generated
	 */
	EReference getGameService_Tasks();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.service.GameService#getTasks(no.hal.pg.runtime.Player) <em>Get Tasks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tasks</em>' operation.
	 * @see no.hal.pg.runtime.service.GameService#getTasks(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getGameService__GetTasks__Player();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.service.TaskService <em>Task Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Service</em>'.
	 * @see no.hal.pg.runtime.service.TaskService
	 * @generated
	 */
	EClass getTaskService();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.runtime.service.TaskService#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Players</em>'.
	 * @see no.hal.pg.runtime.service.TaskService#getPlayers()
	 * @see #getTaskService()
	 * @generated
	 */
	EReference getTaskService_Players();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.service.TaskService#isStarted <em>Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started</em>'.
	 * @see no.hal.pg.runtime.service.TaskService#isStarted()
	 * @see #getTaskService()
	 * @generated
	 */
	EAttribute getTaskService_Started();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.service.TaskService#isFinished <em>Finished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finished</em>'.
	 * @see no.hal.pg.runtime.service.TaskService#isFinished()
	 * @see #getTaskService()
	 * @generated
	 */
	EAttribute getTaskService_Finished();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.service.TaskService#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see no.hal.pg.runtime.service.TaskService#getResult()
	 * @see #getTaskService()
	 * @generated
	 */
	EAttribute getTaskService_Result();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.service.PlayerService <em>Player Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Service</em>'.
	 * @see no.hal.pg.runtime.service.PlayerService
	 * @generated
	 */
	EClass getPlayerService();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.service.PlayerService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.pg.runtime.service.PlayerService#getName()
	 * @see #getPlayerService()
	 * @generated
	 */
	EAttribute getPlayerService_Name();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.runtime.service.PlayerService#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see no.hal.pg.runtime.service.PlayerService#getTasks()
	 * @see #getPlayerService()
	 * @generated
	 */
	EReference getPlayerService_Tasks();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServiceFactory getServiceFactory();

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
		 * The meta object literal for the '{@link no.hal.pg.runtime.service.impl.GameServiceImpl <em>Game Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.service.impl.GameServiceImpl
		 * @see no.hal.pg.runtime.service.impl.ServicePackageImpl#getGameService()
		 * @generated
		 */
		EClass GAME_SERVICE = eINSTANCE.getGameService();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_SERVICE__PLAYERS = eINSTANCE.getGameService_Players();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_SERVICE__TASKS = eINSTANCE.getGameService_Tasks();

		/**
		 * The meta object literal for the '<em><b>Get Tasks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_SERVICE___GET_TASKS__PLAYER = eINSTANCE.getGameService__GetTasks__Player();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.service.impl.TaskServiceImpl <em>Task Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.service.impl.TaskServiceImpl
		 * @see no.hal.pg.runtime.service.impl.ServicePackageImpl#getTaskService()
		 * @generated
		 */
		EClass TASK_SERVICE = eINSTANCE.getTaskService();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_SERVICE__PLAYERS = eINSTANCE.getTaskService_Players();

		/**
		 * The meta object literal for the '<em><b>Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_SERVICE__STARTED = eINSTANCE.getTaskService_Started();

		/**
		 * The meta object literal for the '<em><b>Finished</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_SERVICE__FINISHED = eINSTANCE.getTaskService_Finished();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_SERVICE__RESULT = eINSTANCE.getTaskService_Result();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.service.impl.PlayerServiceImpl <em>Player Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.service.impl.PlayerServiceImpl
		 * @see no.hal.pg.runtime.service.impl.ServicePackageImpl#getPlayerService()
		 * @generated
		 */
		EClass PLAYER_SERVICE = eINSTANCE.getPlayerService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_SERVICE__NAME = eINSTANCE.getPlayerService_Name();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER_SERVICE__TASKS = eINSTANCE.getPlayerService_Tasks();

	}

} //ServicePackage
