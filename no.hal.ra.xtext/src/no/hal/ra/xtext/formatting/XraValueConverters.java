package no.hal.ra.xtext.formatting;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;

public class XraValueConverters extends Ecore2XtextTerminalConverters {

	@ValueConverter(rule = "URI")
	public IValueConverter<URI> URI() {
		return new AbstractNullSafeConverter<URI>() {

			@Override
			protected URI internalToValue(String string, INode node) {
				if (string.startsWith("\"")) {
					string = string.substring(1);
				}
				if (string.endsWith("\"")) {
					string = string.substring(0, string.length() - 1);
				}
				return URI.createURI(string);
			}

			@Override
			protected String internalToString(URI value) {
				return "\"" + value + "\"";
			}
		};
	}
}
