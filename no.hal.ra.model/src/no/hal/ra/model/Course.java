/**
 */
package no.hal.ra.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.ra.model.Course#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.ra.model.Course#getFullName <em>Full Name</em>}</li>
 *   <li>{@link no.hal.ra.model.Course#getRequiredRoles <em>Required Roles</em>}</li>
 * </ul>
 *
 * @see no.hal.ra.model.ModelPackage#getCourse()
 * @model extendedMetaData="pattern='(TDT|IT)\\\\d{4}'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.hal.ra.model.ModelPackage#getCourse_Name()
	 * @model dataType="no.hal.ra.model.CourseCode"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.hal.ra.model.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see no.hal.ra.model.ModelPackage#getCourse_FullName()
	 * @model
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link no.hal.ra.model.Course#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

	/**
	 * Returns the value of the '<em><b>Required Roles</b></em>' reference list.
	 * The list contents are of type {@link no.hal.ra.model.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Roles</em>' reference list.
	 * @see no.hal.ra.model.ModelPackage#getCourse_RequiredRoles()
	 * @model
	 * @generated
	 */
	EList<Role> getRequiredRoles();

} // Course
