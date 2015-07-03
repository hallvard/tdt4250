/**
 */
package no.hal.pg.runtime.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.pg.runtime.FinishedState;
import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Task;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.pg.runtime.Task#changeState(no.hal.pg.runtime.TaskState) <em>Change State</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Task#getCurrentState() <em>Get Current State</em>}</li>
 *   <li>{@link no.hal.pg.runtime.ITask#isEnabled() <em>Is Enabled</em>}</li>
 *   <li>{@link no.hal.pg.runtime.ITask#isStarted() <em>Is Started</em>}</li>
 *   <li>{@link no.hal.pg.runtime.ITask#isFinished() <em>Is Finished</em>}</li>
 *   <li>{@link no.hal.pg.runtime.ITask#start() <em>Start</em>}</li>
 *   <li>{@link no.hal.pg.runtime.ITask#isInState(org.eclipse.emf.ecore.EClass) <em>Is In State</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TaskTest extends TestCase {

	/**
	 * The fixture for this Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Task<?> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskTest.class);
	}

	/**
	 * Constructs a new Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Task<?> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Task<?> getFixture() {
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
		setFixture(RuntimeFactory.eINSTANCE.createTask());
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
	 * Tests the '{@link no.hal.pg.runtime.Task#changeState(no.hal.pg.runtime.TaskState) <em>Change State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.Task#changeState(no.hal.pg.runtime.TaskState)
	 * @generated NOT
	 */
	public void testChangeState__TaskState() {
		Task<?> task = getFixture();
		task.changeState(RuntimeFactory.eINSTANCE.createFinishedState());
		assertTrue(task.getCurrentState() instanceof FinishedState);
	}

	/**
	 * Tests the '{@link no.hal.pg.runtime.Task#isInState(org.eclipse.emf.ecore.EClass) <em>Is In State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.Task#isInState(org.eclipse.emf.ecore.EClass)
	 * @generated NOT
	 */
	public void testIsInState__EClass() {
		Task<?> task = getFixture();
		assertTrue(! task.isInState(RuntimePackage.eINSTANCE.getFinishedState()));
		task.changeState(RuntimeFactory.eINSTANCE.createFinishedState());
		assertTrue(task.isInState(RuntimePackage.eINSTANCE.getFinishedState()));
	}

	/**
	 * Tests the '{@link no.hal.pg.Task#getCurrentState() <em>Get Current State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.Task#getCurrentState()
	 * @generated NOT
	 */
	public void testGetCurrentState() {
		Task<?> task = getFixture();
		assertNull(task.getCurrentState());
		FinishedState<Task<?>> finishedState = RuntimeFactory.eINSTANCE.createFinishedState();
		task.changeState(finishedState);
		assertEquals(finishedState, task.getCurrentState());
	}

	/**
	 * Tests the '{@link no.hal.pg.runtime.ITask#isEnabled() <em>Is Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.ITask#isEnabled()
	 * @generated NOT
	 */
	public void testIsEnabled() {
		assertTrue(getFixture().isEnabled());
	}

	/**
	 * Tests the '{@link no.hal.pg.runtime.ITask#isStarted() <em>Is Started</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.ITask#isStarted()
	 * @generated NOT
	 */
	public void testIsStarted() {
		Task<?> task = getFixture();
		assertFalse(task.isStarted());
		task.changeState(RuntimeFactory.eINSTANCE.createFinishedState());
		assertTrue(task.isStarted());
	}

	/**
	 * Tests the '{@link no.hal.pg.runtime.ITask#isFinished() <em>Is Finished</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.ITask#isFinished()
	 * @generated NOT
	 */
	public void testIsFinished() {
		Task<?> task = getFixture();
		assertFalse(task.isFinished());
		task.changeState(RuntimeFactory.eINSTANCE.createTaskState());
		assertFalse(task.isFinished());
		task.changeState(RuntimeFactory.eINSTANCE.createFinishedState());
		assertTrue(task.isFinished());
	}

	/**
	 * Tests the '{@link no.hal.pg.runtime.ITask#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.ITask#start()
	 * @generated NOT
	 */
	public void testStart() {
		try {
			getFixture().start();
			fail();
		} catch (UnsupportedOperationException e) {
		}
	}

} //TaskTest
