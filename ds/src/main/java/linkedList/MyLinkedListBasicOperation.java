package linkedList;

public class MyLinkedListBasicOperation {

	public static void main(String[] args) {

		MyLinkedList myLinkedList_1 = new MyLinkedList();

		// Linked List 1 node;
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		Node node5 = new Node(50);
		Node node6 = new Node(60);
		Node node7 = new Node(70);

		// Linked List 2 node;
		Node node8 = new Node(100);
		Node node9 = new Node(200);
		Node node10 = new Node(300);
		Node node11 = new Node(400);
		Node node12 = new Node(500);
		Node node13 = new Node(600);
		Node node14 = new Node(700);

		// adding element in linked list 1
		myLinkedList_1.add(node1);
		myLinkedList_1.add(node2);
		myLinkedList_1.add(node3);
		myLinkedList_1.add(node4);
		myLinkedList_1.add(node5);
		myLinkedList_1.add(node6);
		myLinkedList_1.add(node7);

		// this node11(i.e. 400 ) is merging point for both the linkedList
		myLinkedList_1.add(node11);

		System.out.println(myLinkedList_1);

		System.out.println("First :: " + myLinkedList_1.getFirst());
		System.out.println("Last :: " + myLinkedList_1.getLast());
		System.out.println("3rd from Last :: " + myLinkedList_1.getNthElement(4));
		System.out.println("reverse  :: " + myLinkedList_1.reverse());
		System.out.println("Cyclic  :: " + myLinkedList_1.isCyclic());

		// create 2nd linked list and merger with 1st linked list at point 40;

		MyLinkedList myLinkedList_2 = new MyLinkedList();

		// adding element in linked list 2
		myLinkedList_2.add(node8);
		myLinkedList_2.add(node9);
		myLinkedList_2.add(node10);
		myLinkedList_2.add(node11);
		myLinkedList_2.add(node12);
		myLinkedList_2.add(node13);
		myLinkedList_2.add(node14);

		// this node4(i.e. 40 ) is merging point for both the linkedList
		// myLinkedList_2.add(node4);

		System.out.println(myLinkedList_2);
		System.out.println(myLinkedList_1.getMergingPoint(myLinkedList_2).getData());

	}

}
