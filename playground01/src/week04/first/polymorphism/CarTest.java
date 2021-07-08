package week04.first.polymorphism;

public class CarTest {
	public static void main(String[] args) {
		Truck myTruck = new Truck();
		Sport mySport = new Sport();
		HumanOnCar me = new HumanOnCar(80);
		
		System.out.println("----[트럭 운전 중]----");
		for (int i = 0; i < 10; i++)
			me.pushAccel(myTruck);
		System.out.println("----[스포츠카 운전 중]----");
		for (int i = 0; i < 10; i++)
			me.pushAccel(mySport);
	}
	
	/*public static void main(String[] args) {
		Car myCar = new Car();
		Car yourCar = new Truck();		// 업케스팅 
		Truck myTruck = new Truck();	
		//Truck yourTruck = new Car();
		
		System.out.println("[myCar]");
		if (myCar instanceof Car)
			System.out.println("Car 클래스형으로 캐스팅 가능.");
		if (myCar instanceof Truck)
			System.out.println("Truck 클래스형으로 캐스팅 가능.");
		System.out.println("[yourCar]");
		if (yourCar instanceof Car)
			System.out.println("Car 클래스형으로 캐스팅 가능.");
		if (yourCar instanceof Truck)
			System.out.println("Truck 클래스형으로 캐스팅 가능.");
		System.out.println("[myTruck]");
		if (myTruck instanceof Car)
			System.out.println("Car 클래스형으로 캐스팅 가능.");
		if (myTruck instanceof Truck)
			System.out.println("Truck 클래스형으로 캐스팅 가능.");
		// 'Incompatible conditional operand types Truck and Sport'
		// error occur
		//if (myTruck instanceof Sport)
		//	System.out.println("Sport 클래스형으로 캐스팅 가능.");
	}*/
}
