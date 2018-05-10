package edu.kis.vh.nursery;

public class FIFORyhmer extends defaultCountingOutRyhmer {

    public defaultCountingOutRyhmer temp = new defaultCountingOutRyhmer();

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
