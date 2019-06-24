/**
 */
package ioT_metamodel.impl;

import ioT_metamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IoT_metamodelFactoryImpl extends EFactoryImpl implements IoT_metamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IoT_metamodelFactory init() {
		try {
			IoT_metamodelFactory theIoT_metamodelFactory = (IoT_metamodelFactory)EPackage.Registry.INSTANCE.getEFactory(IoT_metamodelPackage.eNS_URI);
			if (theIoT_metamodelFactory != null) {
				return theIoT_metamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IoT_metamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoT_metamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IoT_metamodelPackage.THING: return createThing();
			case IoT_metamodelPackage.VIRTUAL_THING: return createVirtualThing();
			case IoT_metamodelPackage.PHYSICAL_THING: return createPhysicalThing();
			case IoT_metamodelPackage.FOG: return createFog();
			case IoT_metamodelPackage.FOG_NODE: return createFogNode();
			case IoT_metamodelPackage.DEVICE: return createDevice();
			case IoT_metamodelPackage.ACTUATOR: return createActuator();
			case IoT_metamodelPackage.TAG: return createTag();
			case IoT_metamodelPackage.RULE: return createRule();
			case IoT_metamodelPackage.EXTERNAL_SENSOR: return createExternalSensor();
			case IoT_metamodelPackage.DEVICE_ACTUATOR: return createDeviceActuator();
			case IoT_metamodelPackage.EXTERNAL_ACTUATOR: return createExternalActuator();
			case IoT_metamodelPackage.ACTION: return createAction();
			case IoT_metamodelPackage.DEVICE_STATE: return createDeviceState();
			case IoT_metamodelPackage.COMPOSITE_STATE: return createCompositeState();
			case IoT_metamodelPackage.TRANSITION: return createTransition();
			case IoT_metamodelPackage.DIGITAL_ARTIFACT: return createDigital_Artifact();
			case IoT_metamodelPackage.ACTIVE_DIGITAL_ARTIFACT: return createActive_Digital_Artifact();
			case IoT_metamodelPackage.PASSIVE_DIGITAL_ARTIFACT: return createPassive_Digital_Artifact();
			case IoT_metamodelPackage.USER: return createUser();
			case IoT_metamodelPackage.HUMAN_USER: return createHuman_User();
			case IoT_metamodelPackage.COMMUNICATOR: return createCommunicator();
			case IoT_metamodelPackage.PORT: return createPort();
			case IoT_metamodelPackage.INFORMATION_RESOURCE: return createInformationResource();
			case IoT_metamodelPackage.ON_DEVICE_RESOURCE: return createOn_Device_Resource();
			case IoT_metamodelPackage.NETWORK_RESOURCE: return createNetwork_Resource();
			case IoT_metamodelPackage.DEVICE_RESOURCE: return createDevice_Resource();
			case IoT_metamodelPackage.SERVICE_RESOURCE: return createService_Resource();
			case IoT_metamodelPackage.PROPERTY: return createProperty();
			case IoT_metamodelPackage.VM: return createVM();
			case IoT_metamodelPackage.CONTAINER: return createContainer();
			case IoT_metamodelPackage.ANALYTICS_ENGINE: return createAnalytics_Engine();
			case IoT_metamodelPackage.CLOUD: return createCloud();
			case IoT_metamodelPackage.DATABASE: return createDatabase();
			case IoT_metamodelPackage.POLICY_REPOSITORY: return createPolicy_Repository();
			case IoT_metamodelPackage.REFERENCE_MONITOR: return createReference_Monitor();
			case IoT_metamodelPackage.AUTHORIZOR: return createAuthorizor();
			case IoT_metamodelPackage.INFORMATION: return createInformation();
			case IoT_metamodelPackage.DATA_STREAMS: return createDataStreams();
			case IoT_metamodelPackage.ATOMIC_DATA: return createAtomicData();
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES: return createDataStreamAttributes();
			case IoT_metamodelPackage.ATOMIC_DATA_ATTRIBUTES: return createAtomicDataAttributes();
			case IoT_metamodelPackage.FOG_SERVICES: return createFog_Services();
			case IoT_metamodelPackage.OPERATIONS: return createOperations();
			case IoT_metamodelPackage.JAVA_EVALUATOR: return createJavaEvaluator();
			case IoT_metamodelPackage.ENTITY: return createEntity();
			case IoT_metamodelPackage.SCRIPT_EVALUATOR: return createScriptEvaluator();
			case IoT_metamodelPackage.DEVICE_SENSOR: return createDeviceSensor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing createThing() {
		ThingImpl thing = new ThingImpl();
		return thing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualThing createVirtualThing() {
		VirtualThingImpl virtualThing = new VirtualThingImpl();
		return virtualThing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalThing createPhysicalThing() {
		PhysicalThingImpl physicalThing = new PhysicalThingImpl();
		return physicalThing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fog createFog() {
		FogImpl fog = new FogImpl();
		return fog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogNode createFogNode() {
		FogNodeImpl fogNode = new FogNodeImpl();
		return fogNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalSensor createExternalSensor() {
		ExternalSensorImpl externalSensor = new ExternalSensorImpl();
		return externalSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceActuator createDeviceActuator() {
		DeviceActuatorImpl deviceActuator = new DeviceActuatorImpl();
		return deviceActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalActuator createExternalActuator() {
		ExternalActuatorImpl externalActuator = new ExternalActuatorImpl();
		return externalActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceState createDeviceState() {
		DeviceStateImpl deviceState = new DeviceStateImpl();
		return deviceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeState createCompositeState() {
		CompositeStateImpl compositeState = new CompositeStateImpl();
		return compositeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Digital_Artifact createDigital_Artifact() {
		Digital_ArtifactImpl digital_Artifact = new Digital_ArtifactImpl();
		return digital_Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Active_Digital_Artifact createActive_Digital_Artifact() {
		Active_Digital_ArtifactImpl active_Digital_Artifact = new Active_Digital_ArtifactImpl();
		return active_Digital_Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Passive_Digital_Artifact createPassive_Digital_Artifact() {
		Passive_Digital_ArtifactImpl passive_Digital_Artifact = new Passive_Digital_ArtifactImpl();
		return passive_Digital_Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Human_User createHuman_User() {
		Human_UserImpl human_User = new Human_UserImpl();
		return human_User;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communicator createCommunicator() {
		CommunicatorImpl communicator = new CommunicatorImpl();
		return communicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationResource createInformationResource() {
		InformationResourceImpl informationResource = new InformationResourceImpl();
		return informationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public On_Device_Resource createOn_Device_Resource() {
		On_Device_ResourceImpl on_Device_Resource = new On_Device_ResourceImpl();
		return on_Device_Resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network_Resource createNetwork_Resource() {
		Network_ResourceImpl network_Resource = new Network_ResourceImpl();
		return network_Resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device_Resource createDevice_Resource() {
		Device_ResourceImpl device_Resource = new Device_ResourceImpl();
		return device_Resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service_Resource createService_Resource() {
		Service_ResourceImpl service_Resource = new Service_ResourceImpl();
		return service_Resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VM createVM() {
		VMImpl vm = new VMImpl();
		return vm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ioT_metamodel.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analytics_Engine createAnalytics_Engine() {
		Analytics_EngineImpl analytics_Engine = new Analytics_EngineImpl();
		return analytics_Engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloud createCloud() {
		CloudImpl cloud = new CloudImpl();
		return cloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Policy_Repository createPolicy_Repository() {
		Policy_RepositoryImpl policy_Repository = new Policy_RepositoryImpl();
		return policy_Repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference_Monitor createReference_Monitor() {
		Reference_MonitorImpl reference_Monitor = new Reference_MonitorImpl();
		return reference_Monitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authorizor createAuthorizor() {
		AuthorizorImpl authorizor = new AuthorizorImpl();
		return authorizor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Information createInformation() {
		InformationImpl information = new InformationImpl();
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStreams createDataStreams() {
		DataStreamsImpl dataStreams = new DataStreamsImpl();
		return dataStreams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicData createAtomicData() {
		AtomicDataImpl atomicData = new AtomicDataImpl();
		return atomicData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStreamAttributes createDataStreamAttributes() {
		DataStreamAttributesImpl dataStreamAttributes = new DataStreamAttributesImpl();
		return dataStreamAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicDataAttributes createAtomicDataAttributes() {
		AtomicDataAttributesImpl atomicDataAttributes = new AtomicDataAttributesImpl();
		return atomicDataAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fog_Services createFog_Services() {
		Fog_ServicesImpl fog_Services = new Fog_ServicesImpl();
		return fog_Services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operations createOperations() {
		OperationsImpl operations = new OperationsImpl();
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaEvaluator createJavaEvaluator() {
		JavaEvaluatorImpl javaEvaluator = new JavaEvaluatorImpl();
		return javaEvaluator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptEvaluator createScriptEvaluator() {
		ScriptEvaluatorImpl scriptEvaluator = new ScriptEvaluatorImpl();
		return scriptEvaluator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceSensor createDeviceSensor() {
		DeviceSensorImpl deviceSensor = new DeviceSensorImpl();
		return deviceSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoT_metamodelPackage getIoT_metamodelPackage() {
		return (IoT_metamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IoT_metamodelPackage getPackage() {
		return IoT_metamodelPackage.eINSTANCE;
	}

} //IoT_metamodelFactoryImpl
