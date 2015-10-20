/**
 */
package no.hal.gridgame.model.impl;

import no.hal.gridgame.model.CompositeCommand;
import no.hal.gridgame.model.GameCommand;
import no.hal.gridgame.model.Grid;
import no.hal.gridgame.model.GridGame;
import no.hal.gridgame.model.ModelFactory;
import no.hal.gridgame.model.ModelPackage;
import no.hal.gridgame.model.UoD;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uoDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridGameEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeCommandEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see no.hal.gridgame.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUoD() {
		return uoDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrid() {
		return gridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrid_Width() {
		return (EAttribute)gridEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrid_Height() {
		return (EAttribute)gridEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrid_Elements() {
		return (EReference)gridEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGrid__GetGridElement__int_int() {
		return gridEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGrid__SetGridElement__int_int_GridElement() {
		return gridEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGrid__CreateGridElement__int_int() {
		return gridEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGrid__MoveGridElement__int_int_int_int_GridElement() {
		return gridEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridGame() {
		return gridGameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridGame_Grid() {
		return (EReference)gridGameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridGame_UndoStack() {
		return (EReference)gridGameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridGame_RedoStack() {
		return (EReference)gridGameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGridGame__Perform__GameCommand() {
		return gridGameEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGridGame__Undo() {
		return gridGameEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGridGame__Redo() {
		return gridGameEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGridGame__IsFinished() {
		return gridGameEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameCommand() {
		return gameCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameCommand__Prepare() {
		return gameCommandEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameCommand__Perform() {
		return gameCommandEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameCommand__Undo() {
		return gameCommandEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameCommand__Redo() {
		return gameCommandEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeCommand() {
		return compositeCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCommand_Commands() {
		return (EReference)compositeCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		uoDEClass = createEClass(UO_D);

		gridEClass = createEClass(GRID);
		createEAttribute(gridEClass, GRID__WIDTH);
		createEAttribute(gridEClass, GRID__HEIGHT);
		createEReference(gridEClass, GRID__ELEMENTS);
		createEOperation(gridEClass, GRID___GET_GRID_ELEMENT__INT_INT);
		createEOperation(gridEClass, GRID___SET_GRID_ELEMENT__INT_INT_GRIDELEMENT);
		createEOperation(gridEClass, GRID___CREATE_GRID_ELEMENT);
		createEOperation(gridEClass, GRID___MOVE_GRID_ELEMENT__INT_INT_INT_INT_GRIDELEMENT);

		gridGameEClass = createEClass(GRID_GAME);
		createEReference(gridGameEClass, GRID_GAME__GRID);
		createEReference(gridGameEClass, GRID_GAME__UNDO_STACK);
		createEReference(gridGameEClass, GRID_GAME__REDO_STACK);
		createEOperation(gridGameEClass, GRID_GAME___PERFORM__GAMECOMMAND);
		createEOperation(gridGameEClass, GRID_GAME___UNDO);
		createEOperation(gridGameEClass, GRID_GAME___REDO);
		createEOperation(gridGameEClass, GRID_GAME___IS_FINISHED);

		gameCommandEClass = createEClass(GAME_COMMAND);
		createEOperation(gameCommandEClass, GAME_COMMAND___PREPARE);
		createEOperation(gameCommandEClass, GAME_COMMAND___PERFORM);
		createEOperation(gameCommandEClass, GAME_COMMAND___UNDO);
		createEOperation(gameCommandEClass, GAME_COMMAND___REDO);

		compositeCommandEClass = createEClass(COMPOSITE_COMMAND);
		createEReference(compositeCommandEClass, COMPOSITE_COMMAND__COMMANDS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter gridEClass_E = addETypeParameter(gridEClass, "E");
		ETypeParameter gridGameEClass_E = addETypeParameter(gridGameEClass, "E");
		ETypeParameter gridGameEClass_C = addETypeParameter(gridGameEClass, "C");
		ETypeParameter compositeCommandEClass_C = addETypeParameter(compositeCommandEClass, "C");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(ecorePackage.getEObject());
		gridEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEObject());
		gridGameEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(this.getGameCommand());
		gridGameEClass_C.getEBounds().add(g1);
		g1 = createEGenericType(this.getGameCommand());
		compositeCommandEClass_C.getEBounds().add(g1);

		// Add supertypes to classes
		compositeCommandEClass.getESuperTypes().add(this.getGameCommand());

		// Initialize classes, features, and operations; add parameters
		initEClass(uoDEClass, UoD.class, "UoD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gridEClass, Grid.class, "Grid", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrid_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrid_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(gridEClass_E);
		initEReference(getGrid_Elements(), g1, null, "elements", null, 0, -1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getGrid__GetGridElement__int_int(), null, "getGridElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(gridEClass_E);
		initEOperation(op, g1);

		op = initEOperation(getGrid__SetGridElement__int_int_GridElement(), null, "setGridElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(gridEClass_E);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGrid__CreateGridElement__int_int(), null, "createGridElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(gridEClass_E);
		initEOperation(op, g1);

		op = initEOperation(getGrid__MoveGridElement__int_int_int_int_GridElement(), null, "moveGridElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y2", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(gridEClass_E);
		addEParameter(op, g1, "element", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(gridEClass_E);
		initEOperation(op, g1);

		initEClass(gridGameEClass, GridGame.class, "GridGame", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getGrid());
		EGenericType g2 = createEGenericType(gridGameEClass_E);
		g1.getETypeArguments().add(g2);
		initEReference(getGridGame_Grid(), g1, null, "grid", null, 0, 1, GridGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(gridGameEClass_C);
		initEReference(getGridGame_UndoStack(), g1, null, "undoStack", null, 0, -1, GridGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(gridGameEClass_C);
		initEReference(getGridGame_RedoStack(), g1, null, "redoStack", null, 0, -1, GridGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGridGame__Perform__GameCommand(), null, "perform", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(gridGameEClass_C);
		addEParameter(op, g1, "command", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGridGame__Undo(), null, "undo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGridGame__Redo(), null, "redo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGridGame__IsFinished(), ecorePackage.getEBoolean(), "isFinished", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gameCommandEClass, GameCommand.class, "GameCommand", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getGameCommand__Prepare(), ecorePackage.getEBoolean(), "prepare", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameCommand__Perform(), null, "perform", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameCommand__Undo(), null, "undo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameCommand__Redo(), null, "redo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compositeCommandEClass, CompositeCommand.class, "CompositeCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(compositeCommandEClass_C);
		initEReference(getCompositeCommand_Commands(), g1, null, "commands", null, 0, -1, CompositeCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
