/**
 */
package no.hal.pg.runtime.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.TaskState;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskStateTest extends TestCase {

	/**
	 * The fixture for this Task State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskState<?> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskStateTest.class);
	}

	/**
	 * Constructs a new Task State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStateTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Task State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TaskState<?> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Task State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskState<?> getFixture() {
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
		setFixture(RuntimeFactory.eINSTANCE.createTaskState());
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

} //TaskStateTest
