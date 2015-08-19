/**
 */
package no.hal.pg.quiz.runtime.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import no.hal.pg.quiz.model.QA;
import no.hal.pg.quiz.runtime.QAProposal;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.QuizTaskService;
import no.hal.pg.quiz.runtime.RuntimePackage;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Ref;
import no.hal.pg.runtime.impl.TaskServiceImpl;
import no.hal.pg.runtime.util.Util;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quiz Task Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QuizTaskServiceImpl extends TaskServiceImpl<QuizTask> implements QuizTaskService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizTaskServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.QUIZ_TASK_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setContext(QuizTask newContext) {
		super.setContext(newContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean proposeAnswer(Ref<Player> playerRef, Ref<QA> qaRef, String proposal) {
		Player player = playerRef.get(this);
		QA qa = qaRef.get(this);
		checkAcceptingAnswerState();
		checkPlayerInTaskPlayers(player);
		checkQAInQAProposals(qa);
		return getContext().proposeAnswer(qa, proposal, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean acceptAnswer(Ref<Player> playerRef, Ref<QA> qaRef, String proposal) {
		Player player = playerRef.get(getContext());
		QA qa = qaRef.get(getContext());
		checkAcceptingAnswerState();
		checkPlayerInTaskPlayers(player);
		checkQAInQAProposals(qa);
		return getContext().proposeAnswer(qa, proposal, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<QAProposal> getQAProposals(Ref<Player> playerRef) {
		Player player = playerRef.get(this);
		EList<QAProposal> proposals = new BasicEList<QAProposal>();
		for (QAProposal proposal : getContext().getProposals()) {
			if (Util.containsPlayer(proposal, player, false)) {
				proposals.add(proposal);
			}
		}
		return proposals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RuntimePackage.QUIZ_TASK_SERVICE___PROPOSE_ANSWER__REF_REF_STRING:
				return proposeAnswer((Ref<Player>)arguments.get(0), (Ref<QA>)arguments.get(1), (String)arguments.get(2));
			case RuntimePackage.QUIZ_TASK_SERVICE___ACCEPT_ANSWER__REF_REF_STRING:
				return acceptAnswer((Ref<Player>)arguments.get(0), (Ref<QA>)arguments.get(1), (String)arguments.get(2));
			case RuntimePackage.QUIZ_TASK_SERVICE___GET_QA_PROPOSALS__REF:
				return getQAProposals((Ref<Player>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	//
	
	private void checkAcceptingAnswerState() {
		if (! getContext().isInState(RuntimePackage.eINSTANCE.getAcceptingAnswerState())) {
			throw new IllegalStateException("Task must be in AcceptingAnswerState");
		}
	}
	
	private void checkPlayerInTaskPlayers(Player player) {
		if (! getContext().getPlayers().contains(player)) {
			throw new IllegalStateException("Player " + player + " cannot perform this task");
		}
	}

	private void checkQAInQAProposals(QA qa) {
		for (QAProposal qaProposal : getContext().getProposals()) {
			if (qaProposal.getQa() == qa) {
				return;
			}
		}
		throw new IllegalStateException("QA " + qa + " is not a valid QA");
	}

} //QuizTaskServiceImpl
