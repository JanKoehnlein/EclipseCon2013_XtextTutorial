package org.eclipse.xtext.tutorial.example;

import org.eclipse.xtext.tutorial.survey.runtime.impl.SurveyServer;

public class StartServer {
	
	public static void main(final String... args) {
		SurveyServer surveyServer = new SurveyServer();
		surveyServer.setPort(8080);
		surveyServer.setPageFlow(new PageFlow());
		surveyServer.addWebroot("./html-gen");
		surveyServer.addWebroot("../org.eclipse.xtext.tutorial.survey.runtime/webroot");
		surveyServer.start();
	}
}
