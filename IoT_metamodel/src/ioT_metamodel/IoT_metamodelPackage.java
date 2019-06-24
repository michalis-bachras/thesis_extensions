/**
 */
package ioT_metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ioT_metamodel.IoT_metamodelFactory
 * @model kind="package"
 * @generated
 */
public interface IoT_metamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ioT_metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ioT_metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ioT_metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IoT_metamodelPackage eINSTANCE = ioT_metamodel.impl.IoT_metamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.EntityImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 47;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.ThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.ThingImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getThing()
	 * @generated
	 */
	int THING = 0;

	/**
	 * The feature id for the '<em><b>Virtual entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__VIRTUAL_ENTITY = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__FOG = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physical entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__PHYSICAL_ENTITY = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__NAME = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__CONTAINS = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__PROPERTY = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.Digital_ArtifactImpl <em>Digital Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.Digital_ArtifactImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getDigital_Artifact()
	 * @generated
	 */
	int DIGITAL_ARTIFACT = 17;

	/**
	 * The number of structural features of the '<em>Digital Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ARTIFACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Digital Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.Active_Digital_ArtifactImpl <em>Active Digital Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.Active_Digital_ArtifactImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getActive_Digital_Artifact()
	 * @generated
	 */
	int ACTIVE_DIGITAL_ARTIFACT = 18;

	/**
	 * The feature id for the '<em><b>Subscribes invokes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_DIGITAL_ARTIFACT__SUBSCRIBES_INVOKES = DIGITAL_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Active Digital Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_DIGITAL_ARTIFACT_FEATURE_COUNT = DIGITAL_ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Active Digital Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_DIGITAL_ARTIFACT_OPERATION_COUNT = DIGITAL_ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.VirtualThingImpl <em>Virtual Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.VirtualThingImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getVirtualThing()
	 * @generated
	 */
	int VIRTUAL_THING = 1;

	/**
	 * The feature id for the '<em><b>Subscribes invokes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_THING__SUBSCRIBES_INVOKES = ACTIVE_DIGITAL_ARTIFACT__SUBSCRIBES_INVOKES;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_THING__REPRESENTS = ACTIVE_DIGITAL_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_THING__URI = ACTIVE_DIGITAL_ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is associated with</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_THING__IS_ASSOCIATED_WITH = ACTIVE_DIGITAL_ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Virtual Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_THING_FEATURE_COUNT = ACTIVE_DIGITAL_ARTIFACT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Virtual Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_THING_OPERATION_COUNT = ACTIVE_DIGITAL_ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.PhysicalThingImpl <em>Physical Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.PhysicalThingImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getPhysicalThing()
	 * @generated
	 */
	int PHYSICAL_THING = 2;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_THING__HAS = 0;

	/**
	 * The number of structural features of the '<em>Physical Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_THING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Physical Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_THING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.FogImpl <em>Fog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.FogImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getFog()
	 * @generated
	 */
	int FOG = 3;

	/**
	 * The feature id for the '<em><b>Request service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG__REQUEST_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Fognode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG__FOGNODE = 1;

	/**
	 * The feature id for the '<em><b>Request cloud service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG__REQUEST_CLOUD_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG__DATABASE = 3;

	/**
	 * The feature id for the '<em><b>Define control policies to</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG__DEFINE_CONTROL_POLICIES_TO = 4;

	/**
	 * The number of structural features of the '<em>Fog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Fog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.FogNodeImpl <em>Fog Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.FogNodeImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getFogNode()
	 * @generated
	 */
	int FOG_NODE = 4;

	/**
	 * The feature id for the '<em><b>Runs on vm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__RUNS_ON_VM = 0;

	/**
	 * The feature id for the '<em><b>Runs in container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__RUNS_IN_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Analytics engine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__ANALYTICS_ENGINE = 2;

	/**
	 * The feature id for the '<em><b>Associates with</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__ASSOCIATES_WITH = 3;

	/**
	 * The number of structural features of the '<em>Fog Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Fog Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.DeviceImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 5;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__HAS = PHYSICAL_THING__HAS;

	/**
	 * The feature id for the '<em><b>Is attached to</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__IS_ATTACHED_TO = PHYSICAL_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CONTAINS = PHYSICAL_THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TECHNOLOGY = PHYSICAL_THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__HAS_RULES = PHYSICAL_THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Devicestate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DEVICESTATE = PHYSICAL_THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Has communicators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__HAS_COMMUNICATORS = PHYSICAL_THING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__HOSTS = PHYSICAL_THING_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = PHYSICAL_THING_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = PHYSICAL_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.ActuatorImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 6;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__HAS = DEVICE__HAS;

	/**
	 * The feature id for the '<em><b>Is attached to</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__IS_ATTACHED_TO = DEVICE__IS_ATTACHED_TO;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__CONTAINS = DEVICE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__TECHNOLOGY = DEVICE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Has rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__HAS_RULES = DEVICE__HAS_RULES;

	/**
	 * The feature id for the '<em><b>Devicestate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__DEVICESTATE = DEVICE__DEVICESTATE;

	/**
	 * The feature id for the '<em><b>Has communicators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__HAS_COMMUNICATORS = DEVICE__HAS_COMMUNICATORS;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__HOSTS = DEVICE__HOSTS;

	/**
	 * The feature id for the '<em><b>Acts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ACTS = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ACTIONS = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Observes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__OBSERVES = DEVICE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.TagImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 7;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__HAS = DEVICE__HAS;

	/**
	 * The feature id for the '<em><b>Is attached to</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__IS_ATTACHED_TO = DEVICE__IS_ATTACHED_TO;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__CONTAINS = DEVICE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__TECHNOLOGY = DEVICE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Has rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__HAS_RULES = DEVICE__HAS_RULES;

	/**
	 * The feature id for the '<em><b>Devicestate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DEVICESTATE = DEVICE__DEVICESTATE;

	/**
	 * The feature id for the '<em><b>Has communicators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__HAS_COMMUNICATORS = DEVICE__HAS_COMMUNICATORS;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__HOSTS = DEVICE__HOSTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__IDENTIFIES = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.SensorImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 8;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__HAS = DEVICE__HAS;

	/**
	 * The feature id for the '<em><b>Is attached to</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__IS_ATTACHED_TO = DEVICE__IS_ATTACHED_TO;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONTAINS = DEVICE__CONTAINS;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TECHNOLOGY = DEVICE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Has rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__HAS_RULES = DEVICE__HAS_RULES;

	/**
	 * The feature id for the '<em><b>Devicestate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DEVICESTATE = DEVICE__DEVICESTATE;

	/**
	 * The feature id for the '<em><b>Has communicators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__HAS_COMMUNICATORS = DEVICE__HAS_COMMUNICATORS;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__HOSTS = DEVICE__HOSTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__STATE = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__FREQUENCY = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MONITORS = DEVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Observes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__OBSERVES = DEVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.RuleImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 9;

	/**
	 * The feature id for the '<em><b>Condition Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONDITION_LITERAL = 0;

	/**
	 * The feature id for the '<em><b>Condition Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONDITION_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Involves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__INVOLVES = 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.ExternalSensorImpl <em>External Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.ExternalSensorImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getExternalSensor()
	 * @generated
	 */
	int EXTERNAL_SENSOR = 10;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENSOR__HAS = SENSOR__HAS;

	/**
	 * The feature id for the '<em><b>Is attached to</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENSOR__IS_ATTACHED_TO = SENSOR__IS_ATTACHED_TO;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENSOR__CONTAINS = SENSOR__CONTAINS;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENSOR__TECHNOLOGY = SENSOR__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Has rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENSOR__HAS_RULES = SENSOR__HAS_RULES;

	/**
	 * The feature id for the '<em><b>Devicestate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENSOR__DEVICESTATE = SENSOR__DEVICESTATE;

	/**
	 * The feature id for the '<em><b>Has communicators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENSOR__HAS_COMMUNICATORS = SENSOR__HAS_COMMUNICATORS;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENSOR__HOSTS = SENSOR__HOSTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENSOR__STATE = SENSOR__STATE;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENSOR__FREQUENCY = SENSOR__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENSOR__MONITORS = SENSOR__MONITORS;

	/**
	 * The feature id for the '<em><b>Observes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENSOR__OBSERVES = SENSOR__OBSERVES;

	/**
	 * The feature id for the '<em><b>Sensor actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENSOR__SENSOR_ACTIONS = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>External Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.DeviceActuatorImpl <em>Device Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.DeviceActuatorImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getDeviceActuator()
	 * @generated
	 */
	int DEVICE_ACTUATOR = 11;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTUATOR__HAS = ACTUATOR__HAS;

	/**
	 * The feature id for the '<em><b>Is attached to</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTUATOR__IS_ATTACHED_TO = ACTUATOR__IS_ATTACHED_TO;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTUATOR__CONTAINS = ACTUATOR__CONTAINS;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTUATOR__TECHNOLOGY = ACTUATOR__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Has rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTUATOR__HAS_RULES = ACTUATOR__HAS_RULES;

	/**
	 * The feature id for the '<em><b>Devicestate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTUATOR__DEVICESTATE = ACTUATOR__DEVICESTATE;

	/**
	 * The feature id for the '<em><b>Has communicators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTUATOR__HAS_COMMUNICATORS = ACTUATOR__HAS_COMMUNICATORS;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTUATOR__HOSTS = ACTUATOR__HOSTS;

	/**
	 * The feature id for the '<em><b>Acts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTUATOR__ACTS = ACTUATOR__ACTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTUATOR__NAME = ACTUATOR__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTUATOR__ACTIONS = ACTUATOR__ACTIONS;

	/**
	 * The feature id for the '<em><b>Observes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTUATOR__OBSERVES = ACTUATOR__OBSERVES;

	/**
	 * The feature id for the '<em><b>Actuator actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTUATOR__ACTUATOR_ACTIONS = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTUATOR_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ACTUATOR_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.ExternalActuatorImpl <em>External Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.ExternalActuatorImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getExternalActuator()
	 * @generated
	 */
	int EXTERNAL_ACTUATOR = 12;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTUATOR__HAS = ACTUATOR__HAS;

	/**
	 * The feature id for the '<em><b>Is attached to</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTUATOR__IS_ATTACHED_TO = ACTUATOR__IS_ATTACHED_TO;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTUATOR__CONTAINS = ACTUATOR__CONTAINS;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTUATOR__TECHNOLOGY = ACTUATOR__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Has rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTUATOR__HAS_RULES = ACTUATOR__HAS_RULES;

	/**
	 * The feature id for the '<em><b>Devicestate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTUATOR__DEVICESTATE = ACTUATOR__DEVICESTATE;

	/**
	 * The feature id for the '<em><b>Has communicators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTUATOR__HAS_COMMUNICATORS = ACTUATOR__HAS_COMMUNICATORS;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTUATOR__HOSTS = ACTUATOR__HOSTS;

	/**
	 * The feature id for the '<em><b>Acts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTUATOR__ACTS = ACTUATOR__ACTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTUATOR__NAME = ACTUATOR__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTUATOR__ACTIONS = ACTUATOR__ACTIONS;

	/**
	 * The feature id for the '<em><b>Observes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTUATOR__OBSERVES = ACTUATOR__OBSERVES;

	/**
	 * The feature id for the '<em><b>Actuator actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTUATOR__ACTUATOR_ACTIONS = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTUATOR_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>External Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTUATOR_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.ActionImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 13;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.DeviceStateImpl <em>Device State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.DeviceStateImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getDeviceState()
	 * @generated
	 */
	int DEVICE_STATE = 14;

	/**
	 * The number of structural features of the '<em>Device State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Device State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.CompositeStateImpl <em>Composite State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.CompositeStateImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getCompositeState()
	 * @generated
	 */
	int COMPOSITE_STATE = 15;

	/**
	 * The number of structural features of the '<em>Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE_FEATURE_COUNT = DEVICE_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE_OPERATION_COUNT = DEVICE_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.TransitionImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 16;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Incoming states</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INCOMING_STATES = 1;

	/**
	 * The feature id for the '<em><b>Outgoing states</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTGOING_STATES = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.Passive_Digital_ArtifactImpl <em>Passive Digital Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.Passive_Digital_ArtifactImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getPassive_Digital_Artifact()
	 * @generated
	 */
	int PASSIVE_DIGITAL_ARTIFACT = 19;

	/**
	 * The number of structural features of the '<em>Passive Digital Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_DIGITAL_ARTIFACT_FEATURE_COUNT = DIGITAL_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Passive Digital Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_DIGITAL_ARTIFACT_OPERATION_COUNT = DIGITAL_ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.UserImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getUser()
	 * @generated
	 */
	int USER = 20;

	/**
	 * The feature id for the '<em><b>Subscribes invokes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SUBSCRIBES_INVOKES = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.Human_UserImpl <em>Human User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.Human_UserImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getHuman_User()
	 * @generated
	 */
	int HUMAN_USER = 21;

	/**
	 * The feature id for the '<em><b>Subscribes invokes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_USER__SUBSCRIBES_INVOKES = USER__SUBSCRIBES_INVOKES;

	/**
	 * The number of structural features of the '<em>Human User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_USER_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Human User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_USER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.CommunicatorImpl <em>Communicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.CommunicatorImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getCommunicator()
	 * @generated
	 */
	int COMMUNICATOR = 22;

	/**
	 * The feature id for the '<em><b>Has ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATOR__HAS_PORTS = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATOR__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Ports number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATOR__PORTS_NUMBER = 2;

	/**
	 * The number of structural features of the '<em>Communicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Communicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.PortImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 23;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.InformationResourceImpl <em>Information Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.InformationResourceImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getInformationResource()
	 * @generated
	 */
	int INFORMATION_RESOURCE = 24;

	/**
	 * The feature id for the '<em><b>Has information about</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_RESOURCE__HAS_INFORMATION_ABOUT = 0;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_RESOURCE__HAS = 1;

	/**
	 * The number of structural features of the '<em>Information Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Information Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.On_Device_ResourceImpl <em>On Device Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.On_Device_ResourceImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getOn_Device_Resource()
	 * @generated
	 */
	int ON_DEVICE_RESOURCE = 25;

	/**
	 * The feature id for the '<em><b>Has information about</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DEVICE_RESOURCE__HAS_INFORMATION_ABOUT = INFORMATION_RESOURCE__HAS_INFORMATION_ABOUT;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DEVICE_RESOURCE__HAS = INFORMATION_RESOURCE__HAS;

	/**
	 * The feature id for the '<em><b>Contains device resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DEVICE_RESOURCE__CONTAINS_DEVICE_RESOURCE = INFORMATION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains service resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DEVICE_RESOURCE__CONTAINS_SERVICE_RESOURCE = INFORMATION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>On Device Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DEVICE_RESOURCE_FEATURE_COUNT = INFORMATION_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>On Device Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DEVICE_RESOURCE_OPERATION_COUNT = INFORMATION_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.Network_ResourceImpl <em>Network Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.Network_ResourceImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getNetwork_Resource()
	 * @generated
	 */
	int NETWORK_RESOURCE = 26;

	/**
	 * The feature id for the '<em><b>Has information about</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_RESOURCE__HAS_INFORMATION_ABOUT = INFORMATION_RESOURCE__HAS_INFORMATION_ABOUT;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_RESOURCE__HAS = INFORMATION_RESOURCE__HAS;

	/**
	 * The feature id for the '<em><b>Contains device resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_RESOURCE__CONTAINS_DEVICE_RESOURCE = INFORMATION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains service resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_RESOURCE__CONTAINS_SERVICE_RESOURCE = INFORMATION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Network Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_RESOURCE_FEATURE_COUNT = INFORMATION_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Network Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_RESOURCE_OPERATION_COUNT = INFORMATION_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.Device_ResourceImpl <em>Device Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.Device_ResourceImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getDevice_Resource()
	 * @generated
	 */
	int DEVICE_RESOURCE = 27;

	/**
	 * The number of structural features of the '<em>Device Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Device Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.Service_ResourceImpl <em>Service Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.Service_ResourceImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getService_Resource()
	 * @generated
	 */
	int SERVICE_RESOURCE = 28;

	/**
	 * The number of structural features of the '<em>Service Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.PropertyImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 29;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CHANGEABLE = 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.VMImpl <em>VM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.VMImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getVM()
	 * @generated
	 */
	int VM = 30;

	/**
	 * The number of structural features of the '<em>VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.ContainerImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 31;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = 0;

	/**
	 * The feature id for the '<em><b>IP address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IP_ADDRESS = 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.Analytics_EngineImpl <em>Analytics Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.Analytics_EngineImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getAnalytics_Engine()
	 * @generated
	 */
	int ANALYTICS_ENGINE = 32;

	/**
	 * The number of structural features of the '<em>Analytics Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_ENGINE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Analytics Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_ENGINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.CloudImpl <em>Cloud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.CloudImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getCloud()
	 * @generated
	 */
	int CLOUD = 33;

	/**
	 * The feature id for the '<em><b>Respond to fog</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__RESPOND_TO_FOG = 0;

	/**
	 * The number of structural features of the '<em>Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.DatabaseImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 34;

	/**
	 * The feature id for the '<em><b>Policy repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__POLICY_REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.Policy_RepositoryImpl <em>Policy Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.Policy_RepositoryImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getPolicy_Repository()
	 * @generated
	 */
	int POLICY_REPOSITORY = 35;

	/**
	 * The feature id for the '<em><b>Interacts with</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_REPOSITORY__INTERACTS_WITH = 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_REPOSITORY__CONTAINS = 1;

	/**
	 * The number of structural features of the '<em>Policy Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_REPOSITORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Policy Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.Reference_MonitorImpl <em>Reference Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.Reference_MonitorImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getReference_Monitor()
	 * @generated
	 */
	int REFERENCE_MONITOR = 36;

	/**
	 * The feature id for the '<em><b>Orchestrate policies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MONITOR__ORCHESTRATE_POLICIES = 0;

	/**
	 * The feature id for the '<em><b>Enforces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MONITOR__ENFORCES = 1;

	/**
	 * The number of structural features of the '<em>Reference Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MONITOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reference Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MONITOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.AuthorizorImpl <em>Authorizor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.AuthorizorImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getAuthorizor()
	 * @generated
	 */
	int AUTHORIZOR = 37;

	/**
	 * The feature id for the '<em><b>Connects with</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZOR__CONNECTS_WITH = 0;

	/**
	 * The number of structural features of the '<em>Authorizor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Authorizor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.InformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.InformationImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getInformation()
	 * @generated
	 */
	int INFORMATION = 38;

	/**
	 * The feature id for the '<em><b>Atomicdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__ATOMICDATA = 0;

	/**
	 * The feature id for the '<em><b>Datastreams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__DATASTREAMS = 1;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.DataStreamsImpl <em>Data Streams</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.DataStreamsImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getDataStreams()
	 * @generated
	 */
	int DATA_STREAMS = 39;

	/**
	 * The feature id for the '<em><b>Consists of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STREAMS__CONSISTS_OF = 0;

	/**
	 * The feature id for the '<em><b>Has datastreamattributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STREAMS__HAS_DATASTREAMATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Data Streams</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STREAMS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Streams</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STREAMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.AtomicDataImpl <em>Atomic Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.AtomicDataImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getAtomicData()
	 * @generated
	 */
	int ATOMIC_DATA = 40;

	/**
	 * The feature id for the '<em><b>Has atomicdataattributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA__HAS_ATOMICDATAATTRIBUTES = 0;

	/**
	 * The number of structural features of the '<em>Atomic Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Atomic Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.DataStreamAttributesImpl <em>Data Stream Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.DataStreamAttributesImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getDataStreamAttributes()
	 * @generated
	 */
	int DATA_STREAM_ATTRIBUTES = 41;

	/**
	 * The feature id for the '<em><b>Mean Bit Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STREAM_ATTRIBUTES__MEAN_BIT_RATE = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STREAM_ATTRIBUTES__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Max Bitrate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STREAM_ATTRIBUTES__MAX_BITRATE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STREAM_ATTRIBUTES__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Data Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STREAM_ATTRIBUTES__DATA_FORMAT = 4;

	/**
	 * The feature id for the '<em><b>Data Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STREAM_ATTRIBUTES__DATA_ENCODING = 5;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STREAM_ATTRIBUTES__DEVICE_ID = 6;

	/**
	 * The number of structural features of the '<em>Data Stream Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STREAM_ATTRIBUTES_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Data Stream Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STREAM_ATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.AtomicDataAttributesImpl <em>Atomic Data Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.AtomicDataAttributesImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getAtomicDataAttributes()
	 * @generated
	 */
	int ATOMIC_DATA_ATTRIBUTES = 42;

	/**
	 * The feature id for the '<em><b>Data Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_ATTRIBUTES__DATA_ENCODING = 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_ATTRIBUTES__DEVICE_ID = 1;

	/**
	 * The number of structural features of the '<em>Atomic Data Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_ATTRIBUTES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Atomic Data Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_ATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.Fog_ServicesImpl <em>Fog Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.Fog_ServicesImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getFog_Services()
	 * @generated
	 */
	int FOG_SERVICES = 43;

	/**
	 * The feature id for the '<em><b>Runs in</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SERVICES__RUNS_IN = 0;

	/**
	 * The feature id for the '<em><b>Invokes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SERVICES__INVOKES = 1;

	/**
	 * The feature id for the '<em><b>Invokes fog services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SERVICES__INVOKES_FOG_SERVICES = 2;

	/**
	 * The feature id for the '<em><b>Exposes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SERVICES__EXPOSES = 3;

	/**
	 * The feature id for the '<em><b>Is connected with</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SERVICES__IS_CONNECTED_WITH = 4;

	/**
	 * The number of structural features of the '<em>Fog Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SERVICES_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Fog Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_SERVICES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.OperationsImpl <em>Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.OperationsImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getOperations()
	 * @generated
	 */
	int OPERATIONS = 44;

	/**
	 * The feature id for the '<em><b>Points to processing logic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS__POINTS_TO_PROCESSING_LOGIC = 0;

	/**
	 * The feature id for the '<em><b>Runs in</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS__RUNS_IN = 1;

	/**
	 * The feature id for the '<em><b>Subscribes to</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS__SUBSCRIBES_TO = 2;

	/**
	 * The number of structural features of the '<em>Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.EvaluatorsImpl <em>Evaluators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.EvaluatorsImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getEvaluators()
	 * @generated
	 */
	int EVALUATORS = 45;

	/**
	 * The number of structural features of the '<em>Evaluators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATORS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Evaluators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.JavaEvaluatorImpl <em>Java Evaluator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.JavaEvaluatorImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getJavaEvaluator()
	 * @generated
	 */
	int JAVA_EVALUATOR = 46;

	/**
	 * The number of structural features of the '<em>Java Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EVALUATOR_FEATURE_COUNT = EVALUATORS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Java Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EVALUATOR_OPERATION_COUNT = EVALUATORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.ScriptEvaluatorImpl <em>Script Evaluator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.ScriptEvaluatorImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getScriptEvaluator()
	 * @generated
	 */
	int SCRIPT_EVALUATOR = 48;

	/**
	 * The number of structural features of the '<em>Script Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR_FEATURE_COUNT = EVALUATORS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Script Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR_OPERATION_COUNT = EVALUATORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.AttributeImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ioT_metamodel.impl.DeviceSensorImpl <em>Device Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioT_metamodel.impl.DeviceSensorImpl
	 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getDeviceSensor()
	 * @generated
	 */
	int DEVICE_SENSOR = 50;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SENSOR__HAS = SENSOR__HAS;

	/**
	 * The feature id for the '<em><b>Is attached to</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SENSOR__IS_ATTACHED_TO = SENSOR__IS_ATTACHED_TO;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SENSOR__CONTAINS = SENSOR__CONTAINS;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SENSOR__TECHNOLOGY = SENSOR__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Has rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SENSOR__HAS_RULES = SENSOR__HAS_RULES;

	/**
	 * The feature id for the '<em><b>Devicestate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SENSOR__DEVICESTATE = SENSOR__DEVICESTATE;

	/**
	 * The feature id for the '<em><b>Has communicators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SENSOR__HAS_COMMUNICATORS = SENSOR__HAS_COMMUNICATORS;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SENSOR__HOSTS = SENSOR__HOSTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SENSOR__STATE = SENSOR__STATE;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SENSOR__FREQUENCY = SENSOR__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SENSOR__MONITORS = SENSOR__MONITORS;

	/**
	 * The feature id for the '<em><b>Observes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SENSOR__OBSERVES = SENSOR__OBSERVES;

	/**
	 * The feature id for the '<em><b>Sensor actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SENSOR__SENSOR_ACTIONS = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see ioT_metamodel.Thing
	 * @generated
	 */
	EClass getThing();

	/**
	 * Returns the meta object for the containment reference '{@link ioT_metamodel.Thing#getVirtual_entity <em>Virtual entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Virtual entity</em>'.
	 * @see ioT_metamodel.Thing#getVirtual_entity()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Virtual_entity();

	/**
	 * Returns the meta object for the reference '{@link ioT_metamodel.Thing#getFog <em>Fog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fog</em>'.
	 * @see ioT_metamodel.Thing#getFog()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Fog();

	/**
	 * Returns the meta object for the containment reference '{@link ioT_metamodel.Thing#getPhysical_entity <em>Physical entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Physical entity</em>'.
	 * @see ioT_metamodel.Thing#getPhysical_entity()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Physical_entity();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.Thing#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ioT_metamodel.Thing#getName()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Name();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.Thing#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see ioT_metamodel.Thing#getContains()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Contains();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.Thing#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see ioT_metamodel.Thing#getProperty()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Property();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.VirtualThing <em>Virtual Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Thing</em>'.
	 * @see ioT_metamodel.VirtualThing
	 * @generated
	 */
	EClass getVirtualThing();

	/**
	 * Returns the meta object for the reference '{@link ioT_metamodel.VirtualThing#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represents</em>'.
	 * @see ioT_metamodel.VirtualThing#getRepresents()
	 * @see #getVirtualThing()
	 * @generated
	 */
	EReference getVirtualThing_Represents();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.VirtualThing#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see ioT_metamodel.VirtualThing#getURI()
	 * @see #getVirtualThing()
	 * @generated
	 */
	EAttribute getVirtualThing_URI();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.VirtualThing#getIs_associated_with <em>Is associated with</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is associated with</em>'.
	 * @see ioT_metamodel.VirtualThing#getIs_associated_with()
	 * @see #getVirtualThing()
	 * @generated
	 */
	EReference getVirtualThing_Is_associated_with();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.PhysicalThing <em>Physical Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Thing</em>'.
	 * @see ioT_metamodel.PhysicalThing
	 * @generated
	 */
	EClass getPhysicalThing();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.PhysicalThing#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has</em>'.
	 * @see ioT_metamodel.PhysicalThing#getHas()
	 * @see #getPhysicalThing()
	 * @generated
	 */
	EReference getPhysicalThing_Has();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Fog <em>Fog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fog</em>'.
	 * @see ioT_metamodel.Fog
	 * @generated
	 */
	EClass getFog();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.Fog#getRequest_service <em>Request service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Request service</em>'.
	 * @see ioT_metamodel.Fog#getRequest_service()
	 * @see #getFog()
	 * @generated
	 */
	EReference getFog_Request_service();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.Fog#getFognode <em>Fognode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fognode</em>'.
	 * @see ioT_metamodel.Fog#getFognode()
	 * @see #getFog()
	 * @generated
	 */
	EReference getFog_Fognode();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.Fog#getRequest_cloud_service <em>Request cloud service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Request cloud service</em>'.
	 * @see ioT_metamodel.Fog#getRequest_cloud_service()
	 * @see #getFog()
	 * @generated
	 */
	EReference getFog_Request_cloud_service();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.Fog#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Database</em>'.
	 * @see ioT_metamodel.Fog#getDatabase()
	 * @see #getFog()
	 * @generated
	 */
	EReference getFog_Database();

	/**
	 * Returns the meta object for the reference '{@link ioT_metamodel.Fog#getDefine_control_policies_to <em>Define control policies to</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Define control policies to</em>'.
	 * @see ioT_metamodel.Fog#getDefine_control_policies_to()
	 * @see #getFog()
	 * @generated
	 */
	EReference getFog_Define_control_policies_to();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.FogNode <em>Fog Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fog Node</em>'.
	 * @see ioT_metamodel.FogNode
	 * @generated
	 */
	EClass getFogNode();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.FogNode#getRuns_on_vm <em>Runs on vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runs on vm</em>'.
	 * @see ioT_metamodel.FogNode#getRuns_on_vm()
	 * @see #getFogNode()
	 * @generated
	 */
	EReference getFogNode_Runs_on_vm();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.FogNode#getRuns_in_container <em>Runs in container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runs in container</em>'.
	 * @see ioT_metamodel.FogNode#getRuns_in_container()
	 * @see #getFogNode()
	 * @generated
	 */
	EReference getFogNode_Runs_in_container();

	/**
	 * Returns the meta object for the containment reference '{@link ioT_metamodel.FogNode#getAnalytics_engine <em>Analytics engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Analytics engine</em>'.
	 * @see ioT_metamodel.FogNode#getAnalytics_engine()
	 * @see #getFogNode()
	 * @generated
	 */
	EReference getFogNode_Analytics_engine();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.FogNode#getAssociates_with <em>Associates with</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associates with</em>'.
	 * @see ioT_metamodel.FogNode#getAssociates_with()
	 * @see #getFogNode()
	 * @generated
	 */
	EReference getFogNode_Associates_with();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see ioT_metamodel.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.Device#getIs_attached_to <em>Is attached to</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is attached to</em>'.
	 * @see ioT_metamodel.Device#getIs_attached_to()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Is_attached_to();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.Device#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see ioT_metamodel.Device#getContains()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Contains();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.Device#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technology</em>'.
	 * @see ioT_metamodel.Device#getTechnology()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Technology();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.Device#getHas_rules <em>Has rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has rules</em>'.
	 * @see ioT_metamodel.Device#getHas_rules()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Has_rules();

	/**
	 * Returns the meta object for the containment reference '{@link ioT_metamodel.Device#getDevicestate <em>Devicestate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Devicestate</em>'.
	 * @see ioT_metamodel.Device#getDevicestate()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Devicestate();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.Device#getHas_communicators <em>Has communicators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has communicators</em>'.
	 * @see ioT_metamodel.Device#getHas_communicators()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Has_communicators();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.Device#getHosts <em>Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hosts</em>'.
	 * @see ioT_metamodel.Device#getHosts()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Hosts();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see ioT_metamodel.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.Actuator#getActs <em>Acts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Acts</em>'.
	 * @see ioT_metamodel.Actuator#getActs()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Acts();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.Actuator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ioT_metamodel.Actuator#getName()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_Name();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.Actuator#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actions</em>'.
	 * @see ioT_metamodel.Actuator#getActions()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_Actions();

	/**
	 * Returns the meta object for the reference '{@link ioT_metamodel.Actuator#getObserves <em>Observes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Observes</em>'.
	 * @see ioT_metamodel.Actuator#getObserves()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Observes();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see ioT_metamodel.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ioT_metamodel.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.Tag#getIdentifies <em>Identifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Identifies</em>'.
	 * @see ioT_metamodel.Tag#getIdentifies()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_Identifies();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see ioT_metamodel.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.Sensor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ioT_metamodel.Sensor#getName()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Name();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.Sensor#isState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see ioT_metamodel.Sensor#isState()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_State();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.Sensor#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see ioT_metamodel.Sensor#getFrequency()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Frequency();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.Sensor#getMonitors <em>Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Monitors</em>'.
	 * @see ioT_metamodel.Sensor#getMonitors()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Monitors();

	/**
	 * Returns the meta object for the reference '{@link ioT_metamodel.Sensor#getObserves <em>Observes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Observes</em>'.
	 * @see ioT_metamodel.Sensor#getObserves()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Observes();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see ioT_metamodel.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.Rule#getConditionLiteral <em>Condition Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Literal</em>'.
	 * @see ioT_metamodel.Rule#getConditionLiteral()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_ConditionLiteral();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.Rule#getConditionValue <em>Condition Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Value</em>'.
	 * @see ioT_metamodel.Rule#getConditionValue()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_ConditionValue();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.Rule#getInvolves <em>Involves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Involves</em>'.
	 * @see ioT_metamodel.Rule#getInvolves()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Involves();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.ExternalSensor <em>External Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Sensor</em>'.
	 * @see ioT_metamodel.ExternalSensor
	 * @generated
	 */
	EClass getExternalSensor();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.ExternalSensor#getSensor_actions <em>Sensor actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensor actions</em>'.
	 * @see ioT_metamodel.ExternalSensor#getSensor_actions()
	 * @see #getExternalSensor()
	 * @generated
	 */
	EReference getExternalSensor_Sensor_actions();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.DeviceActuator <em>Device Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Actuator</em>'.
	 * @see ioT_metamodel.DeviceActuator
	 * @generated
	 */
	EClass getDeviceActuator();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.DeviceActuator#getActuator_actions <em>Actuator actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actuator actions</em>'.
	 * @see ioT_metamodel.DeviceActuator#getActuator_actions()
	 * @see #getDeviceActuator()
	 * @generated
	 */
	EReference getDeviceActuator_Actuator_actions();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.ExternalActuator <em>External Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Actuator</em>'.
	 * @see ioT_metamodel.ExternalActuator
	 * @generated
	 */
	EClass getExternalActuator();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.ExternalActuator#getActuator_actions <em>Actuator actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actuator actions</em>'.
	 * @see ioT_metamodel.ExternalActuator#getActuator_actions()
	 * @see #getExternalActuator()
	 * @generated
	 */
	EReference getExternalActuator_Actuator_actions();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see ioT_metamodel.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.DeviceState <em>Device State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device State</em>'.
	 * @see ioT_metamodel.DeviceState
	 * @generated
	 */
	EClass getDeviceState();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.CompositeState <em>Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite State</em>'.
	 * @see ioT_metamodel.CompositeState
	 * @generated
	 */
	EClass getCompositeState();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ioT_metamodel.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.Transition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see ioT_metamodel.Transition#getAction()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Action();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.Transition#getIncoming_states <em>Incoming states</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming states</em>'.
	 * @see ioT_metamodel.Transition#getIncoming_states()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Incoming_states();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.Transition#getOutgoing_states <em>Outgoing states</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing states</em>'.
	 * @see ioT_metamodel.Transition#getOutgoing_states()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Outgoing_states();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Digital_Artifact <em>Digital Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Artifact</em>'.
	 * @see ioT_metamodel.Digital_Artifact
	 * @generated
	 */
	EClass getDigital_Artifact();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Active_Digital_Artifact <em>Active Digital Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Digital Artifact</em>'.
	 * @see ioT_metamodel.Active_Digital_Artifact
	 * @generated
	 */
	EClass getActive_Digital_Artifact();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Passive_Digital_Artifact <em>Passive Digital Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passive Digital Artifact</em>'.
	 * @see ioT_metamodel.Passive_Digital_Artifact
	 * @generated
	 */
	EClass getPassive_Digital_Artifact();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see ioT_metamodel.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.User#getSubscribes_invokes <em>Subscribes invokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscribes invokes</em>'.
	 * @see ioT_metamodel.User#getSubscribes_invokes()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Subscribes_invokes();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Human_User <em>Human User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human User</em>'.
	 * @see ioT_metamodel.Human_User
	 * @generated
	 */
	EClass getHuman_User();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Communicator <em>Communicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communicator</em>'.
	 * @see ioT_metamodel.Communicator
	 * @generated
	 */
	EClass getCommunicator();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.Communicator#getHas_ports <em>Has ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has ports</em>'.
	 * @see ioT_metamodel.Communicator#getHas_ports()
	 * @see #getCommunicator()
	 * @generated
	 */
	EReference getCommunicator_Has_ports();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.Communicator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ioT_metamodel.Communicator#getType()
	 * @see #getCommunicator()
	 * @generated
	 */
	EAttribute getCommunicator_Type();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.Communicator#getPorts_number <em>Ports number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ports number</em>'.
	 * @see ioT_metamodel.Communicator#getPorts_number()
	 * @see #getCommunicator()
	 * @generated
	 */
	EAttribute getCommunicator_Ports_number();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see ioT_metamodel.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.InformationResource <em>Information Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Resource</em>'.
	 * @see ioT_metamodel.InformationResource
	 * @generated
	 */
	EClass getInformationResource();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.InformationResource#getHas_information_about <em>Has information about</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has information about</em>'.
	 * @see ioT_metamodel.InformationResource#getHas_information_about()
	 * @see #getInformationResource()
	 * @generated
	 */
	EReference getInformationResource_Has_information_about();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.InformationResource#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see ioT_metamodel.InformationResource#getHas()
	 * @see #getInformationResource()
	 * @generated
	 */
	EReference getInformationResource_Has();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.On_Device_Resource <em>On Device Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Device Resource</em>'.
	 * @see ioT_metamodel.On_Device_Resource
	 * @generated
	 */
	EClass getOn_Device_Resource();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.On_Device_Resource#getContains_device_resource <em>Contains device resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains device resource</em>'.
	 * @see ioT_metamodel.On_Device_Resource#getContains_device_resource()
	 * @see #getOn_Device_Resource()
	 * @generated
	 */
	EReference getOn_Device_Resource_Contains_device_resource();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.On_Device_Resource#getContains_service_resource <em>Contains service resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains service resource</em>'.
	 * @see ioT_metamodel.On_Device_Resource#getContains_service_resource()
	 * @see #getOn_Device_Resource()
	 * @generated
	 */
	EReference getOn_Device_Resource_Contains_service_resource();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Network_Resource <em>Network Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Resource</em>'.
	 * @see ioT_metamodel.Network_Resource
	 * @generated
	 */
	EClass getNetwork_Resource();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.Network_Resource#getContains_device_resource <em>Contains device resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains device resource</em>'.
	 * @see ioT_metamodel.Network_Resource#getContains_device_resource()
	 * @see #getNetwork_Resource()
	 * @generated
	 */
	EReference getNetwork_Resource_Contains_device_resource();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.Network_Resource#getContains_service_resource <em>Contains service resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains service resource</em>'.
	 * @see ioT_metamodel.Network_Resource#getContains_service_resource()
	 * @see #getNetwork_Resource()
	 * @generated
	 */
	EReference getNetwork_Resource_Contains_service_resource();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Device_Resource <em>Device Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Resource</em>'.
	 * @see ioT_metamodel.Device_Resource
	 * @generated
	 */
	EClass getDevice_Resource();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Service_Resource <em>Service Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Resource</em>'.
	 * @see ioT_metamodel.Service_Resource
	 * @generated
	 */
	EClass getService_Resource();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see ioT_metamodel.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.Property#isChangeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeable</em>'.
	 * @see ioT_metamodel.Property#isChangeable()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Changeable();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.VM <em>VM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM</em>'.
	 * @see ioT_metamodel.VM
	 * @generated
	 */
	EClass getVM();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see ioT_metamodel.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.Container#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see ioT_metamodel.Container#getID()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_ID();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.Container#getIP_address <em>IP address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP address</em>'.
	 * @see ioT_metamodel.Container#getIP_address()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_IP_address();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Analytics_Engine <em>Analytics Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analytics Engine</em>'.
	 * @see ioT_metamodel.Analytics_Engine
	 * @generated
	 */
	EClass getAnalytics_Engine();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Cloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud</em>'.
	 * @see ioT_metamodel.Cloud
	 * @generated
	 */
	EClass getCloud();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.Cloud#getRespond_to_fog <em>Respond to fog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Respond to fog</em>'.
	 * @see ioT_metamodel.Cloud#getRespond_to_fog()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_Respond_to_fog();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see ioT_metamodel.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the containment reference '{@link ioT_metamodel.Database#getPolicy_repository <em>Policy repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy repository</em>'.
	 * @see ioT_metamodel.Database#getPolicy_repository()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Policy_repository();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Policy_Repository <em>Policy Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Repository</em>'.
	 * @see ioT_metamodel.Policy_Repository
	 * @generated
	 */
	EClass getPolicy_Repository();

	/**
	 * Returns the meta object for the reference '{@link ioT_metamodel.Policy_Repository#getInteracts_with <em>Interacts with</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interacts with</em>'.
	 * @see ioT_metamodel.Policy_Repository#getInteracts_with()
	 * @see #getPolicy_Repository()
	 * @generated
	 */
	EReference getPolicy_Repository_Interacts_with();

	/**
	 * Returns the meta object for the containment reference '{@link ioT_metamodel.Policy_Repository#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains</em>'.
	 * @see ioT_metamodel.Policy_Repository#getContains()
	 * @see #getPolicy_Repository()
	 * @generated
	 */
	EReference getPolicy_Repository_Contains();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Reference_Monitor <em>Reference Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Monitor</em>'.
	 * @see ioT_metamodel.Reference_Monitor
	 * @generated
	 */
	EClass getReference_Monitor();

	/**
	 * Returns the meta object for the reference '{@link ioT_metamodel.Reference_Monitor#getOrchestrate_policies <em>Orchestrate policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orchestrate policies</em>'.
	 * @see ioT_metamodel.Reference_Monitor#getOrchestrate_policies()
	 * @see #getReference_Monitor()
	 * @generated
	 */
	EReference getReference_Monitor_Orchestrate_policies();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.Reference_Monitor#getEnforces <em>Enforces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enforces</em>'.
	 * @see ioT_metamodel.Reference_Monitor#getEnforces()
	 * @see #getReference_Monitor()
	 * @generated
	 */
	EReference getReference_Monitor_Enforces();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Authorizor <em>Authorizor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorizor</em>'.
	 * @see ioT_metamodel.Authorizor
	 * @generated
	 */
	EClass getAuthorizor();

	/**
	 * Returns the meta object for the reference '{@link ioT_metamodel.Authorizor#getConnects_with <em>Connects with</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connects with</em>'.
	 * @see ioT_metamodel.Authorizor#getConnects_with()
	 * @see #getAuthorizor()
	 * @generated
	 */
	EReference getAuthorizor_Connects_with();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see ioT_metamodel.Information
	 * @generated
	 */
	EClass getInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.Information#getAtomicdata <em>Atomicdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atomicdata</em>'.
	 * @see ioT_metamodel.Information#getAtomicdata()
	 * @see #getInformation()
	 * @generated
	 */
	EReference getInformation_Atomicdata();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.Information#getDatastreams <em>Datastreams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datastreams</em>'.
	 * @see ioT_metamodel.Information#getDatastreams()
	 * @see #getInformation()
	 * @generated
	 */
	EReference getInformation_Datastreams();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.DataStreams <em>Data Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Streams</em>'.
	 * @see ioT_metamodel.DataStreams
	 * @generated
	 */
	EClass getDataStreams();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.DataStreams#getConsists_of <em>Consists of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consists of</em>'.
	 * @see ioT_metamodel.DataStreams#getConsists_of()
	 * @see #getDataStreams()
	 * @generated
	 */
	EReference getDataStreams_Consists_of();

	/**
	 * Returns the meta object for the reference '{@link ioT_metamodel.DataStreams#getHas_datastreamattributes <em>Has datastreamattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has datastreamattributes</em>'.
	 * @see ioT_metamodel.DataStreams#getHas_datastreamattributes()
	 * @see #getDataStreams()
	 * @generated
	 */
	EReference getDataStreams_Has_datastreamattributes();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.AtomicData <em>Atomic Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Data</em>'.
	 * @see ioT_metamodel.AtomicData
	 * @generated
	 */
	EClass getAtomicData();

	/**
	 * Returns the meta object for the reference '{@link ioT_metamodel.AtomicData#getHas_atomicdataattributes <em>Has atomicdataattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has atomicdataattributes</em>'.
	 * @see ioT_metamodel.AtomicData#getHas_atomicdataattributes()
	 * @see #getAtomicData()
	 * @generated
	 */
	EReference getAtomicData_Has_atomicdataattributes();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.DataStreamAttributes <em>Data Stream Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Stream Attributes</em>'.
	 * @see ioT_metamodel.DataStreamAttributes
	 * @generated
	 */
	EClass getDataStreamAttributes();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.DataStreamAttributes#getMeanBitRate <em>Mean Bit Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Bit Rate</em>'.
	 * @see ioT_metamodel.DataStreamAttributes#getMeanBitRate()
	 * @see #getDataStreamAttributes()
	 * @generated
	 */
	EAttribute getDataStreamAttributes_MeanBitRate();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.DataStreamAttributes#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see ioT_metamodel.DataStreamAttributes#getTimestamp()
	 * @see #getDataStreamAttributes()
	 * @generated
	 */
	EAttribute getDataStreamAttributes_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.DataStreamAttributes#getMaxBitrate <em>Max Bitrate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Bitrate</em>'.
	 * @see ioT_metamodel.DataStreamAttributes#getMaxBitrate()
	 * @see #getDataStreamAttributes()
	 * @generated
	 */
	EAttribute getDataStreamAttributes_MaxBitrate();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.DataStreamAttributes#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ioT_metamodel.DataStreamAttributes#getDescription()
	 * @see #getDataStreamAttributes()
	 * @generated
	 */
	EAttribute getDataStreamAttributes_Description();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.DataStreamAttributes#getDataFormat <em>Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Format</em>'.
	 * @see ioT_metamodel.DataStreamAttributes#getDataFormat()
	 * @see #getDataStreamAttributes()
	 * @generated
	 */
	EAttribute getDataStreamAttributes_DataFormat();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.DataStreamAttributes#getDataEncoding <em>Data Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Encoding</em>'.
	 * @see ioT_metamodel.DataStreamAttributes#getDataEncoding()
	 * @see #getDataStreamAttributes()
	 * @generated
	 */
	EAttribute getDataStreamAttributes_DataEncoding();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.DataStreamAttributes#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see ioT_metamodel.DataStreamAttributes#getDeviceID()
	 * @see #getDataStreamAttributes()
	 * @generated
	 */
	EAttribute getDataStreamAttributes_DeviceID();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.AtomicDataAttributes <em>Atomic Data Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Data Attributes</em>'.
	 * @see ioT_metamodel.AtomicDataAttributes
	 * @generated
	 */
	EClass getAtomicDataAttributes();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.AtomicDataAttributes#getDataEncoding <em>Data Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Encoding</em>'.
	 * @see ioT_metamodel.AtomicDataAttributes#getDataEncoding()
	 * @see #getAtomicDataAttributes()
	 * @generated
	 */
	EAttribute getAtomicDataAttributes_DataEncoding();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.AtomicDataAttributes#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see ioT_metamodel.AtomicDataAttributes#getDeviceID()
	 * @see #getAtomicDataAttributes()
	 * @generated
	 */
	EAttribute getAtomicDataAttributes_DeviceID();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Fog_Services <em>Fog Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fog Services</em>'.
	 * @see ioT_metamodel.Fog_Services
	 * @generated
	 */
	EClass getFog_Services();

	/**
	 * Returns the meta object for the reference '{@link ioT_metamodel.Fog_Services#getRuns_in <em>Runs in</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runs in</em>'.
	 * @see ioT_metamodel.Fog_Services#getRuns_in()
	 * @see #getFog_Services()
	 * @generated
	 */
	EReference getFog_Services_Runs_in();

	/**
	 * Returns the meta object for the containment reference list '{@link ioT_metamodel.Fog_Services#getInvokes <em>Invokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invokes</em>'.
	 * @see ioT_metamodel.Fog_Services#getInvokes()
	 * @see #getFog_Services()
	 * @generated
	 */
	EReference getFog_Services_Invokes();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.Fog_Services#getInvokes_fog_services <em>Invokes fog services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invokes fog services</em>'.
	 * @see ioT_metamodel.Fog_Services#getInvokes_fog_services()
	 * @see #getFog_Services()
	 * @generated
	 */
	EReference getFog_Services_Invokes_fog_services();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.Fog_Services#getExposes <em>Exposes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exposes</em>'.
	 * @see ioT_metamodel.Fog_Services#getExposes()
	 * @see #getFog_Services()
	 * @generated
	 */
	EReference getFog_Services_Exposes();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.Fog_Services#getIs_connected_with <em>Is connected with</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is connected with</em>'.
	 * @see ioT_metamodel.Fog_Services#getIs_connected_with()
	 * @see #getFog_Services()
	 * @generated
	 */
	EReference getFog_Services_Is_connected_with();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Operations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operations</em>'.
	 * @see ioT_metamodel.Operations
	 * @generated
	 */
	EClass getOperations();

	/**
	 * Returns the meta object for the reference '{@link ioT_metamodel.Operations#getPoints_to_processing_logic <em>Points to processing logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Points to processing logic</em>'.
	 * @see ioT_metamodel.Operations#getPoints_to_processing_logic()
	 * @see #getOperations()
	 * @generated
	 */
	EReference getOperations_Points_to_processing_logic();

	/**
	 * Returns the meta object for the reference '{@link ioT_metamodel.Operations#getRuns_in <em>Runs in</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runs in</em>'.
	 * @see ioT_metamodel.Operations#getRuns_in()
	 * @see #getOperations()
	 * @generated
	 */
	EReference getOperations_Runs_in();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.Operations#getSubscribes_to <em>Subscribes to</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscribes to</em>'.
	 * @see ioT_metamodel.Operations#getSubscribes_to()
	 * @see #getOperations()
	 * @generated
	 */
	EReference getOperations_Subscribes_to();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Evaluators <em>Evaluators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluators</em>'.
	 * @see ioT_metamodel.Evaluators
	 * @generated
	 */
	EClass getEvaluators();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.JavaEvaluator <em>Java Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Evaluator</em>'.
	 * @see ioT_metamodel.JavaEvaluator
	 * @generated
	 */
	EClass getJavaEvaluator();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see ioT_metamodel.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.ScriptEvaluator <em>Script Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Evaluator</em>'.
	 * @see ioT_metamodel.ScriptEvaluator
	 * @generated
	 */
	EClass getScriptEvaluator();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see ioT_metamodel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ioT_metamodel.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link ioT_metamodel.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ioT_metamodel.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link ioT_metamodel.DeviceSensor <em>Device Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Sensor</em>'.
	 * @see ioT_metamodel.DeviceSensor
	 * @generated
	 */
	EClass getDeviceSensor();

	/**
	 * Returns the meta object for the reference list '{@link ioT_metamodel.DeviceSensor#getSensor_actions <em>Sensor actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensor actions</em>'.
	 * @see ioT_metamodel.DeviceSensor#getSensor_actions()
	 * @see #getDeviceSensor()
	 * @generated
	 */
	EReference getDeviceSensor_Sensor_actions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IoT_metamodelFactory getIoT_metamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.ThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.ThingImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getThing()
		 * @generated
		 */
		EClass THING = eINSTANCE.getThing();

		/**
		 * The meta object literal for the '<em><b>Virtual entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__VIRTUAL_ENTITY = eINSTANCE.getThing_Virtual_entity();

		/**
		 * The meta object literal for the '<em><b>Fog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__FOG = eINSTANCE.getThing_Fog();

		/**
		 * The meta object literal for the '<em><b>Physical entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__PHYSICAL_ENTITY = eINSTANCE.getThing_Physical_entity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__NAME = eINSTANCE.getThing_Name();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__CONTAINS = eINSTANCE.getThing_Contains();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__PROPERTY = eINSTANCE.getThing_Property();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.VirtualThingImpl <em>Virtual Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.VirtualThingImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getVirtualThing()
		 * @generated
		 */
		EClass VIRTUAL_THING = eINSTANCE.getVirtualThing();

		/**
		 * The meta object literal for the '<em><b>Represents</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_THING__REPRESENTS = eINSTANCE.getVirtualThing_Represents();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_THING__URI = eINSTANCE.getVirtualThing_URI();

		/**
		 * The meta object literal for the '<em><b>Is associated with</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_THING__IS_ASSOCIATED_WITH = eINSTANCE.getVirtualThing_Is_associated_with();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.PhysicalThingImpl <em>Physical Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.PhysicalThingImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getPhysicalThing()
		 * @generated
		 */
		EClass PHYSICAL_THING = eINSTANCE.getPhysicalThing();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_THING__HAS = eINSTANCE.getPhysicalThing_Has();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.FogImpl <em>Fog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.FogImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getFog()
		 * @generated
		 */
		EClass FOG = eINSTANCE.getFog();

		/**
		 * The meta object literal for the '<em><b>Request service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG__REQUEST_SERVICE = eINSTANCE.getFog_Request_service();

		/**
		 * The meta object literal for the '<em><b>Fognode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG__FOGNODE = eINSTANCE.getFog_Fognode();

		/**
		 * The meta object literal for the '<em><b>Request cloud service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG__REQUEST_CLOUD_SERVICE = eINSTANCE.getFog_Request_cloud_service();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG__DATABASE = eINSTANCE.getFog_Database();

		/**
		 * The meta object literal for the '<em><b>Define control policies to</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG__DEFINE_CONTROL_POLICIES_TO = eINSTANCE.getFog_Define_control_policies_to();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.FogNodeImpl <em>Fog Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.FogNodeImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getFogNode()
		 * @generated
		 */
		EClass FOG_NODE = eINSTANCE.getFogNode();

		/**
		 * The meta object literal for the '<em><b>Runs on vm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_NODE__RUNS_ON_VM = eINSTANCE.getFogNode_Runs_on_vm();

		/**
		 * The meta object literal for the '<em><b>Runs in container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_NODE__RUNS_IN_CONTAINER = eINSTANCE.getFogNode_Runs_in_container();

		/**
		 * The meta object literal for the '<em><b>Analytics engine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_NODE__ANALYTICS_ENGINE = eINSTANCE.getFogNode_Analytics_engine();

		/**
		 * The meta object literal for the '<em><b>Associates with</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_NODE__ASSOCIATES_WITH = eINSTANCE.getFogNode_Associates_with();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.DeviceImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Is attached to</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__IS_ATTACHED_TO = eINSTANCE.getDevice_Is_attached_to();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__CONTAINS = eINSTANCE.getDevice_Contains();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__TECHNOLOGY = eINSTANCE.getDevice_Technology();

		/**
		 * The meta object literal for the '<em><b>Has rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__HAS_RULES = eINSTANCE.getDevice_Has_rules();

		/**
		 * The meta object literal for the '<em><b>Devicestate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__DEVICESTATE = eINSTANCE.getDevice_Devicestate();

		/**
		 * The meta object literal for the '<em><b>Has communicators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__HAS_COMMUNICATORS = eINSTANCE.getDevice_Has_communicators();

		/**
		 * The meta object literal for the '<em><b>Hosts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__HOSTS = eINSTANCE.getDevice_Hosts();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.ActuatorImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Acts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__ACTS = eINSTANCE.getActuator_Acts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__NAME = eINSTANCE.getActuator_Name();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__ACTIONS = eINSTANCE.getActuator_Actions();

		/**
		 * The meta object literal for the '<em><b>Observes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__OBSERVES = eINSTANCE.getActuator_Observes();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.TagImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.getTag_Name();

		/**
		 * The meta object literal for the '<em><b>Identifies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__IDENTIFIES = eINSTANCE.getTag_Identifies();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.SensorImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__NAME = eINSTANCE.getSensor_Name();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__STATE = eINSTANCE.getSensor_State();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__FREQUENCY = eINSTANCE.getSensor_Frequency();

		/**
		 * The meta object literal for the '<em><b>Monitors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__MONITORS = eINSTANCE.getSensor_Monitors();

		/**
		 * The meta object literal for the '<em><b>Observes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__OBSERVES = eINSTANCE.getSensor_Observes();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.RuleImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Condition Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__CONDITION_LITERAL = eINSTANCE.getRule_ConditionLiteral();

		/**
		 * The meta object literal for the '<em><b>Condition Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__CONDITION_VALUE = eINSTANCE.getRule_ConditionValue();

		/**
		 * The meta object literal for the '<em><b>Involves</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__INVOLVES = eINSTANCE.getRule_Involves();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.ExternalSensorImpl <em>External Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.ExternalSensorImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getExternalSensor()
		 * @generated
		 */
		EClass EXTERNAL_SENSOR = eINSTANCE.getExternalSensor();

		/**
		 * The meta object literal for the '<em><b>Sensor actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_SENSOR__SENSOR_ACTIONS = eINSTANCE.getExternalSensor_Sensor_actions();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.DeviceActuatorImpl <em>Device Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.DeviceActuatorImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getDeviceActuator()
		 * @generated
		 */
		EClass DEVICE_ACTUATOR = eINSTANCE.getDeviceActuator();

		/**
		 * The meta object literal for the '<em><b>Actuator actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_ACTUATOR__ACTUATOR_ACTIONS = eINSTANCE.getDeviceActuator_Actuator_actions();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.ExternalActuatorImpl <em>External Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.ExternalActuatorImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getExternalActuator()
		 * @generated
		 */
		EClass EXTERNAL_ACTUATOR = eINSTANCE.getExternalActuator();

		/**
		 * The meta object literal for the '<em><b>Actuator actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_ACTUATOR__ACTUATOR_ACTIONS = eINSTANCE.getExternalActuator_Actuator_actions();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.ActionImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.DeviceStateImpl <em>Device State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.DeviceStateImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getDeviceState()
		 * @generated
		 */
		EClass DEVICE_STATE = eINSTANCE.getDeviceState();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.CompositeStateImpl <em>Composite State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.CompositeStateImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getCompositeState()
		 * @generated
		 */
		EClass COMPOSITE_STATE = eINSTANCE.getCompositeState();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.TransitionImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ACTION = eINSTANCE.getTransition_Action();

		/**
		 * The meta object literal for the '<em><b>Incoming states</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__INCOMING_STATES = eINSTANCE.getTransition_Incoming_states();

		/**
		 * The meta object literal for the '<em><b>Outgoing states</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OUTGOING_STATES = eINSTANCE.getTransition_Outgoing_states();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.Digital_ArtifactImpl <em>Digital Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.Digital_ArtifactImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getDigital_Artifact()
		 * @generated
		 */
		EClass DIGITAL_ARTIFACT = eINSTANCE.getDigital_Artifact();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.Active_Digital_ArtifactImpl <em>Active Digital Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.Active_Digital_ArtifactImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getActive_Digital_Artifact()
		 * @generated
		 */
		EClass ACTIVE_DIGITAL_ARTIFACT = eINSTANCE.getActive_Digital_Artifact();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.Passive_Digital_ArtifactImpl <em>Passive Digital Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.Passive_Digital_ArtifactImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getPassive_Digital_Artifact()
		 * @generated
		 */
		EClass PASSIVE_DIGITAL_ARTIFACT = eINSTANCE.getPassive_Digital_Artifact();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.UserImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Subscribes invokes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__SUBSCRIBES_INVOKES = eINSTANCE.getUser_Subscribes_invokes();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.Human_UserImpl <em>Human User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.Human_UserImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getHuman_User()
		 * @generated
		 */
		EClass HUMAN_USER = eINSTANCE.getHuman_User();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.CommunicatorImpl <em>Communicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.CommunicatorImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getCommunicator()
		 * @generated
		 */
		EClass COMMUNICATOR = eINSTANCE.getCommunicator();

		/**
		 * The meta object literal for the '<em><b>Has ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATOR__HAS_PORTS = eINSTANCE.getCommunicator_Has_ports();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATOR__TYPE = eINSTANCE.getCommunicator_Type();

		/**
		 * The meta object literal for the '<em><b>Ports number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATOR__PORTS_NUMBER = eINSTANCE.getCommunicator_Ports_number();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.PortImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.InformationResourceImpl <em>Information Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.InformationResourceImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getInformationResource()
		 * @generated
		 */
		EClass INFORMATION_RESOURCE = eINSTANCE.getInformationResource();

		/**
		 * The meta object literal for the '<em><b>Has information about</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_RESOURCE__HAS_INFORMATION_ABOUT = eINSTANCE.getInformationResource_Has_information_about();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_RESOURCE__HAS = eINSTANCE.getInformationResource_Has();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.On_Device_ResourceImpl <em>On Device Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.On_Device_ResourceImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getOn_Device_Resource()
		 * @generated
		 */
		EClass ON_DEVICE_RESOURCE = eINSTANCE.getOn_Device_Resource();

		/**
		 * The meta object literal for the '<em><b>Contains device resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_DEVICE_RESOURCE__CONTAINS_DEVICE_RESOURCE = eINSTANCE.getOn_Device_Resource_Contains_device_resource();

		/**
		 * The meta object literal for the '<em><b>Contains service resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_DEVICE_RESOURCE__CONTAINS_SERVICE_RESOURCE = eINSTANCE.getOn_Device_Resource_Contains_service_resource();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.Network_ResourceImpl <em>Network Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.Network_ResourceImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getNetwork_Resource()
		 * @generated
		 */
		EClass NETWORK_RESOURCE = eINSTANCE.getNetwork_Resource();

		/**
		 * The meta object literal for the '<em><b>Contains device resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_RESOURCE__CONTAINS_DEVICE_RESOURCE = eINSTANCE.getNetwork_Resource_Contains_device_resource();

		/**
		 * The meta object literal for the '<em><b>Contains service resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_RESOURCE__CONTAINS_SERVICE_RESOURCE = eINSTANCE.getNetwork_Resource_Contains_service_resource();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.Device_ResourceImpl <em>Device Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.Device_ResourceImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getDevice_Resource()
		 * @generated
		 */
		EClass DEVICE_RESOURCE = eINSTANCE.getDevice_Resource();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.Service_ResourceImpl <em>Service Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.Service_ResourceImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getService_Resource()
		 * @generated
		 */
		EClass SERVICE_RESOURCE = eINSTANCE.getService_Resource();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.PropertyImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__CHANGEABLE = eINSTANCE.getProperty_Changeable();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.VMImpl <em>VM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.VMImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getVM()
		 * @generated
		 */
		EClass VM = eINSTANCE.getVM();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.ContainerImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__ID = eINSTANCE.getContainer_ID();

		/**
		 * The meta object literal for the '<em><b>IP address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__IP_ADDRESS = eINSTANCE.getContainer_IP_address();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.Analytics_EngineImpl <em>Analytics Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.Analytics_EngineImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getAnalytics_Engine()
		 * @generated
		 */
		EClass ANALYTICS_ENGINE = eINSTANCE.getAnalytics_Engine();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.CloudImpl <em>Cloud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.CloudImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getCloud()
		 * @generated
		 */
		EClass CLOUD = eINSTANCE.getCloud();

		/**
		 * The meta object literal for the '<em><b>Respond to fog</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__RESPOND_TO_FOG = eINSTANCE.getCloud_Respond_to_fog();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.DatabaseImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Policy repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__POLICY_REPOSITORY = eINSTANCE.getDatabase_Policy_repository();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.Policy_RepositoryImpl <em>Policy Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.Policy_RepositoryImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getPolicy_Repository()
		 * @generated
		 */
		EClass POLICY_REPOSITORY = eINSTANCE.getPolicy_Repository();

		/**
		 * The meta object literal for the '<em><b>Interacts with</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_REPOSITORY__INTERACTS_WITH = eINSTANCE.getPolicy_Repository_Interacts_with();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_REPOSITORY__CONTAINS = eINSTANCE.getPolicy_Repository_Contains();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.Reference_MonitorImpl <em>Reference Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.Reference_MonitorImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getReference_Monitor()
		 * @generated
		 */
		EClass REFERENCE_MONITOR = eINSTANCE.getReference_Monitor();

		/**
		 * The meta object literal for the '<em><b>Orchestrate policies</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_MONITOR__ORCHESTRATE_POLICIES = eINSTANCE.getReference_Monitor_Orchestrate_policies();

		/**
		 * The meta object literal for the '<em><b>Enforces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_MONITOR__ENFORCES = eINSTANCE.getReference_Monitor_Enforces();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.AuthorizorImpl <em>Authorizor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.AuthorizorImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getAuthorizor()
		 * @generated
		 */
		EClass AUTHORIZOR = eINSTANCE.getAuthorizor();

		/**
		 * The meta object literal for the '<em><b>Connects with</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZOR__CONNECTS_WITH = eINSTANCE.getAuthorizor_Connects_with();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.InformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.InformationImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getInformation()
		 * @generated
		 */
		EClass INFORMATION = eINSTANCE.getInformation();

		/**
		 * The meta object literal for the '<em><b>Atomicdata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION__ATOMICDATA = eINSTANCE.getInformation_Atomicdata();

		/**
		 * The meta object literal for the '<em><b>Datastreams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION__DATASTREAMS = eINSTANCE.getInformation_Datastreams();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.DataStreamsImpl <em>Data Streams</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.DataStreamsImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getDataStreams()
		 * @generated
		 */
		EClass DATA_STREAMS = eINSTANCE.getDataStreams();

		/**
		 * The meta object literal for the '<em><b>Consists of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STREAMS__CONSISTS_OF = eINSTANCE.getDataStreams_Consists_of();

		/**
		 * The meta object literal for the '<em><b>Has datastreamattributes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STREAMS__HAS_DATASTREAMATTRIBUTES = eINSTANCE.getDataStreams_Has_datastreamattributes();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.AtomicDataImpl <em>Atomic Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.AtomicDataImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getAtomicData()
		 * @generated
		 */
		EClass ATOMIC_DATA = eINSTANCE.getAtomicData();

		/**
		 * The meta object literal for the '<em><b>Has atomicdataattributes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_DATA__HAS_ATOMICDATAATTRIBUTES = eINSTANCE.getAtomicData_Has_atomicdataattributes();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.DataStreamAttributesImpl <em>Data Stream Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.DataStreamAttributesImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getDataStreamAttributes()
		 * @generated
		 */
		EClass DATA_STREAM_ATTRIBUTES = eINSTANCE.getDataStreamAttributes();

		/**
		 * The meta object literal for the '<em><b>Mean Bit Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STREAM_ATTRIBUTES__MEAN_BIT_RATE = eINSTANCE.getDataStreamAttributes_MeanBitRate();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STREAM_ATTRIBUTES__TIMESTAMP = eINSTANCE.getDataStreamAttributes_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Max Bitrate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STREAM_ATTRIBUTES__MAX_BITRATE = eINSTANCE.getDataStreamAttributes_MaxBitrate();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STREAM_ATTRIBUTES__DESCRIPTION = eINSTANCE.getDataStreamAttributes_Description();

		/**
		 * The meta object literal for the '<em><b>Data Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STREAM_ATTRIBUTES__DATA_FORMAT = eINSTANCE.getDataStreamAttributes_DataFormat();

		/**
		 * The meta object literal for the '<em><b>Data Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STREAM_ATTRIBUTES__DATA_ENCODING = eINSTANCE.getDataStreamAttributes_DataEncoding();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STREAM_ATTRIBUTES__DEVICE_ID = eINSTANCE.getDataStreamAttributes_DeviceID();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.AtomicDataAttributesImpl <em>Atomic Data Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.AtomicDataAttributesImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getAtomicDataAttributes()
		 * @generated
		 */
		EClass ATOMIC_DATA_ATTRIBUTES = eINSTANCE.getAtomicDataAttributes();

		/**
		 * The meta object literal for the '<em><b>Data Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_DATA_ATTRIBUTES__DATA_ENCODING = eINSTANCE.getAtomicDataAttributes_DataEncoding();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_DATA_ATTRIBUTES__DEVICE_ID = eINSTANCE.getAtomicDataAttributes_DeviceID();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.Fog_ServicesImpl <em>Fog Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.Fog_ServicesImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getFog_Services()
		 * @generated
		 */
		EClass FOG_SERVICES = eINSTANCE.getFog_Services();

		/**
		 * The meta object literal for the '<em><b>Runs in</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_SERVICES__RUNS_IN = eINSTANCE.getFog_Services_Runs_in();

		/**
		 * The meta object literal for the '<em><b>Invokes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_SERVICES__INVOKES = eINSTANCE.getFog_Services_Invokes();

		/**
		 * The meta object literal for the '<em><b>Invokes fog services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_SERVICES__INVOKES_FOG_SERVICES = eINSTANCE.getFog_Services_Invokes_fog_services();

		/**
		 * The meta object literal for the '<em><b>Exposes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_SERVICES__EXPOSES = eINSTANCE.getFog_Services_Exposes();

		/**
		 * The meta object literal for the '<em><b>Is connected with</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_SERVICES__IS_CONNECTED_WITH = eINSTANCE.getFog_Services_Is_connected_with();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.OperationsImpl <em>Operations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.OperationsImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getOperations()
		 * @generated
		 */
		EClass OPERATIONS = eINSTANCE.getOperations();

		/**
		 * The meta object literal for the '<em><b>Points to processing logic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS__POINTS_TO_PROCESSING_LOGIC = eINSTANCE.getOperations_Points_to_processing_logic();

		/**
		 * The meta object literal for the '<em><b>Runs in</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS__RUNS_IN = eINSTANCE.getOperations_Runs_in();

		/**
		 * The meta object literal for the '<em><b>Subscribes to</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS__SUBSCRIBES_TO = eINSTANCE.getOperations_Subscribes_to();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.EvaluatorsImpl <em>Evaluators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.EvaluatorsImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getEvaluators()
		 * @generated
		 */
		EClass EVALUATORS = eINSTANCE.getEvaluators();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.JavaEvaluatorImpl <em>Java Evaluator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.JavaEvaluatorImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getJavaEvaluator()
		 * @generated
		 */
		EClass JAVA_EVALUATOR = eINSTANCE.getJavaEvaluator();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.EntityImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.ScriptEvaluatorImpl <em>Script Evaluator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.ScriptEvaluatorImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getScriptEvaluator()
		 * @generated
		 */
		EClass SCRIPT_EVALUATOR = eINSTANCE.getScriptEvaluator();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.AttributeImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link ioT_metamodel.impl.DeviceSensorImpl <em>Device Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioT_metamodel.impl.DeviceSensorImpl
		 * @see ioT_metamodel.impl.IoT_metamodelPackageImpl#getDeviceSensor()
		 * @generated
		 */
		EClass DEVICE_SENSOR = eINSTANCE.getDeviceSensor();

		/**
		 * The meta object literal for the '<em><b>Sensor actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_SENSOR__SENSOR_ACTIONS = eINSTANCE.getDeviceSensor_Sensor_actions();

	}

} //IoT_metamodelPackage
