/**
 */
package no.hal.quiz.junit.util;

import no.hal.quiz.Answer;
import no.hal.quiz.Proposal;
import no.hal.quiz.TaskAnswer;
import no.hal.quiz.TaskProposal;
import no.hal.quiz.junit.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.quiz.junit.JunitPackage
 * @generated
 */
public class JunitAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JunitPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JunitAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JunitPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JunitSwitch<Adapter> modelSwitch =
		new JunitSwitch<Adapter>() {
			@Override
			public Adapter caseJunitTestAnswer(JunitTestAnswer object) {
				return createJunitTestAnswerAdapter();
			}
			@Override
			public Adapter caseJunitTestProposal(JunitTestProposal object) {
				return createJunitTestProposalAdapter();
			}
			@Override
			public Adapter caseAnswer(Answer object) {
				return createAnswerAdapter();
			}
			@Override
			public Adapter caseTaskAnswer(TaskAnswer object) {
				return createTaskAnswerAdapter();
			}
			@Override
			public <A extends Answer> Adapter caseProposal(Proposal<A> object) {
				return createProposalAdapter();
			}
			@Override
			public <T extends TaskAnswer> Adapter caseTaskProposal(TaskProposal<T> object) {
				return createTaskProposalAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.junit.JunitTestAnswer <em>Test Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.junit.JunitTestAnswer
	 * @generated
	 */
	public Adapter createJunitTestAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.junit.JunitTestProposal <em>Test Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.junit.JunitTestProposal
	 * @generated
	 */
	public Adapter createJunitTestProposalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.Answer
	 * @generated
	 */
	public Adapter createAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.TaskAnswer <em>Task Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.TaskAnswer
	 * @generated
	 */
	public Adapter createTaskAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.Proposal <em>Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.Proposal
	 * @generated
	 */
	public Adapter createProposalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.TaskProposal <em>Task Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.TaskProposal
	 * @generated
	 */
	public Adapter createTaskProposalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JunitAdapterFactory
