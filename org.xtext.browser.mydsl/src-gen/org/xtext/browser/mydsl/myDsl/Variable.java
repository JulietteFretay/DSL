/**
 * generated by Xtext 2.15.0
 */
package org.xtext.browser.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.browser.mydsl.myDsl.Variable#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.browser.mydsl.myDsl.Variable#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @see org.xtext.browser.mydsl.myDsl.MyDslPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends INSTRUCTION
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
   * @see org.xtext.browser.mydsl.myDsl.MyDslPackage#getVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.browser.mydsl.myDsl.Variable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Instruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instruction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instruction</em>' containment reference.
   * @see #setInstruction(TYPE_INSTRUCTION)
   * @see org.xtext.browser.mydsl.myDsl.MyDslPackage#getVariable_Instruction()
   * @model containment="true"
   * @generated
   */
  TYPE_INSTRUCTION getInstruction();

  /**
   * Sets the value of the '{@link org.xtext.browser.mydsl.myDsl.Variable#getInstruction <em>Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instruction</em>' containment reference.
   * @see #getInstruction()
   * @generated
   */
  void setInstruction(TYPE_INSTRUCTION value);

} // Variable
