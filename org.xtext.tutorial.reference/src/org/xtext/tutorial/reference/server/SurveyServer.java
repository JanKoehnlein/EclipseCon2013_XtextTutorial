package org.xtext.tutorial.reference.server;

import java.util.Map;

import javax.servlet.http.HttpServlet;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.xtext.tutorial.reference.servlet.ServletProvider;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

public class SurveyServer {
	private static DB mongoDB = null;
	/**
	 * http://localhost:8080
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		mongoDB = new Mongo().getDB("surveyDB");
		Server server = new Server(8080);
		ServletContextHandler context = new ServletContextHandler(
				ServletContextHandler.SESSIONS);
		context.setContextPath("/");
		ResourceHandler resource_handler = new ResourceHandler();
		resource_handler.setDirectoriesListed(true);
		String current = new java.io.File( "." ).getCanonicalPath();
		resource_handler.setResourceBase(current + "/");
		HandlerList handlers = new HandlerList();
		handlers.setHandlers(new Handler[] {resource_handler, context, new DefaultHandler()});
		server.setHandler(handlers);
		Map<String, HttpServlet> servletMappings = ServletProvider.getServletMappings();
		for(String url : servletMappings.keySet()){
			context.addServlet(new ServletHolder(servletMappings.get(url)), url);
		}
		server.start();
		server.join();
		
	}
	
	public static void addAttendee(String name, String gender){
		DBObject attendee = new BasicDBObject();
		attendee.put("name", name);
		attendee.put("gender", gender);
		DBCollection collection = getCollection();
		collection.save(attendee);
	}
	
	public static DBCollection getCollection(){
		return mongoDB.getCollection("attendeeCollection");
		
	}

}
