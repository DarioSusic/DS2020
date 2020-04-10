package homework.one.queue.linkedlist;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		
		
		queue.enqueue(1);
		queue.enqueue(12);
		queue.enqueue(3);
		queue.dequeue();
		queue.dequeue();
		System.out.println("queue size: " + queue.size());
		
		System.out.println(queue.dequeue());
	}

}
