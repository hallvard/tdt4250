package no.hal.quiz.views.adapters;

import org.eclipse.swt.widgets.Control;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.quiz.Proposal;

public interface ProposalUIAdapter<P extends Proposal<?>, V extends Control> extends EObjectUIAdapter<P, V> {

	public P getProposal();
}
