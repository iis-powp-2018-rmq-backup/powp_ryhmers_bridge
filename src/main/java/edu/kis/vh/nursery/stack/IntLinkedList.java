package edu.kis.vh.nursery.stack;

public class IntLinkedList implements IntStackInterface {


    private Node last; // dostep do zmiennej odbywa sie poprzez funkcje get i set
    private int size = IS_EMPTY_INDICATOR;


    @Override
    public int getSize() {
        return size;
    }


    /**
     * dodawanie wartosci do listy
     * @param i wartosc dodawana na poczatek listy
     */
    @Override
    public void push(final int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().next = new Node(i);
            getLast().next.prev = getLast();
            setLast(getLast().next);
        }
        ++size;
    }

    /**
     * sprawdzenie czy lista jest pusta
     * @return null
     */
    @Override
    public boolean isEmpty() {
        return getLast() == null;
    }

    /**
     * sprawdzenie czy lista jest pusta
     * @return false
     */
    @Override
    public boolean isFull() {
        return false;
    }

    /** zwraca ostatnia wartosc
     * @return ostatnia wartosc
     */
    @Override
    public int top() {
        if (isEmpty())
            return IS_EMPTY_INDICATOR;
        return getLast().value;
    }

    /** zwraca i usuwa ostatnia wartosc
     * @return
     */
    @Override
    public int pop() {
        if (isEmpty())
            return IS_EMPTY_INDICATOR;
        int ret = getLast().value;
        setLast(getLast().prev);
        --size;
        return ret;
    }

    /**
     * zwraca ostatnia wartosc
     * @return ostatnia wartosc
     */
    public Node getLast() {
        return last;
    }

    /**
     * ustwaia wartosc jako ostatnia
     * @param last
     */
    public void setLast(Node last) {
        this.last = last;
    }

    /**
     * zwraca liczbe
     * @return i
     */

}

class Node {

    int value; // dostep do zmiennej odbywa sie poprzez funkcje get i set
    Node prev; // dostep do zmiennej odbywa sie poprzez funkcje get i set
    Node next; // dostep do zmiennej odbywa sie poprzez funkcje get i set
    //
    Node(int i) {
        setValue(i);
    }

    public void setValue(final int value) {
        this.value = value;
    }

}
