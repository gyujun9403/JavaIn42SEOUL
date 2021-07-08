package week05.first.stack;

public class ArrayStack extends AbstrackStack{
	protected int capacity;
	int[] arr;
	
	ArrayStack() {
		capacity = 10;
		arr = new int[capacity];
	}

	@Override
	public void push(int value) {
		if(topIndex == capacity) {
			capacity *= 2;
			int[] newArr = new int[capacity];
			for(int i = 0; i < topIndex; i++)
				newArr[i] = arr[i];
			arr = newArr;
		}
		arr[topIndex++] = value;
	}

	@Override
	public int pop() {
		if(isEmpty())
			return -1;
		else
			return arr[--topIndex];
	}

	@Override
	public int peek() {
		if(isEmpty())
			return -1;
		else
			return arr[topIndex - 1];
	}
}
