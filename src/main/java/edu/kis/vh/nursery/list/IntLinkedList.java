package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.Container;

public class IntLinkedList implements Container{

	private Node last;
	private int i;
	private int total = -1;

	public void push(int i) {
		if (getLast() == null)
			setLast(new Node(i));
		else {
			getLast().setNext(new Node(i));
			getLast().getNext().setPrev(getLast());
			setLast(getLast().getNext());
		}
		total++;
	}

	public boolean isEmpty() {
		return getLast() == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return -1;
		return getLast().getValue();
	}

	public int pop() {
		if (isEmpty())
			return -1;
		int ret = getLast().getValue();
		setLast(getLast().getPrev());
		total--;
		return ret;
	}

	@Override
	public int getTotal() {
		return total;
	}

	public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

}
