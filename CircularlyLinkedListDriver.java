public class CircularlyLinkedListDriver{
	public static void main(String args[]){
		CircularlyLinkedList<String> list = new CircularlyLinkedList<>();
		System.out.println(list);
		list.add("one");
		list.add("two");
		System.out.println(list);
		System.out.println("removing first: "+list.removeFirst());
		System.out.println("removing last: "+list.removeLast());
		System.out.println("size now: "+list.size());
		list.addFirst("one");
		list.addLast("two");
		list.addFirst("Very first");
		list.addLast("Very last");
		System.out.println(list);
		System.out.println("size: "+list.size());
		System.out.println("isEmpty: "+list.isEmpty());
		System.out.println("clear list...");
		list.clear();
		System.out.println(list);
		System.out.println("is list empty: "+list.isEmpty());
	}
}