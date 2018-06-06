package edu.kis.vh.nursery;
/**
 *  @author Łukasz Okrąglewski
 *  @see edu.kis.vh.nursery.CountingOutRhymer
 */
public class FIFORhymer extends CountingOutRhymer {

    private CountingOutRhymer temp = new CountingOutRhymer();
    /**
     * @return values from FIFORhymer
     */
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
