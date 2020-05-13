package lab.eight.heap.sort;

import lab.eight.binary.heap.BinaryHeap;

public class HeapSort {
	
	/* Heap sort algorithm */
	public static void sort(int [] elements) {
		BinaryHeap<Integer> heap = new BinaryHeap<Integer>();	// 1
		
		for (int i = 0; i < elements.length; i++) {				// 2
			heap.insert(elements[i]);							// 2
		}
		
		for (int i = elements.length - 1; i >= 0; i--) {		// 3
			elements[i] = heap.delMax();						// 3
		}
	}
}
