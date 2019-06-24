package diplomatiki;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import java.util.NoSuchElementException;
import java.util.Set;

import aDG_metamodel.JoinNode;
import aDG_metamodel.Link;
import aDG_metamodel.Node;
import aDG_metamodel.SplitNode;

public class DirectedGraph implements Iterable<Node>  {
	
	
	
	/* A map from nodes in the graph to sets of outgoing edges.  Each
     * set of edges is represented by a map from edges to doubles.
     */
    private final HashMap<Node,HashSet<Node>> mGraph = new HashMap<Node,HashSet<Node>>();

    /**
     * Adds a new node to the graph.  If the node already exists, this
     * function is a no-op.
     * @param <Node>
     *
     * @param node Nodehe node to add.
     * @return Whether or not the node was added.
     */
    public  boolean addNode(Node node) {
        /* If the node already exists, don't do anything. */
        if (mGraph.containsKey(node))
            return false;

        /* Otherwise, add the node with an empty set of outgoing edges. */
       HashSet<Node> s = new HashSet<Node>();
        mGraph.put(node, s);
        return true;
    }

    /**
     * Given a start node, and a destination, adds an arc from the start node 
     * to the destination.  If an arc already exists, this operation is a 
     * no-op.  If either endpoint does not exist in the graph, throws a 
     * NoSuchElementException.
     *
     * @param start Nodehe start node.
     * @param dest Nodehe destination node.
     * @throws NoSuchElementException If either the start or destination nodes
     *                                do not exist.
     */
    public void addEdge(Node start, Node dest) {
        /* Confirm both endpoints exist. */
        if (!mGraph.containsKey(start) || !mGraph.containsKey(dest))
            throw new NoSuchElementException("Both nodes must be in the graph.");

        /* Add the edge. */
        mGraph.get(start).add(dest);
    }

    /**
     * Removes the edge from start to dest from the graph.  If the edge does
     * not exist, this operation is a no-op.  If either endpoint does not
     * exist, this throws a NoSuchElementException.
     *
     * @param start Nodehe start node.
     * @param dest Nodehe destination node.
     * @throws NoSuchElementException If either node is not in the graph.
     */
    public void removeEdge(Node start, Node dest) {
        /* Confirm both endpoints exist. */
        if (!mGraph.containsKey(start) || !mGraph.containsKey(dest))
            throw new NoSuchElementException("Both nodes must be in the graph.");

        mGraph.get(start).remove(dest);
    }

    /**
     * Given two nodes in the graph, returns whether there is an edge from the
     * first node to the second node.  If either node does not exist in the
     * graph, throws a NoSuchElementException.
     *
     * @param start Nodehe start node.
     * @param end Nodehe destination node.
     * @return Whether there is an edge from start to end.
     * @throws NoSuchElementException If either endpoint does not exist.
     */
    public boolean edgeExists(Node start, Node end) {
        /* Confirm both endpoints exist. */
        if (!mGraph.containsKey(start) || !mGraph.containsKey(end))
            throw new NoSuchElementException("Both nodes must be in the graph.");

        return mGraph.get(start).contains(end);
    }

    /**
     * Given a node in the graph, returns an immutable view of the edges
     * leaving that node as a set of endpoints.
     *
     * @param node Nodehe node whose edges should be queried.
     * @return An immutable view of the edges leaving that node.
     * @throws NoSuchElementException If the node does not exist.
     */
    public Set<Node> edgesFrom(Node node) {
        /* Check that the node exists. */
        Set<Node> arcs = mGraph.get(node);
        if (arcs == null)
            throw new NoSuchElementException("Source node does not exist.");

        return Collections.unmodifiableSet(arcs);
    }
    
    public Set<Node> edgesNodeo(Node node) {
    	
    	Set<Node> to = new HashSet<Node>();
    	
    	for (Node t : this.getNodes()) {
	        Set<Node> arcs = mGraph.get(t);
	        if (arcs == null)
	            throw new NoSuchElementException("Source node does not exist.");
	        if (arcs.contains(node))
	        	to.add(t);	
    	}
	        return Collections.unmodifiableSet(to);
    }

    /**
     * Returns an iterator that can traverse the nodes in the graph.
     *
     * @return An iterator that traverses the nodes in the graph.
     */
    public Iterator<Node> iterator() {
        return mGraph.keySet().iterator();
    }

    /**
     * Returns the number of nodes in the graph.
     *
     * @return Nodehe number of nodes in the graph.
     */
    public int size() {
        return mGraph.size();
    }

    /**
     * Returns whether the graph is empty.
     *
     * @return Whether the graph is empty.
     */
    public boolean isEmpty() {
        return mGraph.isEmpty();
    }
    
    public Set<Node> getNodes() {
        Set<Node> nodes = mGraph.keySet();
        return Collections.unmodifiableSet(nodes);
    }
    
    String Constraints =  "" ;
    
    public void addConstraint(String s) {
		
		if(Constraints.isEmpty()) {
			Constraints += s;
		}
		else{
			Constraints +=  "," + s;
			}
		
	}
	
	public String getConstraints(){
		return Constraints;
	}
	
	public void set_Constraint(String s) {
		Constraints = s;
	}
	
    protected HashSet<String> thread_names = new HashSet<String>();
	
	protected List<String> threads = new ArrayList<String>();
	
	public void add_thread_names_list(HashSet<String> thread_names) {
		this.thread_names = thread_names;
	}
	
	public HashSet<String> get_thread_names(){
		return thread_names;
	}
	
	public void add_thread_list(List<String> threads) {
		this.threads = threads;
	}
	
	public List<String> get_threads(){
		return threads;
	}
	
	protected HashMap<String,Link> SPLinks = new HashMap<String,Link>();
	protected HashMap<String,Link> JPLinks = new HashMap<String,Link>();
	
	public void add_SPLinks(HashMap<String,Link> SPLinks) {
		this.SPLinks = SPLinks;
		
	}
	
	public HashMap<String,Link> getSPLinks() {
		return SPLinks;
	}
	
	public void add_JPLinks(HashMap<String,Link> JPLinks) {
		this.JPLinks = JPLinks;
	}
	
	public HashMap<String,Link> getJPLinks() {
		return JPLinks;
	}
	
	List<List<Node>> sorted_actions = new ArrayList<List<Node>>();
	
	public void add_sorted_actions(List<List<Node>> sorted_actions) {
		this.sorted_actions = sorted_actions;
	}
	
	public List<List<Node>> get_sorted_actions(){
		return sorted_actions;
	}
	
	String parallel_nodes ;
	
	public void set_parallel_nodes(String parallel_nodes) {
		this.parallel_nodes = parallel_nodes;
	}
	
	public String get_parallel_nodes() {
		return parallel_nodes;
	}
	
	protected SplitNode sp ;
	protected JoinNode jp;
	
	public void setSP(SplitNode sp) {
		this.sp = sp;
	}
	
	public SplitNode getSP() {
		return sp;
	}
	
	public void setJP(JoinNode jp) {
		this.jp = jp;
	}
	
	public JoinNode getJP() {
		return jp;
	}
	
	protected HashSet<String> unnecessary_nodes_in_orids = new HashSet<String>();
	
	public void add_unnecessary_nodes_in_orids(HashSet<String> OR_ids) {
		unnecessary_nodes_in_orids.addAll(OR_ids);
	}
	
	public HashSet<String> get_unnecessary_nodes_in_orids(){
		return unnecessary_nodes_in_orids;
	}
	
	
	

}
