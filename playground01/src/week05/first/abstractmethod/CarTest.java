package week05.first.abstractmethod;

public class CarTest {

	public static void main(String[] args) {
		Truck myTruck = new Truck("gyeon");
		SportCar mySportCar = new SportCar("gyeon");
		
		myTruck.setLoadage(1500);
		myTruck.setPassengeNumber(4);
		mySportCar.setLoadage(10);
		mySportCar.setPassengeNumber(3);
	}

}
