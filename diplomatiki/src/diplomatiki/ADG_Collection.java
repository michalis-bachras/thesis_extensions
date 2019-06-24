package diplomatiki;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import aDG_metamodel.ADG;
import aDG_metamodel.Node;

public class ADG_Collection {
	
	protected static long idCounter = 0;
	protected  String id;
	protected HashSet<String> solutions_names = new HashSet<String>();
	
	protected int parallel_timeout;
	
	public void set_parallel_timeout(int timeout) {
		parallel_timeout = timeout;
	}
	
	public int get_parallel_timeout() {
		return parallel_timeout;
	}
	
	private List<ADG> ADGs= new ArrayList<ADG>();
	
	private List<DirectedGraph> Transformed_ADGs = new ArrayList<DirectedGraph>();
	
	public void add_solution_names(String solution_name) {
		solutions_names.add(solution_name);
	}
	
	public HashSet<String> get_solution_names(){
		return solutions_names;
	}
	
	public void setid(String id) {
		this.id = id;
	}
	
	public String getid() {
		return id;
	}
	
	public static synchronized String createID()
	{
	    return String.valueOf(idCounter++);
	}

	public List<ADG> getADG_Collection() {
		return ADGs;
	}
	
	public void add_ADG(ADG adg) {
		ADGs.add(adg);
	}
	
	public List<DirectedGraph> get_transformed_ADG_Collection() {
		return Transformed_ADGs;
	}
	
	public void add_ADG_directedgraph(DirectedGraph dg) {
		Transformed_ADGs.add(dg);
	}
	
	protected int max_size = 0;
	
	protected List<List<Node>> max_sequence;
	
	public int get_max_size() {
		return max_size;
	}
	
	public void set_max_size(int max_size) {
		this.max_size = max_size;
	}
	
	public List<List<Node>> get_max_sequence(){
		return max_sequence;
	}
	
	public void set_max_sequence(List<List<Node>> max_sequence) {
		List<List<Node>> temp = new ArrayList<List<Node>>();
		temp.addAll(max_sequence);
		this.max_sequence= temp;
	}
	
	
			
	
}
