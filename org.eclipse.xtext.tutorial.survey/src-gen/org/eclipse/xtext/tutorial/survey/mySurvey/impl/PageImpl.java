/**
 */
package org.eclipse.xtext.tutorial.survey.mySurvey.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.tutorial.survey.mySurvey.MySurveyPackage;
import org.eclipse.xtext.tutorial.survey.mySurvey.Page;
import org.eclipse.xtext.tutorial.survey.mySurvey.Question;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.tutorial.survey.mySurvey.impl.PageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.tutorial.survey.mySurvey.impl.PageImpl#getQuestions <em>Questions</em>}</li>
 *   <li>{@link org.eclipse.xtext.tutorial.survey.mySurvey.impl.PageImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getQuestions() <em>Questions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestions()
   * @generated
   * @ordered
   */
  protected EList<Question> questions;

  /**
   * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNext()
   * @generated
   * @ordered
   */
  protected Page next;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PageImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MySurveyPackage.Literals.PAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MySurveyPackage.PAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Question> getQuestions()
  {
    if (questions == null)
    {
      questions = new EObjectContainmentEList<Question>(Question.class, this, MySurveyPackage.PAGE__QUESTIONS);
    }
    return questions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page getNext()
  {
    if (next != null && next.eIsProxy())
    {
      InternalEObject oldNext = (InternalEObject)next;
      next = (Page)eResolveProxy(oldNext);
      if (next != oldNext)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MySurveyPackage.PAGE__NEXT, oldNext, next));
      }
    }
    return next;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page basicGetNext()
  {
    return next;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNext(Page newNext)
  {
    Page oldNext = next;
    next = newNext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MySurveyPackage.PAGE__NEXT, oldNext, next));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MySurveyPackage.PAGE__QUESTIONS:
        return ((InternalEList<?>)getQuestions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MySurveyPackage.PAGE__NAME:
        return getName();
      case MySurveyPackage.PAGE__QUESTIONS:
        return getQuestions();
      case MySurveyPackage.PAGE__NEXT:
        if (resolve) return getNext();
        return basicGetNext();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MySurveyPackage.PAGE__NAME:
        setName((String)newValue);
        return;
      case MySurveyPackage.PAGE__QUESTIONS:
        getQuestions().clear();
        getQuestions().addAll((Collection<? extends Question>)newValue);
        return;
      case MySurveyPackage.PAGE__NEXT:
        setNext((Page)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MySurveyPackage.PAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MySurveyPackage.PAGE__QUESTIONS:
        getQuestions().clear();
        return;
      case MySurveyPackage.PAGE__NEXT:
        setNext((Page)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MySurveyPackage.PAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MySurveyPackage.PAGE__QUESTIONS:
        return questions != null && !questions.isEmpty();
      case MySurveyPackage.PAGE__NEXT:
        return next != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PageImpl
