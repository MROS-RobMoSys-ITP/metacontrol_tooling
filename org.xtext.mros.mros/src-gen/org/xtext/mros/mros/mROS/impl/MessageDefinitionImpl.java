/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mros.mros.mROS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.mros.mros.mROS.MROSPackage;
import org.xtext.mros.mros.mROS.MessageDefinition;
import org.xtext.mros.mros.mROS.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mros.mros.mROS.impl.MessageDefinitionImpl#getMessagePart <em>Message Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageDefinitionImpl extends MinimalEObjectImpl.Container implements MessageDefinition
{
  /**
   * The cached value of the '{@link #getMessagePart() <em>Message Part</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessagePart()
   * @generated
   * @ordered
   */
  protected EList<Parameter> messagePart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageDefinitionImpl()
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
    return MROSPackage.Literals.MESSAGE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Parameter> getMessagePart()
  {
    if (messagePart == null)
    {
      messagePart = new EObjectContainmentEList<Parameter>(Parameter.class, this, MROSPackage.MESSAGE_DEFINITION__MESSAGE_PART);
    }
    return messagePart;
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
      case MROSPackage.MESSAGE_DEFINITION__MESSAGE_PART:
        return ((InternalEList<?>)getMessagePart()).basicRemove(otherEnd, msgs);
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
      case MROSPackage.MESSAGE_DEFINITION__MESSAGE_PART:
        return getMessagePart();
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
      case MROSPackage.MESSAGE_DEFINITION__MESSAGE_PART:
        getMessagePart().clear();
        getMessagePart().addAll((Collection<? extends Parameter>)newValue);
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
      case MROSPackage.MESSAGE_DEFINITION__MESSAGE_PART:
        getMessagePart().clear();
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
      case MROSPackage.MESSAGE_DEFINITION__MESSAGE_PART:
        return messagePart != null && !messagePart.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MessageDefinitionImpl
