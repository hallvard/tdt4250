package no.hal.pg.quiz.runtime.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;
import no.hal.pg.quiz.runtime.service.tests.QuizserviceAllTests;

public class AllTests extends TestSuite {

	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	public static Test suite() {
		TestSuite suite = new AllTests("Quiz-runtime All Tests");
		suite.addTest(QuizruntimeAllTests.suite());
		suite.addTest(QuizserviceAllTests.suite());
		return suite;
	}

	public AllTests(String name) {
		super(name);
	}

}
