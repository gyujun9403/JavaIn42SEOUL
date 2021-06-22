package week02.first.constructor02;

public class Macbook {
	private String owner;
	private String color;
	Macbook(String owner) {			//default 생성자가 없다. 
		this.owner = owner;			  //그러므로 생성자를 호출하기 위해서는
		this.color = "spacegray";	//무조건 owner를 입력해주어야 한다.
		System.out.println("first constructor called");
	}
	Macbook(String owner, String color) {	//String매개변수가 2개인 
		this.owner = owner;					        //생성자를 호출할 경우
		this.color = color;					        //이 생성자가 호출된다.
		System.out.println("second constructor called");
	}
	public void showProperty() {
		System.out.println(">> Color of " + owner + "'s macbook is " + color);
	}
}
