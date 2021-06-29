package week03.second.inheritance;

public class Truck extends Car{
	public String loadage;
	Truck(String owner) {
		super(owner);
	}
	public String getLoadage() {
		return loadage;
	}
	
	public void setLoadage(String loadage) {
		this.loadage = loadage;
	}
}
