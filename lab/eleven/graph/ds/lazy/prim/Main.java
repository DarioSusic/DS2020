package lab.eleven.graph.ds.lazy.prim;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import lab.eleven.graph.ds.edge.weighted.graph.Edge;
import lab.eleven.graph.ds.edge.weighted.graph.EdgeWeightedGraph;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		/* Read a digraph from a file */
		EdgeWeightedGraph ewg = new EdgeWeightedGraph(
				new Scanner(new File("/home/aldin-sxr/Downloads/tinyEWG.txt")));
		
		/* Instantiate the lazy Prim's algorithm */
		LazyPrimMST prim = new LazyPrimMST(ewg);
		
		/* Print out MST edges*/
		Iterable<Edge> edges = prim.edges();
		for (Edge e: edges) {
			System.out.println("(" + 
					e.either() + ", " + 
					e.other(e.either()) + ") - " + e.weight());
		}
		
		/* Print out MST weight */
		System.out.println("MST weight: " + prim.weight());
	}

}
