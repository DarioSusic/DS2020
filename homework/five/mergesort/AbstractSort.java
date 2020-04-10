package homework.five.mergesort;

public abstract class AbstractSort {
	public static boolean less(long v, long w) {
		return v < w;
	}
	
	public static void swap(IPAddress[] elements, int a, int b) {
		IPAddress temp = elements[a];
		elements[a] = elements [b];
		elements[b] = temp; 
	}
}
