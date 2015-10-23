/**
 */
package no.hal.pg.sokoban.runtime;

import no.hal.sokoban.model.SokobanLevel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sokoban Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.sokoban.runtime.SokobanResult#getLevel <em>Level</em>}</li>
 *   <li>{@link no.hal.pg.sokoban.runtime.SokobanResult#getMoveCount <em>Move Count</em>}</li>
 *   <li>{@link no.hal.pg.sokoban.runtime.SokobanResult#getPushCount <em>Push Count</em>}</li>
 *   <li>{@link no.hal.pg.sokoban.runtime.SokobanResult#getSolution <em>Solution</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.sokoban.runtime.RuntimePackage#getSokobanResult()
 * @model
 * @generated
 */
public interface SokobanResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' reference.
	 * @see #setLevel(SokobanLevel)
	 * @see no.hal.pg.sokoban.runtime.RuntimePackage#getSokobanResult_Level()
	 * @model
	 * @generated
	 */
	SokobanLevel getLevel();

	/**
	 * Sets the value of the '{@link no.hal.pg.sokoban.runtime.SokobanResult#getLevel <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(SokobanLevel value);

	/**
	 * Returns the value of the '<em><b>Move Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move Count</em>' attribute.
	 * @see no.hal.pg.sokoban.runtime.RuntimePackage#getSokobanResult_MoveCount()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getMoveCount();

	/**
	 * Returns the value of the '<em><b>Push Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Push Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Push Count</em>' attribute.
	 * @see no.hal.pg.sokoban.runtime.RuntimePackage#getSokobanResult_PushCount()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getPushCount();

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' attribute.
	 * @see #setSolution(String)
	 * @see no.hal.pg.sokoban.runtime.RuntimePackage#getSokobanResult_Solution()
	 * @model
	 * @generated
	 */
	String getSolution();

	/**
	 * Sets the value of the '{@link no.hal.pg.sokoban.runtime.SokobanResult#getSolution <em>Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution</em>' attribute.
	 * @see #getSolution()
	 * @generated
	 */
	void setSolution(String value);

} // SokobanResult
