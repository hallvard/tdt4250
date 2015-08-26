package no.hal.pg.model.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEList;

public class Util {

	public static int indexOf(EObject child) {
		try {
			return ((EList<?>) child.eContainer().eGet(child.eContainingFeature())).indexOf(child);
		} catch (Exception e) {
			return -1;
		}
	}
	
	public static <T> EList<T> createUmodifiableList(InternalEObject owner, EStructuralFeature feature, EList<T>... lists) {
		Collection<T> all = new ArrayList<T>();
		for (EList<T> taskList : lists) {
			all.addAll(taskList);
		}
		return new EcoreEList.UnmodifiableEList<T>(owner, feature, all.size(), all.toArray());
	}
}
