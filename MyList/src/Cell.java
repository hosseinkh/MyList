public class Cell<T> {
	private Cell<T> next;
	private final T data;
	
	public Cell(T s, Cell<T> c) {
		data = s;
		next = c;
	}

	public T getData() {
		return data;
	}

	public Cell<T> getNext() {
		return next;
	}

	public void setNext(Cell<T> nouv) {
		next = nouv;		
	}	
}
