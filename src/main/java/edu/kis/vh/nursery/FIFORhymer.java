package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntLinkedListInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private IntArrayStack temp = new IntArrayStack();

    public FIFORhymer(IntLinkedListInterface intLinkedListInterface) {
        super(intLinkedListInterface);
    }

    public FIFORhymer()
    {

    }

    @Override
    public int countOut() {
        while (!callCheck())
            temp.push(super.countOut());
        int ret = temp.pop();
        while (!temp.isEmpty())
            countIn(temp.pop());
        return ret;
    }
}