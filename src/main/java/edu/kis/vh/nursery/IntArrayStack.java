package edu.kis.vh.nursery;

public class IntArrayStack {

    private final IntArray intArray = new IntArray();

    public IntArrayStack() {
    }

    public IntArrayStack(int total, int[] NUMBERS) {
        this.intArray.total = total;
        this.intArray.NUMBERS = NUMBERS;
    }

    public void countIdelen(int in) {
        intArray.countIdelen(in);
    }

    public boolean callCheck() {
        return intArray.callCheck();
    }

    public boolean isFull() {
        return intArray.isFull();
    }

    protected int peekaboo() {
        return intArray.peekaboo();
    }

    public int countOut() {
        return intArray.countOut();
    }

    public int getTotal() {
        return intArray.getTotal();
    }
}
