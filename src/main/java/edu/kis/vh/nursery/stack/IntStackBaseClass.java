package edu.kis.vh.nursery.stack;

import lombok.Getter;

abstract class IntStackBaseClass implements IStackImplementation {
    @Getter
    protected int total;

    protected int totalMax;
    protected final static int EMPTY_STRUCT_CODE = 0;
    // Przeniesienie danych do klasy abstrakcyjnej okazało się przydatne.
    // Wartość zmiennej wystarczyło zmienić tylko w jednym miejscu.
    IntStackBaseClass () {
        total = EMPTY_STRUCT_CODE;
        totalMax = 11;
    }

    @Override
    public boolean isFull() {
        return total == totalMax;
    }

}
