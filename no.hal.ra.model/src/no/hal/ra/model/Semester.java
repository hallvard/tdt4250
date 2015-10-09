/**
 */
package no.hal.ra.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.ra.model.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link no.hal.ra.model.Semester#getKind <em>Kind</em>}</li>
 *   <li>{@link no.hal.ra.model.Semester#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see no.hal.ra.model.ModelPackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see no.hal.ra.model.ModelPackage#getSemester_Year()
	 * @model dataType="no.hal.ra.model.SemesterYear"
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link no.hal.ra.model.Semester#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link no.hal.ra.model.SemesterKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see no.hal.ra.model.SemesterKind
	 * @see #setKind(SemesterKind)
	 * @see no.hal.ra.model.ModelPackage#getSemester_Kind()
	 * @model
	 * @generated
	 */
	SemesterKind getKind();

	/**
	 * Sets the value of the '{@link no.hal.ra.model.Semester#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see no.hal.ra.model.SemesterKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(SemesterKind value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.ra.model.CourseInstance}.
	 * It is bidirectional and its opposite is '{@link no.hal.ra.model.CourseInstance#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Courses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see no.hal.ra.model.ModelPackage#getSemester_Courses()
	 * @see no.hal.ra.model.CourseInstance#getSemester
	 * @model opposite="semester" containment="true"
	 * @generated
	 */
	EList<CourseInstance> getCourses();

} // Semester
