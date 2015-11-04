/**
 */
package no.hal.pg.sokoban.runtime.impl;

import no.hal.pg.sokoban.model.ModelPackage;

import no.hal.pg.sokoban.runtime.GridRectangleValues;
import no.hal.pg.sokoban.runtime.RuntimeFactory;
import no.hal.pg.sokoban.runtime.RuntimePackage;
import no.hal.pg.sokoban.runtime.SokobanGameService;
import no.hal.pg.sokoban.runtime.SokobanGridService;
import no.hal.pg.sokoban.runtime.SokobanService;
import no.hal.pg.sokoban.runtime.SokobanTask;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimePackageImpl extends EPackageImpl implements RuntimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sokobanTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sokobanServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridRectangleValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sokobanGameServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sokobanGridServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sokobanResultEDataType = null;

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
	 * @see no.hal.pg.sokoban.runtime.RuntimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RuntimePackageImpl() {
		super(eNS_URI, RuntimeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RuntimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RuntimePackage init() {
		if (isInited) return (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Obtain or create and register package
		RuntimePackageImpl theRuntimePackage = (RuntimePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RuntimePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RuntimePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		no.hal.pg.runtime.RuntimePackage.eINSTANCE.eClass();
		ModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRuntimePackage.createPackageContents();

		// Initialize created meta-data
		theRuntimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRuntimePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RuntimePackage.eNS_URI, theRuntimePackage);
		return theRuntimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSokobanTask() {
		return sokobanTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSokobanTask_SokobanGame() {
		return (EReference)sokobanTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSokobanResult() {
		return sokobanResultEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSokobanService() {
		return sokobanServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSokobanService_SokobanGame() {
		return (EReference)sokobanServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridRectangleValues() {
		return gridRectangleValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridRectangleValues_Values() {
		return (EAttribute)gridRectangleValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSokobanGameService() {
		return sokobanGameServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSokobanGameService_Grid() {
		return (EReference)sokobanGameServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSokobanGameService__MovePlayer__String() {
		return sokobanGameServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSokobanGameService__MovePlayer__String_Boolean() {
		return sokobanGameServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSokobanGridService() {
		return sokobanGridServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSokobanGridService_Values() {
		return (EReference)sokobanGridServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSokobanGridService__GetGridValues__int_int_int_int_Boolean() {
		return sokobanGridServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSokobanGridService__GetGridValues__Boolean() {
		return sokobanGridServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeFactory getRuntimeFactory() {
		return (RuntimeFactory)getEFactoryInstance();
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
		sokobanTaskEClass = createEClass(SOKOBAN_TASK);
		createEReference(sokobanTaskEClass, SOKOBAN_TASK__SOKOBAN_GAME);

		sokobanServiceEClass = createEClass(SOKOBAN_SERVICE);
		createEReference(sokobanServiceEClass, SOKOBAN_SERVICE__SOKOBAN_GAME);

		gridRectangleValuesEClass = createEClass(GRID_RECTANGLE_VALUES);
		createEAttribute(gridRectangleValuesEClass, GRID_RECTANGLE_VALUES__VALUES);

		sokobanGameServiceEClass = createEClass(SOKOBAN_GAME_SERVICE);
		createEReference(sokobanGameServiceEClass, SOKOBAN_GAME_SERVICE__GRID);
		createEOperation(sokobanGameServiceEClass, SOKOBAN_GAME_SERVICE___MOVE_PLAYER__STRING);
		createEOperation(sokobanGameServiceEClass, SOKOBAN_GAME_SERVICE___MOVE_PLAYER__STRING_BOOLEAN);

		sokobanGridServiceEClass = createEClass(SOKOBAN_GRID_SERVICE);
		createEReference(sokobanGridServiceEClass, SOKOBAN_GRID_SERVICE__VALUES);
		createEOperation(sokobanGridServiceEClass, SOKOBAN_GRID_SERVICE___GET_GRID_VALUES__INT_INT_INT_INT_BOOLEAN);
		createEOperation(sokobanGridServiceEClass, SOKOBAN_GRID_SERVICE___GET_GRID_VALUES__BOOLEAN);

		// Create data types
		sokobanResultEDataType = createEDataType(SOKOBAN_RESULT);
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

		// Obtain other dependent packages
		no.hal.pg.runtime.RuntimePackage theRuntimePackage_1 = (no.hal.pg.runtime.RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(no.hal.pg.runtime.RuntimePackage.eNS_URI);
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		no.hal.sokoban.model.ModelPackage theModelPackage_1 = (no.hal.sokoban.model.ModelPackage)EPackage.Registry.INSTANCE.getEPackage(no.hal.sokoban.model.ModelPackage.eNS_URI);
		no.hal.gridgame.model.ModelPackage theModelPackage_2 = (no.hal.gridgame.model.ModelPackage)EPackage.Registry.INSTANCE.getEPackage(no.hal.gridgame.model.ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theRuntimePackage_1.getTask());
		EGenericType g2 = createEGenericType(theModelPackage.getSokobanTaskDef());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getSokobanResult());
		g1.getETypeArguments().add(g2);
		sokobanTaskEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theRuntimePackage_1.getService());
		g2 = createEGenericType(this.getSokobanTask());
		g1.getETypeArguments().add(g2);
		sokobanServiceEClass.getEGenericSuperTypes().add(g1);
		gridRectangleValuesEClass.getESuperTypes().add(theModelPackage_2.getGridRectangle());
		g1 = createEGenericType(theRuntimePackage_1.getService());
		g2 = createEGenericType(theModelPackage_1.getSokobanGame());
		g1.getETypeArguments().add(g2);
		sokobanGameServiceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theRuntimePackage_1.getService());
		g2 = createEGenericType(theModelPackage_1.getSokobanGrid());
		g1.getETypeArguments().add(g2);
		sokobanGridServiceEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(sokobanTaskEClass, SokobanTask.class, "SokobanTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSokobanTask_SokobanGame(), theModelPackage_1.getSokobanGame(), null, "sokobanGame", null, 0, 1, SokobanTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sokobanServiceEClass, SokobanService.class, "SokobanService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSokobanService_SokobanGame(), theModelPackage_1.getSokobanGame(), null, "sokobanGame", null, 0, 1, SokobanService.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(gridRectangleValuesEClass, GridRectangleValues.class, "GridRectangleValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGridRectangleValues_Values(), ecorePackage.getEString(), "values", null, 0, -1, GridRectangleValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sokobanGameServiceEClass, SokobanGameService.class, "SokobanGameService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSokobanGameService_Grid(), theModelPackage_1.getSokobanGrid(), null, "grid", null, 0, 1, SokobanGameService.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getSokobanGameService__MovePlayer__String(), theModelPackage_2.getGridChangeDescription(), "movePlayer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "direction", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSokobanGameService__MovePlayer__String_Boolean(), this.getGridRectangleValues(), "movePlayer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "direction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "stringFormat", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sokobanGridServiceEClass, SokobanGridService.class, "SokobanGridService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSokobanGridService_Values(), this.getGridRectangleValues(), null, "values", null, 0, 1, SokobanGridService.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSokobanGridService__GetGridValues__int_int_int_int_Boolean(), this.getGridRectangleValues(), "getGridValues", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "width", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "height", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "stringFormat", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSokobanGridService__GetGridValues__Boolean(), this.getGridRectangleValues(), "getGridValues", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "stringFormat", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(sokobanResultEDataType, no.hal.pg.sokoban.runtime.util.SokobanResult.class, "SokobanResult", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "pg-runtime", "../../no.hal.pg.runtime/model/pg-runtime.ecore#/",
			 "sokoban-model", "../../no.hal.sokoban.model/model/sokoban.ecore#/"
		   });
	}

} //RuntimePackageImpl
