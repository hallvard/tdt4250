/**
 */
package no.hal.pg.quiz.runtime.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.pg.quiz.model.QuizTaskDef;
import no.hal.pg.quiz.runtime.AcceptingAnswerState;
import no.hal.pg.quiz.runtime.QAProposal;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.RuntimeFactory;
import no.hal.pg.quiz.runtime.RuntimePackage;
import no.hal.pg.quiz.runtime.service.QuizTaskService;
import no.hal.pg.quiz.runtime.service.ServiceFactory;
import no.hal.pg.runtime.impl.TaskImpl;
import no.hal.quiz.AbstractQuizPart;
import no.hal.quiz.QA;
import no.hal.quiz.QuizPartRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quiz Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.quiz.runtime.impl.QuizTaskImpl#getProposals <em>Proposals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuizTaskImpl extends TaskImpl<QuizTaskDef, Boolean> implements QuizTask {
	/**
	 * The cached value of the '{@link #getProposals() <em>Proposals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposals()
	 * @generated
	 * @ordered
	 */
	protected EList<QAProposal> proposals;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.QUIZ_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setTaskDef(QuizTaskDef newTaskDef) {
		super.setTaskDef(newTaskDef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setResult(Boolean newResult) {
		super.setResult(newResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QAProposal> getProposals() {
		if (proposals == null) {
			proposals = new EObjectContainmentEList<QAProposal>(QAProposal.class, this, RuntimePackage.QUIZ_TASK__PROPOSALS);
		}
		return proposals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public QAProposal getQAProposal(QA qa) {
		for (QAProposal qaProposal : getProposals()) {
			if (qaProposal.getQa() == qa) {
				return qaProposal;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Boolean proposeAnswer(QAProposal qaProposal, String proposal, boolean accept) {
		if (! isInState(RuntimePackage.eINSTANCE.getAcceptingAnswerState())) {
			return null;
		}
		Boolean accepted = null;
		qaProposal.setLastProposal(proposal);
		if (accept) {
			accepted = qaProposal.getQa().getA().accept(proposal) == 1.0;
			qaProposal.setAcceptedProposal(proposal);
		}
		qaProposal.setAccepted(accepted);
		if (Boolean.FALSE.equals(accepted)) {
			qaProposal.setRejectedCount(qaProposal.getRejectedCount() + 1);
		}
		updateResult();
		return accepted;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getAcceptedAnswerCount() {
		int count = 0;
		for (QAProposal qaProposal : getProposals()) {
			if (Boolean.TRUE.equals(qaProposal.getAccepted())) {
				count++;
			}
		}
		return count;
	}

	private boolean updateResult() {
		int requiredCount = getProposals().size();
		double correctNeeded = getTaskDef().getCorrectNeeded();
		if (correctNeeded <= 0) {
			requiredCount += correctNeeded;
		} else if (correctNeeded <= 1) {
			requiredCount *= correctNeeded;
		} else {
			requiredCount = (int) correctNeeded;			
		}
		if (getAcceptedAnswerCount() >= requiredCount) {
			finish(true);
		}
		int attemptsAllowed = getTaskDef().getAttemptsAllowed();
		for (QAProposal proposal : getProposals()) {
			if (attemptsAllowed > 0 && proposal.getRejectedCount() >= attemptsAllowed) {
				setResult(false);
				changeState(null);
				break;
			}
		}
		return true;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.QUIZ_TASK__PROPOSALS:
				return ((InternalEList<?>)getProposals()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.QUIZ_TASK__PROPOSALS:
				return getProposals();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RuntimePackage.QUIZ_TASK__PROPOSALS:
				getProposals().clear();
				getProposals().addAll((Collection<? extends QAProposal>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RuntimePackage.QUIZ_TASK__PROPOSALS:
				getProposals().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RuntimePackage.QUIZ_TASK__PROPOSALS:
				return proposals != null && !proposals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RuntimePackage.QUIZ_TASK___GET_QA_PROPOSAL__QA:
				return getQAProposal((QA)arguments.get(0));
			case RuntimePackage.QUIZ_TASK___PROPOSE_ANSWER__QAPROPOSAL_STRING_BOOLEAN:
				return proposeAnswer((QAProposal)arguments.get(0), (String)arguments.get(1), (Boolean)arguments.get(2));
			case RuntimePackage.QUIZ_TASK___GET_ACCEPTED_ANSWER_COUNT:
				return getAcceptedAnswerCount();
		}
		return super.eInvoke(operationID, arguments);
	}

	//
	
	@Override
	public void start() {
		for (AbstractQuizPart quizPart : getTaskDef().getQuizParts()) {
			if (quizPart instanceof QuizPartRef) {
				quizPart = ((QuizPartRef) quizPart).getPartRef(); 
			}
			TreeIterator<EObject> quizIt = quizPart.eAllContents();
			while (quizIt.hasNext()) {
				EObject next = quizIt.next();
				if (next instanceof QA) {
					QAProposal qaProposal = RuntimeFactory.eINSTANCE.createQAProposal();
					qaProposal.setQa((QA) next);
					getProposals().add(qaProposal);
				}
			}
		}
		QuizTaskService quizTaskService = ServiceFactory.eINSTANCE.createQuizTaskService();
		quizTaskService.setContext(this);
		AcceptingAnswerState acceptingAnswerState = RuntimeFactory.eINSTANCE.createAcceptingAnswerState();
		changeState(acceptingAnswerState);
	}

} //QuizTaskImpl
