package org.eclipse.xtext.tutorial.survey.runtime.impl;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.eclipse.xtext.tutorial.survey.runtime.IFormState;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

@SuppressWarnings("all")
public class FormState implements IFormState {
  private final static String pageAttribute = "page";
  
  private final static String surveyAttribute = "survey";
  
  private final static Set<String> transientAttribtutes = new Function0<Set<String>>() {
    public Set<String> apply() {
      Set<String> _xsetliteral = null;
      Builder<String> _builder = ImmutableSet.builder();
      _builder.add(FormState.pageAttribute);
      _builder.add(FormState.surveyAttribute);
      _xsetliteral = _builder.build();
      return _xsetliteral;
    }
  }.apply();
  
  private HttpServletRequest request;
  
  public FormState(final HttpServletRequest request) {
    this.request = request;
    this.copyValuesToSession(request);
  }
  
  public List<String> getFields() {
    ArrayList<String> _xblockexpression = null;
    {
      final ArrayList<String> result = CollectionLiterals.<String>newArrayList();
      HttpSession _session = this.request.getSession();
      final Enumeration<String> attributeNames = _session.getAttributeNames();
      boolean _hasMoreElements = attributeNames.hasMoreElements();
      boolean _while = _hasMoreElements;
      while (_while) {
        String _nextElement = attributeNames.nextElement();
        result.add(_nextElement);
        boolean _hasMoreElements_1 = attributeNames.hasMoreElements();
        _while = _hasMoreElements_1;
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  public Object getValue(final String field) {
    Object _elvis = null;
    HttpSession _session = this.request.getSession();
    Object _attribute = _session.getAttribute(field);
    if (_attribute != null) {
      _elvis = _attribute;
    } else {
      HttpSession _session_1 = this.request.getSession();
      String _currentPage = this.getCurrentPage();
      String _plus = (_currentPage + ".");
      String _plus_1 = (_plus + field);
      Object _attribute_1 = _session_1.getAttribute(_plus_1);
      _elvis = ObjectExtensions.<Object>operator_elvis(_attribute, _attribute_1);
    }
    return _elvis;
  }
  
  public boolean isSet(final String field, final String value) {
    boolean _switchResult = false;
    Object _value = this.getValue(field);
    final Object v = _value;
    boolean _matched = false;
    if (!_matched) {
      if (v instanceof List) {
        final List<?> _list = (List<?>)v;
        _matched=true;
        boolean _contains = _list.contains(value);
        _switchResult = _contains;
      }
    }
    if (!_matched) {
      boolean _equals = Objects.equal(v, value);
      _switchResult = _equals;
    }
    return _switchResult;
  }
  
  public String getCurrentPage() {
    String _parameter = this.request.getParameter(FormState.pageAttribute);
    String _string = _parameter==null?(String)null:_parameter.toString();
    return _string;
  }
  
  protected void copyValuesToSession(final HttpServletRequest request) {
    String _currentPage = this.getCurrentPage();
    final String prefix = (_currentPage + ".");
    Map<String,String[]> _parameterMap = request.getParameterMap();
    Set<Entry<String,String[]>> _entrySet = _parameterMap.entrySet();
    for (final Entry<String,String[]> entry : _entrySet) {
      String _key = entry.getKey();
      boolean _contains = FormState.transientAttribtutes.contains(_key);
      boolean _not = (!_contains);
      if (_not) {
        String[] _value = entry.getValue();
        boolean _notEquals = (!Objects.equal(_value, null));
        if (_notEquals) {
          String[] _value_1 = entry.getValue();
          int _length = _value_1.length;
          boolean _equals = (_length == 1);
          if (_equals) {
            HttpSession _session = request.getSession();
            String _key_1 = entry.getKey();
            String _plus = (prefix + _key_1);
            String[] _value_2 = entry.getValue();
            String _get = _value_2[0];
            _session.setAttribute(_plus, _get);
          } else {
            HttpSession _session_1 = request.getSession();
            String _key_2 = entry.getKey();
            String _plus_1 = (prefix + _key_2);
            String[] _value_3 = entry.getValue();
            ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_value_3);
            _session_1.setAttribute(_plus_1, _newArrayList);
          }
        }
      }
    }
  }
}
