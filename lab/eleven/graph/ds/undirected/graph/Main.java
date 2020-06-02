package lab.eleven.graph.ds.undirected.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		/* Manually create a graph */
		Graph g1 = new Graph(5);
		g1.addEdge(1, 0);	
		g1.addEdge(1, 2);
		g1.addEdge(2, 0);
		g1.addEdge(0, 3);
		g1.addEdge(3, 4);
		
		System.out.println("Number of vertices: " + g1.V());	// 5
		System.out.println("Number of edges: " + g1.E());		// 5
		
		/* See adjacent vertices of vertex 0 */
		/* Expected: 1, 2, 3 */
		System.out.println("Adjacent vertices of 0 (manual): ");
		Iterable<Integer> vertices1 = g1.adj(0);
		for (Integer v: vertices1) {
			System.out.println(v);
		}
		
		System.out.println();
		
		/* Read a graph from a file */
		Graph g2 = new Graph(new Scanner(new File("/home/aldin-sxr/Downloads/tinyG.txt")));
		
		System.out.println("Number of vertices: " + g2.V());	// 13
		System.out.println("Number of edges: " + g2.E());		// 13
		
		/* See adjacent vertices of vertex 0 */
		/* Expected: 5, 1, 2, 6 */
		System.out.println("Adjacent vertices of 0 (file): ");
		Iterable<Integer> vertices2 = g2.adj(0);
		for (Integer v: vertices2) {
			System.out.println(v);
		}
	}

}

