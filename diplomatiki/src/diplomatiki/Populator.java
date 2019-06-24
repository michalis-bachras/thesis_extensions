package diplomatiki;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.HashSet;

import goal_metamodel.*;

//import org.eclipse.emf.common.util.*;

public  class Populator {

		
		private HashMap<String,Task> tasks = new HashMap<String,Task>();
		private HashMap<String,Action> actions = new HashMap<String,Action>(); 
		private HashMap<String,Resource> resources = new HashMap<String,Resource>(); 
		private HashMap<String,ParallelNode> parallelnodes = new HashMap<String,ParallelNode>();
		private ArrayList<LogicalPrecedence> lplinks = new ArrayList<LogicalPrecedence>();
		private ArrayList<TemporalPrecedence> tplinks = new ArrayList<TemporalPrecedence>();
		private ArrayList<ResourceDependency> rdlinks = new ArrayList<ResourceDependency>();
		private ArrayList<Contribution> contributionlinks = new ArrayList<Contribution>();
	//	private ArrayList<TimeDifferenceLink> time_difference_links = new ArrayList<TimeDifferenceLink>();
		private ArrayList<TimeoutLink> timeout_links = new ArrayList<TimeoutLink>();
	
		public Populator() {}
		
		public Goal_Model generate() {
			Task current_parent;
			Goal_metamodelFactory factory=Goal_metamodelFactory.eINSTANCE;
			Goal_Model goalmodel= factory.createGoal_Model();
			goalmodel.setName("Goal_Model_1");
		
			Task rootTask = factory.createTask();
			rootTask.setName("root");
			rootTask.setdepth(0);
			rootTask.setid("0");
			goalmodel.setRefers_to(rootTask);
			
			 
			tasks.put("root",rootTask);
			
			Task T1 = factory.createTask();
			T1.setName("T1");
			tasks.put("T1",T1);
			
			
			Task T2 = factory.createTask();
			T2.setName("T2");
			tasks.put("T2",T2);
			
			Task T3 = factory.createTask();
			T3.setName("T3");
			tasks.put("T3",T3);
			
			Task T4 = factory.createTask();
			T4.setName("T4");
			tasks.put("T4",T4);
			
			Task T5 = factory.createTask();
			T5.setName("T5");
			tasks.put("T5",T5);
			
			Task T6 = factory.createTask();
			T6.setName("T6");
			tasks.put("T6",T6);
			
			
			
			Action B1 = factory.createAction();
			B1.setName("B1");
			actions.put("B1",B1);
			
			Action B2 = factory.createAction();
			B2.setName("B2");
			actions.put("B2",B2);
			
			Action A1 = factory.createAction();
			A1.setName("A1");
			actions.put("A1",A1);
			
			Action A2 = factory.createAction();
			A2.setName("A2");
			actions.put("A2",A2);
			
			Action A3 = factory.createAction();
			A3.setName("A3");
			actions.put("A3",A3);
			
			Action A4 = factory.createAction();
			A4.setName("A4");
			actions.put("A4",A4);
			
			Action A5 = factory.createAction();
			A5.setName("A5");
			actions.put("A5",A5);
			
			Action A6 = factory.createAction();
			A6.setName("A6");
			actions.put("A6",A6);
			
			Action A7 = factory.createAction();
			A7.setName("A7");
			actions.put("A7",A7);
			
			
			
			Resource R1 = factory.createResource();
			R1.setName("R1");
			R1.setAvailable(true);
			resources.put("R1", R1);
			R1.set_parent_action(A1);
			
			Resource R2 = factory.createResource();
			R2.setName("R2");
			R2.setAvailable(true);
			resources.put("R2", R2);
			R2.set_parent_action(B1);
			
			
			
			ParallelNode P1 = factory.createParallelNode();
			P1.setName("P1");
			parallelnodes.put("P1", P1);
			
			ParallelNode P2 = factory.createParallelNode();
			P2.setName("P2");
			parallelnodes.put("P2", P2);
			
			Decomposition dec1 = factory.createDecomposition();
			dec1.setType(DecompositionType.OR);
			
			rootTask.setHasdecomposition(dec1);
			current_parent = rootTask;
			
			dec1.getDecomposed_to().add(T1);
			T1.setdepth(current_parent.getdepth()+1);
			dec1.getDecomposed_to().add(T2);
			T2.setdepth(current_parent.getdepth()+1);
			dec1.getDecomposed_to().add(T3);
			T3.setdepth(current_parent.getdepth()+1);
			
			Decomposition dec2 = factory.createDecomposition();
			dec2.setType(DecompositionType.AND);
			
			T1.setHasdecomposition(dec2);
			current_parent = T1;
			dec2.getDecomposed_to().add(B1);
			B1.setdepth(current_parent.getdepth()+1);
			dec2.getDecomposed_to().add(B2);
			B2.setdepth(current_parent.getdepth()+1);
			
			Decomposition dec3 = factory.createDecomposition();
			dec3.setType(DecompositionType.OR);
			
			T2.setHasdecomposition(dec3);
			current_parent = T2;
			dec3.getDecomposed_to().add(T4);
			T4.setdepth(current_parent.getdepth()+1);
			dec3.getDecomposed_to().add(A5);
			A5.setdepth(current_parent.getdepth()+1);
			
			Decomposition dec4 = factory.createDecomposition();
			dec4.setType(DecompositionType.OR);
			
			T4.setHasdecomposition(dec4);
			current_parent = T4;
			dec4.getDecomposed_to().add(T5);
			T5.setdepth(current_parent.getdepth()+1);
			dec4.getDecomposed_to().add(T6);
			T6.setdepth(current_parent.getdepth()+1);
			
			Decomposition dec5 = factory.createDecomposition();
			dec5.setType(DecompositionType.AND);
			
			T5.setHasdecomposition(dec5);
			current_parent = T5;
			dec5.getDecomposed_to().add(A1);
			A1.setdepth(current_parent.getdepth()+1);
			dec5.getDecomposed_to().add(A2);
			A2.setdepth(current_parent.getdepth()+1);
			
			A1.getRequires().add(R1);
			
			Decomposition dec6 = factory.createDecomposition();
			dec6.setType(DecompositionType.OR);
			
			T6.setHasdecomposition(dec6);
			current_parent = T6;
			dec6.getDecomposed_to().add(A3);
			A3.setdepth(current_parent.getdepth()+1);
			dec6.getDecomposed_to().add(A4);
			A4.setdepth(current_parent.getdepth()+1);
			
			Decomposition dec7 = factory.createDecomposition();
			dec7.setType(DecompositionType.OR);
			
			T3.setHasdecomposition(dec7);
			current_parent = T3;
			dec7.getDecomposed_to().add(A6);
			A6.setdepth(current_parent.getdepth()+1);
			dec7.getDecomposed_to().add(A7);
			A7.setdepth(current_parent.getdepth()+1);
			
			ParallelLink PL1 = factory.createParallelLink();
			PL1.setTo(P1);
			PL1.setFrom(A3);
			P1.addNode(A3);
			A3.getParallelLinks().add(PL1);
			
			ParallelLink PL2 = factory.createParallelLink();
			PL2.setTo(P1);
			PL2.setFrom(A4);
			P1.addNode(A4);
			A4.getParallelLinks().add(PL2);
			
			ParallelLink PL3 = factory.createParallelLink();
			PL3.setTo(P2);
			PL3.setFrom(T2);
			P2.addORGoalNode(T2);
			T2.getParallelLinks().add(PL3);
			
			ParallelLink PL4 = factory.createParallelLink();
			PL4.setTo(P2);
			PL4.setFrom(T3);
			P2.addORGoalNode(T3);
			T3.getParallelLinks().add(PL4);
			
			//LogicalPrecedence lp1 = factory.createLogicalPrecedence();
			//lp1.setFrom_goalnode(T2);
			//lp1.setTo_goalnode(T1);
			//lplinks.add(lp1);
			
			LogicalPrecedence lp2 = factory.createLogicalPrecedence();
			lp2.setFrom_goalnode(A1);
			lp2.setTo_goalnode(A2);
			lplinks.add(lp2);
			
			Contribution C1 = factory.createContribution();
			C1.setFrom_goalnode(T3);
			C1.setTo_goalnode(T4);
			C1.setType(ContributionType.MMS);
			contributionlinks.add(C1);
			
			TimeoutLink TO1 = factory.createTimeoutLink();
			TO1.setFrom_action(B1);
			TO1.setTo_action(B2);
			TO1.setTimeoutPeriod(10);
			timeout_links.add(TO1);
			
					
			
			return goalmodel;
		}
		
		
		public HashMap<String,Task> getTasks(){
			return tasks;
		}
		
		public HashMap<String,Action> getActions(){
			return actions;
		}
		
		public HashMap<String,Resource> getResoures(){
			return resources;
		}
		
		public HashMap<String,ParallelNode> getParallelNodes(){
			return parallelnodes;
		}
		
		public ArrayList<LogicalPrecedence> getlplinks(){
			return lplinks;
		}
		
		public ArrayList<TemporalPrecedence> gettplinks(){
			return tplinks;
		}
		
		public ArrayList<ResourceDependency> getrdlinks(){
			return rdlinks;
		}
		
		public  ArrayList<Contribution> getcontributionlinks(){
			return contributionlinks;
		}
		
		public ArrayList<TimeoutLink> gettimeoutlinks(){
			return timeout_links;
		}
}
