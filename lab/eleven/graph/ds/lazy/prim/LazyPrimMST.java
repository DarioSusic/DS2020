package lab.eleven.graph.ds.lazy.prim;

import lab.eleven.graph.ds.edge.weighted.graph.Edge;
import lab.eleven.graph.ds.edge.weighted.graph.EdgeWeightedGraph;
import lab.eleven.graph.ds.min.pq.MinPQ;
import lab.eleven.graph.ds.queue.regular.Queue;

public class LazyPrimMST {
	
	private boolean[] marked;	// MST vertices
	private Queue<Edge> mst;	// MST edges
	private MinPQ<Edge> pq;		// crossing (and ineligible) edges
	
	/* Perform the lazy Prim's algorithm */
	public LazyPrimMST(EdgeWeightedGraph G) {
		pq = new MinPQ<Edge>();
		marked = new boolean[G.V()];
		mst = new Queue<Edge>();
		
		visit(G, 0);				// start the algorithm from vertex 0
		while (!pq.isEmpty()) {		// iterate over the min-queue
			Edge e = pq.delMin();	// get the edge with the lowest weight
			int v = e.either();		// extract one vertex
			int w = e.other(v);		// extract the other vertex
			
			if (marked[v] && marked[w]) {	// if both vertices are already marked,
				continue;					// skip them, as they are ineligible
			}
			
			mst.enqueue(e);			// otherwise, add the edge to the MST
			if (!marked[v]) {		// if vertex v is not in the tree,
				visit(G, v);		// move to vertex v
			}
			if (!marked[w]) {		// if vertex w is not in the tree,
				visit(G, w);		// move to vertex w
			}
		}
	}
	
	/* Visit adjacent vertices and add them to the min-queue */
	private void visit(EdgeWeightedGraph G, int v) {
		marked[v] = true;					// mark the vertex you are currently on
		for (Edge e: G.adj(v)) {			// iterate over adjacent vertices
			if (!marked[e.other(v)]) {		// if the other end of the edge in not in the MST
				pq.insert(e);				// insert that edge into the min-queue
			}
		}
	}
	
	/* Get a list of MST edges */
	public Iterable<Edge> edges() {
		return mst;
	}
	
	/* Get the weight of the MST */
	public double weight() {
		double total = 0;			// initialize
		for (Edge e: mst) {			// iterate over all MST edges
			total += e.weight();	// sum weights together
		}
		return total;				// output the weight
	}

}
