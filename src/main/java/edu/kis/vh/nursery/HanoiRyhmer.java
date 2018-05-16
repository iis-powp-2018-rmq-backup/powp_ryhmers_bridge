package edu.kis.vh.nursery;

public class HanoiRyhmer extends DefaultCountingOutRyhmer {

    private int totalRejected = 0; // dostep do zmiennej odbywa sie poprzez funkcje get i set

    int reportRejected() {
        return getTotalRejected();
    }

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