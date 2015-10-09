/**
 */
package no.hal.ra.model.impl;

import no.hal.ra.model.CourseAllocation;
import no.hal.ra.model.CourseInstance;
import no.hal.ra.model.ModelPackage;
import no.hal.ra.model.Person;
import no.hal.ra.model.Role;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.ra.model.impl.CourseAllocationImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link no.hal.ra.model.impl.CourseAllocationImpl#getRole <em>Role</em>}</li>
 *   <li>{@link no.hal.ra.model.impl.CourseAllocationImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link no.hal.ra.model.impl.CourseAllocationImpl#getExplicitFactor <em>Explicit Factor</em>}</li>
 *   <li>{@link no.hal.ra.model.impl.CourseAllocationImpl#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseAllocationImpl extends MinimalEObjectImpl.Container implements CourseAllocation {
	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * The default value of the '{@link #getFactor() <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double FACTOR_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getExplicitFactor() <em>Explicit Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplicitFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double EXPLICIT_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getExplicitFactor() <em>Explicit Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplicitFactor()
	 * @generated
	 * @ordered
	 */
	protected double explicitFactor = EXPLICIT_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COURSE_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPerson() {
		if (person != null && person.eIsProxy()) {
			InternalEObject oldPerson = (InternalEObject)person;
			person = (Person)eResolveProxy(oldPerson);
			if (person != oldPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.COURSE_ALLOCATION__PERSON, oldPerson, person));
			}
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.COURSE_ALLOCATION__PERSON, oldPerson, newPerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(Person newPerson) {
		if (newPerson != person) {
			NotificationChain msgs = null;
			if (person != null)
				msgs = ((InternalEObject)person).eInverseRemove(this, ModelPackage.PERSON__ALLOCATIONS, Person.class, msgs);
			if (newPerson != null)
				msgs = ((InternalEObject)newPerson).eInverseAdd(this, ModelPackage.PERSON__ALLOCATIONS, Person.class, msgs);
			msgs = basicSetPerson(newPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COURSE_ALLOCATION__PERSON, newPerson, newPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.COURSE_ALLOCATION__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COURSE_ALLOCATION__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getFactor() {
		if (getRole() != null) {
			return getRole().getFactor() * (getExplicitFactor() > 0.0 ? getExplicitFactor() : 1.0);
		}
		return getExplicitFactor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setFactor(double newFactor) {
		setExplicitFactor(newFactor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getExplicitFactor() {
		return explicitFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplicitFactor(double newExplicitFactor) {
		double oldExplicitFactor = explicitFactor;
		explicitFactor = newExplicitFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COURSE_ALLOCATION__EXPLICIT_FACTOR, oldExplicitFactor, explicitFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseInstance getCourse() {
		if (eContainerFeatureID() != ModelPackage.COURSE_ALLOCATION__COURSE) return null;
		return (CourseInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourse(CourseInstance newCourse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCourse, ModelPackage.COURSE_ALLOCATION__COURSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourse(CourseInstance newCourse) {
		if (newCourse != eInternalContainer() || (eContainerFeatureID() != ModelPackage.COURSE_ALLOCATION__COURSE && newCourse != null)) {
			if (EcoreUtil.isAncestor(this, newCourse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCourse != null)
				msgs = ((InternalEObject)newCourse).eInverseAdd(this, ModelPackage.COURSE_INSTANCE__ALLOCATIONS, CourseInstance.class, msgs);
			msgs = basicSetCourse(newCourse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COURSE_ALLOCATION__COURSE, newCourse, newCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.COURSE_ALLOCATION__PERSON:
				if (person != null)
					msgs = ((InternalEObject)person).eInverseRemove(this, ModelPackage.PERSON__ALLOCATIONS, Person.class, msgs);
				return basicSetPerson((Person)otherEnd, msgs);
			case ModelPackage.COURSE_ALLOCATION__COURSE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCourse((CourseInstance)otherEnd, msgs);
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
			case ModelPackage.COURSE_ALLOCATION__PERSON:
				return basicSetPerson(null, msgs);
			case ModelPackage.COURSE_ALLOCATION__COURSE:
				return basicSetCourse(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.COURSE_ALLOCATION__COURSE:
				return eInternalContainer().eInverseRemove(this, ModelPackage.COURSE_INSTANCE__ALLOCATIONS, CourseInstance.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.COURSE_ALLOCATION__PERSON:
				if (resolve) return getPerson();
				return basicGetPerson();
			case ModelPackage.COURSE_ALLOCATION__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case ModelPackage.COURSE_ALLOCATION__FACTOR:
				return getFactor();
			case ModelPackage.COURSE_ALLOCATION__EXPLICIT_FACTOR:
				return getExplicitFactor();
			case ModelPackage.COURSE_ALLOCATION__COURSE:
				return getCourse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.COURSE_ALLOCATION__PERSON:
				setPerson((Person)newValue);
				return;
			case ModelPackage.COURSE_ALLOCATION__ROLE:
				setRole((Role)newValue);
				return;
			case ModelPackage.COURSE_ALLOCATION__FACTOR:
				setFactor((Double)newValue);
				return;
			case ModelPackage.COURSE_ALLOCATION__EXPLICIT_FACTOR:
				setExplicitFactor((Double)newValue);
				return;
			case ModelPackage.COURSE_ALLOCATION__COURSE:
				setCourse((CourseInstance)newValue);
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
			case ModelPackage.COURSE_ALLOCATION__PERSON:
				setPerson((Person)null);
				return;
			case ModelPackage.COURSE_ALLOCATION__ROLE:
				setRole((Role)null);
				return;
			case ModelPackage.COURSE_ALLOCATION__FACTOR:
				setFactor(FACTOR_EDEFAULT);
				return;
			case ModelPackage.COURSE_ALLOCATION__EXPLICIT_FACTOR:
				setExplicitFactor(EXPLICIT_FACTOR_EDEFAULT);
				return;
			case ModelPackage.COURSE_ALLOCATION__COURSE:
				setCourse((CourseInstance)null);
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
			case ModelPackage.COURSE_ALLOCATION__PERSON:
				return person != null;
			case ModelPackage.COURSE_ALLOCATION__ROLE:
				return role != null;
			case ModelPackage.COURSE_ALLOCATION__FACTOR:
				return getFactor() != FACTOR_EDEFAULT;
			case ModelPackage.COURSE_ALLOCATION__EXPLICIT_FACTOR:
				return explicitFactor != EXPLICIT_FACTOR_EDEFAULT;
			case ModelPackage.COURSE_ALLOCATION__COURSE:
				return getCourse() != null;
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
		result.append(" (explicitFactor: ");
		result.append(explicitFactor);
		result.append(')');
		return result.toString();
	}

} //CourseAllocationImpl
