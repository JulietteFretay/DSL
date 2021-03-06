/**
 * generated by Xtext 2.15.0
 */
package org.xtext.browser.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.browser.mydsl.myDsl.Choose;
import org.xtext.browser.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.browser.mydsl.myDsl.impl.ChooseImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.browser.mydsl.myDsl.impl.ChooseImpl#getParametre <em>Parametre</em>}</li>
 *   <li>{@link org.xtext.browser.mydsl.myDsl.impl.ChooseImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChooseImpl extends INSTRUCTIONImpl implements Choose
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getParametre() <em>Parametre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParametre()
   * @generated
   * @ordered
   */
  protected static final String PARAMETRE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParametre() <em>Parametre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParametre()
   * @generated
   * @ordered
   */
  protected String parametre = PARAMETRE_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChooseImpl()
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
    return MyDslPackage.Literals.CHOOSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CHOOSE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParametre()
  {
    return parametre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParametre(String newParametre)
  {
    String oldParametre = parametre;
    parametre = newParametre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CHOOSE__PARAMETRE, oldParametre, parametre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CHOOSE__NAME, oldName, name));
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
      case MyDslPackage.CHOOSE__TYPE:
        return getType();
      case MyDslPackage.CHOOSE__PARAMETRE:
        return getParametre();
      case MyDslPackage.CHOOSE__NAME:
        return getName();
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
      case MyDslPackage.CHOOSE__TYPE:
        setType((String)newValue);
        return;
      case MyDslPackage.CHOOSE__PARAMETRE:
        setParametre((String)newValue);
        return;
      case MyDslPackage.CHOOSE__NAME:
        setName((String)newValue);
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
      case MyDslPackage.CHOOSE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case MyDslPackage.CHOOSE__PARAMETRE:
        setParametre(PARAMETRE_EDEFAULT);
        return;
      case MyDslPackage.CHOOSE__NAME:
        setName(NAME_EDEFAULT);
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
      case MyDslPackage.CHOOSE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case MyDslPackage.CHOOSE__PARAMETRE:
        return PARAMETRE_EDEFAULT == null ? parametre != null : !PARAMETRE_EDEFAULT.equals(parametre);
      case MyDslPackage.CHOOSE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (type: ");
    result.append(type);
    result.append(", parametre: ");
    result.append(parametre);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ChooseImpl
