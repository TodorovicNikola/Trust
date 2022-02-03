/**
 */
package process_modeling.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import process_modeling.Capability;
import process_modeling.Constraint;
import process_modeling.Gate;
import process_modeling.IDNamedElement;
import process_modeling.Parameter;
import process_modeling.Persistable;
import process_modeling.Pool;
import process_modeling.ProcessElement;
import process_modeling.ProcessParameter;
import process_modeling.ProcessStep;
import process_modeling.Process_modelingPackage;
import process_modeling.Product;
import process_modeling.Relationship;
import process_modeling.Resource;
import process_modeling.SubProcess;
import process_modeling.SwimLane;
import process_modeling.Traceable;
import process_modeling.UnorderedSteps;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see process_modeling.Process_modelingPackage
 * @generated
 */
public class Process_modelingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Process_modelingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Process_modelingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Process_modelingPackage.eINSTANCE;
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
	protected Process_modelingSwitch<Adapter> modelSwitch =
		new Process_modelingSwitch<Adapter>() {
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseProcess(process_modeling.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseProcessStep(ProcessStep object) {
				return createProcessStepAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseCapability(Capability object) {
				return createCapabilityAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseProcessElement(ProcessElement object) {
				return createProcessElementAdapter();
			}
			@Override
			public Adapter caseGate(Gate object) {
				return createGateAdapter();
			}
			@Override
			public Adapter caseIDNamedElement(IDNamedElement object) {
				return createIDNamedElementAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseError(process_modeling.Error object) {
				return createErrorAdapter();
			}
			@Override
			public Adapter caseSubProcess(SubProcess object) {
				return createSubProcessAdapter();
			}
			@Override
			public Adapter caseUnorderedSteps(UnorderedSteps object) {
				return createUnorderedStepsAdapter();
			}
			@Override
			public Adapter caseProcessParameter(ProcessParameter object) {
				return createProcessParameterAdapter();
			}
			@Override
			public Adapter caseTraceable(Traceable object) {
				return createTraceableAdapter();
			}
			@Override
			public Adapter casePersistable(Persistable object) {
				return createPersistableAdapter();
			}
			@Override
			public Adapter casePool(Pool object) {
				return createPoolAdapter();
			}
			@Override
			public Adapter caseSwimLane(SwimLane object) {
				return createSwimLaneAdapter();
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
	 * Creates a new adapter for an object of class '{@link process_modeling.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see process_modeling.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link process_modeling.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see process_modeling.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link process_modeling.ProcessStep <em>Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see process_modeling.ProcessStep
	 * @generated
	 */
	public Adapter createProcessStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link process_modeling.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see process_modeling.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link process_modeling.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see process_modeling.Capability
	 * @generated
	 */
	public Adapter createCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link process_modeling.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see process_modeling.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link process_modeling.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see process_modeling.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link process_modeling.ProcessElement <em>Process Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see process_modeling.ProcessElement
	 * @generated
	 */
	public Adapter createProcessElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link process_modeling.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see process_modeling.Gate
	 * @generated
	 */
	public Adapter createGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link process_modeling.IDNamedElement <em>ID Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see process_modeling.IDNamedElement
	 * @generated
	 */
	public Adapter createIDNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link process_modeling.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see process_modeling.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link process_modeling.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see process_modeling.Error
	 * @generated
	 */
	public Adapter createErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link process_modeling.SubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see process_modeling.SubProcess
	 * @generated
	 */
	public Adapter createSubProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link process_modeling.UnorderedSteps <em>Unordered Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see process_modeling.UnorderedSteps
	 * @generated
	 */
	public Adapter createUnorderedStepsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link process_modeling.ProcessParameter <em>Process Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see process_modeling.ProcessParameter
	 * @generated
	 */
	public Adapter createProcessParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link process_modeling.Traceable <em>Traceable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see process_modeling.Traceable
	 * @generated
	 */
	public Adapter createTraceableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link process_modeling.Persistable <em>Persistable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see process_modeling.Persistable
	 * @generated
	 */
	public Adapter createPersistableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link process_modeling.Pool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see process_modeling.Pool
	 * @generated
	 */
	public Adapter createPoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link process_modeling.SwimLane <em>Swim Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see process_modeling.SwimLane
	 * @generated
	 */
	public Adapter createSwimLaneAdapter() {
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

} //Process_modelingAdapterFactory
