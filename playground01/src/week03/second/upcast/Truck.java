package week03.second.upcast;

public class Truck extends Car {
	private String kind; 
	private int loadageWeight;
	
	Truck (String owner, String kind) {
		super(owner);
		this.kind = kind;
	}
	
	public void setLoadageWeight(int loadageWeight) {
		this.loadageWeight = loadageWeight;
	}
	
	public int getloadageWeight() {
		return loadageWeight;
	}
	
	@Override
	public void showInfo() {
		System.out.println(">> This " + kind + " truck's owner is " + getOwner());
	}
}
