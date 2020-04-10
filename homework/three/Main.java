package homework.three;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) throws IOException {
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter 1 for bubble sort 2 for Binary Search: ");
		
		String text = sc.nextLine();
		
		switch (Integer.parseInt(text)) {
		case 1:
			String path = "C:\\Users\\Dario Susic\\Desktop\\IP-COUNTRY-REGION-CITY-SHUFFLED1000.csv";
			
			ArrayList<IPAddress> ipList = new ArrayList<>();
			CSVReader.readCSV(path, ipList);
			
			IPAddress[] arrObjects = ipList.toArray(new IPAddress[0]);
			
			long start = System.currentTimeMillis();
			BubbleSort.sort(arrObjects);
			System.out.println("Time elapsed for BubbleSort: " + (System.currentTimeMillis() - start) + " ms\n");
			
			CSVReader.writeCSV(path, arrObjects);
			break;
		case 2:
			System.out.print("Enter IP address to find in format 1.33.16.1 : ");
			//String ipNumberToSplit = "1.33.16.1";
			String ipNumberToSplit = sc.nextLine();
			long key = IPConverter.ip2number(ipNumberToSplit);
			String pathForSearch = "C:\\Users\\Dario Susic\\Desktop\\IP-COUNTRY-REGION-CITY-SORTED.csv";
			ArrayList<IPAddress> sortedIPList = new ArrayList<>();
			CSVReader.readCSV(pathForSearch, sortedIPList);
			
			IPAddress[] sortedArrObjects = sortedIPList.toArray(new IPAddress[0]);
			
			System.out.println(BinarySearch.search(sortedArrObjects, key));
		default:
			break;
		}
		
	}

}
