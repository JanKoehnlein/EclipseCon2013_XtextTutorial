package org.eclipse.xtext.tutorial.survey.runtime

interface IPageFlow {
	
	def String getFirstPage()
	
	def String getNextPage(IFormState state)
}