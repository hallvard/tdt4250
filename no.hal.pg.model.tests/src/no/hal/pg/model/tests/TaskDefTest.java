/**
 */
package no.hal.pg.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.hal.pg.model.ModelFactory;
import no.hal.pg.model.TaskDef;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Def</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskDefTest extends TestCase {

	/**
	 * The fixture for this Task Def test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskDef fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskDefTest.class);
	}

	/**
	 * Constructs a new Task Def test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDefTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Task Def test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TaskDef fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Task Def test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskDef getFixture() {
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
		setFixture(ModelFactory.eINSTANCE.createTaskDef());
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

} //TaskDefTest
