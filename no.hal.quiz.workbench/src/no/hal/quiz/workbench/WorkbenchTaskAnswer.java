/**
 */
package no.hal.quiz.workbench;

import no.hal.quiz.TaskAnswer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.workbench.WorkbenchTaskAnswer#getElementId <em>Element Id</em>}</li>
 *   <li>{@link no.hal.quiz.workbench.WorkbenchTaskAnswer#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see no.hal.quiz.workbench.WorkbenchPackage#getWorkbenchTaskAnswer()
 * @model
 * @generated
 */
public interface WorkbenchTaskAnswer extends TaskAnswer {
	/**
	 * Returns the value of the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Id</em>' attribute.
	 * @see #setElementId(String)
	 * @see no.hal.quiz.workbench.WorkbenchPackage#getWorkbenchTaskAnswer_ElementId()
	 * @model
	 * @generated
	 */
	String getElementId();

	/**
	 * Sets the value of the '{@link no.hal.quiz.workbench.WorkbenchTaskAnswer#getElementId <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Id</em>' attribute.
	 * @see #getElementId()
	 * @generated
	 */
	void setElementId(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see no.hal.quiz.workbench.WorkbenchPackage#getWorkbenchTaskAnswer_Action()
	 * @model
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link no.hal.quiz.workbench.WorkbenchTaskAnswer#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

} // WorkbenchElementAnswer
