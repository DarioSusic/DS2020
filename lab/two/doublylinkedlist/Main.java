package lab.two.doublylinkedlist;
public class Main {

	public static void main(String[] args) {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		
		list.addToFront(5);
		list.addToRear(3);
		list.removeFromRear();

		
		
		for (Integer i: list) {
			System.out.println(i);
		}
		
		System.out.println("list size: " + list.count());

	}

}
