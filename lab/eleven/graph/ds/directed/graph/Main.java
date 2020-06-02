package lab.eleven.graph.ds.directed.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		/* Read a digraph from a file */
		Digraph dg = new Digraph(new Scanner(new File("/home/aldin-sxr/Downloads/tinyDG.txt")));
		
		System.out.println("Number of vertices: " + dg.V());	// 13
		System.out.println("Number of edges: " + dg.E());		// 22
		
		/* See adjacent vertices of vertex 0 */
		/* Expected: 1, 5 */
		System.out.println("Adjacent vertices of 0: ");
		Iterable<Integer> vertices1 = dg.adj(0);
		for (Integer v: vertices1) {
			System.out.println(v);
		}
		
		/* Reverse the graph */
		Digraph rg = dg.reverse();
		
		/* See adjacent vertices of vertex 0 */
		/* Expected: 2, 6 */
		System.out.println("Adjacent vertices of 0 (reversed): ");
		Iterable<Integer> vertices2 = rg.adj(0);
		for (Integer v: vertices2) {
			System.out.println(v);
		}
	}

}

