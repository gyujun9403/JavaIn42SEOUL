package week05.first.abstractupcasting;

public abstract class Car {
	private String owner;
	
	Car (String owner) {
		this.owner = owner;
	}
	
	public abstract void showInfo();
	
	protected String getOwner() {
		return owner;
	}
}
