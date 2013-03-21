package org.eclipse.xtext.tutorial.survey.runtime.impl;

import com.google.common.base.Objects;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.xtext.tutorial.survey.runtime.IPageFlow;
import org.eclipse.xtext.tutorial.survey.runtime.impl.DataStore;
import org.eclipse.xtext.tutorial.survey.runtime.impl.Evaluation;
import org.eclipse.xtext.tutorial.survey.runtime.impl.FormState;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class SurveyHandler extends AbstractHandler {
  private IPageFlow _pageFlow;
  
  public IPageFlow getPageFlow() {
    return this._pageFlow;
  }
  
  public void setPageFlow(final IPageFlow pageFlow) {
    this._pageFlow = pageFlow;
  }
  
  @Extension
  private DataStore datastore = new Function0<DataStore>() {
    public DataStore apply() {
      DataStore _dataStore = new DataStore();
      return _dataStore;
    }
  }.apply();
  
  @Extension
  private Evaluation _evaluation = new Function0<Evaluation>() {
    public Evaluation apply() {
      Evaluation _evaluation = new Evaluation();
      return _evaluation;
    }
  }.apply();
  
  public void handle(final String target, final Request baseRequest, final HttpServletRequest request, final HttpServletResponse response) throws IOException, ServletException {
    FormState _formState = new FormState(request);
    final FormState formState = _formState;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(target,"/dispatch")) {
        _matched=true;
        IPageFlow _pageFlow = this.getPageFlow();
        String nextPage = _pageFlow.getNextPage(formState);
        boolean _equals = Objects.equal(nextPage, null);
        if (_equals) {
          this.datastore.store(formState);
          HttpSession _session = request.getSession();
          _session.invalidate();
          nextPage = "Thanks";
        }
        String _plus = (nextPage + ".html");
        response.sendRedirect(_plus);
        baseRequest.setHandled(true);
      }
    }
    if (!_matched) {
      if (Objects.equal(target,"/evaluate")) {
        _matched=true;
        this._evaluation.sendEvaluationPage(response, this.datastore);
        baseRequest.setHandled(true);
      }
    }
    if (!_matched) {
      if (Objects.equal(target,"/")) {
        _matched=true;
        IPageFlow _pageFlow_1 = this.getPageFlow();
        String _firstPage = _pageFlow_1.getFirstPage();
        String _plus_1 = (_firstPage + ".html");
        response.sendRedirect(_plus_1);
        baseRequest.setHandled(true);
      }
    }
  }
}
