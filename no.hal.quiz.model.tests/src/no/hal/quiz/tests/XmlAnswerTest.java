/**
 */
package no.hal.quiz.tests;

import junit.textui.TestRunner;
import no.hal.quiz.NumberAnswer;
import no.hal.quiz.QuizFactory;
import no.hal.quiz.StringAnswer;
import no.hal.quiz.Xml;
import no.hal.quiz.XmlAnswer;
import no.hal.quiz.XmlContents;
import no.hal.quiz.XmlPIAnswerElement;
import no.hal.quiz.XmlTagElement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Xml Answer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlAnswerTest extends OptionAnswerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XmlAnswerTest.class);
	}

	/**
	 * Constructs a new Xml Answer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlAnswerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Xml Answer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XmlAnswer getFixture() {
		return (XmlAnswer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(createXmlAnswer());
	}

	private XmlAnswer createXmlAnswer() {
		XmlAnswer xmlAnswer = QuizFactory.eINSTANCE.createXmlAnswer();
		Xml xml = QuizFactory.eINSTANCE.createXml();
		XmlTagElement xmlTag1 = QuizFactory.eINSTANCE.createXmlTagElement();

		XmlContents xmlContents1 = QuizFactory.eINSTANCE.createXmlContents();
		XmlPIAnswerElement xmlPIAnswer1 = QuizFactory.eINSTANCE.createXmlPIAnswerElement();
		StringAnswer stringAnswer = QuizFactory.eINSTANCE.createStringAnswer();
		stringAnswer.setValue("Hallvard");
		xmlPIAnswer1.setAnswer(stringAnswer);
		xmlContents1.setElement(xmlPIAnswer1);
		xmlTag1.getContents().add(xmlContents1);

		XmlContents xmlContents2 = QuizFactory.eINSTANCE.createXmlContents();
		XmlTagElement xmlTag2 = QuizFactory.eINSTANCE.createXmlTagElement();
		xmlContents2.setElement(xmlTag2);
		xmlTag1.getContents().add(xmlContents2);

		XmlContents xmlContents3 = QuizFactory.eINSTANCE.createXmlContents();
		XmlPIAnswerElement xmlPIAnswer2 = QuizFactory.eINSTANCE.createXmlPIAnswerElement();
		NumberAnswer numberAnswer = QuizFactory.eINSTANCE.createNumberAnswer();
		numberAnswer.setValue(2.0d);
		xmlPIAnswer2.setAnswer(numberAnswer);
		xmlContents3.setElement(xmlPIAnswer2);
		xmlTag1.getContents().add(xmlContents3);

		xml.setElement(xmlTag1);
		xmlAnswer.setXml(xml);
		
		return xmlAnswer;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}
	
	//
	
	@Override
	public void testValidate__Object() {
	}
	
	@Override
	public void testAccept__Object() {
		XmlAnswer xmlAnswer = getFixture();

		assertTrue(xmlAnswer.accept("Hallvard"));
		assertFalse(xmlAnswer.accept("hallvard"));
		assertTrue(xmlAnswer.accept(2.0d));
		assertFalse(xmlAnswer.accept(1));
	}

	@Override
	public void testCreateProposal() {
	}

} //XmlAnswerTest
