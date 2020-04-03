package lab.four.elementary.sort;

import java.util.Random;

public class ShuffleArray {
	static Random rand = new Random();
	
	public static void shuffle(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int randomIndexToSwap = rand.nextInt(array.length);
			int temp = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = temp;
		}
	}
}
