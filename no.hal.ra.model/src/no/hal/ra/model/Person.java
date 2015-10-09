/**
 */
package no.hal.ra.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.ra.model.Person#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.ra.model.Person#getUserName <em>User Name</em>}</li>
 *   <li>{@link no.hal.ra.model.Person#getEmail <em>Email</em>}</li>
 *   <li>{@link no.hal.ra.model.Person#getFaceUrl <em>Face Url</em>}</li>
 *   <li>{@link no.hal.ra.model.Person#getEmploymentFactor <em>Employment Factor</em>}</li>
 *   <li>{@link no.hal.ra.model.Person#getAllocations <em>Allocations</em>}</li>
 * </ul>
 *
 * @see no.hal.ra.model.ModelPackage#getPerson()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='allocationFactor'"
 * @generated
 */
public interface Person extends EObject {
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
	 * @see no.hal.ra.model.ModelPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.hal.ra.model.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see no.hal.ra.model.ModelPackage#getPerson_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link no.hal.ra.model.Person#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see no.hal.ra.model.ModelPackage#getPerson_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link no.hal.ra.model.Person#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Face Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Face Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Face Url</em>' attribute.
	 * @see #setFaceUrl(URI)
	 * @see no.hal.ra.model.ModelPackage#getPerson_FaceUrl()
	 * @model dataType="no.hal.ra.model.URI"
	 * @generated
	 */
	URI getFaceUrl();

	/**
	 * Sets the value of the '{@link no.hal.ra.model.Person#getFaceUrl <em>Face Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Face Url</em>' attribute.
	 * @see #getFaceUrl()
	 * @generated
	 */
	void setFaceUrl(URI value);

	/**
	 * Returns the value of the '<em><b>Employment Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employment Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employment Factor</em>' attribute.
	 * @see #setEmploymentFactor(double)
	 * @see no.hal.ra.model.ModelPackage#getPerson_EmploymentFactor()
	 * @model dataType="no.hal.ra.model.Factor"
	 * @generated
	 */
	double getEmploymentFactor();

	/**
	 * Sets the value of the '{@link no.hal.ra.model.Person#getEmploymentFactor <em>Employment Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employment Factor</em>' attribute.
	 * @see #getEmploymentFactor()
	 * @generated
	 */
	void setEmploymentFactor(double value);

	/**
	 * Returns the value of the '<em><b>Allocations</b></em>' reference list.
	 * The list contents are of type {@link no.hal.ra.model.CourseAllocation}.
	 * It is bidirectional and its opposite is '{@link no.hal.ra.model.CourseAllocation#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocations</em>' reference list.
	 * @see no.hal.ra.model.ModelPackage#getPerson_Allocations()
	 * @see no.hal.ra.model.CourseAllocation#getPerson
	 * @model opposite="person"
	 * @generated
	 */
	EList<CourseAllocation> getAllocations();

} // Person
