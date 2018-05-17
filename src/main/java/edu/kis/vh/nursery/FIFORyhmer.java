package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntStackInterface;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

    private final DefaultCountingOutRyhmer temp = new DefaultCountingOutRyhmer();

    public FIFORyhmer(IntStackInterface list) {
        super(list);
    }

    public FIFORyhmer() {
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
