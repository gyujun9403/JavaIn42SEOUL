package week02.second.carfactory;

public class CarFactory {
	private static CarFactory factory = new CarFactory();
	private CarFactory() {
		
	}
	public static CarFactory getFactory() {
		return factory;
	}
	public Car ceartCar() {
		return new Car();
	}
}
