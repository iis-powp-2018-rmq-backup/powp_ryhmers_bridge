package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackandlist.IntArrayStack;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

    private DefaultCountingOutRyhmer defaultCountingOutRyhmer = new DefaultCountingOutRyhmer();

    public FIFORyhmer(IntArrayStack intArrayStack) {
        super(intArrayStack);
    }

    public FIFORyhmer() {
    }

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

//it's better to keep it a a DefaultCountingOutRhymer and make the changes 
//in that class. This saves a lot of time and effort.