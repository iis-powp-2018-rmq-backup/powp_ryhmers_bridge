package edu.kis.vh.nursery.stack;

public interface IntStackInterface {
	
	final int DEFAULT_EMPTY_STACK_VALUE = 0;
	//Owszem, realizacja zadania 10 pomogła, dzieki temu należało dokonać zmiany tylko w intefejsie, a nie w obu klasach
	
	void push(int in);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getSize();
}
