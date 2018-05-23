package edu.kis.vh.nursery.collections.intType;

public interface IntContainer {
	int EMPTY_VALUE = -1;
	int getTotal();

	void countIn(int in);

	boolean callCheck();

	boolean isFull();

	int peekaboo();

	int countOut();

}