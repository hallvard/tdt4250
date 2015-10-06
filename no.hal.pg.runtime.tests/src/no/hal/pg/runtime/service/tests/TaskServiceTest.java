/**
 */
package no.hal.pg.runtime.service.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import no.hal.pg.runtime.service.ServiceFactory;
import no.hal.pg.runtime.service.TaskService;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link no.hal.pg.runtime.service.TaskService#getPlayers() <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.runtime.service.TaskService#isStarted() <em>Started</em>}</li>
 *   <li>{@link no.hal.pg.runtime.service.TaskService#isFinished() <em>Finished</em>}</li>
 *   <li>{@link no.hal.pg.runtime.service.TaskService#getResult() <em>Result</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TaskServiceTest extends TestCase {

	/**
	 * The fixture for this Task Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskService fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskServiceTest.class);
	}

	/**
	 * Constructs a new Task Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskServiceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Task Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TaskService fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Task Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskService getFixture() {
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
		setFixture(ServiceFactory.eINSTANCE.createTaskService());
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

	/**
	 * Tests the '{@link no.hal.pg.runtime.service.TaskService#getPlayers() <em>Players</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.service.TaskService#getPlayers()
	 * @generated NOT
	 */
	public void testGetPlayers() {
		assertEquals(getFixture().getContext().getAllPlayers(), getFixture().getPlayers());
	}

	/**
	 * Tests the '{@link no.hal.pg.runtime.service.TaskService#isStarted() <em>Started</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.service.TaskService#isStarted()
	 * @generated NOT
	 */
	public void testIsStarted() {
		assertEquals(getFixture().getContext().isStarted(), getFixture().isStarted());
	}

	/**
	 * Tests the '{@link no.hal.pg.runtime.service.TaskService#isFinished() <em>Finished</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.service.TaskService#isFinished()
	 * @generated NOT
	 */
	public void testIsFinished() {
		assertEquals(getFixture().getContext().isFinished(), getFixture().isFinished());
	}

	/**
	 * Tests the '{@link no.hal.pg.runtime.service.TaskService#getResult() <em>Result</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.service.TaskService#getResult()
	 * @generated NOT
	 */
	public void testGetResult() {
		assertEquals(getFixture().getContext().getResult(), getFixture().getResult());
	}

} //TaskServiceTest
