package week03.second.inheritance;

public class Car {
	private String owner;
	private int speed;
	
	Car(String owner) {
		this.owner = owner;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getOwner() {
		return owner;
	}
}
