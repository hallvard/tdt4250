/**
 */
package no.hal.pg.quiz.model.impl;

import java.util.Collection;
import no.hal.pg.model.impl.TaskDefImpl;

import no.hal.pg.quiz.model.AbstractQuizPart;
import no.hal.pg.quiz.model.ModelPackage;
import no.hal.pg.quiz.model.QuizTaskDef;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quiz Task Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.quiz.model.impl.QuizTaskDefImpl#getQuizParts <em>Quiz Parts</em>}</li>
 *   <li>{@link no.hal.pg.quiz.model.impl.QuizTaskDefImpl#getCorrectNeeded <em>Correct Needed</em>}</li>
 *   <li>{@link no.hal.pg.quiz.model.impl.QuizTaskDefImpl#getAttemptsAllowed <em>Attempts Allowed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuizTaskDefImpl extends TaskDefImpl implements QuizTaskDef {
	/**
	 * The cached value of the '{@link #getQuizParts() <em>Quiz Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuizParts()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractQuizPart> quizParts;
	/**
	 * The default value of the '{@link #getCorrectNeeded() <em>Correct Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectNeeded()
	 * @generated
	 * @ordered
	 */
	protected static final double CORRECT_NEEDED_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getCorrectNeeded() <em>Correct Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectNeeded()
	 * @generated
	 * @ordered
	 */
	protected double correctNeeded = CORRECT_NEEDED_EDEFAULT;
	/**
	 * The default value of the '{@link #getAttemptsAllowed() <em>Attempts Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttemptsAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTEMPTS_ALLOWED_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getAttemptsAllowed() <em>Attempts Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttemptsAllowed()
	 * @generated
	 * @ordered
	 */
	protected int attemptsAllowed = ATTEMPTS_ALLOWED_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizTaskDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.QUIZ_TASK_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractQuizPart> getQuizParts() {
		if (quizParts == null) {
			quizParts = new EObjectResolvingEList<AbstractQuizPart>(AbstractQuizPart.class, this, ModelPackage.QUIZ_TASK_DEF__QUIZ_PARTS);
		}
		return quizParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCorrectNeeded() {
		return correctNeeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrectNeeded(double newCorrectNeeded) {
		double oldCorrectNeeded = correctNeeded;
		correctNeeded = newCorrectNeeded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.QUIZ_TASK_DEF__CORRECT_NEEDED, oldCorrectNeeded, correctNeeded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttemptsAllowed() {
		return attemptsAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttemptsAllowed(int newAttemptsAllowed) {
		int oldAttemptsAllowed = attemptsAllowed;
		attemptsAllowed = newAttemptsAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.QUIZ_TASK_DEF__ATTEMPTS_ALLOWED, oldAttemptsAllowed, attemptsAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.QUIZ_TASK_DEF__QUIZ_PARTS:
				return getQuizParts();
			case ModelPackage.QUIZ_TASK_DEF__CORRECT_NEEDED:
				return getCorrectNeeded();
			case ModelPackage.QUIZ_TASK_DEF__ATTEMPTS_ALLOWED:
				return getAttemptsAllowed();
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
			case ModelPackage.QUIZ_TASK_DEF__QUIZ_PARTS:
				getQuizParts().clear();
				getQuizParts().addAll((Collection<? extends AbstractQuizPart>)newValue);
				return;
			case ModelPackage.QUIZ_TASK_DEF__CORRECT_NEEDED:
				setCorrectNeeded((Double)newValue);
				return;
			case ModelPackage.QUIZ_TASK_DEF__ATTEMPTS_ALLOWED:
				setAttemptsAllowed((Integer)newValue);
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
			case ModelPackage.QUIZ_TASK_DEF__QUIZ_PARTS:
				getQuizParts().clear();
				return;
			case ModelPackage.QUIZ_TASK_DEF__CORRECT_NEEDED:
				setCorrectNeeded(CORRECT_NEEDED_EDEFAULT);
				return;
			case ModelPackage.QUIZ_TASK_DEF__ATTEMPTS_ALLOWED:
				setAttemptsAllowed(ATTEMPTS_ALLOWED_EDEFAULT);
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
			case ModelPackage.QUIZ_TASK_DEF__QUIZ_PARTS:
				return quizParts != null && !quizParts.isEmpty();
			case ModelPackage.QUIZ_TASK_DEF__CORRECT_NEEDED:
				return correctNeeded != CORRECT_NEEDED_EDEFAULT;
			case ModelPackage.QUIZ_TASK_DEF__ATTEMPTS_ALLOWED:
				return attemptsAllowed != ATTEMPTS_ALLOWED_EDEFAULT;
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
		result.append(" (correctNeeded: ");
		result.append(correctNeeded);
		result.append(", attemptsAllowed: ");
		result.append(attemptsAllowed);
		result.append(')');
		return result.toString();
	}

} //QuizTaskDefImpl
