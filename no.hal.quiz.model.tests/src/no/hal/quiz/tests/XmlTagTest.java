/**
 */
package no.hal.quiz.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.quiz.QuizFactory;
import no.hal.quiz.XmlTag;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Xml Tag</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlTagTest extends TestCase {

	/**
	 * The fixture for this Xml Tag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlTag fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XmlTagTest.class);
	}

	/**
	 * Constructs a new Xml Tag test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlTagTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Xml Tag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(XmlTag fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Xml Tag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlTag getFixture() {
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
		setFixture(QuizFactory.eINSTANCE.createXmlTag());
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

} //XmlTagTest
