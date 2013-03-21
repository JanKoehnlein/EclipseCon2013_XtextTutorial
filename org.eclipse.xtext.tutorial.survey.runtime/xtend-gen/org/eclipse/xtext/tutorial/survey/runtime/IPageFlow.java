package org.eclipse.xtext.tutorial.survey.runtime;

import org.eclipse.xtext.tutorial.survey.runtime.IFormState;

@SuppressWarnings("all")
public interface IPageFlow {
  public abstract String getFirstPage();
  
  public abstract String getNextPage(final IFormState state);
}
