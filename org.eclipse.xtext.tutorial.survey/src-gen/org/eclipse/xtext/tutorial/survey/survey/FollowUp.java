/**
 */
package org.eclipse.xtext.tutorial.survey.survey;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Follow Up</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.tutorial.survey.survey.FollowUp#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.xtext.tutorial.survey.survey.FollowUp#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.tutorial.survey.survey.SurveyPackage#getFollowUp()
 * @model
 * @generated
 */
public interface FollowUp extends EObject
{
  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(Guard)
   * @see org.eclipse.xtext.tutorial.survey.survey.SurveyPackage#getFollowUp_Guard()
   * @model containment="true"
   * @generated
   */
  Guard getGuard();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.tutorial.survey.survey.FollowUp#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Guard value);

  /**
   * Returns the value of the '<em><b>Next</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' reference.
   * @see #setNext(Page)
   * @see org.eclipse.xtext.tutorial.survey.survey.SurveyPackage#getFollowUp_Next()
   * @model
   * @generated
   */
  Page getNext();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.tutorial.survey.survey.FollowUp#getNext <em>Next</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' reference.
   * @see #getNext()
   * @generated
   */
  void setNext(Page value);

} // FollowUp
