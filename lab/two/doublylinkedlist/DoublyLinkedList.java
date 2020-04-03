package lab.two.doublylinkedlist;

import java.util.Iterator;


public class DoublyLinkedList<Item> implements Iterable<Item> {
	Node<Item> head;
	Node<Item> tail;
	int size = 0;
	
	public void addToFront(Item item) {
		Node<Item> newNode = new Node<Item>();
		newNode.data = item; 					
		newNode.next = head;
		newNode.prev = null;
		if (size == 0) {
			tail = newNode;
		} else {
			head.prev = newNode;
		}
		head = newNode; 					
		size++;	
	}
	
	public void addToRear(Item item) {
		Node<Item> newNode = new Node<Item>();		
		newNode.data = item;
		newNode.prev = tail;
		newNode.next = null;
			
		if (tail == null) {							
			head = newNode;
		} else {			
			tail.next = newNode;
		}
		tail = newNode;
		size++;	
	}
	
	public void removeFromFront() {
		if (head == null) {														// 1
			throw new IndexOutOfBoundsException("The linked list is empty.");	// 1
		}																		// 1
		head = head.next;
		head.prev = null;
		size--;		
	}
	
	public void removeFromRear() {
		if (head == null) {														// 1
			throw new IndexOutOfBoundsException("The linked list is empty.");	// 1
		} else if(size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			tail = tail.prev;
			tail.next = null;
			size--;
		}
	}
	
	public int count() {
		return size;
	}

	private class DoublyLinkedListIterator implements Iterator<Item> { 		// 1
		Node<Item> current = head;										// 2
		
		public boolean hasNext() {										// 3
			return current != null;
		}																// 3
			
		public Item next() {											// 4
			Item item = current.data;									// 4
			current = current.next;										// 4
			return item;												// 4
		}
	}
	
	@Override
	public Iterator<Item> iterator() {
		return new DoublyLinkedListIterator();
	}

}
