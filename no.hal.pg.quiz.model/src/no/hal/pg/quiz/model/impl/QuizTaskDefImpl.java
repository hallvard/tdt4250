/**
 */
package no.hal.pg.quiz.model.impl;

import java.util.Collection;
import no.hal.pg.model.impl.TaskDefImpl;

import no.hal.pg.quiz.model.AbstractQuizPart;
import no.hal.pg.quiz.model.ModelPackage;
import no.hal.pg.quiz.model.QuizTaskDef;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.QUIZ_TASK_DEF__QUIZ_PARTS:
				return getQuizParts();
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
		}
		return super.eIsSet(featureID);
	}

} //QuizTaskDefImpl
