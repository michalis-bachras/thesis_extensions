package diplomatiki;

import goal_metamodel.*;
import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collection;
import java.util.HashMap;
//import java.util.HashSet;
//import java.util.HashSet;
import java.util.List;
//import java.util.Set;

public class Find_Actions {
	
	public static <T> ArrayList<ArrayList<T>> powerSet(ArrayList<T> originalSet) {
		ArrayList<ArrayList<T>> sets = new ArrayList<ArrayList<T>>();
	    if (originalSet.isEmpty()) {
	        sets.add(new ArrayList<T>());
	        return sets;
	    }
	    List<T> list = new ArrayList<T>(originalSet);
	    T head = list.get(0);
	    ArrayList<T> rest = new  ArrayList<T>(list.subList(1, list.size())); 
	    for (ArrayList<T> set : powerSet(rest)) {
	    	ArrayList<T> newSet = new ArrayList<T>();
	        newSet.add(head);
	        newSet.addAll(set);
	        sets.add(newSet);
	        sets.add(set);
	    }       
	    return sets;
	}
	
	private static void buildPowerSet(ArrayList<String> list, int count,ArrayList<ArrayList<String>> powerSet)
	{
		if(list.size()>0) {
			powerSet.add(list);
		}
	    

	    for(int i=0; i<list.size(); i++)
	    {
	        ArrayList<String> temp = new ArrayList<String>(list);
	        temp.remove(i);
	        buildPowerSet(temp, temp.size(),powerSet);
	    }
	}

	protected ArrayList<ArrayList<Action>> outer = new ArrayList<ArrayList<Action>>();
	//protected ArrayList<Action> inner = new ArrayList<Action>();
	
	public Find_Actions(List<Task> tasks){	
	}
	
	
	public static <T> ArrayList<T> Join(ArrayList<T> list1,  ArrayList<T> list2) {
        ArrayList<T> result = new ArrayList<T>(list1);
        result.addAll(list2);
        return result;
    }

