/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mros.mros.mROS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mros.mros.mROS.Model#getSkillDefinitionSet <em>Skill Definition Set</em>}</li>
 * </ul>
 *
 * @see org.xtext.mros.mros.mROS.MROSPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Skill Definition Set</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mros.mros.mROS.SkillDefinition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Skill Definition Set</em>' containment reference list.
   * @see org.xtext.mros.mros.mROS.MROSPackage#getModel_SkillDefinitionSet()
   * @model containment="true"
   * @generated
   */
  EList<SkillDefinition> getSkillDefinitionSet();

} // Model