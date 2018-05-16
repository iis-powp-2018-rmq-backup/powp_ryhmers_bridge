package edu.kis.vh.nursery.list;

public class Node {

	private int value;
	/*
	 * W klasie IntLinkedList zmieniło się z bezpośredniego odwołania do tego atrybutu
	 * na pośrednie, przez getValue()
	 */
	private Node prev;
	private Node next;
	/*
	 * To samo co wyżej, dodatkowo do przypisania wartości zostało wykorzystane 
	 * setPrev() i setNext()
	 */

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
