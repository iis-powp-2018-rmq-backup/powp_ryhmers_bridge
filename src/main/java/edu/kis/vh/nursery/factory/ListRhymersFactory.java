package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntLinkedList;

public class ListRhymersFactory implements Rhymersfactory {
    @Override
    public DefaultCountingOutRhymer getStandardRyhmer() {
        return new DefaultCountingOutRhymer(new IntLinkedList());
    }

    @Override
    public DefaultCountingOutRhymer getFalseRyhmer() {
        return new DefaultCountingOutRhymer(new IntArrayStack());
    }

    @Override
    public DefaultCountingOutRhymer getFIFORyhmer() {
        return new DefaultCountingOutRhymer(new IntLinkedList());
    }

    @Override
    public DefaultCountingOutRhymer getHanoiRyhmer() {
        return new DefaultCountingOutRhymer(new IntLinkedList());
    }
}