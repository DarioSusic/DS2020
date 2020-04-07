package homework.five.mergesort;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Dario Susic\\Desktop\\IP-COUNTRY-REGION-CITY-SHUFFLED100K.csv";
		
		ArrayList<IPAddressComparator> ipList = new ArrayList<>();
		CSVReader.readCSV(path, ipList);
		
		IPAddressComparator[] arrObjects = ipList.toArray(new IPAddressComparator[0]);
		
		long start = System.currentTimeMillis();
		MergeSort.recursiveMergeSort(arrObjects);
		System.out.println("Time elapsed for Insertion Sort: " + (System.currentTimeMillis() - start) + " ms\n");
		
		CSVReader.writeCSV(arrObjects, "INSERTION");
		
	}

}
