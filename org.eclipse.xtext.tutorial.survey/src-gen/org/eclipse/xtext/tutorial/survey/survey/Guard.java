/**
 */
package org.eclipse.xtext.tutorial.survey.survey;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.tutorial.survey.survey.Guard#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.eclipse.xtext.tutorial.survey.survey.Guard#getAnswer <em>Answer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.tutorial.survey.survey.SurveyPackage#getGuard()
 * @model
 * @generated
 */
public interface Guard extends EObject
{
  /**
   * Returns the value of the '<em><b>Question</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Question</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Question</em>' reference.
   * @see #setQuestion(ChoiceQuestion)
   * @see org.eclipse.xtext.tutorial.survey.survey.SurveyPackage#getGuard_Question()
   * @model
   * @generated
   */
  ChoiceQuestion getQuestion();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.tutorial.survey.survey.Guard#getQuestion <em>Question</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question</em>' reference.
   * @see #getQuestion()
   * @generated
   */
  void setQuestion(ChoiceQuestion value);

  /**
   * Returns the value of the '<em><b>Answer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Answer</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Answer</em>' reference.
   * @see #setAnswer(Choice)
   * @see org.eclipse.xtext.tutorial.survey.survey.SurveyPackage#getGuard_Answer()
   * @model
   * @generated
   */
  Choice getAnswer();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.tutorial.survey.survey.Guard#getAnswer <em>Answer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Answer</em>' reference.
   * @see #getAnswer()
   * @generated
   */
  void setAnswer(Choice value);

} // Guard
