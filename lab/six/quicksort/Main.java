package lab.six.quicksort;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] elements = new int[100];
	    Random random = new Random();
		
		/* Generate random elements */
		for (int i = 0; i < elements.length; i++) {
			elements[i] = random.nextInt(1000);
		}
		
		/* Sort the array */
		QuickSort.sort(elements);
		
		/* Print the elements */
		for (int i: elements) {
			System.out.println(i);
		}
	}

}

