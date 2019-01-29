package linkedList;

public class MyLinkedListBasicOperation {

	public static void main(String[] args) {

		MyLinkedList myLinkedList = new MyLinkedList();

		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(5);
		Node node4 = new Node(40);

		myLinkedList.addFirst(node1);
		myLinkedList.addFirst(node2);
		myLinkedList.addFirst(node3);
		myLinkedList.addFirst(node4);

		System.out.println(myLinkedList);

		System.out.println("First :: " + myLinkedList.getFirst());
		System.out.println("Last :: " + myLinkedList.getLast());

	}

}
