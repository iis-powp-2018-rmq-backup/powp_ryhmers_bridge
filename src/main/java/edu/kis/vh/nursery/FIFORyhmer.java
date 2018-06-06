package edu.kis.vh.nursery;

public class FIFORyhmer extends CountingOutRyhmer {

    public CountingOutRyhmer temp = new CountingOutRyhmer();

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());
        int result = temp.countOut();
        while (!temp.callCheck())
            countIn(temp.countOut());
        return result;
    }
}
