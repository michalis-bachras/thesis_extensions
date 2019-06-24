package diplomatiki;

//import java.util.Collections;
import java.util.List;

import goal_metamodel.Action;
//import goal_metamodel.GoalNode;
import goal_metamodel.Task;

public class Traverse_descendant {
	
	
	public static void traverseT(Task t,String current_parallel) {
		
		t.set_current_parallel(current_parallel);
		for(int i=0;i<t.getHasdecomposition().getDecomposed_to().size();i++) {
			if(t.getHasdecomposition().getDecomposed_to().get(i) instanceof Task) {
				Task t1 = (Task) t.getHasdecomposition().getDecomposed_to().get(i); 
				traverseT(t1,current_parallel);
			}
			else {
				Action a1 = (Action) t.getHasdecomposition().getDecomposed_to().get(i); 
				traverseA(a1,current_parallel);
			}
			
		}
		return;
		
		
	}
	
	public static void traverseA(Action a,String current_parallel) {
		
		a.set_current_parallel(current_parallel);
		return;
	}
	
	public static List<List<String>> Find(Task t,List<List<String>> all){
		
		for(int i=0;i<t.getHasdecomposition().getDecomposed_to().size();i++) {
			if(t.getHasdecomposition().getDecomposed_to().get(i) instanceof Task) {
				all.get(0).add(t.getHasdecomposition().getDecomposed_to().get(i).getName());
				all.get(1).add(t.getHasdecomposition().getDecomposed_to().get(i).getName());
				//System.out.println("Tasks are: " + all.get(1));
				Find((Task) t.getHasdecomposition().getDecomposed_to().get(i),all);
			}
			else {
				all.get(0).add(t.getHasdecomposition().getDecomposed_to().get(i).getName());
				all.get(2).add(t.getHasdecomposition().getDecomposed_to().get(i).getName());
			//	System.out.println("Actions are: " + all.get(2));
				
			}
		}
		//Collections.shuffle(goal_nodes);
		return all;
		
	}

}
