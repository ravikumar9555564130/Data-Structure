package linkedList;

public class MyLinkedList {

	private Node head;

	public boolean add(Node node) {

		if (head == null) {
			head = node;
			return true;
		}

		Node temp = head;

		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(node);
		return true;

	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + "]";
	}

}
