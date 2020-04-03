package homework.three;

public class BinarySearch {
	public static IPAddress search(IPAddress[] elements, long key) {
		int low = 0;
		int high = elements.length - 1;
		
		while (low <= high) {
			int mid = low + (high - low) / 2;
			
			if (key < elements[mid].getIpFrom()) {
				high = mid - 1;
			} else if (key > elements[mid].getIpTo()) {
				low = mid + 1;
			} else {
				return elements[mid];
			}
		}
		return null;
	}

}
