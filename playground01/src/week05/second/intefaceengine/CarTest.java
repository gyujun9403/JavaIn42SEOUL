package week05.second.intefaceengine;

public class CarTest {

	public static void main(String[] args) {
		SportCar mySportCar = new SportCar(new HEngine(), new KTire());
		mySportCar.moveTo(2);
		mySportCar.ChangeTire(new HTire());
		mySportCar.moveTo(2);
	}

}
