package diplomatiki;

import java.util.ArrayList;
//import java.util.HashSet;

//import goal_metamodel.Action;
import goal_metamodel.Contribution;
import goal_metamodel.ContributionType;
import goal_metamodel.Goal_Model;
import goal_metamodel.Task;

public class ContributionRule {
	
	ArrayList<Contribution> contributionlinks = new ArrayList<Contribution>();
	
	
	public ContributionRule(ArrayList<Contribution> contributionlinks) {
		this.contributionlinks = contributionlinks;
	}
	
	public void ApplyRule(Goal_Model goalmodel) {
		
		
		
		for(Contribution C : contributionlinks) {
			Task T = (Task) C.getTo_goalnode();
			Task T1 = (Task) C.getFrom_goalnode();
		
			if(T.get_availability_status() == false || C.getFrom_goalnode().get_availability_status() == false) {
				continue;
			}
			if(C.getType() == ContributionType.MMS) {
				ArrayList<ArrayList<String>> outer = T.getOuterList();
				for(ArrayList<String> ar : outer) {
					for(String a : ar) {
						goalmodel.getActions().get(a).setNegation();   //mark action a to be investigated
						for(ArrayList<String> ar1 : T1.getOuterList()) {
							String s = "";
							for(String a1 : ar1) {
								if(s.equals("")) {
									s +=  "'" + a1 ;
								}
								else{
									s += "," + a1 ;
								}
									
								
								
							}
							s += "'" ;
							
							goalmodel.getActions().get(a).get_exist_node_list().add(s);  //put in every action that satisfies T lists that must be investigated later in created ADG in order to satisfy contribution links constraints
						}
						
						
					}
				}
				
			}
			
			if(C.getType() == ContributionType.PPD) {
				ArrayList<ArrayList<String>> outer = T.getOuterList();
				for(ArrayList<String> ar : outer) {
					for(String a : ar) {
						goalmodel.getActions().get(a).setNegation();  //mark action a to be investigated
						for(ArrayList<String> ar1 : T1.getOuterList()) {
							String s = "";
							for(String a1 : ar1) {
								if(s.equals("")) {
									s +=  "'" + a1 ;
								}
								else{
									s += "," + a1 ;
								}
									
								
								
							}
							s += "'" ;
							
							goalmodel.getActions().get(a).get_non_exist_node_list().add(s);   //put in every action that satisfies T lists that must be investigated later in created ADG in order to satisfy contribution links constraints
						}
						
						
					}
				}
				
			}
			
		}
	}
	

}
