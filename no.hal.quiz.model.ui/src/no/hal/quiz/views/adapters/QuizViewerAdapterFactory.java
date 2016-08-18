package no.hal.quiz.views.adapters;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import no.hal.emf.ui.parts.adapters.EObjectViewerAdapter;
import no.hal.quiz.StringQuestion;

public class QuizViewerAdapterFactory extends AdapterFactoryImpl {

	@Override
	public boolean isFactoryForType(Object type) {
		return EObjectViewerAdapter.class.equals(type);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof StringQuestion) {
			return new StringQuestionViewerAdapter((StringQuestion) target);
		}
		return null;
	}
}
