/**
 */
package no.hal.pg.runtime;

import no.hal.pg.model.Person;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.SubjectService#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getSubjectService()
 * @model
 * @generated
 */
public interface SubjectService<T> extends Service<T> {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(Person)
	 * @see no.hal.pg.runtime.RuntimePackage#getSubjectService_Subject()
	 * @model
	 * @generated
	 */
	Person getSubject();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.SubjectService#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Person value);

} // SubjectService
