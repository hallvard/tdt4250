/**
 */
package no.hal.pg.runtime.tests;

import org.eclipse.emf.ecore.EObject;

import junit.framework.TestCase;
import no.hal.pg.runtime.Ref;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.pg.runtime.Ref#get(org.eclipse.emf.ecore.EObject) <em>Get</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class RefTest extends TestCase {

	/**
	 * The fixture for this Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ref<?> fixture = null;

	/**
	 * Constructs a new Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Ref<?> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ref<?> getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link no.hal.pg.runtime.Ref#get(org.eclipse.emf.ecore.EObject) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.Ref#get(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public void testGet__EObject() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	protected <T> T checkRef(Ref<T> ref, EObject context, boolean exists) {
		try {
			T t = ref.get(context);
			if (! exists) {
				fail();
			}
			return t;
		} catch (UnsupportedOperationException e) {
			if (exists) {
				fail();
			}
		}
		return null;
	}
	
} //RefTest
