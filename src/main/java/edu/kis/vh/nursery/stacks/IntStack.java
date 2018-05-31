package edu.kis.vh.nursery.stacks;

public interface IntStack {
		int EMPTY_STACK = 0;
		void push(int i);
		boolean isEmpty();
		boolean isFull();
		int top();
		int pop();
	}

/*
Zadanie 10 pomogło szybko zmienić wartość dla pustego stosu z -1 na 0, 
ponieważ teraz istnieje jedna wspólna stała i 
nie trzeba zmieniać tej wartości w dwóch miejscach
 */

