package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.Stack;

public class HanoiRyhmer extends DefaultCountingOutRyhmer {

    private int totalRejected = 0;

    int reportRejected() {
        return totalRejected;
    }

    public HanoiRyhmer() {
    }

    public HanoiRyhmer(Stack stack) {
        super(stack);
    }

    @Override
    public void countIn(final int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
