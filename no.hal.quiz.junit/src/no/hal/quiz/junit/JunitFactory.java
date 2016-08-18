/**
 */
package no.hal.quiz.junit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.quiz.junit.JunitPackage
 * @generated
 */
public interface JunitFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JunitFactory eINSTANCE = no.hal.quiz.junit.impl.JunitFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Test Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Answer</em>'.
	 * @generated
	 */
	JunitTestAnswer createJunitTestAnswer();

	/**
	 * Returns a new object of class '<em>Test Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Proposal</em>'.
	 * @generated
	 */
	JunitTestProposal createJunitTestProposal();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JunitPackage getJunitPackage();

} //JunitFactory
