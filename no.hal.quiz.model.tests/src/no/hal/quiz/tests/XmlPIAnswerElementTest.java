/**
 */
package no.hal.quiz.tests;

import junit.textui.TestRunner;
import no.hal.quiz.QuizFactory;
import no.hal.quiz.XmlPIAnswerElement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Xml PI Answer Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlPIAnswerElementTest extends XmlElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XmlPIAnswerElementTest.class);
	}

	/**
	 * Constructs a new Xml PI Answer Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlPIAnswerElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Xml PI Answer Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XmlPIAnswerElement getFixture() {
		return (XmlPIAnswerElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuizFactory.eINSTANCE.createXmlPIAnswerElement());
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

} //XmlPIAnswerElementTest
