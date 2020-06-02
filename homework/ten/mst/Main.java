package homework.ten.mst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import lab.eleven.graph.ds.edge.weighted.graph.Edge;
import lab.eleven.graph.ds.edge.weighted.graph.EdgeWeightedGraph;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		/* Read a digraph from a file */
		EdgeWeightedGraph ewg = new EdgeWeightedGraph(
				new Scanner(new File("C:\\Users\\Dario Susic\\Desktop\\10000EWG.txt")));
		
		/* Instantiate the lazy Prim's algorithm */
		KruskalMST kruskal = new KruskalMST(ewg);
		
		/* Print out MST edges*/
		Iterable<Edge> edges = kruskal.edges();
		for (Edge e: edges) {
			System.out.println("(" + 
					e.either() + ", " + 
					e.other(e.either()) + ") - " + e.weight());
		}
		
		/* Print out MST weight */
		System.out.println("MST weight: " + kruskal.weight());
	}

}
