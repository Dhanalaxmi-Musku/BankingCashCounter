
public class Queue <T>{
	 private LinkedList<T> list;
	    public Queue() {
	        list = new LinkedList<>();
	    }
	    public void enqueue(T item) {
	        list.append(item);
	    }
	    public T dequeue() {
	        return list.pop();
	    }
	    public boolean isEmpty() {
	        return list.size() == 0;
	    }
	    public int size() {
	        return list.size();
	    }
	    @Override
	    public String toString() {
	        return list.toString();
	    }
}
