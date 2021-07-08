package week05.first.stack;

public class StackTest {

	public static void main(String[] args) {
		ArrayStack arrStack = new ArrayStack();
		ListStack listStack = new ListStack();
		
		for (int i = 0; i < 5; i++) {
			arrStack.push(i);
			listStack.push(i);
		}
		System.out.println("----------arr1----------");
		arrStack.popAll();
		System.out.println("----------list1----------");
		listStack.popAll();
		for (int i = 0; i < 10; i++) {
			arrStack.push(i);
			listStack.push(i);
		}
		arrStack.randomSet(7);
		listStack.randomSet(6);
		System.out.println("----------arr2----------");
		arrStack.popAll();
		System.out.println("----------arr2----------");
		listStack.popAll();
	}

}
