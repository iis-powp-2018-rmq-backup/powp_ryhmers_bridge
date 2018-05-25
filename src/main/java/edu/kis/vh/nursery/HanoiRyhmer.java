package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackandlist.IntDataStructure;

public class HanoiRyhmer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRyhmer(IntDataStructure intDataStructure) {
        super(intDataStructure);
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
