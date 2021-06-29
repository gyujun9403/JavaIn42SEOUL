package week04.first.polymorphism;

public class Sport extends Car{
	@Override
	public void setSpeed(int speed) {
		System.out.println(">> Sport's setSpeed called");
		super.setSpeed(speed);
	}
}
