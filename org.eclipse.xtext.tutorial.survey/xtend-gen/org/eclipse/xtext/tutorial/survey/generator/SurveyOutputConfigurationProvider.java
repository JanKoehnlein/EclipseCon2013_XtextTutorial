package org.eclipse.xtext.tutorial.survey.generator;

import java.util.Set;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class SurveyOutputConfigurationProvider extends OutputConfigurationProvider {
  public final static String htmlOutputConfig = "html-gen";
  
  public Set<OutputConfiguration> getOutputConfigurations() {
    Set<OutputConfiguration> _xblockexpression = null;
    {
      final Set<OutputConfiguration> result = super.getOutputConfigurations();
      OutputConfiguration _outputConfiguration = new OutputConfiguration(SurveyOutputConfigurationProvider.htmlOutputConfig);
      final Procedure1<OutputConfiguration> _function = new Procedure1<OutputConfiguration>() {
          public void apply(final OutputConfiguration it) {
            it.setDescription("Generated HTML pages");
            it.setOutputDirectory("./html-gen");
            it.setOverrideExistingResources(true);
            it.setCreateOutputDirectory(true);
            it.setCleanUpDerivedResources(true);
            it.setSetDerivedProperty(true);
          }
        };
      OutputConfiguration _doubleArrow = ObjectExtensions.<OutputConfiguration>operator_doubleArrow(_outputConfiguration, _function);
      result.add(_doubleArrow);
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
}
