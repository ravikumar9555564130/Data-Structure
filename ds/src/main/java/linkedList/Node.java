package linkedList;

public class Node {

	private Integer data;
	private Node next;

	public int getData() {
		return data;
	}

	public Node(Integer data) {
		super();
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}
