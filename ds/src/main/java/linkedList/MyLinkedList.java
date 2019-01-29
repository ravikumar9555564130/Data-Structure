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

	public Integer getNthElement(int position) {

		if (head == null) {
			return null;
		}

		Node pre = head;
		Node next = head;

		for (int i = 1; i < position; i++) {
			next = next.getNext();
		}

		while (next != null) {
			pre = pre.getNext();
			next = next.getNext();

		}

		return pre.getData();

	}

	public MyLinkedList reverse() {
		MyLinkedList myLinkedList = new MyLinkedList();
		return reverse(head, myLinkedList);
	}

	/**
	 * Recursive method to create new MyLinkedList , it does not modify existing
	 * MyLinkedList,and it will reverse in one pass and create new MyLinkedList.so
	 * it has linear time Complexity.
	 * 
	 * @param temp
	 * @param myLinkedList
	 * @return
	 */
	private MyLinkedList reverse(Node temp, MyLinkedList myLinkedList) {

		if (temp == null) {
			return myLinkedList;
		}
		reverse(temp.getNext(), myLinkedList);

		myLinkedList.add(new Node(temp.getData()));

		return myLinkedList;

	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + "]";
	}

}
