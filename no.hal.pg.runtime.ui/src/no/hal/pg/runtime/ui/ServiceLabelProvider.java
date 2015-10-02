package no.hal.pg.runtime.ui;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class ServiceLabelProvider extends LabelProvider {

	protected String toString(ENamedElement namedElement) {
		return namedElement.getName();
		
	}
	protected String toString(ETypedElement typedElement) {
		String item = toString((ENamedElement) typedElement);
		EClassifier type = typedElement.getEType();
		return (type != null ? type.getName() : "void") + (typedElement.isMany() ? '*' : 0) + " " + item;
	}
	protected String toString(EOperation operation) {
		String item = toString((ETypedElement) operation) + "(";
		for (EParameter param : operation.getEParameters()) {
			if (param != operation.getEParameters().get(0)) {
				item += ",";
			}
			item += toString(param);
		}
		item += ")";
		return item;
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