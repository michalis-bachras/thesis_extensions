/**
 */
package goal_metamodel.util;

import goal_metamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see goal_metamodel.Goal_metamodelPackage
 * @generated
 */
public class Goal_metamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Goal_metamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal_metamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Goal_metamodelPackage.eINSTANCE;
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
	protected Goal_metamodelSwitch<Adapter> modelSwitch =
		new Goal_metamodelSwitch<Adapter>() {
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseDecomposition(Decomposition object) {
				return createDecompositionAdapter();
			}
			@Override
			public Adapter caseDependencyLink(DependencyLink object) {
				return createDependencyLinkAdapter();
			}
			@Override
			public Adapter caseLogicalPrecedence(LogicalPrecedence object) {
				return createLogicalPrecedenceAdapter();
			}
			@Override
			public Adapter caseTemporalLink(TemporalLink object) {
				return createTemporalLinkAdapter();
			}
			@Override
			public Adapter caseTemporalPrecedence(TemporalPrecedence object) {
				return createTemporalPrecedenceAdapter();
			}
			@Override
			public Adapter caseTimeoutLink(TimeoutLink object) {
				return createTimeoutLinkAdapter();
			}
			@Override
			public Adapter caseTimeDifferenceLink(TimeDifferenceLink object) {
				return createTimeDifferenceLinkAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseContribution(Contribution object) {
				return createContributionAdapter();
			}
			@Override
			public Adapter caseContextualComponent(ContextualComponent object) {
				return createContextualComponentAdapter();
			}
			@Override
			public Adapter caseContextCondition(ContextCondition object) {
				return createContextConditionAdapter();
			}
			@Override
			public Adapter caseGoal_Model(Goal_Model object) {
				return createGoal_ModelAdapter();
			}
			@Override
			public Adapter caseResourceDependency(ResourceDependency object) {
				return createResourceDependencyAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseParallelNode(ParallelNode object) {
				return createParallelNodeAdapter();
			}
			@Override
			public Adapter caseParallelLink(ParallelLink object) {
				return createParallelLinkAdapter();
			}
			@Override
			public Adapter caseGoalNode(GoalNode object) {
				return createGoalNodeAdapter();
			}
			@Override
			public Adapter caseControlNode(ControlNode object) {
				return createControlNodeAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
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
	 * Creates a new adapter for an object of class '{@link goal_metamodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.Decomposition
	 * @generated
	 */
	public Adapter createDecompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.DependencyLink <em>Dependency Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.DependencyLink
	 * @generated
	 */
	public Adapter createDependencyLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.LogicalPrecedence <em>Logical Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.LogicalPrecedence
	 * @generated
	 */
	public Adapter createLogicalPrecedenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.TemporalLink <em>Temporal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.TemporalLink
	 * @generated
	 */
	public Adapter createTemporalLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.TemporalPrecedence <em>Temporal Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.TemporalPrecedence
	 * @generated
	 */
	public Adapter createTemporalPrecedenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.TimeoutLink <em>Timeout Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.TimeoutLink
	 * @generated
	 */
	public Adapter createTimeoutLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.TimeDifferenceLink <em>Time Difference Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.TimeDifferenceLink
	 * @generated
	 */
	public Adapter createTimeDifferenceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.Contribution
	 * @generated
	 */
	public Adapter createContributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.ContextualComponent <em>Contextual Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.ContextualComponent
	 * @generated
	 */
	public Adapter createContextualComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.ContextCondition <em>Context Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.ContextCondition
	 * @generated
	 */
	public Adapter createContextConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.Goal_Model <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.Goal_Model
	 * @generated
	 */
	public Adapter createGoal_ModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.ResourceDependency <em>Resource Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.ResourceDependency
	 * @generated
	 */
	public Adapter createResourceDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.ParallelNode <em>Parallel Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.ParallelNode
	 * @generated
	 */
	public Adapter createParallelNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.ParallelLink <em>Parallel Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.ParallelLink
	 * @generated
	 */
	public Adapter createParallelLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.GoalNode <em>Goal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.GoalNode
	 * @generated
	 */
	public Adapter createGoalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.ControlNode
	 * @generated
	 */
	public Adapter createControlNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link goal_metamodel.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see goal_metamodel.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
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

} //Goal_metamodelAdapterFactory
