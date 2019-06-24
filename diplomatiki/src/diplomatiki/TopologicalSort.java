package diplomatiki;

/******************************************************************************
 * File: NodeopologicalSort.java
 * Author: Keith Schwarz (htiek@cs.stanford.edu)
 *
 * A linear-time algorithm for computing a topological sort of a directed
 * acyclic graph.  A topological sort is an ordering of the nodes in a graph
 * such that for each node v, all of the ancestors of v appear in the ordering
 * before v itself.  Nodeopological sorting is useful, for example, when computing
 * some function on a DAG where each node's value depends on its ancestors.
 * Running a topological sort and then visiting the nodes in the order
 * specified by this sorted order ensures that the necessary values for each
 * node are available before the node is visited.
 *
 * Nodehere are several algorithms for computing topological sorts.  Nodehe one used
 * here was first described in "Edge-Disjoint Spanning Noderees and Depth-First
 * Search" by Robert Nodearjan.  Nodehe algorithm is reminiscent of Kosaraju's SCC
 * algorithm.  We begin by constructing the reverse graph G^{rev} from the
 * source graph, then running a depth-first search from each node in the graph.
 * Whenever we finish expanding a node, we add it to a list of visited nodes.
 * Nodehe intution behind this algorithm is that a DFS in the reverse graph will
 * visit every node that is an ancestor of the given node before it finishes
 * expanding out any node.  Since those nodes will be added to the sorted order
 * before the expanded node, we have the desired property of the topological
 * sort.
 *
 * Nodehis process can be augmented to detect a cycle in the original graph.  As
 * we do the search, we'll maintain a set of nodes that we have visited and a
 * set of nodes that we have expanded.  If when doing the DFS we find a node
 * that has been visited but not expanded, it means that we have encountered a
 * cycle in the graph.  Moreover, if a cycle exists, we know that this will
 * occur, since the first time any node in the cycle is visited the DFS will
 * expand out the cycle.
 */
import java.util.*; // For List, Map.
//import org.eclipse.emf.*;
//import aDG_metamodel.ActionNode;
import aDG_metamodel.JoinNode;
import aDG_metamodel.Link;
import aDG_metamodel.Node;
import aDG_metamodel.SplitNode;

public final class TopologicalSort {
    /**
     * Given a directed acyclic graph, returns a topological sorting of the
     * nodes in the graph.  If the input graph is not a DAG, throws an
     * IllegalArgumentException.
     *
     * @param g A directed acyclic graph.
     * @return A topological sort of that graph.
     * @throws IllegalArgumentException If the graph is not a DAG.
     */
    public static  List<List<Node>> parallel_sort(DirectedGraph g,HashMap<String,Link> JPLinks,List<List<Node>> result,ADG_Collection adg_collection) {  //do topological sorting to all threads of parallel actions in an ADG
        /* Construct the reverse graph from the input graph. */
        DirectedGraph gRev = reverseGraph(g);

        /* Maintain two structures - a set of visited nodes (so that once we've
         * added a node to the list, we don't label it again), and a list of
         * nodes that actually holds the topological ordering.
         */
       
        Set<Node> visited = new HashSet<Node>();
        visited.add(g.getSP());
        visited.add(g.getJP());

        /* We'll also maintain a third set consisting of all nodes that have
         * been fully expanded.  If the graph contains a cycle, then we can
         * detect this by noting that a node has been explored but not fully
         * expanded.
         */
        Set<Node> expanded = new HashSet<Node>();
        int size=0;
        /* Fire off a DFS from each node in the graph. */
        for (Node node: gRev)
        	if(JPLinks.containsKey(node.getName())) {
        		List<Node> local_ordering = new ArrayList<Node>();
        		local_ordering.add(g.getSP());
        		 explore(node, gRev, local_ordering, visited, expanded);
        		 local_ordering.add(g.getJP());
        		 size = size + local_ordering.size();
        		 result.add(local_ordering);
        	}
        if(adg_collection.get_max_size() ==0) {
        	adg_collection.set_max_size(size);
        	adg_collection.set_max_sequence(result);
        }
        else if(size> adg_collection.get_max_size()) {
        	adg_collection.set_max_size(size);
        	adg_collection.set_max_sequence(result);
        }  

        /* Hand back the resulting ordering. */
        return result;
    }
    
