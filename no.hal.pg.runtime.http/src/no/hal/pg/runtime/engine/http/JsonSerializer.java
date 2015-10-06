package no.hal.pg.runtime.engine.http;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import no.hal.pg.runtime.engine.IReferenceProvider;
import no.hal.pg.runtime.engine.IServiceExecutor;
import no.hal.pg.runtime.util.CompositeReferenceProvider;

@SuppressWarnings("serial")
@Component
public class JsonSerializer extends StdSerializer<EObject> implements ISerializer {

	private IServiceExecutor serviceExecutor;
	
	@Reference(
			cardinality=ReferenceCardinality.MANDATORY,
			policy=ReferencePolicy.DYNAMIC
			)
	public synchronized void setServiceExecutor(IServiceExecutor serviceExecutor) {
		System.out.println("Engine bound to ServiceExecutor");
		this.serviceExecutor = serviceExecutor;
	}
	public synchronized void unsetServiceExecutor(IServiceExecutor serviceExecutor) {
		this.serviceExecutor = null;
	}
	
	//

	private CompositeReferenceProvider referenceProvider = new CompositeReferenceProvider();
	
	@Reference(
			cardinality=ReferenceCardinality.MULTIPLE,
			policy=ReferencePolicy.DYNAMIC,
			unbind="removeReferenceProvider"
			)
	public synchronized void addReferenceProvider(IReferenceProvider referenceProvider) {
		this.referenceProvider.addReferenceProvider(referenceProvider);
	}
	public synchronized void removeReferenceProvider(IReferenceProvider referenceProvider) {
		this.referenceProvider.removeReferenceProvider(referenceProvider);
	}

	//
	
	private ObjectMapper objectMapper;
	
	public JsonSerializer() {
		super(EObject.class);
		SimpleModule module = new SimpleModule();
		module.addSerializer(EObject.class, this);
		this.objectMapper = new ObjectMapper();
		objectMapper.registerModule(module);
	}

	private Stack<EObject> occurStack;

	@Override
	public void serialize(Object object, Writer writer) throws Exception {
		try {
			this.occurStack = new Stack<EObject>();
			ObjectWriter objectWriter = objectMapper.writer(new DefaultPrettyPrinter());
			objectWriter.writeValue(writer, object);
		} finally {
			this.occurStack = null;
		}
	}

	
	@Override
	public void serialize(EObject eObject, JsonGenerator generator, SerializerProvider serializerProvider) throws IOException, JsonGenerationException {
		Map<String, Object> featureValues = serviceExecutor.executeFeatureServices((EObject) eObject, IServiceExecutor.SERVICE_NAMES_WILDCARD);
		int count = 0;
		for (int i = occurStack.size() - 1; i >= 0; i--) {
			if (occurStack.get(i) == eObject) {
				count++;
				if (count >= 2) {
					generator.writeString("...");
					return;
				}
			}
		}
		if (occurStack.size() > 0 && eObject.eResource() != null) {
			for (int i = occurStack.size() - 1; i >= 0; i--) {
				String ref = referenceProvider.getReference(eObject, occurStack.get(i));
				if (ref != null) {
					generator.writeString(ref);
					return;
				}
			}
			generator.writeString("???");
			return;
		}
		occurStack.push(eObject);
		generator.writeStartObject();
		try {
			for (Map.Entry<String, Object> entry : featureValues.entrySet()) {
				String featureName = entry.getKey();
				Object value = entry.getValue();
				if (value instanceof EObject) {
					EObject eValue = (EObject) value;
					if (eValue.eResource() != null) {
						String ref = referenceProvider.getReference(eValue, eObject);
						if (ref != null) {
							generator.writeFieldName(featureName);
							generator.writeString(ref);
						}
					} else {
						generator.writeFieldName(featureName);
						generator.writeObject(eValue);
					}
				} else if (value instanceof EList<?>) {
					
				} else {
					generator.writeFieldName(featureName);
					generator.writeObject(value);
				}
			}
		} finally {
			generator.writeEndObject();
			occurStack.pop();
		}
	}	
}