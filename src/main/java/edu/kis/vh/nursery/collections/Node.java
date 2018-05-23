package edu.kis.vh.nursery.collections;

public class Node {

	private final int value;
	private Node prev;
	private Node next;

	//Odwołania w klasie IntLinkedList korzystającej z atrybutów klasy Node zostały automatycznie
	//zamienione z bezpośrednich na gettery i settery.

	public Node(int i) {
		this.value = i;
	}

	public int getValue() {
		return value;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}