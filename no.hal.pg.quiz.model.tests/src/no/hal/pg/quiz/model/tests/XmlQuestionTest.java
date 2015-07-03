/**
 */
package no.hal.pg.quiz.model.tests;

import junit.textui.TestRunner;
import no.hal.pg.quiz.model.ModelFactory;
import no.hal.pg.quiz.model.XmlQuestion;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Xml Question</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlQuestionTest extends QuestionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XmlQuestionTest.class);
	}

	/**
	 * Constructs a new Xml Question test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlQuestionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Xml Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XmlQuestion getFixture() {
		return (XmlQuestion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createXmlQuestion());
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

} //XmlQuestionTest
