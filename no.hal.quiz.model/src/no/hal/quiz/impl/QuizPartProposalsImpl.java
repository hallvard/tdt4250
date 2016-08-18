/**
 */
package no.hal.quiz.impl;

import java.util.Collection;

import no.hal.quiz.Proposal;
import no.hal.quiz.QuizPackage;
import no.hal.quiz.QuizPart;
import no.hal.quiz.QuizPartProposals;

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
 * An implementation of the model object '<em><b>Part Proposals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.impl.QuizPartProposalsImpl#getProposals <em>Proposals</em>}</li>
 *   <li>{@link no.hal.quiz.impl.QuizPartProposalsImpl#getQuizPart <em>Quiz Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuizPartProposalsImpl extends MinimalEObjectImpl.Container implements QuizPartProposals {
	/**
	 * The cached value of the '{@link #getProposals() <em>Proposals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposals()
	 * @generated
	 * @ordered
	 */
	protected EList<Proposal<?>> proposals;

	/**
	 * The cached value of the '{@link #getQuizPart() <em>Quiz Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuizPart()
	 * @generated
	 * @ordered
	 */
	protected QuizPart quizPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizPartProposalsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuizPackage.Literals.QUIZ_PART_PROPOSALS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Proposal<?>> getProposals() {
		if (proposals == null) {
			proposals = new EObjectContainmentEList<Proposal<?>>(Proposal.class, this, QuizPackage.QUIZ_PART_PROPOSALS__PROPOSALS);
		}
		return proposals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizPart getQuizPart() {
		if (quizPart != null && quizPart.eIsProxy()) {
			InternalEObject oldQuizPart = (InternalEObject)quizPart;
			quizPart = (QuizPart)eResolveProxy(oldQuizPart);
			if (quizPart != oldQuizPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuizPackage.QUIZ_PART_PROPOSALS__QUIZ_PART, oldQuizPart, quizPart));
			}
		}
		return quizPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizPart basicGetQuizPart() {
		return quizPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuizPart(QuizPart newQuizPart) {
		QuizPart oldQuizPart = quizPart;
		quizPart = newQuizPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.QUIZ_PART_PROPOSALS__QUIZ_PART, oldQuizPart, quizPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuizPackage.QUIZ_PART_PROPOSALS__PROPOSALS:
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
			case QuizPackage.QUIZ_PART_PROPOSALS__PROPOSALS:
				return getProposals();
			case QuizPackage.QUIZ_PART_PROPOSALS__QUIZ_PART:
				if (resolve) return getQuizPart();
				return basicGetQuizPart();
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
			case QuizPackage.QUIZ_PART_PROPOSALS__PROPOSALS:
				getProposals().clear();
				getProposals().addAll((Collection<? extends Proposal<?>>)newValue);
				return;
			case QuizPackage.QUIZ_PART_PROPOSALS__QUIZ_PART:
				setQuizPart((QuizPart)newValue);
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
			case QuizPackage.QUIZ_PART_PROPOSALS__PROPOSALS:
				getProposals().clear();
				return;
			case QuizPackage.QUIZ_PART_PROPOSALS__QUIZ_PART:
				setQuizPart((QuizPart)null);
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
			case QuizPackage.QUIZ_PART_PROPOSALS__PROPOSALS:
				return proposals != null && !proposals.isEmpty();
			case QuizPackage.QUIZ_PART_PROPOSALS__QUIZ_PART:
				return quizPart != null;
		}
		return super.eIsSet(featureID);
	}

} //QuizPartProposalsImpl
