/**
 */
package no.hal.pg.quiz.model.impl;

import no.hal.pg.quiz.model.NumberAnswer;
import no.hal.pg.quiz.model.ModelPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NumberAnswerImpl extends SimpleAnswerImpl<Double> implements NumberAnswer {
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
	
	//
	
	@Override
	public Boolean accept(Object proposal) {
		try {
			proposal = Double.valueOf(proposal.toString());
		} catch (NumberFormatException e) {
			return false;
		}
		return super.accept(proposal);
	}

} //NumberAnswerImpl
