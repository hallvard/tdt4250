/**
 */
package no.hal.sokoban.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	 * The meta object id for the '<em>Cell</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.sokoban.util.Cell
	 * @see no.hal.sokoban.model.impl.ModelPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 4;

	/**
	 * The meta object id for the '<em>Direction</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.sokoban.util.Direction
	 * @see no.hal.sokoban.model.impl.ModelPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 5;


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
		 * The meta object literal for the '<em><b>Push</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_PLAYER_COMMAND__PUSH = eINSTANCE.getMovePlayerCommand_Push();
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
