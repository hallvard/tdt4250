/**
 */
package no.hal.sokoban.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.sokoban.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = no.hal.sokoban.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Uo D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uo D</em>'.
	 * @generated
	 */
	UoD createUoD();

	/**
	 * Returns a new object of class '<em>Sokoban Grid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sokoban Grid</em>'.
	 * @generated
	 */
	SokobanGrid createSokobanGrid();

	/**
	 * Returns a new object of class '<em>Sokoban Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sokoban Game</em>'.
	 * @generated
	 */
	SokobanGame createSokobanGame();

	/**
	 * Returns a new object of class '<em>Move Player Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Player Command</em>'.
	 * @generated
	 */
	MovePlayerCommand createMovePlayerCommand();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
