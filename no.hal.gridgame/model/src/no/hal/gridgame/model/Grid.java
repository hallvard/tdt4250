/**
 */
package no.hal.gridgame.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.gridgame.model.Grid#getWidth <em>Width</em>}</li>
 *   <li>{@link no.hal.gridgame.model.Grid#getHeight <em>Height</em>}</li>
 *   <li>{@link no.hal.gridgame.model.Grid#getValues <em>Values</em>}</li>
 *   <li>{@link no.hal.gridgame.model.Grid#getObjects <em>Objects</em>}</li>
 *   <li>{@link no.hal.gridgame.model.Grid#getGridListeners <em>Grid Listeners</em>}</li>
 * </ul>
 *
 * @see no.hal.gridgame.model.ModelPackage#getGrid()
 * @model abstract="true" VBounds="org.eclipse.emf.ecore.EJavaObject"
 * @generated
 */
public interface Grid<V extends Object, O extends EObject> extends EObject {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see no.hal.gridgame.model.ModelPackage#getGrid_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link no.hal.gridgame.model.Grid#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see no.hal.gridgame.model.ModelPackage#getGrid_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link no.hal.gridgame.model.Grid#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see no.hal.gridgame.model.ModelPackage#getGrid_Values()
	 * @model
	 * @generated
	 */
	EList<V> getValues();

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see no.hal.gridgame.model.ModelPackage#getGrid_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<O> getObjects();

	/**
	 * Returns the value of the '<em><b>Grid Listeners</b></em>' reference list.
	 * The list contents are of type {@link no.hal.gridgame.model.GridListener}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid Listeners</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Listeners</em>' reference list.
	 * @see no.hal.gridgame.model.ModelPackage#getGrid_GridListeners()
	 * @model
	 * @generated
	 */
	EList<GridListener> getGridListeners();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	V getGridValue(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	O getGridObject(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setGridValue(int x, int y, V value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setGridObject(int x, int y, O object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	V createGridValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	O createGridObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<V> getGridValues(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<O> getGridObjects(int x, int y, int width, int height);

} // Grid
