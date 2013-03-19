/**
 */
package org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.MyQuestionnairePackage
 * @generated
 */
public interface MyQuestionnaireFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyQuestionnaireFactory eINSTANCE = org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.impl.MyQuestionnaireFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Questionnaire</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Questionnaire</em>'.
   * @generated
   */
  Questionnaire createQuestionnaire();

  /**
   * Returns a new object of class '<em>Page</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Page</em>'.
   * @generated
   */
  Page createPage();

  /**
   * Returns a new object of class '<em>Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Question</em>'.
   * @generated
   */
  Question createQuestion();

  /**
   * Returns a new object of class '<em>Free Text Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Free Text Question</em>'.
   * @generated
   */
  FreeTextQuestion createFreeTextQuestion();

  /**
   * Returns a new object of class '<em>Choice Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Choice Question</em>'.
   * @generated
   */
  ChoiceQuestion createChoiceQuestion();

  /**
   * Returns a new object of class '<em>Choice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Choice</em>'.
   * @generated
   */
  Choice createChoice();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyQuestionnairePackage getMyQuestionnairePackage();

} //MyQuestionnaireFactory
