package no.hal.pg.runtime.ui;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public abstract class EOperationView extends AbstractSelectionView {

	protected boolean isValidSelection(Object o) {
		return o instanceof EObject;
	}

	protected EObject getSelectedEObject() {
		return (EObject) getSelection();
	}

	protected String noEOperationsAvailableItem = "<No EOperations available>";

	protected String toString(EOperation operation) {
		String item = operation.getName() + "(";
		for (EParameter param : operation.getEParameters()) {
			if (param != operation.getEParameters().get(0)) {
				item += ",";
			}
			EClassifier type = param.getEType();
			item += type.getName() + (param.isMany() ? '*' : 0) + " " + param.getName(); 
		}
		item += ")";
		return item;
	}

	protected void updateView() {
		EObject selection = getSelectedEObject();
		EClass eClass = (selection != null ? selection.eClass() : null);
		// don't re-populate and reset selection, when the EClass is the same
		if (eClass != operationsCombo.getData()) {
			EList<EOperation> operations = (eClass != null ? eClass.getEAllOperations() : new BasicEList<EOperation>());
			String[] items = new String[operations.size()];
			for (int i = 0; i < items.length; i++) {
				items[i] = toString(operations.get(i));
			}
			operationsCombo.setItems(items);
			if (items.length > 0) {
				operationsCombo.select(0);
			} else {
				operationsCombo.setText(noEOperationsAvailableItem);
			}
			operationsCombo.setData(eClass);
		}
		operationSelected(operationsCombo.getSelectionIndex());
	}

	protected void operationSelected(int selectionIndex) {
		EClass eClass = (EClass) operationsCombo.getData();
		EOperation operation = null;
		if (eClass != null && selectionIndex >= 0) {
			EList<EOperation> operations = eClass.getEAllOperations();
			if (selectionIndex < operations.size()) {
				operation = operations.get(selectionIndex);
			}
		}
		operationSelected(operation);
	}
	
	protected abstract void operationSelected(EOperation operation);

	private Combo operationsCombo;

	protected Control getOperationSelectionControl() {
		return operationsCombo;
	}
	
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		parent.setLayout(new GridLayout(1, false));

		operationsCombo = new Combo(parent, SWT.READ_ONLY | SWT.DROP_DOWN);
		operationsCombo.setText(noEOperationsAvailableItem);
		operationsCombo.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				operationSelected(operationsCombo.getSelectionIndex());
			}
		});
		operationsCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
	}

	@Override
	public void setFocus() {
		operationsCombo.setFocus();
	}
}