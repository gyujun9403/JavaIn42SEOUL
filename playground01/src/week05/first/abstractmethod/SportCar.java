package week05.first.abstractmethod;

public class SportCar extends Car{
	
	SportCar(String owner) {
		super(owner);
	}
	
	//The type SportCar must implement the inherited abstract method Car.setLoadage(int)
	public void setLoadage(int loadageWeight) {
		System.out.println("스포츠카에 짐을 적재할 수 없습니다.");
	}

	@Override
	public void setPassengeNumber(int passengeNumber) {
		// TODO Auto-generated method stub
		if (passengeNumber > 2)
			System.out.println("2명 이상 탈 수 없습니다.");
		else
			super.setPassengeNumber(passengeNumber);
	}
	
}
