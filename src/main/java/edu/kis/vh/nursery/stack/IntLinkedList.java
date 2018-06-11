package edu.kis.vh.nursery.stack;

/**
 * @author Dawid Sowala
 *
 */
public class IntLinkedList implements IntStack {

	/**
	 * Ostatni element listy
	 */
	private Node last;

	private int i;

	/**
	 * Dodanie elementu do listy
	 * @param i wartość elementu
	 */
	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/**
	 * Sprawdzanie czy lista jest pusta
	 * @return zwraca true dla pustej listy
	 */
	@Override
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * Spradzenie czy lista jest pełna
	 * @return zwraca zawsze false
	 */
	@Override
	public boolean isFull() {
		return false;
	}
	
	/**
	 * @return Zwraca ostatni element listy lub -1 gdy ta jest pusta
	 */
	@Override
	public int top() {
		if (isEmpty())
			return EMPTYSTACK;
		return last.getValue();
	}

	/**
	 * @return Zwraca i usuwa ostatni element listy lub -1 gdy ta jest pusta
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTYSTACK;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	public Node getLast() {
		return last;
	}

	public int getI() {
		return i;
	}

	/**
	 * Klasa struktury listy
	 */
	private class Node {

		private int value;
		private Node prev;
		private Node next;

		// Enkapsulacja tworzy w tym wypadku get/set oraz ustawia pola na private,
		// dzięki getterom i setterom które automatycznie są zastepywane
		// przez getNext etc. zmienne nie muszą być public
		private Node(int i) {
			value = i;
		}

		private int getValue() {
			return value;
		}

		private Node getPrev() {
			return prev;
		}

		private void setPrev(Node prev) {
			this.prev = prev;
		}

		private Node getNext() {
			return next;
		}

		private void setNext(Node next) {
			this.next = next;
		}

	}
}
