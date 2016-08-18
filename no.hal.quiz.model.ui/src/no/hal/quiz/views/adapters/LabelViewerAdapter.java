package no.hal.quiz.views.adapters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import no.hal.emf.ui.parts.adapters.EObjectViewerAdapterImpl;

public abstract class LabelViewerAdapter<E extends EObject> extends EObjectViewerAdapterImpl<E, Label> {

	public LabelViewerAdapter(E eObject) {
		super(eObject);
	}

	@Override
	public Label initView(Composite parent) {
		Label view = new Label(parent, SWT.NONE);
		view.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false));
		setView(view);
		updateView();
		return view;
	}

	protected abstract Object getModelValue();
	
	protected String getModelString() {
		Object modelValue = getModelValue();
		return modelValue != null ? modelValue.toString() : "";
	}
	
	@Override
	public void updateView() {
		String value = getModelString();
		if (! getView().getText().equals(value)) {
			getView().setText(value);
		}
	}
}
