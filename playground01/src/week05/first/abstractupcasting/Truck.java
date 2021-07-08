package week05.first.abstractupcasting;

public class Truck extends Car{
	private int loadage;
	
	Truck(String owner) {
		super(owner);
	}
	
	public void showInfo() {
		System.out.println("이 트럭의 주인은 " + getOwner() + "입니다.");
	}
	
	public void setLoadage(int loadage) {
		this.loadage = loadage;
	}
	
	public void showLoadage() {
		System.out.println("현재 적재량 : " + loadage);
	}
}
