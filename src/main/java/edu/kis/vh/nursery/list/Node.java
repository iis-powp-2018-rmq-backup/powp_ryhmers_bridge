package edu.kis.vh.nursery.list;

public class Node {

	// metody top i pop klasy IntLinkedList używają settera i gettera zamiast bezpośredniego dostępu do pola
	private int value;
	// metody push i pop klasy IntLinkedList używają settera i gettera zamiast bezpośredniego dostępu do pola
	private Node prev;
	// metoda push klasy IntLinkedList używa settera i gettera zamiast bezpośredniego dostępu do pola
	private Node next;

	public Node(int i) {
		value = i;
	}
	// alt + <- poprzednio edytowana klasa  alt + -> następna klasa

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
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
