package week02.second.carfactory;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getFactory();
		
		Car myCar = factory.ceartCar();
		Car yourCar = factory.ceartCar();
		System.out.println(myCar.getCarNum());
		System.out.println(yourCar.getCarNum());
	}

}
