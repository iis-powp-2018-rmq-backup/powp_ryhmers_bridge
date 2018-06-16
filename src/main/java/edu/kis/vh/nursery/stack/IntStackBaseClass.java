package edu.kis.vh.nursery.stack;

import lombok.Getter;

abstract class IntStackBaseClass implements IStackImplementation {
    @Getter
    protected int total;

    protected int totalMax;
    protected final static int EMPTY_STRUCT_CODE = -1;

    IntStackBaseClass () {
        total = EMPTY_STRUCT_CODE;
        totalMax = 11;
    }

    @Override
    public boolean isFull() {
        return total == totalMax;
    }

}
