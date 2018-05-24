package edu.kis.vh.nursery.stack;

/**
 * Class which is responsible for containing int values and provides
 * simple interface to handle it
 */
public class IntLinkedList implements Stack {
    /**
     * Last element of the stack
     */
    private Node last;
    private int i;

    /**
     * Method responisble for adding new element on the stack
     *
     * @param i specific element to put on the stack
     */
    @Override
    public void push(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Method checks if lisst is empty
     *
     * @return boolean indicates if stack is empty or not
     */
    @Override
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Method checks if lisst is full
     *
     * @return boolean indicates if stack is full or not
     */
    @Override
    public boolean isFull() {
        return false;
    }

    /**
     * Method which returns last added element
     *
     * @return last added element on the stack or EMPTY_LIST constant to indicate
     * if it is empty
     */
    @Override
    public int top() {
        if (isEmpty()) {
            return EMPTY_STACK;
        }
        return last.getValue();
    }

    /**
     * Method which returns last added element and remove it
     *
     * @return last added element on the stack or EMPTY_LIST constant to indicate
     * if it is empty
     */
    @Override
    public int pop() {
        if (isEmpty()) {
            return EMPTY_STACK;
        }
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * Class which is a container to keep previous element and next element of the stack
     */
    class Node {
        //Zmiana w klasie IntLinkedList na ustawianie i pobieranie zmiennych poprzez settery i gettery
        /**
         * Specific element
         */
        private int value;
        /**
         * Previous element which keeps reference of next and previous element
         */
        private Node prev;
        /**
         * Next element which keeps reference of next and previous element
         */
        private Node next;

        /**
         * @param i contruct object with the specific int value
         */
        public Node(int i) {
            value = i;
        }

        /**
         * @return int value of the node
         */
        public int getValue() {
            return value;
        }

        /**
         * @return Previous node
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * @param prev previous node to set
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * @return Next node
         */
        public Node getNext() {
            return next;
        }

        /**
         * @param next next node to set
         */
        public void setNext(Node next) {
            this.next = next;
        }
    }

}
