/**
 */
package no.hal.gridgame.model.tests;

import org.junit.Assert;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.gridgame.model.GridRectangle;
import no.hal.gridgame.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Grid Rectangle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.gridgame.model.GridRectangle#setValues(int, int) <em>Set Values</em>}</li>
 *   <li>{@link no.hal.gridgame.model.GridRectangle#setValues(int, int, int, int) <em>Set Values</em>}</li>
 *   <li>{@link no.hal.gridgame.model.GridRectangle#setValues(no.hal.gridgame.model.GridRectangle) <em>Set Values</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class GridRectangleTest extends TestCase {

	/**
	 * The fixture for this Grid Rectangle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridRectangle fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GridRectangleTest.class);
	}

	/**
	 * Constructs a new Grid Rectangle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridRectangleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Grid Rectangle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GridRectangle fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Grid Rectangle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridRectangle getFixture() {
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
		setFixture(ModelFactory.eINSTANCE.createGridRectangle());
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

	public static void checkGridRectangle(GridRectangle gridRectangle, int x, int y, int w, int h) {
		Assert.assertEquals(x, gridRectangle.getX());
		Assert.assertEquals(y, gridRectangle.getY());
		Assert.assertEquals(w, gridRectangle.getWidth());
		Assert.assertEquals(h, gridRectangle.getHeight());
	}

	/**
	 * Tests the '{@link no.hal.gridgame.model.GridRectangle#setValues(int, int) <em>Set Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.gridgame.model.GridRectangle#setValues(int, int)
	 * @generated NOT
	 */
	public void testSetValues__int_int() {
		GridRectangle gridRectangle = getFixture();
		gridRectangle.setValues(4, 5);
		checkGridRectangle(gridRectangle, 4, 5, 0, 0);
	}

	/**
	 * Tests the '{@link no.hal.gridgame.model.GridRectangle#setValues(int, int, int, int) <em>Set Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.gridgame.model.GridRectangle#setValues(int, int, int, int)
	 * @generated NOT
	 */
	public void testSetValues__int_int_int_int() {
		GridRectangle gridRectangle = getFixture();
		gridRectangle.setValues(4, 5, 3, 1);
		checkGridRectangle(gridRectangle, 4, 5, 3, 1);
	}

	/**
	 * Tests the '{@link no.hal.gridgame.model.GridRectangle#setValues(no.hal.gridgame.model.GridRectangle) <em>Set Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.gridgame.model.GridRectangle#setValues(no.hal.gridgame.model.GridRectangle)
	 * @generated NOT
	 */
	public void testSetValues__GridRectangle() {
		GridRectangle gridRectangle1 = ModelFactory.eINSTANCE.createGridRectangle();
		gridRectangle1.setValues(4, 5, 3, 1);
		GridRectangle gridRectangle2 = getFixture();
		gridRectangle2.setValues(gridRectangle1);
		checkGridRectangle(gridRectangle2, 4, 5, 3, 1);
	}

} //GridRectangleTest
