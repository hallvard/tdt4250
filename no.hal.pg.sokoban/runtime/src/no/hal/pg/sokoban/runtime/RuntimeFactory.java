/**
 */
package no.hal.pg.sokoban.runtime;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.pg.sokoban.runtime.RuntimePackage
 * @generated
 */
public interface RuntimeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimeFactory eINSTANCE = no.hal.pg.sokoban.runtime.impl.RuntimeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sokoban Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sokoban Task</em>'.
	 * @generated
	 */
	SokobanTask createSokobanTask();

	/**
	 * Returns a new object of class '<em>Sokoban Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sokoban Service</em>'.
	 * @generated
	 */
	SokobanService createSokobanService();

	/**
	 * Returns a new object of class '<em>Grid Rectangle Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grid Rectangle Values</em>'.
	 * @generated
	 */
	GridRectangleValues createGridRectangleValues();

	/**
	 * Returns a new object of class '<em>Sokoban Game Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sokoban Game Service</em>'.
	 * @generated
	 */
	SokobanGameService createSokobanGameService();

	/**
	 * Returns a new object of class '<em>Sokoban Grid Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sokoban Grid Service</em>'.
	 * @generated
	 */
	SokobanGridService createSokobanGridService();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RuntimePackage getRuntimePackage();

} //RuntimeFactory
