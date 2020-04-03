package lab.two.queue.linkedlist;

import java.util.NoSuchElementException;

public class Queue<Item> {
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
	
	public void dequeue(){
		if (this.head == null) {
			throw new NoSuchElementException("Queue is empty");
		} else if (length == 1) {
			this.head = this.tail = null;
		} else {
			this.head = this.head.next;
		}
		length--;
	}
	
	public int size() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}

}
