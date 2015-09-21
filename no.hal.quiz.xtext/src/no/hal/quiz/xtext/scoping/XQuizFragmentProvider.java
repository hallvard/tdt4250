package no.hal.quiz.xtext.scoping;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IFragmentProvider;

import no.hal.quiz.AbstractQA;
import no.hal.quiz.AbstractQuizPart;
import no.hal.quiz.Quiz;
import no.hal.quiz.QuizPackage;
import no.hal.quiz.QuizPart;

/**
 * Support fragments of the form <partNum>-<qaNum>, e.g. 1-1 question 1 in part 1.
 * Both parts are 1-based, optional and default to 1.
 * 
 * @author hal
 *
 */
public class XQuizFragmentProvider implements IFragmentProvider {

	public String getFragment(EObject obj, Fallback fallback) {
		if (obj instanceof AbstractQuizPart) {
			return Integer.toString(indexOf(obj));
		} else if (obj instanceof AbstractQA) {
			return Integer.toString(indexOf(obj.eContainer())) + "-" + Integer.toString(indexOf(obj));
		}
		return fallback.getFragment(obj);
	}

	private int indexOf(EObject eObject) {
		return ((EList<?>) eObject.eContainer().eGet(eObject.eContainingFeature())).indexOf(eObject) + 1;
	}
	
	private int num(String s) {
		int num = 0;
		if (s.length() == 0) {
			num = 1;
		} else {
			try {
				num = Integer.valueOf(s);
			} catch (NumberFormatException e) {
			}
		}
		return num;
	}

	public EObject getEObject(Resource resource, String fragment, Fallback fallback) {
		EList<EObject> contents = resource.getContents();
		Quiz quiz = (Quiz) EcoreUtil.getObjectByType(contents, QuizPackage.eINSTANCE.getQuiz());
		if (quiz != null && fragment != null) {
			String[] split = fragment.split("-");
			if (split.length >= 1) {
				int partNum = num(split[0]);
				if (partNum > 0 && partNum <= quiz.getParts().size()) {
					AbstractQuizPart part = quiz.getParts().get(partNum - 1);
					if (split.length == 1) {
						return part;
					} else if (part instanceof QuizPart) {
						QuizPart quizPart = (QuizPart) part;
						if (split.length == 2) {
							int qaNum = num(split[1]);
							if (qaNum > 0 && qaNum <= quizPart.getQuestions().size()) {
								return quizPart.getQuestions().get(qaNum - 1);
							}
						} else {
							return quizPart;
						}
					}
				}
			}
		}
		return fallback.getEObject(fragment);
	}
}
