package week04.first.polymorphism;

public class CarTest {

	public static void main(String[] args) {
		Truck myTruck = new Truck();
		Sport mySport = new Sport();
		HumanOnCar me = new HumanOnCar(80);
		
		for (int i = 0; i < 10; i++)
			me.pushAccel(myTruck);
		for (int i = 0; i < 10; i++)
			me.pushAccel(mySport);
	}

}
