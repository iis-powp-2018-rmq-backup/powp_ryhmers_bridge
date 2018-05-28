package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.StackInterface;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

    private DefaultCountingOutRyhmer ryhmer = new DefaultCountingOutRyhmer();

    public FIFORyhmer() {
    }

    public FIFORyhmer(StackInterface stack) {
        super(stack);
    }

    @Override protected int countOut() {
        while (!ryhmer.callCheck())

            ryhmer.countIn(super.countOut());

        final int ret = ryhmer.countOut();

        while (!ryhmer.callCheck())

            ryhmer.countIn(ryhmer.countOut());

        return ret;
    }
}
