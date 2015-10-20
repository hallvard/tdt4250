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
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Grid Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID___GET_GRID_ELEMENT__INT_INT = 0;

	/**
	 * The operation id for the '<em>Set Grid Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID___SET_GRID_ELEMENT__INT_INT_GRIDELEMENT = 1;

	/**
	 * The operation id for the '<em>Create Grid Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID___CREATE_GRID_ELEMENT = 2;

	/**
	 * The operation id for the '<em>Move Grid Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID___MOVE_GRID_ELEMENT__INT_INT_INT_INT_GRIDELEMENT = 3;

	/**
	 * The number of operations of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link no.hal.gridgame.model.impl.GridGameImpl <em>Grid Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.gridgame.model.impl.GridGameImpl
	 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getGridGame()
	 * @generated
	 */
	int GRID_GAME = 2;

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
	 * The meta object id for the '{@link no.hal.gridgame.model.GameCommand <em>Game Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.gridgame.model.GameCommand
	 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getGameCommand()
	 * @generated
	 */
	int GAME_COMMAND = 3;

	/**
	 * The number of structural features of the '<em>Game Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_COMMAND_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Prepare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_COMMAND___PREPARE = 0;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_COMMAND___PERFORM = 1;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_COMMAND___UNDO = 2;

	/**
	 * The operation id for the '<em>Redo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_COMMAND___REDO = 3;

	/**
	 * The number of operations of the '<em>Game Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_COMMAND_OPERATION_COUNT = 4;


	/**
	 * The meta object id for the '{@link no.hal.gridgame.model.impl.CompositeCommandImpl <em>Composite Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.gridgame.model.impl.CompositeCommandImpl
	 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getCompositeCommand()
	 * @generated
	 */
	int COMPOSITE_COMMAND = 4;

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
	 * Returns the meta object for the containment reference list '{@link no.hal.gridgame.model.Grid#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see no.hal.gridgame.model.Grid#getElements()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Elements();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.Grid#getGridElement(int, int) <em>Get Grid Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Grid Element</em>' operation.
	 * @see no.hal.gridgame.model.Grid#getGridElement(int, int)
	 * @generated
	 */
	EOperation getGrid__GetGridElement__int_int();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.Grid#setGridElement(int, int, org.eclipse.emf.ecore.EObject) <em>Set Grid Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Grid Element</em>' operation.
	 * @see no.hal.gridgame.model.Grid#setGridElement(int, int, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getGrid__SetGridElement__int_int_GridElement();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.Grid#createGridElement() <em>Create Grid Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Grid Element</em>' operation.
	 * @see no.hal.gridgame.model.Grid#createGridElement()
	 * @generated
	 */
	EOperation getGrid__CreateGridElement__int_int();

	/**
	 * Returns the meta object for the '{@link no.hal.gridgame.model.Grid#moveGridElement(int, int, int, int, org.eclipse.emf.ecore.EObject) <em>Move Grid Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Grid Element</em>' operation.
	 * @see no.hal.gridgame.model.Grid#moveGridElement(int, int, int, int, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getGrid__MoveGridElement__int_int_int_int_GridElement();

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
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__ELEMENTS = eINSTANCE.getGrid_Elements();
		/**
		 * The meta object literal for the '<em><b>Get Grid Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID___GET_GRID_ELEMENT__INT_INT = eINSTANCE.getGrid__GetGridElement__int_int();
		/**
		 * The meta object literal for the '<em><b>Set Grid Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID___SET_GRID_ELEMENT__INT_INT_GRIDELEMENT = eINSTANCE.getGrid__SetGridElement__int_int_GridElement();
		/**
		 * The meta object literal for the '<em><b>Create Grid Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID___CREATE_GRID_ELEMENT = eINSTANCE.getGrid__CreateGridElement__int_int();
		/**
		 * The meta object literal for the '<em><b>Move Grid Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID___MOVE_GRID_ELEMENT__INT_INT_INT_INT_GRIDELEMENT = eINSTANCE.getGrid__MoveGridElement__int_int_int_int_GridElement();
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
		 * The meta object literal for the '{@link no.hal.gridgame.model.GameCommand <em>Game Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.gridgame.model.GameCommand
		 * @see no.hal.gridgame.model.impl.ModelPackageImpl#getGameCommand()
		 * @generated
		 */
		EClass GAME_COMMAND = eINSTANCE.getGameCommand();
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

	}

} //ModelPackage
