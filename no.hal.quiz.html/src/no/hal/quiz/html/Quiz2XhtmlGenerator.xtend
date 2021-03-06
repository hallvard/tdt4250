/*
 * generated by Xtext
 */
package no.hal.quiz.html

import com.google.common.collect.Iterators
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.io.PrintStream
import java.util.Arrays
import no.hal.quiz.AbstractQA
import no.hal.quiz.Answer
import no.hal.quiz.BooleanAnswer
import no.hal.quiz.ManyOptionsAnswer
import no.hal.quiz.NumberAnswer
import no.hal.quiz.Option
import no.hal.quiz.OptionsAnswer
import no.hal.quiz.QA
import no.hal.quiz.QARef
import no.hal.quiz.Quiz
import no.hal.quiz.QuizPackage
import no.hal.quiz.QuizPart
import no.hal.quiz.QuizPartRef
import no.hal.quiz.SimpleAnswer
import no.hal.quiz.SingleOptionsAnswer
import no.hal.quiz.StringAnswer
import no.hal.quiz.StringQuestion
import no.hal.quiz.Xml
import no.hal.quiz.XmlAnswer
import no.hal.quiz.XmlContents
import no.hal.quiz.XmlPIAnswerElement
import no.hal.quiz.XmlQuestion
import no.hal.quiz.XmlTagElement
import no.hal.quiz.util.QuizResourceFactoryImpl
import no.hal.quiz.util.Util
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.XMLResource
import org.w3c.xhtml1.HtmlType
import org.w3c.xhtml1.InputType
import org.w3c.xhtml1.Xhtml1Factory
import org.w3c.xhtml1.util.Xhtml1ResourceFactoryImpl

class Quiz2XhtmlGenerator {

	Xhtml1ResourceFactoryImpl xhtml1ResourceFactoryImpl = new Xhtml1ResourceFactoryImpl

	def String generateHtml(Quiz quiz) {
		val encoding = "UTF-8"
		val html = generateHtmlType(quiz);
//			val root = XMLNamespaceFactory.eINSTANCE.createXMLNamespaceDocumentRoot += html
		val fileName = (if (quiz.name !== null) quiz.name.replace('.', '/') else "quiz")+ '.html'
		val resource = xhtml1ResourceFactoryImpl.createResource(URI.createFileURI(fileName)) as XMLResource
		resource.getDefaultSaveOptions().put(XMLResource.OPTION_ENCODING, encoding);
		resource.contents += html
		val outputStream = new ByteArrayOutputStream(4096)
		resource.save(outputStream, null)
		val originalOutput = outputStream.toString(encoding)
		originalOutput.cleanHtml
	}

	def cleanHtml(String html) {	
		html
			.replace("xhtml:", "")
			.replace("html_._type", "html")
			.replace("xmlns:xhtml=", "xmlns=")
			.replace("&lt;", "<")
			.replace("&gt;", ">")
			.replace("&amp;", "&")
			.replace("&quot;", "'")
	}

	extension Xhtml1Factory xhtml1Factory = Xhtml1Factory.eINSTANCE
	
	extension XhtmlUtil xhtmlUtil = new XhtmlUtil
	
	def HtmlType generateHtmlType(Quiz quiz) {
		val html = createHtmlType => [
			head = createHeadType => [
				title = createTitleType => [
					it += (quiz.title ?: quiz.name)
				]
				meta += createMetaType => [
					httpEquiv = "content-type"
					content = "text/html; charset=UTF-8"
				]
			]
			body = createBodyType => [
				for (part : quiz.parts) {
					it += generate(part)
				}
				script += createScriptType => [
					type = "text/javascript"
					it += '''
function isArray(o) {
	return o.length !== undefined;
}

function getInputElement(name) {
	return document.getElementById(name);
}

function hasModifier(s, mod) {
	return s.indexOf(mod) >= 0;
}

function checkInputEquals(input, prop, value, modifiers) {
	if (typeof input === 'string') {
		input = getInputElement(input);
	}
	var inputValue = input[prop];
	if (hasModifier(modifiers, '_')) {
		inputValue = inputValue.toLowerCase();
	}
	var matches = (inputValue == value);
	if (hasModifier(modifiers, '~')) {
		var regexpObject = new RegExp(value, "");
		matches = regexpObject.test(inputValue);
	}
	return [input, matches];
}

function validatedInput(result) {
	var input = result[0];
	if (isArray(input)) {
		for (var i = 0; i < result.length; i++) {
			validatedInput(result[i]);
		}
		return;
	}
	var valid = true;
	for (var i = 1; i < result.length; i++) {
		if (! result[i]) {
			valid = false;
		}
	}
	var color = "YellowGreen";
	if (! valid) {
		color = "Red";
	}
	input.style.backgroundColor = color;
}
''' + quiz.parts.map[generateCheckFunction(it)].join
				]
			]
		]
		html
//		fsa.generateFile(quiz.name.replace('.', '/') + '.html', stringBuilder);
	}

