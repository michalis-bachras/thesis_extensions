package diplomatiki;

import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import goal_metamodel.Action;
import goal_metamodel.ContextCondition;
import goal_metamodel.Contribution;
import goal_metamodel.ContributionType;
import goal_metamodel.Decomposition;
import goal_metamodel.DecompositionType;
import goal_metamodel.GoalNode;
import goal_metamodel.Goal_Model;
import goal_metamodel.Goal_metamodelFactory;
import goal_metamodel.LogicalPrecedence;
import goal_metamodel.ParallelLink;
import goal_metamodel.ParallelNode;
import goal_metamodel.Resource;
import goal_metamodel.ResourceDependency;
import goal_metamodel.Task;
import goal_metamodel.TemporalPrecedence;
import goal_metamodel.TimeDifferenceLink;
import goal_metamodel.TimeoutLink;

public class Generator {
	//*************************CHECK LINE 402
	
	private HashMap<String,Task> tasks = new HashMap<String,Task>();
	private HashMap<String,Action> actions = new HashMap<String,Action>(); 
	private HashMap<String,Resource> resources = new HashMap<String,Resource>(); 
	private HashMap<String,ParallelNode> parallelnodes = new HashMap<String,ParallelNode>();
	private ArrayList<LogicalPrecedence> lplinks = new ArrayList<LogicalPrecedence>();
	private ArrayList<TemporalPrecedence> tplinks = new ArrayList<TemporalPrecedence>();
	private ArrayList<ResourceDependency> rdlinks = new ArrayList<ResourceDependency>();
	private ArrayList<Contribution> contributionlinks = new ArrayList<Contribution>();
	private ArrayList<TimeDifferenceLink> time_difference_links = new ArrayList<TimeDifferenceLink>();
	private ArrayList<TimeoutLink> timeout_links = new ArrayList<TimeoutLink>();
	
	private HashMap<String,Integer> components_per_OR_id = new HashMap<String,Integer>();
	private List<ContextCondition> context_conditions = new ArrayList<ContextCondition>();
	
	
	private static long idCounter = 0;
	
	private static long and_idCounter = 0;
	
	private static long or_idCounter = 0;

	public static synchronized String createID()
	{
	    return String.valueOf(idCounter++);
	} 
	
	
	
