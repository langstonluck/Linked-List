package a4;

public class LinkedList<T> implements List<T>{
		// Your code goes here.
	
	private Node<T> head;
	private Node<T> tail;
	private int currentSize;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.currentSize = 0;
	}
	
	public int size() {
		return currentSize;
	}
	
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		head = null;
		tail = null;
		currentSize = 0;
		
	}

	@Override
	public boolean contains(T element) {
		// TODO Auto-generated method stub
		Node<T> current = head;
		
		for (int i = 0; i < size(); i++) {
			if (current.getValue().equals(element)) {
				return true;
			} else {
				current = current.getNext();
			}
		}
		return false;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		Object[] result = new Object[size()];
		Node<T> x = head;
		for (int i = 0; i < size(); i++) {
			result[i] = x.getValue();
			x = x.getNext();
		}
		return (T[]) result;
	}

	@Override
	public void add(T element) {
		// TODO Auto-generated method stub
		Node<T> current = head;
		Node<T> end = tail;
		Node<T> toAdd = new NodeImpl(element, null);
		
		if (head == null && tail == null) {
			head = toAdd;
			tail = toAdd;
		} else {
			tail.setNext(toAdd);
			tail = toAdd;
		}
		currentSize++;
	}

	@Override
	public boolean remove(T element) {
		// TODO Auto-generated method stub
		if (size() == 0) {
			return false;
			}

			if (head.getValue().equals(element) && head.getNext() == null) {
			head = null;
			tail = null; 
			currentSize--;
			return true;
			} else if( head.getValue().equals(element)) {
			head = head.getNext();
			currentSize--;
			return true;
			}

			Node<T> how = head;
			Node<T> previous = null;


			while (how != null) {

			previous = how;
			how = how.getNext();
			if (how.getValue().equals(element)) {

			previous.setNext(how.getNext());
			currentSize--;
			return true;
			}

			}



			return false;
			}


			

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		if ( index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Out of bounds");
			}
		if (index < size()- 1) {
		Node<T> current = head;
		for (int i = 0; i< index; i++) {
		current = current.getNext();
		}
		return (T) current.getValue();
		}
		T value = tail.getValue();

		return value;

	}

	@Override
	public T set(int index, T element) {
		// TODO Auto-generated method stub
		Node<T> current = head;
		T setter = null;
		if (index < 0 || index >= size()) {
		throw new IndexOutOfBoundsException("Out of bounds");
		}

		for (int i = 0; i< index ; i++) {
		current = current.getNext();

		}
		setter = current.getValue();
		current.setValue(element);



		return setter;
	}

	@Override
	public void add(int index, T element) {
		// TODO Auto-generated method stub
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException("Out of bounds");
			}
		if (index == size()) {
			add(element);
			return;
		}
		if (index == 0) {
			head = new NodeImpl(element, head);
		} else {
			Node<T> current = head;
		for (int i = 0; i < index -1; i++) {
			current = current.getNext();
		}
		current.setNext(new NodeImpl(element, current.getNext()));
		}
		currentSize++;
		}

		
	

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		Node<T> current = head;
		Node<T> previous = null;
		T value = null;

		if ( index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Out of bounds");
		}
		if (index == 0) {
			if (head.getNext() != null) {
				value = head.getValue();
				head = head.getNext();
				currentSize--;
				return value;
		}
		if (head.getNext() == null) {
			value = head.getValue();
			head = null;
			currentSize--;
			return value;
		}

		} 
		for (int i = 0; i < index; i++) {
			previous = current;
			current = current.getNext();
		}
		value = current.getValue();
		Node<T> placeHolder = current.getNext();
		previous.setNext(placeHolder);
		currentSize--;
		return value;
		}


	@Override
	public int indexOf(T element) {
		// TODO Auto-generated method stub
		Node<T> current = head;
		int count = 0;

		if (size() == 0) {
			return -1;
		}


		for (int i = 0; i< size(); i++) {

		if (current.getValue().equals(element)) {
			return count;
		}
		count++;
		current = current.getNext();
		}
		return -1;
	}

	@Override
	public int lastIndexOf(T element) {
		// TODO Auto-generated method stub
		Node<T> current = head;
		int counter = 0;
		boolean here = false;
		if (size() == 0) {
			return -1;
		}

		for (int i = 0; i < size(); i++) {
		if (current.getValue().equals(element)) {
			here = true;
			counter = i;
		}
		current = current.getNext();
		}

		if (here = true ) {
			return counter;
		}
		return -1;
	}
	
	
	
}