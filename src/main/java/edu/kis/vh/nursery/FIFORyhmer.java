package edu.kis.vh.nursery;

/**
 *
 * @author 204641
 */
public class FIFORyhmer extends DefaultCountingOutRyhmer {

    private DefaultCountingOutRyhmer defaultCountingOutRyhmer = new DefaultCountingOutRyhmer();

    /**
     *
     * @return stack count after taking out an element
     */
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
