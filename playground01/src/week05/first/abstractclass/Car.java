package week05.first.abstractclass;

public abstract class Car {
	static public String maker = "KIA";
	private String owner;
	private int loadageWeight;
	
	protected Car(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	protected void setLoadage(int loadageWeight) {
		this.loadageWeight = loadageWeight;
	}
	
	public int getLoadage() {
		return loadageWeight;
	}
}
