
public class Main {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>();
		queue.enqueue(50);
		queue.enqueue(70);
		queue.enqueue(60);
		System.out.println(queue.toString());
		System.out.println(queue.dequeue());
		System.out.println(queue.getFront());

	}

}
