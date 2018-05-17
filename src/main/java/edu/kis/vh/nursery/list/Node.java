package edu.kis.vh.nursery.list;

public class Node {

	private int value;
	private Node prev;
	private Node next;
	//Enkapsulacja tworzy w tym wypadku get/set oraz ustawia pola na private, dzięki getterom i setterom które automatycznie są zastepywane
	//przez getNext etc. zmienne nie muszą być public
	public Node(int i) {
		value = i;
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
