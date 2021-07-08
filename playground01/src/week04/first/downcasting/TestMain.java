package week04.first.downcasting;

public class TestMain {

	public static void main(String[] args) {
		Parent parent = new Child();
		System.out.println(parent.s);
		Child child = (Child)parent;
		System.out.println(child.s);
	}

}
