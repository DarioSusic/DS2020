package homework.five.mergesort;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CSVReader{
	
	public static void readCSV(String filePath, List<IPAddress> ipList) throws IOException {
		
		Scanner scanner = new Scanner(new File(filePath));
		Scanner dataScanner = null;
		int index = 0;
		System.out.println("Loading file...");
		
		while (scanner.hasNextLine()) {
			dataScanner = new Scanner(scanner.nextLine());
			dataScanner.useDelimiter(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
			IPAddress addr = new IPAddress();
			
			while (dataScanner.hasNext()) {
				String data = dataScanner.next();
				if (index == 0)
					addr.setIpFrom(Long.parseLong(data.replace("\"", "")));
				else if (index == 1)
					addr.setIpTo(Long.parseLong(data.replace("\"", "")));
				else if (index == 2)
					addr.setCountryCode(data);
				else if (index == 3)
					addr.setCountryName(data);
				else if (index == 4)
					addr.setRegionName(data);
				else if (index == 5)
					addr.setCityName(data);
				else
					System.out.println("Invalid data: " + data);
				index++;
			}
			index = 0;
			ipList.add(addr);
		}
		System.out.println("File Loaded...\n");
		scanner.close();
	}
		
	public static void writeCSV(IPAddress[] sortedAddress, String fileName) {
		//final String FILE_HEADER = "START IP,END IP,COUNTRY CODE,COUNTRY,REGION,CITY";
        final String NEW_LINE_SEPARATOR = "\n";
        final String COMMA_DELIMITER = ",";
        final String FILE_PATH = "C:\\Users\\Dario Susic\\Desktop\\IP-COUNTRY-REGION-CITY-SORTED-"+fileName+".csv";
                
        try {
			FileWriter writer = new FileWriter(FILE_PATH);
			System.out.println("Writing file...\n");
			
		    for (IPAddress ipAddress : sortedAddress) {
		    	writer.append(String.valueOf(ipAddress.getIpFrom()));
                writer.append(COMMA_DELIMITER);
                writer.append(String.valueOf(ipAddress.getIpTo()));
                writer.append(COMMA_DELIMITER);
                writer.append(ipAddress.getCountryCode());
                writer.append(COMMA_DELIMITER);
                writer.append(ipAddress.getCountryName());
                writer.append(COMMA_DELIMITER);
                writer.append(ipAddress.getRegionName());
                writer.append(COMMA_DELIMITER);
                writer.append(ipAddress.getCityName());
                writer.append(COMMA_DELIMITER);
                writer.append(NEW_LINE_SEPARATOR);
			}
		    
		    System.out.println("CSV file was created successfully !!!");
		    writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
