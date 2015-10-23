/**
 */
package no.hal.gridgame.model.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import no.hal.gridgame.model.GridChangeDescription;
import no.hal.gridgame.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Change Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GridChangeDescriptionImpl extends GridRectangleImpl implements GridChangeDescription {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridChangeDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.GRID_CHANGE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addChange(int x, int y) {
		addChange(x, y, 1, 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addChange(int x, int y, int width, int height) {
		if (this.width == 0) {
			this.x = x;
			this.width = width;
		} else {
			if (x < this.x) {
				this.width += (this.x - x);
				this.x = x;
			}
			if (x + width > this.x + this.width) {
				this.width += (x + width - this.x - this.width);
			}
		}
		if (this.height == 0) {
			this.y = y;
			this.height = height;
		} else {
			if (y < this.y) {
				this.height += (this.y - y);
				this.y = y;
			}
			if (y + height > this.y + this.height) {
				this.height += (y + height - this.y - this.height);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.GRID_CHANGE_DESCRIPTION___ADD_CHANGE__INT_INT:
				addChange((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case ModelPackage.GRID_CHANGE_DESCRIPTION___ADD_CHANGE__INT_INT_INT_INT:
				addChange((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GridChangeDescriptionImpl
