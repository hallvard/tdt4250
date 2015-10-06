/**
 */
package no.hal.pg.runtime.service.impl;

import no.hal.pg.runtime.RuntimePackage;

import no.hal.pg.runtime.service.GameService;
import no.hal.pg.runtime.service.PlayerService;
import no.hal.pg.runtime.service.ServiceFactory;
import no.hal.pg.runtime.service.ServicePackage;

import no.hal.pg.runtime.service.TaskService;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class ServicePackageImpl extends EPackageImpl implements ServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerServiceEClass = null;

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
	 * @see no.hal.pg.runtime.service.ServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServicePackageImpl() {
		super(eNS_URI, ServiceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServicePackage init() {
		if (isInited) return (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);

		// Obtain or create and register package
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServicePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServicePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RuntimePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theServicePackage.createPackageContents();

		// Initialize created meta-data
		theServicePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServicePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServicePackage.eNS_URI, theServicePackage);
		return theServicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameService() {
		return gameServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameService_Players() {
		return (EReference)gameServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameService_Tasks() {
		return (EReference)gameServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameService__GetTasks__Player() {
		return gameServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskService() {
		return taskServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskService_Players() {
		return (EReference)taskServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskService_Started() {
		return (EAttribute)taskServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskService_Finished() {
		return (EAttribute)taskServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskService_Result() {
		return (EAttribute)taskServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayerService() {
		return playerServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayerService_Name() {
		return (EAttribute)playerServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayerService_Tasks() {
		return (EReference)playerServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFactory getServiceFactory() {
		return (ServiceFactory)getEFactoryInstance();
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
		gameServiceEClass = createEClass(GAME_SERVICE);
		createEReference(gameServiceEClass, GAME_SERVICE__PLAYERS);
		createEReference(gameServiceEClass, GAME_SERVICE__TASKS);
		createEOperation(gameServiceEClass, GAME_SERVICE___GET_TASKS__PLAYER);

		taskServiceEClass = createEClass(TASK_SERVICE);
		createEReference(taskServiceEClass, TASK_SERVICE__PLAYERS);
		createEAttribute(taskServiceEClass, TASK_SERVICE__STARTED);
		createEAttribute(taskServiceEClass, TASK_SERVICE__FINISHED);
		createEAttribute(taskServiceEClass, TASK_SERVICE__RESULT);

		playerServiceEClass = createEClass(PLAYER_SERVICE);
		createEAttribute(playerServiceEClass, PLAYER_SERVICE__NAME);
		createEReference(playerServiceEClass, PLAYER_SERVICE__TASKS);
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
		RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theRuntimePackage.getService());
		EGenericType g2 = createEGenericType(theRuntimePackage.getGame());
		g1.getETypeArguments().add(g2);
		gameServiceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theRuntimePackage.getService());
		g2 = createEGenericType(theRuntimePackage.getTask());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		taskServiceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theRuntimePackage.getService());
		g2 = createEGenericType(theRuntimePackage.getPlayer());
		g1.getETypeArguments().add(g2);
		playerServiceEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(gameServiceEClass, GameService.class, "GameService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameService_Players(), theRuntimePackage.getPlayer(), null, "players", null, 0, -1, GameService.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theRuntimePackage.getTask());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getGameService_Tasks(), g1, null, "tasks", null, 0, -1, GameService.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getGameService__GetTasks__Player(), null, "getTasks", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theRuntimePackage.getTask());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(taskServiceEClass, TaskService.class, "TaskService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskService_Players(), theRuntimePackage.getPlayer(), null, "players", null, 0, -1, TaskService.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskService_Started(), ecorePackage.getEBoolean(), "started", null, 0, 1, TaskService.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskService_Finished(), ecorePackage.getEBoolean(), "finished", null, 0, 1, TaskService.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskService_Result(), ecorePackage.getEJavaObject(), "result", null, 0, 1, TaskService.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(playerServiceEClass, PlayerService.class, "PlayerService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayerService_Name(), ecorePackage.getEString(), "name", null, 0, 1, PlayerService.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theRuntimePackage.getTask());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getPlayerService_Tasks(), g1, null, "tasks", null, 0, -1, PlayerService.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ServicePackageImpl
