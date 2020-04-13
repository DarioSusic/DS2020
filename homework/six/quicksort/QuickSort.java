package homework.six.quicksort;

import java.util.Random;

public class QuickSort extends AbstractSort {
	
	/* Quick sort algorithm (public invocation) */
	public static void sort(IPAddress[] arrObjects) {
		shuffle(arrObjects);								// 1
		sort(arrObjects, 0, arrObjects.length - 1);			// 2
	}
	
	/* Knuth shuffle (performance guarantee) */
	private static void shuffle(IPAddress[] arrObjects) {
		Random rand = new Random();								// 1
		for (int i = 0; i < arrObjects.length; i++) {				// 2
			int r = i + rand.nextInt(arrObjects.length - i);		// 2
			swap(arrObjects, i, r);								// 3
		}
	}
	
	/* Recursive quick sort logic */
	private static void sort(IPAddress[] arrObjects, int low, int high) {
		if (high <= low) {								// 1
			return;										// 1
		}
		int j = partition(arrObjects, low, high);			// 2
		sort(arrObjects, low, j - 1);						// 3
		sort(arrObjects, j + 1, high);					// 3
	}
	
	/* Partition an array and return the pivot index */
	private static int partition(IPAddress[] arrObjects, int low, int high) {
		int i = low;											// 1
		int j = high + 1;										// 1
		while (true) {											// 2
			while (less(arrObjects[++i].getIpFrom(), arrObjects[low].getIpFrom())) {		// 3
				if (i == high) {								// 3
					break;										// 3
				}
			}
			while (less(arrObjects[low].getIpFrom(), arrObjects[--j].getIpFrom())) {		// 4
				if (j == low) {									// 4
					break;										// 4
				}
			}
			if (i >= j) {										// 5
				break;											// 5
			}
			swap(arrObjects, i, j);								// 6
		}
		swap(arrObjects, low, j);									// 7
		return j;												// 7
	}
}



