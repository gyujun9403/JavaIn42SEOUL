package week04.first.polymorphism;

public class HumanOnCar {
	public int limitedSpeed;
	
	HumanOnCar(int limitedSpeed) {
		this.limitedSpeed = limitedSpeed;
	}
	
	public void pushAccel(Car car) {
		int nowSpeed = car.getSpeed();
		if (nowSpeed + 10 > limitedSpeed) {
			System.out.println("\'지금 속도가 " + nowSpeed + "km/h니까 속도를 올리면 안되겠다...\'");
		}
		else {
			System.out.println("\'지금 속도가 " + nowSpeed + "km/h니까 속도를 올려도 되겠네.\'");
			car.setSpeed(nowSpeed + 10);
		}
	}
}
