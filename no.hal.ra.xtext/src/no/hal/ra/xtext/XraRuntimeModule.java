/*
 * generated by Xtext
 */
package no.hal.ra.xtext;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class XraRuntimeModule extends no.hal.ra.xtext.AbstractXraRuntimeModule {

	// contributed by org.eclipse.xtext.generator.ecore2xtext.Ecore2XtextValueConverterServiceFragment
	public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
		return no.hal.ra.xtext.formatting.XraValueConverters.class;
	}

}