package no.hal.pg.runtime.ui;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class ServiceContentProvider implements ITreeContentProvider {
	
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}
	
	@Override
	public void dispose() {
	}

	private boolean includeOperations = true, includeFeatures = false;

	public void setIncludeOperations(boolean includeOperations) {
		this.includeOperations = includeOperations;
	}
	
	public void setIncludeFeatures(boolean includeFeatures) {
		this.includeFeatures = includeFeatures;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Collection<?>) {
			return ((Collection<?>) inputElement).toArray();
		}
		EClass eClass = null;
		if (inputElement instanceof EClass) {
			eClass = (EClass) inputElement;
//		} else if (inputElement instanceof Service<?>) {
//			eClass = ((EObject) inputElement).eClass();
		}
		Collection<EObject> elements = new ArrayList<EObject>();
		if (eClass != null) {
			if (includeFeatures) {
				for (EStructuralFeature feature : eClass.getEAllStructuralFeatures()) {
					if (feature.isDerived()) {
						elements.add(feature);
					}
				}
			}
			if (includeOperations) {
				elements.addAll(eClass.getEAllOperations());
			}
		}
		return elements.toArray();
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
//		} else if (element instanceof Service<?>) {
//			return true;
		} else if (element instanceof EOperation) {
			return true;
		} else if (element instanceof EParameter) {
			return false;
		}
		return false;
	}
}
