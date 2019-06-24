package diplomatiki;

import java.util.ArrayList;
import java.util.HashMap;

import aDG_metamodel.ADG;
import aDG_metamodel.ADG_metamodelFactory;
import aDG_metamodel.Link;
//import goal_metamodel.Action;
import goal_metamodel.TimeoutLink;

public class TimeoutRule {

	
	ArrayList<TimeoutLink> timeout_links = new ArrayList<TimeoutLink>();
	HashMap<String,ADG_Collection> ADG_Collections ;
	ADG_metamodelFactory adg_factory;
	
	public TimeoutRule(ArrayList<TimeoutLink> timeout_links,HashMap<String,ADG_Collection> ADG_Collections,ADG_metamodelFactory adg_factory) {
		
		this.timeout_links = timeout_links;
		this.ADG_Collections = ADG_Collections;
		this.adg_factory = adg_factory;
	}
	
	
	public void ApplyRule() {
		
		for(TimeoutLink to : timeout_links) {
			if(to.getFrom().get_availability_status() == false || to.getTo().get_availability_status() == false) {
				continue;
			}
			
			
			String id = to.getFrom().getid();
			
			ADG_Collection adg_collection = ADG_Collections.get(id);
			for(ADG adg :adg_collection.getADG_Collection()) {   //connect the two Actions of timeout links between them in various ADGs and put the appropriate constraint
				
				//boolean w = adg.getActionNodes().containsKey(to.getFrom().getName());
				
				
				if(adg.getActionNodes().containsKey(to.getFrom().getName()) && adg.getActionNodes().containsKey(to.getTo().getName()) && !adg.get_link_names().contains(to.getFrom().getName()+to.getTo().getName()) && !adg.get_link_names().contains(to.getTo().getName()+to.getFrom().getName())){
					
					Link lk = adg_factory.createLink();
					lk.setFrom(adg.getActionNodes().get(to.getFrom().getName()));
					lk.setTo(adg.getActionNodes().get(to.getTo().getName()));
					adg.getLink().add(lk);
					adg.add_link_name(to.getFrom().getName()+to.getTo().getName());
					adg.addConstraint("Timeout period between "+ to.getFrom().getName()+ " and "+ to.getTo().getName() + " is " + to.getTimeoutPeriod() );
					if(adg.getJPLinks().containsKey(to.getFrom().getName())) {
						adg.getJPLinks().remove(to.getFrom().getName());
					}
					if(adg.getSPLinks().containsKey(to.getTo().getName())) {
						adg.getSPLinks().remove(to.getTo().getName());
					}
					
				}
			}
		}
		
		
		
	}
	
	
}
