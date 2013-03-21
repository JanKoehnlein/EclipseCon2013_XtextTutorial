package org.eclipse.xtext.tutorial.survey.runtime;

import java.util.List;

@SuppressWarnings("all")
public interface IFormState {
  public abstract List<String> getFields();
  
  public abstract Object getValue(final String field);
  
  public abstract boolean isSet(final String field, final String value);
  
  public abstract String getCurrentPage();
}
