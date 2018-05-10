package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] NUMBERS = new int[12];

    public int totalIfEmpty = -1;

    public void countIn(int in) {
        if (!isFull()) {
            NUMBERS[++totalIfEmpty] = in;
        }
    }

    public boolean callCheck() {
        return totalIfEmpty == -1;
    }

    public boolean isFull() {
        return totalIfEmpty == 11;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return -1;
        }
        return NUMBERS[totalIfEmpty];
    }

    public int countOut() {
        if (callCheck()) {
            return -1;
        }
        return NUMBERS[totalIfEmpty--];
    }

}
