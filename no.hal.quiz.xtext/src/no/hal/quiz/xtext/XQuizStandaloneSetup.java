/*
 * generated by Xtext
 */
package no.hal.quiz.xtext;

import no.hal.quiz.xtext.XQuizStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class XQuizStandaloneSetup extends XQuizStandaloneSetupGenerated{

	public static void doSetup() {
		new XQuizStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

