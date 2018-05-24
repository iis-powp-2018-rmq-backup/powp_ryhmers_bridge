package edu.kis.vh.nursery;

import edu.kis.vh.nursery.utility.StackImplementation;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public HanoiRhymer() {
        super();
    }

    public HanoiRhymer(StackImplementation stack) {
        super(stack);
    }

    private int totalRejected = 0;

    public int getTotalRejected() {
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

    public int reportRejected() {
        return totalRejected;
    }
}
