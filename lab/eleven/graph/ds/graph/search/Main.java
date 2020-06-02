package lab.eleven.graph.ds.graph.search;

import lab.eleven.graph.ds.undirected.graph.Graph;

public class Main {

	public static void main(String[] args) {
		
		/* Create a graph */
		Graph g = new Graph(6);
		g.addEdge(0, 5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(5, 3);
		g.addEdge(3, 2);
		g.addEdge(4, 2);
		
		GraphSearch gs = new GraphSearch(g);
		
		/* Traverse over the graph using DFS */
		System.out.print("DFS: ");
		gs.dfs(0);
		
		/* Reset the search */
		System.out.println();
		gs.reset();

		/* Traverse over the graph using BFS*/
		System.out.print("BFS: ");
		gs.bfs(0);

	}

}
