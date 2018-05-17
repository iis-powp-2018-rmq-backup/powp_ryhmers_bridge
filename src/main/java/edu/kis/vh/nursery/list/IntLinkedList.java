package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int IS_EMPTY_INDICATOR = -1;
    private Node last; // dostep do zmiennej odbywa sie poprzez funkcje get i set
    private int i; // dostep do zmiennej odbywa sie poprzez funkcje get i set

    /**
     * getter do zmiennej is_empty_indicator
     * @return pusta lista
     */
    public static int getIsEmptyIndicator() {
        return IS_EMPTY_INDICATOR;
    }

    /**
     * dodawanie wartosci do listy
     * @param i wartosc dodawana na poczatek listy
     */
    public void push(final int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().next = new Node(i);
            getLast().next.prev = getLast();
            setLast(getLast().next);
        }
    }

    /**
     * sprawdzenie czy lista jest pusta
     * @return null
     */
    private boolean isEmpty() {
        return getLast() == null;
    }

    /**
     * sprawdzenie czy lista jest pusta
     * @return false
     */
    public boolean isFull() {
        return false;
    }

    /** zwraca ostatnia wartosc
     * @return ostatnia wartosc
     */
    public int top() {
        if (isEmpty())
            return getIsEmptyIndicator();
        return getLast().value;
    }

    /** zwraca i usuwa ostatnia wartosc
     * @return
     */
    public int pop() {
        if (isEmpty())
            return getIsEmptyIndicator();
        int ret = getLast().value;
        setLast(getLast().prev);
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
    public int getI() {
        return i;
    }

}

class Node {

    int value; // dostep do zmiennej odbywa sie poprzez funkcje get i set
    Node prev; // dostep do zmiennej odbywa sie poprzez funkcje get i set
    Node next; // dostep do zmiennej odbywa sie poprzez funkcje get i set
    //
    Node(int i) {
        setValue(i);
    }

    public int getValue() {
        return value;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }
}
