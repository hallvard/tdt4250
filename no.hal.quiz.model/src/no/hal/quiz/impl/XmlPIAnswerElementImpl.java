/**
 */
package no.hal.quiz.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import no.hal.quiz.QuizPackage;
import no.hal.quiz.SimpleAnswer;
import no.hal.quiz.XmlPIAnswerElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml PI Answer Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.impl.XmlPIAnswerElementImpl#getAnswer <em>Answer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlPIAnswerElementImpl extends XmlElementImpl implements XmlPIAnswerElement {
	/**
	 * The cached value of the '{@link #getAnswer() <em>Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswer()
	 * @generated
	 * @ordered
	 */
	protected SimpleAnswer<?> answer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlPIAnswerElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuizPackage.Literals.XML_PI_ANSWER_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAnswer<?> getAnswer() {
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswer(SimpleAnswer<?> newAnswer, NotificationChain msgs) {
		SimpleAnswer<?> oldAnswer = answer;
		answer = newAnswer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuizPackage.XML_PI_ANSWER_ELEMENT__ANSWER, oldAnswer, newAnswer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswer(SimpleAnswer<?> newAnswer) {
		if (newAnswer != answer) {
			NotificationChain msgs = null;
			if (answer != null)
				msgs = ((InternalEObject)answer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuizPackage.XML_PI_ANSWER_ELEMENT__ANSWER, null, msgs);
			if (newAnswer != null)
				msgs = ((InternalEObject)newAnswer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuizPackage.XML_PI_ANSWER_ELEMENT__ANSWER, null, msgs);
			msgs = basicSetAnswer(newAnswer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.XML_PI_ANSWER_ELEMENT__ANSWER, newAnswer, newAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuizPackage.XML_PI_ANSWER_ELEMENT__ANSWER:
				return basicSetAnswer(null, msgs);
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
			case QuizPackage.XML_PI_ANSWER_ELEMENT__ANSWER:
				return getAnswer();
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
			case QuizPackage.XML_PI_ANSWER_ELEMENT__ANSWER:
				setAnswer((SimpleAnswer<?>)newValue);
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
			case QuizPackage.XML_PI_ANSWER_ELEMENT__ANSWER:
				setAnswer((SimpleAnswer<?>)null);
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
			case QuizPackage.XML_PI_ANSWER_ELEMENT__ANSWER:
				return answer != null;
		}
		return super.eIsSet(featureID);
	}

} //XmlPIAnswerElementImpl
