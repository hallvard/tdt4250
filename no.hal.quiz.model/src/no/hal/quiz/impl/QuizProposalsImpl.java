/**
 */
package no.hal.quiz.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.quiz.Proposal;
import no.hal.quiz.Quiz;
import no.hal.quiz.QuizPackage;
import no.hal.quiz.QuizPartProposals;
import no.hal.quiz.QuizProposals;
import org.eclipse.emf.common.notify.Notification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proposals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.impl.QuizProposalsImpl#getQuiz <em>Quiz</em>}</li>
 *   <li>{@link no.hal.quiz.impl.QuizProposalsImpl#getProposals <em>Proposals</em>}</li>
 *   <li>{@link no.hal.quiz.impl.QuizProposalsImpl#getAllProposals <em>All Proposals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuizProposalsImpl extends MinimalEObjectImpl.Container implements QuizProposals {
	/**
	 * The cached value of the '{@link #getQuiz() <em>Quiz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuiz()
	 * @generated
	 * @ordered
	 */
	protected Quiz quiz;
	/**
	 * The cached value of the '{@link #getProposals() <em>Proposals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposals()
	 * @generated
	 * @ordered
	 */
	protected EList<QuizPartProposals> proposals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizProposalsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuizPackage.Literals.QUIZ_PROPOSALS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quiz getQuiz() {
		if (quiz != null && quiz.eIsProxy()) {
			InternalEObject oldQuiz = (InternalEObject)quiz;
			quiz = (Quiz)eResolveProxy(oldQuiz);
			if (quiz != oldQuiz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuizPackage.QUIZ_PROPOSALS__QUIZ, oldQuiz, quiz));
			}
		}
		return quiz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quiz basicGetQuiz() {
		return quiz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuiz(Quiz newQuiz) {
		Quiz oldQuiz = quiz;
		quiz = newQuiz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.QUIZ_PROPOSALS__QUIZ, oldQuiz, quiz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuizPartProposals> getProposals() {
		if (proposals == null) {
			proposals = new EObjectContainmentEList<QuizPartProposals>(QuizPartProposals.class, this, QuizPackage.QUIZ_PROPOSALS__PROPOSALS);
		}
		return proposals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Proposal<?>> getAllProposals() {
		EList<Proposal<?>> proposals = new BasicEList<Proposal<?>>();
		for (QuizPartProposals proposal : getProposals()) {
			proposals.addAll(proposal.getProposals());
		}
		return ECollections.<Proposal<?>>unmodifiableEList(proposals);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuizPackage.QUIZ_PROPOSALS__PROPOSALS:
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
			case QuizPackage.QUIZ_PROPOSALS__QUIZ:
				if (resolve) return getQuiz();
				return basicGetQuiz();
			case QuizPackage.QUIZ_PROPOSALS__PROPOSALS:
				return getProposals();
			case QuizPackage.QUIZ_PROPOSALS__ALL_PROPOSALS:
				return getAllProposals();
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
			case QuizPackage.QUIZ_PROPOSALS__QUIZ:
				setQuiz((Quiz)newValue);
				return;
			case QuizPackage.QUIZ_PROPOSALS__PROPOSALS:
				getProposals().clear();
				getProposals().addAll((Collection<? extends QuizPartProposals>)newValue);
				return;
			case QuizPackage.QUIZ_PROPOSALS__ALL_PROPOSALS:
				getAllProposals().clear();
				getAllProposals().addAll((Collection<? extends Proposal<?>>)newValue);
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
			case QuizPackage.QUIZ_PROPOSALS__QUIZ:
				setQuiz((Quiz)null);
				return;
			case QuizPackage.QUIZ_PROPOSALS__PROPOSALS:
				getProposals().clear();
				return;
			case QuizPackage.QUIZ_PROPOSALS__ALL_PROPOSALS:
				getAllProposals().clear();
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
			case QuizPackage.QUIZ_PROPOSALS__QUIZ:
				return quiz != null;
			case QuizPackage.QUIZ_PROPOSALS__PROPOSALS:
				return proposals != null && !proposals.isEmpty();
			case QuizPackage.QUIZ_PROPOSALS__ALL_PROPOSALS:
				return !getAllProposals().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuizProposalsImpl
