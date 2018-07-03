package edu.kis.vh.nursery;

// kombinacja klawiszy alt + ← oraz → nawiguje pomiedzy otwartymi klasami
public class CountingOutRhymer {

    private IntArray intArray;

    public CountingOutRhymer(IntArray intArray) {
        this.intArray = intArray;
    }

    public CountingOutRhymer() {
    }


    public void countIn(int in) {
        intArray.countIn(in);
    }

    public boolean callCheck() {
        return intArray.callCheck();
    }

    public boolean isFull() {
        return intArray.isFull();
    }

    public int peekaboo() {
        return intArray.peekaboo();
    }

    public int countOut() {
        return intArray.countOut();
    }

    public int getTotal() {
        return intArray.getTotal();
    }
}
