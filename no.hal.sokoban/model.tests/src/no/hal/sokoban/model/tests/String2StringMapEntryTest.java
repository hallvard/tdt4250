/**
 */
package no.hal.sokoban.model.tests;

import java.util.Map;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.sokoban.model.ModelFactory;
import no.hal.sokoban.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String2 String Map Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class String2StringMapEntryTest extends TestCase {

	/**
	 * The fixture for this String2 String Map Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<String, String> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(String2StringMapEntryTest.class);
	}

	/**
	 * Constructs a new String2 String Map Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String2StringMapEntryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this String2 String Map Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map.Entry<String, String> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this String2 String Map Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<String, String> getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	protected void setUp() throws Exception {
		setFixture((Map.Entry<String, String>)ModelFactory.eINSTANCE.create(ModelPackage.Literals.STRING2_STRING_MAP_ENTRY));
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

	//

	public void testIgnore() {
		// ignore
	}

} //String2StringMapEntryTest
