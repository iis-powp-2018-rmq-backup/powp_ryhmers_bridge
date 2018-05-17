package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

public interface Rhymersfactory {

    public defaultCountingOutRhymer GetStandardRhymer();

    public defaultCountingOutRhymer GetFalseRhymer();

    public defaultCountingOutRhymer GetFIFORhymer();

    public defaultCountingOutRhymer GetHanoiRhymer();

    // Alt + <- i alt + -> pozwalają przechodzic pomiedzy ostatnio modyfikowanymi klasami
}
