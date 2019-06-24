/**
 */
package goal_metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see goal_metamodel.Goal_metamodelFactory
 * @model kind="package"
 * @generated
 */
public interface Goal_metamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "goal_metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/goal_metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "goal_metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Goal_metamodelPackage eINSTANCE = goal_metamodel.impl.Goal_metamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.NodeImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.ContextualComponentImpl <em>Contextual Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.ContextualComponentImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getContextualComponent()
	 * @generated
	 */
	int CONTEXTUAL_COMPONENT = 10;

	/**
	 * The feature id for the '<em><b>Has contextcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_COMPONENT__HAS_CONTEXTCONDITION = 0;

	/**
	 * The feature id for the '<em><b>Context enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_COMPONENT__CONTEXT_ENABLED = 1;

	/**
	 * The number of structural features of the '<em>Contextual Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contextual Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Has contextcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HAS_CONTEXTCONDITION = CONTEXTUAL_COMPONENT__HAS_CONTEXTCONDITION;

	/**
	 * The feature id for the '<em><b>Context enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONTEXT_ENABLED = CONTEXTUAL_COMPONENT__CONTEXT_ENABLED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = CONTEXTUAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = CONTEXTUAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = CONTEXTUAL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = CONTEXTUAL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.DecompositionImpl <em>Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.DecompositionImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getDecomposition()
	 * @generated
	 */
	int DECOMPOSITION = 1;

	/**
	 * The feature id for the '<em><b>Has contextcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__HAS_CONTEXTCONDITION = CONTEXTUAL_COMPONENT__HAS_CONTEXTCONDITION;

	/**
	 * The feature id for the '<em><b>Context enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__CONTEXT_ENABLED = CONTEXTUAL_COMPONENT__CONTEXT_ENABLED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__TYPE = CONTEXTUAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decomposed to</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__DECOMPOSED_TO = CONTEXTUAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_FEATURE_COUNT = CONTEXTUAL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_OPERATION_COUNT = CONTEXTUAL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.LinkImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 8;

	/**
	 * The feature id for the '<em><b>Has contextcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HAS_CONTEXTCONDITION = CONTEXTUAL_COMPONENT__HAS_CONTEXTCONDITION;

	/**
	 * The feature id for the '<em><b>Context enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CONTEXT_ENABLED = CONTEXTUAL_COMPONENT__CONTEXT_ENABLED;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__AVAILABLE = CONTEXTUAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = CONTEXTUAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = CONTEXTUAL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.DependencyLinkImpl <em>Dependency Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.DependencyLinkImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getDependencyLink()
	 * @generated
	 */
	int DEPENDENCY_LINK = 2;

	/**
	 * The feature id for the '<em><b>Has contextcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_LINK__HAS_CONTEXTCONDITION = LINK__HAS_CONTEXTCONDITION;

	/**
	 * The feature id for the '<em><b>Context enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_LINK__CONTEXT_ENABLED = LINK__CONTEXT_ENABLED;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_LINK__AVAILABLE = LINK__AVAILABLE;

	/**
	 * The number of structural features of the '<em>Dependency Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dependency Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.LogicalPrecedenceImpl <em>Logical Precedence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.LogicalPrecedenceImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getLogicalPrecedence()
	 * @generated
	 */
	int LOGICAL_PRECEDENCE = 3;

	/**
	 * The feature id for the '<em><b>Has contextcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PRECEDENCE__HAS_CONTEXTCONDITION = DEPENDENCY_LINK__HAS_CONTEXTCONDITION;

	/**
	 * The feature id for the '<em><b>Context enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PRECEDENCE__CONTEXT_ENABLED = DEPENDENCY_LINK__CONTEXT_ENABLED;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PRECEDENCE__AVAILABLE = DEPENDENCY_LINK__AVAILABLE;

	/**
	 * The feature id for the '<em><b>From goalnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PRECEDENCE__FROM_GOALNODE = DEPENDENCY_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To goalnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PRECEDENCE__TO_GOALNODE = DEPENDENCY_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PRECEDENCE_FEATURE_COUNT = DEPENDENCY_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Logical Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PRECEDENCE_OPERATION_COUNT = DEPENDENCY_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.TemporalLinkImpl <em>Temporal Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.TemporalLinkImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getTemporalLink()
	 * @generated
	 */
	int TEMPORAL_LINK = 4;

	/**
	 * The feature id for the '<em><b>Has contextcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_LINK__HAS_CONTEXTCONDITION = DEPENDENCY_LINK__HAS_CONTEXTCONDITION;

	/**
	 * The feature id for the '<em><b>Context enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_LINK__CONTEXT_ENABLED = DEPENDENCY_LINK__CONTEXT_ENABLED;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_LINK__AVAILABLE = DEPENDENCY_LINK__AVAILABLE;

	/**
	 * The number of structural features of the '<em>Temporal Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_LINK_FEATURE_COUNT = DEPENDENCY_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temporal Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_LINK_OPERATION_COUNT = DEPENDENCY_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.TemporalPrecedenceImpl <em>Temporal Precedence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.TemporalPrecedenceImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getTemporalPrecedence()
	 * @generated
	 */
	int TEMPORAL_PRECEDENCE = 5;

	/**
	 * The feature id for the '<em><b>Has contextcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PRECEDENCE__HAS_CONTEXTCONDITION = TEMPORAL_LINK__HAS_CONTEXTCONDITION;

	/**
	 * The feature id for the '<em><b>Context enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PRECEDENCE__CONTEXT_ENABLED = TEMPORAL_LINK__CONTEXT_ENABLED;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PRECEDENCE__AVAILABLE = TEMPORAL_LINK__AVAILABLE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PRECEDENCE__FROM = TEMPORAL_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PRECEDENCE__TO = TEMPORAL_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Temporal Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PRECEDENCE_FEATURE_COUNT = TEMPORAL_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Temporal Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_PRECEDENCE_OPERATION_COUNT = TEMPORAL_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.TimeoutLinkImpl <em>Timeout Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.TimeoutLinkImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getTimeoutLink()
	 * @generated
	 */
	int TIMEOUT_LINK = 6;

	/**
	 * The feature id for the '<em><b>Has contextcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_LINK__HAS_CONTEXTCONDITION = TEMPORAL_PRECEDENCE__HAS_CONTEXTCONDITION;

	/**
	 * The feature id for the '<em><b>Context enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_LINK__CONTEXT_ENABLED = TEMPORAL_PRECEDENCE__CONTEXT_ENABLED;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_LINK__AVAILABLE = TEMPORAL_PRECEDENCE__AVAILABLE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_LINK__FROM = TEMPORAL_PRECEDENCE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_LINK__TO = TEMPORAL_PRECEDENCE__TO;

	/**
	 * The feature id for the '<em><b>Timeout Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_LINK__TIMEOUT_PERIOD = TEMPORAL_PRECEDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_LINK__FROM_ACTION = TEMPORAL_PRECEDENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_LINK__TO_ACTION = TEMPORAL_PRECEDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Timeout Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_LINK_FEATURE_COUNT = TEMPORAL_PRECEDENCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Timeout Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_LINK_OPERATION_COUNT = TEMPORAL_PRECEDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.TimeDifferenceLinkImpl <em>Time Difference Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.TimeDifferenceLinkImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getTimeDifferenceLink()
	 * @generated
	 */
	int TIME_DIFFERENCE_LINK = 7;

	/**
	 * The feature id for the '<em><b>Has contextcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIFFERENCE_LINK__HAS_CONTEXTCONDITION = TEMPORAL_PRECEDENCE__HAS_CONTEXTCONDITION;

	/**
	 * The feature id for the '<em><b>Context enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIFFERENCE_LINK__CONTEXT_ENABLED = TEMPORAL_PRECEDENCE__CONTEXT_ENABLED;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIFFERENCE_LINK__AVAILABLE = TEMPORAL_PRECEDENCE__AVAILABLE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIFFERENCE_LINK__FROM = TEMPORAL_PRECEDENCE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIFFERENCE_LINK__TO = TEMPORAL_PRECEDENCE__TO;

	/**
	 * The feature id for the '<em><b>Time Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIFFERENCE_LINK__TIME_DIFFERENCE = TEMPORAL_PRECEDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIFFERENCE_LINK__FROM_ACTION = TEMPORAL_PRECEDENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIFFERENCE_LINK__TO_ACTION = TEMPORAL_PRECEDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Time Difference Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIFFERENCE_LINK_FEATURE_COUNT = TEMPORAL_PRECEDENCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Time Difference Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIFFERENCE_LINK_OPERATION_COUNT = TEMPORAL_PRECEDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.ContributionImpl <em>Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.ContributionImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getContribution()
	 * @generated
	 */
	int CONTRIBUTION = 9;

	/**
	 * The feature id for the '<em><b>Has contextcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__HAS_CONTEXTCONDITION = LINK__HAS_CONTEXTCONDITION;

	/**
	 * The feature id for the '<em><b>Context enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__CONTEXT_ENABLED = LINK__CONTEXT_ENABLED;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__AVAILABLE = LINK__AVAILABLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__TYPE = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From goalnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__FROM_GOALNODE = LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To goalnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__TO_GOALNODE = LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_FEATURE_COUNT = LINK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.ContextConditionImpl <em>Context Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.ContextConditionImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getContextCondition()
	 * @generated
	 */
	int CONTEXT_CONDITION = 11;

	/**
	 * The number of structural features of the '<em>Context Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Context Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.Goal_ModelImpl <em>Goal Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.Goal_ModelImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getGoal_Model()
	 * @generated
	 */
	int GOAL_MODEL = 12;

	/**
	 * The feature id for the '<em><b>Contextcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__CONTEXTCONDITION = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__LINK = 1;

	/**
	 * The feature id for the '<em><b>Refers to</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__REFERS_TO = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__NAME = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Goal Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Goal Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.ResourceDependencyImpl <em>Resource Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.ResourceDependencyImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getResourceDependency()
	 * @generated
	 */
	int RESOURCE_DEPENDENCY = 13;

	/**
	 * The feature id for the '<em><b>Has contextcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEPENDENCY__HAS_CONTEXTCONDITION = DEPENDENCY_LINK__HAS_CONTEXTCONDITION;

	/**
	 * The feature id for the '<em><b>Context enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEPENDENCY__CONTEXT_ENABLED = DEPENDENCY_LINK__CONTEXT_ENABLED;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEPENDENCY__AVAILABLE = DEPENDENCY_LINK__AVAILABLE;

	/**
	 * The feature id for the '<em><b>To resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEPENDENCY__TO_RESOURCE = DEPENDENCY_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEPENDENCY__FROM_ACTION = DEPENDENCY_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Resource Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEPENDENCY_OPERATION_COUNT = DEPENDENCY_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.ResourceImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 14;

	/**
	 * The feature id for the '<em><b>Has contextcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HAS_CONTEXTCONDITION = NODE__HAS_CONTEXTCONDITION;

	/**
	 * The feature id for the '<em><b>Context enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTEXT_ENABLED = NODE__CONTEXT_ENABLED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__AVAILABLE = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.ControlNodeImpl <em>Control Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.ControlNodeImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getControlNode()
	 * @generated
	 */
	int CONTROL_NODE = 18;

	/**
	 * The feature id for the '<em><b>Has contextcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__HAS_CONTEXTCONDITION = NODE__HAS_CONTEXTCONDITION;

	/**
	 * The feature id for the '<em><b>Context enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__CONTEXT_ENABLED = NODE__CONTEXT_ENABLED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.ParallelNodeImpl <em>Parallel Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.ParallelNodeImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getParallelNode()
	 * @generated
	 */
	int PARALLEL_NODE = 15;

	/**
	 * The feature id for the '<em><b>Has contextcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__HAS_CONTEXTCONDITION = CONTROL_NODE__HAS_CONTEXTCONDITION;

	/**
	 * The feature id for the '<em><b>Context enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__CONTEXT_ENABLED = CONTROL_NODE__CONTEXT_ENABLED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__DESCRIPTION = CONTROL_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Number Of Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__NUMBER_OF_NODES = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__TIMEOUT = CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parallel Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parallel Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.ParallelLinkImpl <em>Parallel Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.ParallelLinkImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getParallelLink()
	 * @generated
	 */
	int PARALLEL_LINK = 16;

	/**
	 * The feature id for the '<em><b>Has contextcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_LINK__HAS_CONTEXTCONDITION = DEPENDENCY_LINK__HAS_CONTEXTCONDITION;

	/**
	 * The feature id for the '<em><b>Context enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_LINK__CONTEXT_ENABLED = DEPENDENCY_LINK__CONTEXT_ENABLED;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_LINK__AVAILABLE = DEPENDENCY_LINK__AVAILABLE;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_LINK__TO = DEPENDENCY_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_LINK__FROM = DEPENDENCY_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parallel Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_LINK_FEATURE_COUNT = DEPENDENCY_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parallel Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_LINK_OPERATION_COUNT = DEPENDENCY_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.GoalNodeImpl <em>Goal Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.GoalNodeImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getGoalNode()
	 * @generated
	 */
	int GOAL_NODE = 17;

	/**
	 * The feature id for the '<em><b>Has contextcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_NODE__HAS_CONTEXTCONDITION = NODE__HAS_CONTEXTCONDITION;

	/**
	 * The feature id for the '<em><b>Context enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_NODE__CONTEXT_ENABLED = NODE__CONTEXT_ENABLED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_NODE__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_NODE__AVAILABLE = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Goal Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Goal Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.ActionImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 19;

	/**
	 * The feature id for the '<em><b>Has contextcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__HAS_CONTEXTCONDITION = GOAL_NODE__HAS_CONTEXTCONDITION;

	/**
	 * The feature id for the '<em><b>Context enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTEXT_ENABLED = GOAL_NODE__CONTEXT_ENABLED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = GOAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = GOAL_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__AVAILABLE = GOAL_NODE__AVAILABLE;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__REQUIRES = GOAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__RESOURCE_ENABLED = GOAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__START_TIME = GOAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__END_TIME = GOAL_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = GOAL_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = GOAL_NODE_FEATURE_COUNT + 5;
	
	int PARALLELLINK__LIST = GOAL_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = GOAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.impl.TaskImpl
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 20;

	/**
	 * The feature id for the '<em><b>Has contextcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HAS_CONTEXTCONDITION = GOAL_NODE__HAS_CONTEXTCONDITION;

	/**
	 * The feature id for the '<em><b>Context enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONTEXT_ENABLED = GOAL_NODE__CONTEXT_ENABLED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = GOAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = GOAL_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__AVAILABLE = GOAL_NODE__AVAILABLE;

	/**
	 * The feature id for the '<em><b>Hasdecomposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HASDECOMPOSITION = GOAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = GOAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = GOAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link goal_metamodel.DecompositionType <em>Decomposition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.DecompositionType
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getDecompositionType()
	 * @generated
	 */
	int DECOMPOSITION_TYPE = 21;

	/**
	 * The meta object id for the '{@link goal_metamodel.ContributionType <em>Contribution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goal_metamodel.ContributionType
	 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getContributionType()
	 * @generated
	 */
	int CONTRIBUTION_TYPE = 22;

	


	/**
	 * Returns the meta object for class '{@link goal_metamodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see goal_metamodel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link goal_metamodel.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see goal_metamodel.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link goal_metamodel.Node#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see goal_metamodel.Node#getDescription()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Description();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decomposition</em>'.
	 * @see goal_metamodel.Decomposition
	 * @generated
	 */
	EClass getDecomposition();

	/**
	 * Returns the meta object for the attribute '{@link goal_metamodel.Decomposition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see goal_metamodel.Decomposition#getType()
	 * @see #getDecomposition()
	 * @generated
	 */
	EAttribute getDecomposition_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link goal_metamodel.Decomposition#getDecomposed_to <em>Decomposed to</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decomposed to</em>'.
	 * @see goal_metamodel.Decomposition#getDecomposed_to()
	 * @see #getDecomposition()
	 * @generated
	 */
	EReference getDecomposition_Decomposed_to();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.DependencyLink <em>Dependency Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Link</em>'.
	 * @see goal_metamodel.DependencyLink
	 * @generated
	 */
	EClass getDependencyLink();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.LogicalPrecedence <em>Logical Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Precedence</em>'.
	 * @see goal_metamodel.LogicalPrecedence
	 * @generated
	 */
	EClass getLogicalPrecedence();

	/**
	 * Returns the meta object for the reference '{@link goal_metamodel.LogicalPrecedence#getFrom_goalnode <em>From goalnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From goalnode</em>'.
	 * @see goal_metamodel.LogicalPrecedence#getFrom_goalnode()
	 * @see #getLogicalPrecedence()
	 * @generated
	 */
	EReference getLogicalPrecedence_From_goalnode();

	/**
	 * Returns the meta object for the reference '{@link goal_metamodel.LogicalPrecedence#getTo_goalnode <em>To goalnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To goalnode</em>'.
	 * @see goal_metamodel.LogicalPrecedence#getTo_goalnode()
	 * @see #getLogicalPrecedence()
	 * @generated
	 */
	EReference getLogicalPrecedence_To_goalnode();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.TemporalLink <em>Temporal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Link</em>'.
	 * @see goal_metamodel.TemporalLink
	 * @generated
	 */
	EClass getTemporalLink();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.TemporalPrecedence <em>Temporal Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Precedence</em>'.
	 * @see goal_metamodel.TemporalPrecedence
	 * @generated
	 */
	EClass getTemporalPrecedence();

	/**
	 * Returns the meta object for the reference '{@link goal_metamodel.TemporalPrecedence#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see goal_metamodel.TemporalPrecedence#getFrom()
	 * @see #getTemporalPrecedence()
	 * @generated
	 */
	EReference getTemporalPrecedence_From();

	/**
	 * Returns the meta object for the reference '{@link goal_metamodel.TemporalPrecedence#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see goal_metamodel.TemporalPrecedence#getTo()
	 * @see #getTemporalPrecedence()
	 * @generated
	 */
	EReference getTemporalPrecedence_To();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.TimeoutLink <em>Timeout Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timeout Link</em>'.
	 * @see goal_metamodel.TimeoutLink
	 * @generated
	 */
	EClass getTimeoutLink();

	/**
	 * Returns the meta object for the attribute '{@link goal_metamodel.TimeoutLink#getTimeoutPeriod <em>Timeout Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout Period</em>'.
	 * @see goal_metamodel.TimeoutLink#getTimeoutPeriod()
	 * @see #getTimeoutLink()
	 * @generated
	 */
	EAttribute getTimeoutLink_TimeoutPeriod();

	/**
	 * Returns the meta object for the reference '{@link goal_metamodel.TimeoutLink#getFrom_action <em>From action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From action</em>'.
	 * @see goal_metamodel.TimeoutLink#getFrom_action()
	 * @see #getTimeoutLink()
	 * @generated
	 */
	EReference getTimeoutLink_From_action();

	/**
	 * Returns the meta object for the reference '{@link goal_metamodel.TimeoutLink#getTo_action <em>To action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To action</em>'.
	 * @see goal_metamodel.TimeoutLink#getTo_action()
	 * @see #getTimeoutLink()
	 * @generated
	 */
	EReference getTimeoutLink_To_action();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.TimeDifferenceLink <em>Time Difference Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Difference Link</em>'.
	 * @see goal_metamodel.TimeDifferenceLink
	 * @generated
	 */
	EClass getTimeDifferenceLink();

	/**
	 * Returns the meta object for the attribute '{@link goal_metamodel.TimeDifferenceLink#getTimeDifference <em>Time Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Difference</em>'.
	 * @see goal_metamodel.TimeDifferenceLink#getTimeDifference()
	 * @see #getTimeDifferenceLink()
	 * @generated
	 */
	EAttribute getTimeDifferenceLink_TimeDifference();

	/**
	 * Returns the meta object for the reference '{@link goal_metamodel.TimeDifferenceLink#getFrom_action <em>From action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From action</em>'.
	 * @see goal_metamodel.TimeDifferenceLink#getFrom_action()
	 * @see #getTimeDifferenceLink()
	 * @generated
	 */
	EReference getTimeDifferenceLink_From_action();

	/**
	 * Returns the meta object for the reference '{@link goal_metamodel.TimeDifferenceLink#getTo_action <em>To action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To action</em>'.
	 * @see goal_metamodel.TimeDifferenceLink#getTo_action()
	 * @see #getTimeDifferenceLink()
	 * @generated
	 */
	EReference getTimeDifferenceLink_To_action();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see goal_metamodel.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link goal_metamodel.Link#isAvailable <em>Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available</em>'.
	 * @see goal_metamodel.Link#isAvailable()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Available();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contribution</em>'.
	 * @see goal_metamodel.Contribution
	 * @generated
	 */
	EClass getContribution();

	/**
	 * Returns the meta object for the attribute '{@link goal_metamodel.Contribution#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see goal_metamodel.Contribution#getType()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_Type();

	/**
	 * Returns the meta object for the reference '{@link goal_metamodel.Contribution#getFrom_goalnode <em>From goalnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From goalnode</em>'.
	 * @see goal_metamodel.Contribution#getFrom_goalnode()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_From_goalnode();

	/**
	 * Returns the meta object for the reference '{@link goal_metamodel.Contribution#getTo_goalnode <em>To goalnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To goalnode</em>'.
	 * @see goal_metamodel.Contribution#getTo_goalnode()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_To_goalnode();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.ContextualComponent <em>Contextual Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contextual Component</em>'.
	 * @see goal_metamodel.ContextualComponent
	 * @generated
	 */
	EClass getContextualComponent();

	/**
	 * Returns the meta object for the reference list '{@link goal_metamodel.ContextualComponent#getHas_contextcondition <em>Has contextcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has contextcondition</em>'.
	 * @see goal_metamodel.ContextualComponent#getHas_contextcondition()
	 * @see #getContextualComponent()
	 * @generated
	 */
	EReference getContextualComponent_Has_contextcondition();

	/**
	 * Returns the meta object for the attribute '{@link goal_metamodel.ContextualComponent#isContext_enabled <em>Context enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context enabled</em>'.
	 * @see goal_metamodel.ContextualComponent#isContext_enabled()
	 * @see #getContextualComponent()
	 * @generated
	 */
	EAttribute getContextualComponent_Context_enabled();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.ContextCondition <em>Context Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Condition</em>'.
	 * @see goal_metamodel.ContextCondition
	 * @generated
	 */
	EClass getContextCondition();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.Goal_Model <em>Goal Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Model</em>'.
	 * @see goal_metamodel.Goal_Model
	 * @generated
	 */
	EClass getGoal_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link goal_metamodel.Goal_Model#getContextcondition <em>Contextcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contextcondition</em>'.
	 * @see goal_metamodel.Goal_Model#getContextcondition()
	 * @see #getGoal_Model()
	 * @generated
	 */
	EReference getGoal_Model_Contextcondition();

	/**
	 * Returns the meta object for the containment reference list '{@link goal_metamodel.Goal_Model#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see goal_metamodel.Goal_Model#getLink()
	 * @see #getGoal_Model()
	 * @generated
	 */
	EReference getGoal_Model_Link();

	/**
	 * Returns the meta object for the reference '{@link goal_metamodel.Goal_Model#getRefers_to <em>Refers to</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers to</em>'.
	 * @see goal_metamodel.Goal_Model#getRefers_to()
	 * @see #getGoal_Model()
	 * @generated
	 */
	EReference getGoal_Model_Refers_to();

	/**
	 * Returns the meta object for the attribute '{@link goal_metamodel.Goal_Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see goal_metamodel.Goal_Model#getName()
	 * @see #getGoal_Model()
	 * @generated
	 */
	EAttribute getGoal_Model_Name();

	/**
	 * Returns the meta object for the attribute '{@link goal_metamodel.Goal_Model#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see goal_metamodel.Goal_Model#getDescription()
	 * @see #getGoal_Model()
	 * @generated
	 */
	EAttribute getGoal_Model_Description();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.ResourceDependency <em>Resource Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Dependency</em>'.
	 * @see goal_metamodel.ResourceDependency
	 * @generated
	 */
	EClass getResourceDependency();

	/**
	 * Returns the meta object for the reference '{@link goal_metamodel.ResourceDependency#getTo_resource <em>To resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To resource</em>'.
	 * @see goal_metamodel.ResourceDependency#getTo_resource()
	 * @see #getResourceDependency()
	 * @generated
	 */
	EReference getResourceDependency_To_resource();

	/**
	 * Returns the meta object for the reference '{@link goal_metamodel.ResourceDependency#getFrom_action <em>From action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From action</em>'.
	 * @see goal_metamodel.ResourceDependency#getFrom_action()
	 * @see #getResourceDependency()
	 * @generated
	 */
	EReference getResourceDependency_From_action();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see goal_metamodel.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link goal_metamodel.Resource#isAvailable <em>Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available</em>'.
	 * @see goal_metamodel.Resource#isAvailable()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Available();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.ParallelNode <em>Parallel Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Node</em>'.
	 * @see goal_metamodel.ParallelNode
	 * @generated
	 */
	EClass getParallelNode();

	/**
	 * Returns the meta object for the attribute '{@link goal_metamodel.ParallelNode#getNumberOfNodes <em>Number Of Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Nodes</em>'.
	 * @see goal_metamodel.ParallelNode#getNumberOfNodes()
	 * @see #getParallelNode()
	 * @generated
	 */
	EAttribute getParallelNode_NumberOfNodes();

	/**
	 * Returns the meta object for the attribute '{@link goal_metamodel.ParallelNode#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see goal_metamodel.ParallelNode#getTimeout()
	 * @see #getParallelNode()
	 * @generated
	 */
	EAttribute getParallelNode_Timeout();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.ParallelLink <em>Parallel Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Link</em>'.
	 * @see goal_metamodel.ParallelLink
	 * @generated
	 */
	EClass getParallelLink();

	/**
	 * Returns the meta object for the reference '{@link goal_metamodel.ParallelLink#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see goal_metamodel.ParallelLink#getTo()
	 * @see #getParallelLink()
	 * @generated
	 */
	EReference getParallelLink_To();

	/**
	 * Returns the meta object for the reference '{@link goal_metamodel.ParallelLink#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see goal_metamodel.ParallelLink#getFrom()
	 * @see #getParallelLink()
	 * @generated
	 */
	EReference getParallelLink_From();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.GoalNode <em>Goal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Node</em>'.
	 * @see goal_metamodel.GoalNode
	 * @generated
	 */
	EClass getGoalNode();

	/**
	 * Returns the meta object for the attribute '{@link goal_metamodel.GoalNode#isAvailable <em>Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available</em>'.
	 * @see goal_metamodel.GoalNode#isAvailable()
	 * @see #getGoalNode()
	 * @generated
	 */
	EAttribute getGoalNode_Available();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node</em>'.
	 * @see goal_metamodel.ControlNode
	 * @generated
	 */
	EClass getControlNode();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see goal_metamodel.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference list '{@link goal_metamodel.Action#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requires</em>'.
	 * @see goal_metamodel.Action#getRequires()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Requires();

	/**
	 * Returns the meta object for the attribute '{@link goal_metamodel.Action#isResource_enabled <em>Resource enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource enabled</em>'.
	 * @see goal_metamodel.Action#isResource_enabled()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Resource_enabled();

	/**
	 * Returns the meta object for the attribute '{@link goal_metamodel.Action#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see goal_metamodel.Action#getStartTime()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link goal_metamodel.Action#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see goal_metamodel.Action#getEndTime()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link goal_metamodel.Action#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see goal_metamodel.Action#getId()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Id();

	/**
	 * Returns the meta object for class '{@link goal_metamodel.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see goal_metamodel.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the containment reference '{@link goal_metamodel.Task#getHasdecomposition <em>Hasdecomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hasdecomposition</em>'.
	 * @see goal_metamodel.Task#getHasdecomposition()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Hasdecomposition();

	/**
	 * Returns the meta object for enum '{@link goal_metamodel.DecompositionType <em>Decomposition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decomposition Type</em>'.
	 * @see goal_metamodel.DecompositionType
	 * @generated
	 */
	EEnum getDecompositionType();

	/**
	 * Returns the meta object for enum '{@link goal_metamodel.ContributionType <em>Contribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contribution Type</em>'.
	 * @see goal_metamodel.ContributionType
	 * @generated
	 */
	EEnum getContributionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Goal_metamodelFactory getGoal_metamodelFactory();

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
		 * The meta object literal for the '{@link goal_metamodel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.NodeImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__DESCRIPTION = eINSTANCE.getNode_Description();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.DecompositionImpl <em>Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.DecompositionImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getDecomposition()
		 * @generated
		 */
		EClass DECOMPOSITION = eINSTANCE.getDecomposition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECOMPOSITION__TYPE = eINSTANCE.getDecomposition_Type();

		/**
		 * The meta object literal for the '<em><b>Decomposed to</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSITION__DECOMPOSED_TO = eINSTANCE.getDecomposition_Decomposed_to();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.DependencyLinkImpl <em>Dependency Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.DependencyLinkImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getDependencyLink()
		 * @generated
		 */
		EClass DEPENDENCY_LINK = eINSTANCE.getDependencyLink();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.LogicalPrecedenceImpl <em>Logical Precedence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.LogicalPrecedenceImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getLogicalPrecedence()
		 * @generated
		 */
		EClass LOGICAL_PRECEDENCE = eINSTANCE.getLogicalPrecedence();

		/**
		 * The meta object literal for the '<em><b>From goalnode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_PRECEDENCE__FROM_GOALNODE = eINSTANCE.getLogicalPrecedence_From_goalnode();

		/**
		 * The meta object literal for the '<em><b>To goalnode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_PRECEDENCE__TO_GOALNODE = eINSTANCE.getLogicalPrecedence_To_goalnode();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.TemporalLinkImpl <em>Temporal Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.TemporalLinkImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getTemporalLink()
		 * @generated
		 */
		EClass TEMPORAL_LINK = eINSTANCE.getTemporalLink();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.TemporalPrecedenceImpl <em>Temporal Precedence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.TemporalPrecedenceImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getTemporalPrecedence()
		 * @generated
		 */
		EClass TEMPORAL_PRECEDENCE = eINSTANCE.getTemporalPrecedence();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_PRECEDENCE__FROM = eINSTANCE.getTemporalPrecedence_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_PRECEDENCE__TO = eINSTANCE.getTemporalPrecedence_To();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.TimeoutLinkImpl <em>Timeout Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.TimeoutLinkImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getTimeoutLink()
		 * @generated
		 */
		EClass TIMEOUT_LINK = eINSTANCE.getTimeoutLink();

		/**
		 * The meta object literal for the '<em><b>Timeout Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMEOUT_LINK__TIMEOUT_PERIOD = eINSTANCE.getTimeoutLink_TimeoutPeriod();

		/**
		 * The meta object literal for the '<em><b>From action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_LINK__FROM_ACTION = eINSTANCE.getTimeoutLink_From_action();

		/**
		 * The meta object literal for the '<em><b>To action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_LINK__TO_ACTION = eINSTANCE.getTimeoutLink_To_action();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.TimeDifferenceLinkImpl <em>Time Difference Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.TimeDifferenceLinkImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getTimeDifferenceLink()
		 * @generated
		 */
		EClass TIME_DIFFERENCE_LINK = eINSTANCE.getTimeDifferenceLink();

		/**
		 * The meta object literal for the '<em><b>Time Difference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DIFFERENCE_LINK__TIME_DIFFERENCE = eINSTANCE.getTimeDifferenceLink_TimeDifference();

		/**
		 * The meta object literal for the '<em><b>From action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_DIFFERENCE_LINK__FROM_ACTION = eINSTANCE.getTimeDifferenceLink_From_action();

		/**
		 * The meta object literal for the '<em><b>To action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_DIFFERENCE_LINK__TO_ACTION = eINSTANCE.getTimeDifferenceLink_To_action();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.LinkImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__AVAILABLE = eINSTANCE.getLink_Available();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.ContributionImpl <em>Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.ContributionImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getContribution()
		 * @generated
		 */
		EClass CONTRIBUTION = eINSTANCE.getContribution();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__TYPE = eINSTANCE.getContribution_Type();

		/**
		 * The meta object literal for the '<em><b>From goalnode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__FROM_GOALNODE = eINSTANCE.getContribution_From_goalnode();

		/**
		 * The meta object literal for the '<em><b>To goalnode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__TO_GOALNODE = eINSTANCE.getContribution_To_goalnode();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.ContextualComponentImpl <em>Contextual Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.ContextualComponentImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getContextualComponent()
		 * @generated
		 */
		EClass CONTEXTUAL_COMPONENT = eINSTANCE.getContextualComponent();

		/**
		 * The meta object literal for the '<em><b>Has contextcondition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXTUAL_COMPONENT__HAS_CONTEXTCONDITION = eINSTANCE.getContextualComponent_Has_contextcondition();

		/**
		 * The meta object literal for the '<em><b>Context enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXTUAL_COMPONENT__CONTEXT_ENABLED = eINSTANCE.getContextualComponent_Context_enabled();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.ContextConditionImpl <em>Context Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.ContextConditionImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getContextCondition()
		 * @generated
		 */
		EClass CONTEXT_CONDITION = eINSTANCE.getContextCondition();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.Goal_ModelImpl <em>Goal Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.Goal_ModelImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getGoal_Model()
		 * @generated
		 */
		EClass GOAL_MODEL = eINSTANCE.getGoal_Model();

		/**
		 * The meta object literal for the '<em><b>Contextcondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__CONTEXTCONDITION = eINSTANCE.getGoal_Model_Contextcondition();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__LINK = eINSTANCE.getGoal_Model_Link();

		/**
		 * The meta object literal for the '<em><b>Refers to</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_MODEL__REFERS_TO = eINSTANCE.getGoal_Model_Refers_to();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL_MODEL__NAME = eINSTANCE.getGoal_Model_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL_MODEL__DESCRIPTION = eINSTANCE.getGoal_Model_Description();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.ResourceDependencyImpl <em>Resource Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.ResourceDependencyImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getResourceDependency()
		 * @generated
		 */
		EClass RESOURCE_DEPENDENCY = eINSTANCE.getResourceDependency();

		/**
		 * The meta object literal for the '<em><b>To resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_DEPENDENCY__TO_RESOURCE = eINSTANCE.getResourceDependency_To_resource();

		/**
		 * The meta object literal for the '<em><b>From action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_DEPENDENCY__FROM_ACTION = eINSTANCE.getResourceDependency_From_action();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.ResourceImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__AVAILABLE = eINSTANCE.getResource_Available();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.ParallelNodeImpl <em>Parallel Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.ParallelNodeImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getParallelNode()
		 * @generated
		 */
		EClass PARALLEL_NODE = eINSTANCE.getParallelNode();

		/**
		 * The meta object literal for the '<em><b>Number Of Nodes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARALLEL_NODE__NUMBER_OF_NODES = eINSTANCE.getParallelNode_NumberOfNodes();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARALLEL_NODE__TIMEOUT = eINSTANCE.getParallelNode_Timeout();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.ParallelLinkImpl <em>Parallel Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.ParallelLinkImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getParallelLink()
		 * @generated
		 */
		EClass PARALLEL_LINK = eINSTANCE.getParallelLink();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_LINK__TO = eINSTANCE.getParallelLink_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_LINK__FROM = eINSTANCE.getParallelLink_From();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.GoalNodeImpl <em>Goal Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.GoalNodeImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getGoalNode()
		 * @generated
		 */
		EClass GOAL_NODE = eINSTANCE.getGoalNode();

		/**
		 * The meta object literal for the '<em><b>Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL_NODE__AVAILABLE = eINSTANCE.getGoalNode_Available();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.ControlNodeImpl <em>Control Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.ControlNodeImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getControlNode()
		 * @generated
		 */
		EClass CONTROL_NODE = eINSTANCE.getControlNode();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.ActionImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__REQUIRES = eINSTANCE.getAction_Requires();

		/**
		 * The meta object literal for the '<em><b>Resource enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__RESOURCE_ENABLED = eINSTANCE.getAction_Resource_enabled();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__START_TIME = eINSTANCE.getAction_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__END_TIME = eINSTANCE.getAction_EndTime();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ID = eINSTANCE.getAction_Id();

		/**
		 * The meta object literal for the '{@link goal_metamodel.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.impl.TaskImpl
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Hasdecomposition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__HASDECOMPOSITION = eINSTANCE.getTask_Hasdecomposition();

		/**
		 * The meta object literal for the '{@link goal_metamodel.DecompositionType <em>Decomposition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.DecompositionType
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getDecompositionType()
		 * @generated
		 */
		EEnum DECOMPOSITION_TYPE = eINSTANCE.getDecompositionType();

		/**
		 * The meta object literal for the '{@link goal_metamodel.ContributionType <em>Contribution Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goal_metamodel.ContributionType
		 * @see goal_metamodel.impl.Goal_metamodelPackageImpl#getContributionType()
		 * @generated
		 */
		EEnum CONTRIBUTION_TYPE = eINSTANCE.getContributionType();

	}

} //Goal_metamodelPackage
