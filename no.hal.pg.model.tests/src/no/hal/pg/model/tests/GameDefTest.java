/**
 */
package no.hal.pg.model.tests;

import java.util.Arrays;

import org.eclipse.emf.common.util.EList;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.hal.pg.model.GameDef;
import no.hal.pg.model.ModelFactory;
import no.hal.pg.model.TaskDef;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Game Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link no.hal.pg.model.GameDef#getAllTasks() <em>All Tasks</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class GameDefTest extends TestCase {

	/**
	 * The fixture for this Game Def test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameDef fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GameDefTest.class);
	}

	/**
	 * Constructs a new Game Def test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameDefTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Game Def test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GameDef fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Game Def test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameDef getFixture() {
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
		setFixture(ModelFactory.eINSTANCE.createGameDef());
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
	 * Tests the '{@link no.hal.pg.model.GameDef#getAllTasks() <em>All Tasks</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.model.GameDef#getAllTasks()
	 * @generated NOT
	 */
	public void testGetAllTasks() {
		TaskDef[] taskDefs = {ModelFactory.eINSTANCE.createTaskDef(), ModelFactory.eINSTANCE.createTaskDef(), ModelFactory.eINSTANCE.createTaskDef()};
		GameDef gameDef = getFixture();
		gameDef.getTasks().addAll(Arrays.asList(taskDefs[0], taskDefs[1]));
		gameDef.getTaskRefs().addAll(Arrays.asList(taskDefs[2]));
		EList<TaskDef> allTasks = gameDef.getAllTasks();
		assertEquals(3, allTasks.size());
		assertTrue(allTasks.containsAll(Arrays.asList(taskDefs[0], taskDefs[1], taskDefs[2])));
	}

} //GameDefTest
