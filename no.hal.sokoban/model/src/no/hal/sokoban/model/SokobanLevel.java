/**
 */
package no.hal.sokoban.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sokoban Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.sokoban.model.SokobanLevel#getLines <em>Lines</em>}</li>
 *   <li>{@link no.hal.sokoban.model.SokobanLevel#getProperties <em>Properties</em>}</li>
 *   <li>{@link no.hal.sokoban.model.SokobanLevel#getCharacterMappings <em>Character Mappings</em>}</li>
 * </ul>
 *
 * @see no.hal.sokoban.model.ModelPackage#getSokobanLevel()
 * @model
 * @generated
 */
public interface SokobanLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Lines</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' attribute list.
	 * @see no.hal.sokoban.model.ModelPackage#getSokobanLevel_Lines()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getLines();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' map.
	 * @see no.hal.sokoban.model.ModelPackage#getSokobanLevel_Properties()
	 * @model mapType="no.hal.sokoban.model.String2StringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getProperties();

	/**
	 * Returns the value of the '<em><b>Character Mappings</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character Mappings</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Mappings</em>' map.
	 * @see no.hal.sokoban.model.ModelPackage#getSokobanLevel_CharacterMappings()
	 * @model mapType="no.hal.sokoban.model.String2StringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getCharacterMappings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SokobanGrid createGrid();

} // SokobanLevel
