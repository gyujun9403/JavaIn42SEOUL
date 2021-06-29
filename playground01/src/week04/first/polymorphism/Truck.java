package week04.first.polymorphism;

public class Truck extends Car{
	public int loadage;

	public int getLoadage() {
		return loadage;
	}

	public void setLoadage(int loadage) {
		this.loadage = loadage;
	}
	
	@Override
	public void setSpeed(int speed) {
		System.out.println(">> Truck's setSpeed called");
		super.setSpeed(speed);
	}
	
}
