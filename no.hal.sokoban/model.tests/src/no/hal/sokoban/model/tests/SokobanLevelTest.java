/**
 */
package no.hal.sokoban.model.tests;

import org.junit.Assert;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.sokoban.model.ModelFactory;
import no.hal.sokoban.model.SokobanGrid;
import no.hal.sokoban.model.SokobanLevel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sokoban Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.sokoban.model.SokobanLevel#createGrid() <em>Create Grid</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SokobanLevelTest extends TestCase {

	/**
	 * The fixture for this Sokoban Level test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanLevel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SokobanLevelTest.class);
	}

	/**
	 * Constructs a new Sokoban Level test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SokobanLevelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sokoban Level test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SokobanLevel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sokoban Level test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanLevel getFixture() {
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
		setFixture(ModelFactory.eINSTANCE.createSokobanLevel());
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
	 * Tests the '{@link no.hal.sokoban.model.SokobanLevel#createGrid() <em>Create Grid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.sokoban.model.SokobanLevel#createGrid()
	 * @generated NOT
	 */
	public void testCreateGrid() {
		SokobanLevel level = getFixture();
		level.getLines().add("#@$.");
		SokobanGrid grid = level.createGrid();
		Assert.assertEquals(4, grid.getWidth());
		Assert.assertEquals(1, grid.getHeight());
		Assert.assertEquals('#', grid.getGridValue(0, 0).toChar());
		Assert.assertEquals('@', grid.getGridValue(1, 0).toChar());
		Assert.assertEquals('$', grid.getGridValue(2, 0).toChar());
		Assert.assertEquals('.', grid.getGridValue(3, 0).toChar());
	}

} //SokobanLevelTest
