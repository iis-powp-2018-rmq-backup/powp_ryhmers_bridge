package edu.kis.vh.nursery;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

    private DefaultCountingOutRyhmer defaultCountingOutRyhmer = new DefaultCountingOutRyhmer();

    @Override
    public int countOut() {
        while (!callCheck()) {
            defaultCountingOutRyhmer.countIn(super.countOut());
        }

        int totalAfterCountOut = defaultCountingOutRyhmer.countOut();

        while (!defaultCountingOutRyhmer.callCheck()) {
            countIn(defaultCountingOutRyhmer.countOut());
        }

        return totalAfterCountOut;
    }
}
