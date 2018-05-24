package edu.kis.vh.nursery;

import edu.kis.vh.nursery.utility.StackImplementation;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public FIFORhymer() {
        super();
    }

    public FIFORhymer(StackImplementation stack) {
        super(stack);
    }

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck()) {
            temp.countIn(super.countOut());
        }

        final int ret = temp.countOut();

        while (!temp.callCheck()) {
            countIn(temp.countOut());
        }

        return ret;
    }
}
