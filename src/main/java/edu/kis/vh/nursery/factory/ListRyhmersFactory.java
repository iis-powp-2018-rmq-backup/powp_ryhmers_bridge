package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRyhmer;
import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntLinkedList;

public class ListRyhmersFactory implements RyhmersFactory {
    @Override
    public DefaultCountingOutRyhmer getStandardRyhmer() {
        return new DefaultCountingOutRyhmer(new IntLinkedList());
    }

    @Override
    public DefaultCountingOutRyhmer getFalseRyhmer() {
        return new DefaultCountingOutRyhmer(new IntArrayStack());
    }

    @Override
    public DefaultCountingOutRyhmer getFIFORyhmer() {
        return new DefaultCountingOutRyhmer(new IntLinkedList());
    }

    @Override
    public DefaultCountingOutRyhmer getHanoiRyhmer() {
        return new DefaultCountingOutRyhmer(new IntLinkedList());
    }
}
