package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackandlist.IntDataStructure;

public class FIFORyhmer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer defaultCountingOutRhymer = new DefaultCountingOutRhymer();

    public FIFORyhmer(IntDataStructure intDataStructure) {
        super(intDataStructure);
    }

    public FIFORyhmer() {
    }

    @Override
    public int countOut() {
        while (!callCheck()) {
            defaultCountingOutRhymer.countIn(super.countOut());
        }

        int totalAfterCountOut = defaultCountingOutRhymer.countOut();

        while (!defaultCountingOutRhymer.callCheck()) {
            countIn(defaultCountingOutRhymer.countOut());
        }

        return totalAfterCountOut;
    }
}

//it's better to keep it a a DefaultCountingOutRhymer and make the changes 
//in that class. This saves a lot of time and effort.