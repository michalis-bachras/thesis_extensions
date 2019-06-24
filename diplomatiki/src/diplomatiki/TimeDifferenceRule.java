package diplomatiki;

import java.util.ArrayList;
import java.util.HashMap;

import aDG_metamodel.ADG;
import aDG_metamodel.ADG_metamodelFactory;
import aDG_metamodel.Link;
import goal_metamodel.TimeDifferenceLink;
//import goal_metamodel.TimeoutLink;


public class TimeDifferenceRule {
	
	
	ArrayList<TimeDifferenceLink> time_difference_links = new ArrayList<TimeDifferenceLink>();
	HashMap<String,ADG_Collection> ADG_Collections ;
	ADG_metamodelFactory adg_factory;
	
	public TimeDifferenceRule(ArrayList<TimeDifferenceLink> time_difference_links,HashMap<String,ADG_Collection> ADG_Collections,ADG_metamodelFactory adg_factory) {
		
		this.time_difference_links = time_difference_links;
		this.ADG_Collections = ADG_Collections;
		this.adg_factory = adg_factory;
	}
	
	
public void ApplyRule() {
		
		for(TimeDifferenceLink td : time_difference_links) {
			if(td.getFrom().get_availability_status() == false || td.getTo().get_availability_status() == false) {
				continue;
			}
			
			
			String id = td.getFrom().getid();
			
			ADG_Collection adg_collection = ADG_Collections.get(id);
			for(ADG adg :adg_collection.getADG_Collection()) {   //connect the two Actions of timedifference links between them in various ADGs and put the appropriate constraint
				
				//boolean w = adg.getActionNodes().containsKey(td.getFrom().getName());
				
				
				if(adg.getActionNodes().containsKey(td.getFrom().getName()) && adg.getActionNodes().containsKey(td.getTo().getName()) && !adg.get_link_names().contains(td.getFrom().getName()+td.getTo().getName()) && !adg.get_link_names().contains(td.getTo().getName()+td.getFrom().getName())){
					
					Link lk = adg_factory.createLink();
					lk.setFrom(adg.getActionNodes().get(td.getFrom().getName()));
					lk.setTo(adg.getActionNodes().get(td.getTo().getName()));
					adg.getLink().add(lk);
					adg.add_link_name(td.getFrom().getName()+td.getTo().getName());
					String s = "TimeDifference period between "+ td.getFrom().getName()+ " and "+ td.getTo().getName() + " is " + td.getTimeDifference();
					adg.addConstraint(s);
					if(adg.getJPLinks().containsKey(td.getFrom().getName())) {
						adg.getJPLinks().remove(td.getFrom().getName());
					}
					if(adg.getSPLinks().containsKey(td.getTo().getName())) {
						adg.getSPLinks().remove(td.getTo().getName());
					}
					
				}
			}
		}
		
		
		
	}
	
	

}
