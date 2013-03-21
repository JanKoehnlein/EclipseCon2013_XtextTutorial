package org.eclipse.xtext.tutorial.survey.runtime

import java.util.List

interface IFormState {
	
	def List<String> getFields()
	
	def Object getValue(String field)
	
	def boolean isSet(String field, String value)
	
	def String getCurrentPage()
	
}