package edu.kis.vh.nursery;

import edu.kis.vh.nursery.containers.IntContainer;

public class HanoiRhymer extends CountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer(IntContainer intContainer, int totalRejected) {
        super(intContainer);
        this.totalRejected = totalRejected;
    }

    public HanoiRhymer(int totalRejected) {
        this.totalRejected = totalRejected;
    }

    public HanoiRhymer(){}

    public int reportRejected() {
        return getTotalRejected();
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected = getTotalRejected() + 1;
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }
}
