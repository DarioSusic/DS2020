package lab.three.binarysearch;

public class Main {

	public static void main(String[] args) {
		//Sorted array
		int[] elements = {3, 4, 5, 11, 14, 19, 21, 26, 33, 49, 56, 71, 74, 89, 90, 98, 100};
		int[] elements2 = {0, 1, 2, 3, 4};
		
		int index = BinarySearch.search(elements, 19);
		System.out.println("index: " + index);
		
		int index2 = BinarySearch.search(elements, 42);
		System.out.println("index: " + index2);
		
		int index3 = BinarySearch.search(elements2, 1);
		System.out.println("index: " + index3);
	}

}
