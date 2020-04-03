package lab.two.linkedlist;

import java.util.Iterator;

public class LinkedList<Item> implements Iterable<Item> {
	Node<Item> head;
	int size = 0;
	
	/* Add an item to the beginning of the list */
	public void addToFront(Item item) {
		Node<Item> newNode = new Node<Item>();  // 1
		newNode.data = item; 					// 1
		newNode.next = head; 					// 2
		head = newNode; 						// 3
		size++;									// 4
	}
	
	/* Remove an item from the beginning of the list */
	public void removeFromFront() {
		if (head == null) {														// 1
			throw new IndexOutOfBoundsException("The linked list is empty.");	// 1
		}																		// 1
		head = head.next;														// 2
		size--;																	// 3
	}
	
	/* Add a new item to the end of the list */
	public void addToRear(Item item) {
		Node<Item> newNode = new Node<Item>();		// 1
		newNode.data = item;						// 1
			
		if (head == null) {							// 2
			head = newNode;							// 2
		} else {			
			Node<Item> current = head;				// 3
			while (current.next != null) {			// 4
				current = current.next;				// 4
			}										// 4
			current.next = newNode;					// 5
		}
		size++;										// 6
	}
	
	/* Remove an item from the end of the list */
	public void removeFromRear() {
		if (head == null) {														// 1
			throw new IndexOutOfBoundsException("The linked list is empty.");	// 1
		} else if (size == 1) {													// 2
			head = null;														// 2
		} else {																// 3
			Node<Item> current = head;											// 3
			while (current.next.next != null) {									// 4
				current = current.next;											// 4
			}																	// 4
			current.next = null;												// 5
		}
		size--;																	// 6
	}
	
	public int count() {
		return size;
	}
	
	private class LinkedListIterator implements Iterator<Item> { 		// 1
		Node<Item> current = head;
		
		public boolean hasNext() {										// 3
			return current != null;										// 3
		}																// 3
			
		public Item next() {											// 4
			Item item = current.data;									// 4
			current = current.next;										// 4
			return item;												// 4
		}
	}
	
	@Override
	public Iterator<Item> iterator() {
		return new LinkedListIterator();
	}
	
}
