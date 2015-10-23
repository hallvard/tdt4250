/**
 */
package no.hal.pg.sokoban.model.impl;

import java.util.Collection;
import no.hal.pg.model.impl.TaskDefImpl;
import no.hal.pg.sokoban.model.ModelPackage;
import no.hal.pg.sokoban.model.SokobanTaskDef;

import no.hal.sokoban.model.SokobanLevel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uo D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.sokoban.model.impl.SokobanTaskDefImpl#getLevels <em>Levels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SokobanTaskDefImpl extends TaskDefImpl implements SokobanTaskDef {
	/**
	 * The cached value of the '{@link #getLevels() <em>Levels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<SokobanLevel> levels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanTaskDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SOKOBAN_TASK_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SokobanLevel> getLevels() {
		if (levels == null) {
			levels = new EObjectResolvingEList<SokobanLevel>(SokobanLevel.class, this, ModelPackage.SOKOBAN_TASK_DEF__LEVELS);
		}
		return levels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SOKOBAN_TASK_DEF__LEVELS:
				return getLevels();
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
			case ModelPackage.SOKOBAN_TASK_DEF__LEVELS:
				getLevels().clear();
				getLevels().addAll((Collection<? extends SokobanLevel>)newValue);
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
			case ModelPackage.SOKOBAN_TASK_DEF__LEVELS:
				getLevels().clear();
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
			case ModelPackage.SOKOBAN_TASK_DEF__LEVELS:
				return levels != null && !levels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UoDImpl
