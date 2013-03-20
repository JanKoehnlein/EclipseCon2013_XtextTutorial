package org.xtext.tutorial.reference.servlet

import java.io.IOException
import java.io.OutputStreamWriter
import javax.servlet.ServletException
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import org.xtext.tutorial.reference.server.SurveyServer

import static extension com.google.common.io.CharStreams.*

class EndServlet extends HttpServlet {

	override protected doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		'''	<html>
		<head>
			<title>EclipseCon 2013 Tutorial Survey</title>
			<meta name="viewport" content="width=device-width, initial-scale=1.0">
			<!-- Bootstrap -->
			<link href="css/bootstrap.css" rel="stylesheet" media="screen">
			<style type="text/css">
		      body {
		        padding-top: 60px;
		        padding-bottom: 40px;
		      }
		    </style>
		</head>
		<body>
			<script src="http://code.jquery.com/jquery.js"></script>
			<script src="js/bootstrap.js"></script>
			
		    <div class="container">
		    	    <table class="table table-condensed">
		    			<caption>These people completed the survey</caption>
					    <thead>
					    <tr>
					    <th>Name</th>
					    <th>Gender</th>
					    </tr>
					    </thead>
				    <tbody>
				    	«FOR current : SurveyServer::collection.find»
				    	<tr>
				    	<td>«current.get("name")»</td>
				    	<td>«current.get("gender")»</td>
				    	</tr>
				    	«ENDFOR»
«««						<tr>
«««				    	<td>FOO</td>
«««				    	<td>Male</td>
«««				    	</tr>
				    	
					    
				    </tbody>
				    </table>
		    </div>
		    
		</body>
	</html>'''.write [|new OutputStreamWriter(resp.outputStream)]
	
	}
}