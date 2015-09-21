/**
 */
package no.hal.quiz.impl;

import java.lang.reflect.Array;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import no.hal.quiz.Option;
import no.hal.quiz.OptionsAnswer;
import no.hal.quiz.QuizPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Options Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.impl.OptionsAnswerImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionsAnswerImpl extends AnswerImpl implements OptionsAnswer {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> options;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionsAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuizPackage.Literals.OPTIONS_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<Option>(Option.class, this, QuizPackage.OPTIONS_ANSWER__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuizPackage.OPTIONS_ANSWER__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
			case QuizPackage.OPTIONS_ANSWER__OPTIONS:
				return getOptions();
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
			case QuizPackage.OPTIONS_ANSWER__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends Option>)newValue);
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
			case QuizPackage.OPTIONS_ANSWER__OPTIONS:
				getOptions().clear();
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
			case QuizPackage.OPTIONS_ANSWER__OPTIONS:
				return options != null && !options.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	//
	
	private int findOptionNum(Object proposal) {
		int num = 0;
		for (Option option : options) {
			if (Boolean.TRUE.equals(option.getOption().accept(proposal))) {
				return num;
			}
			num++;
		}
		return -1;
	}
	
	@Override
	public Boolean accept(Object proposal) {
		if (proposal instanceof String) {
			String[] split = ((String) proposal).split(",");
			proposal = split;
		}
		if (proposal instanceof Collection) {
			proposal = ((Collection<?>) proposal).toArray();
		}
		if (! (proposal.getClass().isArray())) {
			proposal = new Object[]{proposal};
		}
		int[] optionNums = new int[Array.getLength(proposal)];
		for (int i = 0; i < optionNums.length; i++) {
			Object optionProposal = Array.get(proposal, i);
			int num = (optionProposal instanceof Integer ? (Integer) optionProposal : findOptionNum(optionProposal));
			if (num < 0 && optionProposal instanceof String) {
				try {
					num = Integer.valueOf((String) optionProposal);
				} catch (NumberFormatException e) {
				}
			}
			// check if num is legal
			if (num < 0 || num >= options.size()) {
				return false;
			}
			// check for duplicate
			for (int j = 0; j < i; j++) {
				if (optionNums[j] == num) {
					return false;
				}
			}
			optionNums[i] = num;
		}
		int count = 0;
		for (Option option : options) {
			if (option.isCorrect()) {
				count++;
			}
		}
		if (count != optionNums.length) {
			return false;
		}
		for (int i = 0; i < optionNums.length; i++) {
			if (! getOptions().get(optionNums[i]).isCorrect()) {
				return false;
			}
		}
		return true;
	}
} //OptionsAnswerImpl
