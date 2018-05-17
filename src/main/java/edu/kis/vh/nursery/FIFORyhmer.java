package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackandlist.IntArrayStack;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

    private DefaultCountingOutRyhmer defaultCountingOutRyhmer = new DefaultCountingOutRyhmer();

    public FIFORyhmer(IntArrayStack intArrayStack) {
        super(intArrayStack);
    }

    public FIFORyhmer() {
    }

    @Override
    public int countOut() {
        while (!callCheck()) {
            defaultCountingOutRyhmer.countIn(super.countOut());
        }

        int totalAfterCountOut = defaultCountingOutRyhmer.countOut();

        while (!defaultCountingOutRyhmer.callCheck()) {
            countIn(defaultCountingOutRyhmer.countOut());
        }

        return totalAfterCountOut;
    }
}
