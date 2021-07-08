package week05.first.templatemethod;

public class Truck extends Car{

	@Override
	protected void carStart() {
		System.out.println("트럭의 시동을 겁니다.");
	}

	@Override
	protected void carSet() {
		System.out.println("트럭에 짐을 적재하고 타에 탑니다.");
	}

	@Override
	protected void carmove() {
		System.out.println("트럭을 목적지까지 운전합니다.");
	}

	@Override
	protected void carStop() {
		System.out.println("트럭의 시동을 정지합니다.");
	}
	
	// Cannot override the final method from Car
	//protected void drive() {}
}
