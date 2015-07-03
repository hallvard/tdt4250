/**
 */
package no.hal.pg.runtime.impl;

import no.hal.pg.runtime.FinishedState;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Task;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FInished State</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FinishedStateImpl<T extends Task<?>> extends TaskStateImpl<T> implements FinishedState<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinishedStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.FINISHED_STATE;
	}

	//
	
	@Override
	public boolean isFinishState() {
		return true;
	}
	
} //FInishedStateImpl