	def dispatch Iterable<? extends EObject> generate(QuizPartRef quizPartRef) {
		generate(quizPartRef.partRef)
	}

	def dispatch Iterable<? extends EObject> generate(QuizPart quizPart) {
		#[
			createHrType,
			createH2Type => [ it += quizPart.title ],
			createFormType += createDivType => [
				id = quizPart.name
				for (question : quizPart.questions) {
					it += generate(question)
				}
			],
			createDivType,
			createDivType += createButtonType => [
				onclick = '''check«quizPart.name.toFirstUpper»()'''
				it += '''Check «quizPart.title»'''
			]
		]
	}

	def dispatch String generateCheckFunction(QuizPartRef quizPartRef) {
		generateCheckFunction(quizPartRef.partRef)
	}
	def dispatch String generateCheckFunction(QuizPart quizPart) {
		'''
function check«quizPart.name.toFirstUpper»() {
	«FOR qa : quizPart.questions»
	validatedInput(check«name(qa).toFirstUpper»());
	«ENDFOR»
}
		''' +
		quizPart.questions.map[generateCheckFunction(it)].join
	}

	def dispatch Iterable<? extends EObject> generate(QARef qaRef) {
		generate(qaRef.qaRef)
	}
	def dispatch String generateCheckFunction(QARef qaRef) {
		generateCheckFunction(qaRef.qaRef)
	}

	def dispatch Iterable<? extends EObject> generate(QA qa) {
		#[ generateOutput(qa.q), generateInput(qa.a) ]
	}

	def dispatch String generateCheckFunction(QA qa) {
		generateCheckFunction(qa.a)
	}

	def dispatch EObject generateOutput(StringQuestion sq) {
		createDivType += sq.question
	}
	def dispatch EObject generateOutput(XmlQuestion xq) {
		generateOutput(xq.xml)
	}

	def dispatch EObject generateInput(Answer answer) {
	}

	def EObject generateInputElement(Answer answer, InputType type) {
		val name = name(answer)
		createInputType1 => [
			it.type = type
			it.id = name
			it.name = name
		]
	}

	def dispatch EObject generateInput(StringAnswer answer) {
		createDivType += answer.generateInputElement(InputType.TEXT)
	}

	def dispatch String generateCheckFunction(StringAnswer answer) {
		val modifiers = (if (answer.regexp) "~" else "") + (if (answer.ignoreCase) "_" else "")
		'''
«answer.checkFunctionHead()» {
	return checkInputEquals('«answer.name»', 'value', '«answer.value»', '«modifiers»');
}
'''
	}

	def dispatch EObject generateInput(NumberAnswer answer) {
		answer.generateInputElement(InputType.TEXT)
	}
	def dispatch String generateCheckFunction(NumberAnswer answer) {
		'''
«answer.checkFunctionHead()» {
	return checkInputEquals('«answer.name»', 'value', '«answer.value»', '');
}
'''
	}

	int idNum = 0

	def String genId() {
		idNum++
		"id_" + idNum
	}

	def appendInputType(EObject owner, InputType inputType, String name, String value, String id) {
		owner += createInputType1 => [
			it.type = inputType
			it.name = name
			if (value !== null) {
				it.value = value
			}
			it.id = id
		]
		if (value !== null) {
			owner += createLabelType => [
				it.^for = id
				it += value
			]
		}
	}

	def dispatch EObject generateInput(BooleanAnswer answer) {
		val id = name(answer)
		createDivType => [
			it.id = id
			appendInputType(it, InputType.RADIO, "radio", "Yes", id + "_yes")
			appendInputType(it, InputType.RADIO, "radio", "No", id + "_no")
		]
	}
	def dispatch String generateCheckFunction(BooleanAnswer answer) {
		'''
«answer.checkFunctionHead()» {
	var input = getInputElement('«answer.name»');
	return [input, input.getElementsByTagName("input")[«if (Boolean.TRUE == answer.value) 0 else 1»].checked];
}
'''
	}

	def dispatch EObject generateXml(Xml xml, (XmlPIAnswerElement) => EObject piAnswerHandler) {
		xml.element.generateXml(piAnswerHandler)
	}

	def dispatch EObject generateXml(XmlTagElement xml, (XmlPIAnswerElement) => EObject piAnswerHandler) {
		val tag = create(xml.startTag.name)
		for (attribute : xml.startTag.attributes) {
			tag += attribute.name -> attribute.value
		}
		if (xml.endTag !== null) {
			tag += xml.pre.substring(1, xml.pre.length - 1)
			for (content : xml.contents) {
				content.generateXml(piAnswerHandler)
				content.post.substring(1, content.post.length - 1)
			}
		}
		tag
	}

	def dispatch EObject generateXml(XmlContents xml, (XmlPIAnswerElement) => EObject piAnswerHandler) {
		if (xml.element !== null) {
			val tag = xml.element.generateXml(piAnswerHandler)
			tag
		}
	}

	def dispatch EObject generateXml(XmlPIAnswerElement xml, (XmlPIAnswerElement) => EObject piAnswerHandler) {
		piAnswerHandler.apply(xml)
	}

	def dispatch EObject generateInput(XmlAnswer answer) {
		generateXml(answer.xml) [ piAnswer | piAnswer.answer.generateInput ]
	}
	def dispatch String generateCheckFunction(XmlAnswer answer) {
		val piAnswers = <XmlPIAnswerElement>newArrayList
		Iterators.addAll(piAnswers, answer.eAllContents.filter(XmlPIAnswerElement))
		for (piAnswer : piAnswers) {
			piAnswer.answer.generateCheckFunction
		}
		'''
«answer.checkFunctionHead()» {
	return [«FOR piAnswer : piAnswers SEPARATOR ", "»«piAnswer.answer.checkFunctionName»()«ENDFOR»];
}
'''
	}

	def EObject generateOptionsElement(OptionsAnswer answer, InputType type) {
		val name = name(answer)
		createDivType => [
			id = name
			for (option : answer.options) {
				val value = if (option.option instanceof SimpleAnswer<?>) generateOutputValue(option.option as SimpleAnswer<?>)
				appendInputType(it, type, name, value, name)
//				it += createInputType1 => [
//					it.type = type
//					it.name = name
//					it.id = name
//					if (option.option instanceof SimpleAnswer<?>) {
//						it.value = generateOutputValue(option.option as SimpleAnswer<?>)
//					} else {
//						it += generateOutput(option.option)
//					}
//				]
				it += createBrType
			}
		]
	}

	def dispatch EObject generateInput(SingleOptionsAnswer answer) {
		generateOptionsElement(answer, InputType.RADIO)
	}

	def dispatch EObject generateInput(ManyOptionsAnswer answer) {
		generateOptionsElement(answer, InputType.CHECKBOX)
	}

	def dispatch String generateCheckFunction(OptionsAnswer answer) {
		val stringBuilder = new StringBuilder('''
«answer.checkFunctionHead()» {
	var input = getInputElement('«answer.name»');
	var inputs = input.getElementsByTagName("input")
	return [input''')
		var i = 0
		for (option : answer.options) {
			stringBuilder.append(''', inputs[«i»].checked === «option.correct»''')
			i = i + 1
		}
		stringBuilder.append('''];
}
''')
		stringBuilder.toString
	}