	public Goal_Model generate(int tasksNumber, int actionsNumber,int parallelnodesnumber,int parallellinksnumber,int lplinksnumber,int tplinksnumber,int contribution_links_number,int rd_links_number,int timeout_links_number,int time_difference_links_number,int or_number) {
		
		Goal_metamodelFactory factory=Goal_metamodelFactory.eINSTANCE;
		Goal_Model goalmodel= factory.createGoal_Model();
		goalmodel.setName("Goal_Model_1");
		
		Task rootTask = factory.createTask();
		rootTask.setName("root");
		rootTask.setdepth(0);
		rootTask.setid("0");
		goalmodel.setRefers_to(rootTask);
		tasks.put("root",rootTask);
		
		
		for (int i = 0; i < tasksNumber - 1; i++) {
			Task t = factory.createTask();
			t.setName("T"+(i+1));
			tasks.put("T"+(i+1), t);
			t.setid("0");
		}
		
		Random randCost = new Random();
		int cost = 0;
		
		for (int i = 0; i < actionsNumber; i++) {
			Action a = factory.createAction();
			a.setName("A"+(i+1));
			actions.put("A"+(i+1), a);
			a.setid("0");
			cost = randCost.nextInt(25) +1;
			a.setCost(cost);
			
		}
		
		
		List<Action> actions2 = new ArrayList<Action>(actions.values());
		List<String> action_keys = new ArrayList<String>(actions.keySet());
		
		
		
		
		int maxTasksDepth = (int) (Math.log(tasks.size()) / Math.log(2));
		System.out.println("Max depth is: " + maxTasksDepth);
		int index = 1;
		int pIndex = 0;
		tasks.remove("root");
		List<String> task_keys = new ArrayList<String>(tasks.keySet());
		task_keys.add(0, "root");
		tasks.put("root",rootTask);
		
		int or_action = (or_number*4)/10;
		int or_task = (or_number*6)/10;
		
		for (int i = 0; i < maxTasksDepth+1 && index < tasks.size(); i++) {
			for (int j = 0; j < Math.pow(2, i) && index < tasks.size(); j++) {
				Task parent = tasks.get(task_keys.get(j+pIndex));
				Decomposition dec = calcRandomDecomposition();
				if(or_task == 0) {
					dec.setType(DecompositionType.AND);
				}
				parent.setHasdecomposition(dec);
				
				
				if(dec.getType() == DecompositionType.OR) {
					or_idCounter++;
					String OR_dec_id = String.valueOf(or_idCounter);
					dec.set_OR_dec_id(OR_dec_id);
					or_task = or_task - 1;
					for (int k = 0; k < 2 && index < tasks.size(); k++) {
						idCounter++;
						String OR_id = String.valueOf(idCounter);
						
						Task child = tasks.get(task_keys.get(index));
						child.set_OR_child_status();
						dec.getDecomposed_to().add(child);
						child.setdepth(parent.getdepth()+1);
						child.addANDidlist(parent.getANDids());
						child.addORidlist(parent.getORids());
						child.addORid(OR_id);
						
						
						child.set_OR_dec_id(OR_dec_id);
						child.addOR_dec_idlist(parent.getOR_dec_ids());
						child.addOR_dec_id(OR_dec_id);
						
						
						child.set_parent_OR_id(parent.get_OR_id());
						
						if(components_per_OR_id.containsKey(OR_dec_id)) {
							int number = components_per_OR_id.get(OR_dec_id);
							number = number+1;
							components_per_OR_id.put(OR_dec_id, number);
							  
						}
						else {
							components_per_OR_id.put(OR_dec_id, 1);
						}
						child.set_elimination(true);
						
						if(!parent.getName().equals("root")) {
							child.add_anchestors(parent.getName(),parent.get_anchestors());
						}
						
						
						
						
						index++;
						
					}
					
				}
				else {
					and_idCounter++;
					String AND_id = String.valueOf(and_idCounter);
					dec.setANDid(AND_id);
					for (int k = 0; k < 2 && index < tasks.size(); k++) {
						Task child = tasks.get(task_keys.get(index));
						dec.getDecomposed_to().add(child);
						child.setdepth(parent.getdepth()+1);
						child.addORidlist(parent.getORids());
						child.set_parent_OR_id(parent.get_parent_OR_id());
						child.addANDidlist(parent.getANDids());
						child.addANDid(AND_id);
						if(!parent.getName().equals("root")) {
							child.add_anchestors(parent.getName(),parent.get_anchestors());
						}
						index++;
						
						child.set_elimination(parent.get_elimination());
					}
					
				}
				
				
			}
			pIndex += (int)Math.pow(2, i);
			
		}
		
		for (int i = 0; i < 2 && actions2.size() > 0; i++) {
			for(String key : task_keys) {
				Task t = tasks.get(key);
				if (t.getHasdecomposition() == null) {
					Decomposition dec = calcRandomDecomposition();
					if(or_action == 0) {
						dec.setType(DecompositionType.AND);
					}
					t.setHasdecomposition(dec);
					if(dec.getType() == DecompositionType.OR) {
						or_idCounter++;
						String OR_dec_id = String.valueOf(or_idCounter);
						dec.set_OR_dec_id(OR_dec_id);
						idCounter++;
						String OR_id = String.valueOf(idCounter);
						or_action = or_action - 1;
						
						Action a = calcRandomAction(actions2);
						a.set_parent(t);
						a.set_OR_child_status();
						a.setdepth(t.getdepth()+1);
						addRandomResourcesToAction(a,resources);
						dec.getDecomposed_to().add(a);
						actions2.remove(a);
						a.addORid(OR_id);
						a.addORidlist(t.getORids());
						a.addANDidlist(t.getANDids());
						
						a.set_OR_dec_id(OR_dec_id);
						a.addOR_dec_idlist(t.getOR_dec_ids());
						a.addOR_dec_id(OR_dec_id);
						
						a.set_parent_OR_id(t.get_OR_id());
						
						if(components_per_OR_id.containsKey(OR_dec_id)) {
							int number = components_per_OR_id.get(OR_dec_id);
							number = number+1;
							components_per_OR_id.put(OR_dec_id, number);
							  
						}
						else {
							components_per_OR_id.put(OR_dec_id, 1);
						}
						a.set_elimination(true);
						
						if(!t.getName().equals("root")) {
							a.add_anchestors(t.getName(),t.get_anchestors());
						}
						
						
					}
					else {
						and_idCounter++;
						String AND_id = String.valueOf(and_idCounter);
						dec.setANDid(AND_id);
						Action a = calcRandomAction(actions2);
						a.set_parent(t);
						a.setdepth(t.getdepth()+1);
						addRandomResourcesToAction(a,resources);
						dec.getDecomposed_to().add(a);
						a.addANDidlist(t.getANDids());
						a.addANDid(AND_id);
						a.addORidlist(t.getORids());
						a.addOR_dec_idlist(t.getOR_dec_ids());
						a.set_parent_OR_id(t.get_parent_OR_id());
						if(!t.getName().equals("root")) {
							a.add_anchestors(t.getName(),t.get_anchestors());
						}
						actions2.remove(a);
						a.set_elimination(t.get_elimination());
					}
					
					
				}
				else if(t.getHasdecomposition().getDecomposed_to().size() == 1 && actions2.size() > 0) {
					Decomposition dec = t.getHasdecomposition();
					
					if(dec.getType() == DecompositionType.OR) {
						idCounter++;
						String OR_id = String.valueOf(idCounter);
						String OR_dec_id = dec.get_OR_dec_id();
						Action a = calcRandomAction(actions2);
						a.set_parent(t);
						a.setdepth(t.getdepth()+1);
						a.set_OR_child_status();
						addRandomResourcesToAction(a,resources);
						dec.getDecomposed_to().add(a);
						actions2.remove(a);
						a.addORid(OR_id);
						a.addORidlist(t.getORids());
						a.addANDidlist(t.getANDids());
						
						
						a.set_OR_dec_id(OR_dec_id);
						a.addOR_dec_idlist(t.getOR_dec_ids());
						a.addOR_dec_id(OR_dec_id);
						
						
						a.set_parent_OR_id(t.get_OR_id());
						
						if(!t.getName().equals("root")) {
							a.add_anchestors(t.getName(),t.get_anchestors());
						}
						if(components_per_OR_id.containsKey(OR_dec_id)) {
							int number = components_per_OR_id.get(OR_dec_id);
							number = number+1;
							components_per_OR_id.put(OR_dec_id, number);
							  
						}
						else {
							components_per_OR_id.put(OR_dec_id, 1);
						}
						a.set_elimination(true);
						
					}
					else {
						String AND_id = dec.getANDid();
						Action a = calcRandomAction(actions2);
						a.set_parent(t);
						a.setdepth(t.getdepth()+1);
						addRandomResourcesToAction(a,resources);
						dec.getDecomposed_to().add(a);
						a.addORidlist(t.getORids());
						a.addOR_dec_idlist(t.getOR_dec_ids());
						a.set_parent_OR_id(t.get_parent_OR_id());
						a.addANDidlist(t.getANDids());
						a.addANDid(AND_id);
						if(!t.getName().equals("root")) {
							a.add_anchestors(t.getName(),t.get_anchestors());
						}
						actions2.remove(a);
						a.set_elimination(t.get_elimination());
					}
					
					
				}
			}
			
			
		}
			
		
		while (actions2.size() > 0) {
			Random rand = new Random();
			int task = rand.nextInt(task_keys.size());
			Task t = tasks.get(task_keys.get(task));
			Decomposition dec = t.getHasdecomposition();
			Action a = calcRandomAction(actions2);
			a.set_parent(t);
			a.setdepth(t.getdepth()+1);
			addRandomResourcesToAction(a,resources);
			dec.getDecomposed_to().add(a);
			a.addORidlist(t.getORids());
			a.addANDidlist(t.getANDids());
			
			if(!t.getName().equals("root")) {
				a.add_anchestors(t.getName(),t.get_anchestors());
			}
			actions2.remove(a);
			if(dec.getType() == DecompositionType.OR) {
				idCounter++;
				String OR_id = String.valueOf(idCounter);
				a.addORid(OR_id);
				String OR_dec_id = dec.get_OR_dec_id();
				
				a.set_OR_dec_id(OR_dec_id);
				a.addOR_dec_idlist(t.getOR_dec_ids());
				a.addOR_dec_id(OR_dec_id);
				
				a.set_parent_OR_id(t.get_OR_id());
				
				a.set_OR_child_status();
				if(components_per_OR_id.containsKey(OR_id)) {
					int number = components_per_OR_id.get(OR_id);
					number = number+1;
					components_per_OR_id.put(OR_id, number);
					  
				}
				else {
					components_per_OR_id.put(OR_id, 1);
				}
				a.set_elimination(true);
			}
			else {
				String AND_id = dec.getANDid();
				a.addANDid(AND_id);
				a.addORidlist(t.getORids());
				a.addOR_dec_idlist(t.getOR_dec_ids());
				a.set_parent_OR_id(t.get_parent_OR_id());
				a.set_elimination(t.get_elimination());
			}
			
			
		}
		
		task_keys.remove(0);
		List<String> goal_nodes = new ArrayList<String>();
		
		goal_nodes.addAll(action_keys);
		goal_nodes.addAll(task_keys);
		List<String> all_goal_nodes = new ArrayList<String>(goal_nodes);
		List<String> all_task_keys = new ArrayList<String>(task_keys);
		List<String> all_action_keys = new ArrayList<String>(action_keys);
		
		Collections.shuffle(goal_nodes);
		int parallel_depth = 2;                            //WITH THIS VARIABLE WE DEFINE THE DEPTH WHERE THE PARALLEL NODES WILL BE OCCURED ***CHECK LINE 586 
		for(int p =0; p<parallelnodesnumber/2;p++) {
			if(goal_nodes.size() == 0) {
				System.out.println("Invalid model");
				System.exit(0);
			}
			//Random rdepth = new Random();
		
			System.out.println(parallel_depth);
			ParallelNode P = factory.createParallelNode();
			P.setName("P"+p);
			parallelnodes.put("P"+p, P);
			Random timeout_rand = new Random();
			int timeout = timeout_rand.nextInt(1000);
			P.setTimeout(timeout);
			
			
			Random rand1 = new Random();
			int choice1;
			String g1_name;
			if(p<parallelnodesnumber-1 && task_keys.size()>0) {
				choice1 = rand1.nextInt(task_keys.size());
				g1_name = task_keys.get(choice1);
			}
			else {
				choice1 = rand1.nextInt(goal_nodes.size());
				g1_name = goal_nodes.get(choice1);
			}
			
			
			GoalNode g1;
			if(g1_name.contains("T")) {
				g1 = tasks.get(g1_name);
			}
			else {
				g1 = actions.get(g1_name);
			}
			boolean flag1 =false;
			while(!flag1) {
				if(g1.getParallelLinks().size()>0 ||( g1.getdepth()) == 1 || g1.getdepth()> parallel_depth) {
					rand1 = new Random();
					if(p<parallelnodesnumber-1 && task_keys.size()>0) {
						choice1 = rand1.nextInt(task_keys.size());
						g1_name = task_keys.get(choice1);
					}
					else {
						choice1 = rand1.nextInt(goal_nodes.size());
						g1_name = goal_nodes.get(choice1);
					}
					if(g1_name.contains("T")) {
						g1 = tasks.get(g1_name);
					}
					else {
						g1 = actions.get(g1_name);
					}
				}
				else {
					parallellinksnumber = parallellinksnumber-1;
					if(p<parallelnodesnumber-1 && task_keys.size()>0) {
						task_keys.remove(choice1);
					}
					else {
						goal_nodes.remove(choice1);
					}
					
					flag1 = true;
					P.add_invalid_node(g1_name);
				}
			}
			
			int number_of_nodes = P.getNumberOfNodes();
			number_of_nodes = number_of_nodes + 1;
			P.setNumberOfNodes(number_of_nodes);
			P.set_current_parallel(g1.get_current_parallel());
			P.set_depth(parallel_depth);
			
			if(g1 instanceof Task) {
				Traverse_descendant.traverseT((Task) g1, "P"+p);
			}
			else {
				Traverse_descendant.traverseA((Action) g1, "P"+p);
			}
			P.add_invalid_ancestors(g1.get_anchestors());
			P.add_invalid_node(g1_name);
			P.add_invalid_orid(g1.get_OR_id());
			P.add_invalid_orid(g1.get_parent_OR_id());
			P.add_valid_andids(g1.getANDids());
			ParallelLink PL = factory.createParallelLink();
			PL.setTo(P);
			PL.setFrom(g1);
			if(g1.get_OR_child_status() == true) {
				P.addORGoalNode(g1);
				P.add_necessary_or_ids(g1.get_OR_dec_id());
			}
			else {
				P.addNode(g1);
			}
			
			g1.getParallelLinks().add(PL);
			
			
			
			boolean flag2 = false;
			GoalNode g2 = null;
			while(!flag2) {
				
				Random rand2 = new Random();
				int choice2 = rand2.nextInt(goal_nodes.size());
				String g2_name = goal_nodes.get(choice2);
				
				if(g2_name.contains("T")){
					g2= tasks.get(g2_name);
				}
				else {
					g2 = actions.get(g2_name);
				}
				
				boolean condition;
				
					 
				
				
				condition = (P.get_invalid_orids().contains(g2.get_OR_id()) && CommonElements(P.get_valid_andids(),g2.getANDids()));
				
				if(!P.get_invalid_nodes().contains(g2_name) && condition && !P.get_invalid_nodes().contains(g2.getName())  &&  g2.getParallelLinks().size() == 0 && P.get_current_parallel().equals(g2.get_current_parallel()) && g2.getdepth()<= parallel_depth-1 ) {
					
					flag2 = true;	
					parallellinksnumber = parallellinksnumber-1;
					P.add_invalid_node(g2_name);
					
					number_of_nodes = number_of_nodes + 1;
					P.setNumberOfNodes(number_of_nodes);
				}
				
				
			}
			
			
			goal_nodes.clear();
			task_keys.clear();
			action_keys.clear();
			List<List<String>> all = new ArrayList<List<String>>();
			all.add(goal_nodes);
			all.add(task_keys);
			all.add(action_keys);
			
			if(g1 instanceof Task && g2 instanceof Task) {
				Traverse_descendant.Find((Task) g1, all);
				Traverse_descendant.Find((Task) g2, all);
			}
			else if(g1 instanceof Task && g2 instanceof Action) {
				Traverse_descendant.Find((Task) g1, all);
			}
			else if(g1 instanceof Action && g2 instanceof Task) {
				Traverse_descendant.Find((Task) g2, all);
			}
			
			
			if(g2 instanceof Task) {
				Traverse_descendant.traverseT((Task) g2, "P"+p);
			}
			else {
				Traverse_descendant.traverseA((Action) g2, "P"+p);
			}
			goal_nodes = all.get(0);
			task_keys = all.get(1);
			action_keys = all.get(2);
			
			
			P.add_invalid_ancestors(g2.get_anchestors());
			P.add_invalid_orid(g2.get_OR_id());
			P.add_invalid_orid(g2.get_parent_OR_id());
			P.add_valid_andids(g2.getANDids());
			ParallelLink PL1 = factory.createParallelLink();
			PL1.setTo(P);
			PL1.setFrom(g2);
			if(g2.get_OR_child_status() == true) {
				P.addORGoalNode(g2);
				P.add_necessary_or_ids(g2.get_OR_dec_id());
			}
			else {
				P.addNode(g2);
			}
			g2.getParallelLinks().add(PL1);
			parallel_depth += 1;
				
		}
		
		List<String> parallelnodes_keys = new ArrayList<String>(parallelnodes.keySet());
		List<String> goal_nodes2 = new ArrayList<String>();
		goal_nodes2.addAll(action_keys);
		goal_nodes2.addAll(task_keys);
		
		
		Collections.shuffle(goal_nodes2);
		
		while(parallellinksnumber>0) {
			
			Random rand = new Random();
			
			int choice;
			String parallel_node_name = "";
			ParallelNode P = null ;  
			boolean flag3 = false;
			GoalNode g = null;
			while(!flag3) {
				
				rand = new Random();
				choice = rand.nextInt(parallelnodes_keys.size());
				parallel_node_name = parallelnodes_keys.get(choice);
				P = parallelnodes.get(parallel_node_name);
				
				choice = rand.nextInt(all_goal_nodes.size());
				String g_name = all_goal_nodes.get(choice);
			
				if(g_name.contains("T")){
					g= tasks.get(g_name);
				}
				else {
					g = actions.get(g_name);
				}
				
				boolean condition;
				

				if(g.getdepth()> P.get_depth()+1) {
					continue;
				}
				
				
				condition = (P.get_invalid_orids().contains(g.get_OR_id()) && CommonElements(P.get_valid_andids(),g.getANDids()));
				
				if(!P.get_invalid_nodes().contains(g_name) && condition  && !CommonElements(P.get_invalid_nodes(),g.get_anchestors()) && g.getParallelLinks().size() == 0 && P.get_current_parallel().equals(g.get_current_parallel())) {
					
					flag3 = true;	
					parallellinksnumber = parallellinksnumber-1;
					P.add_invalid_node(g_name);
					int number_of_nodes = P.getNumberOfNodes();
					number_of_nodes = number_of_nodes + 1;
					P.setNumberOfNodes(number_of_nodes);
				}
				
			}
			
			if(g instanceof Task) {
				Traverse_descendant.traverseT((Task) g, parallel_node_name);
			}
			else {
				Traverse_descendant.traverseA((Action) g, parallel_node_name);
			}
			
			P.add_invalid_ancestors(g.get_anchestors());
			P.add_invalid_orid(g.get_OR_id());
			P.add_valid_andids(g.getANDids());
			ParallelLink PL1 = factory.createParallelLink();
			PL1.setTo(P);
			PL1.setFrom(g);
			if(g.get_OR_child_status() == true) {
				P.addORGoalNode(g);
				P.add_necessary_or_ids(g.get_OR_dec_id());
			}
			else {
				P.addNode(g);
			}
			g.getParallelLinks().add(PL1);
			
		}
		
		Find_ADG_ids(tasks.get("root"));
		
		HashSet<String> lp_tp_invalid_nodes = new HashSet<String>();
		for(int i=0;i<lplinksnumber;i++) {
			
			boolean flag3 = false;
			while(!flag3) {
				
				List<String> goal_nodes1 = new ArrayList<String>();
				goal_nodes1.addAll(action_keys);
				goal_nodes1.addAll(task_keys);
				Collections.shuffle(all_goal_nodes);
				Random rand1 = new Random();
				int choice1 = rand1.nextInt(all_goal_nodes.size());
				String g1_name = all_goal_nodes.get(choice1);
				GoalNode g1;
				
				if(g1_name.contains("T")){
					g1= tasks.get(g1_name);
				}
				else {
					g1 = actions.get(g1_name);
				}
				Random rand2 = new Random();
				int choice2 = rand2.nextInt(all_goal_nodes.size());
				String g2_name = all_goal_nodes.get(choice2);
				GoalNode g2;
				if(g2_name.contains("T")){
					g2= tasks.get(g2_name);
				}
				else {
					g2 = actions.get(g2_name);
				}
				boolean condition;
				
				condition = (g1.get_OR_id().equals(g2.get_OR_id()) && CommonElements(g1.getANDids(),g2.getANDids())) || (g1.get_parent_OR_id().equals(g2.get_OR_id()) && CommonElements(g1.getANDids(),g2.getANDids()));
				
				if(g1.getid().equals(g2.getid()) && condition && !g1.get_anchestors().contains(g2_name) && !g2.get_anchestors().contains(g1_name) && !g1_name.equals(g2_name)) {
					if(g1.getParallelLinks().size() == 0 && g2.getParallelLinks().size() ==0) {
						LogicalPrecedence lp = factory.createLogicalPrecedence();
						lp.setFrom_goalnode(g1);
						lp.setTo_goalnode(g2);
						lplinks.add(lp);
						lp_tp_invalid_nodes.add(g1_name);
						lp_tp_invalid_nodes.add(g2_name);
						lp_tp_invalid_nodes.addAll(g1.get_anchestors());
						lp_tp_invalid_nodes.addAll(g2.get_anchestors());
						flag3 = true;
						
					}
					
						
				}
				
			}
		
		}
		
		
		for(int i=0;i<tplinksnumber;i++) {
			
			boolean flag3 = false;
			while(!flag3) {
				
				List<String> goal_nodes1 = new ArrayList<String>();
				goal_nodes1.addAll(action_keys);
				goal_nodes1.addAll(task_keys);
				Collections.shuffle(all_goal_nodes);
				Random rand1 = new Random();
				int choice1 = rand1.nextInt(all_goal_nodes.size());
				String g1_name = all_goal_nodes.get(choice1);
				GoalNode g1;
				
				if(g1_name.contains("T")){
					g1= tasks.get(g1_name);
				}
				else {
					g1 = actions.get(g1_name);
				}
				Random rand2 = new Random();
				int choice2 = rand2.nextInt(all_goal_nodes.size());
				String g2_name = all_goal_nodes.get(choice2);
				GoalNode g2;
				if(g2_name.contains("T")){
					g2= tasks.get(g2_name);
				}
				else {
					g2 = actions.get(g2_name);
				}
				
				boolean condition;
				if(!g2.get_parent_id().equals("0")) {
					condition = (g1.get_OR_id().equals(g2.get_OR_id()) && CommonElements(g1.getANDids(),g2.getANDids())) || (g1.get_parent_OR_id().equals(g2.get_OR_id()) && CommonElements(g1.getANDids(),g2.getANDids()));
				}
				else {
					condition = (g1.get_OR_id().equals(g2.get_OR_id()) && CommonElements(g1.getANDids(),g2.getANDids()));
				}				if(g1.getid().equals(g2.getid()) && condition && !g1.get_anchestors().contains(g2_name) && !g2.get_anchestors().contains(g1_name) && !g1_name.equals(g2_name)) {
					if(g1.getParallelLinks().size() == 0 && g2.getParallelLinks().size() ==0) {
						TemporalPrecedence tp = factory.createTemporalPrecedence();
						tp.setFrom(g1);
						tp.setTo(g2);
						tplinks.add(tp);
						flag3 = true;
						
						
					}
					
						
				}
				
			}
		
		}
		
		
		for(int i=0;i<contribution_links_number;i++) {
			
			boolean flag3 = false;
			while(!flag3) {
				
				List<String> goal_nodes1 = new ArrayList<String>();
				goal_nodes1.addAll(all_task_keys);
				Collections.shuffle(goal_nodes1);
				Random rand1 = new Random();
				int choice1 = rand1.nextInt(goal_nodes1.size());
				String g1_name = goal_nodes1.get(choice1);
				GoalNode g1;
				
				g1= tasks.get(g1_name);
			
				Random rand2 = new Random();
				int choice2 = rand2.nextInt(goal_nodes1.size());
				String g2_name = goal_nodes1.get(choice2);
				GoalNode g2;
				
				g2= tasks.get(g2_name);
				
				boolean condition;
				
				condition = (g1.get_OR_id().equals(g2.get_OR_id()) && CommonElements(g1.getANDids(),g2.getANDids())) || (g1.get_parent_OR_id().equals(g2.get_OR_id()) && CommonElements(g1.getANDids(),g2.getANDids()));
				
				if(g1.getid().equals(g2.getid()) && condition && !g1.get_anchestors().contains(g2_name) && !g2.get_anchestors().contains(g1_name) && !g1_name.equals(g2_name)) {
					
						Contribution c = calcRandomContribution();
						c.setFrom_goalnode(g1);
						c.setTo_goalnode(g2);
						contributionlinks.add(c);
						flag3 = true;
				
						
				}
				
			}
		
		}
		
		ArrayList<String> resources_keys = new ArrayList<String>(resources.keySet());
		Collections.shuffle(resources_keys);
		
		for(int i=0;i<rd_links_number;i++) {
			
			boolean flag3 = false;
			while(!flag3) {
				
				List<String> goal_nodes1 = new ArrayList<String>();
				goal_nodes1.addAll(all_action_keys);
				Collections.shuffle(goal_nodes1);
				Random rand1 = new Random();
				int choice1 = rand1.nextInt(goal_nodes1.size());
				String g1_name = goal_nodes1.get(choice1);
				GoalNode g1;
				
				g1= actions.get(g1_name);
			
				Random rand2 = new Random();
				int choice2 = rand2.nextInt(resources_keys.size());
				String r_name = resources_keys.get(choice2);
				Resource r;
				r=resources.get(r_name);
				
				GoalNode g2 = r.get_parent_action();
				String g2_name = g2.getName();
				boolean condition;
				
				condition = (g1.get_OR_id().equals(g2.get_OR_id()) && CommonElements(g1.getANDids(),g2.getANDids())) || (g1.get_parent_OR_id().equals(g2.get_OR_id()) && CommonElements(g1.getANDids(),g2.getANDids()));
				
				if(g1.getid().equals(g2.getid()) && condition  && !g1_name.equals(g2_name)) {
					
					ResourceDependency rd = factory.createResourceDependency();
					rd.setFrom_action((Action) g1);
					rd.setTo_resource(r);
					rdlinks.add(rd);
					flag3 = true;
					
				}
				
			}
		
		}
		
		
		for(int i=0;i<timeout_links_number;i++) {
			
			boolean flag3 = false;
			while(!flag3) {
				
				List<String> goal_nodes1 = new ArrayList<String>();
				goal_nodes1.addAll(all_action_keys);
				Collections.shuffle(goal_nodes1);
				Random rand1 = new Random();
				int choice1 = rand1.nextInt(goal_nodes1.size());
				String g1_name = goal_nodes1.get(choice1);
				GoalNode g1;
				
				g1= actions.get(g1_name);
			
				Random rand2 = new Random();
				int choice2 = rand2.nextInt(goal_nodes1.size());
				String g2_name = goal_nodes1.get(choice2);
				GoalNode g2;
				
				g2= actions.get(g2_name);
				boolean condition;
				
				condition = (g1.get_OR_id().equals(g2.get_OR_id()) && CommonElements(g1.getANDids(),g2.getANDids())) || (g1.get_parent_OR_id().equals(g2.get_OR_id()) && CommonElements(g1.getANDids(),g2.getANDids()));
				
				if(g1.getid().equals(g2.getid()) && condition  && !g1_name.equals(g2_name)) {
					
					TimeoutLink to =factory.createTimeoutLink();
					Random rand3 = new Random();
					int time = rand3.nextInt(1000);
					to.setTimeoutPeriod(time);
					to.setFrom(g1);
					to.setTo(g2);
					timeout_links.add(to);
					flag3 = true;
					
				}
				
			}
		
		}
		
		for(int i=0;i<time_difference_links_number;i++) {
			
			boolean flag3 = false;
			while(!flag3) {
				
				List<String> goal_nodes1 = new ArrayList<String>();
				goal_nodes1.addAll(all_action_keys);
				Collections.shuffle(goal_nodes1);
				Random rand1 = new Random();
				int choice1 = rand1.nextInt(goal_nodes1.size());
				String g1_name = goal_nodes1.get(choice1);
				GoalNode g1;
				
				g1= actions.get(g1_name);
			
				Random rand2 = new Random();
				int choice2 = rand2.nextInt(goal_nodes1.size());
				String g2_name = goal_nodes1.get(choice2);
				GoalNode g2;
				
				g2= actions.get(g2_name);
				boolean condition;
				
				condition = (g1.get_OR_id().equals(g2.get_OR_id()) && CommonElements(g1.getANDids(),g2.getANDids())) || (g1.get_parent_OR_id().equals(g2.get_OR_id()) && CommonElements(g1.getANDids(),g2.getANDids()));
				
				if(g1.getid().equals(g2.getid()) && condition  && !g1_name.equals(g2_name)) {
					
					TimeDifferenceLink td =factory.createTimeDifferenceLink();
					Random rand3 = new Random();
					int time = rand3.nextInt(1000);
					td.setTimeDifference(time);
					td.setFrom(g1);
					td.setTo(g2);
					time_difference_links.add(td);
					flag3 = true;
					
				}
				
			}
		
		}
		
		goalmodel.setTasks(tasks);
		goalmodel.setActions(actions);
		goalmodel.setParallelNodes(parallelnodes);
		goalmodel.setResources(resources);
		goalmodel.setlplinks(lplinks);
		goalmodel.settplinks(tplinks);
		goalmodel.setrdlinks(rdlinks);
		goalmodel.setcontributionlinks(contributionlinks);
		goalmodel.settimeoutlinks(timeout_links);
		goalmodel.settimedifferencelinks(time_difference_links);
		goalmodel.set_components_per_OR_id(components_per_OR_id);
		goalmodel.set_context_conditions(context_conditions);
		
		
		return goalmodel;
		
	}
	
	
	private boolean CommonElements(HashSet<String> s1,HashSet<String> s2) {
		HashSet<String> temp = new HashSet<String>(s1);
		temp.retainAll(s2);
		
		
		if(temp.size()>0) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	
	private void addRandomResourcesToAction(Action a,
			HashMap<String,Resource> resources) {
		Random rand = new Random();
		//List<String> resources_keys = new ArrayList<String>(resources.keySet());
		int resourcesNumber = rand.nextInt(3) + 1;
		
		for (int i = 0; i < resourcesNumber; i++) {
				Resource r = Goal_metamodelFactory.eINSTANCE.createResource();
				r.setName("R"+(resources.size()+1));
				resources.put("R"+(resources.size()+1), r);
				a.getRequires().add(r);
				
				r.set_parent_action(a);
		}
		
	}
	
	
	private Action calcRandomAction(List<Action> actions2) {
		Random rand = new Random();
		return actions2.get(rand.nextInt(actions2.size()));
	}
	
	private Decomposition calcRandomDecomposition() {
		Decomposition dec = Goal_metamodelFactory.eINSTANCE.createDecomposition();
		
		Random rand = new Random();
		boolean type = rand.nextBoolean();
		if (type)
			dec.setType(DecompositionType.AND);
		else
			dec.setType(DecompositionType.OR);
		
		return dec;
	}
	
	private Contribution calcRandomContribution() {
		Contribution contr = Goal_metamodelFactory.eINSTANCE.createContribution();
		Random rand = new Random();
		int num = rand.nextInt(4);
		if(num == 0) {
			contr.setType(ContributionType.PPS);
		}
		else if(num == 1) {
			contr.setType(ContributionType.MMS);
		}
		else if(num == 2) {
			contr.setType(ContributionType.PPD);
		}
		else {
			contr.setType(ContributionType.MMD);
		}
		return contr;
	}
	
	
	
	
	
	public void Find_ADG_ids(Task root) {
		GoalNode parent;
		EList <GoalNode> nodes = new BasicEList<GoalNode>(root.getHasdecomposition().getDecomposed_to());
		//nodes = root.getHasdecomposition().getDecomposed_to();
		
		parent = root;
		while(nodes.isEmpty() != true) {
			Iterator<GoalNode> node_iterator = nodes.iterator();
			EList <GoalNode> children = new BasicEList<GoalNode>();
			while(node_iterator.hasNext()) {
				
				GoalNode g=node_iterator.next();
				
				if(g.getParallelLinks().size()>0) {
					g.setid(g.getParallelLinks().get(0).getTo().getName());
					//g.set_parent_id(parent.getid());
				}
				else {
					g.setid(g.get_parent_id());
					//g.set_parent_id(parent.getid());
				}
				
				if(g instanceof Action) {
					//System.out.print(g+" ");
					//System.out.println(g.getid());
				}
				if(g instanceof Task) {
					int limit = ((Task) g).getHasdecomposition().getDecomposed_to().size();
					EList <GoalNode> temp = new BasicEList<GoalNode>();
					temp = ((Task) g).getHasdecomposition().getDecomposed_to();
					
					for(int i=0; i<limit;i++) {
						
						GoalNode r = temp.get(i);
						r.set_parent_id(g.getid());
						//System.out.println(temp);
						children.add(r);
					}
				}
				parent = g;
				
				nodes.remove(0);
				node_iterator = nodes.iterator();
			}
			nodes=children;
			//children.clear();
		}
	}
	
	

}
