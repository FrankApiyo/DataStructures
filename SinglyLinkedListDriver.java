public class SinglyLinkedListDriver{
	public static void main(String[] args){
		SinglyLinkedList<String> list = new SinglyLinkedList<>();
		System.out.println(list);
		list.add("One");
		System.out.println(list.removeFirst());
		System.out.println(list);
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("me");
		list.addLast("you");
		System.out.println(list);
	}
}