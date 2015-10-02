package no.hal.pg.runtime.ui;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class EOperationLabelProvider extends LabelProvider {

	protected String toString(EOperation operation) {
		String item = operation.getName() + "(";
		for (EParameter param : operation.getEParameters()) {
			if (param != operation.getEParameters().get(0)) {
				item += ",";
			}
			item += toString(param);
		}
		item += ")";
		return item;
	}

	protected String toString(EParameter param) {
		EClassifier type = param.getEType();
		return type.getName() + (param.isMany() ? '*' : 0) + " " + param.getName();
	}
	
	@Override
	public String getText(Object element) {
		if (element instanceof EParameter) {
			return toString((EParameter) element);
		} else if (element instanceof EOperation) {
			return toString((EOperation) element);
		}
		return super.getText(element);
	}
	
	@Override
	public Image getImage(Object element) {
		return super.getImage(element);
	}
}