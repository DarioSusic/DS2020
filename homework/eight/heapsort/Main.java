package homework.eight.heapsort;

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
		HeapSort.sort(arrObjects);
		System.out.println(
				"Time elapsed for Binary Heap Sort: " + (System.currentTimeMillis() - start) + " ms\n");
		CSVReader.writeCSV(arrObjects, "BHS");
		
		//Time elapsed for Binary Heap Sort: 7857 ms
	}
}
