package org.eclipse.xtext.tutorial.survey.runtime.impl

import java.util.Locale
import javax.servlet.http.HttpServletResponse

class Evaluation {
	
	def sendEvaluationPage(HttpServletResponse response, DataStore datastore) {
		response.writer.println(getHtml(datastore))
		response.setContentType("text/html;charset=utf-8")
	}
	
	protected def getHtml(extension DataStore dataStore) '''
		<html>
		<head>
			<title>EclipseCon 2013 Tutorial Survey</title>
			<meta name="viewport" content="width=device-width, initial-scale=1.0">
			<!-- Bootstrap -->
			<link href="css/bootstrap.css" rel="stylesheet" media="screen">
			<link href="css/survey.css" rel="stylesheet" media="screen">
		</head>
		<body>
			<script src="http://code.jquery.com/jquery.js"></script>
			<script src="js/bootstrap.js"></script>
			<div class="navbar">
			    <div class="navbar-inner">
				    <a class="brand" href="/">EclipseCon 2013 Tutorial Survey</a>
				    <ul class="nav pull-right">
		    			<li class="active"><a href="/evaluate">Evaluate</a></li>
		    		</ul>
		    	</div>
		    </div>
		    <div class="container">
				<h1>Evaluation</h1>
				<table class="table table-striped table-bordered table-condensed">
					«val participants = dataStore.entryCount»
					«FOR key: dataStore.keys.sort»
						«val valueCounts = dataStore.getValueCounts(key)»
						<tr>
							<th colspan="2">«key»</th>
						<tr>
						«FOR entry: valueCounts.entrySet.sortBy[-value]»
							<tr>
								<td>«entry.key»</td>
								<td>«String.format(Locale.US, "%.1f", 100.0 * entry.value / participants)»%</td>
							</tr>
						«ENDFOR»
					«ENDFOR»
				</table>
			</div>
		</body>
	'''
}