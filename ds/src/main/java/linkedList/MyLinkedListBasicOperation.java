package linkedList;

public class MyLinkedListBasicOperation {

	public static void main(String[] args) {

		MyLinkedList myLinkedList = new MyLinkedList();

		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(5);
		Node node4 = new Node(40);
		Node node5 = new Node(15);
		Node node6 = new Node(55);
		Node node7 = new Node(25);

		myLinkedList.add(node1);
		myLinkedList.add(node2);
		myLinkedList.add(node3);
		myLinkedList.add(node4);
		myLinkedList.add(node5);
		myLinkedList.add(node6);
		myLinkedList.add(node7);

		System.out.println(myLinkedList);

		System.out.println("First :: " + myLinkedList.getFirst());
		System.out.println("Last :: " + myLinkedList.getLast());
		System.out.println("3rd from Last :: " + myLinkedList.getNthElement(4));
		System.out.println("reverse  :: " + myLinkedList.reverse());
		System.out.println("Cyclic  :: " + myLinkedList.isCyclic());

	}

}
