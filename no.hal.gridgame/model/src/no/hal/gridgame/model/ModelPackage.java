/**
 */
package no.hal.gridgame.model;

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
 * @see no.hal.gridgame.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.gridgame.model/model/gridgame.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gridgame-model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = no.hal.gridgame.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.gridgame.model.impl.UoDImpl <em>Uo D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.gridgame.model.impl.UoDImpl
	 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getUoD()
	 * @generated
	 */
	int UO_D = 0;

	/**
	 * The number of structural features of the '<em>Uo D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_D_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Uo D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_D_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link no.hal.gridgame.model.impl.GridImpl <em>Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.gridgame.model.impl.GridImpl
	 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getGrid()
	 * @generated
	 */
	int GRID = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__VALUES = 2;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__OBJECTS = 3;

	/**
	 * The feature id for the '<em><b>Grid Listeners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__GRID_LISTENERS = 4;

	/**
	 * The number of structural features of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Grid Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID___GET_GRID_VALUE__INT_INT = 0;

	/**
	 * The operation id for the '<em>Get Grid Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID___GET_GRID_OBJECT__INT_INT = 1;

	/**
	 * The operation id for the '<em>Set Grid Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID___SET_GRID_VALUE__INT_INT_OBJECT = 2;

	/**
	 * The operation id for the '<em>Set Grid Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID___SET_GRID_OBJECT__INT_INT_EOBJECT = 3;

	/**
	 * The operation id for the '<em>Create Grid Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID___CREATE_GRID_VALUE = 4;

	/**
	 * The operation id for the '<em>Create Grid Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID___CREATE_GRID_OBJECT = 5;

	/**
	 * The operation id for the '<em>Get Grid Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID___GET_GRID_VALUES__INT_INT_INT_INT = 6;

	/**
	 * The operation id for the '<em>Get Grid Objects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID___GET_GRID_OBJECTS__INT_INT_INT_INT = 7;

	/**
	 * The number of operations of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link no.hal.gridgame.model.GridListener <em>Grid Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.gridgame.model.GridListener
	 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getGridListener()
	 * @generated
	 */
	int GRID_LISTENER = 2;

	/**
	 * The number of structural features of the '<em>Grid Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Grid Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LISTENER___GRID_CHANGED__GRID_INT_INT_INT_INT = 0;

	/**
	 * The number of operations of the '<em>Grid Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LISTENER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.hal.gridgame.model.impl.GridGameImpl <em>Grid Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.gridgame.model.impl.GridGameImpl
	 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getGridGame()
	 * @generated
	 */
	int GRID_GAME = 3;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_GAME__GRID = 0;

	/**
	 * The feature id for the '<em><b>Undo Stack</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_GAME__UNDO_STACK = 1;

	/**
	 * The feature id for the '<em><b>Redo Stack</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_GAME__REDO_STACK = 2;

	/**
	 * The number of structural features of the '<em>Grid Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_GAME_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_GAME___PERFORM__GAMECOMMAND = 0;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_GAME___UNDO = 1;

	/**
	 * The operation id for the '<em>Redo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_GAME___REDO = 2;

	/**
	 * The operation id for the '<em>Is Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_GAME___IS_FINISHED = 3;

	/**
	 * The number of operations of the '<em>Grid Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_GAME_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link no.hal.gridgame.model.impl.GameCommandImpl <em>Game Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.gridgame.model.impl.GameCommandImpl
	 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getGameCommand()
	 * @generated
	 */
	int GAME_COMMAND = 4;

	/**
	 * The feature id for the '<em><b>Changes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_COMMAND__CHANGES = GRID_LISTENER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Game Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_COMMAND_FEATURE_COUNT = GRID_LISTENER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Grid Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_COMMAND___GRID_CHANGED__GRID_INT_INT_INT_INT = GRID_LISTENER___GRID_CHANGED__GRID_INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Prepare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_COMMAND___PREPARE = GRID_LISTENER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_COMMAND___PERFORM = GRID_LISTENER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_COMMAND___UNDO = GRID_LISTENER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Redo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_COMMAND___REDO = GRID_LISTENER_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Game Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_COMMAND_OPERATION_COUNT = GRID_LISTENER_OPERATION_COUNT + 4;


	/**
	 * The meta object id for the '{@link no.hal.gridgame.model.impl.CompositeCommandImpl <em>Composite Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.gridgame.model.impl.CompositeCommandImpl
	 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getCompositeCommand()
	 * @generated
	 */
	int COMPOSITE_COMMAND = 5;

	/**
	 * The feature id for the '<em><b>Changes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMMAND__CHANGES = GAME_COMMAND__CHANGES;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMMAND__COMMANDS = GAME_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMMAND_FEATURE_COUNT = GAME_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Grid Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMMAND___GRID_CHANGED__GRID_INT_INT_INT_INT = GAME_COMMAND___GRID_CHANGED__GRID_INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Prepare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMMAND___PREPARE = GAME_COMMAND___PREPARE;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMMAND___PERFORM = GAME_COMMAND___PERFORM;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMMAND___UNDO = GAME_COMMAND___UNDO;

	/**
	 * The operation id for the '<em>Redo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMMAND___REDO = GAME_COMMAND___REDO;

	/**
	 * The number of operations of the '<em>Composite Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMMAND_OPERATION_COUNT = GAME_COMMAND_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link no.hal.gridgame.model.impl.GridRectangleImpl <em>Grid Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.gridgame.model.impl.GridRectangleImpl
	 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getGridRectangle()
	 * @generated
	 */
	int GRID_RECTANGLE = 7;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_RECTANGLE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_RECTANGLE__Y = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_RECTANGLE__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_RECTANGLE__HEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Grid Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_RECTANGLE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Set Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_RECTANGLE___SET_VALUES__INT_INT = 0;

	/**
	 * The operation id for the '<em>Set Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_RECTANGLE___SET_VALUES__INT_INT_INT_INT = 1;

	/**
	 * The operation id for the '<em>Set Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_RECTANGLE___SET_VALUES__GRIDRECTANGLE = 2;

	/**
	 * The number of operations of the '<em>Grid Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_RECTANGLE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link no.hal.gridgame.model.impl.GridChangeDescriptionImpl <em>Grid Change Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.gridgame.model.impl.GridChangeDescriptionImpl
	 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getGridChangeDescription()
	 * @generated
	 */
	int GRID_CHANGE_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CHANGE_DESCRIPTION__X = GRID_RECTANGLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CHANGE_DESCRIPTION__Y = GRID_RECTANGLE__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CHANGE_DESCRIPTION__WIDTH = GRID_RECTANGLE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CHANGE_DESCRIPTION__HEIGHT = GRID_RECTANGLE__HEIGHT;

	/**
	 * The number of structural features of the '<em>Grid Change Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CHANGE_DESCRIPTION_FEATURE_COUNT = GRID_RECTANGLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CHANGE_DESCRIPTION___SET_VALUES__INT_INT = GRID_RECTANGLE___SET_VALUES__INT_INT;

	/**
	 * The operation id for the '<em>Set Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CHANGE_DESCRIPTION___SET_VALUES__INT_INT_INT_INT = GRID_RECTANGLE___SET_VALUES__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Set Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CHANGE_DESCRIPTION___SET_VALUES__GRIDRECTANGLE = GRID_RECTANGLE___SET_VALUES__GRIDRECTANGLE;

	/**
	 * The operation id for the '<em>Add Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CHANGE_DESCRIPTION___ADD_CHANGE__INT_INT = GRID_RECTANGLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CHANGE_DESCRIPTION___ADD_CHANGE__INT_INT_INT_INT = GRID_RECTANGLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Grid Change Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CHANGE_DESCRIPTION_OPERATION_COUNT = GRID_RECTANGLE_OPERATION_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link no.hal.gridgame.model.UoD <em>Uo D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uo D</em>'.
	 * @see no.hal.gridgame.model.UoD
	 * @generated
	 */
	EClass getUoD();

	/**
	 * Returns the meta object for class '{@link no.hal.gridgame.model.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid</em>'.
	 * @see no.hal.gridgame.model.Grid
	 * @generated
	 */
	EClass getGrid();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.gridgame.model.Grid#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see no.hal.gridgame.model.Grid#getWidth()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Width();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.gridgame.model.Grid#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see no.hal.gridgame.model.Grid#getHeight()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Height();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.gridgame.model.Grid#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see no.hal.gridgame.model.Grid#getValues()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Values();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.gridgame.model.Grid#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see no.hal.gridgame.model.Grid#getObjects()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Objects();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.gridgame.model.Grid#getGridListeners <em>Grid Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grid Listeners</em>'.
	 * @see no.hal.gridgame.model.Grid#getGridListeners()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_GridListeners();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.Grid#getGridValue(int, int) <em>Get Grid Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Grid Value</em>' operation.
	 * @see no.hal.gridgame.model.Grid#getGridValue(int, int)
	 * @generated
	 */
	EOperation getGrid__GetGridValue__int_int();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.Grid#getGridObject(int, int) <em>Get Grid Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Grid Object</em>' operation.
	 * @see no.hal.gridgame.model.Grid#getGridObject(int, int)
	 * @generated
	 */
	EOperation getGrid__GetGridObject__int_int();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.Grid#setGridValue(int, int, java.lang.Object) <em>Set Grid Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Grid Value</em>' operation.
	 * @see no.hal.gridgame.model.Grid#setGridValue(int, int, java.lang.Object)
	 * @generated
	 */
	EOperation getGrid__SetGridValue__int_int_Object();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.Grid#setGridObject(int, int, org.eclipse.emf.ecore.EObject) <em>Set Grid Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Grid Object</em>' operation.
	 * @see no.hal.gridgame.model.Grid#setGridObject(int, int, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getGrid__SetGridObject__int_int_EObject();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.Grid#createGridValue() <em>Create Grid Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Grid Value</em>' operation.
	 * @see no.hal.gridgame.model.Grid#createGridValue()
	 * @generated
	 */
	EOperation getGrid__CreateGridValue();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.Grid#createGridObject() <em>Create Grid Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Grid Object</em>' operation.
	 * @see no.hal.gridgame.model.Grid#createGridObject()
	 * @generated
	 */
	EOperation getGrid__CreateGridObject();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.Grid#getGridValues(int, int, int, int) <em>Get Grid Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Grid Values</em>' operation.
	 * @see no.hal.gridgame.model.Grid#getGridValues(int, int, int, int)
	 * @generated
	 */
	EOperation getGrid__GetGridValues__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.Grid#getGridObjects(int, int, int, int) <em>Get Grid Objects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Grid Objects</em>' operation.
	 * @see no.hal.gridgame.model.Grid#getGridObjects(int, int, int, int)
	 * @generated
	 */
	EOperation getGrid__GetGridObjects__int_int_int_int();

	/**
	 * Returns the meta object for class '{@link no.hal.gridgame.model.GridListener <em>Grid Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Listener</em>'.
	 * @see no.hal.gridgame.model.GridListener
	 * @generated
	 */
	EClass getGridListener();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.GridListener#gridChanged(no.hal.gridgame.model.Grid, int, int, int, int) <em>Grid Changed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Grid Changed</em>' operation.
	 * @see no.hal.gridgame.model.GridListener#gridChanged(no.hal.gridgame.model.Grid, int, int, int, int)
	 * @generated
	 */
	EOperation getGridListener__GridChanged__Grid_int_int_int_int();

	/**
	 * Returns the meta object for class '{@link no.hal.gridgame.model.GridGame <em>Grid Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Game</em>'.
	 * @see no.hal.gridgame.model.GridGame
	 * @generated
	 */
	EClass getGridGame();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.gridgame.model.GridGame#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grid</em>'.
	 * @see no.hal.gridgame.model.GridGame#getGrid()
	 * @see #getGridGame()
	 * @generated
	 */
	EReference getGridGame_Grid();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.gridgame.model.GridGame#getUndoStack <em>Undo Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Undo Stack</em>'.
	 * @see no.hal.gridgame.model.GridGame#getUndoStack()
	 * @see #getGridGame()
	 * @generated
	 */
	EReference getGridGame_UndoStack();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.gridgame.model.GridGame#getRedoStack <em>Redo Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Redo Stack</em>'.
	 * @see no.hal.gridgame.model.GridGame#getRedoStack()
	 * @see #getGridGame()
	 * @generated
	 */
	EReference getGridGame_RedoStack();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.GridGame#perform(no.hal.gridgame.model.GameCommand) <em>Perform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform</em>' operation.
	 * @see no.hal.gridgame.model.GridGame#perform(no.hal.gridgame.model.GameCommand)
	 * @generated
	 */
	EOperation getGridGame__Perform__GameCommand();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.GridGame#undo() <em>Undo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Undo</em>' operation.
	 * @see no.hal.gridgame.model.GridGame#undo()
	 * @generated
	 */
	EOperation getGridGame__Undo();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.GridGame#redo() <em>Redo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Redo</em>' operation.
	 * @see no.hal.gridgame.model.GridGame#redo()
	 * @generated
	 */
	EOperation getGridGame__Redo();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.GridGame#isFinished() <em>Is Finished</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Finished</em>' operation.
	 * @see no.hal.gridgame.model.GridGame#isFinished()
	 * @generated
	 */
	EOperation getGridGame__IsFinished();

	/**
	 * Returns the meta object for class '{@link no.hal.gridgame.model.GameCommand <em>Game Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Command</em>'.
	 * @see no.hal.gridgame.model.GameCommand
	 * @generated
	 */
	EClass getGameCommand();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.gridgame.model.GameCommand#getChanges <em>Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Changes</em>'.
	 * @see no.hal.gridgame.model.GameCommand#getChanges()
	 * @see #getGameCommand()
	 * @generated
	 */
	EReference getGameCommand_Changes();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.GameCommand#prepare() <em>Prepare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Prepare</em>' operation.
	 * @see no.hal.gridgame.model.GameCommand#prepare()
	 * @generated
	 */
	EOperation getGameCommand__Prepare();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.GameCommand#perform() <em>Perform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform</em>' operation.
	 * @see no.hal.gridgame.model.GameCommand#perform()
	 * @generated
	 */
	EOperation getGameCommand__Perform();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.GameCommand#undo() <em>Undo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Undo</em>' operation.
	 * @see no.hal.gridgame.model.GameCommand#undo()
	 * @generated
	 */
	EOperation getGameCommand__Undo();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.GameCommand#redo() <em>Redo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Redo</em>' operation.
	 * @see no.hal.gridgame.model.GameCommand#redo()
	 * @generated
	 */
	EOperation getGameCommand__Redo();

	/**
	 * Returns the meta object for class '{@link no.hal.gridgame.model.CompositeCommand <em>Composite Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Command</em>'.
	 * @see no.hal.gridgame.model.CompositeCommand
	 * @generated
	 */
	EClass getCompositeCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.gridgame.model.CompositeCommand#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see no.hal.gridgame.model.CompositeCommand#getCommands()
	 * @see #getCompositeCommand()
	 * @generated
	 */
	EReference getCompositeCommand_Commands();

	/**
	 * Returns the meta object for class '{@link no.hal.gridgame.model.GridChangeDescription <em>Grid Change Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Change Description</em>'.
	 * @see no.hal.gridgame.model.GridChangeDescription
	 * @generated
	 */
	EClass getGridChangeDescription();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.GridChangeDescription#addChange(int, int) <em>Add Change</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Change</em>' operation.
	 * @see no.hal.gridgame.model.GridChangeDescription#addChange(int, int)
	 * @generated
	 */
	EOperation getGridChangeDescription__AddChange__int_int();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.GridChangeDescription#addChange(int, int, int, int) <em>Add Change</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Change</em>' operation.
	 * @see no.hal.gridgame.model.GridChangeDescription#addChange(int, int, int, int)
	 * @generated
	 */
	EOperation getGridChangeDescription__AddChange__int_int_int_int();

	/**
	 * Returns the meta object for class '{@link no.hal.gridgame.model.GridRectangle <em>Grid Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Rectangle</em>'.
	 * @see no.hal.gridgame.model.GridRectangle
	 * @generated
	 */
	EClass getGridRectangle();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.gridgame.model.GridRectangle#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see no.hal.gridgame.model.GridRectangle#getX()
	 * @see #getGridRectangle()
	 * @generated
	 */
	EAttribute getGridRectangle_X();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.gridgame.model.GridRectangle#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see no.hal.gridgame.model.GridRectangle#getY()
	 * @see #getGridRectangle()
	 * @generated
	 */
	EAttribute getGridRectangle_Y();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.gridgame.model.GridRectangle#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see no.hal.gridgame.model.GridRectangle#getWidth()
	 * @see #getGridRectangle()
	 * @generated
	 */
	EAttribute getGridRectangle_Width();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.gridgame.model.GridRectangle#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see no.hal.gridgame.model.GridRectangle#getHeight()
	 * @see #getGridRectangle()
	 * @generated
	 */
	EAttribute getGridRectangle_Height();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.GridRectangle#setValues(int, int) <em>Set Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Values</em>' operation.
	 * @see no.hal.gridgame.model.GridRectangle#setValues(int, int)
	 * @generated
	 */
	EOperation getGridRectangle__SetValues__int_int();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.GridRectangle#setValues(int, int, int, int) <em>Set Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Values</em>' operation.
	 * @see no.hal.gridgame.model.GridRectangle#setValues(int, int, int, int)
	 * @generated
	 */
	EOperation getGridRectangle__SetValues__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.GridRectangle#setValues(no.hal.gridgame.model.GridRectangle) <em>Set Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Values</em>' operation.
	 * @see no.hal.gridgame.model.GridRectangle#setValues(no.hal.gridgame.model.GridRectangle)
	 * @generated
	 */
	EOperation getGridRectangle__SetValues__GridRectangle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link no.hal.gridgame.model.impl.UoDImpl <em>Uo D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.gridgame.model.impl.UoDImpl
		 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getUoD()
		 * @generated
		 */
		EClass UO_D = eINSTANCE.getUoD();
		/**
		 * The meta object literal for the '{@link no.hal.gridgame.model.impl.GridImpl <em>Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.gridgame.model.impl.GridImpl
		 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getGrid()
		 * @generated
		 */
		EClass GRID = eINSTANCE.getGrid();
		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__WIDTH = eINSTANCE.getGrid_Width();
		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__HEIGHT = eINSTANCE.getGrid_Height();
		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__VALUES = eINSTANCE.getGrid_Values();
		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__OBJECTS = eINSTANCE.getGrid_Objects();
		/**
		 * The meta object literal for the '<em><b>Grid Listeners</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__GRID_LISTENERS = eINSTANCE.getGrid_GridListeners();
		/**
		 * The meta object literal for the '<em><b>Get Grid Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID___GET_GRID_VALUE__INT_INT = eINSTANCE.getGrid__GetGridValue__int_int();
		/**
		 * The meta object literal for the '<em><b>Get Grid Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID___GET_GRID_OBJECT__INT_INT = eINSTANCE.getGrid__GetGridObject__int_int();
		/**
		 * The meta object literal for the '<em><b>Set Grid Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID___SET_GRID_VALUE__INT_INT_OBJECT = eINSTANCE.getGrid__SetGridValue__int_int_Object();
		/**
		 * The meta object literal for the '<em><b>Set Grid Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID___SET_GRID_OBJECT__INT_INT_EOBJECT = eINSTANCE.getGrid__SetGridObject__int_int_EObject();
		/**
		 * The meta object literal for the '<em><b>Create Grid Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID___CREATE_GRID_VALUE = eINSTANCE.getGrid__CreateGridValue();
		/**
		 * The meta object literal for the '<em><b>Create Grid Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID___CREATE_GRID_OBJECT = eINSTANCE.getGrid__CreateGridObject();
		/**
		 * The meta object literal for the '<em><b>Get Grid Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID___GET_GRID_VALUES__INT_INT_INT_INT = eINSTANCE.getGrid__GetGridValues__int_int_int_int();
		/**
		 * The meta object literal for the '<em><b>Get Grid Objects</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID___GET_GRID_OBJECTS__INT_INT_INT_INT = eINSTANCE.getGrid__GetGridObjects__int_int_int_int();
		/**
		 * The meta object literal for the '{@link no.hal.gridgame.model.GridListener <em>Grid Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.gridgame.model.GridListener
		 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getGridListener()
		 * @generated
		 */
		EClass GRID_LISTENER = eINSTANCE.getGridListener();
		/**
		 * The meta object literal for the '<em><b>Grid Changed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID_LISTENER___GRID_CHANGED__GRID_INT_INT_INT_INT = eINSTANCE.getGridListener__GridChanged__Grid_int_int_int_int();
		/**
		 * The meta object literal for the '{@link no.hal.gridgame.model.impl.GridGameImpl <em>Grid Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.gridgame.model.impl.GridGameImpl
		 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getGridGame()
		 * @generated
		 */
		EClass GRID_GAME = eINSTANCE.getGridGame();
		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_GAME__GRID = eINSTANCE.getGridGame_Grid();
		/**
		 * The meta object literal for the '<em><b>Undo Stack</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_GAME__UNDO_STACK = eINSTANCE.getGridGame_UndoStack();
		/**
		 * The meta object literal for the '<em><b>Redo Stack</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_GAME__REDO_STACK = eINSTANCE.getGridGame_RedoStack();
		/**
		 * The meta object literal for the '<em><b>Perform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID_GAME___PERFORM__GAMECOMMAND = eINSTANCE.getGridGame__Perform__GameCommand();
		/**
		 * The meta object literal for the '<em><b>Undo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID_GAME___UNDO = eINSTANCE.getGridGame__Undo();
		/**
		 * The meta object literal for the '<em><b>Redo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID_GAME___REDO = eINSTANCE.getGridGame__Redo();
		/**
		 * The meta object literal for the '<em><b>Is Finished</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID_GAME___IS_FINISHED = eINSTANCE.getGridGame__IsFinished();
		/**
		 * The meta object literal for the '{@link no.hal.gridgame.model.impl.GameCommandImpl <em>Game Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.gridgame.model.impl.GameCommandImpl
		 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getGameCommand()
		 * @generated
		 */
		EClass GAME_COMMAND = eINSTANCE.getGameCommand();
		/**
		 * The meta object literal for the '<em><b>Changes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_COMMAND__CHANGES = eINSTANCE.getGameCommand_Changes();
		/**
		 * The meta object literal for the '<em><b>Prepare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_COMMAND___PREPARE = eINSTANCE.getGameCommand__Prepare();
		/**
		 * The meta object literal for the '<em><b>Perform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_COMMAND___PERFORM = eINSTANCE.getGameCommand__Perform();
		/**
		 * The meta object literal for the '<em><b>Undo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_COMMAND___UNDO = eINSTANCE.getGameCommand__Undo();
		/**
		 * The meta object literal for the '<em><b>Redo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_COMMAND___REDO = eINSTANCE.getGameCommand__Redo();
		/**
		 * The meta object literal for the '{@link no.hal.gridgame.model.impl.CompositeCommandImpl <em>Composite Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.gridgame.model.impl.CompositeCommandImpl
		 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getCompositeCommand()
		 * @generated
		 */
		EClass COMPOSITE_COMMAND = eINSTANCE.getCompositeCommand();
		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_COMMAND__COMMANDS = eINSTANCE.getCompositeCommand_Commands();
		/**
		 * The meta object literal for the '{@link no.hal.gridgame.model.impl.GridChangeDescriptionImpl <em>Grid Change Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.gridgame.model.impl.GridChangeDescriptionImpl
		 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getGridChangeDescription()
		 * @generated
		 */
		EClass GRID_CHANGE_DESCRIPTION = eINSTANCE.getGridChangeDescription();
		/**
		 * The meta object literal for the '<em><b>Add Change</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID_CHANGE_DESCRIPTION___ADD_CHANGE__INT_INT = eINSTANCE.getGridChangeDescription__AddChange__int_int();
		/**
		 * The meta object literal for the '<em><b>Add Change</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID_CHANGE_DESCRIPTION___ADD_CHANGE__INT_INT_INT_INT = eINSTANCE.getGridChangeDescription__AddChange__int_int_int_int();
		/**
		 * The meta object literal for the '{@link no.hal.gridgame.model.impl.GridRectangleImpl <em>Grid Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.gridgame.model.impl.GridRectangleImpl
		 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getGridRectangle()
		 * @generated
		 */
		EClass GRID_RECTANGLE = eINSTANCE.getGridRectangle();
		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_RECTANGLE__X = eINSTANCE.getGridRectangle_X();
		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_RECTANGLE__Y = eINSTANCE.getGridRectangle_Y();
		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_RECTANGLE__WIDTH = eINSTANCE.getGridRectangle_Width();
		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_RECTANGLE__HEIGHT = eINSTANCE.getGridRectangle_Height();
		/**
		 * The meta object literal for the '<em><b>Set Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID_RECTANGLE___SET_VALUES__INT_INT = eINSTANCE.getGridRectangle__SetValues__int_int();
		/**
		 * The meta object literal for the '<em><b>Set Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID_RECTANGLE___SET_VALUES__INT_INT_INT_INT = eINSTANCE.getGridRectangle__SetValues__int_int_int_int();
		/**
		 * The meta object literal for the '<em><b>Set Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID_RECTANGLE___SET_VALUES__GRIDRECTANGLE = eINSTANCE.getGridRectangle__SetValues__GridRectangle();

	}

} //ModelPackage
