package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.Stack;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

    private DefaultCountingOutRyhmer temp = new DefaultCountingOutRyhmer();

    public FIFORyhmer() {
    }

    public FIFORyhmer(Stack stack) {
        super(stack);
    }

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        final int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
