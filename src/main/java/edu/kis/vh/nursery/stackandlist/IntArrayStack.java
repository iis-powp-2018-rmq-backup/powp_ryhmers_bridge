package edu.kis.vh.nursery.stackandlist;

public class IntArrayStack implements IntDataStructure {
    private final int CAPACITY = 12;
    private final int EMPTY_STACK_VALUE = -1;    
    private int[] NUMBERS = new int[CAPACITY];    
    private int total = EMPTY_STACK_VALUE;

    @Override
    public void countIn(final int in) {
        if (!isFull()) {
            getNUMBERS()[++total] = in;
        }
    }
    
    @Override
    public boolean callCheck() {
        return total == getEMPTY_STACK_VALUE();
    }

    @Override
    public boolean isFull() {
        return total == 11;
    }

    @Override
    public int peekaboo() {
        if (callCheck()) {
            return getEMPTY_STACK_VALUE();
        }
        return getNUMBERS()[total];
    }

    @Override
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
