package edu.kis.vh.nursery;

public class FIFORhymer extends CountingOutRhymer {

    private CountingOutRhymer temp = new CountingOutRhymer();

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
