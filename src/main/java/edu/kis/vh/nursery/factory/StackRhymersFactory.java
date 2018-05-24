package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORyhmer;
import edu.kis.vh.nursery.HanoiRyhmer;
import edu.kis.vh.nursery.stackandlist.IntArrayStack;
import edu.kis.vh.nursery.stackandlist.IntLinkedList;

public class StackRhymersFactory implements RhymersFactory {
    @Override
    public DefaultCountingOutRhymer getStandardRyhmer() {
        return new DefaultCountingOutRhymer(new IntArrayStack());
    }

    @Override
    public DefaultCountingOutRhymer getFalseRyhmer() {
        return new DefaultCountingOutRhymer(new IntLinkedList());
    }

    @Override
    public DefaultCountingOutRhymer getFIFORyhmer() {
        return new FIFORyhmer(new IntArrayStack());
    }

    @Override
    public DefaultCountingOutRhymer getHanoiRyhmer() {
        return new HanoiRyhmer(new IntArrayStack());
    }
}