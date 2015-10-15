/**
 */
package no.hal.pg.quiz.runtime.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import no.hal.pg.quiz.runtime.QAProposal;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.RuntimePackage;
import no.hal.pg.quiz.runtime.service.AnswerKind;
import no.hal.pg.quiz.runtime.service.Question;
import no.hal.pg.quiz.runtime.service.QuizTaskService;
import no.hal.pg.quiz.runtime.service.ServiceFactory;
import no.hal.pg.quiz.runtime.service.ServicePackage;
import no.hal.pg.runtime.Player;
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
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.quiz.runtime.service.impl.QuizTaskServiceImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuizTaskServiceImpl extends MinimalEObjectImpl.Container implements QuizTaskService {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected QuizTask context;

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
	 * @generated
	 */
	@Override
	public QuizTask getContext() {
		if (context != null && ((EObject)context).eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (QuizTask)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.QUIZ_TASK_SERVICE__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizTask basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(QuizTask newContext) {
		QuizTask oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.QUIZ_TASK_SERVICE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Boolean proposeAnswer(Player player, QA qa, String proposal) {
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
	@Override
	public Boolean acceptAnswer(Player player, QA qa, String proposal) {
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
	public EList<Question> getPlayerQuestions(Player player) {
		Collection<QAProposal> qaProposals = getQAProposals(player);
		EList<Question> questions = new BasicEList<Question>();
		for (QAProposal qaProp : qaProposals){
			Question q = ServiceFactory.eINSTANCE.createQuestion();
			QA qa = qaProp.getQa();
			if (qa.getQ() instanceof StringQuestion) {
				q.setQuestion(((StringQuestion) qa.getQ()).getQuestion());
			}
			Answer answer = qa.getA();
			q.setKind(getAnswerKind(answer, null));
			q.setLastProposal(qaProp.getProposal());
			if (answer instanceof OptionsAnswer) {
				q.setNumChoices(answer instanceof SingleOptionsAnswer ? 1 : -1);
				int[] optionNums = no.hal.quiz.util.Util.proposalOptions((OptionsAnswer) answer, qaProp.getProposal());
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
			questions.add(q);
		}
		return questions;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.QUIZ_TASK_SERVICE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServicePackage.QUIZ_TASK_SERVICE__CONTEXT:
				setContext((QuizTask)newValue);
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
			case ServicePackage.QUIZ_TASK_SERVICE__CONTEXT:
				setContext((QuizTask)null);
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
			case ServicePackage.QUIZ_TASK_SERVICE__CONTEXT:
				return context != null;
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
			case ServicePackage.QUIZ_TASK_SERVICE___PROPOSE_ANSWER__PLAYER_QA_STRING:
				return proposeAnswer((Player)arguments.get(0), (QA)arguments.get(1), (String)arguments.get(2));
			case ServicePackage.QUIZ_TASK_SERVICE___ACCEPT_ANSWER__PLAYER_QA_STRING:
				return acceptAnswer((Player)arguments.get(0), (QA)arguments.get(1), (String)arguments.get(2));
			case ServicePackage.QUIZ_TASK_SERVICE___GET_QA_PROPOSALS__PLAYER:
				return getQAProposals((Player)arguments.get(0));
			case ServicePackage.QUIZ_TASK_SERVICE___GET_PLAYER_QUESTIONS__PLAYER:
				return getPlayerQuestions((Player)arguments.get(0));
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

	private void checkQAInQAProposals(QA qa) {
		for (QAProposal qaProposal : getContext().getProposals()) {
			if (qaProposal.getQa() == qa) {
				return;
			}
		}
		throw new IllegalStateException("QA " + qa + " is not a valid QA");
	}

} //QuizTaskServiceImpl
