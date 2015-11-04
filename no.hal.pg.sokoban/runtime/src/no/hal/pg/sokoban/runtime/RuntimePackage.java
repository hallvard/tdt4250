/**
 */
package no.hal.pg.sokoban.runtime;

import no.hal.gridgame.model.ModelPackage;
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
 * @see no.hal.pg.sokoban.runtime.RuntimeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import pg-runtime='../../no.hal.pg.runtime/model/pg-runtime.ecore#/' sokoban-model='../../no.hal.sokoban.model/model/sokoban.ecore#/'"
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
	String eNS_URI = "platform:/plugin/no.hal.pg.sokoban.runtime/model/pg-sokoban-runtime.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pg-sokoban-runtime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimePackage eINSTANCE = no.hal.pg.sokoban.runtime.impl.RuntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pg.sokoban.runtime.impl.SokobanTaskImpl <em>Sokoban Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.sokoban.runtime.impl.SokobanTaskImpl
	 * @see no.hal.pg.sokoban.runtime.impl.RuntimePackageImpl#getSokobanTask()
	 * @generated
	 */
	int SOKOBAN_TASK = 0;

	/**
	 * The feature id for the '<em><b>Task Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK__TASK_DEF = no.hal.pg.runtime.RuntimePackage.TASK__TASK_DEF;

	/**
	 * The feature id for the '<em><b>Game</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK__GAME = no.hal.pg.runtime.RuntimePackage.TASK__GAME;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK__TEAM = no.hal.pg.runtime.RuntimePackage.TASK__TEAM;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK__PLAYERS = no.hal.pg.runtime.RuntimePackage.TASK__PLAYERS;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK__CURRENT_STATE = no.hal.pg.runtime.RuntimePackage.TASK__CURRENT_STATE;

	/**
	 * The feature id for the '<em><b>Past States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK__PAST_STATES = no.hal.pg.runtime.RuntimePackage.TASK__PAST_STATES;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK__RESULT = no.hal.pg.runtime.RuntimePackage.TASK__RESULT;

	/**
	 * The feature id for the '<em><b>Sokoban Game</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK__SOKOBAN_GAME = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sokoban Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK_FEATURE_COUNT = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Players</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK___GET_ALL_PLAYERS = no.hal.pg.runtime.RuntimePackage.TASK___GET_ALL_PLAYERS;

	/**
	 * The operation id for the '<em>Is Started</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK___IS_STARTED = no.hal.pg.runtime.RuntimePackage.TASK___IS_STARTED;

	/**
	 * The operation id for the '<em>Is Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK___IS_FINISHED = no.hal.pg.runtime.RuntimePackage.TASK___IS_FINISHED;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK___START = no.hal.pg.runtime.RuntimePackage.TASK___START;

	/**
	 * The operation id for the '<em>Change State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK___CHANGE_STATE__TASKSTATE = no.hal.pg.runtime.RuntimePackage.TASK___CHANGE_STATE__TASKSTATE;

	/**
	 * The operation id for the '<em>Is In State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK___IS_IN_STATE__ECLASS = no.hal.pg.runtime.RuntimePackage.TASK___IS_IN_STATE__ECLASS;

	/**
	 * The operation id for the '<em>Finish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK___FINISH__OBJECT = no.hal.pg.runtime.RuntimePackage.TASK___FINISH__OBJECT;

	/**
	 * The number of operations of the '<em>Sokoban Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK_OPERATION_COUNT = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Sokoban Result</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.sokoban.runtime.util.SokobanResult
	 * @see no.hal.pg.sokoban.runtime.impl.RuntimePackageImpl#getSokobanResult()
	 * @generated
	 */
	int SOKOBAN_RESULT = 5;

	/**
	 * The meta object id for the '{@link no.hal.pg.sokoban.runtime.impl.SokobanServiceImpl <em>Sokoban Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.sokoban.runtime.impl.SokobanServiceImpl
	 * @see no.hal.pg.sokoban.runtime.impl.RuntimePackageImpl#getSokobanService()
	 * @generated
	 */
	int SOKOBAN_SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_SERVICE__CONTEXT = no.hal.pg.runtime.RuntimePackage.SERVICE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Sokoban Game</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_SERVICE__SOKOBAN_GAME = no.hal.pg.runtime.RuntimePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sokoban Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_SERVICE_FEATURE_COUNT = no.hal.pg.runtime.RuntimePackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sokoban Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_SERVICE_OPERATION_COUNT = no.hal.pg.runtime.RuntimePackage.SERVICE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link no.hal.pg.sokoban.runtime.impl.GridRectangleValuesImpl <em>Grid Rectangle Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.sokoban.runtime.impl.GridRectangleValuesImpl
	 * @see no.hal.pg.sokoban.runtime.impl.RuntimePackageImpl#getGridRectangleValues()
	 * @generated
	 */
	int GRID_RECTANGLE_VALUES = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_RECTANGLE_VALUES__X = ModelPackage.GRID_RECTANGLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_RECTANGLE_VALUES__Y = ModelPackage.GRID_RECTANGLE__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_RECTANGLE_VALUES__WIDTH = ModelPackage.GRID_RECTANGLE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_RECTANGLE_VALUES__HEIGHT = ModelPackage.GRID_RECTANGLE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_RECTANGLE_VALUES__VALUES = ModelPackage.GRID_RECTANGLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Grid Rectangle Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_RECTANGLE_VALUES_FEATURE_COUNT = ModelPackage.GRID_RECTANGLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_RECTANGLE_VALUES___SET_VALUES__INT_INT = ModelPackage.GRID_RECTANGLE___SET_VALUES__INT_INT;

	/**
	 * The operation id for the '<em>Set Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_RECTANGLE_VALUES___SET_VALUES__INT_INT_INT_INT = ModelPackage.GRID_RECTANGLE___SET_VALUES__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Set Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_RECTANGLE_VALUES___SET_VALUES__GRIDRECTANGLE = ModelPackage.GRID_RECTANGLE___SET_VALUES__GRIDRECTANGLE;

	/**
	 * The number of operations of the '<em>Grid Rectangle Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_RECTANGLE_VALUES_OPERATION_COUNT = ModelPackage.GRID_RECTANGLE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link no.hal.pg.sokoban.runtime.impl.SokobanGameServiceImpl <em>Sokoban Game Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.sokoban.runtime.impl.SokobanGameServiceImpl
	 * @see no.hal.pg.sokoban.runtime.impl.RuntimePackageImpl#getSokobanGameService()
	 * @generated
	 */
	int SOKOBAN_GAME_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GAME_SERVICE__CONTEXT = no.hal.pg.runtime.RuntimePackage.SERVICE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GAME_SERVICE__GRID = no.hal.pg.runtime.RuntimePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sokoban Game Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GAME_SERVICE_FEATURE_COUNT = no.hal.pg.runtime.RuntimePackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Move Player</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GAME_SERVICE___MOVE_PLAYER__STRING = no.hal.pg.runtime.RuntimePackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Move Player</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GAME_SERVICE___MOVE_PLAYER__STRING_BOOLEAN = no.hal.pg.runtime.RuntimePackage.SERVICE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sokoban Game Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GAME_SERVICE_OPERATION_COUNT = no.hal.pg.runtime.RuntimePackage.SERVICE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.pg.sokoban.runtime.impl.SokobanGridServiceImpl <em>Sokoban Grid Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.sokoban.runtime.impl.SokobanGridServiceImpl
	 * @see no.hal.pg.sokoban.runtime.impl.RuntimePackageImpl#getSokobanGridService()
	 * @generated
	 */
	int SOKOBAN_GRID_SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID_SERVICE__CONTEXT = no.hal.pg.runtime.RuntimePackage.SERVICE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID_SERVICE__VALUES = no.hal.pg.runtime.RuntimePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sokoban Grid Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID_SERVICE_FEATURE_COUNT = no.hal.pg.runtime.RuntimePackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Grid Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID_SERVICE___GET_GRID_VALUES__INT_INT_INT_INT_BOOLEAN = no.hal.pg.runtime.RuntimePackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Grid Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID_SERVICE___GET_GRID_VALUES__BOOLEAN = no.hal.pg.runtime.RuntimePackage.SERVICE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sokoban Grid Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID_SERVICE_OPERATION_COUNT = no.hal.pg.runtime.RuntimePackage.SERVICE_OPERATION_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link no.hal.pg.sokoban.runtime.SokobanTask <em>Sokoban Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sokoban Task</em>'.
	 * @see no.hal.pg.sokoban.runtime.SokobanTask
	 * @generated
	 */
	EClass getSokobanTask();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.pg.sokoban.runtime.SokobanTask#getSokobanGame <em>Sokoban Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sokoban Game</em>'.
	 * @see no.hal.pg.sokoban.runtime.SokobanTask#getSokobanGame()
	 * @see #getSokobanTask()
	 * @generated
	 */
	EReference getSokobanTask_SokobanGame();

	/**
	 * Returns the meta object for data type '{@link no.hal.pg.sokoban.runtime.util.SokobanResult <em>Sokoban Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sokoban Result</em>'.
	 * @see no.hal.pg.sokoban.runtime.util.SokobanResult
	 * @model instanceClass="no.hal.pg.sokoban.runtime.util.SokobanResult"
	 * @generated
	 */
	EDataType getSokobanResult();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.sokoban.runtime.SokobanService <em>Sokoban Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sokoban Service</em>'.
	 * @see no.hal.pg.sokoban.runtime.SokobanService
	 * @generated
	 */
	EClass getSokobanService();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.sokoban.runtime.SokobanService#getSokobanGame <em>Sokoban Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sokoban Game</em>'.
	 * @see no.hal.pg.sokoban.runtime.SokobanService#getSokobanGame()
	 * @see #getSokobanService()
	 * @generated
	 */
	EReference getSokobanService_SokobanGame();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.sokoban.runtime.GridRectangleValues <em>Grid Rectangle Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Rectangle Values</em>'.
	 * @see no.hal.pg.sokoban.runtime.GridRectangleValues
	 * @generated
	 */
	EClass getGridRectangleValues();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.pg.sokoban.runtime.GridRectangleValues#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see no.hal.pg.sokoban.runtime.GridRectangleValues#getValues()
	 * @see #getGridRectangleValues()
	 * @generated
	 */
	EAttribute getGridRectangleValues_Values();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.sokoban.runtime.SokobanGameService <em>Sokoban Game Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sokoban Game Service</em>'.
	 * @see no.hal.pg.sokoban.runtime.SokobanGameService
	 * @generated
	 */
	EClass getSokobanGameService();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.sokoban.runtime.SokobanGameService#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grid</em>'.
	 * @see no.hal.pg.sokoban.runtime.SokobanGameService#getGrid()
	 * @see #getSokobanGameService()
	 * @generated
	 */
	EReference getSokobanGameService_Grid();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.sokoban.runtime.SokobanGameService#movePlayer(java.lang.String) <em>Move Player</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Player</em>' operation.
	 * @see no.hal.pg.sokoban.runtime.SokobanGameService#movePlayer(java.lang.String)
	 * @generated
	 */
	EOperation getSokobanGameService__MovePlayer__String();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.sokoban.runtime.SokobanGameService#movePlayer(java.lang.String, java.lang.Boolean) <em>Move Player</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Player</em>' operation.
	 * @see no.hal.pg.sokoban.runtime.SokobanGameService#movePlayer(java.lang.String, java.lang.Boolean)
	 * @generated
	 */
	EOperation getSokobanGameService__MovePlayer__String_Boolean();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.sokoban.runtime.SokobanGridService <em>Sokoban Grid Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sokoban Grid Service</em>'.
	 * @see no.hal.pg.sokoban.runtime.SokobanGridService
	 * @generated
	 */
	EClass getSokobanGridService();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.sokoban.runtime.SokobanGridService#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Values</em>'.
	 * @see no.hal.pg.sokoban.runtime.SokobanGridService#getValues()
	 * @see #getSokobanGridService()
	 * @generated
	 */
	EReference getSokobanGridService_Values();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.sokoban.runtime.SokobanGridService#getGridValues(int, int, int, int, java.lang.Boolean) <em>Get Grid Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Grid Values</em>' operation.
	 * @see no.hal.pg.sokoban.runtime.SokobanGridService#getGridValues(int, int, int, int, java.lang.Boolean)
	 * @generated
	 */
	EOperation getSokobanGridService__GetGridValues__int_int_int_int_Boolean();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.sokoban.runtime.SokobanGridService#getGridValues(java.lang.Boolean) <em>Get Grid Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Grid Values</em>' operation.
	 * @see no.hal.pg.sokoban.runtime.SokobanGridService#getGridValues(java.lang.Boolean)
	 * @generated
	 */
	EOperation getSokobanGridService__GetGridValues__Boolean();

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
		 * The meta object literal for the '{@link no.hal.pg.sokoban.runtime.impl.SokobanTaskImpl <em>Sokoban Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.sokoban.runtime.impl.SokobanTaskImpl
		 * @see no.hal.pg.sokoban.runtime.impl.RuntimePackageImpl#getSokobanTask()
		 * @generated
		 */
		EClass SOKOBAN_TASK = eINSTANCE.getSokobanTask();

		/**
		 * The meta object literal for the '<em><b>Sokoban Game</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOKOBAN_TASK__SOKOBAN_GAME = eINSTANCE.getSokobanTask_SokobanGame();

		/**
		 * The meta object literal for the '<em>Sokoban Result</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.sokoban.runtime.util.SokobanResult
		 * @see no.hal.pg.sokoban.runtime.impl.RuntimePackageImpl#getSokobanResult()
		 * @generated
		 */
		EDataType SOKOBAN_RESULT = eINSTANCE.getSokobanResult();

		/**
		 * The meta object literal for the '{@link no.hal.pg.sokoban.runtime.impl.SokobanServiceImpl <em>Sokoban Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.sokoban.runtime.impl.SokobanServiceImpl
		 * @see no.hal.pg.sokoban.runtime.impl.RuntimePackageImpl#getSokobanService()
		 * @generated
		 */
		EClass SOKOBAN_SERVICE = eINSTANCE.getSokobanService();

		/**
		 * The meta object literal for the '<em><b>Sokoban Game</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOKOBAN_SERVICE__SOKOBAN_GAME = eINSTANCE.getSokobanService_SokobanGame();

		/**
		 * The meta object literal for the '{@link no.hal.pg.sokoban.runtime.impl.GridRectangleValuesImpl <em>Grid Rectangle Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.sokoban.runtime.impl.GridRectangleValuesImpl
		 * @see no.hal.pg.sokoban.runtime.impl.RuntimePackageImpl#getGridRectangleValues()
		 * @generated
		 */
		EClass GRID_RECTANGLE_VALUES = eINSTANCE.getGridRectangleValues();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_RECTANGLE_VALUES__VALUES = eINSTANCE.getGridRectangleValues_Values();

		/**
		 * The meta object literal for the '{@link no.hal.pg.sokoban.runtime.impl.SokobanGameServiceImpl <em>Sokoban Game Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.sokoban.runtime.impl.SokobanGameServiceImpl
		 * @see no.hal.pg.sokoban.runtime.impl.RuntimePackageImpl#getSokobanGameService()
		 * @generated
		 */
		EClass SOKOBAN_GAME_SERVICE = eINSTANCE.getSokobanGameService();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOKOBAN_GAME_SERVICE__GRID = eINSTANCE.getSokobanGameService_Grid();

		/**
		 * The meta object literal for the '<em><b>Move Player</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOKOBAN_GAME_SERVICE___MOVE_PLAYER__STRING = eINSTANCE.getSokobanGameService__MovePlayer__String();

		/**
		 * The meta object literal for the '<em><b>Move Player</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOKOBAN_GAME_SERVICE___MOVE_PLAYER__STRING_BOOLEAN = eINSTANCE.getSokobanGameService__MovePlayer__String_Boolean();

		/**
		 * The meta object literal for the '{@link no.hal.pg.sokoban.runtime.impl.SokobanGridServiceImpl <em>Sokoban Grid Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.sokoban.runtime.impl.SokobanGridServiceImpl
		 * @see no.hal.pg.sokoban.runtime.impl.RuntimePackageImpl#getSokobanGridService()
		 * @generated
		 */
		EClass SOKOBAN_GRID_SERVICE = eINSTANCE.getSokobanGridService();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOKOBAN_GRID_SERVICE__VALUES = eINSTANCE.getSokobanGridService_Values();

		/**
		 * The meta object literal for the '<em><b>Get Grid Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOKOBAN_GRID_SERVICE___GET_GRID_VALUES__INT_INT_INT_INT_BOOLEAN = eINSTANCE.getSokobanGridService__GetGridValues__int_int_int_int_Boolean();

		/**
		 * The meta object literal for the '<em><b>Get Grid Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOKOBAN_GRID_SERVICE___GET_GRID_VALUES__BOOLEAN = eINSTANCE.getSokobanGridService__GetGridValues__Boolean();

	}

} //RuntimePackage
