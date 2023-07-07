
public interface QueueInterface <H> {
	void enqueue(H data);
	H getFront();
	H dequeue();
	boolean isEmpty();
	void clear();


}
