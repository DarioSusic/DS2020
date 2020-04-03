package lab.three.bubblesort;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] elements = new int[100];
		Random random = new Random();

		/* Generate random elements */
		for (int i = 0; i < elements.length; i++) {
			elements[i] = random.nextInt(1000);
		}

		/* Sort and time */
		long start = System.currentTimeMillis();
		BubbleSort.sort(elements);
		System.out.println("elapsed: " + (System.currentTimeMillis() - start) + " ms");

		/* Print the elements */
		// for (int i: elements) {
		// System.out.println(i);
		// }

	}

}
