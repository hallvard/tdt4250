/**
 */
package no.hal.pg.quiz.model.impl;

import no.hal.pg.quiz.model.NumberAnswer;
import org.eclipse.emf.common.notify.Notification;
import no.hal.pg.quiz.model.ModelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.quiz.model.impl.NumberAnswerImpl#getErrorMargin <em>Error Margin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberAnswerImpl extends SimpleAnswerImpl<Double> implements NumberAnswer {
	/**
	 * The default value of the '{@link #getErrorMargin() <em>Error Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMargin()
	 * @generated
	 * @ordered
	 */
	protected static final double ERROR_MARGIN_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getErrorMargin() <em>Error Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMargin()
	 * @generated
	 * @ordered
	 */
	protected double errorMargin = ERROR_MARGIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.NUMBER_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setValue(Double newValue) {
		super.setValue(newValue);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getErrorMargin() {
		return errorMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorMargin(double newErrorMargin) {
		double oldErrorMargin = errorMargin;
		errorMargin = newErrorMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NUMBER_ANSWER__ERROR_MARGIN, oldErrorMargin, errorMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.NUMBER_ANSWER__ERROR_MARGIN:
				return getErrorMargin();
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
			case ModelPackage.NUMBER_ANSWER__ERROR_MARGIN:
				setErrorMargin((Double)newValue);
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
			case ModelPackage.NUMBER_ANSWER__ERROR_MARGIN:
				setErrorMargin(ERROR_MARGIN_EDEFAULT);
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
			case ModelPackage.NUMBER_ANSWER__ERROR_MARGIN:
				return errorMargin != ERROR_MARGIN_EDEFAULT;
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
		result.append(" (errorMargin: ");
		result.append(errorMargin);
		result.append(')');
		return result.toString();
	}

	//
	
	@Override
	public Boolean accept(Object proposal) {
		try {
			double proposalValue = Double.valueOf(proposal.toString());
			return (proposalValue >= value - errorMargin && proposalValue <= value + errorMargin);
		} catch (NumberFormatException e) {
			return false;
		}
	}

} //NumberAnswerImpl
