/*
 * generated by Xtext
 */
package no.hal.quiz.xtext;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class XQuizUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return no.hal.quiz.xtext.ui.internal.XQuizActivator.getInstance().getInjector("no.hal.quiz.xtext.XQuiz");
	}
	
}
