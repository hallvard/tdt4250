/**
 */
package no.hal.sokoban.model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.sokoban.model.ModelFactory;
import no.hal.sokoban.model.ModelPackage;
import no.hal.sokoban.model.SokobanGrid;
import no.hal.sokoban.model.SokobanLevel;
import no.hal.sokoban.util.Cell;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sokoban Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.sokoban.model.impl.SokobanLevelImpl#getLines <em>Lines</em>}</li>
 *   <li>{@link no.hal.sokoban.model.impl.SokobanLevelImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link no.hal.sokoban.model.impl.SokobanLevelImpl#getCharacterMappings <em>Character Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SokobanLevelImpl extends MinimalEObjectImpl.Container implements SokobanLevel {
	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<String> lines;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> properties;

	/**
	 * The cached value of the '{@link #getCharacterMappings() <em>Character Mappings</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterMappings()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> characterMappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SOKOBAN_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLines() {
		if (lines == null) {
			lines = new EDataTypeEList<String>(String.class, this, ModelPackage.SOKOBAN_LEVEL__LINES);
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getProperties() {
		if (properties == null) {
			properties = new EcoreEMap<String,String>(ModelPackage.Literals.STRING2_STRING_MAP_ENTRY, String2StringMapEntryImpl.class, this, ModelPackage.SOKOBAN_LEVEL__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getCharacterMappings() {
		if (characterMappings == null) {
			characterMappings = new EcoreEMap<String,String>(ModelPackage.Literals.STRING2_STRING_MAP_ENTRY, String2StringMapEntryImpl.class, this, ModelPackage.SOKOBAN_LEVEL__CHARACTER_MAPPINGS);
		}
		return characterMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public SokobanGrid createGrid() {
		List<String> allLines = new ArrayList<String>();
		for (String line : getLines()) {
			String[] lines = line.split("\\|");
			allLines.addAll(Arrays.asList(lines));
		}
		int width = 0;
		for (int y = 0; y < allLines.size(); y++) {
			width = Math.max(width, allLines.get(y).trim().length());
		}
		SokobanGrid grid = ModelFactory.eINSTANCE.createSokobanGrid();
		grid.setWidth(width);
		grid.setHeight(allLines.size());
		for (int y = 0; y < allLines.size(); y++) {
			String line = allLines.get(y);
			for (int x = 0; x < width; x++) {
				Cell cell = (x < line.length() ? Cell.valueOf(line.charAt(x)) : grid.createGridValue());
				if (cell.isPlayer()) {
					grid.setPlayerX(x);
					grid.setPlayerY(y);
				}
				grid.getValues().add(cell);
			}
		}
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SOKOBAN_LEVEL__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ModelPackage.SOKOBAN_LEVEL__CHARACTER_MAPPINGS:
				return ((InternalEList<?>)getCharacterMappings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SOKOBAN_LEVEL__LINES:
				return getLines();
			case ModelPackage.SOKOBAN_LEVEL__PROPERTIES:
				if (coreType) return getProperties();
				else return getProperties().map();
			case ModelPackage.SOKOBAN_LEVEL__CHARACTER_MAPPINGS:
				if (coreType) return getCharacterMappings();
				else return getCharacterMappings().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.SOKOBAN_LEVEL__LINES:
				getLines().clear();
				getLines().addAll((Collection<? extends String>)newValue);
				return;
			case ModelPackage.SOKOBAN_LEVEL__PROPERTIES:
				((EStructuralFeature.Setting)getProperties()).set(newValue);
				return;
			case ModelPackage.SOKOBAN_LEVEL__CHARACTER_MAPPINGS:
				((EStructuralFeature.Setting)getCharacterMappings()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.SOKOBAN_LEVEL__LINES:
				getLines().clear();
				return;
			case ModelPackage.SOKOBAN_LEVEL__PROPERTIES:
				getProperties().clear();
				return;
			case ModelPackage.SOKOBAN_LEVEL__CHARACTER_MAPPINGS:
				getCharacterMappings().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.SOKOBAN_LEVEL__LINES:
				return lines != null && !lines.isEmpty();
			case ModelPackage.SOKOBAN_LEVEL__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ModelPackage.SOKOBAN_LEVEL__CHARACTER_MAPPINGS:
				return characterMappings != null && !characterMappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.SOKOBAN_LEVEL___CREATE_GRID:
				return createGrid();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lines: ");
		result.append(lines);
		result.append(')');
		return result.toString();
	}

} //SokobanLevelImpl
