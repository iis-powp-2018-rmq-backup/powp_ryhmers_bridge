package edu.kis.vh.nursery.utility;

public interface StackImplementation {

    static final int IS_EMPTY_INDICATOR = 0;

    void push(int i);

    int pop();

    int top();

    int getTotal();

    boolean isEmpty();

    boolean isFull();

    /**
     * Zmień wartość zwracaną przez metody peekaboo i countOut w przypadku pustego stosu z -1 na 0. Czy pomogła Ci w tym
     * realizacja zadania 10? Odpowiedź napisz w komentarzu we wspólnym interfejsie hierarchii implementacji.
     *
     * Nie, ponieważ aby zachować funkcjonalność stosu tablicowego musiałem wprowadzić poprawki w wielu miejscach
     *
     */
}
