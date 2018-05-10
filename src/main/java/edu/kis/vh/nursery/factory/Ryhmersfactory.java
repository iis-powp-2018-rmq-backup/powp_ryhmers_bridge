package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRyhmer;

public interface Ryhmersfactory {

    defaultCountingOutRyhmer GetStandardRyhmer();

    defaultCountingOutRyhmer GetFalseRyhmer();

    defaultCountingOutRyhmer GetFIFORyhmer();

    defaultCountingOutRyhmer GetHanoiRyhmer();

}
