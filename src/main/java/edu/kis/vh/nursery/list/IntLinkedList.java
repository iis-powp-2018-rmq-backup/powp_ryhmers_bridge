package edu.kis.vh.nursery.list;

public class IntLinkedList implements IntLinkedListInterface {

    private static final int emptyStack = -1;
    private Node last;
	int i;

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
			return emptyStack;
		return last.getValue();
	}

	@Override
	public int pop() {
		if (isEmpty())
			return emptyStack;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
