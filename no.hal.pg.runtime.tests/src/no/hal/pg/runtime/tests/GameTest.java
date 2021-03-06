/**
 */
package no.hal.pg.runtime.tests;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.Team;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.pg.runtime.Game#getTasks(org.eclipse.emf.ecore.EClass) <em>Get Tasks</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Players#getAllPlayers() <em>Get All Players</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class GameTest extends TestCase {

	/**
	 * The fixture for this Game test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Game fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GameTest.class);
	}

	/**
	 * Constructs a new Game test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Game test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Game fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Game test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Game getFixture() {
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
		setFixture(RuntimeFactory.eINSTANCE.createGame());
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
	 * Tests the '{@link no.hal.pg.runtime.Game#getTasks(org.eclipse.emf.ecore.EClass) <em>Get Tasks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.Game#getTasks(org.eclipse.emf.ecore.EClass)
	 * @generated NOT
	 */
	public void testGetTasks__EClass() {
		Game game = getFixture();
		Task<?, ?> task1 = RuntimeFactory.eINSTANCE.createTask();
		task1.changeState(RuntimeFactory.eINSTANCE.createTaskState());
		Task<?, ?> task2 = RuntimeFactory.eINSTANCE.createTask();
		task2.changeState(RuntimeFactory.eINSTANCE.createTaskState());
		Task<?, ?> task3 = RuntimeFactory.eINSTANCE.createTask();
		game.getTasks().addAll(Arrays.<Task<?, ?>>asList(task1, task2, task3));
		EList<Task<?, ?>> allTasks = game.getTasks(RuntimePackage.eINSTANCE.getTaskState());
		assertEquals(2, allTasks.size());
		assertTrue(allTasks.containsAll(Arrays.<Task<?, ?>>asList(task1, task2)));
	}

	/**
	 * Tests the '{@link no.hal.pg.runtime.Players#getAllPlayers() <em>Get All Players</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.Players#getAllPlayers()
	 * @generated NOT
	 */
	public void testGetAllPlayers() {
		Game game = getFixture();
		List<Player> gamePlayers = Arrays.asList(RuntimeFactory.eINSTANCE.createPlayer(), RuntimeFactory.eINSTANCE.createPlayer());
		game.getPlayers().addAll(gamePlayers);
		Team team = RuntimeFactory.eINSTANCE.createTeam(); 
		List<Player> teamPlayers = Arrays.asList(RuntimeFactory.eINSTANCE.createPlayer(), RuntimeFactory.eINSTANCE.createPlayer());
		team.getPlayers().addAll(teamPlayers);
		game.getTeams().add(team);
		
		EList<Player> allPlayers = game.getAllPlayers();
		assertEquals(gamePlayers.size() + teamPlayers.size(), allPlayers.size());
		allPlayers.containsAll(gamePlayers);
		allPlayers.containsAll(teamPlayers);
	}
} //GameTest
