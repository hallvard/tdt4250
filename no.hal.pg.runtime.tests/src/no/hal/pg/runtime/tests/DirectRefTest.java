/**
 */
package no.hal.pg.runtime.tests;

import junit.textui.TestRunner;
import no.hal.pg.model.ModelFactory;
import no.hal.pg.model.Person;
import no.hal.pg.runtime.DirectRef;
import no.hal.pg.runtime.RuntimeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Direct Ref</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DirectRefTest extends RefTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DirectRefTest.class);
	}

	/**
	 * Constructs a new Direct Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectRefTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Direct Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DirectRef<?> getFixture() {
		return (DirectRef<?>)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RuntimeFactory.eINSTANCE.createDirectRef());
	}

	@Override
	public void testGet__EObject() {
		Person person = ModelFactory.eINSTANCE.createPerson();
		DirectRef<Person> personRef = (DirectRef<Person>) getFixture();
		personRef.setRef(person);
		assertEquals(person, personRef.get(null));
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

} //DirectRefTest
