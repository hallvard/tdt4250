/**
 */
package no.hal.pg.quiz.runtime.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;


import no.hal.pg.quiz.runtime.QAProposal;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.RuntimePackage;
import no.hal.pg.quiz.runtime.service.Question;
import no.hal.pg.quiz.runtime.service.QuizTaskService;
import no.hal.pg.quiz.runtime.service.ServiceFactory;
import no.hal.pg.quiz.runtime.service.ServicePackage;

import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.util.Util;


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
import no.hal.pg.quiz.runtime.service.QuizTaskService;
import no.hal.pg.quiz.runtime.service.ServicePackage;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.util.Util;
import no.hal.quiz.QA;

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
	public Boolean proposeAnswer(Player player, no.hal.quiz.QA qa, String proposal) {
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
	public Boolean acceptAnswer(Player player, no.hal.quiz.QA qa, String proposal) {
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
	public EList<Question> getPlayerQuestions(Player player) {
		
		Collection<QAProposal> qaProposals = getQAProposals(player);
		EList<Question> questions = new BasicEList<Question>();
		for (QAProposal qaProp : qaProposals){
			Question q = ServiceFactory.eINSTANCE.createQuestion();
		//	q.setQuestion(qaProp.);
			
		}
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
				return proposeAnswer((Player)arguments.get(0), (no.hal.quiz.QA)arguments.get(1), (String)arguments.get(2));
			case ServicePackage.QUIZ_TASK_SERVICE___ACCEPT_ANSWER__PLAYER_QA_STRING:
				return acceptAnswer((Player)arguments.get(0), (no.hal.quiz.QA)arguments.get(1), (String)arguments.get(2));
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
