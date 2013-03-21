package org.xtext.tutorial.reference.servlet;

import com.google.common.io.CharStreams;
import com.google.common.io.OutputSupplier;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.tutorial.reference.server.SurveyServer;

@SuppressWarnings("all")
public class EndServlet extends HttpServlet {
  protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<title>EclipseCon 2013 Tutorial Survey</title>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<!-- Bootstrap -->");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" media=\"screen\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<style type=\"text/css\">");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append("body {");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("padding-top: 60px;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("padding-bottom: 40px;");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("</style>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<script src=\"http://code.jquery.com/jquery.js\"></script>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<script src=\"js/bootstrap.js\"></script>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.append("\t\t    \t    ");
    _builder.append("<table class=\"table table-condensed\">");
    _builder.newLine();
    _builder.append("\t\t    \t\t\t");
    _builder.append("<caption>These people completed the survey</caption>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t    ");
    _builder.append("<thead>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t    ");
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t    ");
    _builder.append("<th>Name</th>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t    ");
    _builder.append("<th>Gender</th>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t    ");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t    ");
    _builder.append("</thead>");
    _builder.newLine();
    _builder.append("\t\t\t\t    ");
    _builder.append("<tbody>");
    _builder.newLine();
    {
      DBCollection _collection = SurveyServer.getCollection();
      DBCursor _find = _collection.find();
      for(final DBObject current : _find) {
        _builder.append("\t\t\t\t    \t");
        _builder.append("<tr>");
        _builder.newLine();
        _builder.append("\t\t\t\t    \t");
        _builder.append("<td>");
        Object _get = current.get("name");
        _builder.append(_get, "				    	");
        _builder.append("</td>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t    \t");
        _builder.append("<td>");
        Object _get_1 = current.get("gender");
        _builder.append(_get_1, "				    	");
        _builder.append("</td>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t    \t");
        _builder.append("</tr>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t\t    \t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t    ");
    _builder.newLine();
    _builder.append("\t\t\t\t    ");
    _builder.append("</tbody>");
    _builder.newLine();
    _builder.append("\t\t\t\t    ");
    _builder.append("</table>");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</html>");
    final OutputSupplier<OutputStreamWriter> _function = new OutputSupplier<OutputStreamWriter>() {
        public OutputStreamWriter getOutput() throws IOException {
          ServletOutputStream _outputStream = resp.getOutputStream();
          OutputStreamWriter _outputStreamWriter = new OutputStreamWriter(_outputStream);
          return _outputStreamWriter;
        }
      };
    CharStreams.<OutputStreamWriter>write(_builder, _function);
  }
}