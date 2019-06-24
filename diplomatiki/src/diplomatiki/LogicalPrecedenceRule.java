package diplomatiki;

import java.util.ArrayList;
import java.util.HashMap;

import aDG_metamodel.ADG;
import aDG_metamodel.ADG_metamodelFactory;
import aDG_metamodel.Link;
import goal_metamodel.Action;
import goal_metamodel.Goal_Model;
import goal_metamodel.LogicalPrecedence;
import goal_metamodel.ParallelNode;
import goal_metamodel.Task;

public class LogicalPrecedenceRule {
	
	ArrayList<LogicalPrecedence> lplinks = new ArrayList<LogicalPrecedence>();
	HashMap<String,ParallelNode> parallelnodes ;
	HashMap<String,ADG_Collection> ADG_Collections ;
	ADG_metamodelFactory adg_factory;
	
	Goal_Model goalmodel;
	
	public LogicalPrecedenceRule(ArrayList<LogicalPrecedence> lplinks,HashMap<String,ADG_Collection> ADG_Collections,ADG_metamodelFactory adg_factory,HashMap<String,ParallelNode> parallelnodes,Goal_Model goalmodel) {
		this.lplinks = lplinks;
		this.ADG_Collections = ADG_Collections;
		this.adg_factory = adg_factory;
		this.parallelnodes = parallelnodes;
		this.goalmodel = goalmodel;
	}
	
	public static <T> ArrayList<ArrayList<T>> Join2(ArrayList<ArrayList<T>> list1,  ArrayList<T> list2) {
		ArrayList<ArrayList<T>> result = new ArrayList<ArrayList<T>>(list1);
       result.add(list2);
        return result;
    }
	
	public static <T> ArrayList<T> Join3(ArrayList<T> list1,  T a) {
		   ArrayList<T> result = new ArrayList<T>(list1);
	       result.add(a);
	       
	        return result;
	    }
	
	
	static void GeneratePermutations2(ArrayList<ArrayList<ArrayList<String>>> Lists, ArrayList<ArrayList<ArrayList<String>>> result, int depth, ArrayList<ArrayList<String>> current)
	{
	    if(depth == Lists.size())
	    {
	       result.add(current);
	       return;
	     }

	    for(int i = 0; i < Lists.get(depth).size(); ++i)
	    {
	        GeneratePermutations2(Lists, result, depth + 1,  Join2(current,Lists.get(depth).get(i)) );
	    }
	}
	
	static void FindCouples(ArrayList<ArrayList<String>> Lists, ArrayList<ArrayList<String>> result, int depth, ArrayList<String> current)
	{
		
		if(current.size() == 2) {
			
			result.add(current);
			
			
			return;
		}
		
	    if(depth == Lists.size())
	    {
	    	result.add(current);
	    	
	       return;
	     }

	    for(int i = 0; i < Lists.get(depth).size(); ++i)
	    {
	    	
	        FindCouples(Lists, result, depth + 1, Join3(current,Lists.get(depth).get(i)) );
	       
	    }
	}
	
