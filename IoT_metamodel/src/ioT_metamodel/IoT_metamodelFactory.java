/**
 */
package ioT_metamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ioT_metamodel.IoT_metamodelPackage
 * @generated
 */
public interface IoT_metamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IoT_metamodelFactory eINSTANCE = ioT_metamodel.impl.IoT_metamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thing</em>'.
	 * @generated
	 */
	Thing createThing();

	/**
	 * Returns a new object of class '<em>Virtual Thing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Thing</em>'.
	 * @generated
	 */
	VirtualThing createVirtualThing();

	/**
	 * Returns a new object of class '<em>Physical Thing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Thing</em>'.
	 * @generated
	 */
	PhysicalThing createPhysicalThing();

	/**
	 * Returns a new object of class '<em>Fog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fog</em>'.
	 * @generated
	 */
	Fog createFog();

	/**
	 * Returns a new object of class '<em>Fog Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fog Node</em>'.
	 * @generated
	 */
	FogNode createFogNode();

	/**
	 * Returns a new object of class '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device</em>'.
	 * @generated
	 */
	Device createDevice();

	/**
	 * Returns a new object of class '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator</em>'.
	 * @generated
	 */
	Actuator createActuator();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>External Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Sensor</em>'.
	 * @generated
	 */
	ExternalSensor createExternalSensor();

	/**
	 * Returns a new object of class '<em>Device Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Actuator</em>'.
	 * @generated
	 */
	DeviceActuator createDeviceActuator();

	/**
	 * Returns a new object of class '<em>External Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Actuator</em>'.
	 * @generated
	 */
	ExternalActuator createExternalActuator();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Device State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device State</em>'.
	 * @generated
	 */
	DeviceState createDeviceState();

	/**
	 * Returns a new object of class '<em>Composite State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite State</em>'.
	 * @generated
	 */
	CompositeState createCompositeState();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Digital Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Artifact</em>'.
	 * @generated
	 */
	Digital_Artifact createDigital_Artifact();

	/**
	 * Returns a new object of class '<em>Active Digital Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Active Digital Artifact</em>'.
	 * @generated
	 */
	Active_Digital_Artifact createActive_Digital_Artifact();

	/**
	 * Returns a new object of class '<em>Passive Digital Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passive Digital Artifact</em>'.
	 * @generated
	 */
	Passive_Digital_Artifact createPassive_Digital_Artifact();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Human User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Human User</em>'.
	 * @generated
	 */
	Human_User createHuman_User();

	/**
	 * Returns a new object of class '<em>Communicator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communicator</em>'.
	 * @generated
	 */
	Communicator createCommunicator();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Information Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Resource</em>'.
	 * @generated
	 */
	InformationResource createInformationResource();

	/**
	 * Returns a new object of class '<em>On Device Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Device Resource</em>'.
	 * @generated
	 */
	On_Device_Resource createOn_Device_Resource();

	/**
	 * Returns a new object of class '<em>Network Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Resource</em>'.
	 * @generated
	 */
	Network_Resource createNetwork_Resource();

	/**
	 * Returns a new object of class '<em>Device Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Resource</em>'.
	 * @generated
	 */
	Device_Resource createDevice_Resource();

	/**
	 * Returns a new object of class '<em>Service Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Resource</em>'.
	 * @generated
	 */
	Service_Resource createService_Resource();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM</em>'.
	 * @generated
	 */
	VM createVM();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Analytics Engine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analytics Engine</em>'.
	 * @generated
	 */
	Analytics_Engine createAnalytics_Engine();

	/**
	 * Returns a new object of class '<em>Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud</em>'.
	 * @generated
	 */
	Cloud createCloud();

	/**
	 * Returns a new object of class '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database</em>'.
	 * @generated
	 */
	Database createDatabase();

	/**
	 * Returns a new object of class '<em>Policy Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy Repository</em>'.
	 * @generated
	 */
	Policy_Repository createPolicy_Repository();

	/**
	 * Returns a new object of class '<em>Reference Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Monitor</em>'.
	 * @generated
	 */
	Reference_Monitor createReference_Monitor();

	/**
	 * Returns a new object of class '<em>Authorizor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorizor</em>'.
	 * @generated
	 */
	Authorizor createAuthorizor();

	/**
	 * Returns a new object of class '<em>Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information</em>'.
	 * @generated
	 */
	Information createInformation();

	/**
	 * Returns a new object of class '<em>Data Streams</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Streams</em>'.
	 * @generated
	 */
	DataStreams createDataStreams();

	/**
	 * Returns a new object of class '<em>Atomic Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Data</em>'.
	 * @generated
	 */
	AtomicData createAtomicData();

	/**
	 * Returns a new object of class '<em>Data Stream Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Stream Attributes</em>'.
	 * @generated
	 */
	DataStreamAttributes createDataStreamAttributes();

	/**
	 * Returns a new object of class '<em>Atomic Data Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Data Attributes</em>'.
	 * @generated
	 */
	AtomicDataAttributes createAtomicDataAttributes();

	/**
	 * Returns a new object of class '<em>Fog Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fog Services</em>'.
	 * @generated
	 */
	Fog_Services createFog_Services();

	/**
	 * Returns a new object of class '<em>Operations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operations</em>'.
	 * @generated
	 */
	Operations createOperations();

	/**
	 * Returns a new object of class '<em>Java Evaluator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Evaluator</em>'.
	 * @generated
	 */
	JavaEvaluator createJavaEvaluator();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Script Evaluator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script Evaluator</em>'.
	 * @generated
	 */
	ScriptEvaluator createScriptEvaluator();

	/**
	 * Returns a new object of class '<em>Device Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Sensor</em>'.
	 * @generated
	 */
	DeviceSensor createDeviceSensor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IoT_metamodelPackage getIoT_metamodelPackage();

} //IoT_metamodelFactory
