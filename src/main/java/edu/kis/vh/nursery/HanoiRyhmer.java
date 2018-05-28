package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntStackInterface;

public class HanoiRyhmer extends DefaultCountingOutRyhmer {

    private int totalRejected = 0; // dostep do zmiennej odbywa sie poprzez funkcje get i set

    public HanoiRyhmer() {
    }

    public HanoiRyhmer(IntStackInterface intLinkedList) {
        super(intLinkedList);
    }

    int reportRejected() {
        return getTotalRejected();
    }

    @Override
    public void countIn(final int in) {
        if (!callCheck() && in > peekaboo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

    public void setTotalRejected(final int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
// Alt + --> lub Alt + <-- dziala w pozwala na pominiecie calego słowa