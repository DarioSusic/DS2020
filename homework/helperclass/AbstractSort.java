package homework.helperclass;

public abstract class AbstractSort {
	public static boolean less(IPAddress arrObjects, IPAddress arrObjects2) {
		return arrObjects.getIpFrom() < arrObjects2.getIpFrom();
	}
	
	public static void swap(IPAddress[] arrObjects, int i, int b) {
		IPAddress temp = arrObjects[i];
		arrObjects[i] = arrObjects[b];
		arrObjects[b] = temp;
	}
}
