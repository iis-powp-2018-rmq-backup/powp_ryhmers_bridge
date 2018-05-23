package edu.kis.vh.nursery.collections.intType;

public interface IntContainer {
	int EMPTY_VALUE = 0; //Zmiana wartosci dla wspolnej stalej jest szybka i bezpieczna. Zad 10 pomoglo
	int getTotal();

	void countIn(int in);

	boolean callCheck();

	boolean isFull();

	int peekaboo();

	int countOut();

}