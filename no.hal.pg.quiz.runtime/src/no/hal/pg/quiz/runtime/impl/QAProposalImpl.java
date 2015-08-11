/**
 */
package no.hal.pg.quiz.runtime.impl;

import java.util.Collection;
import no.hal.pg.quiz.model.QA;

import no.hal.pg.quiz.runtime.QAProposal;
import no.hal.pg.quiz.runtime.RuntimePackage;

import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.impl.PlayersImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QA Proposal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.quiz.runtime.impl.QAProposalImpl#getQa <em>Qa</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.impl.QAProposalImpl#getProposal <em>Proposal</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.impl.QAProposalImpl#getAccepted <em>Accepted</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.impl.QAProposalImpl#getRejectedCount <em>Rejected Count</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.impl.QAProposalImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.impl.QAProposalImpl#getAnsweredBy <em>Answered By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QAProposalImpl extends PlayersImpl implements QAProposal {
	/**
	 * The cached value of the '{@link #getQa() <em>Qa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQa()
	 * @generated
	 * @ordered
	 */
	protected QA qa;

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
	 * The default value of the '{@link #getAccepted() <em>Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccepted()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ACCEPTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccepted() <em>Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccepted()
	 * @generated
	 * @ordered
	 */
	protected Boolean accepted = ACCEPTED_EDEFAULT;

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
	 * The cached value of the '{@link #getRejectedCount() <em>Rejected Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectedCount()
	 * @generated
	 * @ordered
	 */
	protected int rejectedCount = REJECTED_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> players;

	/**
	 * The cached value of the '{@link #getAnsweredBy() <em>Answered By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnsweredBy()
	 * @generated
	 * @ordered
	 */
	protected Player answeredBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QAProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.QA_PROPOSAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QA getQa() {
		if (qa != null && qa.eIsProxy()) {
			InternalEObject oldQa = (InternalEObject)qa;
			qa = (QA)eResolveProxy(oldQa);
			if (qa != oldQa) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.QA_PROPOSAL__QA, oldQa, qa));
			}
		}
		return qa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QA basicGetQa() {
		return qa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQa(QA newQa) {
		QA oldQa = qa;
		qa = newQa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.QA_PROPOSAL__QA, oldQa, qa));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.QA_PROPOSAL__PROPOSAL, oldProposal, proposal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAccepted() {
		return accepted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccepted(Boolean newAccepted) {
		Boolean oldAccepted = accepted;
		accepted = newAccepted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.QA_PROPOSAL__ACCEPTED, oldAccepted, accepted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRejectedCount() {
		return rejectedCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRejectedCount(int newRejectedCount) {
		int oldRejectedCount = rejectedCount;
		rejectedCount = newRejectedCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.QA_PROPOSAL__REJECTED_COUNT, oldRejectedCount, rejectedCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getPlayers() {
		if (players == null) {
			players = new EObjectResolvingEList<Player>(Player.class, this, RuntimePackage.QA_PROPOSAL__PLAYERS);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getAnsweredBy() {
		if (answeredBy != null && answeredBy.eIsProxy()) {
			InternalEObject oldAnsweredBy = (InternalEObject)answeredBy;
			answeredBy = (Player)eResolveProxy(oldAnsweredBy);
			if (answeredBy != oldAnsweredBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.QA_PROPOSAL__ANSWERED_BY, oldAnsweredBy, answeredBy));
			}
		}
		return answeredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetAnsweredBy() {
		return answeredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnsweredBy(Player newAnsweredBy) {
		Player oldAnsweredBy = answeredBy;
		answeredBy = newAnsweredBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.QA_PROPOSAL__ANSWERED_BY, oldAnsweredBy, answeredBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.QA_PROPOSAL__QA:
				if (resolve) return getQa();
				return basicGetQa();
			case RuntimePackage.QA_PROPOSAL__PROPOSAL:
				return getProposal();
			case RuntimePackage.QA_PROPOSAL__ACCEPTED:
				return getAccepted();
			case RuntimePackage.QA_PROPOSAL__REJECTED_COUNT:
				return getRejectedCount();
			case RuntimePackage.QA_PROPOSAL__PLAYERS:
				return getPlayers();
			case RuntimePackage.QA_PROPOSAL__ANSWERED_BY:
				if (resolve) return getAnsweredBy();
				return basicGetAnsweredBy();
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
			case RuntimePackage.QA_PROPOSAL__QA:
				setQa((QA)newValue);
				return;
			case RuntimePackage.QA_PROPOSAL__PROPOSAL:
				setProposal((String)newValue);
				return;
			case RuntimePackage.QA_PROPOSAL__ACCEPTED:
				setAccepted((Boolean)newValue);
				return;
			case RuntimePackage.QA_PROPOSAL__REJECTED_COUNT:
				setRejectedCount((Integer)newValue);
				return;
			case RuntimePackage.QA_PROPOSAL__PLAYERS:
				getPlayers().clear();
				getPlayers().addAll((Collection<? extends Player>)newValue);
				return;
			case RuntimePackage.QA_PROPOSAL__ANSWERED_BY:
				setAnsweredBy((Player)newValue);
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
			case RuntimePackage.QA_PROPOSAL__QA:
				setQa((QA)null);
				return;
			case RuntimePackage.QA_PROPOSAL__PROPOSAL:
				setProposal(PROPOSAL_EDEFAULT);
				return;
			case RuntimePackage.QA_PROPOSAL__ACCEPTED:
				setAccepted(ACCEPTED_EDEFAULT);
				return;
			case RuntimePackage.QA_PROPOSAL__REJECTED_COUNT:
				setRejectedCount(REJECTED_COUNT_EDEFAULT);
				return;
			case RuntimePackage.QA_PROPOSAL__PLAYERS:
				getPlayers().clear();
				return;
			case RuntimePackage.QA_PROPOSAL__ANSWERED_BY:
				setAnsweredBy((Player)null);
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
			case RuntimePackage.QA_PROPOSAL__QA:
				return qa != null;
			case RuntimePackage.QA_PROPOSAL__PROPOSAL:
				return PROPOSAL_EDEFAULT == null ? proposal != null : !PROPOSAL_EDEFAULT.equals(proposal);
			case RuntimePackage.QA_PROPOSAL__ACCEPTED:
				return ACCEPTED_EDEFAULT == null ? accepted != null : !ACCEPTED_EDEFAULT.equals(accepted);
			case RuntimePackage.QA_PROPOSAL__REJECTED_COUNT:
				return rejectedCount != REJECTED_COUNT_EDEFAULT;
			case RuntimePackage.QA_PROPOSAL__PLAYERS:
				return players != null && !players.isEmpty();
			case RuntimePackage.QA_PROPOSAL__ANSWERED_BY:
				return answeredBy != null;
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
		result.append(" (proposal: ");
		result.append(proposal);
		result.append(", accepted: ");
		result.append(accepted);
		result.append(", rejectedCount: ");
		result.append(rejectedCount);
		result.append(')');
		return result.toString();
	}

} //QAProposalImpl
