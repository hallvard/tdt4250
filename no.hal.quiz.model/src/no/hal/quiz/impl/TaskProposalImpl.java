/**
 */
package no.hal.quiz.impl;

import no.hal.quiz.QuizPackage;
import no.hal.quiz.TaskAnswer;
import no.hal.quiz.TaskProposal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Proposal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.impl.TaskProposalImpl#getCompletion <em>Completion</em>}</li>
 *   <li>{@link no.hal.quiz.impl.TaskProposalImpl#getProof <em>Proof</em>}</li>
 *   <li>{@link no.hal.quiz.impl.TaskProposalImpl#getAttemptCount <em>Attempt Count</em>}</li>
 *   <li>{@link no.hal.quiz.impl.TaskProposalImpl#getPerformedCount <em>Performed Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskProposalImpl<T extends TaskAnswer> extends ProposalImpl<T> implements TaskProposal<T> {
	/**
	 * The default value of the '{@link #getCompletion() <em>Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletion()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPLETION_EDEFAULT = -1.0;

	/**
	 * The cached value of the '{@link #getCompletion() <em>Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletion()
	 * @generated
	 * @ordered
	 */
	protected double completion = COMPLETION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProof() <em>Proof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProof()
	 * @generated
	 * @ordered
	 */
	protected static final String PROOF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProof() <em>Proof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProof()
	 * @generated
	 * @ordered
	 */
	protected String proof = PROOF_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttemptCount() <em>Attempt Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttemptCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTEMPT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttemptCount() <em>Attempt Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttemptCount()
	 * @generated
	 * @ordered
	 */
	protected int attemptCount = ATTEMPT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerformedCount() <em>Performed Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedCount()
	 * @generated
	 * @ordered
	 */
	protected static final int PERFORMED_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPerformedCount() <em>Performed Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedCount()
	 * @generated
	 * @ordered
	 */
	protected int performedCount = PERFORMED_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuizPackage.Literals.TASK_PROPOSAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setAnswer(T newAnswer) {
		super.setAnswer(newAnswer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCompletion() {
		return completion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletion(double newCompletion) {
		double oldCompletion = completion;
		completion = newCompletion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.TASK_PROPOSAL__COMPLETION, oldCompletion, completion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProof() {
		return proof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProof(String newProof) {
		String oldProof = proof;
		proof = newProof;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.TASK_PROPOSAL__PROOF, oldProof, proof));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttemptCount() {
		return attemptCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttemptCount(int newAttemptCount) {
		int oldAttemptCount = attemptCount;
		attemptCount = newAttemptCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.TASK_PROPOSAL__ATTEMPT_COUNT, oldAttemptCount, attemptCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPerformedCount() {
		return performedCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformedCount(int newPerformedCount) {
		int oldPerformedCount = performedCount;
		performedCount = newPerformedCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.TASK_PROPOSAL__PERFORMED_COUNT, oldPerformedCount, performedCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuizPackage.TASK_PROPOSAL__COMPLETION:
				return getCompletion();
			case QuizPackage.TASK_PROPOSAL__PROOF:
				return getProof();
			case QuizPackage.TASK_PROPOSAL__ATTEMPT_COUNT:
				return getAttemptCount();
			case QuizPackage.TASK_PROPOSAL__PERFORMED_COUNT:
				return getPerformedCount();
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
			case QuizPackage.TASK_PROPOSAL__COMPLETION:
				setCompletion((Double)newValue);
				return;
			case QuizPackage.TASK_PROPOSAL__PROOF:
				setProof((String)newValue);
				return;
			case QuizPackage.TASK_PROPOSAL__ATTEMPT_COUNT:
				setAttemptCount((Integer)newValue);
				return;
			case QuizPackage.TASK_PROPOSAL__PERFORMED_COUNT:
				setPerformedCount((Integer)newValue);
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
			case QuizPackage.TASK_PROPOSAL__COMPLETION:
				setCompletion(COMPLETION_EDEFAULT);
				return;
			case QuizPackage.TASK_PROPOSAL__PROOF:
				setProof(PROOF_EDEFAULT);
				return;
			case QuizPackage.TASK_PROPOSAL__ATTEMPT_COUNT:
				setAttemptCount(ATTEMPT_COUNT_EDEFAULT);
				return;
			case QuizPackage.TASK_PROPOSAL__PERFORMED_COUNT:
				setPerformedCount(PERFORMED_COUNT_EDEFAULT);
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
			case QuizPackage.TASK_PROPOSAL__COMPLETION:
				return completion != COMPLETION_EDEFAULT;
			case QuizPackage.TASK_PROPOSAL__PROOF:
				return PROOF_EDEFAULT == null ? proof != null : !PROOF_EDEFAULT.equals(proof);
			case QuizPackage.TASK_PROPOSAL__ATTEMPT_COUNT:
				return attemptCount != ATTEMPT_COUNT_EDEFAULT;
			case QuizPackage.TASK_PROPOSAL__PERFORMED_COUNT:
				return performedCount != PERFORMED_COUNT_EDEFAULT;
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
		result.append(" (completion: ");
		result.append(completion);
		result.append(", proof: ");
		result.append(proof);
		result.append(", attemptCount: ");
		result.append(attemptCount);
		result.append(", performedCount: ");
		result.append(performedCount);
		result.append(')');
		return result.toString();
	}

} //TaskProposalImpl
