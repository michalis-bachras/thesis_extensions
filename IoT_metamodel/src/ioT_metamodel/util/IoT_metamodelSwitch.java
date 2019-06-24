/**
 */
package ioT_metamodel.util;

import ioT_metamodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ioT_metamodel.IoT_metamodelPackage
 * @generated
 */
public class IoT_metamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IoT_metamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoT_metamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = IoT_metamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IoT_metamodelPackage.THING: {
				Thing thing = (Thing)theEObject;
				T result = caseThing(thing);
				if (result == null) result = caseEntity(thing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.VIRTUAL_THING: {
				VirtualThing virtualThing = (VirtualThing)theEObject;
				T result = caseVirtualThing(virtualThing);
				if (result == null) result = caseActive_Digital_Artifact(virtualThing);
				if (result == null) result = casePassive_Digital_Artifact(virtualThing);
				if (result == null) result = caseDigital_Artifact(virtualThing);
				if (result == null) result = caseUser(virtualThing);
				if (result == null) result = caseEntity(virtualThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.PHYSICAL_THING: {
				PhysicalThing physicalThing = (PhysicalThing)theEObject;
				T result = casePhysicalThing(physicalThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.FOG: {
				Fog fog = (Fog)theEObject;
				T result = caseFog(fog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.FOG_NODE: {
				FogNode fogNode = (FogNode)theEObject;
				T result = caseFogNode(fogNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = casePhysicalThing(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.ACTUATOR: {
				Actuator actuator = (Actuator)theEObject;
				T result = caseActuator(actuator);
				if (result == null) result = caseDevice(actuator);
				if (result == null) result = casePhysicalThing(actuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = caseDevice(tag);
				if (result == null) result = casePhysicalThing(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = caseDevice(sensor);
				if (result == null) result = casePhysicalThing(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.EXTERNAL_SENSOR: {
				ExternalSensor externalSensor = (ExternalSensor)theEObject;
				T result = caseExternalSensor(externalSensor);
				if (result == null) result = caseSensor(externalSensor);
				if (result == null) result = caseDevice(externalSensor);
				if (result == null) result = casePhysicalThing(externalSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.DEVICE_ACTUATOR: {
				DeviceActuator deviceActuator = (DeviceActuator)theEObject;
				T result = caseDeviceActuator(deviceActuator);
				if (result == null) result = caseActuator(deviceActuator);
				if (result == null) result = caseDevice(deviceActuator);
				if (result == null) result = casePhysicalThing(deviceActuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.EXTERNAL_ACTUATOR: {
				ExternalActuator externalActuator = (ExternalActuator)theEObject;
				T result = caseExternalActuator(externalActuator);
				if (result == null) result = caseActuator(externalActuator);
				if (result == null) result = caseDevice(externalActuator);
				if (result == null) result = casePhysicalThing(externalActuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.DEVICE_STATE: {
				DeviceState deviceState = (DeviceState)theEObject;
				T result = caseDeviceState(deviceState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.COMPOSITE_STATE: {
				CompositeState compositeState = (CompositeState)theEObject;
				T result = caseCompositeState(compositeState);
				if (result == null) result = caseDeviceState(compositeState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.DIGITAL_ARTIFACT: {
				Digital_Artifact digital_Artifact = (Digital_Artifact)theEObject;
				T result = caseDigital_Artifact(digital_Artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.ACTIVE_DIGITAL_ARTIFACT: {
				Active_Digital_Artifact active_Digital_Artifact = (Active_Digital_Artifact)theEObject;
				T result = caseActive_Digital_Artifact(active_Digital_Artifact);
				if (result == null) result = caseDigital_Artifact(active_Digital_Artifact);
				if (result == null) result = caseUser(active_Digital_Artifact);
				if (result == null) result = caseEntity(active_Digital_Artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.PASSIVE_DIGITAL_ARTIFACT: {
				Passive_Digital_Artifact passive_Digital_Artifact = (Passive_Digital_Artifact)theEObject;
				T result = casePassive_Digital_Artifact(passive_Digital_Artifact);
				if (result == null) result = caseDigital_Artifact(passive_Digital_Artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = caseEntity(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.HUMAN_USER: {
				Human_User human_User = (Human_User)theEObject;
				T result = caseHuman_User(human_User);
				if (result == null) result = caseUser(human_User);
				if (result == null) result = caseEntity(human_User);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.COMMUNICATOR: {
				Communicator communicator = (Communicator)theEObject;
				T result = caseCommunicator(communicator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.INFORMATION_RESOURCE: {
				InformationResource informationResource = (InformationResource)theEObject;
				T result = caseInformationResource(informationResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.ON_DEVICE_RESOURCE: {
				On_Device_Resource on_Device_Resource = (On_Device_Resource)theEObject;
				T result = caseOn_Device_Resource(on_Device_Resource);
				if (result == null) result = caseInformationResource(on_Device_Resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.NETWORK_RESOURCE: {
				Network_Resource network_Resource = (Network_Resource)theEObject;
				T result = caseNetwork_Resource(network_Resource);
				if (result == null) result = caseInformationResource(network_Resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.DEVICE_RESOURCE: {
				Device_Resource device_Resource = (Device_Resource)theEObject;
				T result = caseDevice_Resource(device_Resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.SERVICE_RESOURCE: {
				Service_Resource service_Resource = (Service_Resource)theEObject;
				T result = caseService_Resource(service_Resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.VM: {
				VM vm = (VM)theEObject;
				T result = caseVM(vm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.ANALYTICS_ENGINE: {
				Analytics_Engine analytics_Engine = (Analytics_Engine)theEObject;
				T result = caseAnalytics_Engine(analytics_Engine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.CLOUD: {
				Cloud cloud = (Cloud)theEObject;
				T result = caseCloud(cloud);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.DATABASE: {
				Database database = (Database)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.POLICY_REPOSITORY: {
				Policy_Repository policy_Repository = (Policy_Repository)theEObject;
				T result = casePolicy_Repository(policy_Repository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.REFERENCE_MONITOR: {
				Reference_Monitor reference_Monitor = (Reference_Monitor)theEObject;
				T result = caseReference_Monitor(reference_Monitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.AUTHORIZOR: {
				Authorizor authorizor = (Authorizor)theEObject;
				T result = caseAuthorizor(authorizor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.INFORMATION: {
				Information information = (Information)theEObject;
				T result = caseInformation(information);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.DATA_STREAMS: {
				DataStreams dataStreams = (DataStreams)theEObject;
				T result = caseDataStreams(dataStreams);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.ATOMIC_DATA: {
				AtomicData atomicData = (AtomicData)theEObject;
				T result = caseAtomicData(atomicData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.DATA_STREAM_ATTRIBUTES: {
				DataStreamAttributes dataStreamAttributes = (DataStreamAttributes)theEObject;
				T result = caseDataStreamAttributes(dataStreamAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.ATOMIC_DATA_ATTRIBUTES: {
				AtomicDataAttributes atomicDataAttributes = (AtomicDataAttributes)theEObject;
				T result = caseAtomicDataAttributes(atomicDataAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.FOG_SERVICES: {
				Fog_Services fog_Services = (Fog_Services)theEObject;
				T result = caseFog_Services(fog_Services);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.OPERATIONS: {
				Operations operations = (Operations)theEObject;
				T result = caseOperations(operations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.EVALUATORS: {
				Evaluators evaluators = (Evaluators)theEObject;
				T result = caseEvaluators(evaluators);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.JAVA_EVALUATOR: {
				JavaEvaluator javaEvaluator = (JavaEvaluator)theEObject;
				T result = caseJavaEvaluator(javaEvaluator);
				if (result == null) result = caseEvaluators(javaEvaluator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.SCRIPT_EVALUATOR: {
				ScriptEvaluator scriptEvaluator = (ScriptEvaluator)theEObject;
				T result = caseScriptEvaluator(scriptEvaluator);
				if (result == null) result = caseEvaluators(scriptEvaluator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseEntity(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoT_metamodelPackage.DEVICE_SENSOR: {
				DeviceSensor deviceSensor = (DeviceSensor)theEObject;
				T result = caseDeviceSensor(deviceSensor);
				if (result == null) result = caseSensor(deviceSensor);
				if (result == null) result = caseDevice(deviceSensor);
				if (result == null) result = casePhysicalThing(deviceSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThing(Thing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualThing(VirtualThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalThing(PhysicalThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFog(Fog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fog Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fog Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFogNode(FogNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuator(Actuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalSensor(ExternalSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceActuator(DeviceActuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalActuator(ExternalActuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceState(DeviceState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeState(CompositeState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigital_Artifact(Digital_Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Digital Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Digital Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActive_Digital_Artifact(Active_Digital_Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passive Digital Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passive Digital Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassive_Digital_Artifact(Passive_Digital_Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHuman_User(Human_User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicator(Communicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationResource(InformationResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Device Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Device Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOn_Device_Resource(On_Device_Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork_Resource(Network_Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice_Resource(Device_Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService_Resource(Service_Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVM(VM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analytics Engine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analytics Engine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalytics_Engine(Analytics_Engine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloud(Cloud object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicy_Repository(Policy_Repository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Monitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference_Monitor(Reference_Monitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorizor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorizor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizor(Authorizor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformation(Information object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Streams</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Streams</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStreams(DataStreams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicData(AtomicData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Stream Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Stream Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStreamAttributes(DataStreamAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Data Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Data Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicDataAttributes(AtomicDataAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fog Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fog Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFog_Services(Fog_Services object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperations(Operations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluators</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluators</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluators(Evaluators object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Evaluator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Evaluator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaEvaluator(JavaEvaluator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script Evaluator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script Evaluator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScriptEvaluator(ScriptEvaluator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceSensor(DeviceSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IoT_metamodelSwitch
