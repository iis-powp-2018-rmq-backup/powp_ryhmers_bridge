package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedListInterface;

public class HanoiRyhmer extends DefaultCountingOutRyhmer {

    private int totalRejected = 0;

    public HanoiRyhmer() {

    }

    public HanoiRyhmer(IntLinkedListInterface intLinkedListInterface) {
        super(intLinkedListInterface);
    }
    int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
