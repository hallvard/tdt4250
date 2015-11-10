package no.hal.pg.karaf.emf;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import no.hal.pg.karaf.emf.RegistryHelper.EPD;
import no.hal.pg.karaf.emf.RegistryHelper.XD;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		RegistryHelper helper = new RegistryHelper(context);
		EPD[] descriptors = {
			helper.epd("%s", "platform:/plugin/%s/model/pg.ecore", "%s.ModelPackage", "%s.util.ModelResourceFactoryImpl", "pg", "no.hal.pg.model"),
			helper.epd("%s", "platform:/plugin/%s/model/pg-runtime.ecore", "%s.RuntimePackage", "%s.util.RuntimeResourceFactoryImpl", "pg-rt", "no.hal.pg.runtime"),
			helper.epd("%s", "platform:/plugin/%s/model/pg-service.ecore", "%s.service.ServicePackage", null, null, "no.hal.pg.runtime"),

			helper.epd("%s", "platform:/plugin/%s/model/exampletask.ecore", "%s.ModelPackage", null, null, "no.hal.pg.exampletask.model"),
			helper.epd("%s", "platform:/plugin/%s/model/exampletask-runtime.ecore", "%s.RuntimePackage", null, null, "no.hal.pg.exampletask.runtime"),

			helper.epd("%s", "platform:/plugin/%s.model/model/quiz.ecore", "%s.QuizPackage", "%s.util.QuizResourceFactoryImpl", "quiz", "no.hal.quiz"),
			helper.epd("%s", "platform:/plugin/%s/model/quiz.ecore", "%s.ModelPackage", null, null, "no.hal.pg.quiz.model"),
			helper.epd("%s", "platform:/plugin/%s/model/quiz-runtime.ecore", "%s.RuntimePackage", null, null, "no.hal.pg.quiz.runtime"),

			helper.epd("%s", "platform:/plugin/%s/model/sokoban.ecore", "%s.ModelPackage", "%s.util.ModelResourceFactoryImpl", "sok", "no.hal.sokoban.model"),
			helper.epd("%s", "platform:/plugin/%s/model/pg-sokoban.ecore", "%s.ModelPackage", "%s.util.ModelResourceFactoryImpl", "pg-sok", "no.hal.pg.sokoban.model"),
			helper.epd("%s", "platform:/plugin/%s/model/pg-sokoban-runtime.ecore", "%s.RuntimePackage", null, null, "no.hal.pg.sokoban.runtime"),
		};
		XD[] xdescriptors = {
				helper.xd("%s", "%s.XampletaskStandaloneSetup", "no.hal.pg.exampletask.xtext"),
				helper.xd("%s", "%s.XQuizStandaloneSetup", "no.hal.quiz.xtext"),
		};
		helper.register(descriptors, xdescriptors);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}
}
