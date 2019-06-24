/**
 */
package ioT_metamodel.util;

import ioT_metamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ioT_metamodel.IoT_metamodelPackage
 * @generated
 */
public class IoT_metamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IoT_metamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoT_metamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IoT_metamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoT_metamodelSwitch<Adapter> modelSwitch =
		new IoT_metamodelSwitch<Adapter>() {
			@Override
			public Adapter caseThing(Thing object) {
				return createThingAdapter();
			}
			@Override
			public Adapter caseVirtualThing(VirtualThing object) {
				return createVirtualThingAdapter();
			}
			@Override
			public Adapter casePhysicalThing(PhysicalThing object) {
				return createPhysicalThingAdapter();
			}
			@Override
			public Adapter caseFog(Fog object) {
				return createFogAdapter();
			}
			@Override
			public Adapter caseFogNode(FogNode object) {
				return createFogNodeAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseActuator(Actuator object) {
				return createActuatorAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseExternalSensor(ExternalSensor object) {
				return createExternalSensorAdapter();
			}
			@Override
			public Adapter caseDeviceActuator(DeviceActuator object) {
				return createDeviceActuatorAdapter();
			}
			@Override
			public Adapter caseExternalActuator(ExternalActuator object) {
				return createExternalActuatorAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseDeviceState(DeviceState object) {
				return createDeviceStateAdapter();
			}
			@Override
			public Adapter caseCompositeState(CompositeState object) {
				return createCompositeStateAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseDigital_Artifact(Digital_Artifact object) {
				return createDigital_ArtifactAdapter();
			}
			@Override
			public Adapter caseActive_Digital_Artifact(Active_Digital_Artifact object) {
				return createActive_Digital_ArtifactAdapter();
			}
			@Override
			public Adapter casePassive_Digital_Artifact(Passive_Digital_Artifact object) {
				return createPassive_Digital_ArtifactAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseHuman_User(Human_User object) {
				return createHuman_UserAdapter();
			}
			@Override
			public Adapter caseCommunicator(Communicator object) {
				return createCommunicatorAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseInformationResource(InformationResource object) {
				return createInformationResourceAdapter();
			}
			@Override
			public Adapter caseOn_Device_Resource(On_Device_Resource object) {
				return createOn_Device_ResourceAdapter();
			}
			@Override
			public Adapter caseNetwork_Resource(Network_Resource object) {
				return createNetwork_ResourceAdapter();
			}
			@Override
			public Adapter caseDevice_Resource(Device_Resource object) {
				return createDevice_ResourceAdapter();
			}
			@Override
			public Adapter caseService_Resource(Service_Resource object) {
				return createService_ResourceAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseVM(VM object) {
				return createVMAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseAnalytics_Engine(Analytics_Engine object) {
				return createAnalytics_EngineAdapter();
			}
			@Override
			public Adapter caseCloud(Cloud object) {
				return createCloudAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter casePolicy_Repository(Policy_Repository object) {
				return createPolicy_RepositoryAdapter();
			}
			@Override
			public Adapter caseReference_Monitor(Reference_Monitor object) {
				return createReference_MonitorAdapter();
			}
			@Override
			public Adapter caseAuthorizor(Authorizor object) {
				return createAuthorizorAdapter();
			}
			@Override
			public Adapter caseInformation(Information object) {
				return createInformationAdapter();
			}
			@Override
			public Adapter caseDataStreams(DataStreams object) {
				return createDataStreamsAdapter();
			}
			@Override
			public Adapter caseAtomicData(AtomicData object) {
				return createAtomicDataAdapter();
			}
			@Override
			public Adapter caseDataStreamAttributes(DataStreamAttributes object) {
				return createDataStreamAttributesAdapter();
			}
			@Override
			public Adapter caseAtomicDataAttributes(AtomicDataAttributes object) {
				return createAtomicDataAttributesAdapter();
			}
			@Override
			public Adapter caseFog_Services(Fog_Services object) {
				return createFog_ServicesAdapter();
			}
			@Override
			public Adapter caseOperations(Operations object) {
				return createOperationsAdapter();
			}
			@Override
			public Adapter caseEvaluators(Evaluators object) {
				return createEvaluatorsAdapter();
			}
			@Override
			public Adapter caseJavaEvaluator(JavaEvaluator object) {
				return createJavaEvaluatorAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseScriptEvaluator(ScriptEvaluator object) {
				return createScriptEvaluatorAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseDeviceSensor(DeviceSensor object) {
				return createDeviceSensorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Thing
	 * @generated
	 */
	public Adapter createThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.VirtualThing <em>Virtual Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.VirtualThing
	 * @generated
	 */
	public Adapter createVirtualThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.PhysicalThing <em>Physical Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.PhysicalThing
	 * @generated
	 */
	public Adapter createPhysicalThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Fog <em>Fog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Fog
	 * @generated
	 */
	public Adapter createFogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.FogNode <em>Fog Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.FogNode
	 * @generated
	 */
	public Adapter createFogNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Actuator
	 * @generated
	 */
	public Adapter createActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.ExternalSensor <em>External Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.ExternalSensor
	 * @generated
	 */
	public Adapter createExternalSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.DeviceActuator <em>Device Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.DeviceActuator
	 * @generated
	 */
	public Adapter createDeviceActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.ExternalActuator <em>External Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.ExternalActuator
	 * @generated
	 */
	public Adapter createExternalActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.DeviceState <em>Device State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.DeviceState
	 * @generated
	 */
	public Adapter createDeviceStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.CompositeState <em>Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.CompositeState
	 * @generated
	 */
	public Adapter createCompositeStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Digital_Artifact <em>Digital Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Digital_Artifact
	 * @generated
	 */
	public Adapter createDigital_ArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Active_Digital_Artifact <em>Active Digital Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Active_Digital_Artifact
	 * @generated
	 */
	public Adapter createActive_Digital_ArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Passive_Digital_Artifact <em>Passive Digital Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Passive_Digital_Artifact
	 * @generated
	 */
	public Adapter createPassive_Digital_ArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Human_User <em>Human User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Human_User
	 * @generated
	 */
	public Adapter createHuman_UserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Communicator <em>Communicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Communicator
	 * @generated
	 */
	public Adapter createCommunicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.InformationResource <em>Information Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.InformationResource
	 * @generated
	 */
	public Adapter createInformationResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.On_Device_Resource <em>On Device Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.On_Device_Resource
	 * @generated
	 */
	public Adapter createOn_Device_ResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Network_Resource <em>Network Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Network_Resource
	 * @generated
	 */
	public Adapter createNetwork_ResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Device_Resource <em>Device Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Device_Resource
	 * @generated
	 */
	public Adapter createDevice_ResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Service_Resource <em>Service Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Service_Resource
	 * @generated
	 */
	public Adapter createService_ResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.VM <em>VM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.VM
	 * @generated
	 */
	public Adapter createVMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Analytics_Engine <em>Analytics Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Analytics_Engine
	 * @generated
	 */
	public Adapter createAnalytics_EngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Cloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Cloud
	 * @generated
	 */
	public Adapter createCloudAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Policy_Repository <em>Policy Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Policy_Repository
	 * @generated
	 */
	public Adapter createPolicy_RepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Reference_Monitor <em>Reference Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Reference_Monitor
	 * @generated
	 */
	public Adapter createReference_MonitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Authorizor <em>Authorizor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Authorizor
	 * @generated
	 */
	public Adapter createAuthorizorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Information
	 * @generated
	 */
	public Adapter createInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.DataStreams <em>Data Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.DataStreams
	 * @generated
	 */
	public Adapter createDataStreamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.AtomicData <em>Atomic Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.AtomicData
	 * @generated
	 */
	public Adapter createAtomicDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.DataStreamAttributes <em>Data Stream Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.DataStreamAttributes
	 * @generated
	 */
	public Adapter createDataStreamAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.AtomicDataAttributes <em>Atomic Data Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.AtomicDataAttributes
	 * @generated
	 */
	public Adapter createAtomicDataAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Fog_Services <em>Fog Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Fog_Services
	 * @generated
	 */
	public Adapter createFog_ServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Operations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Operations
	 * @generated
	 */
	public Adapter createOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Evaluators <em>Evaluators</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Evaluators
	 * @generated
	 */
	public Adapter createEvaluatorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.JavaEvaluator <em>Java Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.JavaEvaluator
	 * @generated
	 */
	public Adapter createJavaEvaluatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.ScriptEvaluator <em>Script Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.ScriptEvaluator
	 * @generated
	 */
	public Adapter createScriptEvaluatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ioT_metamodel.DeviceSensor <em>Device Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ioT_metamodel.DeviceSensor
	 * @generated
	 */
	public Adapter createDeviceSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IoT_metamodelAdapterFactory
