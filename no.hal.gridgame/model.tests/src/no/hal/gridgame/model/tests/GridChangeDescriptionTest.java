/**
 */
package no.hal.gridgame.model.tests;

import junit.textui.TestRunner;
import no.hal.gridgame.model.GridChangeDescription;
import no.hal.gridgame.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Grid Change Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.gridgame.model.GridChangeDescription#addChange(int, int) <em>Add Change</em>}</li>
 *   <li>{@link no.hal.gridgame.model.GridChangeDescription#addChange(int, int, int, int) <em>Add Change</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class GridChangeDescriptionTest extends GridRectangleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GridChangeDescriptionTest.class);
	}

	/**
	 * Constructs a new Grid Change Description test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridChangeDescriptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Grid Change Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GridChangeDescription getFixture() {
		return (GridChangeDescription)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createGridChangeDescription());
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
	 * Tests the '{@link no.hal.gridgame.model.GridChangeDescription#addChange(int, int) <em>Add Change</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.gridgame.model.GridChangeDescription#addChange(int, int)
	 * @generated NOT
	 */
	public void testAddChange__int_int() {
		GridChangeDescription changeDescription = getFixture();
		changeDescription.addChange(2, 3);
		checkGridRectangle(changeDescription, 2, 3, 1, 1);
		changeDescription.addChange(3, 3);
		checkGridRectangle(changeDescription, 2, 3, 2, 1);
	}

	/**
	 * Tests the '{@link no.hal.gridgame.model.GridChangeDescription#addChange(int, int, int, int) <em>Add Change</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.gridgame.model.GridChangeDescription#addChange(int, int, int, int)
	 * @generated NOT
	 */
	public void testAddChange__int_int_int_int() {
		GridChangeDescription changeDescription = getFixture();
		changeDescription.addChange(2, 3, 2, 1);
		checkGridRectangle(changeDescription, 2, 3, 2, 1);
		changeDescription.addChange(3, 3, 3, 4);
		checkGridRectangle(changeDescription, 2, 3, 4, 4);
	}

} //GridChangeDescriptionTest
