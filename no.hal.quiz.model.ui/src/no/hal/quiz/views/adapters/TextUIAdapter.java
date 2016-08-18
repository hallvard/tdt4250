package no.hal.quiz.views.adapters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapterImpl;

public abstract class TextUIAdapter<E extends EObject> extends EObjectUIAdapterImpl<E, Text> implements ModifyListener {

	protected String format;
	
	public TextUIAdapter(E eObject) {
		super(eObject);
	}

	@Override
	public Text initView(Composite parent) {
		this.view = new Text(parent, SWT.NONE);
		view.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false));
		view.addModifyListener(this);
		updateView();
		return view;
	}

	protected String getModelString() {
		Object modelValue = getModelValue();
		return (modelValue != null ? modelValue.toString() : "");
	}
	protected abstract Object getModelValue();

	@Override
	public void updateView() {
		String value = getModelString();
		if (! view.getText().equals(value)) {
			view.setText(value);
		}
	}

	protected abstract Object getViewValue(String s);
	protected abstract void setModel(Object o);

	protected boolean viewEqualsModel(Object viewValue) {
		Object modelValue = getModelValue();
		return (viewValue == modelValue || (viewValue != null && viewValue.equals(modelValue)));
	}
	
	@Override
	public void updateModel() {
		String s = view.getText();
		Object viewValue = getViewValue(s);
		if (! viewEqualsModel(viewValue)) {
			setModel(viewValue);
		}
	}

	//

	private Color defaultColor = null;
	
	@Override
	public void modifyText(ModifyEvent e) {
		if (defaultColor == null) {
			defaultColor = view.getBackground();
		}
		if (validateView()) {
			updateModel();
			view.setBackground(defaultColor);
		} else {
			view.setBackground(view.getDisplay().getSystemColor(SWT.COLOR_RED));
		}
	}

	protected abstract boolean validateViewValue(Object viewValue);

	protected boolean validateView() {
		if (format != null && (! view.getText().matches(format))) {
			return false;
		}
		if (! validateViewValue(getViewValue(view.getText()))) {
			return false;
		}
		return true;
	}
}
