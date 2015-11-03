/**
 */
package no.hal.pg.quiz.runtime.service.impl;

import no.hal.pg.quiz.runtime.QAProposal;

import no.hal.pg.quiz.runtime.service.QAProposalService;
import no.hal.pg.quiz.runtime.service.ServicePackage;
import no.hal.quiz.Question;
import no.hal.quiz.StringQuestion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QA Proposal Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.quiz.runtime.service.impl.QAProposalServiceImpl#getContext <em>Context</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.impl.QAProposalServiceImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.impl.QAProposalServiceImpl#getProposal <em>Proposal</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.impl.QAProposalServiceImpl#getAccepted <em>Accepted</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.impl.QAProposalServiceImpl#getRejectedCount <em>Rejected Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QAProposalServiceImpl extends MinimalEObjectImpl.Container implements QAProposalService {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected QAProposal context;

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
	 * The default value of the '{@link #getProposal() <em>Proposal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposal()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPOSAL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAccepted() <em>Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccepted()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ACCEPTED_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRejectedCount() <em>Rejected Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectedCount()
	 * @generated
	 * @ordered
	 */
	protected static final int REJECTED_COUNT_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QAProposalServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.QA_PROPOSAL_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAProposal getContext() {
		if (context != null && ((EObject)context).eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (QAProposal)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.QA_PROPOSAL_SERVICE__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAProposal basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(QAProposal newContext) {
		QAProposal oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.QA_PROPOSAL_SERVICE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getQuestion() {
		Question q = getContext().getQa().getQ();
		return (q instanceof StringQuestion ? ((StringQuestion) q).getQuestion() : "???");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getProposal() {
		return getContext().getLastProposal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean getAccepted() {
		return getContext().getAccepted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getRejectedCount() {
		return getContext().getRejectedCount();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.QA_PROPOSAL_SERVICE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ServicePackage.QA_PROPOSAL_SERVICE__QUESTION:
				return getQuestion();
			case ServicePackage.QA_PROPOSAL_SERVICE__PROPOSAL:
				return getProposal();
			case ServicePackage.QA_PROPOSAL_SERVICE__ACCEPTED:
				return getAccepted();
			case ServicePackage.QA_PROPOSAL_SERVICE__REJECTED_COUNT:
				return getRejectedCount();
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
			case ServicePackage.QA_PROPOSAL_SERVICE__CONTEXT:
				setContext((QAProposal)newValue);
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
			case ServicePackage.QA_PROPOSAL_SERVICE__CONTEXT:
				setContext((QAProposal)null);
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
			case ServicePackage.QA_PROPOSAL_SERVICE__CONTEXT:
				return context != null;
			case ServicePackage.QA_PROPOSAL_SERVICE__QUESTION:
				return QUESTION_EDEFAULT == null ? getQuestion() != null : !QUESTION_EDEFAULT.equals(getQuestion());
			case ServicePackage.QA_PROPOSAL_SERVICE__PROPOSAL:
				return PROPOSAL_EDEFAULT == null ? getProposal() != null : !PROPOSAL_EDEFAULT.equals(getProposal());
			case ServicePackage.QA_PROPOSAL_SERVICE__ACCEPTED:
				return ACCEPTED_EDEFAULT == null ? getAccepted() != null : !ACCEPTED_EDEFAULT.equals(getAccepted());
			case ServicePackage.QA_PROPOSAL_SERVICE__REJECTED_COUNT:
				return getRejectedCount() != REJECTED_COUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //QAProposalServiceImpl
