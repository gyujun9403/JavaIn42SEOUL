package week02.second.carfactory;

public class Car {
	private static int carNum = 1000;
	private int num;
	public Car() {
		carNum++;
		this.num = carNum;
	}
	public int getCarNum() {
		
		return num;
	}
}
