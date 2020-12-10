/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mros.mros.mROS.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.mros.mros.mROS.Environment;
import org.xtext.mros.mros.mROS.MROSPackage;
import org.xtext.mros.mros.mROS.QualityAttribute;
import org.xtext.mros.mros.mROS.QualityModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mros.mros.mROS.impl.QualityModelImpl#getQa <em>Qa</em>}</li>
 *   <li>{@link org.xtext.mros.mros.mROS.impl.QualityModelImpl#getQvalue <em>Qvalue</em>}</li>
 *   <li>{@link org.xtext.mros.mros.mROS.impl.QualityModelImpl#getE <em>E</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityModelImpl extends MinimalEObjectImpl.Container implements QualityModel
{
  /**
   * The cached value of the '{@link #getQa() <em>Qa</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQa()
   * @generated
   * @ordered
   */
  protected QualityAttribute qa;

  /**
   * The default value of the '{@link #getQvalue() <em>Qvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQvalue()
   * @generated
   * @ordered
   */
  protected static final String QVALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQvalue() <em>Qvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQvalue()
   * @generated
   * @ordered
   */
  protected String qvalue = QVALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected Environment e;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QualityModelImpl()
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
    return MROSPackage.Literals.QUALITY_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QualityAttribute getQa()
  {
    return qa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQa(QualityAttribute newQa, NotificationChain msgs)
  {
    QualityAttribute oldQa = qa;
    qa = newQa;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MROSPackage.QUALITY_MODEL__QA, oldQa, newQa);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setQa(QualityAttribute newQa)
  {
    if (newQa != qa)
    {
      NotificationChain msgs = null;
      if (qa != null)
        msgs = ((InternalEObject)qa).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MROSPackage.QUALITY_MODEL__QA, null, msgs);
      if (newQa != null)
        msgs = ((InternalEObject)newQa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MROSPackage.QUALITY_MODEL__QA, null, msgs);
      msgs = basicSetQa(newQa, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MROSPackage.QUALITY_MODEL__QA, newQa, newQa));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getQvalue()
  {
    return qvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setQvalue(String newQvalue)
  {
    String oldQvalue = qvalue;
    qvalue = newQvalue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MROSPackage.QUALITY_MODEL__QVALUE, oldQvalue, qvalue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Environment getE()
  {
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE(Environment newE, NotificationChain msgs)
  {
    Environment oldE = e;
    e = newE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MROSPackage.QUALITY_MODEL__E, oldE, newE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setE(Environment newE)
  {
    if (newE != e)
    {
      NotificationChain msgs = null;
      if (e != null)
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MROSPackage.QUALITY_MODEL__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MROSPackage.QUALITY_MODEL__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MROSPackage.QUALITY_MODEL__E, newE, newE));
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
      case MROSPackage.QUALITY_MODEL__QA:
        return basicSetQa(null, msgs);
      case MROSPackage.QUALITY_MODEL__E:
        return basicSetE(null, msgs);
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
      case MROSPackage.QUALITY_MODEL__QA:
        return getQa();
      case MROSPackage.QUALITY_MODEL__QVALUE:
        return getQvalue();
      case MROSPackage.QUALITY_MODEL__E:
        return getE();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MROSPackage.QUALITY_MODEL__QA:
        setQa((QualityAttribute)newValue);
        return;
      case MROSPackage.QUALITY_MODEL__QVALUE:
        setQvalue((String)newValue);
        return;
      case MROSPackage.QUALITY_MODEL__E:
        setE((Environment)newValue);
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
      case MROSPackage.QUALITY_MODEL__QA:
        setQa((QualityAttribute)null);
        return;
      case MROSPackage.QUALITY_MODEL__QVALUE:
        setQvalue(QVALUE_EDEFAULT);
        return;
      case MROSPackage.QUALITY_MODEL__E:
        setE((Environment)null);
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
      case MROSPackage.QUALITY_MODEL__QA:
        return qa != null;
      case MROSPackage.QUALITY_MODEL__QVALUE:
        return QVALUE_EDEFAULT == null ? qvalue != null : !QVALUE_EDEFAULT.equals(qvalue);
      case MROSPackage.QUALITY_MODEL__E:
        return e != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (qvalue: ");
    result.append(qvalue);
    result.append(')');
    return result.toString();
  }

} //QualityModelImpl
