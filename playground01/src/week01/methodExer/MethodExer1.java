package week01.methodExer;

public class MethodExer1 {
	private int ft;
	MethodExer1() {
		ft = 42;
	}
	public void addft(int a) {
		//정적 클래스가 아닌 이상, 인스턴스화 없이 멤버에 접근 불가.
		//System.out.print(a + MethodExer2.returnft());
		MethodExer2 ft = new MethodExer2();
		System.out.println(a + ft.returnft());
		System.out.println(a + this.ft);
	}
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	public void add(String a, String b) {
		System.out.println(a + b);
	}
}
