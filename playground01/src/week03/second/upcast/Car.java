package week03.second.upcast;

public class Car {
	private String owner;
	
	Car (String owner) {
		this.owner = owner;
	}
	public String getOwner() {
		return owner;
	}
	public void showInfo() {
		System.out.println(">> This car's owner is " + owner);
	}
}
