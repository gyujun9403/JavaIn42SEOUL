package week05.first.abstractupcasting;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Truck("gyeon");
		
		myCar.showInfo();
		// The method setLoadage(int) is undefined for the type Car
		//myCar.setLoadage(100);
		
		// The method setLoadage(int) is undefined for the type Car
		//myCar.showLoadage();
	}

}
