package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int IS_EMPTY_TOTAl = -1;
    private static final int CAPACITY = 11;
    private int[] NUMBERS = new int[12];

    private static int getIS_EMPTY_TOTAl() {
        return IS_EMPTY_TOTAl;
    }

    private static int getCAPACITY() {
        return CAPACITY;
    }

    public int getTotal() {
        return total;
    }

    private int total = getIS_EMPTY_TOTAl();

    public void countIn(int in) {
        if (!isFull())
            getNUMBERS()[++total] = in;
    }

    boolean callCheck() {
        return total == getIS_EMPTY_TOTAl();
    }

    boolean isFull() {
        return total == getCAPACITY();
    }

    int peekaboo() {
        if (callCheck())
            return getIS_EMPTY_TOTAl();
        return getNUMBERS()[total];
    }

    public int countOut() {
        if (callCheck())
            return getIS_EMPTY_TOTAl();
        return getNUMBERS()[total--];
    }

    private int[] getNUMBERS() {
        return NUMBERS;
    }

}
