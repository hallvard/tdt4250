package no.hal.quiz.junit.adapter;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.quiz.TaskProposal;
import no.hal.quiz.junit.JunitTestAnswer;
import no.hal.quiz.junit.JunitTestProposal;

public class JunitUIAdapterFactory extends AdapterFactoryImpl {

	@Override
	public boolean isFactoryForType(Object type) {
		return EObjectUIAdapter.class.equals(type);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof JunitTestProposal) {
			return new JunitTaskProposalAdapter((TaskProposal<JunitTestAnswer>) target);
		}
		return null;
	}
}
