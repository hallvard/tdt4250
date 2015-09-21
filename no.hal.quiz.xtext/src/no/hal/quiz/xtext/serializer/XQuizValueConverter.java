package no.hal.quiz.xtext.serializer;

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;

public class XQuizValueConverter extends Ecore2XtextTerminalConverters {

	@ValueConverter(rule = "EDoubleObject")
	public IValueConverter<Double> EDoubleObject() {
		return new AbstractNullSafeConverter<Double>() {
			@Override
			protected Double internalToValue(String string, INode node) {
				return Double.valueOf(string);
			}
			@Override
			protected String internalToString(Double value) {
				return Double.toString(value);
			}
		};
	}
}
