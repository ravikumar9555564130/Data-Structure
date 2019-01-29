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

	public boolean addLast(Node node) {
		return add(node);
	}

	public boolean addFirst(Node node) {

		if (head == null) {
			head = node;
			return true;
		}

		node.setNext(head);
		head = node;

		return true;
	}

	public Integer getFirst() {

		return head != null ? head.getData() : null;
	}

	public Integer getLast() {

		if (head == null) {
			return null;
		}

		Node temp = head;

		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		return temp.getData();
	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + "]";
	}

}
