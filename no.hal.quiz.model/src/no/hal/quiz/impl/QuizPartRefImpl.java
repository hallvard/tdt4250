/**
 */
package no.hal.quiz.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import no.hal.quiz.QuizPackage;
import no.hal.quiz.QuizPart;
import no.hal.quiz.QuizPartRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.impl.QuizPartRefImpl#getPartRef <em>Part Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuizPartRefImpl extends AbstractQuizPartImpl implements QuizPartRef {
	/**
	 * The cached value of the '{@link #getPartRef() <em>Part Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartRef()
	 * @generated
	 * @ordered
	 */
	protected QuizPart partRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizPartRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuizPackage.Literals.QUIZ_PART_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizPart getPartRef() {
		if (partRef != null && partRef.eIsProxy()) {
			InternalEObject oldPartRef = (InternalEObject)partRef;
			partRef = (QuizPart)eResolveProxy(oldPartRef);
			if (partRef != oldPartRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuizPackage.QUIZ_PART_REF__PART_REF, oldPartRef, partRef));
			}
		}
		return partRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizPart basicGetPartRef() {
		return partRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartRef(QuizPart newPartRef) {
		QuizPart oldPartRef = partRef;
		partRef = newPartRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.QUIZ_PART_REF__PART_REF, oldPartRef, partRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuizPackage.QUIZ_PART_REF__PART_REF:
				if (resolve) return getPartRef();
				return basicGetPartRef();
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
			case QuizPackage.QUIZ_PART_REF__PART_REF:
				setPartRef((QuizPart)newValue);
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
			case QuizPackage.QUIZ_PART_REF__PART_REF:
				setPartRef((QuizPart)null);
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
			case QuizPackage.QUIZ_PART_REF__PART_REF:
				return partRef != null;
		}
		return super.eIsSet(featureID);
	}

} //QuizPartRefImpl
