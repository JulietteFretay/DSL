/**
 * generated by Xtext 2.15.0
 */
package org.xtext.browser.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contains</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.browser.mydsl.myDsl.Contains#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.browser.mydsl.myDsl.Contains#getParametre <em>Parametre</em>}</li>
 * </ul>
 *
 * @see org.xtext.browser.mydsl.myDsl.MyDslPackage#getContains()
 * @model
 * @generated
 */
public interface Contains extends TYPE_VERIFY
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
   * @see org.xtext.browser.mydsl.myDsl.MyDslPackage#getContains_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.browser.mydsl.myDsl.Contains#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Parametre</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parametre</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parametre</em>' containment reference.
   * @see #setParametre(TYPE_PARAMETRE)
   * @see org.xtext.browser.mydsl.myDsl.MyDslPackage#getContains_Parametre()
   * @model containment="true"
   * @generated
   */
  TYPE_PARAMETRE getParametre();

  /**
   * Sets the value of the '{@link org.xtext.browser.mydsl.myDsl.Contains#getParametre <em>Parametre</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parametre</em>' containment reference.
   * @see #getParametre()
   * @generated
   */
  void setParametre(TYPE_PARAMETRE value);

} // Contains
