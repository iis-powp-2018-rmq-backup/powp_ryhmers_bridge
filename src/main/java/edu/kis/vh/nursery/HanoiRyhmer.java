package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackandlist.IntArrayStack;

public class HanoiRyhmer extends DefaultCountingOutRyhmer {

    private int totalRejected = 0;

    public HanoiRyhmer(IntArrayStack intArrayStack) {
        super(intArrayStack);
    }

    public HanoiRyhmer() {
    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(final int in) {
        if (!callCheck() && in > peekaboo()) {
            totalRejected++;
        } else {
            super.countIn(in);
        }
    }
}
