package homework.one.queue.linkedlist;

import java.util.NoSuchElementException;

public class Queue<Item> {
	private final Queue<Item> Item = null;
	Node<Item> head;
	Node<Item> tail;
	private int length = 0;
	
	//FIFO
	public void enqueue(Item item) {
		Node<Item> newNode = new Node<Item>();
		newNode.data = item;
		if (this.tail == null) {
			this.tail = this.head = newNode;
		} else {
			this.tail.next = newNode;
			this.tail = newNode;
		}
		length++;
	}
	
	public Item dequeue(){
		Item item = null;
		if (this.head == null) {
			throw new NoSuchElementException("Queue is empty");
		} else if (length == 1) {
			item = this.head.data;
			this.head = this.tail = null;
		} else {
			item = this.head.data;
			this.head = this.head.next;
		}
		length--;
		return item;
	}
	
	public int size() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}

}
