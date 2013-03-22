/**
 * generated by Xtext
 */
package org.eclipse.xtext.tutorial.survey.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.tutorial.survey.generator.SurveyOutputConfigurationProvider;
import org.eclipse.xtext.tutorial.survey.survey.Choice;
import org.eclipse.xtext.tutorial.survey.survey.ChoiceQuestion;
import org.eclipse.xtext.tutorial.survey.survey.FollowUp;
import org.eclipse.xtext.tutorial.survey.survey.FreeTextQuestion;
import org.eclipse.xtext.tutorial.survey.survey.Guard;
import org.eclipse.xtext.tutorial.survey.survey.Page;
import org.eclipse.xtext.tutorial.survey.survey.Question;
import org.eclipse.xtext.tutorial.survey.survey.Survey;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class SurveyGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Page> _filter = Iterators.<Page>filter(_allContents, Page.class);
    final Procedure1<Page> _function = new Procedure1<Page>() {
        public void apply(final Page it) {
          String _name = it.getName();
          String _plus = (_name + ".html");
          CharSequence _html = SurveyGenerator.this.toHtml(it);
          fsa.generateFile(_plus, SurveyOutputConfigurationProvider.htmlOutputConfig, _html);
        }
      };
    IteratorExtensions.<Page>forEach(_filter, _function);
    EList<EObject> _contents = resource.getContents();
    Iterable<Survey> _filter_1 = Iterables.<Survey>filter(_contents, Survey.class);
    final Survey survey = IterableExtensions.<Survey>head(_filter_1);
    boolean _notEquals = (!Objects.equal(survey, null));
    if (_notEquals) {
      CharSequence _pageFlow = this.toPageFlow(survey);
      fsa.generateFile("main/PageFlow.java", _pageFlow);
    }
    CharSequence _genrateStartServer = this.genrateStartServer();
    fsa.generateFile("main/StartServer.java", _genrateStartServer);
  }
  
  protected CharSequence toHtml(final Page it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<title>");
    Survey _survey = this.getSurvey(it);
    String _title = _survey.getTitle();
    _builder.append(_title, "	");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
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
    _builder.append("\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script src=\"http://code.jquery.com/jquery.js\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script src=\"js/bootstrap.js\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"navbar\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<div class=\"navbar-inner\">");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<a class=\"brand\" href=\"/\">");
    Survey _survey_1 = this.getSurvey(it);
    String _title_1 = _survey_1.getTitle();
    _builder.append(_title_1, "					");
    _builder.append("</a>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t");
    _builder.append("<ul class=\"nav pull-right\">");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<li><a href=\"/evaluate\">Evaluate</a></li>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<form class=\"form-horizontal\" method=\"POST\" action=\"dispatch\" class=\"form-horizontal\">");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<input name=\"survey\" type=\"hidden\" value=\"");
    Survey _survey_2 = this.getSurvey(it);
    String _name = _survey_2.getName();
    _builder.append(_name, "					");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t");
    _builder.append("<input name=\"page\" type=\"hidden\" value=\"");
    String _name_1 = it.getName();
    _builder.append(_name_1, "					");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    {
      EList<Question> _questions = it.getQuestions();
      for(final Question question : _questions) {
        _builder.append("\t\t\t\t\t");
        CharSequence _controlGroup = this.controlGroup(question);
        _builder.append(_controlGroup, "					");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<div class=\"control-group\">");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<div class=\"controls\">");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<input type=\"reset\" class=\"btn\" value=\"Reset\">");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<input type=\"submit\" class=\"btn\" value=\"Next\">");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</form>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _controlGroup(final FreeTextQuestion it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"control-group\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<label class=\"control-label\">");
    String _text = it.getText();
    _builder.append(_text, "	");
    _builder.append("</label>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<div class=\"controls\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<input type=\"text\" name=\"");
    String _name = it.getName();
    _builder.append(_name, "		");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _controlGroup(final ChoiceQuestion it) {
    CharSequence _xblockexpression = null;
    {
      String _xifexpression = null;
      boolean _isSingle = it.isSingle();
      if (_isSingle) {
        _xifexpression = "radio";
      } else {
        _xifexpression = "checkbox";
      }
      final String buttonType = _xifexpression;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div class=\"control-group\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<label class=\"control-label\">");
      String _text = it.getText();
      _builder.append(_text, "	");
      _builder.append("</label>");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("<div class=\"controls\">");
      _builder.newLine();
      {
        EList<Choice> _choices = it.getChoices();
        int _size = _choices.size();
        boolean _greaterThan = (_size > 30);
        if (_greaterThan) {
          _builder.append("\t\t\t");
          _builder.append("<select name=\"");
          String _name = it.getName();
          _builder.append(_name, "			");
          _builder.append("\" ");
          {
            boolean _isSingle_1 = it.isSingle();
            boolean _not = (!_isSingle_1);
            if (_not) {
              _builder.append("multiple=\"multiple\"");
            }
          }
          _builder.append(">");
          _builder.newLineIfNotEmpty();
          {
            EList<Choice> _choices_1 = it.getChoices();
            for(final Choice choice : _choices_1) {
              _builder.append("\t\t\t");
              _builder.append("\t");
              _builder.append("<option value=\"");
              String _nameNotNull = this.getNameNotNull(choice);
              _builder.append(_nameNotNull, "				");
              _builder.append("\">");
              String _text_1 = choice.getText();
              _builder.append(_text_1, "				");
              _builder.append("</option>");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t\t\t");
          _builder.append("</select>");
          _builder.newLine();
        } else {
          {
            EList<Choice> _choices_2 = it.getChoices();
            for(final Choice choice_1 : _choices_2) {
              _builder.append("\t\t\t");
              _builder.append("<label class=\"");
              _builder.append(buttonType, "			");
              _builder.append("\">");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t\t");
              _builder.append("\t");
              _builder.append("<input type=\"");
              _builder.append(buttonType, "				");
              _builder.append("\" name=\"");
              String _name_1 = it.getName();
              _builder.append(_name_1, "				");
              _builder.append("\" value=\"");
              String _nameNotNull_1 = this.getNameNotNull(choice_1);
              _builder.append(_nameNotNull_1, "				");
              _builder.append("\"/>");
              String _text_2 = choice_1.getText();
              _builder.append(_text_2, "				");
              _builder.newLineIfNotEmpty();
              {
                boolean _isFreetext = choice_1.isFreetext();
                if (_isFreetext) {
                  _builder.append("\t\t\t");
                  _builder.append("\t");
                  _builder.append("&nbsp;<input type=\"text\" name=\"");
                  String _name_2 = it.getName();
                  _builder.append(_name_2, "				");
                  _builder.append("\">");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t\t\t");
              _builder.append("</label>");
              _builder.newLine();
            }
          }
        }
      }
      _builder.append("\t");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("</div>");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected String getNameNotNull(final Choice choice) {
    String _elvis = null;
    String _name = choice.getName();
    if (_name != null) {
      _elvis = _name;
    } else {
      EObject _eContainer = choice.eContainer();
      EList<Choice> _choices = ((ChoiceQuestion) _eContainer).getChoices();
      int _indexOf = _choices.indexOf(choice);
      String _plus = ("answer_" + Integer.valueOf(_indexOf));
      _elvis = ObjectExtensions.<String>operator_elvis(_name, _plus);
    }
    return _elvis;
  }
  
  protected Survey getSurvey(final Page it) {
    EObject _eContainer = it.eContainer();
    return ((Survey) _eContainer);
  }
  
  public CharSequence toPageFlow(final Survey it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package main;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.tutorial.survey.runtime.IFormState;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.tutorial.survey.runtime.IPageFlow;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class PageFlow implements IPageFlow {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String getFirstPage() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return \"");
    EList<Page> _pages = it.getPages();
    Page _head = IterableExtensions.<Page>head(_pages);
    String _name = _head.getName();
    _builder.append(_name, "		");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String getNextPage(IFormState formState) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String currentPage = formState.getCurrentPage();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(currentPage == null)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return getFirstPage();");
    _builder.newLine();
    {
      EList<Page> _pages_1 = it.getPages();
      final Function1<Page,Boolean> _function = new Function1<Page,Boolean>() {
          public Boolean apply(final Page it) {
            EList<FollowUp> _followUps = it.getFollowUps();
            boolean _isEmpty = _followUps.isEmpty();
            boolean _not = (!_isEmpty);
            return Boolean.valueOf(_not);
          }
        };
      Iterable<Page> _filter = IterableExtensions.<Page>filter(_pages_1, _function);
      for(final Page page : _filter) {
        _builder.append("\t\t");
        _builder.append("if(\"");
        String _name_1 = page.getName();
        _builder.append(_name_1, "		");
        _builder.append("\".equals(currentPage)) {");
        _builder.newLineIfNotEmpty();
        {
          EList<FollowUp> _followUps = page.getFollowUps();
          for(final FollowUp followUp : _followUps) {
            {
              Guard _guard = followUp.getGuard();
              boolean _notEquals = (!Objects.equal(_guard, null));
              if (_notEquals) {
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("if(\"");
                Guard _guard_1 = followUp.getGuard();
                Choice _answer = _guard_1.getAnswer();
                String _name_2 = _answer.getName();
                _builder.append(_name_2, "			");
                _builder.append("\".equals(formState.getValue(\"");
                Guard _guard_2 = followUp.getGuard();
                ChoiceQuestion _question = _guard_2.getQuestion();
                String _name_3 = _question.getName();
                _builder.append(_name_3, "			");
                _builder.append("\"))) {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("return \"");
                Page _next = followUp.getNext();
                String _name_4 = _next.getName();
                _builder.append(_name_4, "				");
                _builder.append("\";");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
              } else {
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("return \"");
                Page _next_1 = followUp.getNext();
                String _name_5 = _next_1.getName();
                _builder.append(_name_5, "			");
                _builder.append("\";");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genrateStartServer() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package main;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.tutorial.survey.runtime.impl.SurveyServer;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class StartServer {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(final String... args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("SurveyServer surveyServer = new SurveyServer();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("surveyServer.setPort(8080);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("surveyServer.setPageFlow(new PageFlow());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("surveyServer.addWebroot(\"./html-gen\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("surveyServer.addWebroot(\"../org.eclipse.xtext.tutorial.survey.runtime/webroot\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("surveyServer.start();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence controlGroup(final Question it) {
    if (it instanceof ChoiceQuestion) {
      return _controlGroup((ChoiceQuestion)it);
    } else if (it instanceof FreeTextQuestion) {
      return _controlGroup((FreeTextQuestion)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
