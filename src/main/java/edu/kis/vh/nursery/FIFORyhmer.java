package edu.kis.vh.nursery;


import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntStackInterface;

public class FIFORyhmer extends DefaultCountingOutRyhmer {

    private final IntArrayStack temp = new IntArrayStack();
    //Tablica bedzie zajmowac mniej pamieci niz lista, nie potrzebuje zawierac wskaznikow na poprzedni i nastepny element
    public FIFORyhmer(IntStackInterface intLinkedList) {
        super(intLinkedList);
    }

    public FIFORyhmer() {
    }

    @Override
    public int countOut() {
        while (!callCheck())

            temp.push(super.countOut());

        final int ret = temp.pop();

        while (!temp.isEmpty())

            countIn(temp.pop());

        return ret;
    }
}
