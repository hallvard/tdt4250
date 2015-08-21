package no.hal.pg.no.hal.graphql.emf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import graphql.Scalars;
import graphql.schema.GraphQLEnumType;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLInterfaceType;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLOutputType;
import graphql.schema.GraphQLSchema;
import graphql.schema.GraphQLSchema.Builder;
import graphql.schema.GraphQLTypeReference;
import graphql.schema.TypeResolver;

/**
 * Hello world!
 *
 */
public class SchemaGenerator {
	
	private final Collection<EPackage> packages;

	public SchemaGenerator(Collection<EPackage> packages) {
		this.packages = new ArrayList<EPackage>(packages);
	}

	public SchemaGenerator(EPackage... packages) {
		this(Arrays.asList(packages));
	}
	
	private Builder schemaBuilder; 

	public GraphQLSchema generate(EClass queryClass) {
		schemaBuilder = GraphQLSchema.newSchema();
		schemaBuilder.query(getObjectType(queryClass));
		for (EPackage ePackage : packages) {
			for (EClassifier eClassifier : ePackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					getObjectType((EClass) eClassifier);
				}
			}
		}
		return schemaBuilder.build();
	}

	private Map<EClass, String> references = new HashMap<EClass, String>();

	private Map<EClass, GraphQLObjectType> objectTypes = new HashMap<EClass, GraphQLObjectType>();
	private Map<EClass, GraphQLInterfaceType> interfaceTypes = new HashMap<EClass, GraphQLInterfaceType>();
	
	private String objectTypeNameFormat = "%sObject";
	private String interfaceTypeNameFormat = "%s";
	
	private String getObjectTypeName(EClass eClass) {
		return String.format(objectTypeNameFormat, eClass.getName());
	}	
	
	private String getInterfaceTypeName(EClass eClass) {
		return String.format(interfaceTypeNameFormat, eClass.getName());
	}
	
	private TypeResolver typeResolver = new TypeResolver() {
		@Override
		public GraphQLObjectType getType(Object object) {
			if (object instanceof EObject) {
				EClass eClass = ((EObject) object).eClass();
				return objectTypes.get(eClass);
			}
			return null;
		}
	};
	
	private Map<EClass, Collection<EStructuralFeature>> unresolvedFeatures = new HashMap<EClass, Collection<EStructuralFeature>>();
	
	private GraphQLInterfaceType getInterfaceType(EClass eClass) {
		GraphQLInterfaceType interfaceType = interfaceTypes.get(eClass);
		if (interfaceType == null) {
			String name = getInterfaceTypeName(eClass);
			GraphQLInterfaceType.Builder typeBuilder = GraphQLInterfaceType.newInterface().name(name);
			// add fields
			Collection<GraphQLFieldDefinition> fields = new ArrayList<GraphQLFieldDefinition>();
			generateFields(eClass, eClass.getEAllStructuralFeatures(), fields);
			generateResolvedFields(eClass, fields);
			for (GraphQLFieldDefinition field : fields) {
				typeBuilder.field(field);
			}
			typeBuilder.typeResolver(typeResolver);
			interfaceType = typeBuilder.build();
			interfaceTypes.put(eClass, interfaceType);
		}
		return interfaceType;
	}

	private void generateFields(EClass eClass, Iterable<EStructuralFeature> features, Collection<GraphQLFieldDefinition> fields) {
		for (EStructuralFeature feature : features) {
			EGenericType featureType = eClass.getFeatureType(feature);
			if (shouldExclude(eClass, feature)) {
				continue;
			}
			if (isGeneric(featureType)) {
				Collection<EStructuralFeature> unresolved = unresolvedFeatures.get(eClass);
				if (unresolved == null) {
					unresolved = new ArrayList<EStructuralFeature>();
					unresolvedFeatures.put(eClass, unresolved);
				}
				unresolved.add(feature);
				continue;
			}
			GraphQLFieldDefinition field = generate(feature, featureType);
			if (field == null) {
				System.err.println("Couldn't create field " + feature.getName() + " of " + feature.getEContainingClass().getName());
				System.err.println(isGeneric(featureType));
			} else {
				fields.add(field);
			}
		}
	}

	private void generateResolvedFields(EClass eClass, Collection<GraphQLFieldDefinition> fields) {
		// check if generic fields in superclasses, can be included
		for (EClass superClass : eClass.getESuperTypes()) {
			Collection<EStructuralFeature> unresolved = unresolvedFeatures.get(superClass);
			if (unresolved != null) {
				Collection<EStructuralFeature> stillUnresolved = null;
				for (EStructuralFeature feature : unresolved) {
					EGenericType featureType = eClass.getFeatureType(feature);
					if (isGeneric(featureType)) {
						if (stillUnresolved == null) {
							stillUnresolved = new ArrayList<EStructuralFeature>();
						}
						stillUnresolved.add(feature);
					} else {
						GraphQLFieldDefinition field = generate(feature, featureType);
						if (field == null) {
							System.err.println("Couldn't create field " + feature.getName() + " of " + feature.getEContainingClass().getName());
						} else {
							fields.add(field);
						}
					}
				}
				if (stillUnresolved != null) {
					unresolvedFeatures.put(eClass, stillUnresolved);
				}
			}
		}
	}

	private boolean isGeneric(EGenericType type) {
		if (type.getETypeParameter() != null) {
			return true;
		}
		for (EGenericType typeArgumemt : type.getETypeArguments()) {
			if (isGeneric(typeArgumemt)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean shouldExclude(EClass eClass, EStructuralFeature feature) {
		if (feature instanceof EReference && ((EReference) feature).isContainer()) {
			return true;
		}
		return false;
	}

	protected GraphQLObjectType getObjectType(EClass eClass) {
		GraphQLObjectType objectType = objectTypes.get(eClass);
		if (objectType == null) {
			String name = getObjectTypeName(eClass);
			references.put(eClass, name);
			GraphQLInterfaceType interfaceType = getInterfaceType(eClass);
			GraphQLObjectType.Builder typeBuilder = GraphQLObjectType.newObject().name(name);
			// add fields
			Collection<GraphQLFieldDefinition> fields = new ArrayList<GraphQLFieldDefinition>();
			generateFields(eClass, eClass.getEAllStructuralFeatures(), fields);
			generateResolvedFields(eClass, fields);
			for (GraphQLFieldDefinition field : fields) {
				typeBuilder.field(field);
			}
			// add interfaces
			Collection<GraphQLInterfaceType> interfaceTypes = new ArrayList<GraphQLInterfaceType>();
			interfaceTypes.add(interfaceType);
			for (EClass superClass : eClass.getEAllSuperTypes()) {
				interfaceTypes.add(getInterfaceType(superClass));
			}
			typeBuilder.withInterfaces(interfaceTypes.toArray(new GraphQLInterfaceType[interfaceTypes.size()]));
			objectType = typeBuilder.build();
			references.remove(eClass);
			objectTypes.put(eClass, objectType);
		}
		return objectType;
	}

	protected GraphQLFieldDefinition generate(EStructuralFeature feature, EGenericType resolvedType) {
		GraphQLFieldDefinition.Builder fieldBuilder = GraphQLFieldDefinition.newFieldDefinition().name(feature.getName());
		GraphQLOutputType type = getGraphQLType(resolvedType.getEClassifier());
		if (type == null) {
			return null;
		}
		if (feature.isMany()) {
			type = new GraphQLList(type);
		}
		fieldBuilder.type(type);
		return fieldBuilder.build();
	}

	private Map<EEnum, GraphQLEnumType> enumTypes = new HashMap<EEnum, GraphQLEnumType>();
	
	protected GraphQLEnumType getEnumType(EEnum eEnum) {
		GraphQLEnumType enumType = enumTypes.get(eEnum);
		if (enumType == null) {
			GraphQLEnumType.Builder typeBuilder = GraphQLEnumType.newEnum().name(eEnum.getName());
			for (EEnumLiteral eLiteral : eEnum.getELiterals()) {
				typeBuilder.value(eLiteral.getName(), eLiteral.getLiteral());
			}
		}
		return enumType;
	}

	protected GraphQLOutputType getGraphQLType(EClassifier eClassifier) {
		if (eClassifier instanceof EEnum) {
			return getEnumType((EEnum) eClassifier);
		} else if (eClassifier instanceof EDataType) {
			Class<?> instanceClass = ((EDataType) eClassifier).getInstanceClass();
			if (instanceClass == String.class) {
				return Scalars.GraphQLString;
			} else if (instanceClass == Integer.TYPE || instanceClass == Integer.class || instanceClass == Long.TYPE || instanceClass == Long.class) {
				return Scalars.GraphQLInt;
			} else if (instanceClass == Float.TYPE || instanceClass == Float.class || instanceClass == Double.TYPE || instanceClass == Double.class) {
				return Scalars.GraphQLFloat;
			} else if (instanceClass == Boolean.TYPE || instanceClass == Boolean.class) {
				return Scalars.GraphQLBoolean;
			}
		} else if (eClassifier instanceof EClass) {
			String referenceName = references.get(eClassifier);
			if (referenceName != null) {
				return new GraphQLTypeReference(referenceName);
			} else {
				return getInterfaceType((EClass) eClassifier);
			}
		}
		return null;
	}
}
