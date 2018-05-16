package edu.kis.vh.nursery.list;

/**
 * @author Kamil Błażejczuk
 * Klasa zapewnia strukturę LinkedList tylko dla elementów typu int
 */
public class IntLinkedList {

	/**
	 * Domyślna wartość zwracana, gdy lista jest pusta
	 */
	private static final int DEFAULT_EMPTY_LIST_VALUE = -1;
	
	/**
	 * Ostatni element listy
	 */
	private Node last;
	private int i;

	/**
	 * Metoda dodaje nowy element do listy
	 * @param i Wartość dodanego elementu
	 */
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
	 * Metoda sprawdza czy lista jest pusta
	 * @return Zwraca true, gdy jest pusta, false, jeśli nie jest
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * Metoda sprawdza czy lista jest pełna
	 * @return Zawsze zwraca false (lista nie ma limitu pojemności)
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * Metoda zwraca ostatni element z listy
	 * @return Zwraca ostatni element z listy gdy nie jest pusta, w przeciwnym wypadku zwraca -1
	 */
	public int top() {
		if (isEmpty())
			return DEFAULT_EMPTY_LIST_VALUE;
		return last.getValue();
	}

	/**
	 * Metoda zwraca ostatni element z listy i usuwa go z niej
	 * @return Zwraca ostatni element z listy gdy nie jest pusta, w przeciwnym wypadku zwraca -1
	 */
	public int pop() {
		if (isEmpty())
			return DEFAULT_EMPTY_LIST_VALUE;
		final int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	Node getLast() {
		return last;
	}

	int getI() {
		return i;
	}
	
	/**
	 * Klasa zagnieżdżona, zapewniająca klasie IntLinkedList strukturę elemntu listy
	 *
	 */
	private class Node {

		// metody top i pop klasy IntLinkedList używają settera i gettera zamiast bezpośredniego dostępu do pola
		/**
		 * Wartość elementu listy
		 */
		private int value;
		// metody push i pop klasy IntLinkedList używają settera i gettera zamiast bezpośredniego dostępu do pola
		/**
		 * Poprzedni element listy
		 */
		private Node prev;
		// metoda push klasy IntLinkedList używa settera i gettera zamiast bezpośredniego dostępu do pola
		/**
		 * Następny element listy
		 */
		private Node next;

		private Node(int i) {
			value = i;
		}
		// alt + <- poprzednio edytowana klasa  alt + -> następna klasa

		private int getValue() {
			return value;
		}

		private void setValue(int value) {
			this.value = value;
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
