package edu.kis.vh.nursery;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

    public DefaultCountingOutRyhmer temp = new DefaultCountingOutRyhmer();

    @Override
    public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return ret;
    }
}
