package edu.kis.vh.nursery.stack;

public interface Stackable {

	int IS_EMPTY = 0;
	/* Tak, realizacja zadania 10 sprawiła, że wystarczyło zmienić 
	 * wartość jednej zmiennej.
	 * 
	 * Navigate->Open Declaration - wskazuje implementację w bieżącym pliku 
	 * Navigate->Quick Type Hierarchy - pokazuje hierarchię klas, pozwala otworzyć implementację w klasie bazowej
	 * ctrl+mysz - pozwala otworzyć deklarację, implementację oraz implementację w klasie bazowej
	 */

	int getSize();

	/**
	 * @param in any number
	 */
	void push(int in);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();
	/*
	 * alt + left arrow = move back to previously modified file 
	 * alt + right arrow = move forward to lately modified file
	 */

}