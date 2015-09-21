/**
 */
package no.hal.quiz.tests;

import junit.textui.TestRunner;
import no.hal.quiz.QuizFactory;
import no.hal.quiz.XmlTagElement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Xml Tag Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlTagElementTest extends XmlElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XmlTagElementTest.class);
	}

	/**
	 * Constructs a new Xml Tag Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlTagElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Xml Tag Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XmlTagElement getFixture() {
		return (XmlTagElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuizFactory.eINSTANCE.createXmlTagElement());
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

} //XmlTagElementTest
