/**
 */
package ioT_metamodel.provider;

import ioT_metamodel.util.IoT_metamodelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IoT_metamodelItemProviderAdapterFactory extends IoT_metamodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoT_metamodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Thing} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingItemProvider thingItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Thing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThingAdapter() {
		if (thingItemProvider == null) {
			thingItemProvider = new ThingItemProvider(this);
		}

		return thingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.VirtualThing} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualThingItemProvider virtualThingItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.VirtualThing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVirtualThingAdapter() {
		if (virtualThingItemProvider == null) {
			virtualThingItemProvider = new VirtualThingItemProvider(this);
		}

		return virtualThingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.PhysicalThing} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalThingItemProvider physicalThingItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.PhysicalThing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPhysicalThingAdapter() {
		if (physicalThingItemProvider == null) {
			physicalThingItemProvider = new PhysicalThingItemProvider(this);
		}

		return physicalThingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Fog} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FogItemProvider fogItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Fog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFogAdapter() {
		if (fogItemProvider == null) {
			fogItemProvider = new FogItemProvider(this);
		}

		return fogItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.FogNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FogNodeItemProvider fogNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.FogNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFogNodeAdapter() {
		if (fogNodeItemProvider == null) {
			fogNodeItemProvider = new FogNodeItemProvider(this);
		}

		return fogNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Device} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceItemProvider deviceItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceAdapter() {
		if (deviceItemProvider == null) {
			deviceItemProvider = new DeviceItemProvider(this);
		}

		return deviceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Actuator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorItemProvider actuatorItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Actuator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActuatorAdapter() {
		if (actuatorItemProvider == null) {
			actuatorItemProvider = new ActuatorItemProvider(this);
		}

		return actuatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Tag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagItemProvider tagItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTagAdapter() {
		if (tagItemProvider == null) {
			tagItemProvider = new TagItemProvider(this);
		}

		return tagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Rule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleItemProvider ruleItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuleAdapter() {
		if (ruleItemProvider == null) {
			ruleItemProvider = new RuleItemProvider(this);
		}

		return ruleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.ExternalSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalSensorItemProvider externalSensorItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.ExternalSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalSensorAdapter() {
		if (externalSensorItemProvider == null) {
			externalSensorItemProvider = new ExternalSensorItemProvider(this);
		}

		return externalSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.DeviceActuator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceActuatorItemProvider deviceActuatorItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.DeviceActuator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceActuatorAdapter() {
		if (deviceActuatorItemProvider == null) {
			deviceActuatorItemProvider = new DeviceActuatorItemProvider(this);
		}

		return deviceActuatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.ExternalActuator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalActuatorItemProvider externalActuatorItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.ExternalActuator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalActuatorAdapter() {
		if (externalActuatorItemProvider == null) {
			externalActuatorItemProvider = new ExternalActuatorItemProvider(this);
		}

		return externalActuatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Action} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemProvider actionItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.DeviceState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceStateItemProvider deviceStateItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.DeviceState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceStateAdapter() {
		if (deviceStateItemProvider == null) {
			deviceStateItemProvider = new DeviceStateItemProvider(this);
		}

		return deviceStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.CompositeState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeStateItemProvider compositeStateItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.CompositeState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeStateAdapter() {
		if (compositeStateItemProvider == null) {
			compositeStateItemProvider = new CompositeStateItemProvider(this);
		}

		return compositeStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Digital_Artifact} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Digital_ArtifactItemProvider digital_ArtifactItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Digital_Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDigital_ArtifactAdapter() {
		if (digital_ArtifactItemProvider == null) {
			digital_ArtifactItemProvider = new Digital_ArtifactItemProvider(this);
		}

		return digital_ArtifactItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Active_Digital_Artifact} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Active_Digital_ArtifactItemProvider active_Digital_ArtifactItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Active_Digital_Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActive_Digital_ArtifactAdapter() {
		if (active_Digital_ArtifactItemProvider == null) {
			active_Digital_ArtifactItemProvider = new Active_Digital_ArtifactItemProvider(this);
		}

		return active_Digital_ArtifactItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Passive_Digital_Artifact} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Passive_Digital_ArtifactItemProvider passive_Digital_ArtifactItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Passive_Digital_Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPassive_Digital_ArtifactAdapter() {
		if (passive_Digital_ArtifactItemProvider == null) {
			passive_Digital_ArtifactItemProvider = new Passive_Digital_ArtifactItemProvider(this);
		}

		return passive_Digital_ArtifactItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.User} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserItemProvider userItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUserAdapter() {
		if (userItemProvider == null) {
			userItemProvider = new UserItemProvider(this);
		}

		return userItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Human_User} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Human_UserItemProvider human_UserItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Human_User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHuman_UserAdapter() {
		if (human_UserItemProvider == null) {
			human_UserItemProvider = new Human_UserItemProvider(this);
		}

		return human_UserItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Communicator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicatorItemProvider communicatorItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Communicator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommunicatorAdapter() {
		if (communicatorItemProvider == null) {
			communicatorItemProvider = new CommunicatorItemProvider(this);
		}

		return communicatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Port} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortItemProvider portItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortAdapter() {
		if (portItemProvider == null) {
			portItemProvider = new PortItemProvider(this);
		}

		return portItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.InformationResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationResourceItemProvider informationResourceItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.InformationResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInformationResourceAdapter() {
		if (informationResourceItemProvider == null) {
			informationResourceItemProvider = new InformationResourceItemProvider(this);
		}

		return informationResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.On_Device_Resource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected On_Device_ResourceItemProvider on_Device_ResourceItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.On_Device_Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOn_Device_ResourceAdapter() {
		if (on_Device_ResourceItemProvider == null) {
			on_Device_ResourceItemProvider = new On_Device_ResourceItemProvider(this);
		}

		return on_Device_ResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Network_Resource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Network_ResourceItemProvider network_ResourceItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Network_Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNetwork_ResourceAdapter() {
		if (network_ResourceItemProvider == null) {
			network_ResourceItemProvider = new Network_ResourceItemProvider(this);
		}

		return network_ResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Device_Resource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Device_ResourceItemProvider device_ResourceItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Device_Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDevice_ResourceAdapter() {
		if (device_ResourceItemProvider == null) {
			device_ResourceItemProvider = new Device_ResourceItemProvider(this);
		}

		return device_ResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Service_Resource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Service_ResourceItemProvider service_ResourceItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Service_Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createService_ResourceAdapter() {
		if (service_ResourceItemProvider == null) {
			service_ResourceItemProvider = new Service_ResourceItemProvider(this);
		}

		return service_ResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.VM} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VMItemProvider vmItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.VM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVMAdapter() {
		if (vmItemProvider == null) {
			vmItemProvider = new VMItemProvider(this);
		}

		return vmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Container} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerItemProvider containerItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainerAdapter() {
		if (containerItemProvider == null) {
			containerItemProvider = new ContainerItemProvider(this);
		}

		return containerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Analytics_Engine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Analytics_EngineItemProvider analytics_EngineItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Analytics_Engine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnalytics_EngineAdapter() {
		if (analytics_EngineItemProvider == null) {
			analytics_EngineItemProvider = new Analytics_EngineItemProvider(this);
		}

		return analytics_EngineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Cloud} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudItemProvider cloudItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Cloud}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCloudAdapter() {
		if (cloudItemProvider == null) {
			cloudItemProvider = new CloudItemProvider(this);
		}

		return cloudItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Database} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseItemProvider databaseItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Database}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatabaseAdapter() {
		if (databaseItemProvider == null) {
			databaseItemProvider = new DatabaseItemProvider(this);
		}

		return databaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Policy_Repository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Policy_RepositoryItemProvider policy_RepositoryItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Policy_Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPolicy_RepositoryAdapter() {
		if (policy_RepositoryItemProvider == null) {
			policy_RepositoryItemProvider = new Policy_RepositoryItemProvider(this);
		}

		return policy_RepositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Reference_Monitor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reference_MonitorItemProvider reference_MonitorItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Reference_Monitor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReference_MonitorAdapter() {
		if (reference_MonitorItemProvider == null) {
			reference_MonitorItemProvider = new Reference_MonitorItemProvider(this);
		}

		return reference_MonitorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Authorizor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizorItemProvider authorizorItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Authorizor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAuthorizorAdapter() {
		if (authorizorItemProvider == null) {
			authorizorItemProvider = new AuthorizorItemProvider(this);
		}

		return authorizorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Information} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationItemProvider informationItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Information}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInformationAdapter() {
		if (informationItemProvider == null) {
			informationItemProvider = new InformationItemProvider(this);
		}

		return informationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.DataStreams} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataStreamsItemProvider dataStreamsItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.DataStreams}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataStreamsAdapter() {
		if (dataStreamsItemProvider == null) {
			dataStreamsItemProvider = new DataStreamsItemProvider(this);
		}

		return dataStreamsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.AtomicData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicDataItemProvider atomicDataItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.AtomicData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtomicDataAdapter() {
		if (atomicDataItemProvider == null) {
			atomicDataItemProvider = new AtomicDataItemProvider(this);
		}

		return atomicDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.DataStreamAttributes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataStreamAttributesItemProvider dataStreamAttributesItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.DataStreamAttributes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataStreamAttributesAdapter() {
		if (dataStreamAttributesItemProvider == null) {
			dataStreamAttributesItemProvider = new DataStreamAttributesItemProvider(this);
		}

		return dataStreamAttributesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.AtomicDataAttributes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicDataAttributesItemProvider atomicDataAttributesItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.AtomicDataAttributes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtomicDataAttributesAdapter() {
		if (atomicDataAttributesItemProvider == null) {
			atomicDataAttributesItemProvider = new AtomicDataAttributesItemProvider(this);
		}

		return atomicDataAttributesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Fog_Services} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fog_ServicesItemProvider fog_ServicesItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Fog_Services}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFog_ServicesAdapter() {
		if (fog_ServicesItemProvider == null) {
			fog_ServicesItemProvider = new Fog_ServicesItemProvider(this);
		}

		return fog_ServicesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Operations} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationsItemProvider operationsItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Operations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationsAdapter() {
		if (operationsItemProvider == null) {
			operationsItemProvider = new OperationsItemProvider(this);
		}

		return operationsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.JavaEvaluator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaEvaluatorItemProvider javaEvaluatorItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.JavaEvaluator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJavaEvaluatorAdapter() {
		if (javaEvaluatorItemProvider == null) {
			javaEvaluatorItemProvider = new JavaEvaluatorItemProvider(this);
		}

		return javaEvaluatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.Entity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityItemProvider entityItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntityAdapter() {
		if (entityItemProvider == null) {
			entityItemProvider = new EntityItemProvider(this);
		}

		return entityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.ScriptEvaluator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptEvaluatorItemProvider scriptEvaluatorItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.ScriptEvaluator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScriptEvaluatorAdapter() {
		if (scriptEvaluatorItemProvider == null) {
			scriptEvaluatorItemProvider = new ScriptEvaluatorItemProvider(this);
		}

		return scriptEvaluatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ioT_metamodel.DeviceSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceSensorItemProvider deviceSensorItemProvider;

	/**
	 * This creates an adapter for a {@link ioT_metamodel.DeviceSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceSensorAdapter() {
		if (deviceSensorItemProvider == null) {
			deviceSensorItemProvider = new DeviceSensorItemProvider(this);
		}

		return deviceSensorItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (thingItemProvider != null) thingItemProvider.dispose();
		if (virtualThingItemProvider != null) virtualThingItemProvider.dispose();
		if (physicalThingItemProvider != null) physicalThingItemProvider.dispose();
		if (fogItemProvider != null) fogItemProvider.dispose();
		if (fogNodeItemProvider != null) fogNodeItemProvider.dispose();
		if (deviceItemProvider != null) deviceItemProvider.dispose();
		if (actuatorItemProvider != null) actuatorItemProvider.dispose();
		if (tagItemProvider != null) tagItemProvider.dispose();
		if (ruleItemProvider != null) ruleItemProvider.dispose();
		if (externalSensorItemProvider != null) externalSensorItemProvider.dispose();
		if (deviceActuatorItemProvider != null) deviceActuatorItemProvider.dispose();
		if (externalActuatorItemProvider != null) externalActuatorItemProvider.dispose();
		if (actionItemProvider != null) actionItemProvider.dispose();
		if (deviceStateItemProvider != null) deviceStateItemProvider.dispose();
		if (compositeStateItemProvider != null) compositeStateItemProvider.dispose();
		if (transitionItemProvider != null) transitionItemProvider.dispose();
		if (digital_ArtifactItemProvider != null) digital_ArtifactItemProvider.dispose();
		if (active_Digital_ArtifactItemProvider != null) active_Digital_ArtifactItemProvider.dispose();
		if (passive_Digital_ArtifactItemProvider != null) passive_Digital_ArtifactItemProvider.dispose();
		if (userItemProvider != null) userItemProvider.dispose();
		if (human_UserItemProvider != null) human_UserItemProvider.dispose();
		if (communicatorItemProvider != null) communicatorItemProvider.dispose();
		if (portItemProvider != null) portItemProvider.dispose();
		if (informationResourceItemProvider != null) informationResourceItemProvider.dispose();
		if (on_Device_ResourceItemProvider != null) on_Device_ResourceItemProvider.dispose();
		if (network_ResourceItemProvider != null) network_ResourceItemProvider.dispose();
		if (device_ResourceItemProvider != null) device_ResourceItemProvider.dispose();
		if (service_ResourceItemProvider != null) service_ResourceItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (vmItemProvider != null) vmItemProvider.dispose();
		if (containerItemProvider != null) containerItemProvider.dispose();
		if (analytics_EngineItemProvider != null) analytics_EngineItemProvider.dispose();
		if (cloudItemProvider != null) cloudItemProvider.dispose();
		if (databaseItemProvider != null) databaseItemProvider.dispose();
		if (policy_RepositoryItemProvider != null) policy_RepositoryItemProvider.dispose();
		if (reference_MonitorItemProvider != null) reference_MonitorItemProvider.dispose();
		if (authorizorItemProvider != null) authorizorItemProvider.dispose();
		if (informationItemProvider != null) informationItemProvider.dispose();
		if (dataStreamsItemProvider != null) dataStreamsItemProvider.dispose();
		if (atomicDataItemProvider != null) atomicDataItemProvider.dispose();
		if (dataStreamAttributesItemProvider != null) dataStreamAttributesItemProvider.dispose();
		if (atomicDataAttributesItemProvider != null) atomicDataAttributesItemProvider.dispose();
		if (fog_ServicesItemProvider != null) fog_ServicesItemProvider.dispose();
		if (operationsItemProvider != null) operationsItemProvider.dispose();
		if (javaEvaluatorItemProvider != null) javaEvaluatorItemProvider.dispose();
		if (entityItemProvider != null) entityItemProvider.dispose();
		if (scriptEvaluatorItemProvider != null) scriptEvaluatorItemProvider.dispose();
		if (deviceSensorItemProvider != null) deviceSensorItemProvider.dispose();
	}

}
