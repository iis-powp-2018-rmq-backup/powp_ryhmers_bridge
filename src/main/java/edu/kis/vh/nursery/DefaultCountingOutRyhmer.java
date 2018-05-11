package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {
    public final int CAPACITY = 12;
    public final int EMPTY_STACK_VALUE = -1;
    
    private int[] NUMBERS = new int[CAPACITY];

    
    public int total = EMPTY_STACK_VALUE;

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

    protected int peekaboo() {
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
