/**
 */
package no.hal.pg.quiz.runtime.impl;

import no.hal.pg.quiz.model.QA;
import no.hal.pg.quiz.runtime.QAProposal;
import no.hal.pg.quiz.runtime.QARef;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.QuizTaskService;
import no.hal.pg.quiz.runtime.RuntimePackage;

import no.hal.pg.runtime.impl.RefImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QA Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.quiz.runtime.impl.QARefImpl#getQaNum <em>Qa Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QARefImpl extends RefImpl<QA> implements QARef {
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
		return RuntimePackage.Literals.QA_REF;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.QA_REF__QA_NUM, oldQaNum, qaNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.QA_REF__QA_NUM:
				return getQaNum();
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
			case RuntimePackage.QA_REF__QA_NUM:
				setQaNum((Integer)newValue);
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
			case RuntimePackage.QA_REF__QA_NUM:
				setQaNum(QA_NUM_EDEFAULT);
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
			case RuntimePackage.QA_REF__QA_NUM:
				return qaNum != QA_NUM_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

	//
	
	@Override
	public QA get(EObject context) {
		if (context instanceof QuizTaskService) {
			context = ((QuizTaskService) context).getContext();
		}
		if (context instanceof QuizTask) {
			EList<QAProposal> proposals = ((QuizTask) context).getProposals();
			if (proposals.size() > getQaNum()) {
				return proposals.get(getQaNum()).getQa();
			}
		}
		return super.get(context);
	}
} //QARefImpl
