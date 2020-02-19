package a4;

public class LinkedList<T> implements List<T>{
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

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(T element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean remove(T element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(T element) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(T element) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}