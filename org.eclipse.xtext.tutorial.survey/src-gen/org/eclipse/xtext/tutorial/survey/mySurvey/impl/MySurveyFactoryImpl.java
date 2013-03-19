/**
 */
package org.eclipse.xtext.tutorial.survey.mySurvey.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.tutorial.survey.mySurvey.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MySurveyFactoryImpl extends EFactoryImpl implements MySurveyFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MySurveyFactory init()
  {
    try
    {
      MySurveyFactory theMySurveyFactory = (MySurveyFactory)EPackage.Registry.INSTANCE.getEFactory(MySurveyPackage.eNS_URI);
      if (theMySurveyFactory != null)
      {
        return theMySurveyFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MySurveyFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MySurveyFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MySurveyPackage.SURVEY: return createSurvey();
      case MySurveyPackage.PAGE: return createPage();
      case MySurveyPackage.QUESTION: return createQuestion();
      case MySurveyPackage.FREE_TEXT_QUESTION: return createFreeTextQuestion();
      case MySurveyPackage.CHOICE_QUESTION: return createChoiceQuestion();
      case MySurveyPackage.CHOICE: return createChoice();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Survey createSurvey()
  {
    SurveyImpl survey = new SurveyImpl();
    return survey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page createPage()
  {
    PageImpl page = new PageImpl();
    return page;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Question createQuestion()
  {
    QuestionImpl question = new QuestionImpl();
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FreeTextQuestion createFreeTextQuestion()
  {
    FreeTextQuestionImpl freeTextQuestion = new FreeTextQuestionImpl();
    return freeTextQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChoiceQuestion createChoiceQuestion()
  {
    ChoiceQuestionImpl choiceQuestion = new ChoiceQuestionImpl();
    return choiceQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Choice createChoice()
  {
    ChoiceImpl choice = new ChoiceImpl();
    return choice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MySurveyPackage getMySurveyPackage()
  {
    return (MySurveyPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MySurveyPackage getPackage()
  {
    return MySurveyPackage.eINSTANCE;
  }

} //MySurveyFactoryImpl
