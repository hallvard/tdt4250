/**
 */
package no.hal.pg.runtime.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.Team;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link no.hal.pg.runtime.Player#getGame() <em>Game</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PlayerTest extends TestCase {

	/**
	 * The fixture for this Player test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Player fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlayerTest.class);
	}

	/**
	 * Constructs a new Player test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Player test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Player fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Player test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Player getFixture() {
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
		setFixture(RuntimeFactory.eINSTANCE.createPlayer());
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
	 * Tests the '{@link no.hal.pg.runtime.Player#getGame() <em>Game</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.Player#getGame()
	 * @generated NOT
	 */
	public void testGetGame() {
		Player player = getFixture();
		Game game = RuntimeFactory.eINSTANCE.createGame();
		game.getPlayers().add(player);
		assertEquals(game, player.getGame());
		
		Team team = RuntimeFactory.eINSTANCE.createTeam();
		team.getPlayers().add(player);
		game.getTeams().add(team);
		assertEquals(game, player.getGame());
	}
	
} //PlayerTest
