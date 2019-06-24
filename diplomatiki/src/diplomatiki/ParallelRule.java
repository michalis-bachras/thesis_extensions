package diplomatiki;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//import org.eclipse.emf.common.util.EList;

import aDG_metamodel.ADG;
import aDG_metamodel.ADG_metamodelFactory;
import aDG_metamodel.ActionNode;
import aDG_metamodel.JoinNode;
import aDG_metamodel.Link;
//import aDG_metamodel.Node;
import aDG_metamodel.SplitNode;
//import goal_metamodel.Action;
import goal_metamodel.GoalNode;
import goal_metamodel.Goal_Model;
import goal_metamodel.ParallelNode;
import goal_metamodel.Task;

public class ParallelRule {
	
	HashMap<String,ParallelNode> parallelnodes ;
	HashMap<String,ADG_Collection> ADG_Collections ;
	ADG_metamodelFactory adg_factory;
	
	public ParallelRule(HashMap<String,ParallelNode> parallelnodes,HashMap<String,ADG_Collection> ADG_Collections,ADG_metamodelFactory adg_factory) {
		this.parallelnodes = parallelnodes;
		this.ADG_Collections = ADG_Collections;
		this.adg_factory = adg_factory;
	}
	
	public HashMap<String,ADG_Collection> ApplyRule(Goal_Model goalmodel) throws CloneNotSupportedException{
		
		for(Map.Entry<String, ParallelNode> p : parallelnodes.entrySet()) {
			
			String parent_id;
			
			if(p.getValue().getnodes().size()>0) {
				
				parent_id = p.getValue().getnodes().get(0).get_parent_id();
			}
			else {
				Iterator<GoalNode> iter = p.getValue().getORGoalNodes().iterator();
				
				parent_id = iter.next().get_parent_id();
			}
			
			if(p.getValue().getNumberOfNodes() == 0) {
				continue;
			}
			//System.out.println(p.getValue().getName());
			if(ADG_Collections.containsKey(parent_id)) {							//see if the ADG Collection in which the pseudonode Pi will be put,exists
				
				if(parent_id.equals("0") ) {
					
					ActionNode a = adg_factory.createActionNode();
					a.setName(p.getKey());		//create parallel pseudonode Pi
					
					ADG_Collection temp =  ADG_Collections.get(parent_id);
					for(ADG adg_iterator : temp.getADG_Collection()) {
						if(adg_iterator.get_node_names().contains(a.getName())) {
							adg_iterator.addActionNode(a);
							SplitNode sp = adg_iterator.getSP();															// create links in the appropriate ADG with SP,JP and pseudonode Pi
							JoinNode jp = adg_iterator.getJP();																//
							Link lk1 = adg_factory.createLink();
							Link lk2 = adg_factory.createLink();
							lk1.setFrom(sp);
							lk1.setTo(a);
							lk2.setFrom(a);
							lk2.setTo(jp);
							adg_iterator.addSPLinks(lk1);
							adg_iterator.addJPLinks(lk2);
							adg_iterator.add_parallel_nodes(a.getName());
						}
						
					}
					
				}
				
				else {
					
					ActionNode a = adg_factory.createActionNode();
					a.setName(p.getKey());
					
					ADG_Collection temp =  ADG_Collections.get(parent_id);     //in case of ADG Collection different from the initial the links between SP,JP and Pi has already been put
					for(ADG adg_iterator : temp.getADG_Collection()) {
					
						adg_iterator.addActionNode(a);
						
						
					}
				}
				
			}
			
			else {
				ADG_Collection ADG_Collection1 = new ADG_Collection();
				String id = parent_id;
				ADG_Collection1.setid(id); 											 //create ADG Collection for parallel Pi
				ADG_Collection1.set_parallel_timeout(p.getValue().getTimeout());
				
				ADG_Collections.put(id, ADG_Collection1);
			}
			
			
			
			for(GoalNode g : p.getValue().getnodes()) {    //p.getValue().getnodes() returns all goal nodes taht are AND decomposed and connected to Pi
				if(g.get_availability_status() == false) {
					continue;
				}
				if(g instanceof Task) {
					Task g1 = (Task) g;
					p.getValue().get_allActions_AND_children().add(g1.getOuterList());
					
				}
				else {
					String temp_a =  g.getName();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(temp_a);
					ArrayList<ArrayList<String>> temp1 = new ArrayList<ArrayList<String>>();
					temp1.add(temp);
					p.getValue().get_allActions_AND_children().add(temp1);
				}
			}
			ADG_Collection ADG_Collection;
			if(ADG_Collections.containsKey(p.getKey())) {
				ADG_Collection = ADG_Collections.get(p.getKey());
			}
			else {
				ADG_Collection = new ADG_Collection();
				ADG_Collection.setid(p.getKey());
				ADG_Collection.set_parallel_timeout(p.getValue().getTimeout());
			}
			ArrayList<ArrayList<ArrayList<String>>> allActions = null ;
			
			ArrayList<ArrayList<GoalNode>> powerSet = new ArrayList<ArrayList<GoalNode>>();
			buildPowerSet(p.getValue().getORGoalNodes(),p.getValue().getORGoalNodes().size(),powerSet);  //find all possible selections of OR decomposed nodes connected to parallel node Pi
			
			for (ArrayList<GoalNode> s : powerSet) {  //combine the sets that satisfy AND decomposed nodes and each selection of OR decomposed nodes
				
			     allActions = new ArrayList<ArrayList<ArrayList<String>>>(p.getValue().get_allActions_AND_children());
			     if((p.getValue().getNumberOfNodes()>1 && s.size() < 2 && p.getValue().getnodes().size() == 0) || (s.size() == 0 && p.getValue().getnodes().size() == 1) ) {    //???????????????
			    	 continue;
			     }
			     if(s.size() ==0 && p.getValue().getORGoalNodes().size()>0) {
			    	 continue;
			     }
			     for(GoalNode g : s) {
			    	 if(g.get_availability_status() == false) {
							continue;
						}
						if(g instanceof Task) {
							Task g1 = (Task) g;
							allActions.add(g1.getOuterList());
							
						}
						else {
							String temp_a =  g.getName();
							ArrayList<String> temp = new ArrayList<String>();
							temp.add(temp_a);
							ArrayList<ArrayList<String>> temp1 = new ArrayList<ArrayList<String>>();
							temp1.add(temp);
							allActions.add(temp1);
						}
					}
			
			
			     ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
			     ArrayList<String> current = new ArrayList<String>();
			     GeneratePermutations(allActions,result,0,current);                              //find all possible sets that satisfy all nodes
			
				//System.out.println("Success");
				
				for (ArrayList<String> ar : result) {    //for each set create an ADG in ADG Collection with id Pi
					if(ar.size() == 0) {
						continue;
					}
					
					ADG adg = adg_factory.createADG();
					JoinNode jp = adg_factory.createJoinNode();
					jp.setName("J" + p.getKey());
					SplitNode sp = adg_factory.createSplitNode();
					sp.setName("S" + p.getKey());
					
					adg.setSP(sp);
					adg.setJP(jp);
					
					HashSet<String> positive_nodes_to_check = new HashSet<String>();
					HashSet<String> negative_nodes_to_check = new HashSet<String>();
					for(String a : ar) {
						if(adg.get_solution().contains("'" + a + "'")) {
							continue;
						}
						adg.add_to_solution(a);
						if(goalmodel.getActions().get(a).getIsParallelAction() == true) {
							ActionNode a1 = adg_factory.createActionNode();
							
							
							
							a1.setName(a);
							adg.addActionNode(a1);
							
							Link lk3 = adg_factory.createLink();
							Link lk4 = adg_factory.createLink();
							
							lk3.setFrom(sp);
							lk3.setTo(a1);
							lk4.setFrom(a1);
							lk4.setTo(jp);
							
							adg.addSPLinks(lk3);
							adg.addJPLinks(lk4);
							
							adg.add_parallel_nodes(a);
						}
						else {
							ActionNode a1 = adg_factory.createActionNode();
							
							a1.setName(a);
							
							adg.addActionNode(a1);
							Link lk1 = adg_factory.createLink();
							Link lk2 = adg_factory.createLink();
							lk1.setFrom(sp);
							lk1.setTo(a1);
							lk2.setFrom(a1);
							lk2.setTo(jp);
								
							adg.addSPLinks(lk1);
							adg.addJPLinks(lk2);
							if(!goalmodel.getActions().get(a).get_OR_dec_id().equals("0")) {
								adg.add_unnecessary_nodes_in_orids(goalmodel.getActions().get(a).get_OR_dec_id());	//put in the list unnecessary_nodes_in_orids the id in which actions a belongs to	
							}
							
							
							
						}
						
						if( goalmodel.getActions().get(a).getNegationStatus() == true) {
							positive_nodes_to_check.addAll(goalmodel.getActions().get(a).get_exist_node_list());
							negative_nodes_to_check.addAll(goalmodel.getActions().get(a).get_non_exist_node_list());
							
						}
						
					
					}
					//for each ADG check if it is complied with contribution links constraints
					if(positive_nodes_to_check.size()>0) {
						
						List<String> positive_nodes_to_check_list = new ArrayList<String>( positive_nodes_to_check);
						for(String s1 : positive_nodes_to_check_list) {
							String parts[] = s1.split("'");
							int i = 0;
							
							String s2[] = parts[1].split(",");
							
							int length = s2.length;
							for(String s3 : s2) {
								
								
								if(!adg.get_solution().contains(s3)) {
									break;
								}
								i++;
							}
							if( i == length) {
								adg.setNegation();
								
								break;
							}
						}
					}
					
					if(negative_nodes_to_check.size()>0) {
						
						List<String> negative_nodes_to_check_list = new ArrayList<String>( negative_nodes_to_check);
						adg.setNegation();
						for(String s1  : negative_nodes_to_check_list) {
							String parts[] = s1.split("'");
							int i = 0;
							
							
							String s2[] = parts[1].split(",");
							int length = s2.length;
							for(String s3 : s2) {
								
								
								if(!adg.get_solution().contains(s3)) {
									break;
								}
								i++;
							}
							if( i == length) {
								adg.restore_negation();
							}
						}
					}
					
					
					if(!ADG_Collection.get_solution_names().contains(adg.get_solution()) && adg.getNegationStatus() == false) {
						ADG_Collection.add_ADG(adg);
						ADG_Collection.add_solution_names(adg.get_solution());
						
					}
					
					
				}
	
			
		}//this ends  POWERSET for loop
			ADG_Collections.put(p.getKey(), ADG_Collection); 
		}
		
		
		return ADG_Collections;
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
	        GeneratePermutations(Lists, result, depth + 1, temp );
	    }
	}
	
	public static <T> ArrayList<T> Join(ArrayList<T> list1,  ArrayList<T> list2) {
        ArrayList<T> result = new ArrayList<T>(list1);
        result.addAll(list2);
        return result;
    }
	
	public static <T> Set<Set<T>> powerSet(Set<T> originalSet) {
	    Set<Set<T>> sets = new HashSet<Set<T>>();
	    if (originalSet.isEmpty()) {
	        sets.add(new HashSet<T>());
	        return sets;
	    }
	    List<T> list = new ArrayList<T>(originalSet);
	    T head = list.get(0);
	    Set<T> rest = new HashSet<T>(list.subList(1, list.size())); 
	    for (Set<T> set : powerSet(rest)) {
	        Set<T> newSet = new HashSet<T>();
	        newSet.add(head);
	        newSet.addAll(set);
	        sets.add(newSet);
	        sets.add(set);
	    }       
	    return sets;
	}
	
	private static void buildPowerSet(ArrayList<GoalNode> list, int count,ArrayList<ArrayList<GoalNode>> powerSet)
	{
	    powerSet.add(list);

	    for(int i=0; i<list.size(); i++)
	    {
	    	ArrayList<GoalNode> temp = new ArrayList<GoalNode>(list);
	        temp.remove(i);
	        buildPowerSet(temp, temp.size(),powerSet);
	    }
	}
	

}
