/**
 */
package no.hal.pg.quiz.runtime.impl;

import no.hal.pg.quiz.runtime.ProposeAnswerAction;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.RuntimePackage;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.impl.TaskActionImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propose Answer Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.quiz.runtime.impl.ProposeAnswerActionImpl#getQaNum <em>Qa Num</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.impl.ProposeAnswerActionImpl#getProposal <em>Proposal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProposeAnswerActionImpl extends TaskActionImpl<QuizTask> implements ProposeAnswerAction {
	/**
	 * The default value of the '{@link #getQaNum() <em>Qa Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQaNum()
	 * @generated
	 * @ordered
	 */
	protected static final int QA_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQaNum() <em>Qa Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQaNum()
	 * @generated
	 * @ordered
	 */
	protected int qaNum = QA_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getProposal() <em>Proposal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposal()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPOSAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProposal() <em>Proposal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposal()
	 * @generated
	 * @ordered
	 */
	protected String proposal = PROPOSAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProposeAnswerActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.PROPOSE_ANSWER_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetTask(QuizTask newTask, NotificationChain msgs) {
		return super.basicSetTask(newTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQaNum() {
		return qaNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQaNum(int newQaNum) {
		int oldQaNum = qaNum;
		qaNum = newQaNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.PROPOSE_ANSWER_ACTION__QA_NUM, oldQaNum, qaNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProposal() {
		return proposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProposal(String newProposal) {
		String oldProposal = proposal;
		proposal = newProposal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.PROPOSE_ANSWER_ACTION__PROPOSAL, oldProposal, proposal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.PROPOSE_ANSWER_ACTION__QA_NUM:
				return getQaNum();
			case RuntimePackage.PROPOSE_ANSWER_ACTION__PROPOSAL:
				return getProposal();
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
			case RuntimePackage.PROPOSE_ANSWER_ACTION__QA_NUM:
				setQaNum((Integer)newValue);
				return;
			case RuntimePackage.PROPOSE_ANSWER_ACTION__PROPOSAL:
				setProposal((String)newValue);
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
			case RuntimePackage.PROPOSE_ANSWER_ACTION__QA_NUM:
				setQaNum(QA_NUM_EDEFAULT);
				return;
			case RuntimePackage.PROPOSE_ANSWER_ACTION__PROPOSAL:
				setProposal(PROPOSAL_EDEFAULT);
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
			case RuntimePackage.PROPOSE_ANSWER_ACTION__QA_NUM:
				return qaNum != QA_NUM_EDEFAULT;
			case RuntimePackage.PROPOSE_ANSWER_ACTION__PROPOSAL:
				return PROPOSAL_EDEFAULT == null ? proposal != null : !PROPOSAL_EDEFAULT.equals(proposal);
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
		result.append(" (qaNum: ");
		result.append(qaNum);
		result.append(", proposal: ");
		result.append(proposal);
		result.append(')');
		return result.toString();
	}

	//
	
	@Override
	public boolean prepare(Task<?> task) {
		if (! (task instanceof QuizTask)) {
			return false;
		}
		if (! task.isInState(RuntimePackage.eINSTANCE.getAcceptingAnswerState())) {
			return false;
		}
		if (! super.prepare(task)) {
			return false;
		}
		if (getQaNum() < 0 || ((QuizTask) task).getProposals().size() <= getQaNum()) {
			return false;
		}
		return true;
	}
	
	protected boolean perform(boolean accept) {
		Boolean accepted = getTask().proposeAnswer(getQaNum(), getProposal(), accept);
		return (! accept) || accepted != null;
	}

	@Override
	public boolean perform() {
		return perform(false);
	}

} //ProposeAnswerActionImpl
