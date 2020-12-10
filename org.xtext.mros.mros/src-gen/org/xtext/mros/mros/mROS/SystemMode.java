/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mros.mros.mROS;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mros.mros.mROS.SystemMode#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.mros.mros.mROS.SystemMode#getC <em>C</em>}</li>
 * </ul>
 *
 * @see org.xtext.mros.mros.mROS.MROSPackage#getSystemMode()
 * @model
 * @generated
 */
public interface SystemMode extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.mros.mros.mROS.MROSPackage#getSystemMode_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.mros.mros.mROS.SystemMode#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mros.mros.mROS.Component}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference list.
   * @see org.xtext.mros.mros.mROS.MROSPackage#getSystemMode_C()
   * @model containment="true"
   * @generated
   */
  EList<Component> getC();

} // SystemMode