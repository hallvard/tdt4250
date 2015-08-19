/**
 */
package no.hal.pg.runtime.tests;

import org.eclipse.emf.common.util.EList;

import junit.framework.TestCase;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Players;
import no.hal.pg.runtime.RuntimeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Players</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.pg.runtime.Players#getPlayers() <em>Get Players</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class PlayersTest extends TestCase {

	/**
	 * The fixture for this Players test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Players fixture = null;

	/**
	 * Constructs a new Players test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayersTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Players test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Players fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Players test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Players getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link no.hal.pg.runtime.Players#getPlayers() <em>Get Players</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.Players#getPlayers()
	 * @generated NOT
	 */
	public void testGetPlayers() {
		fail();
	}

	protected void testGetPlayers(EList<Player> players) {
		Player player = RuntimeFactory.eINSTANCE.createPlayer();
		players.add(player);
		assertEquals(1, players.size());
		assertEquals(player, players.get(0));
	}

} //PlayersTest
