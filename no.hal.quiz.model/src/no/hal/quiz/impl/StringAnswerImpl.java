/**
 */
package no.hal.quiz.impl;

import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.pg.model.ModelPackage;
import no.hal.quiz.QuizPackage;
import no.hal.quiz.StringAnswer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.impl.StringAnswerImpl#isRegexp <em>Regexp</em>}</li>
 *   <li>{@link no.hal.quiz.impl.StringAnswerImpl#isIgnoreCase <em>Ignore Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringAnswerImpl extends SimpleAnswerImpl<String> implements StringAnswer {
	/**
	 * The default value of the '{@link #isRegexp() <em>Regexp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegexp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REGEXP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRegexp() <em>Regexp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegexp()
	 * @generated
	 * @ordered
	 */
	protected boolean regexp = REGEXP_EDEFAULT;

	/**
	 * The default value of the '{@link #isIgnoreCase() <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreCase()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_CASE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnoreCase() <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreCase()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreCase = IGNORE_CASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuizPackage.Literals.STRING_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		super.setValue(newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRegexp() {
		return regexp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRegexp(boolean newRegexp) {
		boolean oldRegexp = regexp;
		regexp = newRegexp;
		invalidatePattern();
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.STRING_ANSWER__REGEXP, oldRegexp, regexp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIgnoreCase() {
		return ignoreCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIgnoreCase(boolean newIgnoreCase) {
		boolean oldIgnoreCase = ignoreCase;
		ignoreCase = newIgnoreCase;
		invalidatePattern();
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.STRING_ANSWER__IGNORE_CASE, oldIgnoreCase, ignoreCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuizPackage.STRING_ANSWER__REGEXP:
				return isRegexp();
			case QuizPackage.STRING_ANSWER__IGNORE_CASE:
				return isIgnoreCase();
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
			case QuizPackage.STRING_ANSWER__REGEXP:
				setRegexp((Boolean)newValue);
				return;
			case QuizPackage.STRING_ANSWER__IGNORE_CASE:
				setIgnoreCase((Boolean)newValue);
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
			case QuizPackage.STRING_ANSWER__REGEXP:
				setRegexp(REGEXP_EDEFAULT);
				return;
			case QuizPackage.STRING_ANSWER__IGNORE_CASE:
				setIgnoreCase(IGNORE_CASE_EDEFAULT);
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
			case QuizPackage.STRING_ANSWER__REGEXP:
				return regexp != REGEXP_EDEFAULT;
			case QuizPackage.STRING_ANSWER__IGNORE_CASE:
				return ignoreCase != IGNORE_CASE_EDEFAULT;
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
		result.append(" (regexp: ");
		result.append(regexp);
		result.append(", ignoreCase: ");
		result.append(ignoreCase);
		result.append(')');
		return result.toString();
	}
	
	//

	private Pattern pattern = null; 
	
	
	private void invalidatePattern() {
		pattern = null;
	}

	@Override
	public Boolean accept(Object proposal) {
		String s = proposal.toString();
		if (isRegexp()) {
			String regex = getValue();
			if (pattern == null) {
				pattern = Pattern.compile(regex, isIgnoreCase() ? (Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE) : 0);
			}
			return pattern.matcher(s).matches();
		} else if (isIgnoreCase()) {
			return getValue().equalsIgnoreCase(s);
		}
		return super.accept(s);
	}

} //StringAnswerImpl