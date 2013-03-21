package main;

import org.eclipse.xtext.tutorial.survey.runtime.IFormState;
import org.eclipse.xtext.tutorial.survey.runtime.IPageFlow;

public class PageFlow implements IPageFlow {
	
	public String getFirstPage() {
		return "country";
	}
	
	public String getNextPage(IFormState formState) {
		String currentPage = formState.getCurrentPage();
		if(currentPage == null)
			return getFirstPage();
		if("country".equals(currentPage)) {
			return "experience";
		}
		if("experience".equals(currentPage)) {
			return "organization";
		}
		if("organization".equals(currentPage)) {
			return "operating_system";
		}
		if("operating_system".equals(currentPage)) {
			return "programming_language";
		}
		if("programming_language".equals(currentPage)) {
			return "development_target";
		}
		if("development_target".equals(currentPage)) {
			return "development_tools";
		}
		if("development_tools".equals(currentPage)) {
			return "cloud";
		}
		if("cloud".equals(currentPage)) {
			if("no".equals(formState.getValue("intent"))) {
				return "mobile";
			}
			if("don_t_know".equals(formState.getValue("intent"))) {
				return "mobile";
			}
			return "cloud_2";
		}
		if("cloud_2".equals(currentPage)) {
			return "mobile";
		}
		if("mobile".equals(currentPage)) {
			if("no".equals(formState.getValue("intent"))) {
				return "open_source";
			}
			if("don_t_know".equals(formState.getValue("intent"))) {
				return "open_source";
			}
			return "mobile_2";
		}
		if("mobile_2".equals(currentPage)) {
			return "open_source";
		}
		if("open_source".equals(currentPage)) {
			return "hobby";
		}
		if("hobby".equals(currentPage)) {
			if("none".equals(formState.getValue("time_spent"))) {
				return "eclipse";
			}
			return "hobby_2";
		}
		if("hobby_2".equals(currentPage)) {
			return "eclipse";
		}
		if("eclipse".equals(currentPage)) {
			return "comments";
		}
		return null;
	}
}
