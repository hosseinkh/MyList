public class MyList<T> {
	private Cell<T> first = null;
	private int size;

	public void add(T s) {
		Cell<T> c = new Cell<T>(s, first);
		first = c;
		size++;
	}
	
	public void addLast(T s) {
		Cell<T> nouv = new Cell<T>(s, null);
		if(first==null) {
			first = nouv;
			size++;
			return;
		}
		Cell<T> it = first;
		for(int i=0; i<size-1 ; ++i) {
			it = it.getNext();
		}
		it.setNext(nouv);
		size++;
	}

	public int size() {
		//faire un parcours serait en O(n) !
		return size;
	}

	public T get(int ind) {
		if(ind>=size || ind<0) throw new IndexOutOfBoundsException();
		Cell<T> it = first;
		for(int i=0; i<ind ; ++i) {
			it = it.getNext();
		}
		return it.getData();
	}

	public boolean contains(Object o) {
		Cell<T> tmp = first;
		while(tmp != null) {
			if(tmp.getData().equals(o))
				return true;
			tmp = tmp.getNext();
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		//String s = "";
		Cell<T> it = first;

		for(int i=0;i<size;++i) {
			sb.append(it.getData()).append(" ");
			//s += it.getData();
			it = it.getNext();
		}

		return sb.toString();
	}
	
		public int sumLetter() {
		int sum=0;
		Cell<T> it=first;
		for(int i=0 ; i<size ; ++i) {
			T s = (T)it.getData();
			sum += s.toString().length();
			it.getNext();
		}
		return sum;
	}

	public static void main(String[] args) {
		MyList ml = new MyList();
		ml.addLast("tatu");
		ml.add("toto");
		ml.add("titi");
		ml.addLast("tutu");
		System.out.println(ml);
	}
}