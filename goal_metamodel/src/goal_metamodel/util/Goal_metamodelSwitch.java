/**
 */
package goal_metamodel.util;

import goal_metamodel.*;

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
 * @see goal_metamodel.Goal_metamodelPackage
 * @generated
 */
public class Goal_metamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Goal_metamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal_metamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = Goal_metamodelPackage.eINSTANCE;
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
			case Goal_metamodelPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseContextualComponent(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.DECOMPOSITION: {
				Decomposition decomposition = (Decomposition)theEObject;
				T result = caseDecomposition(decomposition);
				if (result == null) result = caseContextualComponent(decomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.DEPENDENCY_LINK: {
				DependencyLink dependencyLink = (DependencyLink)theEObject;
				T result = caseDependencyLink(dependencyLink);
				if (result == null) result = caseLink(dependencyLink);
				if (result == null) result = caseContextualComponent(dependencyLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.LOGICAL_PRECEDENCE: {
				LogicalPrecedence logicalPrecedence = (LogicalPrecedence)theEObject;
				T result = caseLogicalPrecedence(logicalPrecedence);
				if (result == null) result = caseDependencyLink(logicalPrecedence);
				if (result == null) result = caseLink(logicalPrecedence);
				if (result == null) result = caseContextualComponent(logicalPrecedence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.TEMPORAL_LINK: {
				TemporalLink temporalLink = (TemporalLink)theEObject;
				T result = caseTemporalLink(temporalLink);
				if (result == null) result = caseDependencyLink(temporalLink);
				if (result == null) result = caseLink(temporalLink);
				if (result == null) result = caseContextualComponent(temporalLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.TEMPORAL_PRECEDENCE: {
				TemporalPrecedence temporalPrecedence = (TemporalPrecedence)theEObject;
				T result = caseTemporalPrecedence(temporalPrecedence);
				if (result == null) result = caseTemporalLink(temporalPrecedence);
				if (result == null) result = caseDependencyLink(temporalPrecedence);
				if (result == null) result = caseLink(temporalPrecedence);
				if (result == null) result = caseContextualComponent(temporalPrecedence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.TIMEOUT_LINK: {
				TimeoutLink timeoutLink = (TimeoutLink)theEObject;
				T result = caseTimeoutLink(timeoutLink);
				if (result == null) result = caseTemporalPrecedence(timeoutLink);
				if (result == null) result = caseTemporalLink(timeoutLink);
				if (result == null) result = caseDependencyLink(timeoutLink);
				if (result == null) result = caseLink(timeoutLink);
				if (result == null) result = caseContextualComponent(timeoutLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.TIME_DIFFERENCE_LINK: {
				TimeDifferenceLink timeDifferenceLink = (TimeDifferenceLink)theEObject;
				T result = caseTimeDifferenceLink(timeDifferenceLink);
				if (result == null) result = caseTemporalPrecedence(timeDifferenceLink);
				if (result == null) result = caseTemporalLink(timeDifferenceLink);
				if (result == null) result = caseDependencyLink(timeDifferenceLink);
				if (result == null) result = caseLink(timeDifferenceLink);
				if (result == null) result = caseContextualComponent(timeDifferenceLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseContextualComponent(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.CONTRIBUTION: {
				Contribution contribution = (Contribution)theEObject;
				T result = caseContribution(contribution);
				if (result == null) result = caseLink(contribution);
				if (result == null) result = caseContextualComponent(contribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.CONTEXTUAL_COMPONENT: {
				ContextualComponent contextualComponent = (ContextualComponent)theEObject;
				T result = caseContextualComponent(contextualComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.CONTEXT_CONDITION: {
				ContextCondition contextCondition = (ContextCondition)theEObject;
				T result = caseContextCondition(contextCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.GOAL_MODEL: {
				Goal_Model goal_Model = (Goal_Model)theEObject;
				T result = caseGoal_Model(goal_Model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.RESOURCE_DEPENDENCY: {
				ResourceDependency resourceDependency = (ResourceDependency)theEObject;
				T result = caseResourceDependency(resourceDependency);
				if (result == null) result = caseDependencyLink(resourceDependency);
				if (result == null) result = caseLink(resourceDependency);
				if (result == null) result = caseContextualComponent(resourceDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseNode(resource);
				if (result == null) result = caseContextualComponent(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.PARALLEL_NODE: {
				ParallelNode parallelNode = (ParallelNode)theEObject;
				T result = caseParallelNode(parallelNode);
				if (result == null) result = caseControlNode(parallelNode);
				if (result == null) result = caseNode(parallelNode);
				if (result == null) result = caseContextualComponent(parallelNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.PARALLEL_LINK: {
				ParallelLink parallelLink = (ParallelLink)theEObject;
				T result = caseParallelLink(parallelLink);
				if (result == null) result = caseDependencyLink(parallelLink);
				if (result == null) result = caseLink(parallelLink);
				if (result == null) result = caseContextualComponent(parallelLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.GOAL_NODE: {
				GoalNode goalNode = (GoalNode)theEObject;
				T result = caseGoalNode(goalNode);
				if (result == null) result = caseNode(goalNode);
				if (result == null) result = caseContextualComponent(goalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.CONTROL_NODE: {
				ControlNode controlNode = (ControlNode)theEObject;
				T result = caseControlNode(controlNode);
				if (result == null) result = caseNode(controlNode);
				if (result == null) result = caseContextualComponent(controlNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseGoalNode(action);
				if (result == null) result = caseNode(action);
				if (result == null) result = caseContextualComponent(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Goal_metamodelPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseGoalNode(task);
				if (result == null) result = caseNode(task);
				if (result == null) result = caseContextualComponent(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecomposition(Decomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyLink(DependencyLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Precedence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalPrecedence(LogicalPrecedence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalLink(TemporalLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Precedence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalPrecedence(TemporalPrecedence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timeout Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timeout Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeoutLink(TimeoutLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Difference Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Difference Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeDifferenceLink(TimeDifferenceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContribution(Contribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contextual Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contextual Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextualComponent(ContextualComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextCondition(ContextCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal_Model(Goal_Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceDependency(ResourceDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelNode(ParallelNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelLink(ParallelLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoalNode(GoalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlNode(ControlNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
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

} //Goal_metamodelSwitch
