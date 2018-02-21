public class SinglyLinkedList<E>{
	//class that describes a node.
	private class Node<E>{
		private E element;
		private Node<E> nextNode;
		public Node(E e,Node<E> n){
			element = e;
			nextNode = n;
		}
		public Node<E> getNext(){
			return nextNode;
		}
		public void setNext(Node<E> next){
			nextNode = next;
		}
		public void setElement(E e){
			element = e;
		}
		public E getElement(){
			return element;
		}
		public String toString(){
			return element.toString();
		}
	}
	Node<E> first;
	Node<E> last;
	int num;
	public void add(E element){
		Node<E> n = new Node<>(element, null);
		if(num == 0){
			last = first  = n;
			num++;
		}else{
			last.setNext(n);
			last  = n;
			num++;
		}
	}
	public E removeLast(){
		if(num == 0)
			return null;
		else if(num == 1){
			num = 0;
			Node<E> n = first;
			first = last = null;
			return n.getElement();
		}else{
			Node<E> n = first;
			for(int i = 0; i < num - 2; i++)
				n = n.getNext();
			Node<E> k  = n.getNext();
			n.setNext(null);
			last = n;
			return k.getElement();
		}
	}
	public E removeFirst(){
		if(num == 0)
			return null;
		else if(num == 1){
			Node<E> n = first;
			first = last = null;
			num--;
			return n.getElement();
		}
		else{
			Node<E> n = first;
			first = n.getNext();
			num--;
			return n.getElement();
		}
	}
	public void addFirst(E element){
		Node<E> n = new Node<>(element, first);
		num++;
		first  = n;
	}
	public void addLast(E element){
		add(element);
	}
	public int getSize(){
		return num;
	}
	public boolean isEmpty(){
		return num == 0;
	}
	public String toString(){
		//System.out.println("this is where we get Stuck.");
		Node<E> n  = first;
		String s = "[";
		if(num == 0) return "[]";
		while(n.getNext() != null){
			s = s+n.toString()+", ";
			n = n.getNext();
		}
		return s+n.toString()+"]";
	}
}