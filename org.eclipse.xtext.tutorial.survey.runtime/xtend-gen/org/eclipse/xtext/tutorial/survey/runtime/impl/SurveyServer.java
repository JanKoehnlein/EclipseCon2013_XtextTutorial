package org.eclipse.xtext.tutorial.survey.runtime.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.server.session.SessionHandler;
import org.eclipse.xtext.tutorial.survey.runtime.IPageFlow;
import org.eclipse.xtext.tutorial.survey.runtime.impl.SurveyHandler;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class SurveyServer {
  private int _port;
  
  public int getPort() {
    return this._port;
  }
  
  public void setPort(final int port) {
    this._port = port;
  }
  
  private IPageFlow _pageFlow;
  
  public IPageFlow getPageFlow() {
    return this._pageFlow;
  }
  
  public void setPageFlow(final IPageFlow pageFlow) {
    this._pageFlow = pageFlow;
  }
  
  private List<String> webroots = new Function0<List<String>>() {
    public List<String> apply() {
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList();
      return _newArrayList;
    }
  }.apply();
  
  public boolean addWebroot(final String folder) {
    boolean _add = this.webroots.add(folder);
    return _add;
  }
  
  public void start() {
    Server _server = new Server(8080);
    final Procedure1<Server> _function = new Procedure1<Server>() {
      public void apply(final Server it) {
        try {
          HandlerList _handlerList = new HandlerList();
          final HandlerList handlerList = _handlerList;
          SessionHandler _sessionHandler = new SessionHandler();
          handlerList.addHandler(_sessionHandler);
          SurveyHandler _surveyHandler = new SurveyHandler();
          final Procedure1<SurveyHandler> _function = new Procedure1<SurveyHandler>() {
            public void apply(final SurveyHandler it) {
              IPageFlow _pageFlow = SurveyServer.this.getPageFlow();
              it.setPageFlow(_pageFlow);
            }
          };
          SurveyHandler _doubleArrow = ObjectExtensions.<SurveyHandler>operator_doubleArrow(_surveyHandler, _function);
          handlerList.addHandler(_doubleArrow);
          for (final String webroot : SurveyServer.this.webroots) {
            ResourceHandler _resourceHandler = new ResourceHandler();
            final Procedure1<ResourceHandler> _function_1 = new Procedure1<ResourceHandler>() {
              public void apply(final ResourceHandler it) {
                it.setResourceBase(webroot);
              }
            };
            ResourceHandler _doubleArrow_1 = ObjectExtensions.<ResourceHandler>operator_doubleArrow(_resourceHandler, _function_1);
            handlerList.addHandler(_doubleArrow_1);
          }
          it.setHandler(handlerList);
          it.start();
          it.join();
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      }
    };
    ObjectExtensions.<Server>operator_doubleArrow(_server, _function);
  }
  
  protected ResourceHandler getResourceHandler() {
    ResourceHandler _resourceHandler = new ResourceHandler();
    final Procedure1<ResourceHandler> _function = new Procedure1<ResourceHandler>() {
      public void apply(final ResourceHandler it) {
        try {
          File _file = new File(".");
          final String current = _file.getCanonicalPath();
          String _plus = (current + "/webroot/");
          it.setResourceBase(_plus);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      }
    };
    ResourceHandler _doubleArrow = ObjectExtensions.<ResourceHandler>operator_doubleArrow(_resourceHandler, _function);
    return _doubleArrow;
  }
}
