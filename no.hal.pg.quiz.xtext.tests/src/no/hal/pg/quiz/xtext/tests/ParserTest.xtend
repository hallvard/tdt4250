package no.hal.pg.quiz.xtext.tests

import javax.inject.Inject
import no.hal.pg.quiz.model.Answer
import no.hal.pg.quiz.model.QA
import no.hal.pg.quiz.model.Quiz
import no.hal.pg.quiz.model.ModelPackage
import no.hal.pg.quiz.model.QuizPart
import no.hal.pg.quiz.model.SimpleAnswer
import no.hal.pg.quiz.model.StringAnswer
import no.hal.pg.quiz.xtext.XQuizInjectorProvider
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import no.hal.pg.quiz.model.OptionsAnswer
import no.hal.pg.quiz.model.Option

@InjectWith(XQuizInjectorProvider)
@RunWith(XtextRunner)

class ParserTest {

	new () {
		EPackage.Registry.INSTANCE.put("platform:/plugin/no.hal.pg.quiz.model/model/quiz.ecore", ModelPackage.eINSTANCE);
	}

	@Inject
	ParseHelper<Quiz> parser
 
 	def Answer parseAnswer(String answerSource) {
		val quiz = parser.parse('''quiz "?" «answerSource»''')
    	checkAnswer(quiz)
 	}
 	
 	def Answer checkAnswer(Quiz quiz) {
 		Assert.assertEquals(1, quiz.parts.size)
	   	Assert.assertTrue(quiz.parts.head instanceof QuizPart)
	   	val questions = (quiz.parts.head as QuizPart).questions
	   	Assert.assertEquals(1, questions.size)
	   	val qa = questions.head as QA
 		return qa.a
 	}
	
	def <T> SimpleAnswer<T> checkSimpleAnswer(Answer a, T value, T correct) {
	   	Assert.assertTrue(a instanceof SimpleAnswer<?>)
	   	val sa = a as SimpleAnswer<T>
	   	Assert.assertEquals(value, (a as SimpleAnswer<T>).value)
	   	Assert.assertTrue(sa.accept(correct ?: value))
	   	sa
 	}

	@Test
	def void parseStringQuestionDefault() {
		val a = parseAnswer('''"Hallvard"''')
	   	checkSimpleAnswer(a, "Hallvard", null)
	   	val sa = a as StringAnswer
	   	Assert.assertFalse(sa.ignoreCase)
	   	Assert.assertFalse(sa.regexp)
 	}
	
	@Test
	def void parseStringQuestionIgnoreCase() {
		val a = parseAnswer('''"Hallvard"~''')
	   	checkSimpleAnswer(a, "Hallvard", "hallvard")
	   	val sa = a as StringAnswer
	   	Assert.assertTrue(sa.ignoreCase)
	   	Assert.assertFalse(sa.regexp)
	   	Assert.assertEquals("Hallvard", sa.value)
 	}
	
	@Test
	def void parseStringQuestionRegex() {
		val a = parseAnswer('''/"Hal(l?)vard"/''')
	   	checkSimpleAnswer(a, "Hal(l?)vard", "Halvard")
	   	val sa = a as StringAnswer
	   	Assert.assertFalse(sa.ignoreCase)
	   	Assert.assertTrue(sa.regexp)
 	}
	
	@Test
	def void parseStringQuestionRegexIgnoreCase() {
		val a = parseAnswer('''/"Hal(l?)vard"/~''')
	   	checkSimpleAnswer(a, "Hal(l?)vard", "halvard")
	   	val sa = a as StringAnswer
	   	Assert.assertTrue(sa.ignoreCase)
	   	Assert.assertTrue(sa.regexp)
 	}
	
	@Test
	def void parseIntegerQuestion() {
		val a = parseAnswer('''2''')
	   	checkSimpleAnswer(a, 2.0, null)
 	}
	
	@Test
	def void parseDoubleQuestion() {
		val a = parseAnswer('''2.3''')
	   	checkSimpleAnswer(a, 2.3, null)
 	}
	
	@Test
	def void parseTrueQuestion() {
		val a = parseAnswer('''true''')
	   	checkSimpleAnswer(a, true, null)
 	}	
	@Test
	def void parseYesQuestion() {
		val a = parseAnswer('''yes''')
	   	checkSimpleAnswer(a, true, null)
 	}
	
	@Test
	def void parseFalseQuestion() {
		val a = parseAnswer('''false''')
	   	checkSimpleAnswer(a, null, false)
 	}
	@Test
	def void parseNoQuestion() {
		val a = parseAnswer('''no''')
	   	checkSimpleAnswer(a, null, false)
 	}
 	
 	def OptionsAnswer checkOptionsAnswer(OptionsAnswer answer, Pair<Object, Boolean>... answers) {
 		var pos = 0
 		val correctOptionNums = <Integer>newArrayList() 
 		val correctOptions = <Object>newArrayList() 
 		for (Option option : answer.options) {
 			val pair = answers.get(pos)
 			Assert.assertEquals(pair.value, option.correct)
			Assert.assertTrue(option.option.accept(pair.key))
			if (option.correct) {
				correctOptionNums.add(pos)
				correctOptions.add(pair.key)
			}
 			pos++
 		}
		Assert.assertTrue(answer.accept(correctOptionNums))
		Assert.assertTrue(answer.accept(correctOptions))
 		answer
 	}

	@Test
	def void parseSingleOptionsAnswer() {
		val a1 = parseAnswer('''() "en" (x) "to" () "tre"''') as OptionsAnswer
		checkOptionsAnswer(a1, "en" -> false, "to" -> true , "tre" -> false)
		val a2 = parseAnswer('''() "en" (x) "to" () "tre" #''') as OptionsAnswer
		checkOptionsAnswer(a2, "en" -> false, "to" -> true , "tre" -> false)
 	}

	@Test
	def void parseMultiOptionsAnswer() {
		val a1 = parseAnswer('''[x] "en" [] "to" [x] "tre"''') as OptionsAnswer
		checkOptionsAnswer(a1, "en" -> true, "to" -> false, "tre" -> true)
		val a2 = parseAnswer('''[x] "en" [] "to" [x] "tre" #''') as OptionsAnswer
		checkOptionsAnswer(a2, "en" -> true, "to" -> false, "tre" -> true)
 	}
}
