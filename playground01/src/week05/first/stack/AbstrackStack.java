package week05.first.stack;

public abstract class AbstrackStack {
	protected int topIndex;
	
	public boolean isEmpty() {
		return (topIndex == 0);
	}
	
	public abstract void push(int value);
	public abstract int pop();
	public abstract int peek();
	
	public final void randomSet(int setNumber) {
		while (!isEmpty())
			pop();
		for (int i = 0; i < setNumber; i++)
			push((int)(Math.random()*100));
	}
	public final void popAll() {
		while (!isEmpty())
			System.out.println(pop());
	}
}
