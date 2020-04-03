package lab.four.elementary.sort;

public abstract class AbstractSort {
	public static boolean less(int a, int b) {
		return a < b;
	}
	
	public static void swap(int[] elements, int i, int b) {
		int temp = elements[i];
		elements[i] = elements[b];
		elements[b] = temp;
	}
}
