/**
 */
package no.hal.pg.runtime.engine.tests;

import no.hal.pg.runtime.RuntimePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see no.hal.pg.runtime.engine.tests.TestsFactory
 * @model kind="package"
 * @generated
 */
public class TestsPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "tests";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "platform:/plugin/no.hal.pg.runtime.tests/src/no/hal/pg/runtime/engine/tests/tests.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "tests";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestsPackage eINSTANCE = no.hal.pg.runtime.engine.tests.TestsPackage.init();

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.engine.tests.Container <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.engine.tests.Container
	 * @see no.hal.pg.runtime.engine.tests.TestsPackage#getContainer()
	 * @generated
	 */
	public static final int CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Simple1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER__SIMPLE1 = 0;

	/**
	 * The feature id for the '<em><b>Simples2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER__SIMPLES2 = 1;

	/**
	 * The feature id for the '<em><b>Int1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER__INT1 = 2;

	/**
	 * The feature id for the '<em><b>String1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER__STRING1 = 3;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.engine.tests.Simple1 <em>Simple1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.engine.tests.Simple1
	 * @see no.hal.pg.runtime.engine.tests.TestsPackage#getSimple1()
	 * @generated
	 */
	public static final int SIMPLE1 = 1;

	/**
	 * The feature id for the '<em><b>Simples2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE1__SIMPLES2 = 0;

	/**
	 * The feature id for the '<em><b>String11</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE1__STRING11 = 1;

	/**
	 * The number of structural features of the '<em>Simple1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Simple1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.engine.tests.Simple2 <em>Simple2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.engine.tests.Simple2
	 * @see no.hal.pg.runtime.engine.tests.TestsPackage#getSimple2()
	 * @generated
	 */
	public static final int SIMPLE2 = 2;

	/**
	 * The feature id for the '<em><b>Int21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE2__INT21 = 0;

	/**
	 * The feature id for the '<em><b>String21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE2__STRING21 = 1;

	/**
	 * The number of structural features of the '<em>Simple2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE2_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Simple2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.engine.tests.ContainerService <em>Container Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.engine.tests.ContainerService
	 * @see no.hal.pg.runtime.engine.tests.TestsPackage#getContainerService()
	 * @generated
	 */
	public static final int CONTAINER_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER_SERVICE__CONTEXT = RuntimePackage.SERVICE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Simple1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER_SERVICE__SIMPLE1 = RuntimePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Int1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER_SERVICE__INT1 = RuntimePackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER_SERVICE_FEATURE_COUNT = RuntimePackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Simples2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER_SERVICE___GET_SIMPLES2__STRING = RuntimePackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Container Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER_SERVICE_OPERATION_COUNT = RuntimePackage.SERVICE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.engine.tests.Simple2Service <em>Simple2 Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.engine.tests.Simple2Service
	 * @see no.hal.pg.runtime.engine.tests.TestsPackage#getSimple2Service()
	 * @generated
	 */
	public static final int SIMPLE2_SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE2_SERVICE__CONTEXT = RuntimePackage.SERVICE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Int1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE2_SERVICE__INT1 = RuntimePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE2_SERVICE__STRING21 = RuntimePackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple2 Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE2_SERVICE_FEATURE_COUNT = RuntimePackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE2_SERVICE___ADD1 = RuntimePackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE2_SERVICE___ADD__INT = RuntimePackage.SERVICE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple2 Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE2_SERVICE_OPERATION_COUNT = RuntimePackage.SERVICE_OPERATION_COUNT + 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simple1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simple2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simple2ServiceEClass = null;

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
	 * @see no.hal.pg.runtime.engine.tests.TestsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestsPackage() {
		super(eNS_URI, TestsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TestsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestsPackage init() {
		if (isInited) return (TestsPackage)EPackage.Registry.INSTANCE.getEPackage(TestsPackage.eNS_URI);

		// Obtain or create and register package
		TestsPackage theTestsPackage = (TestsPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TestsPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TestsPackage());

		isInited = true;

		// Initialize simple dependencies
		RuntimePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTestsPackage.createPackageContents();

		// Initialize created meta-data
		theTestsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestsPackage.eNS_URI, theTestsPackage);
		return theTestsPackage;
	}


	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.engine.tests.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see no.hal.pg.runtime.engine.tests.Container
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link no.hal.pg.runtime.engine.tests.Container#getSimple1 <em>Simple1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple1</em>'.
	 * @see no.hal.pg.runtime.engine.tests.Container#getSimple1()
	 * @see #getContainer()
	 * @generated
	 */
	public EReference getContainer_Simple1() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.engine.tests.Container#getSimples2 <em>Simples2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simples2</em>'.
	 * @see no.hal.pg.runtime.engine.tests.Container#getSimples2()
	 * @see #getContainer()
	 * @generated
	 */
	public EReference getContainer_Simples2() {
		return (EReference)containerEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.engine.tests.Container#getInt1 <em>Int1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int1</em>'.
	 * @see no.hal.pg.runtime.engine.tests.Container#getInt1()
	 * @see #getContainer()
	 * @generated
	 */
	public EAttribute getContainer_Int1() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.engine.tests.Container#getString1 <em>String1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String1</em>'.
	 * @see no.hal.pg.runtime.engine.tests.Container#getString1()
	 * @see #getContainer()
	 * @generated
	 */
	public EAttribute getContainer_String1() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.engine.tests.Simple1 <em>Simple1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple1</em>'.
	 * @see no.hal.pg.runtime.engine.tests.Simple1
	 * @generated
	 */
	public EClass getSimple1() {
		return simple1EClass;
	}


	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.runtime.engine.tests.Simple1#getSimples2 <em>Simples2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simples2</em>'.
	 * @see no.hal.pg.runtime.engine.tests.Simple1#getSimples2()
	 * @see #getSimple1()
	 * @generated
	 */
	public EReference getSimple1_Simples2() {
		return (EReference)simple1EClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.engine.tests.Simple1#getString11 <em>String11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String11</em>'.
	 * @see no.hal.pg.runtime.engine.tests.Simple1#getString11()
	 * @see #getSimple1()
	 * @generated
	 */
	public EAttribute getSimple1_String11() {
		return (EAttribute)simple1EClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.engine.tests.Simple2 <em>Simple2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple2</em>'.
	 * @see no.hal.pg.runtime.engine.tests.Simple2
	 * @generated
	 */
	public EClass getSimple2() {
		return simple2EClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.engine.tests.Simple2#getInt21 <em>Int21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int21</em>'.
	 * @see no.hal.pg.runtime.engine.tests.Simple2#getInt21()
	 * @see #getSimple2()
	 * @generated
	 */
	public EAttribute getSimple2_Int21() {
		return (EAttribute)simple2EClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.engine.tests.Simple2#getString21 <em>String21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String21</em>'.
	 * @see no.hal.pg.runtime.engine.tests.Simple2#getString21()
	 * @see #getSimple2()
	 * @generated
	 */
	public EAttribute getSimple2_String21() {
		return (EAttribute)simple2EClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.engine.tests.ContainerService <em>Container Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Service</em>'.
	 * @see no.hal.pg.runtime.engine.tests.ContainerService
	 * @generated
	 */
	public EClass getContainerService() {
		return containerServiceEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.runtime.engine.tests.ContainerService#getSimple1 <em>Simple1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simple1</em>'.
	 * @see no.hal.pg.runtime.engine.tests.ContainerService#getSimple1()
	 * @see #getContainerService()
	 * @generated
	 */
	public EReference getContainerService_Simple1() {
		return (EReference)containerServiceEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.engine.tests.ContainerService#getInt1 <em>Int1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int1</em>'.
	 * @see no.hal.pg.runtime.engine.tests.ContainerService#getInt1()
	 * @see #getContainerService()
	 * @generated
	 */
	public EAttribute getContainerService_Int1() {
		return (EAttribute)containerServiceEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.engine.tests.ContainerService#getSimples2(java.lang.String) <em>Get Simples2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simples2</em>' operation.
	 * @see no.hal.pg.runtime.engine.tests.ContainerService#getSimples2(java.lang.String)
	 * @generated
	 */
	public EOperation getContainerService__GetSimples2__String() {
		return containerServiceEClass.getEOperations().get(0);
	}


	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.engine.tests.Simple2Service <em>Simple2 Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple2 Service</em>'.
	 * @see no.hal.pg.runtime.engine.tests.Simple2Service
	 * @generated
	 */
	public EClass getSimple2Service() {
		return simple2ServiceEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.engine.tests.Simple2Service#getInt1 <em>Int1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int1</em>'.
	 * @see no.hal.pg.runtime.engine.tests.Simple2Service#getInt1()
	 * @see #getSimple2Service()
	 * @generated
	 */
	public EAttribute getSimple2Service_Int1() {
		return (EAttribute)simple2ServiceEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.engine.tests.Simple2Service#getString21 <em>String21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String21</em>'.
	 * @see no.hal.pg.runtime.engine.tests.Simple2Service#getString21()
	 * @see #getSimple2Service()
	 * @generated
	 */
	public EAttribute getSimple2Service_String21() {
		return (EAttribute)simple2ServiceEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.engine.tests.Simple2Service#add1() <em>Add1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add1</em>' operation.
	 * @see no.hal.pg.runtime.engine.tests.Simple2Service#add1()
	 * @generated
	 */
	public EOperation getSimple2Service__Add1() {
		return simple2ServiceEClass.getEOperations().get(0);
	}


	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.engine.tests.Simple2Service#add(int) <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see no.hal.pg.runtime.engine.tests.Simple2Service#add(int)
	 * @generated
	 */
	public EOperation getSimple2Service__Add__int() {
		return simple2ServiceEClass.getEOperations().get(1);
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TestsFactory getTestsFactory() {
		return (TestsFactory)getEFactoryInstance();
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
		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__SIMPLE1);
		createEReference(containerEClass, CONTAINER__SIMPLES2);
		createEAttribute(containerEClass, CONTAINER__INT1);
		createEAttribute(containerEClass, CONTAINER__STRING1);

		simple1EClass = createEClass(SIMPLE1);
		createEReference(simple1EClass, SIMPLE1__SIMPLES2);
		createEAttribute(simple1EClass, SIMPLE1__STRING11);

		simple2EClass = createEClass(SIMPLE2);
		createEAttribute(simple2EClass, SIMPLE2__INT21);
		createEAttribute(simple2EClass, SIMPLE2__STRING21);

		containerServiceEClass = createEClass(CONTAINER_SERVICE);
		createEReference(containerServiceEClass, CONTAINER_SERVICE__SIMPLE1);
		createEAttribute(containerServiceEClass, CONTAINER_SERVICE__INT1);
		createEOperation(containerServiceEClass, CONTAINER_SERVICE___GET_SIMPLES2__STRING);

		simple2ServiceEClass = createEClass(SIMPLE2_SERVICE);
		createEAttribute(simple2ServiceEClass, SIMPLE2_SERVICE__INT1);
		createEAttribute(simple2ServiceEClass, SIMPLE2_SERVICE__STRING21);
		createEOperation(simple2ServiceEClass, SIMPLE2_SERVICE___ADD1);
		createEOperation(simple2ServiceEClass, SIMPLE2_SERVICE___ADD__INT);
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
		EGenericType g2 = createEGenericType(this.getContainer());
		g1.getETypeArguments().add(g2);
		containerServiceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theRuntimePackage.getService());
		g2 = createEGenericType(this.getSimple2());
		g1.getETypeArguments().add(g2);
		simple2ServiceEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(containerEClass, no.hal.pg.runtime.engine.tests.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Simple1(), this.getSimple1(), null, "simple1", null, 0, 1, no.hal.pg.runtime.engine.tests.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Simples2(), this.getSimple2(), null, "simples2", null, 0, -1, no.hal.pg.runtime.engine.tests.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Int1(), ecorePackage.getEInt(), "int1", null, 0, 1, no.hal.pg.runtime.engine.tests.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_String1(), ecorePackage.getEString(), "string1", null, 0, 1, no.hal.pg.runtime.engine.tests.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simple1EClass, Simple1.class, "Simple1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimple1_Simples2(), this.getSimple2(), null, "simples2", null, 0, -1, Simple1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimple1_String11(), ecorePackage.getEString(), "string11", null, 0, 1, Simple1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simple2EClass, Simple2.class, "Simple2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimple2_Int21(), ecorePackage.getEInt(), "int21", null, 0, 1, Simple2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimple2_String21(), ecorePackage.getEString(), "string21", null, 0, 1, Simple2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerServiceEClass, ContainerService.class, "ContainerService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerService_Simple1(), this.getSimple1(), null, "simple1", null, 0, 1, ContainerService.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerService_Int1(), ecorePackage.getEInt(), "int1", null, 0, 1, ContainerService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getContainerService__GetSimples2__String(), this.getSimple2(), "getSimples2", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "stringFilter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(simple2ServiceEClass, Simple2Service.class, "Simple2Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimple2Service_Int1(), ecorePackage.getEInt(), "int1", null, 0, 1, Simple2Service.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimple2Service_String21(), ecorePackage.getEString(), "string21", null, 0, 1, Simple2Service.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getSimple2Service__Add1(), null, "add1", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSimple2Service__Add__int(), null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// platform:/plugin/no.hal.pg.runtime/model/pg-runtime.ecore
		createPgruntimeAnnotations();
	}


	/**
	 * Initializes the annotations for <b>platform:/plugin/no.hal.pg.runtime/model/pg-runtime.ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPgruntimeAnnotations() {
		String source = "platform:/plugin/no.hal.pg.runtime/model/pg-runtime.ecore";	
		addAnnotation
		  (getContainerService_Int1(), 
		   source, 
		   new String[] {
			 "SelfService", "*"
		   });	
		addAnnotation
		  (getSimple2Service_Int1(), 
		   source, 
		   new String[] {
			 "SelfService", "int21"
		   });
	}

} //TestsPackage
