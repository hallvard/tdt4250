/*
 * generated by Xtext
 */
package no.hal.ra.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class XraStandaloneSetup extends XraStandaloneSetupGenerated{

	public static void doSetup() {
		new XraStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

