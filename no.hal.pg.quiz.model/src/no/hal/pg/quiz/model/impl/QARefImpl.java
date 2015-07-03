/**
 */
package no.hal.pg.quiz.model.impl;

import no.hal.pg.quiz.model.QA;
import no.hal.pg.quiz.model.QARef;
import no.hal.pg.quiz.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QA Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.quiz.model.impl.QARefImpl#getQaRef <em>Qa Ref</em>}</li>
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
		return ModelPackage.Literals.QA_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QA getQaRef() {
		if (qaRef != null && qaRef.eIsProxy()) {
			InternalEObject oldQaRef = (InternalEObject)qaRef;
			qaRef = (QA)eResolveProxy(oldQaRef);
			if (qaRef != oldQaRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.QA_REF__QA_REF, oldQaRef, qaRef));
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
	public void setQaRef(QA newQaRef) {
		QA oldQaRef = qaRef;
		qaRef = newQaRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.QA_REF__QA_REF, oldQaRef, qaRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.QA_REF__QA_REF:
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
			case ModelPackage.QA_REF__QA_REF:
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
			case ModelPackage.QA_REF__QA_REF:
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
			case ModelPackage.QA_REF__QA_REF:
				return qaRef != null;
		}
		return super.eIsSet(featureID);
	}

} //QARefImpl
