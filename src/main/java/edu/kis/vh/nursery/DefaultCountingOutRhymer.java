package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.StackImplementation;

public class DefaultCountingOutRhymer {

    private StackImplementation stack;

    public DefaultCountingOutRhymer() {
        this.stack = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(StackImplementation stack) {
        this.stack = stack;
    }

    public int getTotal() {
        return stack.getTotal();
    }

    protected int peekaboo() {
        return stack.top();
    }

    public void countIn(int in) {
        stack.push(in);
    }

    public boolean callCheck() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int countOut() {
        return stack.pop();
    }

    /**
     * W komentarzu w klasie DefaultCountingOutRyhmer napisz jakie są konsekwencje zmiany omówionej w poprzednim punkcie
     * 
     * Konsekwencją zmian jest czytelniejszy i bardziej zrozumiały kod
     *
     *
     */
}
