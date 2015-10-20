/**
 */
package no.hal.sokoban.model.impl;

import no.hal.gridgame.model.impl.GridGameImpl;
import no.hal.sokoban.model.ModelPackage;
import no.hal.sokoban.model.MovePlayerCommand;
import no.hal.sokoban.model.SokobanGame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sokoban Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SokobanGameImpl extends GridGameImpl<no.hal.sokoban.util.Cell, EObject, MovePlayerCommand> implements SokobanGame {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanGameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SOKOBAN_GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<MovePlayerCommand> getUndoStack() {
		if (undoStack == null) {
			undoStack = new EObjectContainmentEList<MovePlayerCommand>(MovePlayerCommand.class, this, ModelPackage.SOKOBAN_GAME__UNDO_STACK);
		}
		return undoStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<MovePlayerCommand> getRedoStack() {
		if (redoStack == null) {
			redoStack = new EObjectContainmentEList<MovePlayerCommand>(MovePlayerCommand.class, this, ModelPackage.SOKOBAN_GAME__REDO_STACK);
		}
		return redoStack;
	}

} //SokobanGameImpl
