/**
 */
package no.hal.ra.model.impl;

import java.util.Collection;
import no.hal.ra.model.CourseAllocation;
import no.hal.ra.model.ModelPackage;
import no.hal.ra.model.Person;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.ra.model.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.ra.model.impl.PersonImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link no.hal.ra.model.impl.PersonImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link no.hal.ra.model.impl.PersonImpl#getFaceUrl <em>Face Url</em>}</li>
 *   <li>{@link no.hal.ra.model.impl.PersonImpl#getEmploymentFactor <em>Employment Factor</em>}</li>
 *   <li>{@link no.hal.ra.model.impl.PersonImpl#getAllocations <em>Allocations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
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
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFaceUrl() <em>Face Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaceUrl()
	 * @generated
	 * @ordered
	 */
	protected static final URI FACE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaceUrl() <em>Face Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaceUrl()
	 * @generated
	 * @ordered
	 */
	protected URI faceUrl = FACE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmploymentFactor() <em>Employment Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploymentFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double EMPLOYMENT_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEmploymentFactor() <em>Employment Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploymentFactor()
	 * @generated
	 * @ordered
	 */
	protected double employmentFactor = EMPLOYMENT_FACTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllocations() <em>Allocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseAllocation> allocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSON__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSON__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getFaceUrl() {
		return faceUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaceUrl(URI newFaceUrl) {
		URI oldFaceUrl = faceUrl;
		faceUrl = newFaceUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSON__FACE_URL, oldFaceUrl, faceUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEmploymentFactor() {
		return employmentFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmploymentFactor(double newEmploymentFactor) {
		double oldEmploymentFactor = employmentFactor;
		employmentFactor = newEmploymentFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSON__EMPLOYMENT_FACTOR, oldEmploymentFactor, employmentFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseAllocation> getAllocations() {
		if (allocations == null) {
			allocations = new EObjectWithInverseResolvingEList<CourseAllocation>(CourseAllocation.class, this, ModelPackage.PERSON__ALLOCATIONS, ModelPackage.COURSE_ALLOCATION__PERSON);
		}
		return allocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PERSON__ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PERSON__ALLOCATIONS:
				return ((InternalEList<?>)getAllocations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PERSON__NAME:
				return getName();
			case ModelPackage.PERSON__USER_NAME:
				return getUserName();
			case ModelPackage.PERSON__EMAIL:
				return getEmail();
			case ModelPackage.PERSON__FACE_URL:
				return getFaceUrl();
			case ModelPackage.PERSON__EMPLOYMENT_FACTOR:
				return getEmploymentFactor();
			case ModelPackage.PERSON__ALLOCATIONS:
				return getAllocations();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.PERSON__USER_NAME:
				setUserName((String)newValue);
				return;
			case ModelPackage.PERSON__EMAIL:
				setEmail((String)newValue);
				return;
			case ModelPackage.PERSON__FACE_URL:
				setFaceUrl((URI)newValue);
				return;
			case ModelPackage.PERSON__EMPLOYMENT_FACTOR:
				setEmploymentFactor((Double)newValue);
				return;
			case ModelPackage.PERSON__ALLOCATIONS:
				getAllocations().clear();
				getAllocations().addAll((Collection<? extends CourseAllocation>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.PERSON__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case ModelPackage.PERSON__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ModelPackage.PERSON__FACE_URL:
				setFaceUrl(FACE_URL_EDEFAULT);
				return;
			case ModelPackage.PERSON__EMPLOYMENT_FACTOR:
				setEmploymentFactor(EMPLOYMENT_FACTOR_EDEFAULT);
				return;
			case ModelPackage.PERSON__ALLOCATIONS:
				getAllocations().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.PERSON__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case ModelPackage.PERSON__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ModelPackage.PERSON__FACE_URL:
				return FACE_URL_EDEFAULT == null ? faceUrl != null : !FACE_URL_EDEFAULT.equals(faceUrl);
			case ModelPackage.PERSON__EMPLOYMENT_FACTOR:
				return employmentFactor != EMPLOYMENT_FACTOR_EDEFAULT;
			case ModelPackage.PERSON__ALLOCATIONS:
				return allocations != null && !allocations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", userName: ");
		result.append(userName);
		result.append(", email: ");
		result.append(email);
		result.append(", faceUrl: ");
		result.append(faceUrl);
		result.append(", employmentFactor: ");
		result.append(employmentFactor);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
