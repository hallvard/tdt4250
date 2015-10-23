/**
 */
package no.hal.pg.sokoban.runtime.util;

import no.hal.gridgame.model.GridRectangle;
import no.hal.pg.model.TaskDef;

import no.hal.pg.runtime.Players;
import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.Task;

import no.hal.pg.sokoban.runtime.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see no.hal.pg.sokoban.runtime.RuntimePackage
 * @generated
 */
public class RuntimeSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RuntimePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeSwitch() {
		if (modelPackage == null) {
			modelPackage = RuntimePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RuntimePackage.SOKOBAN_TASK: {
				SokobanTask sokobanTask = (SokobanTask)theEObject;
				T1 result = caseSokobanTask(sokobanTask);
				if (result == null) result = caseTask(sokobanTask);
				if (result == null) result = casePlayers(sokobanTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.SOKOBAN_RESULT: {
				SokobanResult sokobanResult = (SokobanResult)theEObject;
				T1 result = caseSokobanResult(sokobanResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.SOKOBAN_SERVICE: {
				SokobanService sokobanService = (SokobanService)theEObject;
				T1 result = caseSokobanService(sokobanService);
				if (result == null) result = caseService(sokobanService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.GRID_RECTANGLE_VALUES: {
				GridRectangleValues gridRectangleValues = (GridRectangleValues)theEObject;
				T1 result = caseGridRectangleValues(gridRectangleValues);
				if (result == null) result = caseGridRectangle(gridRectangleValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.SOKOBAN_GAME_SERVICE: {
				SokobanGameService sokobanGameService = (SokobanGameService)theEObject;
				T1 result = caseSokobanGameService(sokobanGameService);
				if (result == null) result = caseService(sokobanGameService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.SOKOBAN_GRID_SERVICE: {
				SokobanGridService sokobanGridService = (SokobanGridService)theEObject;
				T1 result = caseSokobanGridService(sokobanGridService);
				if (result == null) result = caseService(sokobanGridService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sokoban Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sokoban Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSokobanTask(SokobanTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sokoban Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sokoban Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSokobanResult(SokobanResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sokoban Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sokoban Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSokobanService(SokobanService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Rectangle Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Rectangle Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGridRectangleValues(GridRectangleValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sokoban Game Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sokoban Game Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSokobanGameService(SokobanGameService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sokoban Grid Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sokoban Grid Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSokobanGridService(SokobanGridService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Players</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Players</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePlayers(Players object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends TaskDef, R> T1 caseTask(Task<T, R> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseService(Service<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGridRectangle(GridRectangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //RuntimeSwitch
