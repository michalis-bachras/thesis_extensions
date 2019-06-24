package diplomatiki;

import java.util.ArrayList;
import java.util.HashMap;

import aDG_metamodel.ADG;
import aDG_metamodel.ADG_metamodelFactory;
import aDG_metamodel.Link;
import goal_metamodel.Action;
//import goal_metamodel.Resource;
import goal_metamodel.ResourceDependency;

public class ResourceRule {

	ArrayList<ResourceDependency> rdlinks = new ArrayList<ResourceDependency>();
	HashMap<String,ADG_Collection> ADG_Collections ;
	ADG_metamodelFactory adg_factory;
	
	public ResourceRule(ArrayList<ResourceDependency> rdlinks,HashMap<String,ADG_Collection> ADG_Collections,ADG_metamodelFactory adg_factory) {
		
		this.rdlinks = rdlinks;
		this.ADG_Collections = ADG_Collections;
		this.adg_factory = adg_factory;
	}
	
	public void ApplyRule() {
		
		for(ResourceDependency rd : rdlinks) {
			Action a1 = rd.getFrom_action();
			Action a2 = rd.getTo_resource().get_parent_action();
			if(a1.get_availability_status() == false || a2.get_availability_status() == false) {
				continue;
			}
			
			ADG_Collection adg_collection = ADG_Collections.get(a1.getid());
			for(ADG adg : adg_collection.getADG_Collection()) {   //connect the Actions a1,a2 in various ADG, where they exist both
				if(adg.getActionNodes().containsKey(a1.getName()) && adg.getActionNodes().containsKey(a2.getName()) && !a1.getName().equals(a2.getName()) && !adg.get_link_names().contains(a1.getName()+a2.getName())  && !adg.get_link_names().contains(a2.getName()+a1.getName())) {   //check if there is already a connection between them
					Link lk = adg_factory.createLink();
					lk.setFrom(adg.getActionNodes().get(a1.getName()));
					lk.setTo(adg.getActionNodes().get(a2.getName()));
					adg.getLink().add(lk);
					adg.add_link_name(a1.getName()+a2.getName());
					if(adg.getJPLinks().containsKey(a1.getName())) {
						adg.getJPLinks().remove(a1.getName());
					}
					if(adg.getSPLinks().containsKey(a2.getName())) {
						adg.getSPLinks().remove(a2.getName());
					}
				}
			}
		}
		
		
		
	}
	
}
