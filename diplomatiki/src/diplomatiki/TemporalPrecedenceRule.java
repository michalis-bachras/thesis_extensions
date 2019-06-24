package diplomatiki;

import java.util.ArrayList;
import java.util.HashMap;

import aDG_metamodel.ADG;
import aDG_metamodel.ADG_metamodelFactory;
import aDG_metamodel.Link;
import goal_metamodel.Action;
import goal_metamodel.Goal_Model;
import goal_metamodel.ParallelNode;
import goal_metamodel.Task;
import goal_metamodel.TemporalPrecedence;

public class TemporalPrecedenceRule {
	
	ArrayList<TemporalPrecedence> tplinks = new ArrayList<TemporalPrecedence>();
	HashMap<String,ParallelNode> parallelnodes ;
	HashMap<String,ADG_Collection> ADG_Collections ;
	ADG_metamodelFactory adg_factory;
	//Populator goalmodel;
	Goal_Model goalmodel;
	
	public TemporalPrecedenceRule(ArrayList<TemporalPrecedence> tplinks,HashMap<String,ADG_Collection> ADG_Collections,ADG_metamodelFactory adg_factory,HashMap<String,ParallelNode> parallelnodes,Goal_Model goalmodel) {
		this.tplinks = tplinks;
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
	    	//System.out.println("aaaaa");
	       return;
	     }

