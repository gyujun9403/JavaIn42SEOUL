package week03.second.inheritance;

public class Test {

	public static void main(String[] args) {
		Truck myTruck = new Truck("gyeon");
		System.out.println(">> " + myTruck.getOwner());
		myTruck.setSpeed(100);
		System.out.println(">> " + myTruck.getSpeed() + "km/h");
		myTruck.setLoadage("books");
		System.out.println(">> " + myTruck.getLoadage());
	}

}
