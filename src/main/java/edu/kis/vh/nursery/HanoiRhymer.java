package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.Container;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer(Container container) {
        super(container);
    }

    public HanoiRhymer() {

    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    /*W intelij:
        alt + ctrl + strzałka, przenosi miedzy ostatnimi pozycjami kursorów
        alt + shitf + backspace, przenosi w miejsce ostatniej edycji

     */
}
