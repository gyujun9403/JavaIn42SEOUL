package week02.first.constructor01;

public class ConstructorTest01 {
	private int ft;
	ConstructorTest01() {
		System.out.println("co nstructor called");
		ft = 42;
	}
	public void showProperty() {
		System.out.println(">> ft : " + ft);
	}
}