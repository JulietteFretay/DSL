/**
 * generated by Xtext 2.15.0
 */
package org.xtext.browser.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.browser.mydsl.myDsl.Test#getNumber <em>Number</em>}</li>
 *   <li>{@link org.xtext.browser.mydsl.myDsl.Test#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.browser.mydsl.myDsl.MyDslPackage#getTest()
 * @model
 * @generated
 */
public interface Test extends EObject
{
  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(String)
   * @see org.xtext.browser.mydsl.myDsl.MyDslPackage#getTest_Number()
   * @model
   * @generated
   */
  String getNumber();

  /**
   * Sets the value of the '{@link org.xtext.browser.mydsl.myDsl.Test#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.browser.mydsl.myDsl.INSTRUCTION}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see org.xtext.browser.mydsl.myDsl.MyDslPackage#getTest_Body()
   * @model containment="true"
   * @generated
   */
  EList<INSTRUCTION> getBody();

} // Test
