package org.xtext.tutorial.reference.servlet;

import java.util.Map;

import javax.servlet.http.HttpServlet;

import com.google.common.collect.Maps;

public class ServletProvider {

	public static Map<String,HttpServlet> getServletMappings(){
		Map<String,HttpServlet> result = Maps.newHashMap();
		result.put("/start", new StartServlet());
		result.put("/html/second", new SecondPageServlet());
		result.put("/html/end", new EndServlet());
		return result;
		
	}
}
