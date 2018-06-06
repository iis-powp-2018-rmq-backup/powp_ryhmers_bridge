package edu.kis.vh.nursery;

public class HanoiRhymer extends CountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return getTotalRejected();
    }

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
