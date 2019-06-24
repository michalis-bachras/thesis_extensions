package diplomatiki;

import java.util.ArrayList;
import java.util.HashMap;

import aDG_metamodel.ADG;
import aDG_metamodel.Link;
import aDG_metamodel.Node;

public class ADG_to_DirectedGraph {
	
	
	
	public static HashMap<String,ADG_Collection> Transform(HashMap<String,ADG_Collection> ADG_Collections){   //transform ADG to Directed Graph
		
		
		ArrayList<String> adg_collections_id = new ArrayList<String>(ADG_Collections.keySet());
		for(String id : adg_collections_id) {
			ADG_Collection adg_collection = ADG_Collections.get(id);
			for(ADG adg : adg_collection.getADG_Collection()) {
				DirectedGraph dg = new DirectedGraph();
				for(Link l : adg.getSPLinks().values()) {
					Node a = l.getFrom();
					Node b = l.getTo();
					dg.addNode(a);
					dg.addNode(b);
					dg.addEdge(a, b);
				}
				for(Link l : adg.getJPLinks().values()) {
					Node a = l.getFrom();
					Node b = l.getTo();
					dg.addNode(a);
					dg.addNode(b);
					dg.addEdge(a, b);	
				}
				for(Link l :adg.getLink()) {
					Node a = l.getFrom();
					Node b = l.getTo();
					dg.addNode(a);
					dg.addNode(b);
					dg.addEdge(a, b);
				}
				dg.add_SPLinks(adg.getSPLinks());
				dg.add_JPLinks(adg.getJPLinks());
				dg.setSP(adg.getSP());
				dg.setJP(adg.getJP());
				dg.add_unnecessary_nodes_in_orids(adg.get_unnecessary_nodes_in_orids());
				dg.set_parallel_nodes(adg.get_parallel_nodes());
			
				dg.set_Constraint(adg.getConstraints());
				adg_collection.add_ADG_directedgraph(dg);
			}
			
		}
		
		
		
		
		return ADG_Collections;
		
		
		
	}
	
	

}
