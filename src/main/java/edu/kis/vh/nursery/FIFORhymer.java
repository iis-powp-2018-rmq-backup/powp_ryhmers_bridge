package edu.kis.vh.nursery;

import edu.kis.vh.nursery.containers.IntContainer;

/**
 *  @author Łukasz Okrąglewski
 *  @see edu.kis.vh.nursery.CountingOutRhymer
 */
public class FIFORhymer extends CountingOutRhymer {

    private CountingOutRhymer temp;

    public FIFORhymer(IntContainer intContainer, CountingOutRhymer temp) {
        super(intContainer);
        this.temp = temp;
    }

    public FIFORhymer(IntContainer intContainer) {
        super(intContainer);
    }

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
