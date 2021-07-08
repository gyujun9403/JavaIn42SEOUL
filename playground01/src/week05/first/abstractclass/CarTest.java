package week05.first.abstractclass;

public class CarTest {

	public static void main(String[] args) {
		// Car car = new Car("gyeon");
		// 'Cannot instantiate the type Car' error occur
		Truck myTruck = new Truck("gyeon");
		myTruck.getOwner();
		myTruck.setLoadage(15001);
		myTruck.setLoadage(15000);
		System.out.println("현재 트럭의 적재 무게 : " + myTruck.getLoadage() + "kg");
		System.out.println("이 차량들은 " + Car.maker + "에서 생산되었습니다.");
	}

}
