package main;

import org.eclipse.xtext.tutorial.survey.runtime.IFormState;
import org.eclipse.xtext.tutorial.survey.runtime.IPageFlow;

public class PageFlow implements IPageFlow {
	
	public String getFirstPage() {
		return "Start";
	}
	
	public String getNextPage(IFormState formState) {
		String currentPage = formState.getCurrentPage();
		if(currentPage == null)
			return getFirstPage();
		if("Start".equals(currentPage)) {
			if("yes".equals(formState.getValue("like"))) {
				return "Like";
			}
			if("no".equals(formState.getValue("like"))) {
				return "Dislike";
			}
			return "Start";
		}
		return null;
	}
}
