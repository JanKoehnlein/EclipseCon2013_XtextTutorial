/**
 */
package org.eclipse.xtext.tutorial.survey.survey;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.tutorial.survey.survey.SurveyFactory
 * @model kind="package"
 * @generated
 */
public interface SurveyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "survey";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/xtext/tutorial/survey/Survey";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "survey";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SurveyPackage eINSTANCE = org.eclipse.xtext.tutorial.survey.survey.impl.SurveyPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.survey.survey.impl.SurveyImpl <em>Survey</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.survey.survey.impl.SurveyImpl
   * @see org.eclipse.xtext.tutorial.survey.survey.impl.SurveyPackageImpl#getSurvey()
   * @generated
   */
  int SURVEY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY__TITLE = 1;

  /**
   * The feature id for the '<em><b>Pages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY__PAGES = 2;

  /**
   * The number of structural features of the '<em>Survey</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.survey.survey.impl.PageImpl <em>Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.survey.survey.impl.PageImpl
   * @see org.eclipse.xtext.tutorial.survey.survey.impl.SurveyPackageImpl#getPage()
   * @generated
   */
  int PAGE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Questions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__QUESTIONS = 1;

  /**
   * The feature id for the '<em><b>Follow Ups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__FOLLOW_UPS = 2;

  /**
   * The number of structural features of the '<em>Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.survey.survey.impl.FollowUpImpl <em>Follow Up</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.survey.survey.impl.FollowUpImpl
   * @see org.eclipse.xtext.tutorial.survey.survey.impl.SurveyPackageImpl#getFollowUp()
   * @generated
   */
  int FOLLOW_UP = 2;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLLOW_UP__GUARD = 0;

  /**
   * The feature id for the '<em><b>Next</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLLOW_UP__NEXT = 1;

  /**
   * The number of structural features of the '<em>Follow Up</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLLOW_UP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.survey.survey.impl.GuardImpl <em>Guard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.survey.survey.impl.GuardImpl
   * @see org.eclipse.xtext.tutorial.survey.survey.impl.SurveyPackageImpl#getGuard()
   * @generated
   */
  int GUARD = 3;

  /**
   * The feature id for the '<em><b>Question</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__QUESTION = 0;

  /**
   * The feature id for the '<em><b>Answer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__ANSWER = 1;

  /**
   * The number of structural features of the '<em>Guard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.survey.survey.impl.QuestionImpl <em>Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.survey.survey.impl.QuestionImpl
   * @see org.eclipse.xtext.tutorial.survey.survey.impl.SurveyPackageImpl#getQuestion()
   * @generated
   */
  int QUESTION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__TEXT = 1;

  /**
   * The number of structural features of the '<em>Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.survey.survey.impl.FreeTextQuestionImpl <em>Free Text Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.survey.survey.impl.FreeTextQuestionImpl
   * @see org.eclipse.xtext.tutorial.survey.survey.impl.SurveyPackageImpl#getFreeTextQuestion()
   * @generated
   */
  int FREE_TEXT_QUESTION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_TEXT_QUESTION__NAME = QUESTION__NAME;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_TEXT_QUESTION__TEXT = QUESTION__TEXT;

  /**
   * The number of structural features of the '<em>Free Text Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_TEXT_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.survey.survey.impl.ChoiceQuestionImpl <em>Choice Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.survey.survey.impl.ChoiceQuestionImpl
   * @see org.eclipse.xtext.tutorial.survey.survey.impl.SurveyPackageImpl#getChoiceQuestion()
   * @generated
   */
  int CHOICE_QUESTION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_QUESTION__NAME = QUESTION__NAME;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_QUESTION__TEXT = QUESTION__TEXT;

  /**
   * The feature id for the '<em><b>Single</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_QUESTION__SINGLE = QUESTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Choices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_QUESTION__CHOICES = QUESTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Choice Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.survey.survey.impl.ChoiceImpl <em>Choice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.survey.survey.impl.ChoiceImpl
   * @see org.eclipse.xtext.tutorial.survey.survey.impl.SurveyPackageImpl#getChoice()
   * @generated
   */
  int CHOICE = 7;

  /**
   * The feature id for the '<em><b>Freetext</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE__FREETEXT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE__NAME = 1;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE__TEXT = 2;

  /**
   * The number of structural features of the '<em>Choice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.survey.survey.Survey <em>Survey</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Survey</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.Survey
   * @generated
   */
  EClass getSurvey();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.survey.survey.Survey#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.Survey#getName()
   * @see #getSurvey()
   * @generated
   */
  EAttribute getSurvey_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.survey.survey.Survey#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.Survey#getTitle()
   * @see #getSurvey()
   * @generated
   */
  EAttribute getSurvey_Title();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.tutorial.survey.survey.Survey#getPages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pages</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.Survey#getPages()
   * @see #getSurvey()
   * @generated
   */
  EReference getSurvey_Pages();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.survey.survey.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.Page
   * @generated
   */
  EClass getPage();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.survey.survey.Page#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.Page#getName()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.tutorial.survey.survey.Page#getQuestions <em>Questions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Questions</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.Page#getQuestions()
   * @see #getPage()
   * @generated
   */
  EReference getPage_Questions();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.tutorial.survey.survey.Page#getFollowUps <em>Follow Ups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Follow Ups</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.Page#getFollowUps()
   * @see #getPage()
   * @generated
   */
  EReference getPage_FollowUps();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.survey.survey.FollowUp <em>Follow Up</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Follow Up</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.FollowUp
   * @generated
   */
  EClass getFollowUp();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.tutorial.survey.survey.FollowUp#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.FollowUp#getGuard()
   * @see #getFollowUp()
   * @generated
   */
  EReference getFollowUp_Guard();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.tutorial.survey.survey.FollowUp#getNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Next</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.FollowUp#getNext()
   * @see #getFollowUp()
   * @generated
   */
  EReference getFollowUp_Next();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.survey.survey.Guard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guard</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.Guard
   * @generated
   */
  EClass getGuard();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.tutorial.survey.survey.Guard#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Question</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.Guard#getQuestion()
   * @see #getGuard()
   * @generated
   */
  EReference getGuard_Question();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.tutorial.survey.survey.Guard#getAnswer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Answer</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.Guard#getAnswer()
   * @see #getGuard()
   * @generated
   */
  EReference getGuard_Answer();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.survey.survey.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.Question
   * @generated
   */
  EClass getQuestion();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.survey.survey.Question#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.Question#getName()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.survey.survey.Question#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.Question#getText()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Text();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.survey.survey.FreeTextQuestion <em>Free Text Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Free Text Question</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.FreeTextQuestion
   * @generated
   */
  EClass getFreeTextQuestion();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.survey.survey.ChoiceQuestion <em>Choice Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choice Question</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.ChoiceQuestion
   * @generated
   */
  EClass getChoiceQuestion();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.survey.survey.ChoiceQuestion#isSingle <em>Single</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Single</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.ChoiceQuestion#isSingle()
   * @see #getChoiceQuestion()
   * @generated
   */
  EAttribute getChoiceQuestion_Single();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.tutorial.survey.survey.ChoiceQuestion#getChoices <em>Choices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Choices</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.ChoiceQuestion#getChoices()
   * @see #getChoiceQuestion()
   * @generated
   */
  EReference getChoiceQuestion_Choices();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.survey.survey.Choice <em>Choice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choice</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.Choice
   * @generated
   */
  EClass getChoice();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.survey.survey.Choice#isFreetext <em>Freetext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Freetext</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.Choice#isFreetext()
   * @see #getChoice()
   * @generated
   */
  EAttribute getChoice_Freetext();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.survey.survey.Choice#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.Choice#getName()
   * @see #getChoice()
   * @generated
   */
  EAttribute getChoice_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.survey.survey.Choice#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.eclipse.xtext.tutorial.survey.survey.Choice#getText()
   * @see #getChoice()
   * @generated
   */
  EAttribute getChoice_Text();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SurveyFactory getSurveyFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.survey.survey.impl.SurveyImpl <em>Survey</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.survey.survey.impl.SurveyImpl
     * @see org.eclipse.xtext.tutorial.survey.survey.impl.SurveyPackageImpl#getSurvey()
     * @generated
     */
    EClass SURVEY = eINSTANCE.getSurvey();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SURVEY__NAME = eINSTANCE.getSurvey_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SURVEY__TITLE = eINSTANCE.getSurvey_Title();

    /**
     * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SURVEY__PAGES = eINSTANCE.getSurvey_Pages();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.survey.survey.impl.PageImpl <em>Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.survey.survey.impl.PageImpl
     * @see org.eclipse.xtext.tutorial.survey.survey.impl.SurveyPackageImpl#getPage()
     * @generated
     */
    EClass PAGE = eINSTANCE.getPage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

    /**
     * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__QUESTIONS = eINSTANCE.getPage_Questions();

    /**
     * The meta object literal for the '<em><b>Follow Ups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__FOLLOW_UPS = eINSTANCE.getPage_FollowUps();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.survey.survey.impl.FollowUpImpl <em>Follow Up</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.survey.survey.impl.FollowUpImpl
     * @see org.eclipse.xtext.tutorial.survey.survey.impl.SurveyPackageImpl#getFollowUp()
     * @generated
     */
    EClass FOLLOW_UP = eINSTANCE.getFollowUp();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOLLOW_UP__GUARD = eINSTANCE.getFollowUp_Guard();

    /**
     * The meta object literal for the '<em><b>Next</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOLLOW_UP__NEXT = eINSTANCE.getFollowUp_Next();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.survey.survey.impl.GuardImpl <em>Guard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.survey.survey.impl.GuardImpl
     * @see org.eclipse.xtext.tutorial.survey.survey.impl.SurveyPackageImpl#getGuard()
     * @generated
     */
    EClass GUARD = eINSTANCE.getGuard();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUARD__QUESTION = eINSTANCE.getGuard_Question();

    /**
     * The meta object literal for the '<em><b>Answer</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUARD__ANSWER = eINSTANCE.getGuard_Answer();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.survey.survey.impl.QuestionImpl <em>Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.survey.survey.impl.QuestionImpl
     * @see org.eclipse.xtext.tutorial.survey.survey.impl.SurveyPackageImpl#getQuestion()
     * @generated
     */
    EClass QUESTION = eINSTANCE.getQuestion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__NAME = eINSTANCE.getQuestion_Name();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__TEXT = eINSTANCE.getQuestion_Text();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.survey.survey.impl.FreeTextQuestionImpl <em>Free Text Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.survey.survey.impl.FreeTextQuestionImpl
     * @see org.eclipse.xtext.tutorial.survey.survey.impl.SurveyPackageImpl#getFreeTextQuestion()
     * @generated
     */
    EClass FREE_TEXT_QUESTION = eINSTANCE.getFreeTextQuestion();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.survey.survey.impl.ChoiceQuestionImpl <em>Choice Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.survey.survey.impl.ChoiceQuestionImpl
     * @see org.eclipse.xtext.tutorial.survey.survey.impl.SurveyPackageImpl#getChoiceQuestion()
     * @generated
     */
    EClass CHOICE_QUESTION = eINSTANCE.getChoiceQuestion();

    /**
     * The meta object literal for the '<em><b>Single</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHOICE_QUESTION__SINGLE = eINSTANCE.getChoiceQuestion_Single();

    /**
     * The meta object literal for the '<em><b>Choices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHOICE_QUESTION__CHOICES = eINSTANCE.getChoiceQuestion_Choices();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.survey.survey.impl.ChoiceImpl <em>Choice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.survey.survey.impl.ChoiceImpl
     * @see org.eclipse.xtext.tutorial.survey.survey.impl.SurveyPackageImpl#getChoice()
     * @generated
     */
    EClass CHOICE = eINSTANCE.getChoice();

    /**
     * The meta object literal for the '<em><b>Freetext</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHOICE__FREETEXT = eINSTANCE.getChoice_Freetext();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHOICE__NAME = eINSTANCE.getChoice_Name();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHOICE__TEXT = eINSTANCE.getChoice_Text();

  }

} //SurveyPackage
