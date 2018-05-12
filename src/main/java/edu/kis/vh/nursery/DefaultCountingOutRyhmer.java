package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {
    private final int CAPACITY = 12;
    private final int EMPTY_STACK_VALUE = -1;    
    private int[] NUMBERS = new int[CAPACITY];    
    private int total = EMPTY_STACK_VALUE;

    public void countIn(int in) {
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

    /**
     * @param NUMBERS the NUMBERS to set
     */
    public void setNUMBERS(int[] NUMBERS) {
        this.NUMBERS = NUMBERS;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

}
