package org.eclipse.xtext.tutorial.survey.runtime.impl

import java.io.File
import java.util.List
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.server.handler.HandlerList
import org.eclipse.jetty.server.handler.ResourceHandler
import org.eclipse.jetty.server.session.SessionHandler
import org.eclipse.xtext.tutorial.survey.runtime.IPageFlow

class SurveyServer {
	
	@Property int port
	@Property IPageFlow pageFlow
	
	List<String> webroots = newArrayList()
	
	def addWebroot(String folder) {
		webroots += folder
	}
		
	def void start() {
		new Server(8080) => [
			val handlerList = new HandlerList
			handlerList.addHandler(new SessionHandler)
			handlerList.addHandler(new SurveyHandler => [
				it.pageFlow = this.pageFlow
			]) 
			for(webroot: webroots) 
				handlerList.addHandler(new ResourceHandler() => [
					resourceBase = webroot
				])
			handler = handlerList
			start
			join
		]
	}
	
	protected def getResourceHandler() {
		new ResourceHandler() => [
			val current = new File('.').getCanonicalPath()
			resourceBase = current + '/webroot/'
		]
	}
	
}

