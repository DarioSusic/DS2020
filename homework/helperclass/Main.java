package homework.helperclass;

import homework.three.IPConverter;

public class Main {

	public static void main(String[] args) {
		String ipNumberToSplit = "202.186.13.4";
        
		long number = IPConverter.ip2number(ipNumberToSplit);
        
        System.out.println(number);
		
	}
}
