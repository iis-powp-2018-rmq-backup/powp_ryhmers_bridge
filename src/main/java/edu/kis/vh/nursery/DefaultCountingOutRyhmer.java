package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

    public static final int NUMBERS_CAPACITY = 12;
    public static final int DEFAULT_EMPTY_STACK_VALUE = -1;
    public static final int DEFAULT_FULL_STACK_VALUE = 11;
    private int[] numbers = new int[NUMBERS_CAPACITY];

    public int total = DEFAULT_EMPTY_STACK_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_EMPTY_STACK_VALUE;
    }

    public boolean isFull() {
        return total == DEFAULT_FULL_STACK_VALUE;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {

        if (callCheck())
            return -1;
        return numbers[total--];
    }

}

//Alt + left/right arrow switches between opened files