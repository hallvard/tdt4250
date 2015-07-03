/**
 */
package no.hal.pg.quiz.model.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.pg.quiz.model.ModelFactory;
import no.hal.pg.quiz.model.Xml;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Xml</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlTest extends TestCase {

	/**
	 * The fixture for this Xml test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Xml fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XmlTest.class);
	}

	/**
	 * Constructs a new Xml test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Xml test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Xml fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Xml test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Xml getFixture() {
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
		setFixture(ModelFactory.eINSTANCE.createXml());
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

} //XmlTest
