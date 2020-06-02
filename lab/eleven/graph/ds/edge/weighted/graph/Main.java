package lab.eleven.graph.ds.edge.weighted.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		/* Read a digraph from a file */
		EdgeWeightedGraph ewg = new EdgeWeightedGraph(
				new Scanner(new File("/home/aldin-sxr/Downloads/tinyEWG.txt")));
		
		System.out.println("Number of vertices: " + ewg.V());	// 8
		System.out.println("Number of edges: " + ewg.E());		// 16
		
		/* See adjacent vertices of vertex 0 */
		/* Expected: 7, 4, 2, 6 */
		System.out.println("Adjacent vertices of 0: ");
		Iterable<Edge> vertices = ewg.adj(0);
		for (Edge e: vertices) {
			System.out.println(e.other(0) + ": " + e.weight());
		}
		
	}

}

