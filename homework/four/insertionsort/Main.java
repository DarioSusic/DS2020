package homework.four.insertionsort;

import java.io.IOException;
import java.util.ArrayList;

import homework.helperclass.*;

public class Main {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Dario Susic\\Desktop\\IP-COUNTRY-REGION-CITY-SHUFFLED100K.csv";
		
		ArrayList<IPAddress> ipList = new ArrayList<>();
		CSVReader.readCSV(path, ipList);
		
		IPAddress[] arrObjects = ipList.toArray(new IPAddress[ipList.size()]);
		
		long start = System.currentTimeMillis();
		InsertionSort.sort(arrObjects);
		System.out.println("Time elapsed for Insertion Sort: " + (System.currentTimeMillis() - start) + " ms\n");
		
		CSVReader.writeCSV(arrObjects, "INSERTION");

	}

}
