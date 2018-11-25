/**
 * generated by Xtext 2.15.0
 */
package org.xtext.browser.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.browser.mydsl.myDsl.Read#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.browser.mydsl.myDsl.Read#getParametre <em>Parametre</em>}</li>
 * </ul>
 *
 * @see org.xtext.browser.mydsl.myDsl.MyDslPackage#getRead()
 * @model
 * @generated
 */
public interface Read extends INSTRUCTION, TYPE_INSTRUCTION
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.browser.mydsl.myDsl.MyDslPackage#getRead_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.browser.mydsl.myDsl.Read#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Parametre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parametre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parametre</em>' attribute.
   * @see #setParametre(String)
   * @see org.xtext.browser.mydsl.myDsl.MyDslPackage#getRead_Parametre()
   * @model
   * @generated
   */
  String getParametre();

  /**
   * Sets the value of the '{@link org.xtext.browser.mydsl.myDsl.Read#getParametre <em>Parametre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parametre</em>' attribute.
   * @see #getParametre()
   * @generated
   */
  void setParametre(String value);

} // Read
