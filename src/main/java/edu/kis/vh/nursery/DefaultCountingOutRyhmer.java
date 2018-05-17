package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

    private static final int NUMBERS_CAPACITY = 12;
    private static final int DEFAULT_EMPTY_STACK_VALUE = -1;
    private static final int DEFAULT_FULL_STACK_VALUE = 11;
    private int[] numbers = new int[NUMBERS_CAPACITY];
    private IntArrayStack intArrayStack;

    private int total = DEFAULT_EMPTY_STACK_VALUE;

    public DefaultCountingOutRyhmer() {
        intArrayStack = new IntArrayStack();
    }

    public DefaultCountingOutRyhmer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    public boolean callCheck() {
        return intArrayStack.callCheck();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int peekaboo() {
        return intArrayStack.peekaboo();
    }

    public int countOut() {
        return intArrayStack.countOut();
    }

    public int getTotal() {
        return intArrayStack.getTotal();
    }
}

//Alt + left/right arrow switches between opened files