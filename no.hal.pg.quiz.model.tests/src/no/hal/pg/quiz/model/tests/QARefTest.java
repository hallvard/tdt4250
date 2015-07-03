/**
 */
package no.hal.pg.quiz.model.tests;

import junit.textui.TestRunner;
import no.hal.pg.quiz.model.QARef;
import no.hal.pg.quiz.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>QA Ref</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QARefTest extends AbstractQATest {

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
	 * Returns the fixture for this QA Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QARef getFixture() {
		return (QARef)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createQARef());
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
