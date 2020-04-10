package homework.five.mergesort;

public class RecursiveMergeSort extends AbstractSort {
	public static void sort(IPAddress[] arrObjects) {
		IPAddress[] aux = new IPAddress[arrObjects.length];
		sort(arrObjects, aux, 0, arrObjects.length - 1);
	}
	
	private static void sort(IPAddress[] elements, IPAddress[] aux, int low, int high) {
		if (high <= low) {                              // 1
            return;                                     // 1
        }
       
        int mid = low + (high - low) / 2;               // 2
        sort(elements, aux, low, mid);                  // 3
        sort(elements, aux, mid + 1, high);             // 3
        merge(elements, aux, low, mid, high);           // 4
	}

	 private static void merge(IPAddress[] elements, IPAddress[] aux, int low, int mid, int high) {
	       
	        for (int k = low; k <= high; k++) {             // 1
	            aux[k] = elements[k];                       // 1
	        }          
	       
	        int i = low;                                    // 2
	        int j = mid + 1;                                // 2
	        for (int k = low; k <= high; k++) {             // 3
	            if (i > mid) {                              // 4
	                elements[k] = aux[j++];                 // 4
	            } else if (j > high) {                      // 5
	                elements[k] = aux[i++];                 // 5
	            } else if (less(aux[j].getIpFrom(), aux[i].getIpFrom())) {          // 6
	                elements[k] = aux[j++];                 // 6
	            } else {                                    // 7
	                elements[k] = aux[i++];                 // 7
	            }
	        }
	    }
}
