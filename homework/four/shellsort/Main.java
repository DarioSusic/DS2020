package homework.four.shellsort;

import java.io.IOException;
import java.util.ArrayList;

import homework.helperclass.*;

public class Main {

	public static void main(String[] args) throws IOException {
String path = "C:\\Users\\Dario Susic\\Desktop\\IP-COUNTRY-REGION-CITY-SHUFFLED.csv";
		
		ArrayList<IPAddress> ipList = new ArrayList<>();
		CSVReader.readCSV(path, ipList);
		
		IPAddress[] arrObjects = ipList.toArray(new IPAddress[0]);
		
		long start = System.currentTimeMillis();
		ShellSort.sort(arrObjects);
		System.out.println("Time elapsed for Shell Sort: " + (System.currentTimeMillis() - start) + " ms\n");
		
		CSVReader.writeCSV(arrObjects, "SHELL");

	}

}
