/**
 */
package no.hal.pg.runtime.tests;

import java.util.Arrays;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import no.hal.pg.runtime.DirectRef;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.GameService;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.Task;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Game Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link no.hal.pg.runtime.GameService#getPlayers() <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.runtime.GameService#getTasks() <em>Tasks</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.pg.runtime.GameService#getTasks(no.hal.pg.runtime.Ref) <em>Get Tasks</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Service#invokeService(no.hal.pg.runtime.ServiceInvocation) <em>Invoke Service</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class GameServiceTest extends TestCase {

	/**
	 * The fixture for this Game Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameService fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GameServiceTest.class);
	}

	/**
	 * Constructs a new Game Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameServiceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Game Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GameService fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Game Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameService getFixture() {
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
		setFixture(RuntimeFactory.eINSTANCE.createGameService());
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
	 * Tests the '{@link no.hal.pg.runtime.GameService#getPlayers() <em>Players</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.GameService#getPlayers()
	 * @generated NOT
	 */
	public void testGetPlayers() {
		GameService gameService = getFixture();
		assertEquals(gameService.getContext().getPlayers(), gameService.getPlayers());
	}

	/**
	 * Tests the '{@link no.hal.pg.runtime.GameService#getTasks() <em>Tasks</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.GameService#getTasks()
	 * @generated NOT
	 */
	public void testGetTasks() {
		GameService gameService = getFixture();
		assertEquals(gameService.getContext().getTasks(), gameService.getTasks());
	}

	/**
	 * Tests the '{@link no.hal.pg.runtime.GameService#getTasks(no.hal.pg.runtime.Ref) <em>Get Tasks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.GameService#getTasks(no.hal.pg.runtime.Ref)
	 * @generated NOT
	 */
	public void testGetTasks__Ref() {
		GameService gameService = getFixture();
		Player[] players = {RuntimeFactory.eINSTANCE.createPlayer(), RuntimeFactory.eINSTANCE.createPlayer()};
		Game game = gameService.getContext();
		Task<?, ?> task = gameService.getContext().getTasks().get(0);
		
		game.getPlayers().addAll(Arrays.<Player>asList(players));
		DirectRef<Player> player1 = RuntimeFactory.eINSTANCE.createDirectRef();
		player1.setRef(players[0]);
		DirectRef<Player> player2 = RuntimeFactory.eINSTANCE.createDirectRef();
		player2.setRef(players[1]);
		
		assertEquals(1, gameService.getTasks(player1).size());
		assertEquals(task, gameService.getTasks(player1).get(0));
		assertEquals(1, gameService.getTasks(player2).size());
		assertEquals(task, gameService.getTasks(player2).get(0));

		task.getPlayers().add(players[1]);
		assertEquals(0, gameService.getTasks(player1).size());
		assertEquals(1, gameService.getTasks(player2).size());
		assertEquals(task, gameService.getTasks(player2).get(0));
	}

	/**
	 * Tests the '{@link no.hal.pg.runtime.Service#invokeService(no.hal.pg.runtime.ServiceInvocation) <em>Invoke Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.Service#invokeService(no.hal.pg.runtime.ServiceInvocation)
	 * @generated
	 */
	public void testInvokeService__ServiceInvocation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //GameServiceTest
