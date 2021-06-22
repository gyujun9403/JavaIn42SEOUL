package week02.first.constructor03;

public class KiaSorento {
	private String color;
	private	String useage;
	private	boolean navigation;
	KiaSorento(String useage) {
		/* this()는 "무조건" 생성자의 가장 첫 줄에 선언되어야 한다. 그렇지 않으면,
		 * "Constructor call must be the first statement in a constructor"
		 * 라고 경고한다.
		*/
		this(useage, "White");
		System.out.println("first constructor called");
	}
	KiaSorento(String useage, String color) {
		this(useage, color, false);
		System.out.println("second constructor called");
	}
	KiaSorento(String useage, String color, boolean navigation) {
		this.useage = useage;
		this.color = color;
		this.navigation = navigation;
		System.out.println("third constructor called");
	}
	public void showProperty() {
		System.out.print(">> " + color + " sorento " + useage);
		if (this.navigation == true)
			System.out.print(" have navigation.");
		else
			System.out.print(" don't have navigation.");
	}
}
