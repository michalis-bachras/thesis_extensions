package diplomatiki;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import aDG_metamodel.ActionNode;
import aDG_metamodel.JoinNode;
import aDG_metamodel.Node;
import aDG_metamodel.SplitNode;
import goal_metamodel.Goal_Model;

public class ResultPrinter {
	
	public void basicprint(HashMap<String,ADG_Collection> ADG_Collections,Goal_Model goalmodel) throws FileNotFoundException {
		
		PrintWriter writer = new PrintWriter("/home/mik/Desktop/diplomatiki_output3.txt");
		List<DirectedGraph> zero = ADG_Collections.get("0").get_transformed_ADG_Collection();
		//combine the various ADGs from different ADG Collections in order to extract the final sequences
		
		for(DirectedGraph dg : zero) {
			List<List<Node>> result = dg.get_sorted_actions();
			if(result.size() == 0) {
				//System.out.println("There is no solution");
				writer.println("There is no solution");
				System.exit(0);
			}
			if(dg.getSPLinks().isEmpty() || dg.getJPLinks().isEmpty()) {
				//System.out.println("Loop in links");
				writer.println("Loop in links");
				System.exit(0);
			}
			//System.out.println("One sequence is: ");
			writer.println("One sequence is: ");
			for(List<Node> l : result) {
				//System.out.print("\t");
				writer.print("\t");
				for(Node n : l) {
					if(n.getName().contains("P") && !n.getName().contains("SP") && !n.getName().contains("JP") ) {
					
						if(ADG_Collections.get(n.getName()).get_transformed_ADG_Collection().isEmpty()) {  //check if node n is parallel node
							continue;
						}
					}
					//System.out.print(n.getName()+ " ");
					writer.print(n.getName()+ " ");
				}
				//System.out.println("");
				writer.println("");
				
				if(!dg.getConstraints().isEmpty()) {
					//System.out.println("Constraints are: " + dg.getConstraints());
					writer.println("Constraints are: " + dg.getConstraints());
				}
				//System.out.println("");
				writer.println("");
			}
			if(dg.get_unnecessary_nodes_in_orids().isEmpty()) {   //unnecessary_nodes_in_orids show if a node from a OR decomposition with specific id has been selected in the final sequence
				print_result(dg,ADG_Collections,goalmodel,false,true,writer);
			}
			else {
				print_result(dg,ADG_Collections,goalmodel,true,false,writer);
			}
			
			
		}
		writer.close();
		
	}
	
	
	//@ no_or_ids shows if OR decomposed actions have been put in final sequence
	   //@ print_all variable shows that in order to have all combinations of sequences I will put all the Actions of a Directed Graph in a final sequence of Actions(combined with remove_flag variable later)
	public static void print_result(DirectedGraph dg,HashMap<String,ADG_Collection> ADG_Collections,Goal_Model goalmodel,boolean print_all,boolean no_or_ids,PrintWriter writer) {
		HashSet<String> unnecessary_nodes = dg.get_unnecessary_nodes_in_orids();  //with this list I know the OR decomposition ids that has already been put in the final sequence
		if(dg.get_parallel_nodes().equals("")) {
			return;
		}
		for(String parallel_node : dg.get_parallel_nodes().split(",")) {
			
			String[] parallel_node1 = parallel_node.split("'");
			List<DirectedGraph> P = ADG_Collections.get(parallel_node1[1]).get_transformed_ADG_Collection();
			String tabs[] = parallel_node1[1].split("P");
			int tabs_number = Integer.parseInt(tabs[1]) +1;
			if(P.isEmpty()) {
				continue;
			}
			
			//
			if(no_or_ids && goalmodel.getParallelNodes().get(parallel_node1[1]).getORGoalNodes().size()>0) {
				
				for(DirectedGraph dg1 : P) {
					HashSet<String> printed_nodes = new HashSet<String>();
					HashSet<String> examined_or_ids = new HashSet<String>();
					List<List<Node>> result1 = dg1.get_sorted_actions();  //the different sets of Actions that have been calculated
					if(result1.size() == 0) {
						for(int i =0;i<tabs_number;i++) {
							//System.out.print("\t");
							writer.print("\t");
						}
						//System.out.println("There is no solution P");
						writer.println("There is no solution P");
						System.exit(0);
					}
					if(dg1.getSPLinks().isEmpty() || dg1.getJPLinks().isEmpty()) {
						for(int i =0;i<tabs_number;i++) {
							//System.out.print("\t");
							writer.print("\t");
						}
						//System.out.println("Loop in links");
						writer.println("Loop in links");
						System.exit(0);
					}
					for(int i =0;i<tabs_number;i++) {
						//System.out.print("\t");
						writer.print("\t");
					}
					//System.out.println("One sequence for parallel " + parallel_node1[1] + " is: ");
					writer.println("One sequence for parallel " + parallel_node1[1] + " is: ");
					for(List<Node> l : result1) {
						//System.out.print("\t");
						writer.print("\t");
						for(Node n : l) {
							if(n instanceof ActionNode ) {
								//examine the OR decompositions in which Actions n and its ancestors belong to in order to find all the possible combinations between ADG Collections
								List<String> or_dec_ids = new ArrayList<String>(goalmodel.getActions().get(n.getName()).getOR_dec_ids());
								for(String or_dec_id : or_dec_ids) {
									if(goalmodel.getParallelNodes().get(parallel_node1[1]).get_necessary_or_ids().contains(or_dec_id)) {
										examined_or_ids.add(or_dec_id);
										break;
									}
								}
								
							}
						}
						
					}
					if(examined_or_ids.size() == (goalmodel.getParallelNodes().get(parallel_node1[1]).get_necessary_or_ids().size())) {
						List<String> last_nodes = new ArrayList<String>();
						//print each set of Actions
						for(List<Node> l : result1) {
							for(int i =0;i<tabs_number;i++) {
								//System.out.print("\t");
								writer.print("\t");
							}
							String last_node = "";
							for(Node n : l) {
								last_node=n.getName();
								printed_nodes.add(n.getName());
								//System.out.print(n.getName()+ " ");
								writer.print(n.getName()+ " ");
							}
							if(!last_node.equals("")) {
								last_nodes.add(last_node);
							}
							
							//System.out.println("");
							writer.println("");
						}
						if(dg.getJPLinks().keySet().size()>1) {
							for(int i =0;i<tabs_number;i++) {
								//System.out.print("\t");
								writer.print("\t");
							}
							//System.out.println("The nodes " + last_nodes + " will have " + ADG_Collections.get(parallel_node1[1]).get_parallel_timeout() + " to synchronize" );
							writer.println("The nodes " + last_nodes + " will have " + ADG_Collections.get(parallel_node1[1]).get_parallel_timeout() + " to synchronize");
						}
						//System.out.println("");
						writer.println("");
						//System.out.println("Constraints are: " + dg1.getConstraints());
						if(!dg1.getConstraints().isEmpty()) {
							String[] constraints = dg1.getConstraints().split(",");
							for(String c :constraints) {
								String[] constraint = c.split(" ");
								if(printed_nodes.contains(constraint[3]) && printed_nodes.contains(constraint[5])) {
									for(int i =0;i<tabs_number;i++) {
										//System.out.print("\t");
										writer.print("\t");
									}
									//System.out.println(c);
									writer.println(c);
								}
							}
							//System.out.println("");
							writer.println("");
							//System.out.println("");
							writer.println("");
						}
						
					}
					
				}
				continue;
			}
			
			
			for(DirectedGraph dg1 : P) {
				HashSet<String> printed_nodes = new HashSet<String>();
				List<List<Node>> result1 = dg1.get_sorted_actions();
				for(int i =0;i<tabs_number;i++) {
					//System.out.print("\t");
					writer.print("\t");
				}
				//System.out.println("One sequence for parallel " + parallel_node1[1] + " is: ");
				writer.println("One sequence for parallel " + parallel_node1[1] + " is: ");
				boolean remove_flag = false;
				List<String> last_nodes = new ArrayList<String>();
				for(List<Node> l : result1) {
					//System.out.print("\t");
					writer.print("\t");
					for(int i =0;i<tabs_number;i++) {
						//System.out.print("\t");
						writer.print("\t");
					}
					String last_node = "";
					for(Node n : l) {
						if(n.getName().contains("P") && !n.getName().contains("SP") && !n.getName().contains("JP")) {
							
							if(ADG_Collections.get(n.getName()).get_transformed_ADG_Collection().isEmpty()) {
								continue;
							}
						}
						boolean or_flag = false;
						if( n instanceof SplitNode || n instanceof JoinNode ) {
							
							//System.out.print(n.getName()+ " ");
							writer.print(n.getName()+ " ");
							continue;
						}
						List<String> OR_dec_ids = new ArrayList<String>(goalmodel.getActions().get(n.getName()).getOR_dec_ids()) ;
						for(String s : OR_dec_ids) {
							if(unnecessary_nodes.contains(s)) {  //check if Action n should be put in final sequence
								or_flag = true;
								remove_flag = true;
								break;
							}
						}
						if(!or_flag && n instanceof ActionNode) {
							last_node=n.getName();
							printed_nodes.add(n.getName());
							//System.out.print(n.getName()+ " ");
							writer.print(n.getName()+ " ");
						}
						
						
						
					}
					//System.out.println("");
					writer.println("");
					if(!last_node.equals("")) {
						last_nodes.add(last_node);
					}
					
				}
				if(dg.getJPLinks().keySet().size()>1) {
					//System.out.println("");
					writer.println("");
					for(int i =0;i<tabs_number;i++) {
						//System.out.print("\t");
						writer.print("\t");
					}
					//System.out.println("The nodes " + last_nodes + " will have " + ADG_Collections.get(parallel_node1[1]).get_parallel_timeout() + " to synchronize" );
					writer.println("The nodes " + last_nodes + " will have " + ADG_Collections.get(parallel_node1[1]).get_parallel_timeout() + " to synchronize");
				}
				//System.out.println("");
				writer.println("");
				//System.out.println("");
				writer.println("");
				//System.out.println("Constraints are: " + dg1.getConstraints());
				if(!dg1.getConstraints().isEmpty()) {
					String[] constraints = dg1.getConstraints().split(",");
					for(String c :constraints) {
						String[] constraint = c.split(" ");
						if(printed_nodes.contains(constraint[3]) && printed_nodes.contains(constraint[5])) {
							for(int i =0;i<tabs_number;i++) {
								//System.out.print("\t");
								writer.print("\t");
							}
							//System.out.println(c);
							writer.println(c);
						}
					}
					//System.out.println("");
					writer.println("");
					//System.out.println("");
					writer.println("");
				}
				
				if(unnecessary_nodes.isEmpty()) {
					print_result(dg1,ADG_Collections,goalmodel,false,true,writer);
				}
				else {
					print_result(dg1,ADG_Collections,goalmodel,true,false,writer);

				}
				
				// if there is no constraint from these two variables it should be printed all the Actions of the Directed Graph
				if(print_all && remove_flag) {
					for(int i =0;i<tabs_number;i++) {
						//System.out.print("\t");
						writer.print("\t");
					}
					//System.out.println("One sequence for parallel " + parallel_node1[1] + " is: ");
					writer.println("One sequence for parallel " + parallel_node1[1] + " is: ");
					HashSet<String> printed_nodes1 = new HashSet<String>();
					List<String> last_nodes1 = new ArrayList<String>();
					for(List<Node> l : result1) {
						//System.out.print("\t");
						writer.print("\t");
						for(int i =0;i<tabs_number;i++) {
							//System.out.print("\t");
							writer.print("\t");
						}
						String last_node = "";
						for(Node n : l) {
							//boolean or_flag = false;
							if( n instanceof SplitNode || n instanceof JoinNode ) {
								//System.out.print(n.getName()+ " ");
								writer.print(n.getName()+ " ");
								continue;
							}
							
							
							last_node = n.getName();
							//System.out.print(n.getName()+ " ");
							writer.print(n.getName()+ " ");
							//}
							
							
							
						}
						//System.out.println("");
						writer.println("");
						if(!last_node.equals("")) {
							last_nodes1.add(last_node);
						}
						
					}
					if(dg.getJPLinks().keySet().size()>1) {
						//System.out.println("");
						writer.println("");
						for(int i =0;i<tabs_number;i++) {
							//System.out.print("\t");
							writer.print("\t");
						}
						//System.out.println("The nodes " + last_nodes1 + " will have " + ADG_Collections.get(parallel_node1[1]).get_parallel_timeout() + " to synchronize" );
						writer.println("The nodes " + last_nodes1 + " will have " + ADG_Collections.get(parallel_node1[1]).get_parallel_timeout() + " to synchronize");
					}
					//System.out.println("");
					writer.println("");
					//System.out.println("Constraints are: " + dg1.getConstraints());
					if(!dg1.getConstraints().isEmpty()) {
						String[] constraints1 = dg1.getConstraints().split(",");
						for(String c :constraints1) {
							String[] constraint = c.split(" ");
							if(printed_nodes1.contains(constraint[3]) && printed_nodes1.contains(constraint[5])) {
								//System.out.println(c);
								writer.println(c);
							}
						}
						//System.out.println("");
						writer.println("");
						//System.out.println("");
						writer.println("");
					}
					
					if(unnecessary_nodes.isEmpty()) {
						print_result(dg1,ADG_Collections,goalmodel,false,true,writer);
					}
					else {
						print_result(dg1,ADG_Collections,goalmodel,true,false,writer);

					}
				}
				
				
				
			}
		}
		
	}
	

}
