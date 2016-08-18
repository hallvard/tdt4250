package no.hal.quiz.views.adapters;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.emf.ui.parts.adapters.EObjectUIAdapterImpl;
import no.hal.quiz.QuizPartProposals;
import no.hal.quiz.QuizProposals;

public class QuizProposalsUIAdapter extends EObjectUIAdapterImpl<QuizProposals, Composite> implements DisposeListener {

	public QuizProposalsUIAdapter(QuizProposals quizProposals) {
		super(quizProposals);
	}
	
	@Override
	public Composite initView(Composite parent) {
		this.view = new Composite(parent, SWT.NONE);
		view.setLayout(new GridLayout(1, false));
		for (QuizPartProposals partProposals : getQuizProposals().getProposals()) {
			getAdapterHelper().initView(partProposals, EObjectUIAdapter.class, view);
		}
		view.addDisposeListener(this);
		updateView();
		return view;
	}

	protected QuizProposals getQuizProposals() {
		return eObject;
	}
	
	@Override
	public void widgetDisposed(DisposeEvent e) {
	}

	@Override
	public void updateView() {
//		for (QuizPartProposals partProposals : getQuizProposals().getProposals()) {
//			getAdapterHelper().updateView(partProposals, EObjectUIAdapter.class);
//		}
		getAdapterHelper().updateView(getQuizProposals().getProposals(), EObjectUIAdapter.class);
	}

	@Override
	public void updateModel() {
	}
}
