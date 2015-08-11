/**
 */
package no.hal.pg.quiz.runtime.impl;

import no.hal.pg.quiz.model.ModelPackage;
import no.hal.pg.quiz.runtime.AcceptingAnswerState;
import no.hal.pg.quiz.runtime.QAProposal;
import no.hal.pg.quiz.runtime.QARef;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.QuizTaskService;
import no.hal.pg.quiz.runtime.RuntimeFactory;
import no.hal.pg.quiz.runtime.RuntimePackage;

import no.hal.pg.quiz.runtime.util.RuntimeValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
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
	private EClass quizTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptingAnswerStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qaProposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quizTaskServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qaRefEClass = null;

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
	 * @see no.hal.pg.quiz.runtime.RuntimePackage#eNS_URI
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

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRuntimePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RuntimeValidator.INSTANCE;
				 }
			 });

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
	public EClass getQuizTask() {
		return quizTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuizTask_Proposals() {
		return (EReference)quizTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQuizTask__ProposeAnswer__QA_String_boolean() {
		return quizTaskEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQuizTask__GetAcceptedAnswerCount() {
		return quizTaskEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptingAnswerState() {
		return acceptingAnswerStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQAProposal() {
		return qaProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQAProposal_Qa() {
		return (EReference)qaProposalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQAProposal_Proposal() {
		return (EAttribute)qaProposalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQAProposal_Accepted() {
		return (EAttribute)qaProposalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQAProposal_RejectedCount() {
		return (EAttribute)qaProposalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQAProposal_Players() {
		return (EReference)qaProposalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQAProposal_AnsweredBy() {
		return (EReference)qaProposalEClass.getEStructuralFeatures().get(5);
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
	public EOperation getQuizTaskService__ProposeAnswer__Ref_Ref_String() {
		return quizTaskServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQuizTaskService__AcceptAnswer__Ref_Ref_String() {
		return quizTaskServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQARef() {
		return qaRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQARef_QaNum() {
		return (EAttribute)qaRefEClass.getEStructuralFeatures().get(0);
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
		quizTaskEClass = createEClass(QUIZ_TASK);
		createEReference(quizTaskEClass, QUIZ_TASK__PROPOSALS);
		createEOperation(quizTaskEClass, QUIZ_TASK___PROPOSE_ANSWER__QA_STRING_BOOLEAN);
		createEOperation(quizTaskEClass, QUIZ_TASK___GET_ACCEPTED_ANSWER_COUNT);

		acceptingAnswerStateEClass = createEClass(ACCEPTING_ANSWER_STATE);

		qaProposalEClass = createEClass(QA_PROPOSAL);
		createEReference(qaProposalEClass, QA_PROPOSAL__QA);
		createEAttribute(qaProposalEClass, QA_PROPOSAL__PROPOSAL);
		createEAttribute(qaProposalEClass, QA_PROPOSAL__ACCEPTED);
		createEAttribute(qaProposalEClass, QA_PROPOSAL__REJECTED_COUNT);
		createEReference(qaProposalEClass, QA_PROPOSAL__PLAYERS);
		createEReference(qaProposalEClass, QA_PROPOSAL__ANSWERED_BY);

		quizTaskServiceEClass = createEClass(QUIZ_TASK_SERVICE);
		createEOperation(quizTaskServiceEClass, QUIZ_TASK_SERVICE___PROPOSE_ANSWER__REF_REF_STRING);
		createEOperation(quizTaskServiceEClass, QUIZ_TASK_SERVICE___ACCEPT_ANSWER__REF_REF_STRING);

		qaRefEClass = createEClass(QA_REF);
		createEAttribute(qaRefEClass, QA_REF__QA_NUM);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theRuntimePackage_1.getTask());
		EGenericType g2 = createEGenericType(theModelPackage.getQuizTaskDef());
		g1.getETypeArguments().add(g2);
		quizTaskEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theRuntimePackage_1.getTaskState());
		g2 = createEGenericType(this.getQuizTask());
		g1.getETypeArguments().add(g2);
		acceptingAnswerStateEClass.getEGenericSuperTypes().add(g1);
		qaProposalEClass.getESuperTypes().add(theRuntimePackage_1.getPlayers());
		g1 = createEGenericType(theRuntimePackage_1.getTaskService());
		g2 = createEGenericType(this.getQuizTask());
		g1.getETypeArguments().add(g2);
		quizTaskServiceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theRuntimePackage_1.getRef());
		g2 = createEGenericType(theModelPackage.getQA());
		g1.getETypeArguments().add(g2);
		qaRefEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(quizTaskEClass, QuizTask.class, "QuizTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuizTask_Proposals(), this.getQAProposal(), null, "proposals", null, 0, -1, QuizTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getQuizTask__ProposeAnswer__QA_String_boolean(), ecorePackage.getEBooleanObject(), "proposeAnswer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelPackage.getQA(), "qa", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "proposal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "accept", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getQuizTask__GetAcceptedAnswerCount(), ecorePackage.getEInt(), "getAcceptedAnswerCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(acceptingAnswerStateEClass, AcceptingAnswerState.class, "AcceptingAnswerState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qaProposalEClass, QAProposal.class, "QAProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQAProposal_Qa(), theModelPackage.getQA(), null, "qa", null, 0, 1, QAProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQAProposal_Proposal(), ecorePackage.getEString(), "proposal", null, 0, 1, QAProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQAProposal_Accepted(), ecorePackage.getEBooleanObject(), "accepted", null, 0, 1, QAProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQAProposal_RejectedCount(), ecorePackage.getEInt(), "rejectedCount", null, 0, 1, QAProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQAProposal_Players(), theRuntimePackage_1.getPlayer(), null, "players", null, 0, -1, QAProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQAProposal_AnsweredBy(), theRuntimePackage_1.getPlayer(), null, "answeredBy", null, 0, 1, QAProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quizTaskServiceEClass, QuizTaskService.class, "QuizTaskService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getQuizTaskService__ProposeAnswer__Ref_Ref_String(), ecorePackage.getEBooleanObject(), "proposeAnswer", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theRuntimePackage_1.getRef());
		g2 = createEGenericType(theRuntimePackage_1.getPlayer());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "playerRef", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theRuntimePackage_1.getRef());
		g2 = createEGenericType(theModelPackage.getQA());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "qaRef", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "proposal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getQuizTaskService__AcceptAnswer__Ref_Ref_String(), ecorePackage.getEBooleanObject(), "acceptAnswer", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theRuntimePackage_1.getRef());
		g2 = createEGenericType(theRuntimePackage_1.getPlayer());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "playerRef", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theRuntimePackage_1.getRef());
		g2 = createEGenericType(theModelPackage.getQA());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "qaRef", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "proposal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(qaRefEClass, QARef.class, "QARef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQARef_QaNum(), ecorePackage.getEInt(), "qaNum", null, 0, 1, QARef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (qaProposalEClass, 
		   source, 
		   new String[] {
			 "constraints", "AnsweredByPlayers"
		   });
	}

} //RuntimePackageImpl