	static void GeneratePermutations(ArrayList<ArrayList<ArrayList<String>>> Lists, ArrayList<ArrayList<String>> result, int depth, ArrayList<String> current)
	{
		
	    if(depth == Lists.size())
	    {
	    	
	       result.add(current);
	       
	       return;
	     }

	    for(int i = 0; i < Lists.get(depth).size(); ++i)
	    {
	    	
	    	ArrayList<String> temp = new ArrayList<String>(current);
	        temp.addAll(Lists.get(depth).get(i));
	        GeneratePermutations(Lists, result, depth + 1, temp);
	    }
	}
	
	
	
	
	
	
	public static void Find(List<Task> tasks,ArrayList<Task> parallel_tasks,Goal_Model goalmodel){
		
		Goal_metamodelFactory factory=Goal_metamodelFactory.eINSTANCE;
		int max_depth = tasks.get(0).getdepth();
		int size = tasks.size();
		int i=0;
		HashMap<String,Action> global_parallel_actions = new HashMap<String,Action>(); 
		while(i<size) {
			
			boolean break_flag = false;
			Task t = tasks.get(i);
			System.out.println("Task is: "+t.getName());
			if(t.getdepth() == max_depth) {                            //begin from the lowest tasks in goal tree
				if(t.getHasdecomposition().getType() == DecompositionType.AND) {
					int number_of_components = t.getHasdecomposition().getDecomposed_to().size();
					ArrayList<String> inner = new ArrayList<String>();
					HashMap<String,Action> parallel_actions = new HashMap<String,Action>();  //list of created parallel actions(pseudo actions) that represents each parallel group
					for (int j=0; j<number_of_components;j++) {
						if(t.getHasdecomposition().getDecomposed_to().get(j).getParallelLinks().size()>0) {
							
							if(t.getHasdecomposition().getDecomposed_to().get(j).get_availability_status() == false) {  //if one child is unavailable then the father is unavailable
								break_flag = true;
								t.set_availability_status(false);
								break;
							}
							String name = t.getHasdecomposition().getDecomposed_to().get(j).getParallelLinks().get(0).getTo().getName();  
							Action P;
							if(global_parallel_actions.containsKey(name)) {
								P= global_parallel_actions.get(name);
							}
							else {
								P = factory.createAction();
								global_parallel_actions.put(name, P);
							}
							
							
							P.setName(name);
							P.setIsParallelAction();
							
							parallel_actions.put(name, P);
							goalmodel.getActions().put(name, P);
							
						}
						else {
							if(t.getHasdecomposition().getDecomposed_to().get(j).get_availability_status() == false) {  //if one child is unavailable then the father is unavailable
								break_flag = true;
								t.set_availability_status(false);
								break;
							}
							
							inner.add(t.getHasdecomposition().getDecomposed_to().get(j).getName());
						}
						
					}
					if(break_flag == true) {
						i++;
						continue;
					}
					
					ArrayList<String> parallel_actions2 = new ArrayList<String>(parallel_actions.keySet());
					
					t.setOuterList(inner);    //put in a list the set that satisfies t 
					t.getOuterList().get(0).addAll(parallel_actions2);   //put in the above set the created pseudo parallel actions
					//Νομιζω ότι μπορω να βάλω την parallel_actions2 κατευθειαν στην inner να γλιτωσω χρόνο
					
				}
				
				else {
					ArrayList<String> combinations = new ArrayList<String>();
					int number_of_components = t.getHasdecomposition().getDecomposed_to().size();
					HashMap<String,Action> parallel_actions = new HashMap<String,Action>();
					for (int j=0; j<number_of_components;j++) {
						if(t.getHasdecomposition().getDecomposed_to().get(j).getParallelLinks().size()>0) {
							if(t.getHasdecomposition().getDecomposed_to().get(j).get_availability_status() == false) {
								continue;
							}
							String name = t.getHasdecomposition().getDecomposed_to().get(j).getParallelLinks().get(0).getTo().getName();
							Action P;
							if(global_parallel_actions.containsKey(name)) {
								P= global_parallel_actions.get(name);
							}
							else {
								P = factory.createAction();
								global_parallel_actions.put(name, P);
							}
							
							P.setName(name);
							P.setIsParallelAction();
							P.set_OR_dec_id(t.getHasdecomposition().get_OR_dec_id());    
							parallel_actions.put(name, P);
							goalmodel.getActions().put(name, P);
						}
						else {
							if(t.getHasdecomposition().getDecomposed_to().get(j).get_availability_status() == false) {
								continue;
							}
							
							combinations.add(t.getHasdecomposition().getDecomposed_to().get(j).getName());
							
						}
						
						
					}
					for(String value : parallel_actions.keySet()) {
						
						combinations.add(value);
						
					}
					
					buildPowerSet(combinations,combinations.size(),t.getOuterList());  //find all possible combinations that satisfy task t nad put them in outerlist
					
					
					
				}
			}
			
			else {
				if(t.getHasdecomposition().getType() == DecompositionType.AND) {
					int number_of_components = t.getHasdecomposition().getDecomposed_to().size();
					ArrayList<ArrayList<ArrayList<String>>> allActions = new ArrayList<ArrayList<ArrayList<String>>>();   //in this list i will put all the sets o f actions that satisfy the children nodes
					HashMap<String,Action> parallel_actions = new HashMap<String,Action>();
					for(int k=0;k<number_of_components;k++) {
						if(t.getHasdecomposition().getDecomposed_to().get(k).get_availability_status() == false) {   //if one child is unavailable then the father is unavailable
							break_flag = true;
							t.set_availability_status(false);
							break;
						}
						if(t.getHasdecomposition().getDecomposed_to().get(k) instanceof Task) {
							Task t1 = (Task)t.getHasdecomposition().getDecomposed_to().get(k);
							if(t1.getParallelLinks().size()>0) {
								//parallel_tasks.add(t1);
								String name = t1.getParallelLinks().get(0).getTo().getName();
								Action P;
								if(global_parallel_actions.containsKey(name)) {
									P= global_parallel_actions.get(name);
								}
								else {
									P = factory.createAction();
									global_parallel_actions.put(name, P);
								}
								
								P.setName(name);
								P.setIsParallelAction();
								parallel_actions.put(name, P);
								goalmodel.getActions().put(name, P);
							}
							else {
								allActions.add(t1.getOuterList());   
							}
							
						}
						else {
							Action a = (Action)t.getHasdecomposition().getDecomposed_to().get(k);
							if(a.getParallelLinks().size()>0) {
								String name = a.getParallelLinks().get(0).getTo().getName();
								Action P;
								if(global_parallel_actions.containsKey(name)) {
									P= global_parallel_actions.get(name);
								}
								else {
									P = factory.createAction();
									global_parallel_actions.put(name, P);
								}
								
								P.setName(name);
								P.setIsParallelAction();
								parallel_actions.put(name, P);
								goalmodel.getActions().put(name, P);
							}
							else {
								ArrayList<ArrayList<String>> temp = new ArrayList<ArrayList<String>>();
								ArrayList<String> temp1 = new ArrayList<String>();
								temp1.add(a.getName());
								temp.add(temp1);
								allActions.add(temp);
							}
							
						}
						
					}
					if(break_flag == true) {
						i++;
						continue;
					}
					
					for(String value : parallel_actions.keySet()) {
						ArrayList<String> temp = new ArrayList<String>();
						temp.add(value);
						ArrayList<ArrayList<String>> temp1 = new ArrayList<ArrayList<String>>();
						temp1.add(temp);
						allActions.add(temp1);   //put the created pseudo parallel actions in this list 
					}
					
					
					
					ArrayList<String> current = new ArrayList<String>();
					
					GeneratePermutations(allActions,t.getOuterList(),0,current);  //combine all sets of children nodes in order to find the sets that satisfy father-node
					
				}
				
				else {
					int number_of_components = t.getHasdecomposition().getDecomposed_to().size();
					ArrayList<String> combinations = new ArrayList<String>();
					
					HashMap<String,Action> parallel_actions = new HashMap<String,Action>();
					for(int k=0;k<number_of_components;k++) {
						if(t.getHasdecomposition().getDecomposed_to().get(k).get_availability_status() == false) {
							continue;
						}
						if(t.getHasdecomposition().getDecomposed_to().get(k) instanceof Task) {
							Task t1 = (Task)t.getHasdecomposition().getDecomposed_to().get(k);
							if(t1.getParallelLinks().size()>0) {
								//parallel_tasks.add(t1);
								String name = t1.getParallelLinks().get(0).getTo().getName();
								Action P;
								if(global_parallel_actions.containsKey(name)) {
									P= global_parallel_actions.get(name);
								}
								else {
									P = factory.createAction();
									global_parallel_actions.put(name, P);
								}
								
								P.setName(name);
								P.setIsParallelAction();
								P.set_OR_dec_id(t.getHasdecomposition().get_OR_dec_id());
								parallel_actions.put(name, P);
								goalmodel.getActions().put(name, P);
							}
							else {
								combinations.add(t1.getName());
							}
							
						}
						else {
							Action a = (Action)t.getHasdecomposition().getDecomposed_to().get(k);
							if(a.getParallelLinks().size()>0) {
								String name = a.getParallelLinks().get(0).getTo().getName();
								Action P;
								if(global_parallel_actions.containsKey(name)) {
									P= global_parallel_actions.get(name);
								}
								else {
									P = factory.createAction();
									global_parallel_actions.put(name, P);
								}
								
								P.setName(name);
								P.setIsParallelAction();
								P.set_OR_dec_id(t.getHasdecomposition().get_OR_dec_id());
								parallel_actions.put(name, P);
								goalmodel.getActions().put(name, P);
							}
							else {
								
								combinations.add(a.getName());
							}
							
						}
						
					}
						
						for(String value : parallel_actions.keySet()) {
							
							combinations.add(value);
							
						}
						
						ArrayList<ArrayList<String>> powerSet = new ArrayList<ArrayList<String>>();
						buildPowerSet(combinations,combinations.size(),powerSet);  //find all combinations of nodes that satisfy node t
						
						
						for (ArrayList<String> s : powerSet) {    //for each combination that satisfies t i will find the corresponding sets of actions 
							if(s.size() == 0) {
								continue;
							}
							
							ArrayList<ArrayList<ArrayList<String>>> allActions = new ArrayList<ArrayList<ArrayList<String>>>(); //use this list to put all outerlists of children
							for(String g : s) {
								if(g.contains("T")) {
									allActions.add(goalmodel.getTasks().get(g).getOuterList());
								}
								else {
									ArrayList<ArrayList<String>> temp = new ArrayList<ArrayList<String>>();
									ArrayList<String> temp1 = new ArrayList<String>();
									temp1.add( g);
									temp.add(temp1);
									allActions.add(temp);
								}
							}
							
						//	ArrayList<ArrayList<String>> result1 = new ArrayList<ArrayList<String>>();
							ArrayList<String> current = new ArrayList<String>();
							
							
							GeneratePermutations(allActions,t.getOuterList(),0,current); //find all sets of actions that satisfy node t
							
						}
						
						
						
						
						
						
						
						
						
					
				}
				
			}
			
			i++;
			
		}
		
		
	}
	
	
	
	public static void FindBestPath(List<Task> tasks,ArrayList<Task> parallel_tasks,Goal_Model goalmodel) {
		
		Task root = goalmodel.getTasks().get("root");
		System.out.println(root.getName());
		
	}
	
	
	
	
}
