package no.hal.quiz.views.adapters;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.emf.ui.parts.adapters.EObjectUIAdapterImpl;
import no.hal.emf.ui.parts.adapters.EObjectViewerAdapter;
import no.hal.emf.ui.parts.adapters.EObjectViewerAdapterHelper;
import no.hal.quiz.Proposal;
import no.hal.quiz.QuizPartProposals;

public class QuizPartProposalsUIAdapter extends EObjectUIAdapterImpl<QuizPartProposals, Group> implements DisposeListener {

	public QuizPartProposalsUIAdapter(QuizPartProposals partProposals) {
		super(partProposals);
	}
	
	@Override
	public Group initView(Composite parent) {
		Group view = new Group(parent, SWT.NONE);
		view.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false));
		view.setLayout(new GridLayout(1, false));
		if (getPartProposals().getQuizPart() != null && getPartProposals().getQuizPart().getTitle() != null) {
			view.setText(getPartProposals().getQuizPart().getTitle());
		}
		EObjectViewerAdapterHelper adapterHelper = getAdapterHelper();
		for (Proposal<?> proposal : getPartProposals().getProposals()) {
			if (adapterHelper.initView(proposal.getQuestion(), EObjectViewerAdapter.class, view) != null) {
				adapterHelper.initView(proposal, EObjectUIAdapter.class, view);
			}
		}
		setView(view);
		updateView();
		return view;
	}

	protected QuizPartProposals getPartProposals() {
		return eObject;
	}
	
	@Override
	public void widgetDisposed(DisposeEvent e) {
	}

	@Override
	public void updateView() {
		getAdapterHelper().updateView(getPartProposals().getProposals(), (Class<? extends EObjectViewerAdapter<?, ?>>) EObjectUIAdapter.class);
	}

	@Override
	public void updateModel() {
	}
}
