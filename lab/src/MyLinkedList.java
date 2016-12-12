import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>{

	private Node<T> head;
	private int size = 0;

	public int getSize() {
		return size;
	}

	public boolean remove(int index) {
		if (index > size || index < 0) {
			return false;
		}
		Node<T> nodeBefore = head;
		Node<T> nodeAfter;
		for ( int i = 0; i < index-1; i++) {
			nodeBefore = nodeBefore.getNext();
		}
		nodeAfter = nodeBefore.getNext().getNext();
		nodeBefore.setNext(nodeAfter);
		size--;
		return true;
	}

	public T get(int index) {
		if (index > size || index < 0) {
			return null;
		}
		Node<T> node = head;
		for (int i = 0; i < index; i++) {
			node = node.getNext();
		}
		return node.getData();
	}

	public void add(T obj) {
		if(size == 0) {
			head = new Node<>(obj);
			size++;
			return;
		}
		Node<T> last = head;
		Node<T> afterLast = last.getNext();
		while (afterLast != null) {
			last = last.getNext();
			afterLast = last.getNext();
		}
		last.setNext(new Node<>(obj));
		size++;
	}

	//The methods below are bonus

	public void add(int index, T obj){
		//to-do
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator<T>(head);
	}

	private class MyIterator<T> implements Iterator<T> {

		private Node<T> node;

		public MyIterator(Node<T> node) {
			//to-do
		}
		@Override
		public boolean hasNext() {
			//to-do
			return true;
			//just to resolve complaint; code has no meaning.
		}

		@Override
		public T next() {
			//to-do
			return (T) "b";
			//just to resolve complaint; code has no meaning.
 		}

		@Override
		public void remove() {
			// to-do

		}

	}
}
