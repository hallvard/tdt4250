/**
 */
package no.hal.pg.quiz.model.impl;

import no.hal.pg.quiz.model.BooleanAnswer;
import no.hal.pg.quiz.model.ModelPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BooleanAnswerImpl extends SimpleAnswerImpl<Boolean> implements BooleanAnswer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BOOLEAN_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setValue(Boolean newValue) {
		super.setValue(newValue);
	}

	//

	@Override
	public Boolean accept(Object proposal) {
		String s = proposal.toString();
		return s.equalsIgnoreCase(Boolean.valueOf(Boolean.TRUE.equals(getValue())).toString());
	}

} //BooleanAnswerImpl
