package week05.second.intefaceengine;

public class CarTest {

	public static void main(String[] args) {
		SportCar mySportCar = new SportCar(new HyundaiEngine(), new KumhoTire());
		mySportCar.moveTo(2);
		mySportCar.ChangeTire(new HankookTire());
		mySportCar.moveTo(2);
	}

}
