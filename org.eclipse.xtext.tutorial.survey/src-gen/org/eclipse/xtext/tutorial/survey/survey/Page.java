/**
 */
package org.eclipse.xtext.tutorial.survey.survey;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.tutorial.survey.survey.Page#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.tutorial.survey.survey.Page#getQuestions <em>Questions</em>}</li>
 *   <li>{@link org.eclipse.xtext.tutorial.survey.survey.Page#getFollowUps <em>Follow Ups</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.tutorial.survey.survey.SurveyPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.tutorial.survey.survey.SurveyPackage#getPage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.tutorial.survey.survey.Page#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.tutorial.survey.survey.Question}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Questions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Questions</em>' containment reference list.
   * @see org.eclipse.xtext.tutorial.survey.survey.SurveyPackage#getPage_Questions()
   * @model containment="true"
   * @generated
   */
  EList<Question> getQuestions();

  /**
   * Returns the value of the '<em><b>Follow Ups</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.tutorial.survey.survey.FollowUp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Follow Ups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Follow Ups</em>' containment reference list.
   * @see org.eclipse.xtext.tutorial.survey.survey.SurveyPackage#getPage_FollowUps()
   * @model containment="true"
   * @generated
   */
  EList<FollowUp> getFollowUps();

} // Page
