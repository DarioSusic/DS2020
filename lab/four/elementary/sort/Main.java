package lab.four.elementary.sort;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		long start;
		long end;
		int arrSize = 20;
		
		int[] elements = new int[arrSize];
		Random random = new Random();
		
		for (int i = 0; i < elements.length; i++) {
			elements[i] = random.nextInt(100);
		}
		
		int[] selectionElements = elements.clone();
		int[] insertionElements = elements.clone();
		int[] shellElements = elements.clone();
		
		
		start = System.currentTimeMillis();
		SelectionSort.sort(selectionElements);
		end = System.currentTimeMillis();
		System.out.println("Selection sorting ended in: \t"+ (end - start) +"ms \n");
		
		
		start = System.currentTimeMillis();
		InsertionSort.sort(insertionElements);
		end = System.currentTimeMillis();
		System.out.println("Insertion sorting ended in: \t"+ (end - start) +"ms \n");
		
		
		start = System.currentTimeMillis();
		ShellSort.sort(shellElements);
		end = System.currentTimeMillis();
		System.out.println("Shell sorting ended in: \t"+ (end - start) +"ms \n");
	}

}
