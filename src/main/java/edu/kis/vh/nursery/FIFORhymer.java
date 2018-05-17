package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.Container;
import edu.kis.vh.nursery.collections.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final IntArrayStack temp = new IntArrayStack();

    public FIFORhymer(Container container) {
        super(container);
    }

    public FIFORhymer() {
    }

    @Override

    public int countOut() {
        while (!callCheck())
            temp.push(super.countOut());

        int ret = temp.pop();

        while (!temp.callCheck())
            countIn(temp.pop());

        return ret;
    }
}
