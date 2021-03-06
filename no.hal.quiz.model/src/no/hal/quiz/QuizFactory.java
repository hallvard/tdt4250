/**
 */
package no.hal.quiz;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.quiz.QuizPackage
 * @generated
 */
public interface QuizFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuizFactory eINSTANCE = no.hal.quiz.impl.QuizFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Quiz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quiz</em>'.
	 * @generated
	 */
	Quiz createQuiz();

	/**
	 * Returns a new object of class '<em>Proposals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proposals</em>'.
	 * @generated
	 */
	QuizProposals createQuizProposals();

	/**
	 * Returns a new object of class '<em>Part Proposals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Proposals</em>'.
	 * @generated
	 */
	QuizPartProposals createQuizPartProposals();

	/**
	 * Returns a new object of class '<em>Part Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Ref</em>'.
	 * @generated
	 */
	QuizPartRef createQuizPartRef();

	/**
	 * Returns a new object of class '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part</em>'.
	 * @generated
	 */
	QuizPart createQuizPart();

	/**
	 * Returns a new object of class '<em>QA Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QA Ref</em>'.
	 * @generated
	 */
	QARef createQARef();

	/**
	 * Returns a new object of class '<em>QA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QA</em>'.
	 * @generated
	 */
	QA createQA();

	/**
	 * Returns a new object of class '<em>String Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Question</em>'.
	 * @generated
	 */
	StringQuestion createStringQuestion();

	/**
	 * Returns a new object of class '<em>Styled String Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Styled String Question</em>'.
	 * @generated
	 */
	StyledStringQuestion createStyledStringQuestion();

	/**
	 * Returns a new object of class '<em>Styled String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Styled String</em>'.
	 * @generated
	 */
	StyledString createStyledString();

	/**
	 * Returns a new object of class '<em>Char Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Style</em>'.
	 * @generated
	 */
	CharStyle createCharStyle();

	/**
	 * Returns a new object of class '<em>Xml Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Question</em>'.
	 * @generated
	 */
	XmlQuestion createXmlQuestion();

	/**
	 * Returns a new object of class '<em>Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proposal</em>'.
	 * @generated
	 */
	<A extends Answer> Proposal<A> createProposal();

	/**
	 * Returns a new object of class '<em>Simple Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Proposal</em>'.
	 * @generated
	 */
	<A extends SimpleAnswer<?>> SimpleProposal<A> createSimpleProposal();

	/**
	 * Returns a new object of class '<em>String Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Answer</em>'.
	 * @generated
	 */
	StringAnswer createStringAnswer();

	/**
	 * Returns a new object of class '<em>Number Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Answer</em>'.
	 * @generated
	 */
	NumberAnswer createNumberAnswer();

	/**
	 * Returns a new object of class '<em>Number Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Range</em>'.
	 * @generated
	 */
	NumberRange createNumberRange();

	/**
	 * Returns a new object of class '<em>Boolean Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Answer</em>'.
	 * @generated
	 */
	BooleanAnswer createBooleanAnswer();

	/**
	 * Returns a new object of class '<em>Xml Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Answer</em>'.
	 * @generated
	 */
	XmlAnswer createXmlAnswer();

	/**
	 * Returns a new object of class '<em>Options Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Options Answer</em>'.
	 * @generated
	 */
	OptionsAnswer createOptionsAnswer();

	/**
	 * Returns a new object of class '<em>Options Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Options Proposal</em>'.
	 * @generated
	 */
	OptionsProposal createOptionsProposal();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	Option createOption();

	/**
	 * Returns a new object of class '<em>Single Options Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Options Answer</em>'.
	 * @generated
	 */
	SingleOptionsAnswer createSingleOptionsAnswer();

	/**
	 * Returns a new object of class '<em>Many Options Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Many Options Answer</em>'.
	 * @generated
	 */
	ManyOptionsAnswer createManyOptionsAnswer();

	/**
	 * Returns a new object of class '<em>Xml</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml</em>'.
	 * @generated
	 */
	Xml createXml();

	/**
	 * Returns a new object of class '<em>Xml Contents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Contents</em>'.
	 * @generated
	 */
	XmlContents createXmlContents();

	/**
	 * Returns a new object of class '<em>Xml PI Answer Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml PI Answer Element</em>'.
	 * @generated
	 */
	XmlPIAnswerElement createXmlPIAnswerElement();

	/**
	 * Returns a new object of class '<em>Xml Tag Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Tag Element</em>'.
	 * @generated
	 */
	XmlTagElement createXmlTagElement();

	/**
	 * Returns a new object of class '<em>Xml Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Tag</em>'.
	 * @generated
	 */
	XmlTag createXmlTag();

	/**
	 * Returns a new object of class '<em>Xml Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Attribute</em>'.
	 * @generated
	 */
	XmlAttribute createXmlAttribute();

	/**
	 * Returns a new object of class '<em>Task Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Answer</em>'.
	 * @generated
	 */
	TaskAnswer createTaskAnswer();

	/**
	 * Returns a new object of class '<em>Task Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Proposal</em>'.
	 * @generated
	 */
	<T extends TaskAnswer> TaskProposal<T> createTaskProposal();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QuizPackage getQuizPackage();

} //QuizFactory
