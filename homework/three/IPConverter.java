package homework.three;

public class IPConverter {
	public static long ip2number(String ipNumberToSplit) {
		long value = 0;
		int ipRange = 1;
		
		String[] tempArray;
        String delimiter = "\\.";
        
        tempArray = ipNumberToSplit.split(delimiter);
             
        for (int i = tempArray.length - 1; i >= 0; i--) {
			value += Long.parseLong(tempArray[i]) * ipRange;
			ipRange *= 256;
		}
        return value;
	}
	
	public static void number2ip(long ipNumber) {
		
	}
}
