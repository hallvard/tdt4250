/**
 */
package no.hal.sokoban.model;

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
 * @see no.hal.sokoban.model.ModelFactory
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
	String eNS_URI = "platform:/plugin/no.hal.sokoban.model/model/sokoban.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sokoban-model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = no.hal.sokoban.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.sokoban.model.impl.UoDImpl <em>Uo D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.sokoban.model.impl.UoDImpl
	 * @see no.hal.sokoban.model.impl.ModelPackageImpl#getUoD()
	 * @generated
	 */
	int UO_D = 0;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_D__LEVELS = 0;

	/**
	 * The feature id for the '<em><b>Game</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_D__GAME = 1;

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
	 * The meta object id for the '{@link no.hal.sokoban.model.impl.SokobanGridImpl <em>Sokoban Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.sokoban.model.impl.SokobanGridImpl
	 * @see no.hal.sokoban.model.impl.ModelPackageImpl#getSokobanGrid()
	 * @generated
	 */
	int SOKOBAN_GRID = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID__WIDTH = no.hal.gridgame.model.ModelPackage.GRID__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID__HEIGHT = no.hal.gridgame.model.ModelPackage.GRID__HEIGHT;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID__VALUES = no.hal.gridgame.model.ModelPackage.GRID__VALUES;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID__OBJECTS = no.hal.gridgame.model.ModelPackage.GRID__OBJECTS;

	/**
	 * The feature id for the '<em><b>Grid Listeners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID__GRID_LISTENERS = no.hal.gridgame.model.ModelPackage.GRID__GRID_LISTENERS;

	/**
	 * The feature id for the '<em><b>Player X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID__PLAYER_X = no.hal.gridgame.model.ModelPackage.GRID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Player Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID__PLAYER_Y = no.hal.gridgame.model.ModelPackage.GRID_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sokoban Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID_FEATURE_COUNT = no.hal.gridgame.model.ModelPackage.GRID_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Grid Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID___GET_GRID_VALUE__INT_INT = no.hal.gridgame.model.ModelPackage.GRID___GET_GRID_VALUE__INT_INT;

	/**
	 * The operation id for the '<em>Get Grid Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID___GET_GRID_OBJECT__INT_INT = no.hal.gridgame.model.ModelPackage.GRID___GET_GRID_OBJECT__INT_INT;

	/**
	 * The operation id for the '<em>Set Grid Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID___SET_GRID_VALUE__INT_INT_OBJECT = no.hal.gridgame.model.ModelPackage.GRID___SET_GRID_VALUE__INT_INT_OBJECT;

	/**
	 * The operation id for the '<em>Set Grid Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID___SET_GRID_OBJECT__INT_INT_EOBJECT = no.hal.gridgame.model.ModelPackage.GRID___SET_GRID_OBJECT__INT_INT_EOBJECT;

	/**
	 * The operation id for the '<em>Create Grid Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID___CREATE_GRID_VALUE = no.hal.gridgame.model.ModelPackage.GRID___CREATE_GRID_VALUE;

	/**
	 * The operation id for the '<em>Create Grid Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID___CREATE_GRID_OBJECT = no.hal.gridgame.model.ModelPackage.GRID___CREATE_GRID_OBJECT;

	/**
	 * The operation id for the '<em>Get Grid Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID___GET_GRID_VALUES__INT_INT_INT_INT = no.hal.gridgame.model.ModelPackage.GRID___GET_GRID_VALUES__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Get Grid Objects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID___GET_GRID_OBJECTS__INT_INT_INT_INT = no.hal.gridgame.model.ModelPackage.GRID___GET_GRID_OBJECTS__INT_INT_INT_INT;

	/**
	 * The number of operations of the '<em>Sokoban Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GRID_OPERATION_COUNT = no.hal.gridgame.model.ModelPackage.GRID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.sokoban.model.impl.SokobanGameImpl <em>Sokoban Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.sokoban.model.impl.SokobanGameImpl
	 * @see no.hal.sokoban.model.impl.ModelPackageImpl#getSokobanGame()
	 * @generated
	 */
	int SOKOBAN_GAME = 2;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GAME__GRID = no.hal.gridgame.model.ModelPackage.GRID_GAME__GRID;

	/**
	 * The feature id for the '<em><b>Undo Stack</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GAME__UNDO_STACK = no.hal.gridgame.model.ModelPackage.GRID_GAME__UNDO_STACK;

	/**
	 * The feature id for the '<em><b>Redo Stack</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GAME__REDO_STACK = no.hal.gridgame.model.ModelPackage.GRID_GAME__REDO_STACK;

	/**
	 * The number of structural features of the '<em>Sokoban Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GAME_FEATURE_COUNT = no.hal.gridgame.model.ModelPackage.GRID_GAME_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GAME___PERFORM__GAMECOMMAND = no.hal.gridgame.model.ModelPackage.GRID_GAME___PERFORM__GAMECOMMAND;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GAME___UNDO = no.hal.gridgame.model.ModelPackage.GRID_GAME___UNDO;

	/**
	 * The operation id for the '<em>Redo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GAME___REDO = no.hal.gridgame.model.ModelPackage.GRID_GAME___REDO;

	/**
	 * The operation id for the '<em>Is Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GAME___IS_FINISHED = no.hal.gridgame.model.ModelPackage.GRID_GAME___IS_FINISHED;

	/**
	 * The number of operations of the '<em>Sokoban Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_GAME_OPERATION_COUNT = no.hal.gridgame.model.ModelPackage.GRID_GAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.sokoban.model.impl.MovePlayerCommandImpl <em>Move Player Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.sokoban.model.impl.MovePlayerCommandImpl
	 * @see no.hal.sokoban.model.impl.ModelPackageImpl#getMovePlayerCommand()
	 * @generated
	 */
	int MOVE_PLAYER_COMMAND = 3;

	/**
	 * The feature id for the '<em><b>Changes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_PLAYER_COMMAND__CHANGES = no.hal.gridgame.model.ModelPackage.GAME_COMMAND__CHANGES;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_PLAYER_COMMAND__GRID = no.hal.gridgame.model.ModelPackage.GAME_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_PLAYER_COMMAND__DIRECTION = no.hal.gridgame.model.ModelPackage.GAME_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Push</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_PLAYER_COMMAND__PUSH = no.hal.gridgame.model.ModelPackage.GAME_COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Move Player Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_PLAYER_COMMAND_FEATURE_COUNT = no.hal.gridgame.model.ModelPackage.GAME_COMMAND_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Grid Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_PLAYER_COMMAND___GRID_CHANGED__GRID_INT_INT_INT_INT = no.hal.gridgame.model.ModelPackage.GAME_COMMAND___GRID_CHANGED__GRID_INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Prepare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_PLAYER_COMMAND___PREPARE = no.hal.gridgame.model.ModelPackage.GAME_COMMAND___PREPARE;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_PLAYER_COMMAND___PERFORM = no.hal.gridgame.model.ModelPackage.GAME_COMMAND___PERFORM;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_PLAYER_COMMAND___UNDO = no.hal.gridgame.model.ModelPackage.GAME_COMMAND___UNDO;

	/**
	 * The operation id for the '<em>Redo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_PLAYER_COMMAND___REDO = no.hal.gridgame.model.ModelPackage.GAME_COMMAND___REDO;

	/**
	 * The number of operations of the '<em>Move Player Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_PLAYER_COMMAND_OPERATION_COUNT = no.hal.gridgame.model.ModelPackage.GAME_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.sokoban.model.impl.SokobanLevelImpl <em>Sokoban Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.sokoban.model.impl.SokobanLevelImpl
	 * @see no.hal.sokoban.model.impl.ModelPackageImpl#getSokobanLevel()
	 * @generated
	 */
	int SOKOBAN_LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_LEVEL__LINES = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_LEVEL__PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Character Mappings</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_LEVEL__CHARACTER_MAPPINGS = 2;

	/**
	 * The number of structural features of the '<em>Sokoban Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_LEVEL_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Create Grid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_LEVEL___CREATE_GRID = 0;

	/**
	 * The number of operations of the '<em>Sokoban Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_LEVEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.hal.sokoban.model.impl.String2StringMapEntryImpl <em>String2 String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.sokoban.model.impl.String2StringMapEntryImpl
	 * @see no.hal.sokoban.model.impl.ModelPackageImpl#getString2StringMapEntry()
	 * @generated
	 */
	int STRING2_STRING_MAP_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING2_STRING_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING2_STRING_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String2 String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING2_STRING_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String2 String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING2_STRING_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Cell</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.sokoban.util.Cell
	 * @see no.hal.sokoban.model.impl.ModelPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 6;

	/**
	 * The meta object id for the '<em>Direction</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.sokoban.util.Direction
	 * @see no.hal.sokoban.model.impl.ModelPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 7;


	/**
	 * Returns the meta object for class '{@link no.hal.sokoban.model.UoD <em>Uo D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uo D</em>'.
	 * @see no.hal.sokoban.model.UoD
	 * @generated
	 */
	EClass getUoD();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.sokoban.model.UoD#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see no.hal.sokoban.model.UoD#getLevels()
	 * @see #getUoD()
	 * @generated
	 */
	EReference getUoD_Levels();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.sokoban.model.UoD#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Game</em>'.
	 * @see no.hal.sokoban.model.UoD#getGame()
	 * @see #getUoD()
	 * @generated
	 */
	EReference getUoD_Game();

	/**
	 * Returns the meta object for class '{@link no.hal.sokoban.model.SokobanGrid <em>Sokoban Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sokoban Grid</em>'.
	 * @see no.hal.sokoban.model.SokobanGrid
	 * @generated
	 */
	EClass getSokobanGrid();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.sokoban.model.SokobanGrid#getPlayerX <em>Player X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Player X</em>'.
	 * @see no.hal.sokoban.model.SokobanGrid#getPlayerX()
	 * @see #getSokobanGrid()
	 * @generated
	 */
	EAttribute getSokobanGrid_PlayerX();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.sokoban.model.SokobanGrid#getPlayerY <em>Player Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Player Y</em>'.
	 * @see no.hal.sokoban.model.SokobanGrid#getPlayerY()
	 * @see #getSokobanGrid()
	 * @generated
	 */
	EAttribute getSokobanGrid_PlayerY();

	/**
	 * Returns the meta object for class '{@link no.hal.sokoban.model.SokobanGame <em>Sokoban Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sokoban Game</em>'.
	 * @see no.hal.sokoban.model.SokobanGame
	 * @generated
	 */
	EClass getSokobanGame();

	/**
	 * Returns the meta object for class '{@link no.hal.sokoban.model.MovePlayerCommand <em>Move Player Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Player Command</em>'.
	 * @see no.hal.sokoban.model.MovePlayerCommand
	 * @generated
	 */
	EClass getMovePlayerCommand();

	/**
	 * Returns the meta object for the reference '{@link no.hal.sokoban.model.MovePlayerCommand#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grid</em>'.
	 * @see no.hal.sokoban.model.MovePlayerCommand#getGrid()
	 * @see #getMovePlayerCommand()
	 * @generated
	 */
	EReference getMovePlayerCommand_Grid();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.sokoban.model.MovePlayerCommand#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see no.hal.sokoban.model.MovePlayerCommand#getDirection()
	 * @see #getMovePlayerCommand()
	 * @generated
	 */
	EAttribute getMovePlayerCommand_Direction();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.sokoban.model.MovePlayerCommand#isPush <em>Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Push</em>'.
	 * @see no.hal.sokoban.model.MovePlayerCommand#isPush()
	 * @see #getMovePlayerCommand()
	 * @generated
	 */
	EAttribute getMovePlayerCommand_Push();

	/**
	 * Returns the meta object for class '{@link no.hal.sokoban.model.SokobanLevel <em>Sokoban Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sokoban Level</em>'.
	 * @see no.hal.sokoban.model.SokobanLevel
	 * @generated
	 */
	EClass getSokobanLevel();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.sokoban.model.SokobanLevel#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lines</em>'.
	 * @see no.hal.sokoban.model.SokobanLevel#getLines()
	 * @see #getSokobanLevel()
	 * @generated
	 */
	EAttribute getSokobanLevel_Lines();

	/**
	 * Returns the meta object for the map '{@link no.hal.sokoban.model.SokobanLevel#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Properties</em>'.
	 * @see no.hal.sokoban.model.SokobanLevel#getProperties()
	 * @see #getSokobanLevel()
	 * @generated
	 */
	EReference getSokobanLevel_Properties();

	/**
	 * Returns the meta object for the map '{@link no.hal.sokoban.model.SokobanLevel#getCharacterMappings <em>Character Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Character Mappings</em>'.
	 * @see no.hal.sokoban.model.SokobanLevel#getCharacterMappings()
	 * @see #getSokobanLevel()
	 * @generated
	 */
	EReference getSokobanLevel_CharacterMappings();

	/**
	 * Returns the meta object for the '{@link no.hal.sokoban.model.SokobanLevel#createGrid() <em>Create Grid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Grid</em>' operation.
	 * @see no.hal.sokoban.model.SokobanLevel#createGrid()
	 * @generated
	 */
	EOperation getSokobanLevel__CreateGrid();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String2 String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String2 String Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getString2StringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getString2StringMapEntry()
	 * @generated
	 */
	EAttribute getString2StringMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getString2StringMapEntry()
	 * @generated
	 */
	EAttribute getString2StringMapEntry_Value();

	/**
	 * Returns the meta object for data type '{@link no.hal.sokoban.util.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cell</em>'.
	 * @see no.hal.sokoban.util.Cell
	 * @model instanceClass="no.hal.sokoban.util.Cell"
	 * @generated
	 */
	EDataType getCell();

	/**
	 * Returns the meta object for data type '{@link no.hal.sokoban.util.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Direction</em>'.
	 * @see no.hal.sokoban.util.Direction
	 * @model instanceClass="no.hal.sokoban.util.Direction"
	 * @generated
	 */
	EDataType getDirection();

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
		 * The meta object literal for the '{@link no.hal.sokoban.model.impl.UoDImpl <em>Uo D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.sokoban.model.impl.UoDImpl
		 * @see no.hal.sokoban.model.impl.ModelPackageImpl#getUoD()
		 * @generated
		 */
		EClass UO_D = eINSTANCE.getUoD();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UO_D__LEVELS = eINSTANCE.getUoD_Levels();

		/**
		 * The meta object literal for the '<em><b>Game</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UO_D__GAME = eINSTANCE.getUoD_Game();

		/**
		 * The meta object literal for the '{@link no.hal.sokoban.model.impl.SokobanGridImpl <em>Sokoban Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.sokoban.model.impl.SokobanGridImpl
		 * @see no.hal.sokoban.model.impl.ModelPackageImpl#getSokobanGrid()
		 * @generated
		 */
		EClass SOKOBAN_GRID = eINSTANCE.getSokobanGrid();

		/**
		 * The meta object literal for the '<em><b>Player X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOKOBAN_GRID__PLAYER_X = eINSTANCE.getSokobanGrid_PlayerX();

		/**
		 * The meta object literal for the '<em><b>Player Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOKOBAN_GRID__PLAYER_Y = eINSTANCE.getSokobanGrid_PlayerY();

		/**
		 * The meta object literal for the '{@link no.hal.sokoban.model.impl.SokobanGameImpl <em>Sokoban Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.sokoban.model.impl.SokobanGameImpl
		 * @see no.hal.sokoban.model.impl.ModelPackageImpl#getSokobanGame()
		 * @generated
		 */
		EClass SOKOBAN_GAME = eINSTANCE.getSokobanGame();

		/**
		 * The meta object literal for the '{@link no.hal.sokoban.model.impl.MovePlayerCommandImpl <em>Move Player Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.sokoban.model.impl.MovePlayerCommandImpl
		 * @see no.hal.sokoban.model.impl.ModelPackageImpl#getMovePlayerCommand()
		 * @generated
		 */
		EClass MOVE_PLAYER_COMMAND = eINSTANCE.getMovePlayerCommand();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_PLAYER_COMMAND__GRID = eINSTANCE.getMovePlayerCommand_Grid();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_PLAYER_COMMAND__DIRECTION = eINSTANCE.getMovePlayerCommand_Direction();

		/**
		 * The meta object literal for the '<em><b>Push</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_PLAYER_COMMAND__PUSH = eINSTANCE.getMovePlayerCommand_Push();

		/**
		 * The meta object literal for the '{@link no.hal.sokoban.model.impl.SokobanLevelImpl <em>Sokoban Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.sokoban.model.impl.SokobanLevelImpl
		 * @see no.hal.sokoban.model.impl.ModelPackageImpl#getSokobanLevel()
		 * @generated
		 */
		EClass SOKOBAN_LEVEL = eINSTANCE.getSokobanLevel();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOKOBAN_LEVEL__LINES = eINSTANCE.getSokobanLevel_Lines();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOKOBAN_LEVEL__PROPERTIES = eINSTANCE.getSokobanLevel_Properties();

		/**
		 * The meta object literal for the '<em><b>Character Mappings</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOKOBAN_LEVEL__CHARACTER_MAPPINGS = eINSTANCE.getSokobanLevel_CharacterMappings();

		/**
		 * The meta object literal for the '<em><b>Create Grid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOKOBAN_LEVEL___CREATE_GRID = eINSTANCE.getSokobanLevel__CreateGrid();

		/**
		 * The meta object literal for the '{@link no.hal.sokoban.model.impl.String2StringMapEntryImpl <em>String2 String Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.sokoban.model.impl.String2StringMapEntryImpl
		 * @see no.hal.sokoban.model.impl.ModelPackageImpl#getString2StringMapEntry()
		 * @generated
		 */
		EClass STRING2_STRING_MAP_ENTRY = eINSTANCE.getString2StringMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING2_STRING_MAP_ENTRY__KEY = eINSTANCE.getString2StringMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING2_STRING_MAP_ENTRY__VALUE = eINSTANCE.getString2StringMapEntry_Value();

		/**
		 * The meta object literal for the '<em>Cell</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.sokoban.util.Cell
		 * @see no.hal.sokoban.model.impl.ModelPackageImpl#getCell()
		 * @generated
		 */
		EDataType CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em>Direction</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.sokoban.util.Direction
		 * @see no.hal.sokoban.model.impl.ModelPackageImpl#getDirection()
		 * @generated
		 */
		EDataType DIRECTION = eINSTANCE.getDirection();

	}

} //ModelPackage
