package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {

    public DefaultCountingOutRyhmer(IntArrayStack IntArrayStack) {
        this.IntArrayStack = IntArrayStack;
    }

    public DefaultCountingOutRyhmer(){
        super();
        this.IntArrayStack = new IntArrayStack();
    }

    public void countIn(int in) {
        IntArrayStack.countIn(in);
    }

    public boolean callCheck() {
        return IntArrayStack.callCheck();
    }

    public boolean isFull() {
        return IntArrayStack.isFull();
    }

    public int peekaboo() {
        return IntArrayStack.peekaboo();
    }

    public int countOut() {
        return IntArrayStack.countOut();
    }

    private IntArrayStack IntArrayStack;

}
