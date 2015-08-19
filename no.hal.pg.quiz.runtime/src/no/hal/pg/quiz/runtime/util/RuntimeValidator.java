/**
 */
package no.hal.pg.quiz.runtime.util;

import java.util.Map;

import no.hal.pg.quiz.runtime.*;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.util.Util;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.hal.pg.quiz.runtime.RuntimePackage
 * @generated
 */
public class RuntimeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RuntimeValidator INSTANCE = new RuntimeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.hal.pg.quiz.runtime";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected no.hal.pg.runtime.util.RuntimeValidator runtimeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeValidator() {
		super();
		runtimeValidator = no.hal.pg.runtime.util.RuntimeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RuntimePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RuntimePackage.QUIZ_TASK:
				return validateQuizTask((QuizTask)value, diagnostics, context);
			case RuntimePackage.ACCEPTING_ANSWER_STATE:
				return validateAcceptingAnswerState((AcceptingAnswerState)value, diagnostics, context);
			case RuntimePackage.QA_PROPOSAL:
				return validateQAProposal((QAProposal)value, diagnostics, context);
			case RuntimePackage.QUIZ_TASK_SERVICE:
				return validateQuizTaskService((QuizTaskService)value, diagnostics, context);
			case RuntimePackage.QA_REF:
				return validateQARef((QARef)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuizTask(QuizTask quizTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(quizTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(quizTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(quizTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(quizTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(quizTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(quizTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(quizTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(quizTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(quizTask, diagnostics, context);
		if (result || diagnostics != null) result &= runtimeValidator.validateTask_PlayerIsContainedInGame(quizTask, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptingAnswerState(AcceptingAnswerState acceptingAnswerState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(acceptingAnswerState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQAProposal(QAProposal qaProposal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(qaProposal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(qaProposal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(qaProposal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(qaProposal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(qaProposal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(qaProposal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(qaProposal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(qaProposal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(qaProposal, diagnostics, context);
		if (result || diagnostics != null) result &= validateQAProposal_AnsweredByPlayers(qaProposal, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AnsweredByPlayers constraint of '<em>QA Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateQAProposal_AnsweredByPlayers(QAProposal qaProposal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		Player player = qaProposal.getAnsweredBy();
		if (player != null && (! Util.containsPlayer(qaProposal, player, false))) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AnsweredByPlayers", getObjectLabel(qaProposal, context) },
						 new Object[] { qaProposal },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuizTaskService(QuizTaskService quizTaskService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quizTaskService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQARef(QARef qaRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qaRef, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RuntimeValidator
