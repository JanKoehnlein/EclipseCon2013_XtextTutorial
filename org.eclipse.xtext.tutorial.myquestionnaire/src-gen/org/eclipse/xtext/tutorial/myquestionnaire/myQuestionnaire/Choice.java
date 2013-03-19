/**
 */
package org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Choice#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Choice#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.MyQuestionnairePackage#getChoice()
 * @model
 * @generated
 */
public interface Choice extends EObject
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
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.MyQuestionnairePackage#getChoice_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Choice#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.MyQuestionnairePackage#getChoice_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Choice#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // Choice
