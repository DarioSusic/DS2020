package homework.one.stack.array;

import java.util.NoSuchElementException;

public class Stack<Item> {
	@SuppressWarnings("unchecked")
	private Item[] q = (Item[]) new Object[1];
	private int length = 0;

	public void push(Item item) {
		// increase size of array if necessary
		if (length == q.length) {
			resize(2 * q.length);
		}
		q[length++] = item;
	}
	
	public Item pop() {
		if (isEmpty()) {
			throw new NoSuchElementException("Stack underflow");
		}
		Item item = q[length - 1];
		q[length - 1] = null;
		length--;
		
		// shrink size of array if necessary
		if (length > 0 && length == q.length / 4)
			resize(q.length / 2);
		return item;
	}

	/* Create a new internal array with a given capacity */
	@SuppressWarnings("unchecked")
	private void resize(int capacity) {

		// textbook implementation
		Item[] temp = (Item[]) new Object[capacity];
		for (int i = 0; i < length; i++) {
			temp[i] = q[i];
		}
		q = temp;

	}

	/* Check if the queue is empty */
	public boolean isEmpty() {
		return length == 0;
	}

	/* Return the current size of the queue */
	public int size() {
		return length;
	}
}
