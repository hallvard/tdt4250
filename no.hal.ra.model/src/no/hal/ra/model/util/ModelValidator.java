/**
 */
package no.hal.ra.model.util;

import java.util.HashMap;
import java.util.Map;

import no.hal.ra.model.*;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.hal.ra.model.ModelPackage
 * @generated
 */
public class ModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ModelValidator INSTANCE = new ModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.hal.ra.model";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ModelPackage.eINSTANCE;
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
			case ModelPackage.DEPARTMENT:
				return validateDepartment((Department)value, diagnostics, context);
			case ModelPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case ModelPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case ModelPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case ModelPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case ModelPackage.COURSE_INSTANCE:
				return validateCourseInstance((CourseInstance)value, diagnostics, context);
			case ModelPackage.COURSE_ALLOCATION:
				return validateCourseAllocation((CourseAllocation)value, diagnostics, context);
			case ModelPackage.SEMESTER_KIND:
				return validateSemesterKind((SemesterKind)value, diagnostics, context);
			case ModelPackage.URI:
				return validateURI((URI)value, diagnostics, context);
			case ModelPackage.FACTOR:
				return validateFactor((Double)value, diagnostics, context);
			case ModelPackage.COURSE_CODE:
				return validateCourseCode((String)value, diagnostics, context);
			case ModelPackage.SEMESTER_YEAR:
				return validateSemesterYear((Integer)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(person, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(person, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_allocationFactor(person, diagnostics, context);
		return result;
	}

	/**
	 * Validates the allocationFactor constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePerson_allocationFactor(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		Map<Semester, Double> semesterAllocations = new HashMap<Semester, Double>();
		for (CourseAllocation allocation: person.getAllocations()) {
			double factor = allocation.getFactor();
			Semester semester = allocation.getCourse().getSemester();
			Double semesterFactor = semesterAllocations.get(semester);
			if (semesterFactor == null) {
				semesterFactor = 0.0;
			}
			semesterFactor += factor;
			semesterAllocations.put(semester, semesterFactor);
		}
		String invalidSemesters = null;
		for (Map.Entry<Semester, Double> entry : semesterAllocations.entrySet()) {
			double provided = person.getEmploymentFactor();
			double factor = entry.getValue() / provided;
			if (! validateFactorValue(factor)) {
				if (invalidSemesters == null) {
					invalidSemesters = "";
				}
				if (invalidSemesters.length() > 0) {
					invalidSemesters += ", ";
				}
				invalidSemesters += (entry.getKey().getKind() == SemesterKind.AUTUMN ? "h" : "v")  + entry.getKey().getYear() + "=" + formatFactorValue(factor);
			}
		}
		if (invalidSemesters != null) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic(Diagnostic.WARNING, DIAGNOSTIC_SOURCE, 0,
							"Invalid allocation factor(s): " + invalidSemesters + ", should be between 0.9 and 1.1",
							new Object[] { person })
//				diagnostics.add
//					(createDiagnostic
//						(Diagnostic.ERROR,
//						 DIAGNOSTIC_SOURCE,
//						 0,
//						 "_UI_GenericConstraint_diagnostic",
//						 new Object[] { "allocationFactor", getObjectLabel(person, context) },
//						 new Object[] { person },
//						 context)
					);
			}
			return false;
		}
		return true;
	}

	private boolean validateFactorValue(double factor) {
		return factor >= 0.9 && factor <= 1.1;
	}

	private String formatFactorValue(double factor) {
		return String.valueOf(((double) Math.round(factor * 100)) / 100);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(role, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseInstance(CourseInstance courseInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(courseInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(courseInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(courseInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(courseInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(courseInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(courseInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(courseInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(courseInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(courseInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourseInstance_allocationFactor(courseInstance, diagnostics, context);
		return result;
	}

	/**
	 * Validates the allocationFactor constraint of '<em>Course Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourseInstance_allocationFactor(CourseInstance courseInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		double required = 0.0;
		for (Role role : courseInstance.getCourse().getRequiredRoles()) {
			required += role.getFactor();
		}
		double provided = 0.0;
		for (CourseAllocation allocation : courseInstance.getAllocations()) {
			provided += allocation.getFactor();
		}
		double factor = provided / required;
		if (! validateFactorValue(factor)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic(Diagnostic.WARNING, DIAGNOSTIC_SOURCE, 0,
							"The allocation factor is " + formatFactorValue(factor) + ", but should be between 0.9 and 1.1",
							new Object[] { courseInstance })
//					createDiagnostic
//						(Diagnostic.WARNING,
//						 DIAGNOSTIC_SOURCE,
//						 0,
//						 "_UI_GenericConstraint_diagnostic",
//						 new Object[] { "allocationFactor", getObjectLabel(courseInstance, context) },
//						 new Object[] { courseInstance },
//						 context)
						);
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
	public boolean validateCourseAllocation(CourseAllocation courseAllocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseAllocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterKind(SemesterKind semesterKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURI(URI uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFactor(double factor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFactor_Min(factor, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFactor_Min
	 */
	public static final double FACTOR__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFactor_Min(double factor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = factor >= FACTOR__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(ModelPackage.Literals.FACTOR, factor, FACTOR__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCode(String courseCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterYear(int semesterYear, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSemesterYear_Min(semesterYear, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSemesterYear_Min
	 */
	public static final int SEMESTER_YEAR__MIN__VALUE = 1970;

	/**
	 * Validates the Min constraint of '<em>Semester Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterYear_Min(int semesterYear, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = semesterYear >= SEMESTER_YEAR__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(ModelPackage.Literals.SEMESTER_YEAR, semesterYear, SEMESTER_YEAR__MIN__VALUE, true, diagnostics, context);
		return result;
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

} //ModelValidator
