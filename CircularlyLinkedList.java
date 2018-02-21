public class CircularlyLinkedList<E>{
	protected class Node<E>{
		private E e; //element value
		private Node<E> n; //nextNode
		public Node(E e, Node<E> n){
			this.e = e;
			this.n = n;
		}
		public void setElement(E e){
			this.e = e;
		}
		public void setNext(Node<E> n){
			this.n = n;
		}
		public E getElement(){
			return e;
		}
		public Node<E> getNext(){
			return n;
		}
		public String toString(){
			return e.toString();
		}
	}
	Node<E> last;
	int n;
	public void add(E e){
		if(n == 0){
			last = new Node<E>(e, null);
			last.setNext(last);
			n++;
		}else{
			Node<E> m = new Node<E>(e, last.getNext());
			last.setNext(m);
			last = m;
			n++;
		}
	}
	public void addFirst(E e){
		if(n == 0)
			add(e);
		else{
			last.setNext(new Node<E>(e, last.getNext()));
			n++;
		}
	}
	public void addLast(E e){
		add(e);
	}
	public E remove(){
		if(n == 0)
			return null;
		else if(n == 1){
			n--;
			Node<E> k = last;
			last = null;
			return k.getElement();
		}else{
			Node<E> j = last;
			Node<E> m = last;
			for(int i = 1; i < n; i++)
				m = m.getNext();
			m.setNext(last.getNext());
			last = m;
			n--;
			return j.getElement();
		}
	}
	public E removeFirst(){
		if(n == 0)
			return null;
		else if(n == 1){
			Node<E> k = last;
			n--;
			last = null;
			return k.getElement();
		}else{
			Node<E> k = last.getNext();
			last.setNext(k.getNext());
			n--;
			return k.getElement();
		}
	}
	public E removeLast(){
		return remove();
	}
	public int size(){
		return n;
	}
	public boolean isEmpty(){
		return n == 0;
	}
	public String toString(){
		String s   = "[";
		if(n == 0) return "[]";
		Node<E> m = last.getNext();
		for(int i = 0; i < n; i++){
			if( i  == 0)
				s += m.toString();
			else s += ", "+m.toString();
			m = m.getNext();
		}
		s += "]";
		return s;
	}
	public void clear(){
		n  = 0;
		last = null;
	}
}