/**
 */
package no.hal.quiz.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.quiz.Answer;
import no.hal.quiz.QA;
import no.hal.quiz.QARef;
import no.hal.quiz.Question;
import no.hal.quiz.QuizPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QA Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.impl.QARefImpl#getQaRef <em>Qa Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QARefImpl extends AbstractQAImpl implements QARef {
	/**
	 * The cached value of the '{@link #getQaRef() <em>Qa Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQaRef()
	 * @generated
	 * @ordered
	 */
	protected QA qaRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QARefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuizPackage.Literals.QA_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QA getQaRef() {
		if (qaRef != null && qaRef.eIsProxy()) {
			InternalEObject oldQaRef = (InternalEObject)qaRef;
			qaRef = (QA)eResolveProxy(oldQaRef);
			if (qaRef != oldQaRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuizPackage.QA_REF__QA_REF, oldQaRef, qaRef));
			}
		}
		return qaRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QA basicGetQaRef() {
		return qaRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQaRef(QA newQaRef) {
		QA oldQaRef = qaRef;
		qaRef = newQaRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.QA_REF__QA_REF, oldQaRef, qaRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuizPackage.QA_REF__QA_REF:
				if (resolve) return getQaRef();
				return basicGetQaRef();
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
			case QuizPackage.QA_REF__QA_REF:
				setQaRef((QA)newValue);
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
			case QuizPackage.QA_REF__QA_REF:
				setQaRef((QA)null);
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
			case QuizPackage.QA_REF__QA_REF:
				return qaRef != null;
		}
		return super.eIsSet(featureID);
	}
	
	//
	
	@Override
	public Question getQ() {
		return getQaRef().getQ();
	}
	
	@Override
	public Answer getA() {
		return getQaRef().getA();
	}

} //QARefImpl
