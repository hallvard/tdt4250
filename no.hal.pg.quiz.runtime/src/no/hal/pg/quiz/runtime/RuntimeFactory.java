/**
 */
package no.hal.pg.quiz.runtime;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.pg.quiz.runtime.RuntimePackage
 * @generated
 */
public interface RuntimeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimeFactory eINSTANCE = no.hal.pg.quiz.runtime.impl.RuntimeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Quiz Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quiz Task</em>'.
	 * @generated
	 */
	QuizTask createQuizTask();

	/**
	 * Returns a new object of class '<em>Accepting Answer State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accepting Answer State</em>'.
	 * @generated
	 */
	AcceptingAnswerState createAcceptingAnswerState();

	/**
	 * Returns a new object of class '<em>QA Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QA Proposal</em>'.
	 * @generated
	 */
	QAProposal createQAProposal();

	/**
	 * Returns a new object of class '<em>Propose Answer Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propose Answer Action</em>'.
	 * @generated
	 */
	ProposeAnswerAction createProposeAnswerAction();

	/**
	 * Returns a new object of class '<em>Accept Answer Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accept Answer Action</em>'.
	 * @generated
	 */
	AcceptAnswerAction createAcceptAnswerAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RuntimePackage getRuntimePackage();

} //RuntimeFactory
