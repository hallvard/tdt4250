/**
 */
package no.hal.pg.quiz.runtime.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.emfjson.jackson.resource.JsonResourceFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see no.hal.pg.quiz.runtime.util.RuntimeResourceImpl
 * @generated
 */
public class RuntimeResourceFactoryImpl extends JsonResourceFactory {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		Resource result = new RuntimeResourceImpl(uri);
		return result;
	}

} //RuntimeResourceFactoryImpl
