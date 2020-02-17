package a4;

public class LinkedList<T> {
		// Your code goes here.
	
	@SuppressWarnings("unused")
	private Node<T> _head;
	
	public int size() {
		int idx = 0;
		Node<T> current = _head;
		if (current == null) {
			return 0;
		}
		while (current.getNext()!= null) {
			idx++;
			current = current.getNext();
		}
		return idx;
	}
	
	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
}