//	def dispatch EObject generateInput(SingleListOptionsAnswer answer) {
//		val name = name(answer)
//		createDivType => [
//			id = name
//			it += createSelectType => [
//				for (option : answer.options) {
//					it += createOptionType => [
//						if (option.option instanceof SimpleAnswer) {
//							it.value = generateOutputValue(option.option as SimpleAnswer)
//						} else {
//							it += generateOutput(option.option)
//						}
//					]
//				}
//				it += createBrType
//			]
//		]
//	}

//	def dispatch String generateCheckFunction(SingleListOptionsAnswer answer) {
//		'''
//«answer.checkFunctionHead()» {
//	var input = getInputElement('«answer.name»');
//	return [input, input.getElementsByTagName('select')[0].value == "''' +
//		generateOutputValue(answer.options.findFirst[correct].option as SimpleAnswer) +
//		'"];
//}
//'
//	}

	def dispatch Iterable<? extends EObject> generate(Option option) {
		generate(option.option)
	}

	def dispatch String generateOutputValue(StringAnswer answer) {
		answer.value
	}
	def dispatch String generateOutputValue(NumberAnswer answer) {
		String.valueOf(answer.value)
	}
	def dispatch String generateOutputValue(BooleanAnswer answer) {
		if (answer.value) "yes" else "no"
	}

	def dispatch EObject generateOutput(XmlAnswer answer) {
		generateXml(answer.xml) [ piAnswer | piAnswer.answer.generateOutput ]
	}

	def dispatch EObject generateOutput(Xml xml) {
		generateXml(xml) [ piAnswer | piAnswer.answer.generateOutput ]
	}

	//

	def String checkFunctionName(Answer answer) {
		"check" + name(answer).toFirstUpper
	}

	def String checkFunctionHead(Answer answer) {
		"function " + checkFunctionName(answer) + "()"
	}

	//
	

