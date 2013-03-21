package org.eclipse.xtext.tutorial.survey.runtime.impl;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.tutorial.survey.runtime.impl.DataStore;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Evaluation {
  public void sendEvaluationPage(final HttpServletResponse response, final DataStore datastore) {
    try {
      PrintWriter _writer = response.getWriter();
      CharSequence _html = this.getHtml(datastore);
      _writer.println(_html);
      response.setContentType("text/html;charset=utf-8");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected CharSequence getHtml(@Extension final DataStore dataStore) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<title>EclipseCon 2013 Tutorial Survey</title>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- Bootstrap -->");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" media=\"screen\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<link href=\"css/survey.css\" rel=\"stylesheet\" media=\"screen\">");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<script src=\"http://code.jquery.com/jquery.js\"></script>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<script src=\"js/bootstrap.js\"></script>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"navbar\">");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("<div class=\"navbar-inner\">");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("<a class=\"brand\" href=\"/\">EclipseCon 2013 Tutorial Survey</a>");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("<ul class=\"nav pull-right\">");
    _builder.newLine();
    _builder.append("    \t\t\t");
    _builder.append("<li class=\"active\"><a href=\"/evaluate\">Evaluate</a></li>");
    _builder.newLine();
    _builder.append("    \t\t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h1>Evaluation</h1>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<table class=\"table table-striped table-bordered table-condensed\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    final int participants = dataStore.getEntryCount();
    _builder.newLineIfNotEmpty();
    {
      LinkedHashSet<String> _keys = dataStore.getKeys();
      List<String> _sort = IterableExtensions.<String>sort(_keys);
      for(final String key : _sort) {
        _builder.append("\t\t\t");
        final HashMap<String,Integer> valueCounts = dataStore.getValueCounts(key);
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("<tr>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("<th colspan=\"2\">");
        _builder.append(key, "				");
        _builder.append("</th>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("<tr>");
        _builder.newLine();
        {
          Set<Entry<String,Integer>> _entrySet = valueCounts.entrySet();
          final Function1<Entry<String,Integer>,Integer> _function = new Function1<Entry<String,Integer>,Integer>() {
              public Integer apply(final Entry<String,Integer> it) {
                Integer _value = it.getValue();
                int _minus = (-(_value).intValue());
                return Integer.valueOf(_minus);
              }
            };
          List<Entry<String,Integer>> _sortBy = IterableExtensions.<Entry<String,Integer>, Integer>sortBy(_entrySet, _function);
          for(final Entry<String,Integer> entry : _sortBy) {
            _builder.append("\t\t\t");
            _builder.append("<tr>");
            _builder.newLine();
            _builder.append("\t\t\t");
            _builder.append("\t");
            _builder.append("<td>");
            String _key = entry.getKey();
            _builder.append(_key, "				");
            _builder.append("</td>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("\t");
            _builder.append("<td>");
            Integer _value = entry.getValue();
            double _multiply = (100.0 * (_value).intValue());
            double _divide = (_multiply / participants);
            String _format = String.format(Locale.US, "%.1f", Double.valueOf(_divide));
            _builder.append(_format, "				");
            _builder.append("%</td>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("</tr>");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("</table>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    return _builder;
  }
}
