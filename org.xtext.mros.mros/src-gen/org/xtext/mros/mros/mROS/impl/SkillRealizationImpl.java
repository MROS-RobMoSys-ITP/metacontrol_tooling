/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mros.mros.mROS.impl;

import java.lang.String;

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

import org.xtext.mros.mros.mROS.Component;
import org.xtext.mros.mros.mROS.Context;
import org.xtext.mros.mros.mROS.MROSPackage;
import org.xtext.mros.mros.mROS.QualityModel;
import org.xtext.mros.mros.mROS.SkillRealization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skill Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mros.mros.mROS.impl.SkillRealizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.mros.mros.mROS.impl.SkillRealizationImpl#getC <em>C</em>}</li>
 *   <li>{@link org.xtext.mros.mros.mROS.impl.SkillRealizationImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.xtext.mros.mros.mROS.impl.SkillRealizationImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillRealizationImpl extends MinimalEObjectImpl.Container implements SkillRealization
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
   * The cached value of the '{@link #getC() <em>C</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected EList<Component> c;

  /**
   * The cached value of the '{@link #getQ() <em>Q</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQ()
   * @generated
   * @ordered
   */
  protected EList<QualityModel> q;

  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected Context context;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SkillRealizationImpl()
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
    return MROSPackage.Literals.SKILL_REALIZATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MROSPackage.SKILL_REALIZATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Component> getC()
  {
    if (c == null)
    {
      c = new EObjectContainmentEList<Component>(Component.class, this, MROSPackage.SKILL_REALIZATION__C);
    }
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<QualityModel> getQ()
  {
    if (q == null)
    {
      q = new EObjectContainmentEList<QualityModel>(QualityModel.class, this, MROSPackage.SKILL_REALIZATION__Q);
    }
    return q;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Context getContext()
  {
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContext(Context newContext, NotificationChain msgs)
  {
    Context oldContext = context;
    context = newContext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MROSPackage.SKILL_REALIZATION__CONTEXT, oldContext, newContext);
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
  public void setContext(Context newContext)
  {
    if (newContext != context)
    {
      NotificationChain msgs = null;
      if (context != null)
        msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MROSPackage.SKILL_REALIZATION__CONTEXT, null, msgs);
      if (newContext != null)
        msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MROSPackage.SKILL_REALIZATION__CONTEXT, null, msgs);
      msgs = basicSetContext(newContext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MROSPackage.SKILL_REALIZATION__CONTEXT, newContext, newContext));
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
      case MROSPackage.SKILL_REALIZATION__C:
        return ((InternalEList<?>)getC()).basicRemove(otherEnd, msgs);
      case MROSPackage.SKILL_REALIZATION__Q:
        return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
      case MROSPackage.SKILL_REALIZATION__CONTEXT:
        return basicSetContext(null, msgs);
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
      case MROSPackage.SKILL_REALIZATION__NAME:
        return getName();
      case MROSPackage.SKILL_REALIZATION__C:
        return getC();
      case MROSPackage.SKILL_REALIZATION__Q:
        return getQ();
      case MROSPackage.SKILL_REALIZATION__CONTEXT:
        return getContext();
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
      case MROSPackage.SKILL_REALIZATION__NAME:
        setName((String)newValue);
        return;
      case MROSPackage.SKILL_REALIZATION__C:
        getC().clear();
        getC().addAll((Collection<? extends Component>)newValue);
        return;
      case MROSPackage.SKILL_REALIZATION__Q:
        getQ().clear();
        getQ().addAll((Collection<? extends QualityModel>)newValue);
        return;
      case MROSPackage.SKILL_REALIZATION__CONTEXT:
        setContext((Context)newValue);
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
      case MROSPackage.SKILL_REALIZATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MROSPackage.SKILL_REALIZATION__C:
        getC().clear();
        return;
      case MROSPackage.SKILL_REALIZATION__Q:
        getQ().clear();
        return;
      case MROSPackage.SKILL_REALIZATION__CONTEXT:
        setContext((Context)null);
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
      case MROSPackage.SKILL_REALIZATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MROSPackage.SKILL_REALIZATION__C:
        return c != null && !c.isEmpty();
      case MROSPackage.SKILL_REALIZATION__Q:
        return q != null && !q.isEmpty();
      case MROSPackage.SKILL_REALIZATION__CONTEXT:
        return context != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SkillRealizationImpl
