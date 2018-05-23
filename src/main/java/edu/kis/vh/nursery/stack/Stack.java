package edu.kis.vh.nursery.stack;

public interface Stack {

	int IS_EMPTY_INDICATOR = 0; //tak ułatwiła gdyż wystarczy, że zmieniłem tylko jedne pole zamiast dwóch

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

	int getTotal();
	
	//skrót F3 pokazuje definicje, skrót ctr-t pokazuje gdzie jest zaimplemntowana np dana metoda, zaś ctrl + myszka umozliwia wybranie sobie jednej z tych opcji

}