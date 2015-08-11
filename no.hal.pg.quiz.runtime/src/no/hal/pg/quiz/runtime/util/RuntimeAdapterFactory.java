/**
 */
package no.hal.pg.quiz.runtime.util;

import no.hal.pg.model.TaskDef;
import no.hal.pg.quiz.runtime.*;

import no.hal.pg.runtime.ITask;
import no.hal.pg.runtime.Players;
import no.hal.pg.runtime.Ref;
import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.TaskService;
import no.hal.pg.runtime.TaskState;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.pg.quiz.runtime.RuntimePackage
 * @generated
 */
public class RuntimeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RuntimePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RuntimePackage.eINSTANCE;
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
	protected RuntimeSwitch<Adapter> modelSwitch =
		new RuntimeSwitch<Adapter>() {
			@Override
			public Adapter caseQuizTask(QuizTask object) {
				return createQuizTaskAdapter();
			}
			@Override
			public Adapter caseAcceptingAnswerState(AcceptingAnswerState object) {
				return createAcceptingAnswerStateAdapter();
			}
			@Override
			public Adapter caseQAProposal(QAProposal object) {
				return createQAProposalAdapter();
			}
			@Override
			public Adapter caseQuizTaskService(QuizTaskService object) {
				return createQuizTaskServiceAdapter();
			}
			@Override
			public Adapter caseQARef(QARef object) {
				return createQARefAdapter();
			}
			@Override
			public Adapter caseITask(ITask object) {
				return createITaskAdapter();
			}
			@Override
			public Adapter casePlayers(Players object) {
				return createPlayersAdapter();
			}
			@Override
			public <T extends TaskDef> Adapter caseTask(Task<T> object) {
				return createTaskAdapter();
			}
			@Override
			public <T extends Task<?>> Adapter caseTaskState(TaskState<T> object) {
				return createTaskStateAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public <T extends Task<?>> Adapter caseTaskService(TaskService<T> object) {
				return createTaskServiceAdapter();
			}
			@Override
			public <T> Adapter caseRef(Ref<T> object) {
				return createRefAdapter();
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
	 * Creates a new adapter for an object of class '{@link no.hal.pg.quiz.runtime.QuizTask <em>Quiz Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.quiz.runtime.QuizTask
	 * @generated
	 */
	public Adapter createQuizTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.quiz.runtime.AcceptingAnswerState <em>Accepting Answer State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.quiz.runtime.AcceptingAnswerState
	 * @generated
	 */
	public Adapter createAcceptingAnswerStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.quiz.runtime.QAProposal <em>QA Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.quiz.runtime.QAProposal
	 * @generated
	 */
	public Adapter createQAProposalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.quiz.runtime.QuizTaskService <em>Quiz Task Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.quiz.runtime.QuizTaskService
	 * @generated
	 */
	public Adapter createQuizTaskServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.quiz.runtime.QARef <em>QA Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.quiz.runtime.QARef
	 * @generated
	 */
	public Adapter createQARefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.ITask <em>ITask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.ITask
	 * @generated
	 */
	public Adapter createITaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.Players <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.Players
	 * @generated
	 */
	public Adapter createPlayersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.TaskState <em>Task State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.TaskState
	 * @generated
	 */
	public Adapter createTaskStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.TaskService <em>Task Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.TaskService
	 * @generated
	 */
	public Adapter createTaskServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.Ref <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.Ref
	 * @generated
	 */
	public Adapter createRefAdapter() {
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

} //RuntimeAdapterFactory
