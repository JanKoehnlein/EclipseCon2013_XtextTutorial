/**
 */
package org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire;

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
 * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.MyQuestionnaireFactory
 * @model kind="package"
 * @generated
 */
public interface MyQuestionnairePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myQuestionnaire";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/xtext/tutorial/myquestionnaire/MyQuestionnaire";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myQuestionnaire";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyQuestionnairePackage eINSTANCE = org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.MyQuestionnairePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.QuestionnaireImpl
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.MyQuestionnairePackageImpl#getQuestionnaire()
   * @generated
   */
  int QUESTIONNAIRE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE__TITLE = 1;

  /**
   * The feature id for the '<em><b>Pages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE__PAGES = 2;

  /**
   * The number of structural features of the '<em>Questionnaire</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.PageImpl <em>Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.PageImpl
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.MyQuestionnairePackageImpl#getPage()
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
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.QuestionImpl <em>Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.QuestionImpl
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.MyQuestionnairePackageImpl#getQuestion()
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
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.FreeTextQuestionImpl <em>Free Text Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.FreeTextQuestionImpl
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.MyQuestionnairePackageImpl#getFreeTextQuestion()
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
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.ChoiceQuestionImpl <em>Choice Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.ChoiceQuestionImpl
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.MyQuestionnairePackageImpl#getChoiceQuestion()
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
   * The meta object id for the '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.ChoiceImpl <em>Choice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.ChoiceImpl
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.MyQuestionnairePackageImpl#getChoice()
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
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Questionnaire <em>Questionnaire</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Questionnaire</em>'.
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Questionnaire
   * @generated
   */
  EClass getQuestionnaire();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Questionnaire#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Questionnaire#getName()
   * @see #getQuestionnaire()
   * @generated
   */
  EAttribute getQuestionnaire_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Questionnaire#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Questionnaire#getTitle()
   * @see #getQuestionnaire()
   * @generated
   */
  EAttribute getQuestionnaire_Title();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Questionnaire#getPages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pages</em>'.
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Questionnaire#getPages()
   * @see #getQuestionnaire()
   * @generated
   */
  EReference getQuestionnaire_Pages();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page</em>'.
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Page
   * @generated
   */
  EClass getPage();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Page#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Page#getName()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Page#getQuestions <em>Questions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Questions</em>'.
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Page#getQuestions()
   * @see #getPage()
   * @generated
   */
  EReference getPage_Questions();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Page#getNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Next</em>'.
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Page#getNext()
   * @see #getPage()
   * @generated
   */
  EReference getPage_Next();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question</em>'.
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Question
   * @generated
   */
  EClass getQuestion();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Question#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Question#getName()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Question#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Question#getText()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Text();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.FreeTextQuestion <em>Free Text Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Free Text Question</em>'.
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.FreeTextQuestion
   * @generated
   */
  EClass getFreeTextQuestion();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.ChoiceQuestion <em>Choice Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choice Question</em>'.
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.ChoiceQuestion
   * @generated
   */
  EClass getChoiceQuestion();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.ChoiceQuestion#isSingle <em>Single</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Single</em>'.
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.ChoiceQuestion#isSingle()
   * @see #getChoiceQuestion()
   * @generated
   */
  EAttribute getChoiceQuestion_Single();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.ChoiceQuestion#getChoices <em>Choices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Choices</em>'.
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.ChoiceQuestion#getChoices()
   * @see #getChoiceQuestion()
   * @generated
   */
  EReference getChoiceQuestion_Choices();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Choice <em>Choice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choice</em>'.
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Choice
   * @generated
   */
  EClass getChoice();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Choice#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Choice#getName()
   * @see #getChoice()
   * @generated
   */
  EAttribute getChoice_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Choice#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Choice#getText()
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
  MyQuestionnaireFactory getMyQuestionnaireFactory();

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
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.QuestionnaireImpl
     * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.MyQuestionnairePackageImpl#getQuestionnaire()
     * @generated
     */
    EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTIONNAIRE__NAME = eINSTANCE.getQuestionnaire_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTIONNAIRE__TITLE = eINSTANCE.getQuestionnaire_Title();

    /**
     * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTIONNAIRE__PAGES = eINSTANCE.getQuestionnaire_Pages();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.PageImpl <em>Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.PageImpl
     * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.MyQuestionnairePackageImpl#getPage()
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
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.QuestionImpl <em>Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.QuestionImpl
     * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.MyQuestionnairePackageImpl#getQuestion()
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
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.FreeTextQuestionImpl <em>Free Text Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.FreeTextQuestionImpl
     * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.MyQuestionnairePackageImpl#getFreeTextQuestion()
     * @generated
     */
    EClass FREE_TEXT_QUESTION = eINSTANCE.getFreeTextQuestion();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.ChoiceQuestionImpl <em>Choice Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.ChoiceQuestionImpl
     * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.MyQuestionnairePackageImpl#getChoiceQuestion()
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
     * The meta object literal for the '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.ChoiceImpl <em>Choice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.ChoiceImpl
     * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.MyQuestionnairePackageImpl#getChoice()
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

} //MyQuestionnairePackage
