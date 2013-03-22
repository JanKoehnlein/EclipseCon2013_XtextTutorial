/**
 */
package org.eclipse.xtext.tutorial.survey.survey;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.tutorial.survey.survey.ChoiceQuestion#isSingle <em>Single</em>}</li>
 *   <li>{@link org.eclipse.xtext.tutorial.survey.survey.ChoiceQuestion#getChoices <em>Choices</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.tutorial.survey.survey.SurveyPackage#getChoiceQuestion()
 * @model
 * @generated
 */
public interface ChoiceQuestion extends Question
{
  /**
   * Returns the value of the '<em><b>Single</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Single</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Single</em>' attribute.
   * @see #setSingle(boolean)
   * @see org.eclipse.xtext.tutorial.survey.survey.SurveyPackage#getChoiceQuestion_Single()
   * @model
   * @generated
   */
  boolean isSingle();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.tutorial.survey.survey.ChoiceQuestion#isSingle <em>Single</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Single</em>' attribute.
   * @see #isSingle()
   * @generated
   */
  void setSingle(boolean value);

  /**
   * Returns the value of the '<em><b>Choices</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.tutorial.survey.survey.Choice}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Choices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choices</em>' containment reference list.
   * @see org.eclipse.xtext.tutorial.survey.survey.SurveyPackage#getChoiceQuestion_Choices()
   * @model containment="true"
   * @generated
   */
  EList<Choice> getChoices();

} // ChoiceQuestion
