package homework.six.quicksort;

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
		QuickSort.sort(arrObjects);
		System.out.println(
				"Time elapsed for Quick Sort: " + (System.currentTimeMillis() - start) + " ms\n");
		CSVReader.writeCSV(arrObjects, "QUICK-SORT");
		
		
	}
}
