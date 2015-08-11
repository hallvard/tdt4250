/**
 */
package no.hal.pg.quiz.runtime.tests;

import org.eclipse.emf.ecore.EObject;

import junit.textui.TestRunner;
import no.hal.pg.quiz.model.ModelPackage;
import no.hal.pg.quiz.runtime.QARef;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.RuntimeFactory;
import no.hal.pg.quiz.runtime.RuntimePackage;
import no.hal.pg.quiz.xtext.XQuizStandaloneSetup;
import no.hal.pg.runtime.tests.RefTest;
import no.hal.pg.runtime.tests.util.TestHelper;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>QA Ref</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QARefTest extends RefTest {

	/**
	 * The fixture for this QA Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QARef fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QARefTest.class);
	}

	/**
	 * Constructs a new QA Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QARefTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this QA Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(QARef fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this QA Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QARef getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RuntimeFactory.eINSTANCE.createQARef());
		TestHelper testHelper = new TestHelper(this, ModelPackage.eINSTANCE, RuntimePackage.eINSTANCE);
		XQuizStandaloneSetup.doSetup();
		quizTask = (QuizTask) testHelper.loadTestResource(RuntimePackage.eINSTANCE.getQuizTask());
	}

	private QuizTask quizTask;
	
	private void checkQA(int num, EObject context, boolean exists) {
		QARef qaRef = getFixture();
		qaRef.setQaNum(num);
		checkRef(qaRef, context, exists);
	}

	@Override
	public void testGet__EObject() {
		checkQA(0, quizTask, true);
		checkQA(1, quizTask, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //QARefTest
