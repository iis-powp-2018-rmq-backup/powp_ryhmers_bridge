package edu.kis.vh.nursery.stack;

public class IntLinkedList implements Stackable{

	private static final int VALUE_IS_EMPTY = -1;
	private Node last;
	private int size;

	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
		size++;
	}
	
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return VALUE_IS_EMPTY;
		return last.getValue();
	}

	@Override
	public int pop() {
		if (isEmpty())
			return VALUE_IS_EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		size--;
		return ret;
	}

	private class Node {

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
}
