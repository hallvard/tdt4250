/**
 */
package no.hal.ra.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.ra.model.CourseAllocation#getPerson <em>Person</em>}</li>
 *   <li>{@link no.hal.ra.model.CourseAllocation#getRole <em>Role</em>}</li>
 *   <li>{@link no.hal.ra.model.CourseAllocation#getFactor <em>Factor</em>}</li>
 *   <li>{@link no.hal.ra.model.CourseAllocation#getExplicitFactor <em>Explicit Factor</em>}</li>
 *   <li>{@link no.hal.ra.model.CourseAllocation#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see no.hal.ra.model.ModelPackage#getCourseAllocation()
 * @model
 * @generated
 */
public interface CourseAllocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.hal.ra.model.Person#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see no.hal.ra.model.ModelPackage#getCourseAllocation_Person()
	 * @see no.hal.ra.model.Person#getAllocations
	 * @model opposite="allocations"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link no.hal.ra.model.CourseAllocation#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see no.hal.ra.model.ModelPackage#getCourseAllocation_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link no.hal.ra.model.CourseAllocation#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #setFactor(double)
	 * @see no.hal.ra.model.ModelPackage#getCourseAllocation_Factor()
	 * @model dataType="no.hal.ra.model.Factor" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	double getFactor();

	/**
	 * Sets the value of the '{@link no.hal.ra.model.CourseAllocation#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(double value);

	/**
	 * Returns the value of the '<em><b>Explicit Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explicit Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit Factor</em>' attribute.
	 * @see #setExplicitFactor(double)
	 * @see no.hal.ra.model.ModelPackage#getCourseAllocation_ExplicitFactor()
	 * @model dataType="no.hal.ra.model.Factor"
	 * @generated
	 */
	double getExplicitFactor();

	/**
	 * Sets the value of the '{@link no.hal.ra.model.CourseAllocation#getExplicitFactor <em>Explicit Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicit Factor</em>' attribute.
	 * @see #getExplicitFactor()
	 * @generated
	 */
	void setExplicitFactor(double value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.hal.ra.model.CourseInstance#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' container reference.
	 * @see #setCourse(CourseInstance)
	 * @see no.hal.ra.model.ModelPackage#getCourseAllocation_Course()
	 * @see no.hal.ra.model.CourseInstance#getAllocations
	 * @model opposite="allocations" transient="false"
	 * @generated
	 */
	CourseInstance getCourse();

	/**
	 * Sets the value of the '{@link no.hal.ra.model.CourseAllocation#getCourse <em>Course</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' container reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(CourseInstance value);

} // CourseAllocation
