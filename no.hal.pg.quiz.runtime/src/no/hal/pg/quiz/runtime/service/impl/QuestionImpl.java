/**
 */
package no.hal.pg.quiz.runtime.service.impl;

import java.util.Collection;

import no.hal.pg.quiz.runtime.service.Answer;
import no.hal.pg.quiz.runtime.service.AnswerKind;
import no.hal.pg.quiz.runtime.service.Question;
import no.hal.pg.quiz.runtime.service.ServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.quiz.runtime.service.impl.QuestionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.impl.QuestionImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.impl.QuestionImpl#getLastProposal <em>Last Proposal</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.impl.QuestionImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.impl.QuestionImpl#getNumChoices <em>Num Choices</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.impl.QuestionImpl#getQid <em>Qid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionImpl extends MinimalEObjectImpl.Container implements Question {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final AnswerKind KIND_EDEFAULT = AnswerKind.STRING;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected AnswerKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected String question = QUESTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastProposal() <em>Last Proposal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastProposal()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_PROPOSAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastProposal() <em>Last Proposal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastProposal()
	 * @generated
	 * @ordered
	 */
	protected String lastProposal = LAST_PROPOSAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> options;

	/**
	 * The default value of the '{@link #getNumChoices() <em>Num Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumChoices()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_CHOICES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumChoices() <em>Num Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumChoices()
	 * @generated
	 * @ordered
	 */
	protected int numChoices = NUM_CHOICES_EDEFAULT;

	/**
	 * The default value of the '{@link #getQid() <em>Qid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQid()
	 * @generated
	 * @ordered
	 */
	protected static final String QID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQid() <em>Qid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQid()
	 * @generated
	 * @ordered
	 */
	protected String qid = QID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(AnswerKind newKind) {
		AnswerKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.QUESTION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestion(String newQuestion) {
		String oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.QUESTION__QUESTION, oldQuestion, question));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastProposal() {
		return lastProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastProposal(String newLastProposal) {
		String oldLastProposal = lastProposal;
		lastProposal = newLastProposal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.QUESTION__LAST_PROPOSAL, oldLastProposal, lastProposal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Answer> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<Answer>(Answer.class, this, ServicePackage.QUESTION__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumChoices() {
		return numChoices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumChoices(int newNumChoices) {
		int oldNumChoices = numChoices;
		numChoices = newNumChoices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.QUESTION__NUM_CHOICES, oldNumChoices, numChoices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQid() {
		return qid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQid(String newQid) {
		String oldQid = qid;
		qid = newQid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.QUESTION__QID, oldQid, qid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.QUESTION__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
			case ServicePackage.QUESTION__KIND:
				return getKind();
			case ServicePackage.QUESTION__QUESTION:
				return getQuestion();
			case ServicePackage.QUESTION__LAST_PROPOSAL:
				return getLastProposal();
			case ServicePackage.QUESTION__OPTIONS:
				return getOptions();
			case ServicePackage.QUESTION__NUM_CHOICES:
				return getNumChoices();
			case ServicePackage.QUESTION__QID:
				return getQid();
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
			case ServicePackage.QUESTION__KIND:
				setKind((AnswerKind)newValue);
				return;
			case ServicePackage.QUESTION__QUESTION:
				setQuestion((String)newValue);
				return;
			case ServicePackage.QUESTION__LAST_PROPOSAL:
				setLastProposal((String)newValue);
				return;
			case ServicePackage.QUESTION__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends Answer>)newValue);
				return;
			case ServicePackage.QUESTION__NUM_CHOICES:
				setNumChoices((Integer)newValue);
				return;
			case ServicePackage.QUESTION__QID:
				setQid((String)newValue);
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
			case ServicePackage.QUESTION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case ServicePackage.QUESTION__QUESTION:
				setQuestion(QUESTION_EDEFAULT);
				return;
			case ServicePackage.QUESTION__LAST_PROPOSAL:
				setLastProposal(LAST_PROPOSAL_EDEFAULT);
				return;
			case ServicePackage.QUESTION__OPTIONS:
				getOptions().clear();
				return;
			case ServicePackage.QUESTION__NUM_CHOICES:
				setNumChoices(NUM_CHOICES_EDEFAULT);
				return;
			case ServicePackage.QUESTION__QID:
				setQid(QID_EDEFAULT);
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
			case ServicePackage.QUESTION__KIND:
				return kind != KIND_EDEFAULT;
			case ServicePackage.QUESTION__QUESTION:
				return QUESTION_EDEFAULT == null ? question != null : !QUESTION_EDEFAULT.equals(question);
			case ServicePackage.QUESTION__LAST_PROPOSAL:
				return LAST_PROPOSAL_EDEFAULT == null ? lastProposal != null : !LAST_PROPOSAL_EDEFAULT.equals(lastProposal);
			case ServicePackage.QUESTION__OPTIONS:
				return options != null && !options.isEmpty();
			case ServicePackage.QUESTION__NUM_CHOICES:
				return numChoices != NUM_CHOICES_EDEFAULT;
			case ServicePackage.QUESTION__QID:
				return QID_EDEFAULT == null ? qid != null : !QID_EDEFAULT.equals(qid);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(", question: ");
		result.append(question);
		result.append(", lastProposal: ");
		result.append(lastProposal);
		result.append(", numChoices: ");
		result.append(numChoices);
		result.append(", qid: ");
		result.append(qid);
		result.append(')');
		return result.toString();
	}

} //QuestionImpl
