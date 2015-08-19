/**
 */
package no.hal.pg.runtime.tests;

import org.eclipse.emf.ecore.EObject;

import junit.textui.TestRunner;
import no.hal.pg.model.ModelPackage;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.PlayerRef;
import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.tests.util.TestHelper;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Player Ref</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlayerRefTest extends RefTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlayerRefTest.class);
	}

	/**
	 * Constructs a new Player Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerRefTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Player Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PlayerRef getFixture() {
		return (PlayerRef)fixture;
	}

	private Game game;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RuntimeFactory.eINSTANCE.createPlayerRef());
		TestHelper testHelper = new TestHelper(this, ModelPackage.eINSTANCE, RuntimePackage.eINSTANCE);
		game = (Game) testHelper.loadTestResource(RuntimePackage.eINSTANCE.getGame());
	}

	private void checkPlayer(String id, EObject context, boolean exists) {
		PlayerRef playerRef = getFixture();
		playerRef.setPersonId(id);
		Player player = checkRef(playerRef, context, exists);
		assertEquals(exists, player != null);
		if (exists) {
			assertTrue(player.getPerson().getIds().contains(id));
		}
	}
	
	@Override
	public void testGet__EObject() {
		Task<?, ?> task = game.getTasks().get(0);
		checkPlayer("hal@idi.ntnu.no", game, true);
		checkPlayer("hal@idi.ntnu.no", task, true);
		checkPlayer("jon.espen.ingvaldsen@ntnu.no", game, true);
		checkPlayer("jon.espen.ingvaldsen@ntnu.no", task, false);
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
} //PlayerRefTest
