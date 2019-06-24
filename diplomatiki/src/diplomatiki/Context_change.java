package diplomatiki;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import goal_metamodel.Action;
import goal_metamodel.ContextCondition;
import goal_metamodel.GoalNode;
import goal_metamodel.Goal_Model;
import goal_metamodel.Goal_metamodelFactory;
import goal_metamodel.ParallelNode;
import goal_metamodel.Resource;
import goal_metamodel.Task;

public class Context_change {
	
	private HashMap<String,Task> tasks = new HashMap<String,Task>();
	private HashMap<String,Action> actions = new HashMap<String,Action>(); 
	private List<String> goal_names = new ArrayList<String>();
	private  HashMap<String,Resource> resources = new HashMap<String,Resource>();
	private List<String> resources_names = new ArrayList<String>();
	
	
	
	public Context_change(HashMap<String,Task> tasks,HashMap<String,Action> actions, HashMap<String,Resource> resources) {
		this.tasks = tasks;
		this.actions = actions;
		goal_names.addAll(tasks.keySet());
		goal_names.addAll(actions.keySet());
		this.resources = resources;
		resources_names.addAll(resources.keySet());
		
	}
	
	
	public void change(Goal_Model g,int number,int unavailable_resources) {
		
		while(number>0) {
			Random rand = new Random();
			String goal = goal_names.get(rand.nextInt(goal_names.size()));
			if(goal.equals("root")) {
				continue;
			}
			else if(goal.contains("T")) {
				Task t = tasks.get(goal);
				if(t.get_OR_child_status() == true ) {
					if(g.get_components__per_OR_id().containsKey(t.get_OR_dec_id())) {
						if(g.get_components__per_OR_id().get(t.get_OR_dec_id()) < 2) {
							continue;
							//throw new IllegalArgumentException("Context not available");
						}
						else {
							t.set_availability_status(false);
							int num = g.get_components__per_OR_id().get(t.get_OR_dec_id());
							num = num -1;
							g.get_components__per_OR_id().put(t.get_OR_dec_id(), num);
							Find_and_change(t);
							number = number -1;
							ContextCondition context_condition = Goal_metamodelFactory.eINSTANCE.createContextCondition();
							context_condition.set_affected_node(t.getName());
							g.get_context_conditions().add(context_condition);
							if(t.getParallelLinks().size()>0) {
								ParallelNode P = t.getParallelLinks().get(0).getTo();
								int number_of_nodes = P.getNumberOfNodes();
								number_of_nodes = number_of_nodes - 1;
								P.setNumberOfNodes(number_of_nodes);
							}
						}
					}
				}
				else {
					if(t.get_elimination() == false) {
						continue;
						//throw new IllegalArgumentException("Context not available");
					}
					else {
						t.set_availability_status(false);
						Find_and_change(t);
						number = number -1;
						ContextCondition context_condition = Goal_metamodelFactory.eINSTANCE.createContextCondition();
						context_condition.set_affected_node(t.getName());
						g.get_context_conditions().add(context_condition);
						if(t.getParallelLinks().size()>0) {
							ParallelNode P = t.getParallelLinks().get(0).getTo();
							int number_of_nodes = P.getNumberOfNodes();
							number_of_nodes = number_of_nodes - 1;
							P.setNumberOfNodes(number_of_nodes);
						}
					}
					
				}
				
			}
			else {
				Action a = actions.get(goal);
				if(a.get_OR_child_status() == true ) {
					if(g.get_components__per_OR_id().containsKey(a.get_OR_dec_id())) {
						if(g.get_components__per_OR_id().get(a.get_OR_dec_id()) < 2) {
							continue;
							//throw new IllegalArgumentException("Context not available");
						}
						else {
							a.set_availability_status(false);
							int num = g.get_components__per_OR_id().get(a.get_OR_dec_id());
							num = num -1;
							g.get_components__per_OR_id().put(a.get_OR_dec_id(), num);
							
							number = number -1;
							ContextCondition context_condition = Goal_metamodelFactory.eINSTANCE.createContextCondition();
							context_condition.set_affected_node(a.getName());
							g.get_context_conditions().add(context_condition);
							if(a.getParallelLinks().size()>0) {
								ParallelNode P = a.getParallelLinks().get(0).getTo();
								int number_of_nodes = P.getNumberOfNodes();
								number_of_nodes = number_of_nodes - 1;
								P.setNumberOfNodes(number_of_nodes);
							}
						}
					}
				}
				else {
					if(a.get_elimination() == false) {
						continue;
						//throw new IllegalArgumentException("Context not available");
					}
					else {
						a.set_availability_status(false);
						number = number -1;
						ContextCondition context_condition = Goal_metamodelFactory.eINSTANCE.createContextCondition();
						context_condition.set_affected_node(a.getName());
						g.get_context_conditions().add(context_condition);
						if(a.getParallelLinks().size()>0) {
							ParallelNode P = a.getParallelLinks().get(0).getTo();
							int number_of_nodes = P.getNumberOfNodes();
							number_of_nodes = number_of_nodes - 1;
							P.setNumberOfNodes(number_of_nodes);
						}
					}
					
				}
				
			}
			System.out.println("Unavailable node: " +goal);
			
		}
		
		while(unavailable_resources>0) {
			//System.out.println("aaaaaa");
			Random rand = new Random();
			String resource = resources_names.get(rand.nextInt(resources_names.size()));
			Resource r = resources.get(resource);
			Action a = r.get_parent_action();
			
			
			if(a.get_OR_child_status() == true ) {
				if(g.get_components__per_OR_id().containsKey(a.get_OR_dec_id())) {
					if(g.get_components__per_OR_id().get(a.get_OR_dec_id()) < 2) {
						continue;
						//throw new IllegalArgumentException("Solution not available");
					}
					else {
						a.set_availability_status(false);
						int num = g.get_components__per_OR_id().get(a.get_OR_dec_id());
						num = num -1;
						g.get_components__per_OR_id().put(a.get_OR_dec_id(), num);
						
						unavailable_resources = unavailable_resources -1;
						r.setAvailable(false);
						System.out.println("Unavailable resource: " + resource);
						ContextCondition context_condition = Goal_metamodelFactory.eINSTANCE.createContextCondition();
						context_condition.set_affected_node(a.getName());
						g.get_context_conditions().add(context_condition);
						if(a.getParallelLinks().size()>0) {
							ParallelNode P = a.getParallelLinks().get(0).getTo();
							int number_of_nodes = P.getNumberOfNodes();
							number_of_nodes = number_of_nodes - 1;
							P.setNumberOfNodes(number_of_nodes);
						}
					}
				}
			}
			else {
				if(a.get_elimination() == false) {
					continue;
					//throw new IllegalArgumentException("Solution not available");
				}
				else {
					a.set_availability_status(false);
					unavailable_resources = unavailable_resources -1;
					r.setAvailable(false);
					System.out.println("Unavailable resource: " + resource);
					ContextCondition context_condition = Goal_metamodelFactory.eINSTANCE.createContextCondition();
					context_condition.set_affected_node(a.getName());
					g.get_context_conditions().add(context_condition);
					if(a.getParallelLinks().size()>0) {
						ParallelNode P = a.getParallelLinks().get(0).getTo();
						int number_of_nodes = P.getNumberOfNodes();
						number_of_nodes = number_of_nodes - 1;
						P.setNumberOfNodes(number_of_nodes);
					}
					Task parent = a.get_parent();
					parent.set_availability_status(false);
					for(int i=0;i<parent.getHasdecomposition().getDecomposed_to().size();i++) {
						parent.getHasdecomposition().getDecomposed_to().get(i).set_availability_status(false);
					}
				}
				
			}
	
			
		}
		
	}
	
	
	public static void Find_and_change(Task t){
		
		for(int i=0;i<t.getHasdecomposition().getDecomposed_to().size();i++) {
			GoalNode g = t.getHasdecomposition().getDecomposed_to().get(i);
			if(g instanceof Task) {
				g.set_availability_status(false);
				Find_and_change((Task) g);
			}
			else {
				g.set_availability_status(false);
			}
		}
		
		
	}

}
