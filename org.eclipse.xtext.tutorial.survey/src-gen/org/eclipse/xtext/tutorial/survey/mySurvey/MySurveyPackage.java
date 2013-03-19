/**
 */
package org.eclipse.xtext.tutorial.survey.mySurvey;

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
 * @see org.eclipse.xtext.tutorial.survey.mySurvey.MySurveyFactory
 * @model kind="package"
 * @generated
 */
public interface MySurveyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mySurvey";

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
  String eNS_PREFIX = "mySurvey";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MySurveyPackage eINSTANCE = org.eclipse.xtext.tutorial.survey.mySurvey.impl.MySurveyPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.survey.mySurvey.impl.SurveyImpl <em>Survey</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.SurveyImpl
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.MySurveyPackageImpl#getSurvey()
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
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.survey.mySurvey.impl.PageImpl <em>Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.PageImpl
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.MySurveyPackageImpl#getPage()
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
   * The feature id for the '<em><b>Next</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__NEXT = 2;

  /**
   * The number of structural features of the '<em>Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.survey.mySurvey.impl.QuestionImpl <em>Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.QuestionImpl
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.MySurveyPackageImpl#getQuestion()
   * @generated
   */
  int QUESTION = 2;

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
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.survey.mySurvey.impl.FreeTextQuestionImpl <em>Free Text Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.FreeTextQuestionImpl
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.MySurveyPackageImpl#getFreeTextQuestion()
   * @generated
   */
  int FREE_TEXT_QUESTION = 3;

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
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.survey.mySurvey.impl.ChoiceQuestionImpl <em>Choice Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.ChoiceQuestionImpl
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.MySurveyPackageImpl#getChoiceQuestion()
   * @generated
   */
  int CHOICE_QUESTION = 4;

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
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.survey.mySurvey.impl.ChoiceImpl <em>Choice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.ChoiceImpl
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.MySurveyPackageImpl#getChoice()
   * @generated
   */
  int CHOICE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE__TEXT = 1;

  /**
   * The number of structural features of the '<em>Choice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.survey.mySurvey.Survey <em>Survey</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Survey</em>'.
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.Survey
   * @generated
   */
  EClass getSurvey();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.survey.mySurvey.Survey#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.Survey#getName()
   * @see #getSurvey()
   * @generated
   */
  EAttribute getSurvey_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.survey.mySurvey.Survey#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.Survey#getTitle()
   * @see #getSurvey()
   * @generated
   */
  EAttribute getSurvey_Title();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.tutorial.survey.mySurvey.Survey#getPages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pages</em>'.
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.Survey#getPages()
   * @see #getSurvey()
   * @generated
   */
  EReference getSurvey_Pages();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.survey.mySurvey.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page</em>'.
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.Page
   * @generated
   */
  EClass getPage();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.survey.mySurvey.Page#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.Page#getName()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.tutorial.survey.mySurvey.Page#getQuestions <em>Questions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Questions</em>'.
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.Page#getQuestions()
   * @see #getPage()
   * @generated
   */
  EReference getPage_Questions();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.tutorial.survey.mySurvey.Page#getNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Next</em>'.
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.Page#getNext()
   * @see #getPage()
   * @generated
   */
  EReference getPage_Next();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.survey.mySurvey.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question</em>'.
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.Question
   * @generated
   */
  EClass getQuestion();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.survey.mySurvey.Question#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.Question#getName()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.survey.mySurvey.Question#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.Question#getText()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Text();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.survey.mySurvey.FreeTextQuestion <em>Free Text Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Free Text Question</em>'.
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.FreeTextQuestion
   * @generated
   */
  EClass getFreeTextQuestion();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.survey.mySurvey.ChoiceQuestion <em>Choice Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choice Question</em>'.
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.ChoiceQuestion
   * @generated
   */
  EClass getChoiceQuestion();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.survey.mySurvey.ChoiceQuestion#isSingle <em>Single</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Single</em>'.
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.ChoiceQuestion#isSingle()
   * @see #getChoiceQuestion()
   * @generated
   */
  EAttribute getChoiceQuestion_Single();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.tutorial.survey.mySurvey.ChoiceQuestion#getChoices <em>Choices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Choices</em>'.
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.ChoiceQuestion#getChoices()
   * @see #getChoiceQuestion()
   * @generated
   */
  EReference getChoiceQuestion_Choices();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.survey.mySurvey.Choice <em>Choice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choice</em>'.
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.Choice
   * @generated
   */
  EClass getChoice();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.survey.mySurvey.Choice#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.Choice#getName()
   * @see #getChoice()
   * @generated
   */
  EAttribute getChoice_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.survey.mySurvey.Choice#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.eclipse.xtext.tutorial.survey.mySurvey.Choice#getText()
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
  MySurveyFactory getMySurveyFactory();

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
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.survey.mySurvey.impl.SurveyImpl <em>Survey</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.SurveyImpl
     * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.MySurveyPackageImpl#getSurvey()
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
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.survey.mySurvey.impl.PageImpl <em>Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.PageImpl
     * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.MySurveyPackageImpl#getPage()
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
     * The meta object literal for the '<em><b>Next</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__NEXT = eINSTANCE.getPage_Next();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.survey.mySurvey.impl.QuestionImpl <em>Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.QuestionImpl
     * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.MySurveyPackageImpl#getQuestion()
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
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.survey.mySurvey.impl.FreeTextQuestionImpl <em>Free Text Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.FreeTextQuestionImpl
     * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.MySurveyPackageImpl#getFreeTextQuestion()
     * @generated
     */
    EClass FREE_TEXT_QUESTION = eINSTANCE.getFreeTextQuestion();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.survey.mySurvey.impl.ChoiceQuestionImpl <em>Choice Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.ChoiceQuestionImpl
     * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.MySurveyPackageImpl#getChoiceQuestion()
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
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.survey.mySurvey.impl.ChoiceImpl <em>Choice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.ChoiceImpl
     * @see org.eclipse.xtext.tutorial.survey.mySurvey.impl.MySurveyPackageImpl#getChoice()
     * @generated
     */
    EClass CHOICE = eINSTANCE.getChoice();

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

} //MySurveyPackage
