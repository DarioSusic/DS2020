package homework.five.mergesort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Dario Susic\\Desktop\\IP-COUNTRY-REGION-CITY-SHUFFLED100K.csv";
		long start;
		
		ArrayList<IPAddress> ipList = new ArrayList<>();
		CSVReader.readCSV(path, ipList);
		IPAddress[] arrObjects = ipList.toArray(new IPAddress[ipList.size()]);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter: \n1. for recursive merge sort, \n2. for Bottom Up Merge Sort, \n3. to sort by city name: ");
		String text = sc.nextLine();

		switch (Integer.parseInt(text)) {
		case 1:
			start = System.currentTimeMillis();
			RecursiveMergeSort.sort(arrObjects);
			System.out.println(
					"Time elapsed for Recursive Merge Sort: " + (System.currentTimeMillis() - start) + " ms\n");
			CSVReader.writeCSV(arrObjects, "RECURSIVE-MERGE");
			arrObjects = null;
			break;
		case 2:
			start = System.currentTimeMillis();
			BottomUpMergeSort.sort(arrObjects);
			System.out.println(
					"Time elapsed for Bottom UP Merge Sort: " + (System.currentTimeMillis() - start) + " ms\n");
			CSVReader.writeCSV(arrObjects, "BOTTOMUP-MERGE");
			arrObjects = null;
			break;
		case 3:
			start = System.currentTimeMillis();
			Arrays.sort(arrObjects, new ByName());
			System.out.println(
					"Time elapsed to compare by CityName: " + (System.currentTimeMillis() - start) + " ms\n");
			CSVReader.writeCSV(arrObjects, "BYCITYNAME");
			arrObjects = null;
			break; 
		default:
			System.out.println("Wrong choice");
			ipList = null;
			arrObjects = null;
			break;
		}
	}
}
