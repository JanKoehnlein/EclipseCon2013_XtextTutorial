package org.eclipse.xtext.tutorial.survey.runtime.impl

import java.util.List
import javax.servlet.http.HttpServletRequest
import org.eclipse.xtext.tutorial.survey.runtime.IFormState

class FormState implements IFormState {

	static val pageAttribute = 'page'
	static val surveyAttribute = 'survey'
	static val transientAttribtutes = #{ pageAttribute, surveyAttribute }

	HttpServletRequest request

	new(HttpServletRequest request) {
		this.request = request
		request.copyValuesToSession
	}

	override getFields() {
		val result = newArrayList
		val attributeNames = request.session.attributeNames
		while(attributeNames.hasMoreElements)
			result.add(attributeNames.nextElement)
		result
	}

	override getValue(String field) {
		request.session.getAttribute(field) ?: request.session.getAttribute(currentPage + "." + field) 
	}

	override isSet(String field, String value) {
		switch v: field.getValue {
			List<?>: v.contains(value)
			default: v == value
		}
	}

	override getCurrentPage() {
		request.getParameter(pageAttribute)?.toString
	}

	protected def copyValuesToSession(HttpServletRequest request) {
		val prefix = currentPage + "."
		for (entry : request.parameterMap.entrySet) {
			if(!transientAttribtutes.contains(entry.key)) {
				if(entry.value != null) {
					if(entry.value.length == 1)
						request.session.setAttribute(prefix + entry.key, entry.value.get(0))
					else
						request.session.setAttribute(prefix + entry.key, newArrayList(entry.value))
				}
			}
		}
	}
}
