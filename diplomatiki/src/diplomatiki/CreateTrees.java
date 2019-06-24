package diplomatiki;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import goal_metamodel.Action;
import goal_metamodel.Decomposition;
import goal_metamodel.GoalNode;
import goal_metamodel.Goal_Model;
import goal_metamodel.ParallelLink;
import goal_metamodel.Resource;
import goal_metamodel.Task;

public class CreateTrees {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Generator g = new Generator();
		
		//Goal_Model goalmodel1 = g.generate(100, 100,4,10,1,1,5,2,1,1,20); 
		
		Goal_Model goalmodel1 = g.generate(6, 10,2,1,1,1,1,1,1,1,3);                //create goal model
		
		Context_change context = new Context_change(goalmodel1.getTasks(),goalmodel1.getActions(),goalmodel1.getResoures());
		context.change(goalmodel1, 0, 1);   //update goal model based on context
		
		//System.out.println(goalmodel1.getActions().get("A1"));

		FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
		ObjectOutputStream o = new ObjectOutputStream(f);
		
		o.writeObject(goalmodel1);
		f.close();
		
		FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Goal_Model readGoalModel = (Goal_Model) oi.readObject();
		//System.out.println(readGoalModel.getActions().get("A1"));
		
		printGoalModel(readGoalModel);
		
	}
	
	
	public static void printGoalModel(Goal_Model goalmodel) throws FileNotFoundException {
		
		PrintWriter writer = new PrintWriter("/home/mik/Desktop/NodeTree.txt");
		
		Task root =goalmodel.getRefers_to();
		Decomposition dec = root.getHasdecomposition();
		System.out.println("Root: " + root.getName() +  (dec != null ? " ["+dec.getType()+"]" : ""));
		writer.println("Root: " + root.getName() +  (dec != null ? " ["+dec.getType()+"]" : ""));
		//String offset="\t";
		for (GoalNode g : dec.getDecomposed_to()) {
			//System.out.println(offset+ "Node: " + g.getName()  + (dec != null ? " ["+dec.getType()+"]" : ""));
			printGMNodeAndSubNodes(g,"\t",writer);
		}
		writer.close();
	}
	
	
	
	private static void printGMNodeAndSubNodes(GoalNode g, String offset,PrintWriter writer) {
		
		if (g instanceof Task) {
			Task g1 = (Task)g;
			Decomposition dec = g1.getHasdecomposition();
			
			//System.out.println(g1.getParallelLinks().size()==0);
			if(g1.getParallelLinks().size()>0) {
				System.out.print(offset+ "Node: " + g1.getName()+ "(" + g1.getdepth() + ")" + (dec != null ? " ["+dec.getType()+"]" : ""));
				writer.print(offset+ "Node: " + g1.getName()+ "(" + g1.getdepth() + ")" + (dec != null ? " ["+dec.getType()+"]" : ""));
				for(ParallelLink pl :g1.getParallelLinks()) {
					System.out.println(" -> " + pl.getTo().getName());
					writer.println(" -> " + pl.getTo().getName());
				}
			}
			else {
				System.out.println(offset+ "Node: " + g1.getName() + "(" + g1.getdepth() + ")"  + (dec != null ? " ["+dec.getType()+"]" : ""));
				writer.println(offset+ "Node: " + g1.getName() + "(" + g1.getdepth() + ")"  + (dec != null ? " ["+dec.getType()+"]" : ""));
			}
			if (dec != null) {
				for (GoalNode child : dec.getDecomposed_to()) {
					printGMNodeAndSubNodes(child,offset+"\t",writer);
				}
			}
		}
		
		
		if (g instanceof Action) {
			Action a = (Action)g;
			if(a.getParallelLinks().size()>0) {
				System.out.print(offset+ "Action: " + a.getName()+ " with cost:" + a.getCost()  );
				System.out.println(" -> " + a.getParallelLinks().get(0).getTo().getName());
				writer.print(offset+ "Action: " + a.getName() );
				writer.println(" -> " + a.getParallelLinks().get(0).getTo().getName());
				for (Resource r : a.getRequires()) {
					System.out.println(offset+"\t"+"Resource: " + r.getName());
					writer.println(offset+"\t"+"Resource: " + r.getName());
				}
			}
			else {
				System.out.println(offset+ "Action: " + a.getName()+" with cost:" + a.getCost()  );
				writer.println(offset+ "Action: " + a.getName() );
				for (Resource r : a.getRequires()) {
					System.out.println(offset+"\t"+"Resource: " + r.getName());
					writer.println(offset+"\t"+"Resource: " + r.getName());
				}
			}
			
			
		}
	}
	

}