//	def asSource(EObject eObject) {
//		NodeModelUtils.getTokenText(NodeModelUtils.getNode(eObject))
//	}
	
	def String name(EObject o, String prefix) {
		prefix + o.eContainer.eContents.indexOf(o) 
	}

	def String name(AbstractQA qa) {
		val qaName = switch (qa) {
			QARef : qa.qaRef.name
			QA : qa.name
		} ?: name(qa, "_q_")
		qa.ancestor(QuizPart).name + "_" + qaName 
	}

	def String name(Answer answer) {
		val name = name(answer.ancestor(QA))
		if (answer.ancestor(XmlPIAnswerElement) !== null)
			name + Util.relativeName(answer, QA)
		else
			name
	}
		
	def static <T> T ancestor(EObject eObject, Class<T> c) {
   		var e = eObject
		while (e !== null) {
			if (c.isInstance(e)) {
				return e as T
			}
			e = e.eContainer
   		}
   		null
   	}

	//
   	
	def static void main(String[] args) throws IOException {
		val argsAsList = Arrays.asList(args)
		val quiz = if (argsAsList.size > 0) getQuiz(argsAsList.get(0)) else getSampleQuiz();
		val html = new Quiz2XhtmlGenerator().generateHtml(quiz);
		if (args.length > 1) {
			val target = URI.createURI(argsAsList.get(1));
			val ps = new PrintStream(quiz.eResource().getResourceSet().getURIConverter().createOutputStream(target))
			ps.print(html);
		} else {
			System.out.println(html);
		}
	}

	def static Quiz getQuiz(String uriString) throws IOException {
		val resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(QuizPackage.eNS_URI, QuizPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("quiz", new QuizResourceFactoryImpl());
		val resource = resSet.getResource(URI.createURI(uriString), true);
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof Quiz) {
				return eObject as Quiz;
			}
		}
		return null;
	}

	def static Quiz getSampleQuiz() {
		try {
			return getQuiz(Quiz2XhtmlGeneratorMain.getResource("SampleQuiz.quiz").toString());
		} catch (IOException e) {
			System.err.println(e);
			return null;
		}
	}
}
