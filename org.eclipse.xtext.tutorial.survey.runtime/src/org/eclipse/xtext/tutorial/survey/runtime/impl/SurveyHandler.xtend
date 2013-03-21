package org.eclipse.xtext.tutorial.survey.runtime.impl

import java.io.IOException
import javax.servlet.ServletException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import org.eclipse.jetty.server.Request
import org.eclipse.jetty.server.handler.AbstractHandler
import org.eclipse.xtext.tutorial.survey.runtime.IPageFlow

class SurveyHandler extends AbstractHandler {
	
	@Property IPageFlow pageFlow
	
	extension DataStore datastore = new DataStore
	
	extension Evaluation = new Evaluation
	
	override handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		val formState = new FormState(request)
		switch target {
			case '/dispatch': {
				var nextPage = pageFlow.getNextPage(formState)
				if(nextPage == null) {
					formState.store
					request.session.invalidate
					nextPage = "Thanks"
				} 
				response.sendRedirect(nextPage + ".html")
				baseRequest.handled = true
			}
			case '/evaluate': {
				response.sendEvaluationPage(datastore)
				baseRequest.handled = true
			}
			case '/': {
				response.sendRedirect(pageFlow.firstPage + ".html")
				baseRequest.handled = true
			}
		} 
	}
}