package org.xtext.tutorial.reference.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.xtext.tutorial.reference.server.SurveyServer;

public class SecondPageServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String gender = req.getParameter("gender");
		String name = req.getParameter("name");
		if (gender != null && name != null) {
			SurveyServer.addAttendee(name, gender);
			if (gender.equals("male"))
				resp.sendRedirect("SecondPageMale.html");
			else if (gender.equals("female"))
				resp.sendRedirect("SecondPageFemale.html");
		} else
			resp.sendRedirect("EnterData.html");

	}
}
