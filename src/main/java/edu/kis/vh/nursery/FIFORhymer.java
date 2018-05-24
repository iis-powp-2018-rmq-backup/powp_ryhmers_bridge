package edu.kis.vh.nursery;

import edu.kis.vh.nursery.utility.IntArrayStack;
import edu.kis.vh.nursery.utility.StackImplementation;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public FIFORhymer() {
        super();
    }

    public FIFORhymer(StackImplementation stack) {
        super(stack);
    }

    private final IntArrayStack temp = new IntArrayStack();

    @Override
    public int countOut() {
        while (!callCheck()) {
            temp.push(super.countOut());
        }

        final int ret = temp.pop();

        while (!temp.isEmpty()) {
            countIn(temp.pop());
        }

        return ret;
    }

    /**
     * W celu optymalizacji w klasie FIFORyhmer zmień atrybut temp na stos z hierarchii implementacji. Jaki wybór będzie
     * najlepszy (napisz komentarz)?
     *
     * FIFO- first in first out. Oczywistym wyborem jest lista, ponieważ usunięcie elementu z listy jest o wiele tańsze
     * niz z tablicy
     */
}
