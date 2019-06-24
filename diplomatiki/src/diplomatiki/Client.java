package diplomatiki;
import goal_metamodel.*;

import java.io.File;
import java.io.FileInputStream;
//import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
//import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.*;

//import org.eclipse.emf.common.util.BasicEList;
//import org.eclipse.emf.common.util.EList;

import aDG_metamodel.ADG;
import aDG_metamodel.ADG_metamodelFactory;
import aDG_metamodel.ActionNode;
import aDG_metamodel.JoinNode;
import aDG_metamodel.Link;
import aDG_metamodel.SplitNode;
import aDG_metamodel.Node;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
	
	
		
//		Generator g = new Generator();
//		
//		Goal_Model goalmodel = g.generate(100, 100,4,10,1,1,5,2,1,1,20);                //create goal model
//		
//		Context_change context = new Context_change(goalmodel.getTasks(),goalmodel.getActions(),goalmodel.getResoures());
//		context.change(goalmodel, 1, 1);                  //update goal model based on context
//		System.out.println("");
//		printGoalModel(goalmodel);
		
		FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Goal_Model goalmodel = (Goal_Model) oi.readObject();
		//System.out.println(readGoalModel.getActions().get("A1"));
		
		printGoalModel(goalmodel);
		
		
		List<Task> tasks = new ArrayList<Task>(goalmodel.getTasks().values());
		//List<Action> actions = new ArrayList<Action>(goalmodel.getActions().values());
		Collections.sort(tasks, new Comparator<Task>() {                     //sort tasks list based on depth
			public int compare(Task T1,Task T2) {

				   int depth1 = T1.getdepth();
				   int depth2 = T2.getdepth();

				   /*For ascending order*/
				  // return rollno1-rollno2;

				   /*For descending order*/
				  return  depth2-depth1;
					}
			}
		);
		
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		long start = System.currentTimeMillis();
		ArrayList<Task> parallel_tasks = new ArrayList<Task>(); 
		//Find_Actions.FindBestPath(tasks, parallel_tasks, goalmodel);
		Find_Actions.Find(tasks,parallel_tasks,goalmodel);    //find all sets of actions that satisfy each task
		System.out.println("ok");
		ContributionRule cr = new ContributionRule(goalmodel.getcontributionlinks());
		
		cr.ApplyRule(goalmodel);                                                          //Σιγουρα θελει βελτιωση 
		
		if(goalmodel.getcontributionlinks().size()>0) {
			System.out.println("Contribution links are: ");
			for(int i=0;i<goalmodel.getcontributionlinks().size();i++) {
				System.out.println("\t" + goalmodel.getcontributionlinks().get(i).getFrom_goalnode().getName() + " -> " + goalmodel.getcontributionlinks().get(i).getTo_goalnode().getName() + " of type " + goalmodel.getcontributionlinks().get(i).getType() + "\n");
			}
		}
		
		System.out.println("");
		
		ADG_metamodelFactory adg_factory = ADG_metamodelFactory.eINSTANCE;
		ADG_Collection initialADG_Collection = new ADG_Collection();  //create initial ADG Collection
		initialADG_Collection.setid("0");
		JoinNode jp = adg_factory.createJoinNode();
		jp.setName("JP");
		SplitNode sp = adg_factory.createSplitNode();
		sp.setName("SP");
		
		for(ArrayList<String> ar : goalmodel.getTasks().get("root").getOuterList()) {   //create ADG for each set that satisfies root node
			ADG adg = adg_factory.createADG();
			String solution_name = "";  //list which has all the actions of ADG
			
			adg.setSP(sp);
			adg.setJP(jp);//
			
			HashSet<String> positive_nodes_to_check = new HashSet<String>();   //check for the constraints of MMS contribution
			HashSet<String> negative_nodes_to_check = new HashSet<String>();   // check for the constraints of PPD contribution
			
			for(String a : ar) {
				if(solution_name.contains("'" + a + "'")) {
					continue;
				}
				solution_name = solution_name + "'" + a + "'" ;
				if(goalmodel.getActions().get(a).getIsParallelAction() == false) {
					
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
						adg.add_unnecessary_nodes_in_orids(goalmodel.getActions().get(a).get_OR_dec_id());	  //this list will be useful for the combination of the final sequences from various ADG Collections	
					}
					adg.add_unnecessary_nodes_in_orids(goalmodel.getActions().get(a).get_OR_dec_id());		
				}
				
				if(goalmodel.getActions().get(a).getNegationStatus() == true) {
					
					positive_nodes_to_check.addAll(goalmodel.getActions().get(a).get_exist_node_list());
					negative_nodes_to_check.addAll(goalmodel.getActions().get(a).get_non_exist_node_list());
					
				}
				
			}
			
			if(positive_nodes_to_check.size()>0) {   //find if an ADG is compromised with contribution links constraints as regards MMS
				
				List<String> positive_nodes_to_check_list = new ArrayList<String>( positive_nodes_to_check);
				for(String s1 : positive_nodes_to_check_list) {
					String parts[] = s1.split("'");
					
					int i = 0;
					
					String s2[] = parts[1].split(",");
					int length = s2.length;
					for(String s3 : s2) {
						
						
						
						if(!solution_name.contains(s3)) {
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
			
			if(negative_nodes_to_check.size()>0) {    //find if an ADG is compromised with contribution links constraints as regards PPD
				
				List<String> negative_nodes_to_check_list = new ArrayList<String>( negative_nodes_to_check);
				adg.setNegation();
				for(String s1  : negative_nodes_to_check_list) {
					String parts[] = s1.split("'");
					int i = 0;
					
					String s2[] = parts[1].split(",");
					int length = s2.length;
					for(String s3 : s2) {
						
						
						if(!solution_name.contains(s3)) {
							break;
						}
						i++;
					}
					
					if( i == length) {
						adg.restore_negation();
					}
					
				}
			}
			
			
			if(!initialADG_Collection.get_solution_names().contains(solution_name) && adg.getNegationStatus() == false) {
				initialADG_Collection.add_ADG(adg);
				initialADG_Collection.add_solution_names(solution_name);
				adg.set_node_names(solution_name);
			}
			
			
		}
		
		HashMap<String,ADG_Collection> ADG_Collections = new HashMap<String,ADG_Collection>();  //a Collection of ADG Collections
		ADG_Collections.put("0", initialADG_Collection);
		
		
		ParallelRule pr = new ParallelRule(goalmodel.getParallelNodes(),ADG_Collections,adg_factory);
		pr.ApplyRule(goalmodel);
		
		LogicalPrecedenceRule lp = new LogicalPrecedenceRule(goalmodel.getlplinks(),ADG_Collections,adg_factory,goalmodel.getParallelNodes(),goalmodel);
		lp.ApplyRule();
		TemporalPrecedenceRule tp = new TemporalPrecedenceRule(goalmodel.gettplinks(),ADG_Collections,adg_factory,goalmodel.getParallelNodes(),goalmodel);
		tp.ApplyRule();
		ResourceRule rs = new ResourceRule(goalmodel.getrdlinks(),ADG_Collections,adg_factory);
		rs.ApplyRule();
		TimeoutRule to = new TimeoutRule(goalmodel.gettimeoutlinks(),ADG_Collections,adg_factory);
		to.ApplyRule();
		TimeDifferenceRule td = new TimeDifferenceRule(goalmodel.gettimedifferencelinks(),ADG_Collections,adg_factory);
		td.ApplyRule();
		//print the characteristics of goal model
		if(goalmodel.getlplinks().size()>0 ) {
			System.out.println("LP links are: ");
			for(int i=0;i<goalmodel.getlplinks().size();i++) {
				System.out.println("\t" + goalmodel.getlplinks().get(i).getFrom_goalnode().getName() + " -> " + goalmodel.getlplinks().get(i).getTo_goalnode().getName() +"\n" );
			}
		}
		
		System.out.println("");
		
		if(goalmodel.gettplinks().size()>0 ) {
			System.out.println("TP links are: " );
			for(int i=0;i<goalmodel.gettplinks().size();i++) {
				System.out.println("\t" + goalmodel.gettplinks().get(i).getFrom().getName() + " -> " + goalmodel.gettplinks().get(i).getTo().getName() +"\n" );
			}
		}
		
		System.out.println("");
		
		if(goalmodel.getrdlinks().size()>0 ) {
			System.out.println("RD links are: " );
			for(int i=0;i<goalmodel.getrdlinks().size();i++) {
				System.out.println("\t" + goalmodel.getrdlinks().get(i).getFrom_action().getName() + " -> " + goalmodel.getrdlinks().get(i).getTo_resource().getName() +"\n");
			}
		}
		
		System.out.println("");
		
		if(goalmodel.gettimeoutlinks().size()>0) {
			System.out.println("Timeout links are: ");
			for(int i=0; i<goalmodel.gettimeoutlinks().size();i++) {
				System.out.println("\t" + goalmodel.gettimeoutlinks().get(i).getFrom().getName() + " -> " + goalmodel.gettimeoutlinks().get(i).getTo().getName() +"\n");
			}
		}
		
		System.out.println("");
		
		if(goalmodel.gettimedifferencelinks().size()>0) {
			System.out.println("TimeDifference links are: ");
			for(int i=0; i<goalmodel.gettimedifferencelinks().size();i++) {
				System.out.println("\t" + goalmodel.gettimedifferencelinks().get(i).getFrom().getName() + " -> " + goalmodel.gettimedifferencelinks().get(i).getTo().getName() +"\n");
			}
		}
		
		System.out.println("");
		
		if(goalmodel.getcontributionlinks().size()>0) {
			System.out.println("Contribution links are: ");
			for(int i=0;i<goalmodel.getcontributionlinks().size();i++) {
				System.out.println("\t" + goalmodel.getcontributionlinks().get(i).getFrom_goalnode().getName() + " -> " + goalmodel.getcontributionlinks().get(i).getTo_goalnode().getName() + " of type " + goalmodel.getcontributionlinks().get(i).getType() + "\n");
			}
		}
		
		System.out.println("");
		
		List<String> ADG_Collections_names = new ArrayList<String>(ADG_Collections.keySet());
		Collections.sort(ADG_Collections_names, new Comparator<String>() {
		    public int compare(String o1, String o2) {
		        return extractInt(o1) - extractInt(o2);
		    }

		    int extractInt(String s) {
		        String num = s.replaceAll("\\D", "");
		        // return 0 if no digits found
		        return num.isEmpty() ? 0 : Integer.parseInt(num);
		    }
		});
		
		
		ADG_Collections = ADG_to_DirectedGraph.Transform(ADG_Collections);   //transform ADGs to Directed Graphs
		
		for(int i=0; i<ADG_Collections_names.size();i++) {
			String name = ADG_Collections_names.get(i);
			
			if(name.equals("0")) {
				for(DirectedGraph dg : ADG_Collections.get(name).get_transformed_ADG_Collection()) {
					List<List<Node>> result = new ArrayList<List<Node>>();
					TopologicalSort.sort(dg, result);
					dg.add_sorted_actions(result);
					
				}
			}
			else {
				
				for(DirectedGraph dg : ADG_Collections.get(name).get_transformed_ADG_Collection()) {
					List<List<Node>> result = new ArrayList<List<Node>>();
					TopologicalSort.parallel_sort(dg, dg.getJPLinks(), result,ADG_Collections.get(name));
					dg.add_sorted_actions( result);
					//Set<String> last_nodes = new HashSet<String>(dg.getJPLinks().keySet());
					
				}
				
			}
			
		}
		
		long elapsedTimeMillis = System.currentTimeMillis()-start;
		System.out.println("Time is: " + elapsedTimeMillis );
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		long actualMemUsed=afterUsedMem-beforeUsedMem;
		System.out.println("RAM is: " + actualMemUsed);
		
//		ResultPrinter resultPrinter = new ResultPrinter();
//		
//		resultPrinter.basicprint(ADG_Collections,goalmodel);
		
		
		
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
	
	
	
	
	
	
	
	
	
	
	
	public static void printGoalModel(Goal_Model goalmodel) {
		Task root =goalmodel.getRefers_to();
		Decomposition dec = root.getHasdecomposition();
		System.out.println("Root: " + root.getName() +  (dec != null ? " ["+dec.getType()+"]" : ""));
		//String offset="\t";
		for (GoalNode g : dec.getDecomposed_to()) {
			//System.out.println(offset+ "Node: " + g.getName()  + (dec != null ? " ["+dec.getType()+"]" : ""));
			printGMNodeAndSubNodes(g,"\t");
		}
	}
	
	
	
	private static void printGMNodeAndSubNodes(GoalNode g, String offset) {
		
		if (g instanceof Task) {
			Task g1 = (Task)g;
			Decomposition dec = g1.getHasdecomposition();
			
			//System.out.println(g1.getParallelLinks().size()==0);
			if(g1.getParallelLinks().size()>0) {
				System.out.print(offset+ "Node: " + g1.getName()+ "(" + g1.getdepth() + ")" + (dec != null ? " ["+dec.getType()+"]" : ""));
				for(ParallelLink pl :g1.getParallelLinks()) {
					System.out.println(" -> " + pl.getTo().getName());
				}
			}
			else System.out.println(offset+ "Node: " + g1.getName() + "(" + g1.getdepth() + ")"  + (dec != null ? " ["+dec.getType()+"]" : ""));
			if (dec != null) {
				for (GoalNode child : dec.getDecomposed_to()) {
					printGMNodeAndSubNodes(child,offset+"\t");
				}
			}
		}
		
		
		if (g instanceof Action) {
			Action a = (Action)g;
			if(a.getParallelLinks().size()>0) {
				System.out.print(offset+ "Action: " + a.getName() +" with cost:" + a.getCost() );
				System.out.println(" -> " + a.getParallelLinks().get(0).getTo().getName());
				for (Resource r : a.getRequires()) {
					System.out.println(offset+"\t"+"Resource: " + r.getName());
				}
			}
			else {
				System.out.println(offset+ "Action: " + a.getName() +" with cost:" + a.getCost());
				for (Resource r : a.getRequires()) {
					System.out.println(offset+"\t"+"Resource: " + r.getName());
				}
			}
			
			
		}
	}
	
	
	
	
	
	
}
