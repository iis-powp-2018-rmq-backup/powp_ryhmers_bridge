package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

    private static final int CAPACITY = 12;
    private static final int IS_EMPTY_INDICATOR = -1;
    private int[] numbers = new int[getCAPACITY()]; // dostep do zmiennej odbywa sie poprzez funkcje get i set

    public static int getCAPACITY() {
        return CAPACITY;
    }

    public static int getIsEmptyIndicator() {
        return IS_EMPTY_INDICATOR;
    }

    public int getTotal() {
        return total;
    }
    
    private int total = getIsEmptyIndicator();

    public void countIn(final int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    boolean callCheck() {
        return total == getIsEmptyIndicator();
    }

    boolean isFull() {
        return total == getCAPACITY() -1;
    }

    int peekaboo() {
        if (callCheck())
            return getIsEmptyIndicator();
        return getNumbers()[total];
    }

    public int countOut() {
        if (callCheck())
            return getIsEmptyIndicator();
        return getNumbers()[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }

}
