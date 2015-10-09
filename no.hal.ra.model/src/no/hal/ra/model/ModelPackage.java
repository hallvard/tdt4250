/**
 */
package no.hal.ra.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see no.hal.ra.model.ModelFactory
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
	String eNS_URI = "platform:/plugin/no.hal.ra.model/model/ra.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = no.hal.ra.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.ra.model.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.ra.model.impl.DepartmentImpl
	 * @see no.hal.ra.model.impl.ModelPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__EMPLOYEES = 1;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__COURSES = 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__ROLES = 3;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__SEMESTERS = 4;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.ra.model.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.ra.model.impl.PersonImpl
	 * @see no.hal.ra.model.impl.ModelPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__USER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Face Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FACE_URL = 3;

	/**
	 * The feature id for the '<em><b>Employment Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMPLOYMENT_FACTOR = 4;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ALLOCATIONS = 5;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.ra.model.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.ra.model.impl.CourseImpl
	 * @see no.hal.ra.model.impl.ModelPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__FULL_NAME = 1;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__REQUIRED_ROLES = 2;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.ra.model.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.ra.model.impl.RoleImpl
	 * @see no.hal.ra.model.impl.ModelPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__FACTOR = 1;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.ra.model.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.ra.model.impl.SemesterImpl
	 * @see no.hal.ra.model.impl.ModelPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 4;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__YEAR = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__KIND = 1;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__COURSES = 2;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.ra.model.impl.CourseInstanceImpl <em>Course Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.ra.model.impl.CourseInstanceImpl
	 * @see no.hal.ra.model.impl.ModelPackageImpl#getCourseInstance()
	 * @generated
	 */
	int COURSE_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__COURSE = 0;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__SEMESTER = 1;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__ALLOCATIONS = 2;

	/**
	 * The number of structural features of the '<em>Course Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Course Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.ra.model.impl.CourseAllocationImpl <em>Course Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.ra.model.impl.CourseAllocationImpl
	 * @see no.hal.ra.model.impl.ModelPackageImpl#getCourseAllocation()
	 * @generated
	 */
	int COURSE_ALLOCATION = 6;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_ALLOCATION__PERSON = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_ALLOCATION__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_ALLOCATION__FACTOR = 2;

	/**
	 * The feature id for the '<em><b>Explicit Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_ALLOCATION__EXPLICIT_FACTOR = 3;

	/**
	 * The feature id for the '<em><b>Course</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_ALLOCATION__COURSE = 4;

	/**
	 * The number of structural features of the '<em>Course Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_ALLOCATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Course Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_ALLOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.ra.model.SemesterKind <em>Semester Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.ra.model.SemesterKind
	 * @see no.hal.ra.model.impl.ModelPackageImpl#getSemesterKind()
	 * @generated
	 */
	int SEMESTER_KIND = 7;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.URI
	 * @see no.hal.ra.model.impl.ModelPackageImpl#getURI()
	 * @generated
	 */
	int URI = 8;

	/**
	 * The meta object id for the '<em>Factor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.ra.model.impl.ModelPackageImpl#getFactor()
	 * @generated
	 */
	int FACTOR = 9;


	/**
	 * The meta object id for the '<em>Course Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see no.hal.ra.model.impl.ModelPackageImpl#getCourseCode()
	 * @generated
	 */
	int COURSE_CODE = 10;


	/**
	 * The meta object id for the '<em>Semester Year</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.ra.model.impl.ModelPackageImpl#getSemesterYear()
	 * @generated
	 */
	int SEMESTER_YEAR = 11;


	/**
	 * Returns the meta object for class '{@link no.hal.ra.model.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see no.hal.ra.model.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.ra.model.Department#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.ra.model.Department#getName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.ra.model.Department#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employees</em>'.
	 * @see no.hal.ra.model.Department#getEmployees()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Employees();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.ra.model.Department#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see no.hal.ra.model.Department#getCourses()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Courses();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.ra.model.Department#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see no.hal.ra.model.Department#getRoles()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.ra.model.Department#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see no.hal.ra.model.Department#getSemesters()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Semesters();

	/**
	 * Returns the meta object for class '{@link no.hal.ra.model.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see no.hal.ra.model.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.ra.model.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.ra.model.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.ra.model.Person#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see no.hal.ra.model.Person#getUserName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_UserName();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.ra.model.Person#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see no.hal.ra.model.Person#getEmail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Email();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.ra.model.Person#getFaceUrl <em>Face Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Face Url</em>'.
	 * @see no.hal.ra.model.Person#getFaceUrl()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FaceUrl();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.ra.model.Person#getEmploymentFactor <em>Employment Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employment Factor</em>'.
	 * @see no.hal.ra.model.Person#getEmploymentFactor()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_EmploymentFactor();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.ra.model.Person#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocations</em>'.
	 * @see no.hal.ra.model.Person#getAllocations()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Allocations();

	/**
	 * Returns the meta object for class '{@link no.hal.ra.model.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see no.hal.ra.model.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.ra.model.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.ra.model.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.ra.model.Course#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see no.hal.ra.model.Course#getFullName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_FullName();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.ra.model.Course#getRequiredRoles <em>Required Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Roles</em>'.
	 * @see no.hal.ra.model.Course#getRequiredRoles()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_RequiredRoles();

	/**
	 * Returns the meta object for class '{@link no.hal.ra.model.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see no.hal.ra.model.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.ra.model.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.ra.model.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.ra.model.Role#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see no.hal.ra.model.Role#getFactor()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Factor();

	/**
	 * Returns the meta object for class '{@link no.hal.ra.model.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see no.hal.ra.model.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.ra.model.Semester#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see no.hal.ra.model.Semester#getYear()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Year();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.ra.model.Semester#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see no.hal.ra.model.Semester#getKind()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.ra.model.Semester#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see no.hal.ra.model.Semester#getCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Courses();

	/**
	 * Returns the meta object for class '{@link no.hal.ra.model.CourseInstance <em>Course Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Instance</em>'.
	 * @see no.hal.ra.model.CourseInstance
	 * @generated
	 */
	EClass getCourseInstance();

	/**
	 * Returns the meta object for the reference '{@link no.hal.ra.model.CourseInstance#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see no.hal.ra.model.CourseInstance#getCourse()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_Course();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.ra.model.CourseInstance#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Semester</em>'.
	 * @see no.hal.ra.model.CourseInstance#getSemester()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_Semester();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.ra.model.CourseInstance#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allocations</em>'.
	 * @see no.hal.ra.model.CourseInstance#getAllocations()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_Allocations();

	/**
	 * Returns the meta object for class '{@link no.hal.ra.model.CourseAllocation <em>Course Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Allocation</em>'.
	 * @see no.hal.ra.model.CourseAllocation
	 * @generated
	 */
	EClass getCourseAllocation();

	/**
	 * Returns the meta object for the reference '{@link no.hal.ra.model.CourseAllocation#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see no.hal.ra.model.CourseAllocation#getPerson()
	 * @see #getCourseAllocation()
	 * @generated
	 */
	EReference getCourseAllocation_Person();

	/**
	 * Returns the meta object for the reference '{@link no.hal.ra.model.CourseAllocation#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see no.hal.ra.model.CourseAllocation#getRole()
	 * @see #getCourseAllocation()
	 * @generated
	 */
	EReference getCourseAllocation_Role();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.ra.model.CourseAllocation#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see no.hal.ra.model.CourseAllocation#getFactor()
	 * @see #getCourseAllocation()
	 * @generated
	 */
	EAttribute getCourseAllocation_Factor();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.ra.model.CourseAllocation#getExplicitFactor <em>Explicit Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit Factor</em>'.
	 * @see no.hal.ra.model.CourseAllocation#getExplicitFactor()
	 * @see #getCourseAllocation()
	 * @generated
	 */
	EAttribute getCourseAllocation_ExplicitFactor();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.ra.model.CourseAllocation#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Course</em>'.
	 * @see no.hal.ra.model.CourseAllocation#getCourse()
	 * @see #getCourseAllocation()
	 * @generated
	 */
	EReference getCourseAllocation_Course();

	/**
	 * Returns the meta object for enum '{@link no.hal.ra.model.SemesterKind <em>Semester Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semester Kind</em>'.
	 * @see no.hal.ra.model.SemesterKind
	 * @generated
	 */
	EEnum getSemesterKind();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see org.eclipse.emf.common.util.URI
	 * @model instanceClass="org.eclipse.emf.common.util.URI"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the meta object for data type '<em>Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Factor</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="minInclusive='0.0'"
	 *        extendedMetaData="maxInclusive='2.0'"
	 * @generated
	 */
	EDataType getFactor();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Course Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getCourseCode();

	/**
	 * Returns the meta object for data type '<em>Semester Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Semester Year</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="minInclusive='1970'"
	 *        extendedMetaData="maxInclusive='2999'"
	 * @generated
	 */
	EDataType getSemesterYear();

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
		 * The meta object literal for the '{@link no.hal.ra.model.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.ra.model.impl.DepartmentImpl
		 * @see no.hal.ra.model.impl.ModelPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__NAME = eINSTANCE.getDepartment_Name();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__EMPLOYEES = eINSTANCE.getDepartment_Employees();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__COURSES = eINSTANCE.getDepartment_Courses();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__ROLES = eINSTANCE.getDepartment_Roles();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__SEMESTERS = eINSTANCE.getDepartment_Semesters();

		/**
		 * The meta object literal for the '{@link no.hal.ra.model.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.ra.model.impl.PersonImpl
		 * @see no.hal.ra.model.impl.ModelPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__USER_NAME = eINSTANCE.getPerson_UserName();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

		/**
		 * The meta object literal for the '<em><b>Face Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FACE_URL = eINSTANCE.getPerson_FaceUrl();

		/**
		 * The meta object literal for the '<em><b>Employment Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMPLOYMENT_FACTOR = eINSTANCE.getPerson_EmploymentFactor();

		/**
		 * The meta object literal for the '<em><b>Allocations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ALLOCATIONS = eINSTANCE.getPerson_Allocations();

		/**
		 * The meta object literal for the '{@link no.hal.ra.model.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.ra.model.impl.CourseImpl
		 * @see no.hal.ra.model.impl.ModelPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__FULL_NAME = eINSTANCE.getCourse_FullName();

		/**
		 * The meta object literal for the '<em><b>Required Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__REQUIRED_ROLES = eINSTANCE.getCourse_RequiredRoles();

		/**
		 * The meta object literal for the '{@link no.hal.ra.model.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.ra.model.impl.RoleImpl
		 * @see no.hal.ra.model.impl.ModelPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__FACTOR = eINSTANCE.getRole_Factor();

		/**
		 * The meta object literal for the '{@link no.hal.ra.model.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.ra.model.impl.SemesterImpl
		 * @see no.hal.ra.model.impl.ModelPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__YEAR = eINSTANCE.getSemester_Year();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__KIND = eINSTANCE.getSemester_Kind();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__COURSES = eINSTANCE.getSemester_Courses();

		/**
		 * The meta object literal for the '{@link no.hal.ra.model.impl.CourseInstanceImpl <em>Course Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.ra.model.impl.CourseInstanceImpl
		 * @see no.hal.ra.model.impl.ModelPackageImpl#getCourseInstance()
		 * @generated
		 */
		EClass COURSE_INSTANCE = eINSTANCE.getCourseInstance();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__COURSE = eINSTANCE.getCourseInstance_Course();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__SEMESTER = eINSTANCE.getCourseInstance_Semester();

		/**
		 * The meta object literal for the '<em><b>Allocations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__ALLOCATIONS = eINSTANCE.getCourseInstance_Allocations();

		/**
		 * The meta object literal for the '{@link no.hal.ra.model.impl.CourseAllocationImpl <em>Course Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.ra.model.impl.CourseAllocationImpl
		 * @see no.hal.ra.model.impl.ModelPackageImpl#getCourseAllocation()
		 * @generated
		 */
		EClass COURSE_ALLOCATION = eINSTANCE.getCourseAllocation();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_ALLOCATION__PERSON = eINSTANCE.getCourseAllocation_Person();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_ALLOCATION__ROLE = eINSTANCE.getCourseAllocation_Role();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_ALLOCATION__FACTOR = eINSTANCE.getCourseAllocation_Factor();

		/**
		 * The meta object literal for the '<em><b>Explicit Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_ALLOCATION__EXPLICIT_FACTOR = eINSTANCE.getCourseAllocation_ExplicitFactor();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_ALLOCATION__COURSE = eINSTANCE.getCourseAllocation_Course();

		/**
		 * The meta object literal for the '{@link no.hal.ra.model.SemesterKind <em>Semester Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.ra.model.SemesterKind
		 * @see no.hal.ra.model.impl.ModelPackageImpl#getSemesterKind()
		 * @generated
		 */
		EEnum SEMESTER_KIND = eINSTANCE.getSemesterKind();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.URI
		 * @see no.hal.ra.model.impl.ModelPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>Factor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.ra.model.impl.ModelPackageImpl#getFactor()
		 * @generated
		 */
		EDataType FACTOR = eINSTANCE.getFactor();

		/**
		 * The meta object literal for the '<em>Course Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see no.hal.ra.model.impl.ModelPackageImpl#getCourseCode()
		 * @generated
		 */
		EDataType COURSE_CODE = eINSTANCE.getCourseCode();

		/**
		 * The meta object literal for the '<em>Semester Year</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.ra.model.impl.ModelPackageImpl#getSemesterYear()
		 * @generated
		 */
		EDataType SEMESTER_YEAR = eINSTANCE.getSemesterYear();

	}

} //ModelPackage
