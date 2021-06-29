package week03.second.upcast;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("Truck myTruck = new Truck(\"gyeon\", \"pickup\")");
		Truck myTruck = new Truck("gyeon", "pickup");
		myTruck.setLoadageWeight(100);
		System.out.println(myTruck.getloadageWeight());
		myTruck.showInfo();
		
		Car myCar = myTruck;
		System.out.println("\nCar myCar = myTruck");
		/* myCar.setLoadageWeight(100);
		** "The method setLoadageWeight(int) is undefined for the type Car"
		** error occur
		*/
		myCar.showInfo();
	}

}
