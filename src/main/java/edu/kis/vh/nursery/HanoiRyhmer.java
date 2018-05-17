package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntStackInterface;

public class HanoiRyhmer extends DefaultCountingOutRyhmer {

    private int totalRejected = 0;

    public HanoiRyhmer(IntStackInterface list) {
        super(list);
    }

    public HanoiRyhmer() {
    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(final int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

//alt + -> : przelacza sie na otworzony plik po prawej, jesli zadnego nie ma, wlacza ostatni zamkniety
//alt + <- : przelacza sie na otworzony plik po lewej
//oraz pare innych nieskoordynowanych rzeczy
//IDE: IntelIJ z customowymi ustawieniami skrótów klawiszowych m.in. podobnymi do zachowania Netbeansa
