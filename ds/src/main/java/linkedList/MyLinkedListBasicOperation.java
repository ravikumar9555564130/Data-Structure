package linkedList;

public class MyLinkedListBasicOperation {

	public static void main(String[] args) {

		MyLinkedList myLinkedList = new MyLinkedList();

		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(5);
		Node node4 = new Node(40);

		myLinkedList.add(node1);
		myLinkedList.add(node2);
		myLinkedList.add(node3);
		myLinkedList.add(node4);

		System.out.println(myLinkedList);

	}

}
