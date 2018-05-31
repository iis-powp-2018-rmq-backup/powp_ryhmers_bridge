package edu.kis.vh.nursery.stack;

public interface IntStack {
	/**
	 * Tak, dzięki realizacji zadania 10 mogłem zmienić tylko stałą w interfejsie,
	 * aby została ona zmieniona we wszystkich implementacjach.
	 * Niestety operacja ta spowodowała, że testy jednostkowe dla tych metod nie przechodzą.
	 */
	int STACK_EMPTY = 0;

	void push(int i);
	boolean isEmpty();
	boolean isFull();
	int top();
	int pop();
}
