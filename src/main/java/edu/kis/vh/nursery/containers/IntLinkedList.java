package edu.kis.vh.nursery.containers;

public class IntLinkedList implements IntContainer {
    private Node last;

    public static int getEmpty() {
        return EMPTY;
    }
    // sa one uzywane poprzez gettery bezposrednio w publicznych metodach klasy

    public void push(int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }


    public boolean isEmpty() {
        return getLast() == null;
    }

    public boolean isFull() {

        return false;
    }

    public int top() {
        if (isEmpty())
            return getEmpty();
        return getLast().getValue();
    }

    public int pop() {
        if (isEmpty())
            return getEmpty();
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    @Override
    public void countIn(int in) {

    }

    @Override
    public int countOut() {
        return 0;
    }

    @Override
    public int peekaboo() {
        if (isEmpty())
            return EMPTY;
        return top();
    }

    @Override
    public boolean callCheck() {
        return isEmpty();
    }

    public Node getLast() {
        return last;
    }


    public void setLast(Node last) {
        this.last = last;


    }


    private class Node {

        private final int value;
        private Node prev;
        private Node next;

        Node(int value) {
            this.value = value;
        }

        int getValue() {
            return value;
        }

        Node getPrev() {
            return prev;
        }

        void setPrev(Node prev) {
            this.prev = prev;
        }

        Node getNext() {
            return next;
        }

        void setNext(Node next) {
            this.next = next;
        }
    }

}
