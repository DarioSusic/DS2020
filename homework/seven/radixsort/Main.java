package homework.seven.radixsort;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Dario Susic\\Desktop\\IP-COUNTRY-REGION-CITY-SHUFFLED.csv";
		long start;
		
		ArrayList<IPAddress> ipList = new ArrayList<>();
		CSVReader.readCSV(path, ipList);
		IPAddress[] arrObjects = ipList.toArray(new IPAddress[ipList.size()]);
		
		start = System.currentTimeMillis();
		RadixSort.sort(arrObjects);
		System.out.println(
				"Time elapsed for Radix Sort: " + (System.currentTimeMillis() - start) + " ms\n");
		CSVReader.writeCSV(arrObjects, "RADIX-SORT");
		
		//Time elapsed for Radix Sort: 13594 ms
	}
}
