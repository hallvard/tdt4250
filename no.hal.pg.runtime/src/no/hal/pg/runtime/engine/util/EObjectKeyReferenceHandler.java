package no.hal.pg.runtime.engine.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.component.annotations.Component;

import no.hal.pg.runtime.engine.IReferenceHandler;

@Component
public class EObjectKeyReferenceHandler implements IReferenceHandler {

	private String featureKeySeparator = ":";
	private String keySeparator = ",";

	protected boolean isKeyFeature(EStructuralFeature feature) {
		return (feature.isMany() && feature instanceof EReference && ((EReference) feature).getEKeys().size() > 0);
	}
	
	@Override
	public String getReference(EObject eObject, EObject context) {
		EStructuralFeature feature = eObject.eContainingFeature();
		if (isKeyFeature(feature)) {
			EList<EAttribute> keys = ((EReference) feature).getEKeys();
			String ref = "";
			for (EAttribute keyAttr : keys) {
				if (ref.length() > 0) {
					ref = ref + keySeparator;
				}
				ref = ref + eObject.eGet(keyAttr);
			}
			return feature.getName() + featureKeySeparator + ref;
		}
		return null;
	}

	@Override
	public EObject resolveReference(String reference, EObject context) {
		int pos = reference.indexOf(featureKeySeparator);
		if (pos > 0) {
			EStructuralFeature feature = context.eClass().getEStructuralFeature(reference.substring(0, pos));
			if (isKeyFeature(feature)) {
				EList<EAttribute> keyFeatures = ((EReference) feature).getEKeys();
				String[] keys = reference.substring(pos + featureKeySeparator.length()).split("\\Q" + keySeparator + "\\E");
				if (keys.length == keyFeatures.size()) {
					Object[] values = new Object[keyFeatures.size()];
					for (int i = 0; i < values.length; i++) {
						values[i] = EcoreUtil.createFromString(keyFeatures.get(i).getEAttributeType(), keys[i]);
					}
					outer: for (EObject object : (EList<? extends EObject>) context.eGet(feature)) {
						for (int i = 0; i < values.length; i++) {
							Object featureValue = object.eGet(keyFeatures.get(i));
							if (equals(featureValue, values[i])) {
								continue outer;
							}
						}
						return object;
					}
				}
			}
		}
		return null;
	}

	protected boolean equals(Object featureValue, Object value) {
		return featureValue != value && (featureValue == null || (! featureValue.equals(value)));
	}
}
