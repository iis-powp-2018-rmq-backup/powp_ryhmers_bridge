package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    int reportRejected() {
        return getTotalRejected();
    }

    public HanoiRhymer() {
    }

    public HanoiRhymer(IntLinkedList intStacks) {
        super(intStacks);
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

    private int getTotalRejected() {
        return totalRejected;
    }

    private void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
//Klawisze alt + strzałka zmieniają kartę o jedną w lewo lub w prawo