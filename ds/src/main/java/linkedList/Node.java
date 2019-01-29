package linkedList;

public class Node {

	private int data;
	private Node next;

	public int getData() {
		return data;
	}

	public Node(int data) {
		super();
		this.data = data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}
