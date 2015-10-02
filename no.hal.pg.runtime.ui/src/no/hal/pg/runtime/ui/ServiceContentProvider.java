package no.hal.pg.runtime.ui;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class EOperationContentProvider implements ITreeContentProvider {
	
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}
	
	@Override
	public void dispose() {
	}

	@Override
	public Object[] getElements(Object inputElement) {
		EClass eClass = null;
		if (inputElement instanceof EClass) {
			eClass = (EClass) inputElement;
		} else if (inputElement instanceof EObject) {
			eClass = ((EObject) inputElement).eClass();
		}
		EList<EOperation> operations = (eClass != null ? eClass.getEAllOperations() : new BasicEList<EOperation>());
		return operations.toArray();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof EOperation) {
			return ((EOperation) parentElement).getEParameters().toArray();
		}
		return getElements(parentElement);
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof EObject) {
			return ((EObject) element).eContainer();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof EClass) {
			return true;
		} else if (element instanceof EOperation) {
			return true;
		} else if (element instanceof EParameter) {
			return false;
		}
		return false;
	}
}
