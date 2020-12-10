/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mros.mros.mROS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mros.mros.mROS.GoalDefinition#getGoal <em>Goal</em>}</li>
 * </ul>
 *
 * @see org.xtext.mros.mros.mROS.MROSPackage#getGoalDefinition()
 * @model
 * @generated
 */
public interface GoalDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Goal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goal</em>' containment reference.
   * @see #setGoal(MessageDefinition)
   * @see org.xtext.mros.mros.mROS.MROSPackage#getGoalDefinition_Goal()
   * @model containment="true"
   * @generated
   */
  MessageDefinition getGoal();

  /**
   * Sets the value of the '{@link org.xtext.mros.mros.mROS.GoalDefinition#getGoal <em>Goal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goal</em>' containment reference.
   * @see #getGoal()
   * @generated
   */
  void setGoal(MessageDefinition value);

} // GoalDefinition
