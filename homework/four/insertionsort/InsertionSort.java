package homework.four.insertionsort;

import homework.helperclass.*;

public class InsertionSort extends AbstractSort{
	public static void sort(IPAddress[] arrObjects) {
		for (int i = 0; i < arrObjects.length; i++) {
			for (int j = i; j > 0; j--) {
				if (less(arrObjects[j], arrObjects[j-1])) {
					swap(arrObjects, j, j-1);
				} else {
					break;
				}
			}
		}
	}
}
