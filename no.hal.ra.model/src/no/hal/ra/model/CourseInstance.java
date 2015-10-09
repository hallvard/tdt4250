/**
 */
package no.hal.ra.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.ra.model.CourseInstance#getCourse <em>Course</em>}</li>
 *   <li>{@link no.hal.ra.model.CourseInstance#getSemester <em>Semester</em>}</li>
 *   <li>{@link no.hal.ra.model.CourseInstance#getAllocations <em>Allocations</em>}</li>
 * </ul>
 *
 * @see no.hal.ra.model.ModelPackage#getCourseInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='allocationFactor'"
 * @generated
 */
public interface CourseInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see no.hal.ra.model.ModelPackage#getCourseInstance_Course()
	 * @model
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link no.hal.ra.model.CourseInstance#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.hal.ra.model.Semester#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semester</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' container reference.
	 * @see #setSemester(Semester)
	 * @see no.hal.ra.model.ModelPackage#getCourseInstance_Semester()
	 * @see no.hal.ra.model.Semester#getCourses
	 * @model opposite="courses" transient="false"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link no.hal.ra.model.CourseInstance#getSemester <em>Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' container reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Allocations</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.ra.model.CourseAllocation}.
	 * It is bidirectional and its opposite is '{@link no.hal.ra.model.CourseAllocation#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocations</em>' containment reference list.
	 * @see no.hal.ra.model.ModelPackage#getCourseInstance_Allocations()
	 * @see no.hal.ra.model.CourseAllocation#getCourse
	 * @model opposite="course" containment="true"
	 * @generated
	 */
	EList<CourseAllocation> getAllocations();

} // CourseInstance
