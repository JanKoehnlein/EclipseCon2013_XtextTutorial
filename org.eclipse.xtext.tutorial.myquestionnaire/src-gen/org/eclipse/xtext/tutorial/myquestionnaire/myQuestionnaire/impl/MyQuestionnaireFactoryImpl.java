/**
 */
package org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyQuestionnaireFactoryImpl extends EFactoryImpl implements MyQuestionnaireFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyQuestionnaireFactory init()
  {
    try
    {
      MyQuestionnaireFactory theMyQuestionnaireFactory = (MyQuestionnaireFactory)EPackage.Registry.INSTANCE.getEFactory(MyQuestionnairePackage.eNS_URI);
      if (theMyQuestionnaireFactory != null)
      {
        return theMyQuestionnaireFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyQuestionnaireFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyQuestionnaireFactoryImpl()
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
      case MyQuestionnairePackage.QUESTIONNAIRE: return createQuestionnaire();
      case MyQuestionnairePackage.PAGE: return createPage();
      case MyQuestionnairePackage.QUESTION: return createQuestion();
      case MyQuestionnairePackage.FREE_TEXT_QUESTION: return createFreeTextQuestion();
      case MyQuestionnairePackage.CHOICE_QUESTION: return createChoiceQuestion();
      case MyQuestionnairePackage.CHOICE: return createChoice();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Questionnaire createQuestionnaire()
  {
    QuestionnaireImpl questionnaire = new QuestionnaireImpl();
    return questionnaire;
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
  public MyQuestionnairePackage getMyQuestionnairePackage()
  {
    return (MyQuestionnairePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyQuestionnairePackage getPackage()
  {
    return MyQuestionnairePackage.eINSTANCE;
  }

} //MyQuestionnaireFactoryImpl