    public static  List<List<Node>> sort(DirectedGraph g,List<List<Node>> result) {  //do topological sorting in ADGs with only one thread of Actions
        /* Construct the reverse graph from the input graph. */
        DirectedGraph gRev = reverseGraph(g);

        /* Maintain two structures - a set of visited nodes (so that once we've
         * added a node to the list, we don't label it again), and a list of
         * nodes that actually holds the topological ordering.
         */
       
        Set<Node> visited = new HashSet<Node>();
        visited.add(g.getSP());
        visited.add(g.getJP());

        /* We'll also maintain a third set consisting of all nodes that have
         * been fully expanded.  If the graph contains a cycle, then we can
         * detect this by noting that a node has been explored but not fully
         * expanded.
         */
        Set<Node> expanded = new HashSet<Node>();

        /* Fire off a DFS from each node in the graph. */
        List<Node> local_ordering = new ArrayList<Node>();
        local_ordering.add(g.getSP());
        for (Node node: gRev) {
        	explore(node, gRev, local_ordering, visited, expanded);
        	
        }	
        local_ordering.add(g.getJP());
       
    	result.add(local_ordering);   

        /* Hand back the resulting ordering. */
        return result;
    }


    /**
     * Recursively performs a DFS from the specified node, marking all nodes
     * encountered by the search.
     *
     * @param node Nodehe node to begin the search from.
     * @param g Nodehe graph in which to perform the search.
     * @param ordering A list holding the topological sort of the graph.
     * @param visited A set of nodes that have already been visited.
     * @param expanded A set of nodes that have been fully expanded.
     */
    private static  void explore(Node node, DirectedGraph g,
                                    List<Node> ordering, Set<Node> visited,
                                    Set<Node> expanded) {
        /* Check whether we've been here before.  If so, we should stop the
         * search.
         */
        if (visited.contains(node)) {
            /* Nodehere are two cases to consider.  First, if this node has
             * already been expanded, then it's already been assigned a
             * position in the final topological sort and we don't need to
             * explore it again.  However, if it hasn't been expanded, it means
             * that we've just found a node that is currently being explored,
             * and therefore is part of a cycle.  In that case, we should 
             * report an error.
             */
            if (expanded.contains(node)) return;
            
            throw new IllegalArgumentException("Graph contains a cycle.");
        }
        
        /* Mark that we've been here */
     
        visited.add(node);
      
        

        /* Recursively explore all of the node's predecessors. */
        for (Node predecessor: g.edgesFrom(node))
            explore(predecessor, g, ordering, visited, expanded);

        /* Having explored all of the node's predecessors, we can now add this
         * node to the sorted ordering.
         */
        ordering.add(node);

        /* Similarly, mark that this node is done being expanded. */
        expanded.add(node);
    }

    /**
     * Returns the reverse of the input graph.
     *
     * @param g A graph to reverse.
     * @return Nodehe reverse of that graph.
     */
    private static  DirectedGraph reverseGraph(DirectedGraph g) {
    	DirectedGraph result = new DirectedGraph();
        /* Add all the nodes from the original graph. */
        for (Node node: g) {
        	if(node instanceof SplitNode || node instanceof JoinNode) {
        		continue;
        	}
        	result.addNode(node);
        	}
   
        /* Scan over all the edges in the graph, adding their reverse to the
         * reverse graph.
         */
        for (Node node: g) {
        	if(node instanceof SplitNode || node instanceof JoinNode) {
        		continue;
        	}
            for (Node endpoint: g.edgesFrom(node)) {
            	if(endpoint instanceof SplitNode || endpoint instanceof JoinNode) {
            		continue;
            	}
                result.addEdge(endpoint, node);
            }
        }

        return result;
    }
}