package lab.two.queue.linkedlist;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		
		
		queue.enqueue(1);
		queue.dequeue();
		System.out.println("queue size: " + queue.size());
	}

}
