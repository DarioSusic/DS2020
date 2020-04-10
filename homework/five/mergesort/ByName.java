package homework.five.mergesort;

import java.util.Comparator;

public class ByName implements Comparator<IPAddress> {

	@Override
	public int compare(IPAddress ipAddress1, IPAddress ipAddress2) {
		return ipAddress1.getCityName().compareTo(ipAddress2.getCityName());
	}

}
