package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int IS_EMPTY_TOTAl = -1;
    private static final int CAPACITY = 11;
    private int[] NUMBERS = new int[12];

    public static int getIS_EMPTY_TOTAl() {
        return IS_EMPTY_TOTAl;
    }

    public static int getCAPACITY() {
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

    public boolean callCheck() {
        return total == getIS_EMPTY_TOTAl();
    }

    public boolean isFull() {
        return total == getCAPACITY();
    }

    protected int peekaboo() {
        if (callCheck())
            return getIS_EMPTY_TOTAl();
        return getNUMBERS()[total];
    }

    public int countOut() {
        if (callCheck())
            return getIS_EMPTY_TOTAl();
        return getNUMBERS()[total--];
    }

    public int[] getNUMBERS() {
        return NUMBERS;
    }

    public void setNUMBERS(int[] NUMBERS) {
        this.NUMBERS = NUMBERS;
    }
}
