package edu.kis.vh.nursery.stack;

public interface IntStackInterface {
    /**
     * getter do zmiennej is_empty_indicator
     * @return pusta lista
     */

    int IS_EMPTY_INDICATOR = 0;

    int getSize();

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    //Tak, zmiana zostala ograniczona do jednego miejsca

    //W Inteliji Navigate->GoTo i ctrl i klikniecie myszka dziala tak samo
}
