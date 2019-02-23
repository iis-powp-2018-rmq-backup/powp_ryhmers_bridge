package edu.kis.vh.nursery.containers;

// użycie klawisza ctrl oraz kursora myszki pozwala przejść zarówno do deklaracji
// jak i implementacji

public class IntArrayStack implements IntContainer {
    static final int CAPACITY = 12;
    int TOTAL = -1;
    int[] numbers = new int[CAPACITY];

    public IntArrayStack() {
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++TOTAL] = in;
    }

    public boolean callCheck() {
        return TOTAL == EMPTY;
    }

    public boolean isFull() {
        return TOTAL == 11;
    }

    public int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[TOTAL];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[TOTAL--];
    }

    public int getTotal() {
        return TOTAL;
    }
}