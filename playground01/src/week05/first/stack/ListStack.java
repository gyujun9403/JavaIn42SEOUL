package week05.first.stack;

import java.util.ArrayList;

public class ListStack extends AbstrackStack{
	ArrayList<Integer> arrList = new ArrayList<Integer>();

	@Override
	public void push(int value) {
		arrList.add(value);
		++topIndex;
	}

	@Override
	public int pop() {
		if (isEmpty())
			return -1;
		else {
			int temp = arrList.get(topIndex - 1);
			arrList.remove(--topIndex);
			return temp;
		}
	}

	@Override
	public int peek() {
		if(isEmpty())
			return -1;
		else
			return arrList.get(topIndex - 1);
	}
}
