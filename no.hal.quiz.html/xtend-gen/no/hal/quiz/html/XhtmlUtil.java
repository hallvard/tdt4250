package no.hal.quiz.html;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.w3c.xhtml1.Xhtml1Package;

@SuppressWarnings("all")
public class XhtmlUtil {
  public EClass tag(final String tagName) {
    final String typeName = (tagName + "Type");
    EList<EClassifier> _eClassifiers = Xhtml1Package.eINSTANCE.getEClassifiers();
    Iterable<EClass> _filter = Iterables.<EClass>filter(_eClassifiers, EClass.class);
    for (final EClass eClass : _filter) {
      {
        final String className = eClass.getName();
        boolean _or = false;
        boolean _equalsIgnoreCase = className.equalsIgnoreCase(tagName);
        if (_equalsIgnoreCase) {
          _or = true;
        } else {
          boolean _equalsIgnoreCase_1 = className.equalsIgnoreCase(typeName);
          _or = _equalsIgnoreCase_1;
        }
        if (_or) {
          return eClass;
        }
      }
    }
    return null;
  }
  
  public EObject create(final EClass tag) {
    return EcoreUtil.create(tag);
  }
  
  public EObject create(final String tagName) {
    EObject _xblockexpression = null;
    {
      final EClass tag = this.tag(tagName);
      EObject _xifexpression = null;
      boolean _notEquals = (!Objects.equal(tag, null));
      if (_notEquals) {
        _xifexpression = this.create(tag);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public EStructuralFeature attr(final EObject eObject, final String attrName) {
    EClass _eClass = eObject.eClass();
    EList<EStructuralFeature> _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();
    final Function1<EStructuralFeature, Boolean> _function = new Function1<EStructuralFeature, Boolean>() {
      @Override
      public Boolean apply(final EStructuralFeature it) {
        String _name = it.getName();
        return Boolean.valueOf(Objects.equal(_name, attrName));
      }
    };
    return IterableExtensions.<EStructuralFeature>findFirst(_eAllStructuralFeatures, _function);
  }
  
  public Object operator_add(final EObject eObject, final Pair<String, String> attr) {
    Object _xblockexpression = null;
    {
      String _key = attr.getKey();
      final EStructuralFeature feature = this.attr(eObject, _key);
      Object _xifexpression = null;
      boolean _notEquals = (!Objects.equal(feature, null));
      if (_notEquals) {
        Object _xblockexpression_1 = null;
        {
          EClassifier _eType = feature.getEType();
          final EDataType featureType = ((EDataType) _eType);
          EPackage _ePackage = featureType.getEPackage();
          EFactory _eFactoryInstance = _ePackage.getEFactoryInstance();
          String _value = attr.getValue();
          final Object value = _eFactoryInstance.createFromString(featureType, _value);
          Object _xifexpression_1 = null;
          boolean _isMany = feature.isMany();
          if (_isMany) {
            _xifexpression_1 = null;
          } else {
            eObject.eSet(feature, value);
          }
          _xblockexpression_1 = _xifexpression_1;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public FeatureMap featureMap(final EObject featureMapOwner) {
    EClass _eClass = featureMapOwner.eClass();
    EList<EStructuralFeature> _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();
    for (final EStructuralFeature feature : _eAllStructuralFeatures) {
      EClassifier _eType = feature.getEType();
      EDataType _eFeatureMapEntry = EcorePackage.eINSTANCE.getEFeatureMapEntry();
      boolean _equals = Objects.equal(_eType, _eFeatureMapEntry);
      if (_equals) {
        Object _eGet = featureMapOwner.eGet(feature);
        return ((FeatureMap) _eGet);
      }
    }
    return null;
  }
  
  public EObject operator_add(final EObject featureMapOwner, final EObject eObject) {
    EObject _xblockexpression = null;
    {
      final FeatureMap featureMap = this.featureMap(featureMapOwner);
      boolean _notEquals = (!Objects.equal(featureMap, null));
      if (_notEquals) {
        EClass _eClass = featureMapOwner.eClass();
        EList<EStructuralFeature> _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();
        for (final EStructuralFeature feature : _eAllStructuralFeatures) {
          EClassifier _eType = feature.getEType();
          boolean _isInstance = _eType.isInstance(eObject);
          if (_isInstance) {
            featureMap.add(feature, eObject);
            return featureMapOwner;
          }
        }
        EClass _eClass_1 = eObject.eClass();
        String _name = _eClass_1.getName();
        String _plus = ("Didn\'t find feature for " + _name);
        String _plus_1 = (_plus + " in ");
        EClass _eClass_2 = featureMapOwner.eClass();
        String _name_1 = _eClass_2.getName();
        String _plus_2 = (_plus_1 + _name_1);
        System.err.println(_plus_2);
      }
      _xblockexpression = featureMapOwner;
    }
    return _xblockexpression;
  }
  
  public EObject operator_add(final EObject featureMapOwner, final Iterable<? extends EObject> eObjects) {
    EObject _xblockexpression = null;
    {
      for (final EObject eObject : eObjects) {
        this.operator_add(featureMapOwner, eObject);
      }
      _xblockexpression = featureMapOwner;
    }
    return _xblockexpression;
  }
  
  public FeatureMap operator_add(final FeatureMap featureMap, final CharSequence text) {
    FeatureMap _xblockexpression = null;
    {
      boolean _notEquals = (!Objects.equal(featureMap, null));
      if (_notEquals) {
        String _xifexpression = null;
        boolean _notEquals_1 = (!Objects.equal(text, null));
        if (_notEquals_1) {
          _xifexpression = text.toString();
        } else {
          _xifexpression = "";
        }
        FeatureMapUtil.addText(featureMap, _xifexpression);
      }
      _xblockexpression = featureMap;
    }
    return _xblockexpression;
  }
  
  public EObject operator_add(final EObject featureMapOwner, final CharSequence text) {
    EObject _xblockexpression = null;
    {
      final FeatureMap featureMap = this.featureMap(featureMapOwner);
      boolean _notEquals = (!Objects.equal(featureMap, null));
      if (_notEquals) {
        this.operator_add(featureMap, text);
      }
      _xblockexpression = featureMapOwner;
    }
    return _xblockexpression;
  }
  
  public StringBuilder operator_doubleLessThan(final StringBuilder stringBuilder, final Object o) {
    return stringBuilder.append(o);
  }
}
