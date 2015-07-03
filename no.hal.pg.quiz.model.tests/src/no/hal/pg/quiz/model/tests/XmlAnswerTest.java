/**
 */
package no.hal.pg.quiz.model.tests;

import junit.textui.TestRunner;
import no.hal.pg.quiz.model.NumberAnswer;
import no.hal.pg.quiz.model.ModelFactory;
import no.hal.pg.quiz.model.StringAnswer;
import no.hal.pg.quiz.model.Xml;
import no.hal.pg.quiz.model.XmlAnswer;
import no.hal.pg.quiz.model.XmlContents;
import no.hal.pg.quiz.model.XmlPIAnswerElement;
import no.hal.pg.quiz.model.XmlTagElement;

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
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createXmlAnswer());
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
	public void testAccept__Object() {
		XmlAnswer xmlAnswer = getFixture();
		Xml xml = ModelFactory.eINSTANCE.createXml();
		XmlTagElement xmlTag1 = ModelFactory.eINSTANCE.createXmlTagElement();

		XmlContents xmlContents1 = ModelFactory.eINSTANCE.createXmlContents();
		XmlPIAnswerElement xmlPIAnswer1 = ModelFactory.eINSTANCE.createXmlPIAnswerElement();
		StringAnswer stringAnswer = ModelFactory.eINSTANCE.createStringAnswer();
		stringAnswer.setValue("Hallvard");
		xmlPIAnswer1.setAnswer(stringAnswer);
		xmlContents1.setElement(xmlPIAnswer1);
		xmlTag1.getContents().add(xmlContents1);

		XmlContents xmlContents2 = ModelFactory.eINSTANCE.createXmlContents();
		XmlTagElement xmlTag2 = ModelFactory.eINSTANCE.createXmlTagElement();
		xmlContents2.setElement(xmlTag2);
		xmlTag1.getContents().add(xmlContents2);

		XmlContents xmlContents3 = ModelFactory.eINSTANCE.createXmlContents();
		XmlPIAnswerElement xmlPIAnswer2 = ModelFactory.eINSTANCE.createXmlPIAnswerElement();
		NumberAnswer numberAnswer = ModelFactory.eINSTANCE.createNumberAnswer();
		numberAnswer.setValue(2.0d);
		xmlPIAnswer2.setAnswer(numberAnswer);
		xmlContents3.setElement(xmlPIAnswer2);
		xmlTag1.getContents().add(xmlContents3);

		xml.setElement(xmlTag1);
		xmlAnswer.setXml(xml);

		assertTrue(xmlAnswer.accept("Hallvard"));
		assertFalse(xmlAnswer.accept("hallvard"));
		assertTrue(xmlAnswer.accept(2.0d));
		assertFalse(xmlAnswer.accept(1));
	}

} //XmlAnswerTest
