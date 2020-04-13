package lab.five.mergesort;

public abstract class AbstractSort {
	public static boolean less(long v, long w) {
		return v < w;
	}
	
	public static void swap(int[] elements, int a, int b) {
		int temp = elements[a];
		elements[a] = elements [b];
		elements[b] = temp; 
	}
}