	public void ApplyRule() {
		
		for (LogicalPrecedence lp : lplinks) {
			
			if(lp.getFrom_goalnode().get_availability_status() == false || lp.getTo_goalnode().get_availability_status() == false) {
				continue;
			}
			if(lp.getFrom_goalnode() instanceof Task && lp.getTo_goalnode() instanceof Task) {  //check for all kinds of GoalNodes
				Task T1 = (Task) lp.getFrom_goalnode();
				Task T2 = (Task) lp.getTo_goalnode();
				if(T1.getParallelLinks().size() == 0 && T2.getParallelLinks().size() == 0) {  //check if none is in parallel
					ArrayList<ArrayList<String>> Outer1 = T1.getOuterList();
					ArrayList<ArrayList<String>> Outer2 = T2.getOuterList();
					String ADG_Collection_id = T1.getid();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					
					
					ArrayList<ArrayList<ArrayList<String>>> allActions = new ArrayList<ArrayList<ArrayList<String>>>();
					allActions.add(Outer1);
					allActions.add(Outer2);
					ArrayList<ArrayList<String>> current = new ArrayList<ArrayList<String>>();
					ArrayList<ArrayList<ArrayList<String>>> result = new ArrayList<ArrayList<ArrayList<String>>>();
					GeneratePermutations2(allActions,result,0,current);      //find all combinations between the sets of actions 
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					for(ArrayList<ArrayList<String>> ar : result) {
						ArrayList<String> current1 = new ArrayList<String>();
						FindCouples(ar,allcouples,0,current1);
					}
					
					for(ArrayList<String> ar1 : allcouples) {  //connect all Actions of each Task between them in the various ADGs 
						for (ADG adg : adg_collection.getADG_Collection()){     
							if(adg.getActionNodes().containsKey(ar1.get(0)) && adg.getActionNodes().containsKey(ar1.get(1)) && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
								Link lk = adg_factory.createLink();
								lk.setFrom(adg.getActionNodes().get(ar1.get(0)));
								lk.setTo(adg.getActionNodes().get(ar1.get(1)));
								adg.getLink().add(lk);
								adg.add_link_name(ar1.get(0)+ar1.get(1));
								if(adg.getJPLinks().containsKey(ar1.get(0))) {
									adg.getJPLinks().remove(ar1.get(0));
								}
								if(adg.getSPLinks().containsKey(ar1.get(1))) {
									adg.getSPLinks().remove(ar1.get(1));
								}
							}
							
						}
					}
					
				}
				
				
				else if(T1.getParallelLinks().size() > 0 && T2.getParallelLinks().size() == 0) {
					
					ArrayList<ArrayList<String>> Outer2 = T2.getOuterList();
					String ADG_Collection_id = T2.getid();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					
					ArrayList<ArrayList<ArrayList<String>>> allActions = new ArrayList<ArrayList<ArrayList<String>>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(T1.getParallelLinks().get(0).getTo().getName()).getName());
			   		ArrayList<ArrayList<String>> temp1 = new ArrayList<ArrayList<String>>();
					temp1.add(temp);
					allActions.add(temp1);
					allActions.add(Outer2);
					
					ArrayList<ArrayList<String>> current = new ArrayList<ArrayList<String>>();
					ArrayList<ArrayList<ArrayList<String>>> result = new ArrayList<ArrayList<ArrayList<String>>>();
					GeneratePermutations2(allActions,result,0,current);
				    
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					for(ArrayList<ArrayList<String>> ar : result) {
						ArrayList<String> current1 = new ArrayList<String>();
						FindCouples(ar,allcouples,0,current1);
					}
					
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2 && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0)) ) {  //check if exists a connection between the two Actions
								Link lk = adg_factory.createLink();
								lk.setFrom(adg.getActionNodes().get(ar1.get(0)));
								lk.setTo(adg.getActionNodes().get(ar1.get(1)));
								
								adg.getLink().add(lk);
								adg.add_link_name(ar1.get(0)+ar1.get(1));
								if(adg.getJPLinks().containsKey(ar1.get(0))) {   //remove link with JoinPoint
									adg.getJPLinks().remove(ar1.get(0));
								}
								if(adg.getSPLinks().containsKey(ar1.get(1))) {   //remove link ith SplitPoint
									adg.getSPLinks().remove(ar1.get(1));
								}
							}
							
						}
					}
					
				}
				
				
				
				
				
				else if(T1.getParallelLinks().size() == 0 && T2.getParallelLinks().size() > 0) {
					
					ArrayList<ArrayList<String>> Outer1 = T1.getOuterList();
					String ADG_Collection_id = T1.getid();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					
					
					ArrayList<ArrayList<ArrayList<String>>> allActions = new ArrayList<ArrayList<ArrayList<String>>>();
					allActions.add(Outer1);
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(T2.getParallelLinks().get(0).getTo().getName()).getName());
			   		ArrayList<ArrayList<String>> temp1 = new ArrayList<ArrayList<String>>();
					temp1.add(temp);
					allActions.add(temp1);
					
					ArrayList<ArrayList<String>> current = new ArrayList<ArrayList<String>>();
					ArrayList<ArrayList<ArrayList<String>>> result = new ArrayList<ArrayList<ArrayList<String>>>();
					GeneratePermutations2(allActions,result,0,current);
				    
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					for(ArrayList<ArrayList<String>> ar : result) {
						ArrayList<String> current1 = new ArrayList<String>();
						FindCouples(ar,allcouples,0,current1);
					}
					
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2 && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
								Link lk = adg_factory.createLink();
								lk.setFrom(adg.getActionNodes().get(ar1.get(0)));
								lk.setTo(adg.getActionNodes().get(ar1.get(1)));
								adg.getLink().add(lk);
								adg.add_link_name(ar1.get(0)+ar1.get(1));
								if(adg.getJPLinks().containsKey(ar1.get(0))) {
									adg.getJPLinks().remove(ar1.get(0));
								}
								if(adg.getSPLinks().containsKey(ar1.get(1))) {
									adg.getSPLinks().remove(ar1.get(1));
								}
							}
							
						}
					}
					
					
					
					
					
					
				}
				
				
				
				else {
					
					String ADG_Collection_id = T1.get_parent_id();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(T1.getParallelLinks().get(0).getTo().getName()).getName());
					temp.add(goalmodel.getActions().get(T2.getParallelLinks().get(0).getTo().getName()).getName());
					allcouples.add(temp);
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2 && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
								Link lk = adg_factory.createLink();
								lk.setFrom(adg.getActionNodes().get(ar1.get(0)));
								lk.setTo(adg.getActionNodes().get(ar1.get(1)));
								adg.getLink().add(lk);
								adg.add_link_name(ar1.get(0)+ar1.get(1));
								if(adg.getJPLinks().containsKey(ar1.get(0))) {
									adg.getJPLinks().remove(ar1.get(0));
								}
								if(adg.getSPLinks().containsKey(ar1.get(1))) {
									adg.getSPLinks().remove(ar1.get(1));
								}
							}
							
						}
					}
					
				}
				
			}
			
			
			
			
			
			if(lp.getFrom_goalnode() instanceof Task && lp.getTo_goalnode() instanceof Action) {
				Task T1 = (Task) lp.getFrom_goalnode();
				Action A2 = (Action) lp.getTo_goalnode();
				if(T1.getParallelLinks().size() == 0 && A2.getParallelLinks().size() == 0) {
					ArrayList<ArrayList<String>> Outer1 = T1.getOuterList();
					String ADG_Collection_id = T1.getid();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					
					
					ArrayList<ArrayList<ArrayList<String>>> allActions = new ArrayList<ArrayList<ArrayList<String>>>();
					allActions.add(Outer1);
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(A2.getName()).getName());
			   		ArrayList<ArrayList<String>> temp1 = new ArrayList<ArrayList<String>>();
					temp1.add(temp);
					allActions.add(temp1);
					
					ArrayList<ArrayList<String>> current = new ArrayList<ArrayList<String>>();
					ArrayList<ArrayList<ArrayList<String>>> result = new ArrayList<ArrayList<ArrayList<String>>>();
					GeneratePermutations2(allActions,result,0,current);
				    
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					for(ArrayList<ArrayList<String>> ar : result) {
						ArrayList<String> current1 = new ArrayList<String>();
						FindCouples(ar,allcouples,0,current1);
					}
					
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2 && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
								Link lk = adg_factory.createLink();
								lk.setFrom(adg.getActionNodes().get(ar1.get(0)));
								lk.setTo(adg.getActionNodes().get(ar1.get(1)));
								adg.getLink().add(lk);
								adg.add_link_name(ar1.get(0)+ar1.get(1));
								if(adg.getJPLinks().containsKey(ar1.get(0))) {
									adg.getJPLinks().remove(ar1.get(0));
								}
								if(adg.getSPLinks().containsKey(ar1.get(1))) {
									adg.getSPLinks().remove(ar1.get(1));
								}
							}
							
						}
					}
						
				}
					
				
				
				
				else if(T1.getParallelLinks().size() > 0 && A2.getParallelLinks().size() == 0) {
					
					
					String ADG_Collection_id = A2.getid();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					
					
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(T1.getParallelLinks().get(0).getTo().getName()).getName());
					temp.add(goalmodel.getActions().get(A2.getName()).getName());
					allcouples.add(temp);
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2 && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
								Link lk = adg_factory.createLink();
								lk.setFrom(adg.getActionNodes().get(ar1.get(0)));
								lk.setTo(adg.getActionNodes().get(ar1.get(1)));
								adg.getLink().add(lk);
								adg.add_link_name(ar1.get(0)+ar1.get(1));
								if(adg.getJPLinks().containsKey(ar1.get(0))) {
									adg.getJPLinks().remove(ar1.get(0));
								}
								if(adg.getSPLinks().containsKey(ar1.get(1))) {
									adg.getSPLinks().remove(ar1.get(1));
								}
							}
							
						}
					}
					
				}
				
			
				else if(T1.getParallelLinks().size() == 0 && A2.getParallelLinks().size() > 0) {
					
					ArrayList<ArrayList<String>> Outer1 = T1.getOuterList();
					String ADG_Collection_id = T1.getid();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					
					
					ArrayList<ArrayList<ArrayList<String>>> allActions = new ArrayList<ArrayList<ArrayList<String>>>();
					allActions.add(Outer1);
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(A2.getParallelLinks().get(0).getTo().getName()).getName());
			   		ArrayList<ArrayList<String>> temp1 = new ArrayList<ArrayList<String>>();
					temp1.add(temp);
					allActions.add(temp1);
					
					ArrayList<ArrayList<String>> current = new ArrayList<ArrayList<String>>();
					ArrayList<ArrayList<ArrayList<String>>> result = new ArrayList<ArrayList<ArrayList<String>>>();
					GeneratePermutations2(allActions,result,0,current);
				    
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					for(ArrayList<ArrayList<String>> ar : result) {
						ArrayList<String> current1 = new ArrayList<String>();
						FindCouples(ar,allcouples,0,current1);
					}
					
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2 && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
								Link lk = adg_factory.createLink();
								lk.setFrom(adg.getActionNodes().get(ar1.get(0)));
								lk.setTo(adg.getActionNodes().get(ar1.get(1)));
								adg.getLink().add(lk);
								adg.add_link_name(ar1.get(0)+ar1.get(1));
								if(adg.getJPLinks().containsKey(ar1.get(0))) {
									adg.getJPLinks().remove(ar1.get(0));
								}
								if(adg.getSPLinks().containsKey(ar1.get(1))) {
									adg.getSPLinks().remove(ar1.get(1));
								}
							}
							
						}
					}
					
					
				}
				
				
				
				else {
					
					String ADG_Collection_id = T1.get_parent_id();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					
					
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(T1.getParallelLinks().get(0).getTo().getName()).getName());
					temp.add(goalmodel.getActions().get(A2.getParallelLinks().get(0).getTo().getName()).getName());
					allcouples.add(temp);
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2 && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
								Link lk = adg_factory.createLink();
								lk.setFrom(adg.getActionNodes().get(ar1.get(0)));
								lk.setTo(adg.getActionNodes().get(ar1.get(1)));
								adg.getLink().add(lk);
								adg.add_link_name(ar1.get(0)+ar1.get(1));
								if(adg.getJPLinks().containsKey(ar1.get(0))) {
									adg.getJPLinks().remove(ar1.get(0));
								}
								if(adg.getSPLinks().containsKey(ar1.get(1))) {
									adg.getSPLinks().remove(ar1.get(1));
								}
							}
							
						}
					}
					
				}
				
			
			
			
			}
			
			if(lp.getFrom_goalnode() instanceof Action && lp.getTo_goalnode() instanceof Task) {
				Action A1 = (Action) lp.getFrom_goalnode();
				Task T2 = (Task) lp.getTo_goalnode();
				if(A1.getParallelLinks().size() == 0 && T2.getParallelLinks().size() == 0) {
					ArrayList<ArrayList<String>> Outer2 = T2.getOuterList();
					String ADG_Collection_id = T2.getid();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					
					
					ArrayList<ArrayList<ArrayList<String>>> allActions = new ArrayList<ArrayList<ArrayList<String>>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(A1.getName()).getName());
			   		ArrayList<ArrayList<String>> temp1 = new ArrayList<ArrayList<String>>();
					temp1.add(temp);
					allActions.add(temp1);
					allActions.add(Outer2);
					
					ArrayList<ArrayList<String>> current = new ArrayList<ArrayList<String>>();
					ArrayList<ArrayList<ArrayList<String>>> result = new ArrayList<ArrayList<ArrayList<String>>>();
					GeneratePermutations2(allActions,result,0,current);
				   
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					for(ArrayList<ArrayList<String>> ar : result) {
						ArrayList<String> current1 = new ArrayList<String>();
						FindCouples(ar,allcouples,0,current1);
					}
					
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2 && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
								Link lk = adg_factory.createLink();
								lk.setFrom(adg.getActionNodes().get(ar1.get(0)));
								lk.setTo(adg.getActionNodes().get(ar1.get(1)));
								adg.getLink().add(lk);
								adg.add_link_name(ar1.get(0)+ar1.get(1));
								if(adg.getJPLinks().containsKey(ar1.get(0))) {
									adg.getJPLinks().remove(ar1.get(0));
								}
								if(adg.getSPLinks().containsKey(ar1.get(1))) {
									adg.getSPLinks().remove(ar1.get(1));
								}
							}
							
						}
					}
					
					
						
				}
					
				
				
				
				else if(A1.getParallelLinks().size() > 0 && T2.getParallelLinks().size() == 0) {
					
					ArrayList<ArrayList<String>> Outer2 = T2.getOuterList();
					String ADG_Collection_id = T2.getid();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					
					
					
					ArrayList<ArrayList<ArrayList<String>>> allActions = new ArrayList<ArrayList<ArrayList<String>>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(A1.getParallelLinks().get(0).getTo().getName()).getName());
			   		ArrayList<ArrayList<String>> temp1 = new ArrayList<ArrayList<String>>();
					temp1.add(temp);
					allActions.add(temp1);
					allActions.add(Outer2);
					
					ArrayList<ArrayList<String>> current = new ArrayList<ArrayList<String>>();
					ArrayList<ArrayList<ArrayList<String>>> result = new ArrayList<ArrayList<ArrayList<String>>>();
					GeneratePermutations2(allActions,result,0,current);
				    
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					for(ArrayList<ArrayList<String>> ar : result) {
						ArrayList<String> current1 = new ArrayList<String>();
						FindCouples(ar,allcouples,0,current1);
					}
					
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2 && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
								Link lk = adg_factory.createLink();
								lk.setFrom(adg.getActionNodes().get(ar1.get(0)));
								lk.setTo(adg.getActionNodes().get(ar1.get(1)));
								adg.getLink().add(lk);
								adg.add_link_name(ar1.get(0)+ar1.get(1));
								if(adg.getJPLinks().containsKey(ar1.get(0))) {
									adg.getJPLinks().remove(ar1.get(0));
								}
								if(adg.getSPLinks().containsKey(ar1.get(1))) {
									adg.getSPLinks().remove(ar1.get(1));
								}
							}
							
						}
					}
					
					
				}
				
			
				else if(A1.getParallelLinks().size() == 0 && T2.getParallelLinks().size() > 0) {
					
					
					String ADG_Collection_id = A1.getid();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					
					
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(A1.getName()).getName());
					temp.add(goalmodel.getActions().get(T2.getParallelLinks().get(0).getTo().getName()).getName());
					allcouples.add(temp);
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2 && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
								Link lk = adg_factory.createLink();
								lk.setFrom(adg.getActionNodes().get(ar1.get(0)));
								lk.setTo(adg.getActionNodes().get(ar1.get(1)));
								adg.getLink().add(lk);
								adg.add_link_name(ar1.get(0)+ar1.get(1));
								if(adg.getJPLinks().containsKey(ar1.get(0))) {
									adg.getJPLinks().remove(ar1.get(0));
								}
								if(adg.getSPLinks().containsKey(ar1.get(1))) {
									adg.getSPLinks().remove(ar1.get(1));
								}
							}
							
						}
					}
					
					
				}
				
				
				
				else {
					
					String ADG_Collection_id = T2.get_parent_id();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					
					
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(A1.getParallelLinks().get(0).getTo().getName()).getName());
					temp.add(goalmodel.getActions().get(T2.getParallelLinks().get(0).getTo().getName()).getName());
					allcouples.add(temp);
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2 && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
								Link lk = adg_factory.createLink();
								lk.setFrom(adg.getActionNodes().get(ar1.get(0)));
								lk.setTo(adg.getActionNodes().get(ar1.get(1)));
								adg.getLink().add(lk);
								adg.add_link_name(ar1.get(0)+ar1.get(1));
								if(adg.getJPLinks().containsKey(ar1.get(0))) {
									adg.getJPLinks().remove(ar1.get(0));
								}
								if(adg.getSPLinks().containsKey(ar1.get(1))) {
									adg.getSPLinks().remove(ar1.get(1));
								}
							}
							
						}
					}
					
					
				}
				
			
			
			
			}
			
			
			
			if(lp.getFrom_goalnode() instanceof Action && lp.getTo_goalnode() instanceof Action) {
				Action A1 = (Action) lp.getFrom_goalnode();
				Action A2 = (Action) lp.getTo_goalnode();
				if(A1.getParallelLinks().size() == 0 && A2.getParallelLinks().size() == 0) {
					
					String ADG_Collection_id = A2.getid();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					
					
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(A1.getName()).getName());
					temp.add(goalmodel.getActions().get(A2.getName()).getName());
					allcouples.add(temp);
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							//System.out.println(ar1);
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2 && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
								Link lk = adg_factory.createLink();
								lk.setFrom(adg.getActionNodes().get(ar1.get(0)));
								lk.setTo(adg.getActionNodes().get(ar1.get(1)));
								adg.getLink().add(lk);
								adg.add_link_name(ar1.get(0)+ar1.get(1));
								if(adg.getJPLinks().containsKey(ar1.get(0))) {
									adg.getJPLinks().remove(ar1.get(0));
								}
								if(adg.getSPLinks().containsKey(ar1.get(1))) {
									adg.getSPLinks().remove(ar1.get(1));
								}
							}
							
						}
					}
					
					
						
				}
					
				
				
				
				else if(A1.getParallelLinks().size() > 0 && A2.getParallelLinks().size() == 0) {
					
					
					String ADG_Collection_id = A2.getid();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					
					
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(A1.getParallelLinks().get(0).getTo().getName()).getName());
					temp.add(goalmodel.getActions().get(A2.getName()).getName());
					allcouples.add(temp);
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							//System.out.println(ar1);
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2 && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
								Link lk = adg_factory.createLink();
								lk.setFrom(adg.getActionNodes().get(ar1.get(0)));
								lk.setTo(adg.getActionNodes().get(ar1.get(1)));
								adg.getLink().add(lk);
								adg.add_link_name(ar1.get(0)+ar1.get(1));
								if(adg.getJPLinks().containsKey(ar1.get(0))) {
									adg.getJPLinks().remove(ar1.get(0));
								}
								if(adg.getSPLinks().containsKey(ar1.get(1))) {
									adg.getSPLinks().remove(ar1.get(1));
								}
							}
							
						}
					}
					
					
					
				}
				
			
				else if(A1.getParallelLinks().size() == 0 && A2.getParallelLinks().size() > 0) {
					
					
					String ADG_Collection_id = A1.getid();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					
					
					
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(A1.getName()).getName());
					temp.add(goalmodel.getActions().get(A2.getParallelLinks().get(0).getTo().getName()).getName());
					allcouples.add(temp);
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2 && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
								Link lk = adg_factory.createLink();
								lk.setFrom(adg.getActionNodes().get(ar1.get(0)));
								lk.setTo(adg.getActionNodes().get(ar1.get(1)));
								adg.getLink().add(lk);
								adg.add_link_name(ar1.get(0)+ar1.get(1));
								if(adg.getJPLinks().containsKey(ar1.get(0))) {
									adg.getJPLinks().remove(ar1.get(0));
								}
								if(adg.getSPLinks().containsKey(ar1.get(1))) {
									adg.getSPLinks().remove(ar1.get(1));
								}
							}
							
						}
					}
					
					
				}
				
				
				
				else {
					
					String ADG_Collection_id = A1.get_parent_id();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					
					
					
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(A1.getParallelLinks().get(0).getTo().getName()).getName());
					temp.add(goalmodel.getActions().get(A2.getParallelLinks().get(0).getTo().getName()).getName());
					allcouples.add(temp);
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2 && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
								Link lk = adg_factory.createLink();
								lk.setFrom(adg.getActionNodes().get(ar1.get(0)));
								lk.setTo(adg.getActionNodes().get(ar1.get(1)));
								adg.getLink().add(lk);
								adg.add_link_name(ar1.get(0)+ar1.get(1));
								if(adg.getJPLinks().containsKey(ar1.get(0))) {
									adg.getJPLinks().remove(ar1.get(0));
								}
								if(adg.getSPLinks().containsKey(ar1.get(1))) {
									adg.getSPLinks().remove(ar1.get(1));
								}
							}
							
						}
					}
					
				}
				
			
			
			
			}
			
			
			
		}

	}
}
