package no.hal.pg.runtime.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import no.hal.pg.runtime.Service;

public class ServiceContentProvider implements ITreeContentProvider {
	
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}
	
	@Override
	public void dispose() {
		operationEClassManager = null;
		operationObjects = null;
	}
	
	private EOperationEClassManager operationEClassManager = new EOperationEClassManager();
	private Map<EOperation, EObject> operationObjects = new HashMap<EOperation, EObject>();

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Collection<?>) {
			return ((Collection<?>) inputElement).toArray();
		}
		Collection<EObject> elements = new ArrayList<EObject>();
		if (inputElement instanceof Service<?>) {
			Service<?> service = (Service<?>) inputElement;
			for (EOperation operation : service.eClass().getEAllOperations()) {
				EObject operationObject = operationObjects.get(operation);
				if (operationObject == null) {
					operationObject = operationEClassManager.getEOperationObject(operation, service);
					operationObjects.put(operation, operationObject);
				} else {
					EOperationEClassManager.setEOperationObjectEObject(operationObject, service);
				}
				elements.add(operationObject);
			}
		}
		return elements.toArray();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		return getElements(parentElement);
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof EObject) {
			EObject eObject = (EObject) element;
			if (EOperationEClassManager.isEOperationObject(eObject)) {
				return EOperationEClassManager.getEOperationObjectEObject(eObject);
			}
			return eObject.eContainer();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof Service<?>) {
			return true;
		}
		return false;
	}
}
