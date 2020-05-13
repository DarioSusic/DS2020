package homework.eight.heapsort;

public class HeapSort {
	
	/* Heap sort algorithm */
	public static void sort(IPAddress[] arrObjects) {
		BinaryHeap<IPAddress> heap = new BinaryHeap<IPAddress>();	// 1
		
		for (int i = 0; i < arrObjects.length; i++) {				// 2
			heap.insert(arrObjects[i]);							// 2
		}
		
		for (int i = arrObjects.length - 1; i >= 0; i--) {		// 3
			arrObjects[i] = heap.delMax();						// 3
		}
	}
}
