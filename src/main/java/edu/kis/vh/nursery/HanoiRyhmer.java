package edu.kis.vh.nursery;

public class HanoiRyhmer extends DefaultCountingOutRyhmer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

//alt + -> : przelacza sie na otworzony plik po prawej, jesli zadnego nie ma, wlacza ostatni zamkniety
//alt + <- : przelacza sie na otworzony plik po lewej
//oraz pare innych nieskoordynowanych rzeczy
