/**
 */
package no.hal.quiz.junit.impl;

import no.hal.quiz.QuizPackage;

import no.hal.quiz.junit.JunitFactory;
import no.hal.quiz.junit.JunitPackage;
import no.hal.quiz.junit.JunitTestAnswer;
import no.hal.quiz.junit.JunitTestProposal;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JunitPackageImpl extends EPackageImpl implements JunitPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass junitTestAnswerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass junitTestProposalEClass = null;
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
	 * @see no.hal.quiz.junit.JunitPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JunitPackageImpl() {
		super(eNS_URI, JunitFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JunitPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JunitPackage init() {
		if (isInited) return (JunitPackage)EPackage.Registry.INSTANCE.getEPackage(JunitPackage.eNS_URI);

		// Obtain or create and register package
		JunitPackageImpl theJunitPackage = (JunitPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JunitPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JunitPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QuizPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJunitPackage.createPackageContents();

		// Initialize created meta-data
		theJunitPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJunitPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JunitPackage.eNS_URI, theJunitPackage);
		return theJunitPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJunitTestAnswer() {
		return junitTestAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJunitTestAnswer_TestRunName() {
		return (EAttribute)junitTestAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJunitTestAnswer_MethodNames() {
		return (EAttribute)junitTestAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJunitTestProposal() {
		return junitTestProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JunitFactory getJunitFactory() {
		return (JunitFactory)getEFactoryInstance();
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
		junitTestAnswerEClass = createEClass(JUNIT_TEST_ANSWER);
		createEAttribute(junitTestAnswerEClass, JUNIT_TEST_ANSWER__TEST_RUN_NAME);
		createEAttribute(junitTestAnswerEClass, JUNIT_TEST_ANSWER__METHOD_NAMES);

		junitTestProposalEClass = createEClass(JUNIT_TEST_PROPOSAL);
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
		QuizPackage theQuizPackage = (QuizPackage)EPackage.Registry.INSTANCE.getEPackage(QuizPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		junitTestAnswerEClass.getESuperTypes().add(theQuizPackage.getTaskAnswer());
		EGenericType g1 = createEGenericType(theQuizPackage.getTaskProposal());
		EGenericType g2 = createEGenericType(this.getJunitTestAnswer());
		g1.getETypeArguments().add(g2);
		junitTestProposalEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(junitTestAnswerEClass, JunitTestAnswer.class, "JunitTestAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJunitTestAnswer_TestRunName(), ecorePackage.getEString(), "testRunName", null, 0, 1, JunitTestAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJunitTestAnswer_MethodNames(), ecorePackage.getEString(), "methodNames", null, 0, -1, JunitTestAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(junitTestProposalEClass, JunitTestProposal.class, "JunitTestProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //JunitPackageImpl
