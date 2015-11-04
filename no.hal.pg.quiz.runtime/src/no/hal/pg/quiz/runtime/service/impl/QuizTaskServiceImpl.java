/**
 */
package no.hal.pg.quiz.runtime.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import no.hal.pg.quiz.runtime.QAProposal;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.RuntimePackage;
import no.hal.pg.quiz.runtime.service.AnswerKind;
import no.hal.pg.quiz.runtime.service.Question;
import no.hal.pg.quiz.runtime.service.QuizTaskService;
import no.hal.pg.quiz.runtime.service.ServiceFactory;
import no.hal.pg.quiz.runtime.service.ServicePackage;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.impl.SubjectServiceImpl;
import no.hal.pg.runtime.util.Util;
import no.hal.quiz.Answer;
import no.hal.quiz.BooleanAnswer;
import no.hal.quiz.NumberAnswer;
import no.hal.quiz.Option;
import no.hal.quiz.OptionAnswer;
import no.hal.quiz.OptionsAnswer;
import no.hal.quiz.QA;
import no.hal.quiz.Quiz;
import no.hal.quiz.SimpleAnswer;
import no.hal.quiz.SingleOptionsAnswer;
import no.hal.quiz.StringAnswer;
import no.hal.quiz.StringQuestion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quiz Task Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QuizTaskServiceImpl extends SubjectServiceImpl<QuizTask> implements QuizTaskService {
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
		return ServicePackage.Literals.QUIZ_TASK_SERVICE;
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
	@Override
	public Boolean proposeAnswer(QA qa, String proposal) {
		checkAcceptingAnswerState();
		Player player = Util.getPlayer(getContext(), getSubject(), false);
		checkPlayerInTaskPlayers(player);
		QAProposal qaProposals = checkQAInQAProposals(qa);
		return getContext().proposeAnswer(qaProposals, proposal, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Boolean acceptAnswer(QA qa, String proposal) {
		checkAcceptingAnswerState();
		Player player = Util.getPlayer(getContext(), getSubject(), false);
		checkPlayerInTaskPlayers(player);
		QAProposal qaProposals = checkQAInQAProposals(qa);
		return getContext().proposeAnswer(qaProposals, proposal, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Question> acceptAllProposals() {
		checkAcceptingAnswerState();
		Player player = Util.getPlayer(getContext(), getSubject(), false);
		checkPlayerInTaskPlayers(player);
		EList<QAProposal> qaProposals = getQAProposals(player);
		for (QAProposal qaProp : qaProposals) {
			String proposal = qaProp.getLastProposal();
			// only accept actual proposals
			if (proposal != null) {
				// only accept proposals that is not yet accepted
				if (! Boolean.TRUE.equals(qaProp.getAccepted())) {
					getContext().proposeAnswer(qaProp, proposal, true);
				}
			}
		}
		return getPlayerQuestions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<QAProposal> getQAProposals(Player player) {
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
	 * @generated NOT
	 */
	@Override
	public EList<Question> getPlayerQuestions() {
		Player player = Util.getPlayer(getContext(), getSubject(), false);
		checkPlayerInTaskPlayers(player);
		Collection<QAProposal> qaProposals = getQAProposals(player);
		EList<Question> questions = new BasicEList<Question>();
		for (QAProposal qaProp : qaProposals) {
			Question q = ServiceFactory.eINSTANCE.createQuestion();
			QA qa = qaProp.getQa();
			if (qa.getQ() instanceof StringQuestion) {
				q.setQuestion(((StringQuestion) qa.getQ()).getQuestion());
			}
			Answer answer = qa.getA();
			q.setKind(getAnswerKind(answer, null));
			if (answer instanceof OptionsAnswer) {
				q.setNumChoices(answer instanceof SingleOptionsAnswer ? 1 : -1);
				int[] optionNums = no.hal.quiz.util.Util.proposalOptions((OptionsAnswer) answer, qaProp.getLastProposal());
				for (Option option : ((OptionsAnswer) answer).getOptions()) {
					OptionAnswer optionAnswer = option.getOption();
					q.setKind(getAnswerKind(optionAnswer, q.getKind()));
					no.hal.pg.quiz.runtime.service.Answer a = ServiceFactory.eINSTANCE.createAnswer();
					if (optionAnswer instanceof SimpleAnswer<?>) {
						a.setAnswer(String.valueOf(((SimpleAnswer<?>) optionAnswer).getValue()));
					}
					if (optionNums != null) {
						for (int i = 0; i < optionNums.length; i++) {
							if (q.getOptions().size() == optionNums[i]) {
								a.setSelected(true);
							}
						}
					}
					q.getOptions().add(a);
				}
			}
			q.setQid(no.hal.quiz.util.Util.relativeName(qa, Quiz.class));
			q.setAccepted(equals(qaProp.getLastProposal(), qaProp.getLastProposal()) ? qaProp.getAccepted() : null);
			q.setRejectedCount(qaProp.getRejectedCount());
			questions.add(q);
		}
		return questions;
	}

	private boolean equals(String o1, String o2) {
		return o1 == o2 || (o1 != null && o1.equals(o2));
	}

	private AnswerKind getAnswerKind(Answer answer, AnswerKind existing) {
		AnswerKind kind = null;
		if (answer instanceof StringAnswer) {
			kind = AnswerKind.STRING;
		} else if (answer instanceof NumberAnswer) {
			kind = AnswerKind.NUM;
		} else if (answer instanceof BooleanAnswer) {
			kind = AnswerKind.YESNO;
		}
		return (kind == existing || existing == null ? kind : null);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ServicePackage.QUIZ_TASK_SERVICE___PROPOSE_ANSWER__QA_STRING:
				return proposeAnswer((QA)arguments.get(0), (String)arguments.get(1));
			case ServicePackage.QUIZ_TASK_SERVICE___ACCEPT_ANSWER__QA_STRING:
				return acceptAnswer((QA)arguments.get(0), (String)arguments.get(1));
			case ServicePackage.QUIZ_TASK_SERVICE___ACCEPT_ALL_PROPOSALS:
				return acceptAllProposals();
			case ServicePackage.QUIZ_TASK_SERVICE___GET_QA_PROPOSALS__PLAYER:
				return getQAProposals((Player)arguments.get(0));
			case ServicePackage.QUIZ_TASK_SERVICE___GET_PLAYER_QUESTIONS:
				return getPlayerQuestions();
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
		if (! Util.containsPlayer(getContext(), player, false)) {
			throw new IllegalStateException("Player " + player + " cannot perform this task");
		}
	}

	private QAProposal checkQAInQAProposals(QA qa) {
		QAProposal qaProp = getContext().getQAProposal(qa);
		if (qaProp != null) {
			return qaProp;
		}
		throw new IllegalStateException("QA " + qa + " is not a valid QA");
	}

} //QuizTaskServiceImpl
