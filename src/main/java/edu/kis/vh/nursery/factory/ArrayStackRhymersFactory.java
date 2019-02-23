package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.CountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.containers.IntArrayStack;
import edu.kis.vh.nursery.containers.IntLinkedList;

public class ArrayStackRhymersFactory implements RhymersFactory {
    @Override
    public CountingOutRhymer getStandardRhymer() {
        return new CountingOutRhymer(new IntArrayStack());
    }

    public CountingOutRhymer getFalseRhymer() {
        return new CountingOutRhymer(new IntLinkedList());
    }

    @Override
    public CountingOutRhymer getFIFORhymer() {
        return new FIFORhymer(new IntArrayStack());
    }

    @Override
    public CountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer(new IntArrayStack());
    }
}
