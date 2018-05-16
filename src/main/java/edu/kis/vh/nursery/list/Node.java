package edu.kis.vh.nursery.list;

public class Node {
// dla poniższych pol refactor spowodował utworzenie setterow/getterów i ic automatyczne użucie w miejscu bezposredniego 
	//odwolania do pol
	private int value;
	private Node prev;
	private Node next;

	public Node(int i) {
		value = i;
	}

	int getValue() {
		return value;
	}

	Node getPrev() {
		return prev;
	}

	void setPrev(Node prev) {
		this.prev = prev;
	}

	Node getNext() {
		return next;
	}

	void setNext(Node next) {
		this.next = next;
	}

}
