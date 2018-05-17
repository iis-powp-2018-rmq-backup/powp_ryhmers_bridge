package edu.kis.vh.nursery.list;

public class IntArrayStack {
    private final int CAPACITY = 12;
    private final int EMPTY_STACK_VALUE = -1;    
    private int[] NUMBERS = new int[CAPACITY];    
    private int total = EMPTY_STACK_VALUE;

    public void countIn(final int in) {
        if (!isFull()) {
            getNUMBERS()[++total] = in;
        }
    }

    public boolean callCheck() {
        return total == getEMPTY_STACK_VALUE();
    }

    public boolean isFull() {
        return total == 11;
    }

    public int peekaboo() {
        if (callCheck()) {
            return getEMPTY_STACK_VALUE();
        }
        return getNUMBERS()[total];
    }

    public int countOut() {
        if (callCheck()) {
            return getEMPTY_STACK_VALUE();
        }
        return getNUMBERS()[total--];
    }

    public int getTotal() {
        return total;
    }

    /**
     * @return the CAPACITY
     */
    public int getCAPACITY() {
        return CAPACITY;
    }

    /**
     * @return the EMPTY_STACK_VALUE
     */
    public int getEMPTY_STACK_VALUE() {
        return EMPTY_STACK_VALUE;
    }

    /**
     * @return the NUMBERS
     */
    public int[] getNUMBERS() {
        return NUMBERS;
    }

}
