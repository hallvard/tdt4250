/**
 */
package no.hal.pg.runtime.service.tests;

import java.util.Arrays;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.pg.model.ModelFactory;
import no.hal.pg.model.Person;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.service.PlayerService;
import no.hal.pg.runtime.service.ServiceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Player Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link no.hal.pg.runtime.service.PlayerService#getName() <em>Name</em>}</li>
 *   <li>{@link no.hal.pg.runtime.service.PlayerService#getIds() <em>Ids</em>}</li>
 *   <li>{@link no.hal.pg.runtime.service.PlayerService#getTasks() <em>Tasks</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PlayerServiceTest extends TestCase {

	/**
	 * The fixture for this Player Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerService fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlayerServiceTest.class);
	}

	/**
	 * Constructs a new Player Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerServiceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Player Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PlayerService fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Player Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerService getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(createPlayerService());
	}

	private PlayerService createPlayerService() {
		PlayerService playerService = ServiceFactory.eINSTANCE.createPlayerService();
		Player player = RuntimeFactory.eINSTANCE.createPlayer();
		Person person = ModelFactory.eINSTANCE.createPerson();
		person.setName("hal");
		person.getIds().addAll(Arrays.asList("hal@idi.ntnu.no", "hallvard.traetteberg@gmail.com"));
		player.setPerson(person);
		playerService.setContext(player);
		return playerService;
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
	 * Tests the '{@link no.hal.pg.runtime.service.PlayerService#getName() <em>Name</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.service.PlayerService#getName()
	 * @generated NOT
	 */
	public void testGetName() {
		assertEquals(getFixture().getContext().getPerson().getName(), getFixture().getName());
	}

	/**
	 * Tests the '{@link no.hal.pg.runtime.service.PlayerService#getIds() <em>Ids</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.service.PlayerService#getIds()
	 * @generated NOT
	 */
	public void testGetIds() {
		assertEquals(getFixture().getContext().getPerson().getIds(), getFixture().getIds());
	}

	/**
	 * Tests the '{@link no.hal.pg.runtime.service.PlayerService#getTasks() <em>Tasks</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.service.PlayerService#getTasks()
	 * @generated NOT
	 */
	public void testGetTasks() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
//		fail();
	}

} //PlayerServiceTest
