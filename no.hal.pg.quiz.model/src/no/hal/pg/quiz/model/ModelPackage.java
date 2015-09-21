/**
 */
package no.hal.pg.quiz.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.hal.pg.quiz.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.pg.quiz.model/model/quiz.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "quizModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = no.hal.pg.quiz.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.QuizTaskDefImpl <em>Quiz Task Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.QuizTaskDefImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getQuizTaskDef()
	 * @generated
	 */
	int QUIZ_TASK_DEF = 0;

	/**
	 * The feature id for the '<em><b>Quiz Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_DEF__QUIZ_PARTS = no.hal.pg.model.ModelPackage.TASK_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correct Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_DEF__CORRECT_NEEDED = no.hal.pg.model.ModelPackage.TASK_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attempts Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_DEF__ATTEMPTS_ALLOWED = no.hal.pg.model.ModelPackage.TASK_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Quiz Task Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_DEF_FEATURE_COUNT = no.hal.pg.model.ModelPackage.TASK_DEF_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Quiz Task Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_DEF_OPERATION_COUNT = no.hal.pg.model.ModelPackage.TASK_DEF_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.QuizTaskDef <em>Quiz Task Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quiz Task Def</em>'.
	 * @see no.hal.pg.quiz.model.QuizTaskDef
	 * @generated
	 */
	EClass getQuizTaskDef();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.quiz.model.QuizTaskDef#getQuizParts <em>Quiz Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quiz Parts</em>'.
	 * @see no.hal.pg.quiz.model.QuizTaskDef#getQuizParts()
	 * @see #getQuizTaskDef()
	 * @generated
	 */
	EReference getQuizTaskDef_QuizParts();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.QuizTaskDef#getCorrectNeeded <em>Correct Needed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correct Needed</em>'.
	 * @see no.hal.pg.quiz.model.QuizTaskDef#getCorrectNeeded()
	 * @see #getQuizTaskDef()
	 * @generated
	 */
	EAttribute getQuizTaskDef_CorrectNeeded();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.QuizTaskDef#getAttemptsAllowed <em>Attempts Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attempts Allowed</em>'.
	 * @see no.hal.pg.quiz.model.QuizTaskDef#getAttemptsAllowed()
	 * @see #getQuizTaskDef()
	 * @generated
	 */
	EAttribute getQuizTaskDef_AttemptsAllowed();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.QuizTaskDefImpl <em>Quiz Task Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.QuizTaskDefImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getQuizTaskDef()
		 * @generated
		 */
		EClass QUIZ_TASK_DEF = eINSTANCE.getQuizTaskDef();

		/**
		 * The meta object literal for the '<em><b>Quiz Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUIZ_TASK_DEF__QUIZ_PARTS = eINSTANCE.getQuizTaskDef_QuizParts();

		/**
		 * The meta object literal for the '<em><b>Correct Needed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUIZ_TASK_DEF__CORRECT_NEEDED = eINSTANCE.getQuizTaskDef_CorrectNeeded();

		/**
		 * The meta object literal for the '<em><b>Attempts Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUIZ_TASK_DEF__ATTEMPTS_ALLOWED = eINSTANCE.getQuizTaskDef_AttemptsAllowed();

	}

} //QuizPackage
