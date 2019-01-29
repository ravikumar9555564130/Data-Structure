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
	 * it has linear time Complexity.but it has to maintain the method stack for
	 * each call.
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

	/**
	 * I have moved one node forward slow pointer and two node forward fast pointer
	 * and if linked list is cyclic then at some point its address must be same, if
	 * it is not cyclic then its address never be same.
	 * 
	 * @return
	 */
	public boolean isCyclic() {

		boolean isCyclic = false;

		if (head == null) {
			return false;
		}
		Node slow = head;

		Node fast = head;

		while (fast != null) {

			slow = slow.getNext();
			fast = fast.getNext();

			if (fast != null) {
				fast = fast.getNext();
			}

			if (fast == slow) {
				return true;
			}
		}

		return isCyclic;

	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + "]";
	}

}
