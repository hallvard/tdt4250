/**
 */
package no.hal.quiz.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.quiz.Answer;
import no.hal.quiz.QA;
import no.hal.quiz.Question;
import no.hal.quiz.QuizPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.impl.QAImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.quiz.impl.QAImpl#getQ <em>Q</em>}</li>
 *   <li>{@link no.hal.quiz.impl.QAImpl#getA <em>A</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QAImpl extends AbstractQAImpl implements QA {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQ() <em>Q</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ()
	 * @generated
	 * @ordered
	 */
	protected Question q;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected Answer a;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuizPackage.Literals.QA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.QA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question getQ() {
		return q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQ(Question newQ, NotificationChain msgs) {
		Question oldQ = q;
		q = newQ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuizPackage.QA__Q, oldQ, newQ);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQ(Question newQ) {
		if (newQ != q) {
			NotificationChain msgs = null;
			if (q != null)
				msgs = ((InternalEObject)q).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuizPackage.QA__Q, null, msgs);
			if (newQ != null)
				msgs = ((InternalEObject)newQ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuizPackage.QA__Q, null, msgs);
			msgs = basicSetQ(newQ, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.QA__Q, newQ, newQ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer getA() {
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetA(Answer newA, NotificationChain msgs) {
		Answer oldA = a;
		a = newA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuizPackage.QA__A, oldA, newA);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(Answer newA) {
		if (newA != a) {
			NotificationChain msgs = null;
			if (a != null)
				msgs = ((InternalEObject)a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuizPackage.QA__A, null, msgs);
			if (newA != null)
				msgs = ((InternalEObject)newA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuizPackage.QA__A, null, msgs);
			msgs = basicSetA(newA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.QA__A, newA, newA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuizPackage.QA__Q:
				return basicSetQ(null, msgs);
			case QuizPackage.QA__A:
				return basicSetA(null, msgs);
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
			case QuizPackage.QA__NAME:
				return getName();
			case QuizPackage.QA__Q:
				return getQ();
			case QuizPackage.QA__A:
				return getA();
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
			case QuizPackage.QA__NAME:
				setName((String)newValue);
				return;
			case QuizPackage.QA__Q:
				setQ((Question)newValue);
				return;
			case QuizPackage.QA__A:
				setA((Answer)newValue);
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
			case QuizPackage.QA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QuizPackage.QA__Q:
				setQ((Question)null);
				return;
			case QuizPackage.QA__A:
				setA((Answer)null);
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
			case QuizPackage.QA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QuizPackage.QA__Q:
				return q != null;
			case QuizPackage.QA__A:
				return a != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //QAImpl
