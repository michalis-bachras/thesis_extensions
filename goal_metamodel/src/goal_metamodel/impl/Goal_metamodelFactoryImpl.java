/**
 */
package goal_metamodel.impl;

import goal_metamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class Goal_metamodelFactoryImpl extends EFactoryImpl implements Goal_metamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Goal_metamodelFactory init() {
		try {
			Goal_metamodelFactory theGoal_metamodelFactory = (Goal_metamodelFactory)EPackage.Registry.INSTANCE.getEFactory(Goal_metamodelPackage.eNS_URI);
			if (theGoal_metamodelFactory != null) {
				return theGoal_metamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Goal_metamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal_metamodelFactoryImpl() {
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
			case Goal_metamodelPackage.NODE: return createNode();
			case Goal_metamodelPackage.DECOMPOSITION: return createDecomposition();
			case Goal_metamodelPackage.DEPENDENCY_LINK: return createDependencyLink();
			case Goal_metamodelPackage.LOGICAL_PRECEDENCE: return createLogicalPrecedence();
			case Goal_metamodelPackage.TEMPORAL_LINK: return createTemporalLink();
			case Goal_metamodelPackage.TEMPORAL_PRECEDENCE: return createTemporalPrecedence();
			case Goal_metamodelPackage.TIMEOUT_LINK: return createTimeoutLink();
			case Goal_metamodelPackage.TIME_DIFFERENCE_LINK: return createTimeDifferenceLink();
			case Goal_metamodelPackage.LINK: return createLink();
			case Goal_metamodelPackage.CONTRIBUTION: return createContribution();
			case Goal_metamodelPackage.CONTEXT_CONDITION: return createContextCondition();
			case Goal_metamodelPackage.GOAL_MODEL: return createGoal_Model();
			case Goal_metamodelPackage.RESOURCE_DEPENDENCY: return createResourceDependency();
			case Goal_metamodelPackage.RESOURCE: return createResource();
			case Goal_metamodelPackage.PARALLEL_NODE: return createParallelNode();
			case Goal_metamodelPackage.PARALLEL_LINK: return createParallelLink();
			case Goal_metamodelPackage.GOAL_NODE: return createGoalNode();
			case Goal_metamodelPackage.CONTROL_NODE: return createControlNode();
			case Goal_metamodelPackage.ACTION: return createAction();
			case Goal_metamodelPackage.TASK: return createTask();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Goal_metamodelPackage.DECOMPOSITION_TYPE:
				return createDecompositionTypeFromString(eDataType, initialValue);
			case Goal_metamodelPackage.CONTRIBUTION_TYPE:
				return createContributionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Goal_metamodelPackage.DECOMPOSITION_TYPE:
				return convertDecompositionTypeToString(eDataType, instanceValue);
			case Goal_metamodelPackage.CONTRIBUTION_TYPE:
				return convertContributionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decomposition createDecomposition() {
		DecompositionImpl decomposition = new DecompositionImpl();
		return decomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyLink createDependencyLink() {
		DependencyLinkImpl dependencyLink = new DependencyLinkImpl();
		return dependencyLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalPrecedence createLogicalPrecedence() {
		LogicalPrecedenceImpl logicalPrecedence = new LogicalPrecedenceImpl();
		return logicalPrecedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalLink createTemporalLink() {
		TemporalLinkImpl temporalLink = new TemporalLinkImpl();
		return temporalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalPrecedence createTemporalPrecedence() {
		TemporalPrecedenceImpl temporalPrecedence = new TemporalPrecedenceImpl();
		return temporalPrecedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeoutLink createTimeoutLink() {
		TimeoutLinkImpl timeoutLink = new TimeoutLinkImpl();
		return timeoutLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDifferenceLink createTimeDifferenceLink() {
		TimeDifferenceLinkImpl timeDifferenceLink = new TimeDifferenceLinkImpl();
		return timeDifferenceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contribution createContribution() {
		ContributionImpl contribution = new ContributionImpl();
		return contribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextCondition createContextCondition() {
		ContextConditionImpl contextCondition = new ContextConditionImpl();
		return contextCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal_Model createGoal_Model() {
		Goal_ModelImpl goal_Model = new Goal_ModelImpl();
		return goal_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDependency createResourceDependency() {
		ResourceDependencyImpl resourceDependency = new ResourceDependencyImpl();
		return resourceDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelNode createParallelNode() {
		ParallelNodeImpl parallelNode = new ParallelNodeImpl();
		return parallelNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelLink createParallelLink() {
		ParallelLinkImpl parallelLink = new ParallelLinkImpl();
		return parallelLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalNode createGoalNode() {
		GoalNodeImpl goalNode = new GoalNodeImpl();
		return goalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlNode createControlNode() {
		ControlNodeImpl controlNode = new ControlNodeImpl();
		return controlNode;
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
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecompositionType createDecompositionTypeFromString(EDataType eDataType, String initialValue) {
		DecompositionType result = DecompositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecompositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributionType createContributionTypeFromString(EDataType eDataType, String initialValue) {
		ContributionType result = ContributionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContributionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal_metamodelPackage getGoal_metamodelPackage() {
		return (Goal_metamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Goal_metamodelPackage getPackage() {
		return Goal_metamodelPackage.eINSTANCE;
	}

} //Goal_metamodelFactoryImpl
