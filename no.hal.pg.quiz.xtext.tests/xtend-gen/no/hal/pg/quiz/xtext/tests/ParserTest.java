package no.hal.pg.quiz.xtext.tests;

import java.util.ArrayList;
import javax.inject.Inject;
import no.hal.pg.quiz.model.AbstractQA;
import no.hal.pg.quiz.model.AbstractQuizPart;
import no.hal.pg.quiz.model.Answer;
import no.hal.pg.quiz.model.ModelPackage;
import no.hal.pg.quiz.model.Option;
import no.hal.pg.quiz.model.OptionAnswer;
import no.hal.pg.quiz.model.OptionsAnswer;
import no.hal.pg.quiz.model.QA;
import no.hal.pg.quiz.model.Quiz;
import no.hal.pg.quiz.model.QuizPart;
import no.hal.pg.quiz.model.SimpleAnswer;
import no.hal.pg.quiz.model.StringAnswer;
import no.hal.pg.quiz.xtext.XQuizInjectorProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(XQuizInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class ParserTest {
  public ParserTest() {
    EPackage.Registry.INSTANCE.put("platform:/plugin/no.hal.pg.quiz.model/model/quiz.ecore", ModelPackage.eINSTANCE);
  }
  
  @Inject
  private ParseHelper<Quiz> parser;
  
  public Answer parseAnswer(final String answerSource) {
    try {
      Answer _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("quiz \"?\" ");
        _builder.append(answerSource, "");
        final Quiz quiz = this.parser.parse(_builder);
        _xblockexpression = this.checkAnswer(quiz);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Answer checkAnswer(final Quiz quiz) {
    EList<AbstractQuizPart> _parts = quiz.getParts();
    int _size = _parts.size();
    Assert.assertEquals(1, _size);
    EList<AbstractQuizPart> _parts_1 = quiz.getParts();
    AbstractQuizPart _head = IterableExtensions.<AbstractQuizPart>head(_parts_1);
    Assert.assertTrue((_head instanceof QuizPart));
    EList<AbstractQuizPart> _parts_2 = quiz.getParts();
    AbstractQuizPart _head_1 = IterableExtensions.<AbstractQuizPart>head(_parts_2);
    final EList<AbstractQA> questions = ((QuizPart) _head_1).getQuestions();
    int _size_1 = questions.size();
    Assert.assertEquals(1, _size_1);
    AbstractQA _head_2 = IterableExtensions.<AbstractQA>head(questions);
    final QA qa = ((QA) _head_2);
    return qa.getA();
  }
  
  public <T extends Object> SimpleAnswer<T> checkSimpleAnswer(final Answer a, final T value, final T correct) {
    SimpleAnswer<T> _xblockexpression = null;
    {
      Assert.assertTrue((a instanceof SimpleAnswer<?>));
      final SimpleAnswer<T> sa = ((SimpleAnswer<T>) a);
      T _value = ((SimpleAnswer<T>) a).getValue();
      Assert.assertEquals(value, _value);
      T _elvis = null;
      if (correct != null) {
        _elvis = correct;
      } else {
        _elvis = value;
      }
      Boolean _accept = sa.accept(_elvis);
      Assert.assertTrue((_accept).booleanValue());
      _xblockexpression = sa;
    }
    return _xblockexpression;
  }
  
  @Test
  public void parseStringQuestionDefault() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"Hallvard\"");
    final Answer a = this.parseAnswer(_builder.toString());
    this.<String>checkSimpleAnswer(a, "Hallvard", null);
    final StringAnswer sa = ((StringAnswer) a);
    boolean _isIgnoreCase = sa.isIgnoreCase();
    Assert.assertFalse(_isIgnoreCase);
    boolean _isRegexp = sa.isRegexp();
    Assert.assertFalse(_isRegexp);
  }
  
  @Test
  public void parseStringQuestionIgnoreCase() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"Hallvard\"~");
    final Answer a = this.parseAnswer(_builder.toString());
    this.<String>checkSimpleAnswer(a, "Hallvard", "hallvard");
    final StringAnswer sa = ((StringAnswer) a);
    boolean _isIgnoreCase = sa.isIgnoreCase();
    Assert.assertTrue(_isIgnoreCase);
    boolean _isRegexp = sa.isRegexp();
    Assert.assertFalse(_isRegexp);
    String _value = sa.getValue();
    Assert.assertEquals("Hallvard", _value);
  }
  
  @Test
  public void parseStringQuestionRegex() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/\"Hal(l?)vard\"/");
    final Answer a = this.parseAnswer(_builder.toString());
    this.<String>checkSimpleAnswer(a, "Hal(l?)vard", "Halvard");
    final StringAnswer sa = ((StringAnswer) a);
    boolean _isIgnoreCase = sa.isIgnoreCase();
    Assert.assertFalse(_isIgnoreCase);
    boolean _isRegexp = sa.isRegexp();
    Assert.assertTrue(_isRegexp);
  }
  
  @Test
  public void parseStringQuestionRegexIgnoreCase() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/\"Hal(l?)vard\"/~");
    final Answer a = this.parseAnswer(_builder.toString());
    this.<String>checkSimpleAnswer(a, "Hal(l?)vard", "halvard");
    final StringAnswer sa = ((StringAnswer) a);
    boolean _isIgnoreCase = sa.isIgnoreCase();
    Assert.assertTrue(_isIgnoreCase);
    boolean _isRegexp = sa.isRegexp();
    Assert.assertTrue(_isRegexp);
  }
  
  @Test
  public void parseIntegerQuestion() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("2");
    final Answer a = this.parseAnswer(_builder.toString());
    this.<Double>checkSimpleAnswer(a, Double.valueOf(2.0), null);
  }
  
  @Test
  public void parseDoubleQuestion() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("2.3");
    final Answer a = this.parseAnswer(_builder.toString());
    this.<Double>checkSimpleAnswer(a, Double.valueOf(2.3), null);
  }
  
  @Test
  public void parseTrueQuestion() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("true");
    final Answer a = this.parseAnswer(_builder.toString());
    this.<Boolean>checkSimpleAnswer(a, Boolean.valueOf(true), null);
  }
  
  @Test
  public void parseYesQuestion() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("yes");
    final Answer a = this.parseAnswer(_builder.toString());
    this.<Boolean>checkSimpleAnswer(a, Boolean.valueOf(true), null);
  }
  
  @Test
  public void parseFalseQuestion() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("false");
    final Answer a = this.parseAnswer(_builder.toString());
    this.<Boolean>checkSimpleAnswer(a, null, Boolean.valueOf(false));
  }
  
  @Test
  public void parseNoQuestion() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("no");
    final Answer a = this.parseAnswer(_builder.toString());
    this.<Boolean>checkSimpleAnswer(a, null, Boolean.valueOf(false));
  }
  
  public OptionsAnswer checkOptionsAnswer(final OptionsAnswer answer, final Pair<Object, Boolean>... answers) {
    OptionsAnswer _xblockexpression = null;
    {
      int pos = 0;
      final ArrayList<Integer> correctOptionNums = CollectionLiterals.<Integer>newArrayList();
      final ArrayList<Object> correctOptions = CollectionLiterals.<Object>newArrayList();
      EList<Option> _options = answer.getOptions();
      for (final Option option : _options) {
        {
          final Pair<Object, Boolean> pair = answers[pos];
          Boolean _value = pair.getValue();
          boolean _isCorrect = option.isCorrect();
          Assert.assertEquals(_value, Boolean.valueOf(_isCorrect));
          OptionAnswer _option = option.getOption();
          Object _key = pair.getKey();
          Boolean _accept = _option.accept(_key);
          Assert.assertTrue((_accept).booleanValue());
          boolean _isCorrect_1 = option.isCorrect();
          if (_isCorrect_1) {
            correctOptionNums.add(Integer.valueOf(pos));
            Object _key_1 = pair.getKey();
            correctOptions.add(_key_1);
          }
          pos++;
        }
      }
      Boolean _accept = answer.accept(correctOptionNums);
      Assert.assertTrue((_accept).booleanValue());
      Boolean _accept_1 = answer.accept(correctOptions);
      Assert.assertTrue((_accept_1).booleanValue());
      _xblockexpression = answer;
    }
    return _xblockexpression;
  }
  
  @Test
  public void parseSingleOptionsAnswer() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("() \"en\" (x) \"to\" () \"tre\"");
    Answer _parseAnswer = this.parseAnswer(_builder.toString());
    final OptionsAnswer a1 = ((OptionsAnswer) _parseAnswer);
    Pair<Object, Boolean> _mappedTo = Pair.<Object, Boolean>of("en", Boolean.valueOf(false));
    Pair<Object, Boolean> _mappedTo_1 = Pair.<Object, Boolean>of("to", Boolean.valueOf(true));
    Pair<Object, Boolean> _mappedTo_2 = Pair.<Object, Boolean>of("tre", Boolean.valueOf(false));
    this.checkOptionsAnswer(a1, _mappedTo, _mappedTo_1, _mappedTo_2);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("() \"en\" (x) \"to\" () \"tre\" #");
    Answer _parseAnswer_1 = this.parseAnswer(_builder_1.toString());
    final OptionsAnswer a2 = ((OptionsAnswer) _parseAnswer_1);
    Pair<Object, Boolean> _mappedTo_3 = Pair.<Object, Boolean>of("en", Boolean.valueOf(false));
    Pair<Object, Boolean> _mappedTo_4 = Pair.<Object, Boolean>of("to", Boolean.valueOf(true));
    Pair<Object, Boolean> _mappedTo_5 = Pair.<Object, Boolean>of("tre", Boolean.valueOf(false));
    this.checkOptionsAnswer(a2, _mappedTo_3, _mappedTo_4, _mappedTo_5);
  }
  
  @Test
  public void parseMultiOptionsAnswer() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[x] \"en\" [] \"to\" [x] \"tre\"");
    Answer _parseAnswer = this.parseAnswer(_builder.toString());
    final OptionsAnswer a1 = ((OptionsAnswer) _parseAnswer);
    Pair<Object, Boolean> _mappedTo = Pair.<Object, Boolean>of("en", Boolean.valueOf(true));
    Pair<Object, Boolean> _mappedTo_1 = Pair.<Object, Boolean>of("to", Boolean.valueOf(false));
    Pair<Object, Boolean> _mappedTo_2 = Pair.<Object, Boolean>of("tre", Boolean.valueOf(true));
    this.checkOptionsAnswer(a1, _mappedTo, _mappedTo_1, _mappedTo_2);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("[x] \"en\" [] \"to\" [x] \"tre\" #");
    Answer _parseAnswer_1 = this.parseAnswer(_builder_1.toString());
    final OptionsAnswer a2 = ((OptionsAnswer) _parseAnswer_1);
    Pair<Object, Boolean> _mappedTo_3 = Pair.<Object, Boolean>of("en", Boolean.valueOf(true));
    Pair<Object, Boolean> _mappedTo_4 = Pair.<Object, Boolean>of("to", Boolean.valueOf(false));
    Pair<Object, Boolean> _mappedTo_5 = Pair.<Object, Boolean>of("tre", Boolean.valueOf(true));
    this.checkOptionsAnswer(a2, _mappedTo_3, _mappedTo_4, _mappedTo_5);
  }
}
