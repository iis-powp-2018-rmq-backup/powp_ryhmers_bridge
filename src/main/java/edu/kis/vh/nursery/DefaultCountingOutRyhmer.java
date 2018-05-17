package edu.kis.vh.nursery;

public class DefaultCountingOutRyhmer {
	private IntArrayStack stack;
	
	public DefaultCountingOutRyhmer() {
		stack = new IntArrayStack();
	}

	public DefaultCountingOutRyhmer(IntArrayStack stack) {
		super();
		this.stack = stack;
	}

	public int getTotal() {
		return stack.getTotal();
	}

	public void countIn(int in) {
		stack.countIn(in);
	}

	public boolean callCheck() {
		return stack.callCheck();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int countOut() {
		return stack.countOut();
	}

	protected int peekaboo() {
		return stack.peekaboo();
	}
	
	
	
	
	
}

// przeskakiwanie pomiedzy miejscami ktore ostatnio edytowalismy strzałka w lewo powoduje przejscie w przod histori a w prawo do tyłu