	    for(int i = 0; i < Lists.get(depth).size(); ++i)
	    {
	    	
	        FindCouples(Lists, result, depth + 1, Join3(current,Lists.get(depth).get(i)) );
	       // System.out.println(current);
	    }
	}
	
	public void ApplyRule() {
		
		for (TemporalPrecedence tp : tplinks) {
			//System.out.println(tp.getFrom());
			if(tp.getFrom().get_availability_status() == false || tp.getTo().get_availability_status() == false) {
				continue;
			}
			if(tp.getFrom() instanceof Task && tp.getTo() instanceof Task) {
				Task T1 = (Task) tp.getFrom();
				Task T2 = (Task) tp.getTo();
				if(T1.getParallelLinks().size() == 0 && T2.getParallelLinks().size() == 0) {
					ArrayList<ArrayList<String>> Outer1 = T1.getOuterList();
					ArrayList<ArrayList<String>> Outer2 = T2.getOuterList();
					String ADG_Collection_id = T1.getid();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					/*
					for (ArrayList<String> ar : Outer1) {
						for (Action a1 : ar) {
							for (ADG adg : adg_collection.getADG_Collection()) {
									if(adg.getJPLinks().containsKey(a1.getName())) {
										adg.getJPLinks().remove(a1.getName());
									}
							}
					
						}
					}
					
					for (ArrayList<String> ar2 : Outer2) {
						for (Action a2 : ar2) {
								for (ADG adg : adg_collection.getADG_Collection()) {
									if(adg.getSPLinks().containsKey(a2.getName())) {
										adg.getSPLinks().remove(a2.getName());
									}
								}
	
						}
					}
					*/
					
					ArrayList<ArrayList<ArrayList<String>>> allActions = new ArrayList<ArrayList<ArrayList<String>>>();
					allActions.add(Outer1);
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
					/*
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getJPLinks().containsKey(T1.getParallelLinks().get(0).getTo().getName())) {
							adg.getJPLinks().remove(T1.getParallelLinks().get(0).getTo().getName());
						}
					}
					
					for (ArrayList<String> ar2 : Outer2) {
						for (Action a2 : ar2) {
								for (ADG adg : adg_collection.getADG_Collection()) {
									if(adg.getSPLinks().containsKey(a2.getName())) {
										adg.getSPLinks().remove(a2.getName());
									}
								}
						}
					}
					*/
					
					ArrayList<ArrayList<ArrayList<String>>> allActions = new ArrayList<ArrayList<ArrayList<String>>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(T1.getParallelLinks().get(0).getTo().getName()).getName());
			   		ArrayList<ArrayList<String>> temp1 = new ArrayList<ArrayList<String>>();
					temp1.add(temp);
					allActions.add(temp1);
					allActions.add(Outer2);
					//System.out.println(allActions);
					ArrayList<ArrayList<String>> current = new ArrayList<ArrayList<String>>();
					ArrayList<ArrayList<ArrayList<String>>> result = new ArrayList<ArrayList<ArrayList<String>>>();
					GeneratePermutations2(allActions,result,0,current);
				    //System.out.println(result);
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					for(ArrayList<ArrayList<String>> ar : result) {
						ArrayList<String> current1 = new ArrayList<String>();
						FindCouples(ar,allcouples,0,current1);
					}
					//System.out.println(allcouples);
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
				
				
				
				
				
				else if(T1.getParallelLinks().size() == 0 && T2.getParallelLinks().size() > 0) {
					
					ArrayList<ArrayList<String>> Outer1 = T1.getOuterList();
					String ADG_Collection_id = T1.getid();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					/*
					for (ArrayList<String> ar : Outer1) {
						for (Action a1 : ar) {
							
							for (ADG adg : adg_collection.getADG_Collection()) {
									
								if(adg.getJPLinks().containsKey(a1.getName())) {
										adg.getJPLinks().remove(a1.getName());
								}
							}
						
						}
					}
					
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getSPLinks().containsKey(T2.getParallelLinks().get(0).getTo().getName())) {
							adg.getSPLinks().remove(T2.getParallelLinks().get(0).getTo().getName());
						}
					}
					*/
					
					
					ArrayList<ArrayList<ArrayList<String>>> allActions = new ArrayList<ArrayList<ArrayList<String>>>();
					allActions.add(Outer1);
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(T2.getParallelLinks().get(0).getTo().getName()).getName());
			   		ArrayList<ArrayList<String>> temp1 = new ArrayList<ArrayList<String>>();
					temp1.add(temp);
					allActions.add(temp1);
					//System.out.println(allActions);
					ArrayList<ArrayList<String>> current = new ArrayList<ArrayList<String>>();
					ArrayList<ArrayList<ArrayList<String>>> result = new ArrayList<ArrayList<ArrayList<String>>>();
					GeneratePermutations2(allActions,result,0,current);
				    //System.out.println(result);
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					for(ArrayList<ArrayList<String>> ar : result) {
						ArrayList<String> current1 = new ArrayList<String>();
						FindCouples(ar,allcouples,0,current1);
					}
					//System.out.println(allcouples);
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
				
				
				
				else {
					
					String ADG_Collection_id = T1.get_parent_id();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					/*
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getJPLinks().containsKey(T1.getParallelLinks().get(0).getTo().getName())) {
							adg.getJPLinks().remove(T1.getParallelLinks().get(0).getTo().getName());
						}
						if(adg.getSPLinks().containsKey(T2.getParallelLinks().get(0).getTo().getName())) {
							adg.getSPLinks().remove(T2.getParallelLinks().get(0).getTo().getName());
						}
						
					}
					*/
					
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(T1.getParallelLinks().get(0).getTo().getName()).getName());
					temp.add(goalmodel.getActions().get(T2.getParallelLinks().get(0).getTo().getName()).getName());
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
				
			}
			
			
			
			
			
			if(tp.getFrom() instanceof Task && tp.getTo() instanceof Action) {
				Task T1 = (Task) tp.getFrom();
				Action A2 = (Action) tp.getTo();
				if(T1.getParallelLinks().size() == 0 && A2.getParallelLinks().size() == 0) {
					ArrayList<ArrayList<String>> Outer1 = T1.getOuterList();
					String ADG_Collection_id = T1.getid();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					/*
					for (ArrayList<String> ar : Outer1) {
						for (Action a1 : ar) {
							for (ADG adg : adg_collection.getADG_Collection()) {
									if(adg.getJPLinks().containsKey(a1.getName())) {
										adg.getJPLinks().remove(a1.getName());
									}
							}
					
						}
					}
					
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getJPLinks().containsKey(A2.getName())) {
							adg.getJPLinks().remove(A2.getName());
						}
					
					
					}
					*/
					
					ArrayList<ArrayList<ArrayList<String>>> allActions = new ArrayList<ArrayList<ArrayList<String>>>();
					allActions.add(Outer1);
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(A2.getName()).getName());
			   		ArrayList<ArrayList<String>> temp1 = new ArrayList<ArrayList<String>>();
					temp1.add(temp);
					allActions.add(temp1);
					//System.out.println(allActions);
					ArrayList<ArrayList<String>> current = new ArrayList<ArrayList<String>>();
					ArrayList<ArrayList<ArrayList<String>>> result = new ArrayList<ArrayList<ArrayList<String>>>();
					GeneratePermutations2(allActions,result,0,current);
				    //System.out.println(result);
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					for(ArrayList<ArrayList<String>> ar : result) {
						ArrayList<String> current1 = new ArrayList<String>();
						FindCouples(ar,allcouples,0,current1);
					}
					//System.out.println(allcouples);
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							//System.out.println(ar1);
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2  && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
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
					
					/*
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getJPLinks().containsKey(T1.getParallelLinks().get(0).getTo().getName())) {
							adg.getJPLinks().remove(T1.getParallelLinks().get(0).getTo().getName());
						}
					}
					
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getSPLinks().containsKey(A2.getName())) {
							adg.getSPLinks().remove(A2.getName());
						}
					}
					*/
					
					
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(T1.getParallelLinks().get(0).getTo().getName()).getName());
					temp.add(goalmodel.getActions().get(A2.getName()).getName());
					allcouples.add(temp);
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							//System.out.println(ar1);
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2  && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
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
					
					/*
					for (ArrayList<String> ar : Outer1) {
						for (Action a1 : ar) {
							
							for (ADG adg : adg_collection.getADG_Collection()) {
									
								if(adg.getJPLinks().containsKey(a1.getName())) {
										adg.getJPLinks().remove(a1.getName());
								}
							}
						
						}
					}
					
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getSPLinks().containsKey(A2.getParallelLinks().get(0).getTo().getName())) {
							adg.getSPLinks().remove(A2.getParallelLinks().get(0).getTo().getName());
						}
					}
					*/
					
					
					ArrayList<ArrayList<ArrayList<String>>> allActions = new ArrayList<ArrayList<ArrayList<String>>>();
					allActions.add(Outer1);
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(A2.getParallelLinks().get(0).getTo().getName()).getName());
			   		ArrayList<ArrayList<String>> temp1 = new ArrayList<ArrayList<String>>();
					temp1.add(temp);
					allActions.add(temp1);
					//System.out.println(allActions);
					ArrayList<ArrayList<String>> current = new ArrayList<ArrayList<String>>();
					ArrayList<ArrayList<ArrayList<String>>> result = new ArrayList<ArrayList<ArrayList<String>>>();
					GeneratePermutations2(allActions,result,0,current);
				    //System.out.println(result);
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					for(ArrayList<ArrayList<String>> ar : result) {
						ArrayList<String> current1 = new ArrayList<String>();
						FindCouples(ar,allcouples,0,current1);
					}
					//System.out.println(allcouples);
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
				
				
				
				else {
					
					String ADG_Collection_id = T1.get_parent_id();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					
					/*
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getJPLinks().containsKey(T1.getParallelLinks().get(0).getTo().getName())) {
							adg.getJPLinks().remove(T1.getParallelLinks().get(0).getTo().getName());
						}
						if(adg.getSPLinks().containsKey(A2.getParallelLinks().get(0).getTo().getName())) {
							adg.getSPLinks().remove(A2.getParallelLinks().get(0).getTo().getName());
						}
						
					}
					*/
					
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(T1.getParallelLinks().get(0).getTo().getName()).getName());
					temp.add(goalmodel.getActions().get(A2.getParallelLinks().get(0).getTo().getName()).getName());
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
				
			
			
			
			}
			
			if(tp.getFrom() instanceof Action && tp.getTo() instanceof Task) {
				Action A1 = (Action) tp.getFrom();
				Task T2 = (Task) tp.getTo();
				if(A1.getParallelLinks().size() == 0 && T2.getParallelLinks().size() == 0) {
					ArrayList<ArrayList<String>> Outer2 = T2.getOuterList();
					String ADG_Collection_id = T2.getid();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					
					/*
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getJPLinks().containsKey(A1.getName())) {
							adg.getJPLinks().remove(A1.getName());
						}
					}
					
					for (ArrayList<String> ar : Outer2) {
						for (Action a1 : ar) {
							for (ADG adg : adg_collection.getADG_Collection()) {
									if(adg.getSPLinks().containsKey(a1.getName())) {
										adg.getSPLinks().remove(a1.getName());
									}
							}
					
						}
					}
					*/
					
					
					ArrayList<ArrayList<ArrayList<String>>> allActions = new ArrayList<ArrayList<ArrayList<String>>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(A1.getName()).getName());
			   		ArrayList<ArrayList<String>> temp1 = new ArrayList<ArrayList<String>>();
					temp1.add(temp);
					allActions.add(temp1);
					allActions.add(Outer2);
					//System.out.println(allActions);
					ArrayList<ArrayList<String>> current = new ArrayList<ArrayList<String>>();
					ArrayList<ArrayList<ArrayList<String>>> result = new ArrayList<ArrayList<ArrayList<String>>>();
					GeneratePermutations2(allActions,result,0,current);
				    //System.out.println(result);
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					for(ArrayList<ArrayList<String>> ar : result) {
						ArrayList<String> current1 = new ArrayList<String>();
						FindCouples(ar,allcouples,0,current1);
					}
					//System.out.println(allcouples);
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							//System.out.println(ar1);
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2  && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
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
					/*
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getJPLinks().containsKey(A1.getParallelLinks().get(0).getTo().getName())) {
							adg.getJPLinks().remove(A1.getParallelLinks().get(0).getTo().getName());
						}
					}
					
					for (ArrayList<String> ar : Outer2) {
						for (Action a1 : ar) {
							for (ADG adg : adg_collection.getADG_Collection()) {
									if(adg.getSPLinks().containsKey(a1.getName())) {
										adg.getSPLinks().remove(a1.getName());
									}
							}
					
						}
					}
					*/
					
					
					ArrayList<ArrayList<ArrayList<String>>> allActions = new ArrayList<ArrayList<ArrayList<String>>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(A1.getParallelLinks().get(0).getTo().getName()).getName());
			   		ArrayList<ArrayList<String>> temp1 = new ArrayList<ArrayList<String>>();
					temp1.add(temp);
					allActions.add(temp1);
					allActions.add(Outer2);
					//System.out.println(allActions);
					ArrayList<ArrayList<String>> current = new ArrayList<ArrayList<String>>();
					ArrayList<ArrayList<ArrayList<String>>> result = new ArrayList<ArrayList<ArrayList<String>>>();
					GeneratePermutations2(allActions,result,0,current);
				    //System.out.println(result);
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					for(ArrayList<ArrayList<String>> ar : result) {
						ArrayList<String> current1 = new ArrayList<String>();
						FindCouples(ar,allcouples,0,current1);
					}
					//System.out.println(allcouples);
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							//System.out.println(ar1);
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2  && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
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
					
					/*
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getJPLinks().containsKey(A1.getName())) {
							adg.getJPLinks().remove(A1.getName());
						}
					}
					
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getSPLinks().containsKey(T2.getParallelLinks().get(0).getTo().getName())) {
							adg.getSPLinks().remove(T2.getParallelLinks().get(0).getTo().getName());
						}
					}
					*/
					
					
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(A1.getName()).getName());
					temp.add(goalmodel.getActions().get(T2.getParallelLinks().get(0).getTo().getName()).getName());
					allcouples.add(temp);
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							//System.out.println(ar1);
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2  && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
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
					/*
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getJPLinks().containsKey(A1.getParallelLinks().get(0).getTo().getName())) {
							adg.getJPLinks().remove(A1.getParallelLinks().get(0).getTo().getName());
						}
						if(adg.getSPLinks().containsKey(T2.getParallelLinks().get(0).getTo().getName())) {
							adg.getSPLinks().remove(T2.getParallelLinks().get(0).getTo().getName());
						}
						
					}
					*/
					
					
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(A1.getParallelLinks().get(0).getTo().getName()).getName());
					temp.add(goalmodel.getActions().get(T2.getParallelLinks().get(0).getTo().getName()).getName());
					allcouples.add(temp);
					for(ArrayList<String> ar1 : allcouples) {
						for (ADG adg : adg_collection.getADG_Collection()){
							//System.out.println(ar1);
							boolean b1 = adg.getActionNodes().containsKey(ar1.get(0));
							boolean b2 = adg.getActionNodes().containsKey(ar1.get(1));
							if( b1 && b2  && !ar1.get(0).equals(ar1.get(1)) && !adg.get_link_names().contains(ar1.get(0)+ar1.get(1)) && !adg.get_link_names().contains(ar1.get(1)+ar1.get(0))) {
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
			
			
			
			if(tp.getFrom() instanceof Action && tp.getTo() instanceof Action) {
				Action A1 = (Action) tp.getFrom();
				Action A2 = (Action) tp.getTo();
				if(A1.getParallelLinks().size() == 0 && A2.getParallelLinks().size() == 0) {
					
					String ADG_Collection_id = A2.getid();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					/*
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getJPLinks().containsKey(A1.getName())) {
							adg.getJPLinks().remove(A1.getName());
						}
					}
					
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getSPLinks().containsKey(A2.getName())) {
							adg.getSPLinks().remove(A2.getName());
						}
					}
					*/
					
					
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
					/*
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getJPLinks().containsKey(A1.getParallelLinks().get(0).getTo().getName())) {
							adg.getJPLinks().remove(A1.getParallelLinks().get(0).getTo().getName());
						}
					}
					
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getSPLinks().containsKey(A2.getName())) {
							adg.getSPLinks().remove(A2.getName());
						}
					}
					*/
					
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
					
					/*
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getJPLinks().containsKey(A1.getName())) {
							adg.getJPLinks().remove(A1.getName());
						}
					}
					
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getSPLinks().containsKey(A2.getParallelLinks().get(0).getTo().getName())) {
							adg.getSPLinks().remove(A2.getParallelLinks().get(0).getTo().getName());
						}
					}
					*/
					
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(A1.getName()).getName());
					temp.add(goalmodel.getActions().get(A2.getParallelLinks().get(0).getTo().getName()).getName());
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
				
				
				
				else {
					
					String ADG_Collection_id = A1.get_parent_id();
					ADG_Collection adg_collection = ADG_Collections.get(ADG_Collection_id);
					/*
					for (ADG adg : adg_collection.getADG_Collection()) {
						if(adg.getJPLinks().containsKey(A1.getParallelLinks().get(0).getTo().getName())) {
							adg.getJPLinks().remove(A1.getParallelLinks().get(0).getTo().getName());
						}
						if(adg.getSPLinks().containsKey(A2.getParallelLinks().get(0).getTo().getName())) {
							adg.getSPLinks().remove(A2.getParallelLinks().get(0).getTo().getName());
						}
						
					}
					*/
					
					ArrayList<ArrayList<String>> allcouples = new ArrayList<ArrayList<String>>();
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(goalmodel.getActions().get(A1.getParallelLinks().get(0).getTo().getName()).getName());
					temp.add(goalmodel.getActions().get(A2.getParallelLinks().get(0).getTo().getName()).getName());
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
				
			
			
			
			}
			
			
			
		}

	}
	

}
