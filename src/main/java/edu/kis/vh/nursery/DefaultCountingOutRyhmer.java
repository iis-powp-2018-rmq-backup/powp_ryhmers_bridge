package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {
    private final int CAPACITY = 12;
    private final int EMPTY_STACK_VALUE = -1;    
    private int[] NUMBERS = new int[CAPACITY];    
    private int total = EMPTY_STACK_VALUE;

    public void countIn(int in) {
        if (!isFull()) {
            NUMBERS[++total] = in;
        }
    }

    public boolean callCheck() {
        return total == EMPTY_STACK_VALUE;
    }

    public boolean isFull() {
        return total == 11;
    }

    public int peekaboo() {
        if (callCheck()) {
            return EMPTY_STACK_VALUE;
        }
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck()) {
            return EMPTY_STACK_VALUE;
        }
        return NUMBERS[total--];
    }

}
