package edu.kis.vh.nursery;

/**
 * Class is which responsible for total rejected, extends DefaultCountingOutRhymer
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {
    /**
     * Private variable responsible for total rejected
     */
    private int totalRejected = 0;

    /**
     * Public metod which return total rejected
     * @return totalRejected
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Override method which count total rejected
     * @param in int variable
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) {
            totalRejected++;
        } else {
            super.countIn(in);
        }
    }
}
//Kombinacja klawiszy alt+<- lub alt+-> : zmienia położenie kursora na jego poprzednie położenie