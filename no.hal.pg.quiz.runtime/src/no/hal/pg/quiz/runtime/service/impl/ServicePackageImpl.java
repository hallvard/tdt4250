/**
 */
package no.hal.pg.quiz.runtime.service.impl;

import no.hal.pg.quiz.runtime.RuntimePackage;

import no.hal.pg.quiz.runtime.service.QuizTaskService;
import no.hal.pg.quiz.runtime.service.ServiceFactory;
import no.hal.pg.quiz.runtime.service.ServicePackage;

import no.hal.quiz.QuizPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
	private EClass quizTaskServiceEClass = null;

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
	 * @see no.hal.pg.quiz.runtime.service.ServicePackage#eNS_URI
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
	public EClass getQuizTaskService() {
		return quizTaskServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQuizTaskService__ProposeAnswer__Player_QA_String() {
		return quizTaskServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQuizTaskService__AcceptAnswer__Player_QA_String() {
		return quizTaskServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQuizTaskService__GetQAProposals__Player() {
		return quizTaskServiceEClass.getEOperations().get(2);
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
		quizTaskServiceEClass = createEClass(QUIZ_TASK_SERVICE);
		createEOperation(quizTaskServiceEClass, QUIZ_TASK_SERVICE___PROPOSE_ANSWER__PLAYER_QA_STRING);
		createEOperation(quizTaskServiceEClass, QUIZ_TASK_SERVICE___ACCEPT_ANSWER__PLAYER_QA_STRING);
		createEOperation(quizTaskServiceEClass, QUIZ_TASK_SERVICE___GET_QA_PROPOSALS__PLAYER);
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
		RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);
		QuizPackage theQuizPackage = (QuizPackage)EPackage.Registry.INSTANCE.getEPackage(QuizPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theRuntimePackage_1.getService());
		EGenericType g2 = createEGenericType(theRuntimePackage.getQuizTask());
		g1.getETypeArguments().add(g2);
		quizTaskServiceEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(quizTaskServiceEClass, QuizTaskService.class, "QuizTaskService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getQuizTaskService__ProposeAnswer__Player_QA_String(), ecorePackage.getEBooleanObject(), "proposeAnswer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theQuizPackage.getQA(), "qa", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "proposal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getQuizTaskService__AcceptAnswer__Player_QA_String(), ecorePackage.getEBooleanObject(), "acceptAnswer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theQuizPackage.getQA(), "qa", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "proposal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getQuizTaskService__GetQAProposals__Player(), theRuntimePackage.getQAProposal(), "getQAProposals", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ServicePackageImpl
