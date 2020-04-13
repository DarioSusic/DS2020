package homework.six.quicksort;

public abstract class AbstractSort {
	
	/* Returns whether the first element is less than the second one */
	public static boolean less(long v, long w) {
		return v < w;
	}
	
	/* Swaps the two elements in an array */
	public static void swap (IPAddress[] arrObjects, int a, int b) {
		IPAddress tmp = arrObjects[a];
		arrObjects[a] = arrObjects[b];
		arrObjects[b] = tmp;
	}

}


